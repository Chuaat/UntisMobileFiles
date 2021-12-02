// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.functions.b;
import o7.d;
import io.reactivex.q;
import io.reactivex.l;
import x5.c;

public final class k3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final c<T, T, T> I;
    
    public k3(final l<T> l, final c<T, T, T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, (c<? super T, ? super T, ? super T>)this.I));
    }
    
    static final class a<T> implements q<T>, d
    {
        final o7.c<? super T> G;
        final c<T, T, T> H;
        d I;
        T J;
        boolean K;
        
        a(final o7.c<? super T> g, final c<T, T, T> h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.K) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.K = true;
            this.G.b(t);
        }
        
        public void cancel() {
            this.I.cancel();
        }
        
        public void f() {
            if (this.K) {
                return;
            }
            this.K = true;
            this.G.f();
        }
        
        public void m(final T j) {
            if (this.K) {
                return;
            }
            final o7.c<? super T> g = this.G;
            final T i = this.J;
            Label_0037: {
                if (i != null) {
                    break Label_0037;
                }
                while (true) {
                    g.m((Object)(this.J = j));
                    return;
                    try {
                        b.g(this.H.b(i, j), "The value returned by the accumulator is null");
                        continue;
                    }
                    finally {
                        io.reactivex.exceptions.b.b((Throwable)j);
                        this.I.cancel();
                        this.b((Throwable)j);
                    }
                    break;
                }
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
}
