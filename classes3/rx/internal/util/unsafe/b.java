// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import rx.internal.util.atomic.c;
import rx.internal.util.r;

@r
abstract class b<E> extends d<E>
{
    protected static final long n0;
    protected rx.internal.util.atomic.c<E> consumerNode;
    
    static {
        n0 = rx.internal.util.unsafe.n0.a(b.class, "consumerNode");
    }
    
    protected final rx.internal.util.atomic.c<E> i() {
        return this.consumerNode;
    }
    
    protected final rx.internal.util.atomic.c<E> k() {
        return (rx.internal.util.atomic.c<E>)rx.internal.util.unsafe.n0.a.getObjectVolatile(this, b.n0);
    }
    
    protected final void l(final rx.internal.util.atomic.c<E> consumerNode) {
        this.consumerNode = consumerNode;
    }
}
