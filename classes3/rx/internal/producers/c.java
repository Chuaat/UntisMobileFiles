// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.producers;

import rx.internal.operators.a;
import rx.exceptions.d;
import rx.internal.util.unsafe.g0;
import rx.internal.util.unsafe.n0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Queue;
import rx.n;
import rx.h;
import rx.i;
import java.util.concurrent.atomic.AtomicLong;

public final class c<T> extends AtomicLong implements i, h<T>
{
    private static final long L = 7277121710709137047L;
    static final Object M;
    final n<? super T> G;
    final Queue<Object> H;
    final AtomicInteger I;
    Throwable J;
    volatile boolean K;
    
    static {
        M = new Object();
    }
    
    public c(final n<? super T> n) {
        Object o;
        if (n0.f()) {
            o = new g0();
        }
        else {
            o = new rx.internal.util.atomic.h();
        }
        this(n, (Queue)o);
    }
    
    public c(final n<? super T> g, final Queue<Object> h) {
        this.G = g;
        this.H = h;
        this.I = new AtomicInteger();
    }
    
    private boolean h(final boolean b, final boolean b2) {
        if (this.G.g()) {
            return true;
        }
        if (b) {
            final Throwable j = this.J;
            if (j != null) {
                this.H.clear();
                this.G.b(j);
                return true;
            }
            if (b2) {
                this.G.c();
                return true;
            }
        }
        return false;
    }
    
    private void j() {
        if (this.I.getAndIncrement() == 0) {
            final n<? super T> g = this.G;
            final Queue<Object> h = this.H;
            while (!this.h(this.K, h.isEmpty())) {
                this.I.lazySet(1);
                long value = this.get();
                long n = 0L;
                while (value != 0L) {
                    final boolean k = this.K;
                    Object poll = h.poll();
                    if (this.h(k, poll == null)) {
                        return;
                    }
                    if (poll == null) {
                        break;
                    }
                    try {
                        if (poll == c.M) {
                            g.m((Object)null);
                        }
                        else {
                            g.m((Object)poll);
                        }
                        --value;
                        ++n;
                        continue;
                    }
                    finally {
                        if (poll == c.M) {
                            poll = null;
                        }
                        rx.exceptions.c.g((Throwable)h, g, poll);
                        return;
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
    
    @Override
    public void b(final Throwable j) {
        this.J = j;
        this.K = true;
        this.j();
    }
    
    @Override
    public void c() {
        this.K = true;
        this.j();
    }
    
    public boolean k(final T t) {
        if (t == null) {
            if (!this.H.offer(c.M)) {
                return false;
            }
        }
        else if (!this.H.offer(t)) {
            return false;
        }
        this.j();
        return true;
    }
    
    @Override
    public void m(final T t) {
        if (!this.k(t)) {
            this.b(new d());
        }
    }
    
    @Override
    public void v(final long n) {
        final long n2 = lcmp(n, 0L);
        if (n2 >= 0) {
            if (n2 > 0) {
                a.b(this, n);
                this.j();
            }
            return;
        }
        throw new IllegalArgumentException("n >= 0 required");
    }
}
