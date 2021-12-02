// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import java.util.Objects;
import rx.internal.util.atomic.c;

public final class g0<E> extends a<E>
{
    public g0() {
        this.h(new rx.internal.util.atomic.c<E>());
        this.l(super.producerNode);
        super.consumerNode.d(null);
    }
    
    @Override
    public boolean offer(final E obj) {
        Objects.requireNonNull(obj, "null elements not allowed");
        final rx.internal.util.atomic.c<E> producerNode = new rx.internal.util.atomic.c<E>(obj);
        super.producerNode.d(producerNode);
        super.producerNode = producerNode;
        return true;
    }
    
    @Override
    public E peek() {
        final rx.internal.util.atomic.c<E> c = super.consumerNode.c();
        if (c != null) {
            return c.b();
        }
        return null;
    }
    
    @Override
    public E poll() {
        final rx.internal.util.atomic.c<E> c = super.consumerNode.c();
        if (c != null) {
            final E a = c.a();
            super.consumerNode = c;
            return a;
        }
        return null;
    }
}
