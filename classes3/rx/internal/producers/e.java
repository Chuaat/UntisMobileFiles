// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.producers;

import rx.h;
import rx.exceptions.c;
import rx.n;
import rx.i;
import java.util.concurrent.atomic.AtomicInteger;

public final class e<T> extends AtomicInteger implements i
{
    private static final long I = -2873467947112093874L;
    static final int J = 0;
    static final int K = 1;
    static final int L = 2;
    static final int M = 3;
    final n<? super T> G;
    T H;
    
    public e(final n<? super T> g) {
        this.G = g;
    }
    
    private static <T> void a(final n<? super T> n, final T t) {
        if (n.g()) {
            return;
        }
        try {
            n.m(t);
            if (n.g()) {
                return;
            }
            n.c();
        }
        finally {
            final Throwable t2;
            c.g(t2, n, t);
        }
    }
    
    public void b(final T h) {
        while (true) {
            final int value = this.get();
            if (value == 0) {
                this.H = h;
                if (!this.compareAndSet(0, 1)) {
                    continue;
                }
                break;
            }
            else {
                if (value == 2 && this.compareAndSet(2, 3)) {
                    a(this.G, h);
                    break;
                }
                break;
            }
        }
    }
    
    @Override
    public void v(final long n) {
        final long n2 = lcmp(n, 0L);
        if (n2 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (n2 == 0) {
            return;
        }
        while (true) {
            final int value = this.get();
            if (value == 0) {
                if (!this.compareAndSet(0, 2)) {
                    continue;
                }
                break;
            }
            else {
                if (value == 1 && this.compareAndSet(1, 3)) {
                    a(this.G, this.H);
                    break;
                }
                break;
            }
        }
    }
}
