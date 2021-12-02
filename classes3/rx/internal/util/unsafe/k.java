// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class k<E> extends m<E>
{
    private static final long K0;
    private volatile long consumerIndex;
    
    static {
        K0 = n0.a(k.class, "consumerIndex");
    }
    
    public k(final int n) {
        super(n);
    }
    
    protected final boolean x(final long expected, final long x) {
        return rx.internal.util.unsafe.n0.a.compareAndSwapLong(this, k.K0, expected, x);
    }
    
    protected final long z() {
        return this.consumerIndex;
    }
}
