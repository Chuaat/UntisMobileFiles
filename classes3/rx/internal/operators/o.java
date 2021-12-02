// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.plugins.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.d;
import rx.b;

public final class o implements j0
{
    final b[] G;
    
    public o(final b[] g) {
        this.G = g;
    }
    
    public void a(final d d) {
        final rx.subscriptions.b b = new rx.subscriptions.b();
        final AtomicInteger atomicInteger = new AtomicInteger(this.G.length + 1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        d.a(b);
        for (final b b2 : this.G) {
            if (b.g()) {
                return;
            }
            if (b2 == null) {
                b.i();
                final NullPointerException ex = new NullPointerException("A completable source is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    d.b(ex);
                    return;
                }
                rx.plugins.c.I(ex);
            }
            b2.G0(new d() {
                @Override
                public void a(final rx.o o) {
                    b.a(o);
                }
                
                @Override
                public void b(final Throwable t) {
                    b.i();
                    if (atomicBoolean.compareAndSet(false, true)) {
                        d.b(t);
                    }
                    else {
                        rx.plugins.c.I(t);
                    }
                }
                
                @Override
                public void c() {
                    if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
                        d.c();
                    }
                }
            });
        }
        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
            d.c();
        }
    }
}
