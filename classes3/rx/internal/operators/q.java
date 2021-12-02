// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import rx.internal.util.unsafe.n0;
import java.util.concurrent.atomic.AtomicInteger;
import rx.o;
import rx.d;
import rx.b;

public final class q implements j0
{
    final Iterable<? extends b> G;
    
    public q(final Iterable<? extends b> g) {
        this.G = g;
    }
    
    public void a(final d d) {
        final rx.subscriptions.b b = new rx.subscriptions.b();
        d.a(b);
        try {
            final Iterator<? extends b> iterator = this.G.iterator();
            if (iterator == null) {
                d.b(new NullPointerException("The source iterator returned is null"));
                return;
            }
            final AtomicInteger atomicInteger = new AtomicInteger(1);
            Object o;
            if (n0.f()) {
                o = new rx.internal.util.unsafe.o<Throwable>();
            }
            else {
                o = new rx.internal.util.atomic.d<Throwable>();
            }
            while (!b.g()) {
                try {
                    if (!iterator.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (((Collection)o).isEmpty()) {
                                d.c();
                            }
                            else {
                                d.b(n.b((Queue<Throwable>)o));
                            }
                        }
                        return;
                    }
                    if (b.g()) {
                        return;
                    }
                    try {
                        final b b2 = (b)iterator.next();
                        if (b.g()) {
                            return;
                        }
                        if (b2 == null) {
                            ((Queue<NullPointerException>)o).offer(new NullPointerException("A completable source is null"));
                            if (atomicInteger.decrementAndGet() == 0) {
                                if (((Collection)o).isEmpty()) {
                                    d.c();
                                }
                                else {
                                    d.b(n.b((Queue<Throwable>)o));
                                }
                            }
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        b2.G0(new d() {
                            @Override
                            public void a(final o o) {
                                b.a(o);
                            }
                            
                            @Override
                            public void b(final Throwable t) {
                                ((Queue<Throwable>)o).offer(t);
                                this.d();
                            }
                            
                            @Override
                            public void c() {
                                this.d();
                            }
                            
                            void d() {
                                if (atomicInteger.decrementAndGet() == 0) {
                                    if (((Collection)o).isEmpty()) {
                                        d.c();
                                    }
                                    else {
                                        d.b(n.b(o));
                                    }
                                }
                            }
                        });
                        continue;
                    }
                    finally {
                        final Throwable t;
                        ((Queue<NullPointerException>)o).offer((NullPointerException)t);
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (((Collection)o).isEmpty()) {
                                d.c();
                            }
                            else {
                                d.b(n.b((Queue<Throwable>)o));
                            }
                        }
                    }
                }
                finally {
                    ((Queue<NullPointerException>)o).offer((NullPointerException)iterator);
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (((Collection)o).isEmpty()) {
                            d.c();
                        }
                        else {
                            d.b(n.b((Queue<Throwable>)o));
                        }
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
