// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import com.google.android.gms.tasks.f;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import com.google.android.gms.tasks.n;
import android.os.IBinder;
import android.content.ComponentName;
import com.google.android.gms.tasks.m;
import com.google.android.gms.common.stats.a;
import android.util.Log;
import androidx.annotation.b1;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import com.google.android.gms.common.util.concurrent.b;
import androidx.annotation.w;
import androidx.annotation.k0;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Intent;
import android.content.Context;
import android.content.ServiceConnection;

class k1 implements ServiceConnection
{
    private final Context c;
    private final Intent d;
    private final ScheduledExecutorService e;
    private final Queue<a> f;
    @k0
    private h1 g;
    @w("this")
    private boolean h;
    
    k1(final Context context, final String s) {
        this(context, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, (ThreadFactory)new b("Firebase-FirebaseInstanceIdServiceConnection")));
    }
    
    @b1
    k1(Context applicationContext, final String s, final ScheduledExecutorService e) {
        this.f = new ArrayDeque<a>();
        this.h = false;
        applicationContext = applicationContext.getApplicationContext();
        this.c = applicationContext;
        this.d = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.e = e;
    }
    
    @w("this")
    private void a() {
        while (!this.f.isEmpty()) {
            this.f.poll().b();
        }
    }
    
    private void b() {
        synchronized (this) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                final h1 g = this.g;
                if (g == null || !g.isBinderAlive()) {
                    this.d();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.g.b((a)this.f.poll());
            }
        }
    }
    
    @w("this")
    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            final boolean h = this.h;
            final StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(h ^ true);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.h) {
            return;
        }
        this.h = true;
        try {
            if (com.google.android.gms.common.stats.a.b().a(this.c, this.d, (ServiceConnection)this, 65)) {
                return;
            }
            Log.e("FirebaseMessaging", "binding to the service failed");
        }
        catch (SecurityException ex) {
            Log.e("FirebaseMessaging", "Exception while binding the service", (Throwable)ex);
        }
        this.h = false;
        this.a();
    }
    
    m<Void> c(final Intent intent) {
        synchronized (this) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            final a a = new a(intent);
            a.a(this.e);
            this.f.add(a);
            this.b();
            return a.c();
        }
    }
    
    public void onServiceConnected(final ComponentName obj, final IBinder obj2) {
        synchronized (this) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                final String value = String.valueOf(obj);
                final StringBuilder sb = new StringBuilder(value.length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(value);
                Log.d("FirebaseMessaging", sb.toString());
            }
            this.h = false;
            if (!(obj2 instanceof h1)) {
                final String value2 = String.valueOf(obj2);
                final StringBuilder sb2 = new StringBuilder(value2.length() + 28);
                sb2.append("Invalid service connection: ");
                sb2.append(value2);
                Log.e("FirebaseMessaging", sb2.toString());
                this.a();
                return;
            }
            this.g = (h1)obj2;
            this.b();
        }
    }
    
    public void onServiceDisconnected(final ComponentName obj) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(value);
            Log.d("FirebaseMessaging", sb.toString());
        }
        this.b();
    }
    
    static class a
    {
        final Intent a;
        private final n<Void> b;
        
        a(final Intent a) {
            this.b = (n<Void>)new n();
            this.a = a;
        }
        
        void a(final ScheduledExecutorService scheduledExecutorService) {
            this.c().f((Executor)scheduledExecutorService, (f)new j1(scheduledExecutorService.schedule(new i1(this), 9000L, TimeUnit.MILLISECONDS)));
        }
        
        void b() {
            this.b.e((Object)null);
        }
        
        m<Void> c() {
            return (m<Void>)this.b.a();
        }
    }
}
