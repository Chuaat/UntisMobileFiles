// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class a4<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final long I;
    
    public a4(final l<T> l, final long i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I));
    }
    
    static final class a<T> extends AtomicBoolean implements q<T>, d
    {
        private static final long L = -5636543848937116287L;
        final c<? super T> G;
        final long H;
        boolean I;
        d J;
        long K;
        
        a(final c<? super T> g, final long n) {
            this.G = g;
            this.H = n;
            this.K = n;
        }
        
        public void b(final Throwable t) {
            if (!this.I) {
                this.I = true;
                this.J.cancel();
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void cancel() {
            this.J.cancel();
        }
        
        public void f() {
            if (!this.I) {
                this.I = true;
                this.G.f();
            }
        }
        
        public void m(final T t) {
            if (!this.I) {
                final long k = this.K;
                final long i = k - 1L;
                this.K = i;
                if (k > 0L) {
                    final boolean b = i == 0L;
                    this.G.m((Object)t);
                    if (b) {
                        this.J.cancel();
                        this.f();
                    }
                }
            }
        }
        
        public void v(final long n) {
            if (!j.m(n)) {
                return;
            }
            if (!this.get() && this.compareAndSet(false, true) && n >= this.H) {
                this.J.v(Long.MAX_VALUE);
                return;
            }
            this.J.v(n);
        }
        
        @Override
        public void z(final d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                if (this.H == 0L) {
                    j.cancel();
                    this.I = true;
                    g.b(this.G);
                }
                else {
                    this.G.z((d)this);
                }
            }
        }
    }
}
