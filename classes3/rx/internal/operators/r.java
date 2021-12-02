// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Iterator;
import rx.plugins.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.o;
import rx.d;
import rx.b;

public final class r implements j0
{
    final Iterable<? extends b> G;
    
    public r(final Iterable<? extends b> g) {
        this.G = g;
    }
    
    public void a(final d d) {
        Object o = new rx.subscriptions.b();
        d.a((o)o);
        try {
            final Iterator<? extends b> iterator = this.G.iterator();
            if (iterator == null) {
                d.b(new NullPointerException("The source iterator returned is null"));
                return;
            }
            final AtomicInteger atomicInteger = new AtomicInteger(1);
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            while (!((rx.subscriptions.b)o).g()) {
                try {
                    if (!iterator.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
                            d.c();
                        }
                        return;
                    }
                    if (((rx.subscriptions.b)o).g()) {
                        return;
                    }
                    try {
                        final b b = (b)iterator.next();
                        if (((rx.subscriptions.b)o).g()) {
                            return;
                        }
                        if (b == null) {
                            ((rx.subscriptions.b)o).i();
                            o = new NullPointerException("A completable source is null");
                            if (atomicBoolean.compareAndSet(false, true)) {
                                d.b((Throwable)o);
                            }
                            else {
                                rx.plugins.c.I((Throwable)o);
                            }
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        b.G0(new d() {
                            @Override
                            public void a(final o o) {
                                ((rx.subscriptions.b)o).a(o);
                            }
                            
                            @Override
                            public void b(final Throwable t) {
                                ((rx.subscriptions.b)o).i();
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
                        continue;
                    }
                    finally {
                        ((rx.subscriptions.b)o).i();
                        if (atomicBoolean.compareAndSet(false, true)) {
                            final Throwable t;
                            d.b(t);
                        }
                        else {
                            final Throwable t;
                            rx.plugins.c.I(t);
                        }
                    }
                }
                finally {
                    ((rx.subscriptions.b)o).i();
                    if (atomicBoolean.compareAndSet(false, true)) {
                        d.b((Throwable)atomicInteger);
                    }
                    else {
                        rx.plugins.c.I((Throwable)atomicInteger);
                    }
                }
            }
        }
        finally {
            final Throwable t2;
            d.b(t2);
        }
    }
}
