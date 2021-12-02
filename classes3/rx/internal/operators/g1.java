// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.i;
import rx.o;
import rx.internal.producers.a;
import rx.subscriptions.e;
import rx.n;
import rx.g;

public final class g1<T> implements g.a<T>
{
    final g<? extends T> G;
    final g<? extends T> H;
    
    public g1(final g<? extends T> g, final g<? extends T> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final n<? super T> n) {
        final e e = new e();
        final rx.internal.producers.a a = new rx.internal.producers.a();
        final b b = new b(n, e, a, this.H);
        e.b(b);
        n.r(e);
        n.s0(a);
        b.w((g)this.G);
    }
    
    static final class a<T> extends n<T>
    {
        private final rx.internal.producers.a L;
        private final n<? super T> M;
        
        a(final n<? super T> m, final rx.internal.producers.a l) {
            this.M = m;
            this.L = l;
        }
        
        @Override
        public void b(final Throwable t) {
            this.M.b(t);
        }
        
        @Override
        public void c() {
            this.M.c();
        }
        
        @Override
        public void m(final T t) {
            this.M.m((Object)t);
            this.L.b(1L);
        }
        
        @Override
        public void s0(final i i) {
            this.L.c(i);
        }
    }
    
    static final class b<T> extends n<T>
    {
        private boolean L;
        private final n<? super T> M;
        private final e N;
        private final rx.internal.producers.a O;
        private final g<? extends T> P;
        final AtomicInteger Q;
        volatile boolean R;
        
        b(final n<? super T> m, final e n, final rx.internal.producers.a o, final g<? extends T> p4) {
            this.L = true;
            this.M = m;
            this.N = n;
            this.O = o;
            this.P = p4;
            this.Q = new AtomicInteger();
        }
        
        @Override
        public void b(final Throwable t) {
            this.M.b(t);
        }
        
        @Override
        public void c() {
            if (!this.L) {
                this.M.c();
            }
            else if (!this.M.g()) {
                this.R = false;
                this.w(null);
            }
        }
        
        @Override
        public void m(final T t) {
            this.L = false;
            this.M.m((Object)t);
            this.O.b(1L);
        }
        
        @Override
        public void s0(final i i) {
            this.O.c(i);
        }
        
        void w(g<? extends T> g) {
            if (this.Q.getAndIncrement() == 0) {
                while (!this.M.g()) {
                    g<? extends T> g2 = g;
                    if (!this.R) {
                        if (g == null) {
                            final a<Object> a = new a<Object>((n<? super Object>)this.M, this.O);
                            this.N.b(a);
                            this.R = true;
                            this.P.R6(a);
                            g2 = g;
                        }
                        else {
                            this.R = true;
                            g.R6(this);
                            g2 = null;
                        }
                    }
                    g = g2;
                    if (this.Q.decrementAndGet() == 0) {
                        break;
                    }
                }
            }
        }
    }
}
