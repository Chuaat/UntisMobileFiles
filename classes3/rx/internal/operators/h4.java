// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.c;
import java.util.concurrent.atomic.AtomicReference;
import rx.o;
import rx.n;
import rx.functions.q;
import rx.g;

public final class h4<T, U, R> implements b<R, T>
{
    static final Object I;
    final q<? super T, ? super U, ? extends R> G;
    final g<? extends U> H;
    
    static {
        I = new Object();
    }
    
    public h4(final g<? extends U> h, final q<? super T, ? super U, ? extends R> g) {
        this.H = h;
        this.G = g;
    }
    
    public n<? super T> a(final n<? super R> n) {
        final rx.observers.g g = new rx.observers.g((n<? super Object>)n, false);
        n.r(g);
        final AtomicReference atomicReference = new AtomicReference((V)h4.I);
        final n<T> n2 = new n<T>(g, true) {
            @Override
            public void b(final Throwable t) {
                g.b(t);
                g.i();
            }
            
            @Override
            public void c() {
                g.c();
                g.i();
            }
            
            @Override
            public void m(final T t) {
                final Object value = atomicReference.get();
                if (value != h4.I) {
                    try {
                        g.m(h4.this.G.s((Object)t, (Object)value));
                    }
                    finally {
                        final Throwable t2;
                        rx.exceptions.c.f(t2, this);
                    }
                }
            }
        };
        final n<U> n3 = new n<U>() {
            @Override
            public void b(final Throwable t) {
                g.b(t);
                g.i();
            }
            
            @Override
            public void c() {
                if (atomicReference.get() == h4.I) {
                    g.c();
                    g.i();
                }
            }
            
            @Override
            public void m(final U newValue) {
                atomicReference.set(newValue);
            }
        };
        g.r(n2);
        g.r(n3);
        this.H.R6(n3);
        return n2;
    }
}
