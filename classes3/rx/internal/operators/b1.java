// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.plugins.c;
import rx.i;
import rx.o;
import rx.n;
import rx.functions.q;
import rx.g;

public final class b1<T> implements a<T>
{
    final g<T> G;
    final q<T, T, T> H;
    
    public b1(final g<T> g, final q<T, T, T> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final n<? super T> n) {
        final b b = (b)new b<Object>((n<? super T>)n, (q<T, T, T>)this.H);
        n.r(b);
        n.s0(new i() {
            @Override
            public void v(final long n) {
                b.w(n);
            }
        });
        this.G.R6(b);
    }
    
    static final class b<T> extends n<T>
    {
        static final Object P;
        final n<? super T> L;
        final q<T, T, T> M;
        T N;
        boolean O;
        
        static {
            P = new Object();
        }
        
        public b(final n<? super T> l, final q<T, T, T> m) {
            this.L = l;
            this.M = m;
            this.N = (T)b.P;
            this.v(0L);
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.O) {
                this.O = true;
                this.L.b(t);
            }
            else {
                rx.plugins.c.I(t);
            }
        }
        
        @Override
        public void c() {
            if (this.O) {
                return;
            }
            this.O = true;
            final T n = this.N;
            if (n != b.P) {
                this.L.m((Object)n);
                this.L.c();
            }
            else {
                this.L.b(new NoSuchElementException());
            }
        }
        
        @Override
        public void m(final T n) {
            if (this.O) {
                return;
            }
            final T n2 = this.N;
            if (n2 == b.P) {
                this.N = n;
            }
            else {
                try {
                    this.N = this.M.s(n2, n);
                }
                finally {
                    final Throwable t;
                    rx.exceptions.c.e(t);
                    this.i();
                    this.b(t);
                }
            }
        }
        
        void w(final long lng) {
            final long n = lcmp(lng, 0L);
            if (n >= 0) {
                if (n != 0) {
                    this.v(Long.MAX_VALUE);
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
