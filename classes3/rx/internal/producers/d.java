// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.producers;

import rx.internal.operators.a;
import rx.exceptions.c;
import rx.internal.util.atomic.h;
import rx.internal.util.unsafe.g0;
import rx.internal.util.unsafe.n0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Queue;
import rx.n;
import rx.i;
import java.util.concurrent.atomic.AtomicLong;

public final class d<T> extends AtomicLong implements i
{
    private static final long J = 7277121710709137047L;
    static final Object K;
    final n<? super T> G;
    final Queue<Object> H;
    final AtomicInteger I;
    
    static {
        K = new Object();
    }
    
    public d(final n<? super T> n) {
        Object o;
        if (n0.f()) {
            o = new g0();
        }
        else {
            o = new h();
        }
        this(n, (Queue)o);
    }
    
    public d(final n<? super T> g, final Queue<Object> h) {
        this.G = g;
        this.H = h;
        this.I = new AtomicInteger();
    }
    
    private void a() {
        if (this.I.getAndIncrement() == 0) {
            final n<? super T> g = this.G;
            final Queue<Object> h = this.H;
            while (!g.g()) {
                this.I.lazySet(1);
                long value = this.get();
                long n = 0L;
                while (value != 0L) {
                    Object poll = h.poll();
                    if (poll != null) {
                        try {
                            if (poll == d.K) {
                                g.m((Object)null);
                            }
                            else {
                                g.m((Object)poll);
                            }
                            if (g.g()) {
                                return;
                            }
                            --value;
                            ++n;
                            continue;
                        }
                        finally {
                            if (poll == d.K) {
                                poll = null;
                            }
                            c.g((Throwable)h, g, poll);
                            return;
                        }
                        break;
                    }
                    break;
                }
                if (n != 0L && this.get() != Long.MAX_VALUE) {
                    this.addAndGet(-n);
                }
                if (this.I.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
    
    public boolean b(final T t) {
        if (t == null) {
            if (!this.H.offer(d.K)) {
                return false;
            }
        }
        else if (!this.H.offer(t)) {
            return false;
        }
        this.a();
        return true;
    }
    
    @Override
    public void v(final long n) {
        final long n2 = lcmp(n, 0L);
        if (n2 >= 0) {
            if (n2 > 0) {
                a.b(this, n);
                this.a();
            }
            return;
        }
        throw new IllegalArgumentException("n >= 0 required");
    }
}
