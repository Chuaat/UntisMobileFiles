// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.i;
import rx.n;
import rx.g;

public final class z0 implements g.a<Integer>
{
    private final int G;
    private final int H;
    
    public z0(final int g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final n<? super Integer> n) {
        n.s0(new a(n, this.G, this.H));
    }
    
    static final class a extends AtomicLong implements i
    {
        private static final long J = 4114392207069098388L;
        private final n<? super Integer> G;
        private final int H;
        private long I;
        
        a(final n<? super Integer> g, final int n, final int h) {
            this.G = g;
            this.I = n;
            this.H = h;
        }
        
        void a() {
            final long n = this.H;
            final n<? super Integer> g = this.G;
            for (long i = this.I; i != n + 1L; ++i) {
                if (g.g()) {
                    return;
                }
                g.m((int)i);
            }
            if (!g.g()) {
                g.c();
            }
        }
        
        void b(long n) {
            final long n2 = this.H + 1L;
            long i = this.I;
            final n<? super Integer> g = this.G;
            long n3;
            do {
                n3 = 0L;
                while (true) {
                    if (n3 != n && i != n2) {
                        if (g.g()) {
                            return;
                        }
                        g.m((int)i);
                        ++i;
                        ++n3;
                    }
                    else {
                        if (g.g()) {
                            return;
                        }
                        if (i == n2) {
                            g.c();
                            return;
                        }
                        if ((n = this.get()) == n3) {
                            this.I = i;
                            break;
                        }
                        continue;
                    }
                }
            } while ((n = this.addAndGet(-n3)) != 0L);
        }
        
        @Override
        public void v(final long n) {
            if (this.get() == Long.MAX_VALUE) {
                return;
            }
            if (n == Long.MAX_VALUE && this.compareAndSet(0L, Long.MAX_VALUE)) {
                this.a();
            }
            else if (n > 0L && rx.internal.operators.a.b(this, n) == 0L) {
                this.b(n);
            }
        }
    }
}
