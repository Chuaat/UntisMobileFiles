// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import o7.c;
import o7.d;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;

public class u<T> extends AtomicInteger implements q<T>, d
{
    private static final long M = -4945028590049415624L;
    final c<? super T> G;
    final io.reactivex.internal.util.c H;
    final AtomicLong I;
    final AtomicReference<d> J;
    final AtomicBoolean K;
    volatile boolean L;
    
    public u(final c<? super T> g) {
        this.G = g;
        this.H = new io.reactivex.internal.util.c();
        this.I = new AtomicLong();
        this.J = new AtomicReference<d>();
        this.K = new AtomicBoolean();
    }
    
    public void b(final Throwable t) {
        this.L = true;
        l.d(this.G, t, this, this.H);
    }
    
    public void cancel() {
        if (!this.L) {
            j.b(this.J);
        }
    }
    
    public void f() {
        this.L = true;
        l.b(this.G, this, this.H);
    }
    
    public void m(final T t) {
        l.f(this.G, t, this, this.H);
    }
    
    public void v(final long lng) {
        if (lng <= 0L) {
            this.cancel();
            final StringBuilder sb = new StringBuilder();
            sb.append("§3.9 violated: positive request amount required but it was ");
            sb.append(lng);
            this.b(new IllegalArgumentException(sb.toString()));
        }
        else {
            j.d(this.J, this.I, lng);
        }
    }
    
    @Override
    public void z(final d d) {
        if (this.K.compareAndSet(false, true)) {
            this.G.z((d)this);
            j.f(this.J, this.I, d);
        }
        else {
            d.cancel();
            this.cancel();
            this.b(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }
}
