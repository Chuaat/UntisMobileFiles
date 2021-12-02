// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.o;
import java.util.NoSuchElementException;
import rx.n;
import rx.m;
import rx.g;
import rx.k;

public class e1<T> implements t<T>
{
    private final g<T> G;
    
    public e1(final g<T> g) {
        this.G = g;
    }
    
    public static <T> e1<T> b(final g<T> g) {
        return new e1<T>(g);
    }
    
    public void a(final m<? super T> m) {
        final n<T> n = new n<T>() {
            private boolean L;
            private boolean M;
            private T N;
            
            @Override
            public void b(final Throwable t) {
                m.b(t);
                this.i();
            }
            
            @Override
            public void c() {
                if (!this.L) {
                    if (this.M) {
                        m.e(this.N);
                    }
                    else {
                        m.b(new NoSuchElementException("Observable emitted no items"));
                    }
                }
            }
            
            @Override
            public void f() {
                this.v(2L);
            }
            
            @Override
            public void m(final T n) {
                if (this.M) {
                    this.L = true;
                    m.b(new IllegalArgumentException("Observable emitted too many elements"));
                    this.i();
                }
                else {
                    this.M = true;
                    this.N = n;
                }
            }
        };
        m.d(n);
        this.G.R6(n);
    }
}
