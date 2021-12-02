// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.observers;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.q;
import io.reactivex.annotations.f;
import io.reactivex.internal.util.a;
import io.reactivex.disposables.c;
import io.reactivex.i0;

public final class m<T> implements i0<T>, c
{
    static final int M = 4;
    final i0<? super T> G;
    final boolean H;
    c I;
    boolean J;
    a<Object> K;
    volatile boolean L;
    
    public m(@f final i0<? super T> i0) {
        this(i0, false);
    }
    
    public m(@f final i0<? super T> g, final boolean h) {
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
                if (k.a((i0<? super Object>)this.G)) {
                    return;
                }
                continue;
            }
        }
    }
    
    @Override
    public void b(@f final Throwable t) {
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
                    final Object j = q.j(t);
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
    
    @Override
    public void dispose() {
        this.I.dispose();
    }
    
    @Override
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
                k.c(q.h());
                return;
            }
            this.L = true;
            this.J = true;
            // monitorexit(this)
            this.G.f();
        }
    }
    
    @Override
    public boolean i() {
        return this.I.i();
    }
    
    @Override
    public void l(@f final c i) {
        if (d.l(this.I, i)) {
            this.I = i;
            this.G.l(this);
        }
    }
    
    @Override
    public void m(@f final T t) {
        if (this.L) {
            return;
        }
        if (t == null) {
            this.I.dispose();
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
                k.c(q.y(t));
                return;
            }
            this.J = true;
            // monitorexit(this)
            this.G.m((Object)t);
            this.a();
        }
    }
}
