// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.NoSuchElementException;
import o7.d;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class t0<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final long I;
    final T J;
    final boolean K;
    
    public t0(final l<T> l, final long i, final T j, final boolean k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I, (Object)this.J, this.K));
    }
    
    static final class a<T> extends f<T> implements q<T>
    {
        private static final long Y = 4066607327284737757L;
        final long S;
        final T T;
        final boolean U;
        d V;
        long W;
        boolean X;
        
        a(final o7.c<? super T> c, final long s, final T t, final boolean u) {
            super(c);
            this.S = s;
            this.T = t;
            this.U = u;
        }
        
        public void b(final Throwable t) {
            if (this.X) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.X = true;
            super.H.b(t);
        }
        
        @Override
        public void cancel() {
            super.cancel();
            this.V.cancel();
        }
        
        public void f() {
            if (!this.X) {
                this.X = true;
                final T t = this.T;
                if (t == null) {
                    if (this.U) {
                        super.H.b((Throwable)new NoSuchElementException());
                    }
                    else {
                        super.H.f();
                    }
                }
                else {
                    this.g(t);
                }
            }
        }
        
        public void m(final T t) {
            if (this.X) {
                return;
            }
            final long w = this.W;
            if (w == this.S) {
                this.X = true;
                this.V.cancel();
                this.g(t);
                return;
            }
            this.W = w + 1L;
        }
        
        @Override
        public void z(final d v) {
            if (j.o(this.V, v)) {
                this.V = v;
                super.H.z((d)this);
                v.v(Long.MAX_VALUE);
            }
        }
    }
}
