// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import androidx.annotation.i;
import f2.a;
import android.util.Log;
import android.os.IBinder;
import androidx.annotation.j0;
import androidx.annotation.g0;
import com.google.android.gms.tasks.n;
import com.google.android.gms.tasks.p;
import com.google.android.gms.tasks.m;
import android.content.Intent;
import android.os.Binder;
import androidx.annotation.b1;
import java.util.concurrent.ExecutorService;
import android.annotation.SuppressLint;
import android.app.Service;

@SuppressLint({ "UnwrappedWakefulBroadcastReceiver" })
public abstract class h extends Service
{
    @b1
    final ExecutorService G;
    private Binder H;
    private final Object I;
    private int J;
    private int K;
    
    public h() {
        this.G = q.c();
        this.I = new Object();
        this.K = 0;
    }
    
    private void b(final Intent intent) {
        if (intent != null) {
            e1.b(intent);
        }
        synchronized (this.I) {
            final int k = this.K - 1;
            this.K = k;
            if (k == 0) {
                this.i(this.J);
            }
        }
    }
    
    @g0
    private m<Void> h(final Intent intent) {
        if (this.e(intent)) {
            return (m<Void>)p.g((Object)null);
        }
        final n n = new n();
        this.G.execute(new e(this, intent, n));
        return (m<Void>)n.a();
    }
    
    @j0
    protected Intent c(@j0 final Intent intent) {
        return intent;
    }
    
    public abstract void d(@j0 final Intent p0);
    
    public boolean e(@j0 final Intent intent) {
        return false;
    }
    
    boolean i(final int n) {
        return this.stopSelfResult(n);
    }
    
    @j0
    public final IBinder onBind(@j0 final Intent intent) {
        synchronized (this) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.H == null) {
                this.H = new h1((h1.a)new h1.a() {
                    @f2.a
                    @Override
                    public m<Void> a(final Intent intent) {
                        return h.this.h(intent);
                    }
                });
            }
            return (IBinder)this.H;
        }
    }
    
    @i
    public void onDestroy() {
        this.G.shutdown();
        super.onDestroy();
    }
    
    public final int onStartCommand(@j0 final Intent intent, final int n, final int j) {
        Object o = this.I;
        synchronized (o) {
            this.J = j;
            ++this.K;
            // monitorexit(o)
            o = this.c(intent);
            if (o == null) {
                this.b(intent);
                return 2;
            }
            o = this.h((Intent)o);
            if (((m)o).u()) {
                this.b(intent);
                return 2;
            }
            ((m)o).f(f.G, (com.google.android.gms.tasks.f)new g(this, intent));
            return 3;
        }
    }
}
