// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.o;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.n;
import rx.g;

public final class l3<T, U> implements b<T, T>
{
    final g<U> G;
    
    public l3(final g<U> g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final rx.observers.g g = new rx.observers.g((n<? super T>)n);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final n<U> n2 = new n<U>() {
            @Override
            public void b(final Throwable t) {
                g.b(t);
                g.i();
            }
            
            @Override
            public void c() {
                this.i();
            }
            
            @Override
            public void m(final U u) {
                atomicBoolean.set(true);
                this.i();
            }
        };
        n.r(n2);
        this.G.R6(n2);
        return new n<T>(n) {
            @Override
            public void b(final Throwable t) {
                g.b(t);
                this.i();
            }
            
            @Override
            public void c() {
                g.c();
                this.i();
            }
            
            @Override
            public void m(final T t) {
                if (atomicBoolean.get()) {
                    g.m(t);
                }
                else {
                    this.v(1L);
                }
            }
        };
    }
}
