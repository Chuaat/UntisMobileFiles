// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import android.content.Intent;
import android.content.IntentFilter;
import c6.h;
import android.content.BroadcastReceiver;
import java.io.IOException;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.content.Context;
import android.os.Build$VERSION;
import android.util.Log;
import android.annotation.SuppressLint;
import android.os.PowerManager;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import com.google.android.gms.common.util.concurrent.b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.util.d0;
import java.util.concurrent.ExecutorService;
import android.os.PowerManager$WakeLock;

class y0 implements Runnable
{
    private final long G;
    private final PowerManager$WakeLock H;
    private final FirebaseMessaging I;
    @d0
    ExecutorService J;
    
    @SuppressLint({ "InvalidWakeLockTag" })
    @d0
    public y0(final FirebaseMessaging i, final long g) {
        this.J = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new b("firebase-iid-executor"));
        this.I = i;
        this.G = g;
        (this.H = ((PowerManager)this.b().getSystemService("power")).newWakeLock(1, "fiid-sync")).setReferenceCounted(false);
    }
    
    static boolean c() {
        final boolean loggable = Log.isLoggable("FirebaseMessaging", 3);
        boolean b = false;
        if (!loggable) {
            if (Build$VERSION.SDK_INT != 23) {
                return b;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    Context b() {
        return this.I.h();
    }
    
    boolean d() {
        final ConnectivityManager connectivityManager = (ConnectivityManager)this.b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo;
        if (connectivityManager != null) {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        }
        else {
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    
    @d0
    boolean e() throws IOException {
        try {
            if (this.I.c() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        }
        catch (SecurityException ex2) {}
        catch (IOException ex) {
            if (h0.g(ex.getMessage())) {
                final String message = ex.getMessage();
                final StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                sb.toString();
                goto Label_0043;
            }
            if (ex.getMessage() == null) {
                goto Label_0043;
            }
            throw ex;
        }
    }
    
    @SuppressLint({ "WakelockTimeout" })
    @Override
    public void run() {
        Label_0020: {
            if (!u0.b().e(this.b())) {
                break Label_0020;
            }
            this.H.acquire();
            try {
                try {
                    this.I.D(true);
                    if (!this.I.p()) {
                        this.I.D(false);
                        if (!u0.b().e(this.b())) {
                            return;
                        }
                    }
                    else if (u0.b().d(this.b()) && !this.d()) {
                        new a(this).a();
                        if (!u0.b().e(this.b())) {
                            return;
                        }
                    }
                    else {
                        if (this.e()) {
                            this.I.D(false);
                        }
                        else {
                            this.I.H(this.G);
                        }
                        if (!u0.b().e(this.b())) {
                            return;
                        }
                    }
                    this.H.release();
                }
                finally {
                    if (u0.b().e(this.b())) {
                        this.H.release();
                    }
                }
            }
            catch (IOException ex) {}
        }
    }
    
    @d0
    static class a extends BroadcastReceiver
    {
        @h
        private y0 a;
        
        public a(final y0 a) {
            this.a = a;
        }
        
        public void a() {
            if (y0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.a.b().registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        
        public void onReceive(final Context context, final Intent intent) {
            final y0 a = this.a;
            if (a == null) {
                return;
            }
            if (!a.d()) {
                return;
            }
            if (y0.c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.a.I.g(this.a, 0L);
            this.a.b().unregisterReceiver((BroadcastReceiver)this);
            this.a = null;
        }
    }
}
