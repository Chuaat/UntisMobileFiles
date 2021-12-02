// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import sun.misc.Unsafe;
import rx.internal.util.r;

@r
public abstract class h<E> extends f<E>
{
    private static final long d0;
    private static final int e0;
    protected final long[] c0;
    
    static {
        final Unsafe a = n0.a;
        if (8 == a.arrayIndexScale(long[].class)) {
            final int y = f.Y;
            d0 = a.arrayBaseOffset(long[].class) + (32 << (e0 = y + 3) - y);
            return;
        }
        throw new IllegalStateException("Unexpected long[] element size");
    }
    
    public h(int n) {
        super(n);
        n = (int)(super.W + 1L);
        this.c0 = new long[(n << f.Y) + 64];
        for (long n2 = 0L; n2 < n; ++n2) {
            this.t(this.c0, this.q(n2), n2);
        }
    }
    
    protected final long q(final long n) {
        return h.d0 + ((n & super.W) << h.e0);
    }
    
    protected final long r(final long[] o, final long offset) {
        return n0.a.getLongVolatile(o, offset);
    }
    
    protected final void t(final long[] o, final long offset, final long x) {
        n0.a.putOrderedLong(o, offset, x);
    }
}
