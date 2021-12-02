// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class b0<E> extends d0<E>
{
    protected static final long K0;
    protected long consumerIndex;
    
    static {
        K0 = n0.a(b0.class, "consumerIndex");
    }
    
    public b0(final int n) {
        super(n);
    }
}
