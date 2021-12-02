// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.c;

public final class y2<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final c<T, T, T> H;
    
    public y2(final g0<T> g0, final c<T, T, T> h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, (c<? super T, ? super T, ? super T>)this.H));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final i0<? super T> G;
        final x5.c<T, T, T> H;
        c I;
        T J;
        boolean K;
        
        a(final i0<? super T> g, final x5.c<T, T, T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.K) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.K = true;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
        }
        
        @Override
        public void f() {
            if (this.K) {
                return;
            }
            this.K = true;
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.I.i();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T j) {
            if (this.K) {
                return;
            }
            final i0<? super T> g = this.G;
            final T i = this.J;
            Label_0037: {
                if (i != null) {
                    break Label_0037;
                }
                while (true) {
                    g.m(this.J = j);
                    return;
                    try {
                        b.g(this.H.b(i, j), "The value returned by the accumulator is null");
                        continue;
                    }
                    finally {
                        io.reactivex.exceptions.b.b((Throwable)j);
                        this.I.dispose();
                        this.b((Throwable)j);
                    }
                    break;
                }
            }
        }
    }
}
