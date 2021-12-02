// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Queue;
import rx.o;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.d;
import rx.b;

public final class p implements j0
{
    final b[] G;
    
    public p(final b[] g) {
        this.G = g;
    }
    
    public void a(final d d) {
        final rx.subscriptions.b b = new rx.subscriptions.b();
        final AtomicInteger atomicInteger = new AtomicInteger(this.G.length + 1);
        final ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = new ConcurrentLinkedQueue<Throwable>();
        d.a(b);
        for (final b b2 : this.G) {
            if (b.g()) {
                return;
            }
            if (b2 == null) {
                concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            }
            else {
                b2.G0(new d() {
                    @Override
                    public void a(final o o) {
                        b.a(o);
                    }
                    
                    @Override
                    public void b(final Throwable t) {
                        concurrentLinkedQueue.offer(t);
                        this.d();
                    }
                    
                    @Override
                    public void c() {
                        this.d();
                    }
                    
                    void d() {
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (concurrentLinkedQueue.isEmpty()) {
                                d.c();
                            }
                            else {
                                d.b(n.b(concurrentLinkedQueue));
                            }
                        }
                    }
                });
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (concurrentLinkedQueue.isEmpty()) {
                d.c();
            }
            else {
                d.b(n.b(concurrentLinkedQueue));
            }
        }
    }
}
