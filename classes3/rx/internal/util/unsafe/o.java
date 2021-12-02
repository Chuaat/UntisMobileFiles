// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import java.util.Objects;
import rx.internal.util.atomic.c;
import rx.internal.util.r;

@r
public final class o<E> extends a<E>
{
    public o() {
        this.m((rx.internal.util.atomic.c<E>)(super.consumerNode = new rx.internal.util.atomic.c<Object>()));
    }
    
    protected rx.internal.util.atomic.c<E> m(final rx.internal.util.atomic.c<E> x) {
        rx.internal.util.atomic.c<E> producerNode;
        do {
            producerNode = (rx.internal.util.atomic.c<E>)super.producerNode;
        } while (!rx.internal.util.unsafe.n0.a.compareAndSwapObject(this, e.W, producerNode, x));
        return producerNode;
    }
    
    @Override
    public boolean offer(final E obj) {
        Objects.requireNonNull(obj, "null elements not allowed");
        final rx.internal.util.atomic.c<E> c = new rx.internal.util.atomic.c<E>(obj);
        this.m(c).d(c);
        return true;
    }
    
    @Override
    public E peek() {
        final rx.internal.util.atomic.c<E> consumerNode = (rx.internal.util.atomic.c<E>)super.consumerNode;
        final rx.internal.util.atomic.c<E> c = consumerNode.c();
        if (c != null) {
            return c.b();
        }
        if (consumerNode != this.f()) {
            rx.internal.util.atomic.c<E> c2;
            do {
                c2 = consumerNode.c();
            } while (c2 == null);
            return c2.b();
        }
        return null;
    }
    
    @Override
    public E poll() {
        final rx.internal.util.atomic.c<E> i = this.i();
        final rx.internal.util.atomic.c<E> c = i.c();
        if (c != null) {
            final E a = c.a();
            this.l(c);
            return a;
        }
        if (i != this.f()) {
            rx.internal.util.atomic.c<E> c2;
            do {
                c2 = i.c();
            } while (c2 == null);
            final E a2 = c2.a();
            super.consumerNode = c2;
            return a2;
        }
        return null;
    }
}
