// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import io.reactivex.i0;
import io.reactivex.n0;
import x5.c;
import io.reactivex.g0;
import io.reactivex.k0;

public final class l2<T, R> extends k0<R>
{
    final g0<T> G;
    final R H;
    final c<R, ? super T, R> I;
    
    public l2(final g0<T> g, final R h, final c<R, ? super T, R> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void e1(final n0<? super R> n0) {
        this.G.c(new a<Object, Object>(n0, this.I, this.H));
    }
    
    static final class a<T, R> implements i0<T>, c
    {
        final n0<? super R> G;
        final x5.c<R, ? super T, R> H;
        R I;
        c J;
        
        a(final n0<? super R> g, final x5.c<R, ? super T, R> h, final R i) {
            this.G = g;
            this.I = i;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I != null) {
                this.I = null;
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            this.J.dispose();
        }
        
        @Override
        public void f() {
            final R i = this.I;
            if (i != null) {
                this.I = null;
                this.G.d((Object)i);
            }
        }
        
        @Override
        public boolean i() {
            return this.J.i();
        }
        
        @Override
        public void l(final c j) {
            if (d.l(this.J, j)) {
                this.J = j;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            final R i = this.I;
            if (i != null) {
                try {
                    this.I = b.g(this.H.b(i, (Object)t), "The reducer returned a null value");
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.J.dispose();
                    this.b(t2);
                }
            }
        }
    }
}
