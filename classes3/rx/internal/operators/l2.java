// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.o;
import rx.i;
import rx.n;
import rx.g;

public final class l2<T> implements g.b<T, T>
{
    final int G;
    final boolean H;
    final T I;
    
    public l2(final int n) {
        this(n, null, false);
    }
    
    public l2(final int n, final T t) {
        this(n, t, true);
    }
    
    private l2(final int n, final T i, final boolean h) {
        if (n >= 0) {
            this.G = n;
            this.I = i;
            this.H = h;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(" is out of bounds");
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public n<? super T> a(final n<? super T> n) {
        final n<T> n2 = new n<T>() {
            private int L;
            
            @Override
            public void b(final Throwable t) {
                n.b(t);
            }
            
            @Override
            public void c() {
                final int l = this.L;
                final l2 n = l2.this;
                if (l <= n.G) {
                    if (n.H) {
                        n.m(n.I);
                        n.c();
                    }
                    else {
                        final n m = n;
                        final StringBuilder sb = new StringBuilder();
                        sb.append(l2.this.G);
                        sb.append(" is out of bounds");
                        m.b(new IndexOutOfBoundsException(sb.toString()));
                    }
                }
            }
            
            @Override
            public void m(final T t) {
                if (this.L++ == l2.this.G) {
                    n.m(t);
                    n.c();
                    this.i();
                }
            }
            
            @Override
            public void s0(final i i) {
                n.s0(new b(i));
            }
        };
        n.r(n2);
        return n2;
    }
    
    static class b extends AtomicBoolean implements i
    {
        private static final long H = 1L;
        final i G;
        
        public b(final i g) {
            this.G = g;
        }
        
        @Override
        public void v(final long n) {
            final long n2 = lcmp(n, 0L);
            if (n2 >= 0) {
                if (n2 > 0 && this.compareAndSet(false, true)) {
                    this.G.v(Long.MAX_VALUE);
                }
                return;
            }
            throw new IllegalArgumentException("n >= 0 required");
        }
    }
}
