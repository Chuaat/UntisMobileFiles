// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import rx.internal.util.atomic.c;
import java.util.Iterator;
import rx.internal.util.r;

@r
abstract class a<E> extends b<E>
{
    long A0;
    long B0;
    long C0;
    long D0;
    long o0;
    long p0;
    long q0;
    long r0;
    long s0;
    long t0;
    long u0;
    long v0;
    long w0;
    long x0;
    long y0;
    long z0;
    
    @Override
    public final boolean isEmpty() {
        return this.k() == this.f();
    }
    
    @Override
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final int size() {
        rx.internal.util.atomic.c<E> k;
        rx.internal.util.atomic.c<E> f;
        int n;
        rx.internal.util.atomic.c<E> c;
        for (k = this.k(), f = this.f(), n = 0; k != f && n < Integer.MAX_VALUE; ++n, k = c) {
            do {
                c = k.c();
            } while (c == null);
        }
        return n;
    }
}
