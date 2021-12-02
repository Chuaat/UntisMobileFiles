// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subjects;

import io.reactivex.disposables.c;
import io.reactivex.internal.util.q;
import io.reactivex.i0;
import io.reactivex.internal.util.a;

final class g<T> extends i<T> implements a<Object>
{
    final i<T> G;
    boolean H;
    io.reactivex.internal.util.a<Object> I;
    volatile boolean J;
    
    g(final i<T> g) {
        this.G = g;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        this.G.c(i0);
    }
    
    @Override
    public boolean a(final Object o) {
        return q.f(o, (i0<? super Object>)this.G);
    }
    
    @Override
    public void b(final Throwable t) {
        if (this.J) {
            io.reactivex.plugins.a.Y(t);
            return;
        }
        synchronized (this) {
            final boolean j = this.J;
            boolean b = true;
            if (!j) {
                this.J = true;
                if (this.H) {
                    io.reactivex.internal.util.a<Object> i;
                    if ((i = this.I) == null) {
                        i = new io.reactivex.internal.util.a<Object>(4);
                        this.I = i;
                    }
                    i.f(q.j(t));
                    return;
                }
                this.H = true;
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
    public void f() {
        if (this.J) {
            return;
        }
        synchronized (this) {
            if (this.J) {
                return;
            }
            this.J = true;
            if (this.H) {
                io.reactivex.internal.util.a<Object> i;
                if ((i = this.I) == null) {
                    i = new io.reactivex.internal.util.a<Object>(4);
                    this.I = i;
                }
                i.c(q.h());
                return;
            }
            this.H = true;
            // monitorexit(this)
            this.G.f();
        }
    }
    
    @Override
    public void l(final c c) {
        final boolean j = this.J;
        int n = 1;
        final int n2 = 1;
        if (!j) {
            synchronized (this) {
                if (this.J) {
                    n = n2;
                }
                else {
                    if (this.H) {
                        io.reactivex.internal.util.a<Object> i;
                        if ((i = this.I) == null) {
                            i = new io.reactivex.internal.util.a<Object>(4);
                            this.I = i;
                        }
                        i.c(q.i(c));
                        return;
                    }
                    this.H = true;
                    n = 0;
                }
            }
        }
        if (n != 0) {
            c.dispose();
        }
        else {
            this.G.l(c);
            this.q8();
        }
    }
    
    @io.reactivex.annotations.g
    @Override
    public Throwable l8() {
        return this.G.l8();
    }
    
    @Override
    public void m(final T t) {
        if (this.J) {
            return;
        }
        synchronized (this) {
            if (this.J) {
                return;
            }
            if (this.H) {
                io.reactivex.internal.util.a<Object> i;
                if ((i = this.I) == null) {
                    i = new io.reactivex.internal.util.a<Object>(4);
                    this.I = i;
                }
                i.c(q.y(t));
                return;
            }
            this.H = true;
            // monitorexit(this)
            this.G.m(t);
            this.q8();
        }
    }
    
    @Override
    public boolean m8() {
        return this.G.m8();
    }
    
    @Override
    public boolean n8() {
        return this.G.n8();
    }
    
    @Override
    public boolean o8() {
        return this.G.o8();
    }
    
    void q8() {
        while (true) {
            synchronized (this) {
                final io.reactivex.internal.util.a<Object> i = this.I;
                if (i == null) {
                    this.H = false;
                    return;
                }
                this.I = null;
                // monitorexit(this)
                i.d((a<? super Object>)this);
            }
        }
    }
}
