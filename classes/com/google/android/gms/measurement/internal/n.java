// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.common.internal.x;
import android.os.Handler;

abstract class n
{
    private static volatile Handler d;
    private final v5 a;
    private final Runnable b;
    private volatile long c;
    
    n(final v5 a) {
        x.k(a);
        this.a = a;
        this.b = new m(this, a);
    }
    
    private final Handler f() {
        if (n.d != null) {
            return n.d;
        }
        synchronized (n.class) {
            if (n.d == null) {
                n.d = new a1(this.a.X().getMainLooper());
            }
            return n.d;
        }
    }
    
    final void b() {
        this.c = 0L;
        this.f().removeCallbacks(this.b);
    }
    
    public abstract void c();
    
    public final void d(final long l) {
        this.b();
        if (l >= 0L) {
            this.c = this.a.F().a();
            if (!this.f().postDelayed(this.b, l)) {
                this.a.c().o().b("Failed to schedule delayed post. time", l);
            }
        }
    }
    
    public final boolean e() {
        return this.c != 0L;
    }
}
