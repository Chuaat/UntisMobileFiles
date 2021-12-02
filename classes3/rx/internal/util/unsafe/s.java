// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class s<E> extends u<E>
{
    protected static final long H0;
    private volatile long consumerIndex;
    
    static {
        H0 = n0.a(s.class, "consumerIndex");
    }
    
    public s(final int n) {
        super(n);
    }
    
    protected final boolean t(final long expected, final long x) {
        return rx.internal.util.unsafe.n0.a.compareAndSwapLong(this, s.H0, expected, x);
    }
    
    protected final long v() {
        return this.consumerIndex;
    }
}
