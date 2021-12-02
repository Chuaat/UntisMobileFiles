// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import java.util.Objects;

@rx.internal.util.r
public final class r<E> extends v<E>
{
    public r(final int n) {
        super(n);
    }
    
    @Override
    public boolean isEmpty() {
        return this.v() == this.q();
    }
    
    @Override
    public boolean offer(final E obj) {
        Objects.requireNonNull(obj, "Null is not a valid element");
        final E[] x = (E[])super.X;
        final long w = super.W;
        final long q = this.q();
        final long b = this.b(q);
        if (this.l(x, b) != null) {
            if (q - this.v() > w) {
                return false;
            }
            while (this.l(x, b) != null) {}
        }
        this.p(x, b, obj);
        this.r(q + 1L);
        return true;
    }
    
    @Override
    public E peek() {
        final long w = this.w();
        E k;
        do {
            final long v = this.v();
            if (v >= w) {
                final long q = this.q();
                if (v >= q) {
                    return null;
                }
                this.x(q);
            }
            k = this.k(this.b(v));
        } while (k == null);
        return k;
    }
    
    @Override
    public E poll() {
        final long w = this.w();
        long v;
        do {
            v = this.v();
            if (v >= w) {
                final long q = this.q();
                if (v >= q) {
                    return null;
                }
                this.x(q);
            }
        } while (!this.t(v, 1L + v));
        final long b = this.b(v);
        final E[] x = (E[])super.X;
        final E i = this.i(x, b);
        this.n(x, b, null);
        return i;
    }
    
    @Override
    public int size() {
        long v = this.v();
        long q;
        long v2;
        while (true) {
            q = this.q();
            v2 = this.v();
            if (v == v2) {
                break;
            }
            v = v2;
        }
        return (int)(q - v2);
    }
}
