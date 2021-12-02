// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.j;
import java.util.Queue;
import io.reactivex.q;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;

public final class f<T> extends AtomicReference<d> implements q<T>, d
{
    private static final long H = -4875965440900746268L;
    public static final Object I;
    final Queue<Object> G;
    
    static {
        I = new Object();
    }
    
    public f(final Queue<Object> g) {
        this.G = g;
    }
    
    public boolean a() {
        return this.get() == j.G;
    }
    
    public void b(final Throwable t) {
        this.G.offer(io.reactivex.internal.util.q.j(t));
    }
    
    public void cancel() {
        if (j.b(this)) {
            this.G.offer(f.I);
        }
    }
    
    public void f() {
        this.G.offer(io.reactivex.internal.util.q.h());
    }
    
    public void m(final T t) {
        this.G.offer(io.reactivex.internal.util.q.y(t));
    }
    
    public void v(final long n) {
        this.get().v(n);
    }
    
    @Override
    public void z(final d d) {
        if (j.k(this, d)) {
            this.G.offer(io.reactivex.internal.util.q.z((d)this));
        }
    }
}
