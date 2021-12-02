// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.o;
import java.util.concurrent.atomic.AtomicLong;
import rx.i;
import rx.plugins.c;
import rx.n;
import rx.g;

public final class p3<T> implements b<T, T>
{
    final int G;
    
    public p3(final int n) {
        if (n >= 0) {
            this.G = n;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("limit >= 0 required but it was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public n<? super T> a(final n<? super T> n) {
        final n<T> n2 = new n<T>() {
            int L;
            boolean M;
            
            @Override
            public void b(final Throwable t) {
                if (!this.M) {
                    this.M = true;
                    try {
                        n.b(t);
                        return;
                    }
                    finally {
                        this.i();
                    }
                }
                rx.plugins.c.I(t);
            }
            
            @Override
            public void c() {
                if (!this.M) {
                    this.M = true;
                    n.c();
                }
            }
            
            @Override
            public void m(final T t) {
                if (!this.g()) {
                    final int l = this.L;
                    final int i = l + 1;
                    this.L = i;
                    final int g = p3.this.G;
                    if (l < g) {
                        final boolean b = i == g;
                        n.m(t);
                        if (b && !this.M) {
                            this.M = true;
                            try {
                                n.c();
                            }
                            finally {
                                this.i();
                            }
                        }
                    }
                }
            }
            
            @Override
            public void s0(final i i) {
                n.s0(new i() {
                    final AtomicLong G = new AtomicLong(0L);
                    
                    @Override
                    public void v(final long a) {
                        if (a > 0L && !n.this.M) {
                            long value;
                            long min;
                            do {
                                value = this.G.get();
                                min = Math.min(a, p3.this.G - value);
                                if (min == 0L) {
                                    return;
                                }
                            } while (!this.G.compareAndSet(value, value + min));
                            i.v(min);
                        }
                    }
                });
            }
        };
        if (this.G == 0) {
            n.c();
            n2.i();
        }
        n.r(n2);
        return n2;
    }
}
