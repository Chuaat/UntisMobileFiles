// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class f0<E> extends c0<E>
{
    protected static final long u0;
    protected long producerIndex;
    protected long t0;
    
    static {
        u0 = n0.a(f0.class, "producerIndex");
    }
    
    public f0(final int n) {
        super(n);
    }
}
