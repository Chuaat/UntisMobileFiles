// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.plugins.a;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;
import io.reactivex.n0;
import x5.c;
import o7.b;
import io.reactivex.k0;

public final class x2<T, R> extends k0<R>
{
    final b<T> G;
    final R H;
    final c<R, ? super T, R> I;
    
    public x2(final b<T> g, final R h, final c<R, ? super T, R> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void e1(final n0<? super R> n0) {
        this.G.e((o7.c)new a((n0<? super Object>)n0, (c<Object, ? super Object, Object>)this.I, this.H));
    }
    
    static final class a<T, R> implements q<T>, c
    {
        final n0<? super R> G;
        final x5.c<R, ? super T, R> H;
        R I;
        d J;
        
        a(final n0<? super R> g, final x5.c<R, ? super T, R> h, final R i) {
            this.G = g;
            this.I = i;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.I != null) {
                this.I = null;
                this.J = (d)j.G;
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            this.J.cancel();
            this.J = (d)j.G;
        }
        
        public void f() {
            final R i = this.I;
            if (i != null) {
                this.I = null;
                this.J = (d)j.G;
                this.G.d((Object)i);
            }
        }
        
        @Override
        public boolean i() {
            return this.J == j.G;
        }
        
        public void m(final T t) {
            final R i = this.I;
            if (i != null) {
                try {
                    this.I = io.reactivex.internal.functions.b.g(this.H.b(i, (Object)t), "The reducer returned a null value");
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.J.cancel();
                    this.b(t2);
                }
            }
        }
        
        @Override
        public void z(final d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                this.G.l(this);
                j.v(Long.MAX_VALUE);
            }
        }
    }
}
