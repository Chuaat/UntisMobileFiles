// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class a2<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final long I;
    
    public a2(final l<T> l, final long i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I));
    }
    
    static final class a<T> extends AtomicLong implements q<T>, d
    {
        private static final long J = 2288246011222124525L;
        final c<? super T> G;
        long H;
        d I;
        
        a(final c<? super T> g, final long h) {
            this.G = g;
            this.lazySet(this.H = h);
        }
        
        public void b(final Throwable t) {
            if (this.H > 0L) {
                this.H = 0L;
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void cancel() {
            this.I.cancel();
        }
        
        public void f() {
            if (this.H > 0L) {
                this.H = 0L;
                this.G.f();
            }
        }
        
        public void m(final T t) {
            final long h = this.H;
            if (h > 0L) {
                final long h2 = h - 1L;
                this.H = h2;
                this.G.m((Object)t);
                if (h2 == 0L) {
                    this.I.cancel();
                    this.G.f();
                }
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                long value;
                long n2;
                do {
                    value = this.get();
                    if (value == 0L) {
                        return;
                    }
                    if (value <= n) {
                        n2 = value;
                    }
                    else {
                        n2 = n;
                    }
                } while (!this.compareAndSet(value, value - n2));
                this.I.v(n2);
            }
        }
        
        @Override
        public void z(final d i) {
            if (j.o(this.I, i)) {
                if (this.H == 0L) {
                    i.cancel();
                    g.b(this.G);
                }
                else {
                    this.I = i;
                    this.G.z((d)this);
                }
            }
        }
    }
}
