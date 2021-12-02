// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.net.NetworkInfo;
import com.bumptech.glide.util.k;
import android.net.ConnectivityManager;
import android.content.IntentFilter;
import android.util.Log;
import android.content.Intent;
import androidx.annotation.j0;
import android.content.BroadcastReceiver;
import android.content.Context;

final class e implements c
{
    private static final String L = "ConnectivityMonitor";
    private final Context G;
    final a H;
    boolean I;
    private boolean J;
    private final BroadcastReceiver K;
    
    e(@j0 final Context context, @j0 final a h) {
        this.K = new BroadcastReceiver() {
            public void onReceive(@j0 final Context context, final Intent intent) {
                final e a = e.this;
                final boolean i = a.I;
                a.I = a.d(context);
                if (i != e.this.I) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("connectivity changed, isConnected: ");
                        sb.append(e.this.I);
                        Log.d("ConnectivityMonitor", sb.toString());
                    }
                    final e a2 = e.this;
                    a2.H.a(a2.I);
                }
            }
        };
        this.G = context.getApplicationContext();
        this.H = h;
    }
    
    private void g() {
        if (this.J) {
            return;
        }
        this.I = this.d(this.G);
        try {
            this.G.registerReceiver(this.K, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.J = true;
        }
        catch (SecurityException ex) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", (Throwable)ex);
            }
        }
    }
    
    private void i() {
        if (!this.J) {
            return;
        }
        this.G.unregisterReceiver(this.K);
        this.J = false;
    }
    
    @Override
    public void a() {
        this.i();
    }
    
    @SuppressLint({ "MissingPermission" })
    boolean d(@j0 final Context context) {
        final ConnectivityManager connectivityManager = k.d(context.getSystemService("connectivity"));
        boolean b = true;
        try {
            final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", (Throwable)ex);
            }
            return true;
        }
    }
    
    @Override
    public void f() {
        this.g();
    }
    
    @Override
    public void onDestroy() {
    }
}
