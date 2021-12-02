// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.a;
import o7.c;
import o7.d;
import io.reactivex.q;

public final class e<T> implements q<T>, d
{
    static final int M = 4;
    final c<? super T> G;
    final boolean H;
    d I;
    boolean J;
    a<Object> K;
    volatile boolean L;
    
    public e(final c<? super T> c) {
        this(c, false);
    }
    
    public e(final c<? super T> g, final boolean h) {
        this.G = g;
        this.H = h;
    }
    
    void a() {
        while (true) {
            synchronized (this) {
                final a<Object> k = this.K;
                if (k == null) {
                    this.J = false;
                    return;
                }
                this.K = null;
                // monitorexit(this)
                if (k.b((o7.c<? super Object>)this.G)) {
                    return;
                }
                continue;
            }
        }
    }
    
    public void b(final Throwable t) {
        if (this.L) {
            io.reactivex.plugins.a.Y(t);
            return;
        }
        synchronized (this) {
            final boolean l = this.L;
            boolean b = true;
            if (!l) {
                if (this.J) {
                    this.L = true;
                    a<Object> k;
                    if ((k = this.K) == null) {
                        k = new a<Object>(4);
                        this.K = k;
                    }
                    final Object j = io.reactivex.internal.util.q.j(t);
                    if (this.H) {
                        k.c(j);
                    }
                    else {
                        k.f(j);
                    }
                    return;
                }
                this.L = true;
                this.J = true;
                b = false;
            }
            // monitorexit(this)
            if (b) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.G.b(t);
        }
    }
    
    public void cancel() {
        this.I.cancel();
    }
    
    public void f() {
        if (this.L) {
            return;
        }
        synchronized (this) {
            if (this.L) {
                return;
            }
            if (this.J) {
                a<Object> k;
                if ((k = this.K) == null) {
                    k = new a<Object>(4);
                    this.K = k;
                }
                k.c(io.reactivex.internal.util.q.h());
                return;
            }
            this.L = true;
            this.J = true;
            // monitorexit(this)
            this.G.f();
        }
    }
    
    public void m(final T t) {
        if (this.L) {
            return;
        }
        if (t == null) {
            this.I.cancel();
            this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.L) {
                return;
            }
            if (this.J) {
                a<Object> k;
                if ((k = this.K) == null) {
                    k = new a<Object>(4);
                    this.K = k;
                }
                k.c(io.reactivex.internal.util.q.y(t));
                return;
            }
            this.J = true;
            // monitorexit(this)
            this.G.m((Object)t);
            this.a();
        }
    }
    
    public void v(final long n) {
        this.I.v(n);
    }
    
    @Override
    public void z(final d i) {
        if (j.o(this.I, i)) {
            this.I = i;
            this.G.z((d)this);
        }
    }
}
