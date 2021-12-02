// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import io.reactivex.i0;
import io.reactivex.v;
import x5.c;
import io.reactivex.g0;
import io.reactivex.s;

public final class k2<T> extends s<T>
{
    final g0<T> G;
    final c<T, T, T> H;
    
    public k2(final g0<T> g, final c<T, T, T> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        this.G.c(new a<Object>(v, this.H));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final v<? super T> G;
        final x5.c<T, T, T> H;
        boolean I;
        T J;
        c K;
        
        a(final v<? super T> g, final x5.c<T, T, T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.I = true;
            this.J = null;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.K.dispose();
        }
        
        @Override
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            final T j = this.J;
            this.J = null;
            if (j != null) {
                this.G.d((Object)j);
            }
            else {
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.K.i();
        }
        
        @Override
        public void l(final c k) {
            if (d.l(this.K, k)) {
                this.K = k;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T j) {
            if (!this.I) {
                final T i = this.J;
                if (i == null) {
                    this.J = j;
                }
                else {
                    try {
                        this.J = b.g(this.H.b(i, j), "The reducer returned a null value");
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        this.K.dispose();
                        this.b(t);
                    }
                }
            }
        }
    }
}
