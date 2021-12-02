// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.o;
import java.util.concurrent.atomic.AtomicReference;
import rx.n;
import rx.g;

public final class c3<T, U> implements b<T, T>
{
    static final Object H;
    final g<U> G;
    
    static {
        H = new Object();
    }
    
    public c3(final g<U> g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final rx.observers.g g = new rx.observers.g((n<? super T>)n);
        final AtomicReference atomicReference = new AtomicReference((V)c3.H);
        final AtomicReference<c3$b> atomicReference2 = new AtomicReference<c3$b>();
        final n<U> n2 = new n<U>() {
            @Override
            public void b(final Throwable t) {
                g.b(t);
                atomicReference2.get().i();
            }
            
            @Override
            public void c() {
                this.m(null);
                g.c();
                atomicReference2.get().i();
            }
            
            @Override
            public void m(final U u) {
                final AtomicReference l = atomicReference;
                final Object h = c3.H;
                final Object andSet = l.getAndSet(h);
                if (andSet != h) {
                    g.m(andSet);
                }
            }
        };
        final n<T> newValue = new n<T>() {
            @Override
            public void b(final Throwable t) {
                g.b(t);
                n2.i();
            }
            
            @Override
            public void c() {
                n2.m(null);
                g.c();
                n2.i();
            }
            
            @Override
            public void m(final T newValue) {
                atomicReference.set(newValue);
            }
        };
        atomicReference2.lazySet(newValue);
        n.r(newValue);
        n.r(n2);
        this.G.R6(n2);
        return newValue;
    }
}
