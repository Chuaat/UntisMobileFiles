// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.o;
import rx.n;
import rx.g;

public final class t3<T, E> implements b<T, T>
{
    private final g<? extends E> G;
    
    public t3(final g<? extends E> g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final rx.observers.g g = new rx.observers.g((n<? super Object>)n, false);
        final n<T> n2 = new n<T>(g, false) {
            @Override
            public void b(final Throwable t) {
                try {
                    g.b(t);
                }
                finally {
                    g.i();
                }
            }
            
            @Override
            public void c() {
                try {
                    g.c();
                }
                finally {
                    g.i();
                }
            }
            
            @Override
            public void m(final T t) {
                g.m(t);
            }
        };
        final n<E> n3 = new n<E>() {
            @Override
            public void b(final Throwable t) {
                n2.b(t);
            }
            
            @Override
            public void c() {
                n2.c();
            }
            
            @Override
            public void f() {
                this.v(Long.MAX_VALUE);
            }
            
            @Override
            public void m(final E e) {
                this.c();
            }
        };
        g.r(n2);
        g.r(n3);
        n.r(g);
        this.G.R6(n3);
        return n2;
    }
}
