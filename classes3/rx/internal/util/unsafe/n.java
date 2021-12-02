// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class n<E> extends l<E>
{
    private static final long u0;
    private volatile long producerIndex;
    
    static {
        u0 = n0.a(n.class, "producerIndex");
    }
    
    public n(final int n) {
        super(n);
    }
    
    protected final boolean v(final long expected, final long x) {
        return rx.internal.util.unsafe.n0.a.compareAndSwapLong(this, n.u0, expected, x);
    }
    
    protected final long w() {
        return this.producerIndex;
    }
}
