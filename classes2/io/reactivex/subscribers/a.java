// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subscribers;

import io.reactivex.internal.util.i;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;

public abstract class a<T> implements q<T>
{
    d G;
    
    protected final void a() {
        final d g = this.G;
        this.G = (d)j.G;
        g.cancel();
    }
    
    protected void c() {
        this.d(Long.MAX_VALUE);
    }
    
    protected final void d(final long n) {
        final d g = this.G;
        if (g != null) {
            g.v(n);
        }
    }
    
    @Override
    public final void z(final d g) {
        if (i.f(this.G, g, this.getClass())) {
            this.G = g;
            this.c();
        }
    }
}
