// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import java.util.Objects;
import rx.internal.util.r;

@r
public final class z<E> extends e0<E>
{
    public z(final int n) {
        super(n);
    }
    
    private long q() {
        return rx.internal.util.unsafe.n0.a.getLongVolatile(this, b0.K0);
    }
    
    private long r() {
        return rx.internal.util.unsafe.n0.a.getLongVolatile(this, f0.u0);
    }
    
    private void t(final long x) {
        rx.internal.util.unsafe.n0.a.putOrderedLong(this, b0.K0, x);
    }
    
    private void v(final long x) {
        rx.internal.util.unsafe.n0.a.putOrderedLong(this, f0.u0, x);
    }
    
    @Override
    public boolean isEmpty() {
        return this.r() == this.q();
    }
    
    @Override
    public boolean offer(final E obj) {
        Objects.requireNonNull(obj, "null elements not allowed");
        final E[] x = (E[])super.X;
        final long producerIndex = super.producerIndex;
        final long b = this.b(producerIndex);
        if (this.l(x, b) != null) {
            return false;
        }
        this.n(x, b, obj);
        this.v(producerIndex + 1L);
        return true;
    }
    
    @Override
    public E peek() {
        return this.k(this.b(super.consumerIndex));
    }
    
    @Override
    public E poll() {
        final long consumerIndex = super.consumerIndex;
        final long b = this.b(consumerIndex);
        final E[] x = (E[])super.X;
        final E l = this.l(x, b);
        if (l == null) {
            return null;
        }
        this.n(x, b, null);
        this.t(consumerIndex + 1L);
        return l;
    }
    
    @Override
    public int size() {
        long q = this.q();
        long r;
        long q2;
        while (true) {
            r = this.r();
            q2 = this.q();
            if (q == q2) {
                break;
            }
            q = q2;
        }
        return (int)(r - q2);
    }
}
