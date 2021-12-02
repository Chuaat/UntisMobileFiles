// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subscribers;

import io.reactivex.internal.util.i;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.disposables.f;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.q;

public abstract class c<T> implements q<T>, io.reactivex.disposables.c
{
    private final AtomicReference<d> G;
    private final f H;
    private final AtomicLong I;
    
    public c() {
        this.G = new AtomicReference<d>();
        this.H = new f();
        this.I = new AtomicLong();
    }
    
    public final void a(final io.reactivex.disposables.c c) {
        b.g(c, "resource is null");
        this.H.b(c);
    }
    
    protected void c() {
        this.d(Long.MAX_VALUE);
    }
    
    protected final void d(final long n) {
        j.d(this.G, this.I, n);
    }
    
    @Override
    public final void dispose() {
        if (j.b(this.G)) {
            this.H.dispose();
        }
    }
    
    @Override
    public final boolean i() {
        return this.G.get() == j.G;
    }
    
    @Override
    public final void z(final d d) {
        if (i.d(this.G, d, this.getClass())) {
            final long andSet = this.I.getAndSet(0L);
            if (andSet != 0L) {
                d.v(andSet);
            }
            this.c();
        }
    }
}
