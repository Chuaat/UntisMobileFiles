// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.processors;

import o7.d;
import io.reactivex.internal.util.q;
import io.reactivex.internal.util.a;

final class g<T> extends c<T>
{
    final c<T> H;
    boolean I;
    a<Object> J;
    volatile boolean K;
    
    g(final c<T> h) {
        this.H = h;
    }
    
    @io.reactivex.annotations.g
    @Override
    public Throwable P8() {
        return this.H.P8();
    }
    
    @Override
    public boolean Q8() {
        return this.H.Q8();
    }
    
    @Override
    public boolean R8() {
        return this.H.R8();
    }
    
    @Override
    public boolean S8() {
        return this.H.S8();
    }
    
    void U8() {
        while (true) {
            synchronized (this) {
                final a<Object> j = this.J;
                if (j == null) {
                    this.I = false;
                    return;
                }
                this.J = null;
                // monitorexit(this)
                j.b((o7.c<? super Object>)this.H);
            }
        }
    }
    
    public void b(final Throwable t) {
        if (this.K) {
            io.reactivex.plugins.a.Y(t);
            return;
        }
        synchronized (this) {
            final boolean k = this.K;
            boolean b = true;
            if (!k) {
                this.K = true;
                if (this.I) {
                    a<Object> j;
                    if ((j = this.J) == null) {
                        j = new a<Object>(4);
                        this.J = j;
                    }
                    j.f(io.reactivex.internal.util.q.j(t));
                    return;
                }
                this.I = true;
                b = false;
            }
            // monitorexit(this)
            if (b) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            ((o7.c)this.H).b(t);
        }
    }
    
    public void f() {
        if (this.K) {
            return;
        }
        synchronized (this) {
            if (this.K) {
                return;
            }
            this.K = true;
            if (this.I) {
                a<Object> j;
                if ((j = this.J) == null) {
                    j = new a<Object>(4);
                    this.J = j;
                }
                j.c(io.reactivex.internal.util.q.h());
                return;
            }
            this.I = true;
            // monitorexit(this)
            ((o7.c)this.H).f();
        }
    }
    
    public void m(final T t) {
        if (this.K) {
            return;
        }
        synchronized (this) {
            if (this.K) {
                return;
            }
            if (this.I) {
                a<Object> j;
                if ((j = this.J) == null) {
                    j = new a<Object>(4);
                    this.J = j;
                }
                j.c(io.reactivex.internal.util.q.y(t));
                return;
            }
            this.I = true;
            // monitorexit(this)
            ((o7.c)this.H).m((Object)t);
            this.U8();
        }
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        this.H.e(c);
    }
    
    public void z(final d d) {
        final boolean k = this.K;
        int n = 1;
        final int n2 = 1;
        if (!k) {
            synchronized (this) {
                if (this.K) {
                    n = n2;
                }
                else {
                    if (this.I) {
                        a<Object> j;
                        if ((j = this.J) == null) {
                            j = new a<Object>(4);
                            this.J = j;
                        }
                        j.c(io.reactivex.internal.util.q.z(d));
                        return;
                    }
                    this.I = true;
                    n = 0;
                }
            }
        }
        if (n != 0) {
            d.cancel();
        }
        else {
            this.H.z(d);
            this.U8();
        }
    }
}
