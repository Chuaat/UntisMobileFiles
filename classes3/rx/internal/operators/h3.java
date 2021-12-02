// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.i;
import java.util.NoSuchElementException;
import rx.internal.producers.f;
import rx.plugins.c;
import rx.o;
import rx.n;
import rx.g;

public final class h3<T> implements g.b<T, T>
{
    private final boolean G;
    private final T H;
    
    h3() {
        this(false, null);
    }
    
    public h3(final T t) {
        this(true, t);
    }
    
    private h3(final boolean g, final T h) {
        this.G = g;
        this.H = h;
    }
    
    public static <T> h3<T> b() {
        return (h3<T>)a.a;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final b<Object> b = new b<Object>((n<? super Object>)n, this.G, this.H);
        n.r(b);
        return b;
    }
    
    static final class a
    {
        static final h3<?> a;
        
        static {
            a = new h3<Object>();
        }
    }
    
    static final class b<T> extends n<T>
    {
        private final n<? super T> L;
        private final boolean M;
        private final T N;
        private T O;
        private boolean P;
        private boolean Q;
        
        b(final n<? super T> l, final boolean m, final T n) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.v(2L);
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.Q) {
                rx.plugins.c.I(t);
                return;
            }
            this.L.b(t);
        }
        
        @Override
        public void c() {
            if (!this.Q) {
                n<? super T> n;
                f f;
                if (this.P) {
                    n = this.L;
                    f = new f((n<? super T>)this.L, (T)this.O);
                }
                else {
                    if (!this.M) {
                        this.L.b(new NoSuchElementException("Sequence contains no elements"));
                        return;
                    }
                    n = this.L;
                    f = new f((n<? super T>)this.L, (T)this.N);
                }
                n.s0(f);
            }
        }
        
        @Override
        public void m(final T o) {
            if (!this.Q) {
                if (this.P) {
                    this.Q = true;
                    this.L.b(new IllegalArgumentException("Sequence contains too many elements"));
                    this.i();
                }
                else {
                    this.O = o;
                    this.P = true;
                }
            }
        }
    }
}
