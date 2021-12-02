// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class x<E> extends t<E>
{
    protected static final long r0;
    private volatile long producerIndex;
    
    static {
        r0 = n0.a(x.class, "producerIndex");
    }
    
    public x(final int n) {
        super(n);
    }
    
    protected final long q() {
        return this.producerIndex;
    }
    
    protected final void r(final long x) {
        rx.internal.util.unsafe.n0.a.putOrderedLong(this, x.r0, x);
    }
}
