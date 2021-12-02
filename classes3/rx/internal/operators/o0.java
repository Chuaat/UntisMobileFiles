// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.i;
import rx.n;
import rx.g;

public final class o0<T> implements g.a<T>
{
    final T[] G;
    
    public o0(final T[] g) {
        this.G = g;
    }
    
    public void a(final n<? super T> n) {
        n.s0(new a<Object>((n<?>)n, (Object[])this.G));
    }
    
    static final class a<T> extends AtomicLong implements i
    {
        private static final long J = 3534218984725836979L;
        final n<? super T> G;
        final T[] H;
        int I;
        
        public a(final n<? super T> g, final T[] h) {
            this.G = g;
            this.H = h;
        }
        
        void a() {
            final n<? super T> g = this.G;
            for (final T t : this.H) {
                if (g.g()) {
                    return;
                }
                g.m(t);
            }
            if (g.g()) {
                return;
            }
            g.c();
        }
        
        void b(long addAndGet) {
            final n<? super T> g = this.G;
            final T[] h = this.H;
            final int length = h.length;
            int i = this.I;
            long delta;
            do {
                delta = 0L;
                while (true) {
                    if (addAndGet != 0L && i != length) {
                        if (g.g()) {
                            return;
                        }
                        g.m(h[i]);
                        if (++i == length) {
                            if (!g.g()) {
                                g.c();
                            }
                            return;
                        }
                        --addAndGet;
                        --delta;
                    }
                    else {
                        if ((addAndGet = this.get() + delta) == 0L) {
                            this.I = i;
                            break;
                        }
                        continue;
                    }
                }
            } while ((addAndGet = this.addAndGet(delta)) != 0L);
        }
        
        @Override
        public void v(final long lng) {
            final long n = lcmp(lng, 0L);
            if (n >= 0) {
                if (lng == Long.MAX_VALUE) {
                    if (rx.internal.operators.a.b(this, lng) == 0L) {
                        this.a();
                    }
                }
                else if (n != 0 && rx.internal.operators.a.b(this, lng) == 0L) {
                    this.b(lng);
                }
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("n >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
