// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class y<E> extends w<E>
{
    private volatile long X0;
    
    public y(final int n) {
        super(n);
    }
    
    protected final long w() {
        return this.X0;
    }
    
    protected final void x(final long x0) {
        this.X0 = x0;
    }
}
