// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.j;
import rx.i;
import rx.internal.producers.a;
import rx.subscriptions.e;
import rx.o;
import rx.schedulers.c;
import rx.n;
import rx.functions.q;
import rx.g;

public final class b3<T> implements b<T, g<T>>
{
    final q<Integer, Throwable, Boolean> G;
    
    public b3(final q<Integer, Throwable, Boolean> g) {
        this.G = g;
    }
    
    public n<? super g<T>> a(final n<? super T> n) {
        final j.a a = rx.schedulers.c.m().a();
        n.r(a);
        final e e = new e();
        n.r(e);
        final rx.internal.producers.a a2 = new rx.internal.producers.a();
        n.s0(a2);
        return (n<? super g<T>>)new a((n<? super Object>)n, this.G, a, e, a2);
    }
    
    static final class a<T> extends n<g<T>>
    {
        final n<? super T> L;
        final q<Integer, Throwable, Boolean> M;
        final j.a N;
        final e O;
        final rx.internal.producers.a P;
        final AtomicInteger Q;
        
        public a(final n<? super T> l, final q<Integer, Throwable, Boolean> m, final j.a n, final e o, final rx.internal.producers.a p5) {
            this.Q = new AtomicInteger();
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = o;
            this.P = p5;
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.b(t);
        }
        
        @Override
        public void c() {
        }
        
        public void w(final g<T> g) {
            this.N.c(new rx.functions.a() {
                @Override
                public void call() {
                    b3.a.this.Q.incrementAndGet();
                    final n<T> n = new n<T>() {
                        boolean L;
                        final /* synthetic */ rx.functions.a M;
                        
                        @Override
                        public void b(final Throwable t) {
                            if (!this.L) {
                                this.L = true;
                                final b3.a h = b3.a.this;
                                if (h.M.s(h.Q.get(), t) && !b3.a.this.N.g()) {
                                    b3.a.this.N.c(this.M);
                                }
                                else {
                                    b3.a.this.L.b(t);
                                }
                            }
                        }
                        
                        @Override
                        public void c() {
                            if (!this.L) {
                                this.L = true;
                                b3.a.this.L.c();
                            }
                        }
                        
                        @Override
                        public void m(final T t) {
                            if (!this.L) {
                                b3.a.this.L.m((Object)t);
                                b3.a.this.P.b(1L);
                            }
                        }
                        
                        @Override
                        public void s0(final i i) {
                            b3.a.this.P.c(i);
                        }
                    };
                    b3.a.this.O.b(n);
                    g.R6(n);
                }
            });
        }
    }
}
