// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.producers;

import rx.h;
import rx.exceptions.c;
import rx.n;
import rx.i;
import java.util.concurrent.atomic.AtomicBoolean;

public final class f<T> extends AtomicBoolean implements i
{
    private static final long I = -3353584923995471404L;
    final n<? super T> G;
    final T H;
    
    public f(final n<? super T> g, final T h) {
        this.G = g;
        this.H = h;
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
        if (this.compareAndSet(false, true)) {
            final n<? super T> g = this.G;
            if (g.g()) {
                return;
            }
            final T h = this.H;
            try {
                g.m(h);
                if (g.g()) {
                    return;
                }
                g.c();
            }
            finally {
                final Throwable t;
                c.g(t, g, h);
            }
        }
    }
}
