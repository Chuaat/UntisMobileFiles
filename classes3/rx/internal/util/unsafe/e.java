// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class e<E> extends c<E>
{
    protected static final long W;
    protected rx.internal.util.atomic.c<E> producerNode;
    
    static {
        W = n0.a(e.class, "producerNode");
    }
    
    protected final rx.internal.util.atomic.c<E> b() {
        return this.producerNode;
    }
    
    protected final rx.internal.util.atomic.c<E> f() {
        return (rx.internal.util.atomic.c<E>)n0.a.getObjectVolatile(this, e.W);
    }
    
    protected final void h(final rx.internal.util.atomic.c<E> producerNode) {
        this.producerNode = producerNode;
    }
}
