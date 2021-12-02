// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import android.content.Intent;
import androidx.annotation.j0;
import java.util.Set;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;
import androidx.annotation.k0;
import android.content.Context;

class j1
{
    final Context a;
    final String b;
    int c;
    final h1 d;
    final h1.c e;
    @k0
    b1 f;
    final Executor g;
    final a1 h;
    final AtomicBoolean i;
    final ServiceConnection j;
    final Runnable k;
    final Runnable l;
    
    j1(Context applicationContext, final String b, final h1 d, final Executor g) {
        this.h = new a1.b() {
            public void t0(final String[] array) {
                j1.this.g.execute(new Runnable() {
                    @Override
                    public void run() {
                        j1.this.d.i(array);
                    }
                });
            }
        };
        this.i = new AtomicBoolean(false);
        final ServiceConnection j = (ServiceConnection)new ServiceConnection() {
            public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
                j1.this.f = b1.b.H(binder);
                final j1 c = j1.this;
                c.g.execute(c.k);
            }
            
            public void onServiceDisconnected(final ComponentName componentName) {
                final j1 c = j1.this;
                c.g.execute(c.l);
                j1.this.f = null;
            }
        };
        this.j = (ServiceConnection)j;
        this.k = new Runnable() {
            @Override
            public void run() {
                try {
                    final j1 g = j1.this;
                    final b1 f = g.f;
                    if (f != null) {
                        g.c = f.I0(g.h, g.b);
                        final j1 g2 = j1.this;
                        g2.d.a(g2.e);
                    }
                }
                catch (RemoteException ex) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", (Throwable)ex);
                }
            }
        };
        this.l = new Runnable() {
            @Override
            public void run() {
                final j1 g = j1.this;
                g.d.m(g.e);
            }
        };
        applicationContext = applicationContext.getApplicationContext();
        this.a = applicationContext;
        this.b = b;
        this.d = d;
        this.g = g;
        this.e = new h1.c((String[])d.a.keySet().toArray(new String[0])) {
            @Override
            boolean a() {
                return true;
            }
            
            @Override
            public void b(@j0 final Set<String> set) {
                if (j1.this.i.get()) {
                    return;
                }
                try {
                    final j1 b = j1.this;
                    final b1 f = b.f;
                    if (f != null) {
                        f.l2(b.c, set.toArray(new String[0]));
                    }
                }
                catch (RemoteException ex) {
                    Log.w("ROOM", "Cannot broadcast invalidation", (Throwable)ex);
                }
            }
        };
        applicationContext.bindService(new Intent(applicationContext, (Class)MultiInstanceInvalidationService.class), (ServiceConnection)j, 1);
    }
    
    void a() {
        if (this.i.compareAndSet(false, true)) {
            this.d.m(this.e);
            try {
                final b1 f = this.f;
                if (f != null) {
                    f.p2(this.h, this.c);
                }
            }
            catch (RemoteException ex) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", (Throwable)ex);
            }
            this.a.unbindService(this.j);
        }
    }
}
