// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subscribers;

import io.reactivex.internal.util.i;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.q;

public abstract class b<T> implements q<T>, c
{
    final AtomicReference<d> G;
    
    public b() {
        this.G = new AtomicReference<d>();
    }
    
    protected final void a() {
        this.dispose();
    }
    
    protected void c() {
        this.G.get().v(Long.MAX_VALUE);
    }
    
    protected final void d(final long n) {
        this.G.get().v(n);
    }
    
    @Override
    public final void dispose() {
        j.b(this.G);
    }
    
    @Override
    public final boolean i() {
        return this.G.get() == j.G;
    }
    
    @Override
    public final void z(final d d) {
        if (i.d(this.G, d, this.getClass())) {
            this.c();
        }
    }
}
