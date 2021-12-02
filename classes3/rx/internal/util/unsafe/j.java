// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import java.util.Objects;
import rx.internal.util.r;

@r
public class j<E> extends k<E>
{
    long L0;
    long M0;
    long N0;
    long O0;
    long P0;
    long Q0;
    long R0;
    long S0;
    long T0;
    long U0;
    long V0;
    long W0;
    long X0;
    long Y0;
    long Z0;
    
    public j(final int b) {
        super(Math.max(2, b));
    }
    
    @Override
    public boolean isEmpty() {
        return this.z() == this.w();
    }
    
    @Override
    public boolean offer(final E obj) {
        Objects.requireNonNull(obj, "Null is not a valid element");
        final long w = super.W;
        final long[] c0 = super.c0;
        long z = Long.MAX_VALUE;
        while (true) {
            final long w2 = this.w();
            final long q = this.q(w2);
            final long n = lcmp(this.r(c0, q) - w2, 0L);
            if (n == 0) {
                final long n2 = w2 + 1L;
                if (this.v(w2, n2)) {
                    this.o(this.b(w2), obj);
                    this.t(c0, q, n2);
                    return true;
                }
                continue;
            }
            else {
                if (n >= 0) {
                    continue;
                }
                final long n3 = w2 - (w + 1L);
                if (n3 <= z && n3 <= (z = this.z())) {
                    return false;
                }
                continue;
            }
        }
    }
    
    @Override
    public E peek() {
        E h;
        long z;
        do {
            z = this.z();
            h = this.h(this.b(z));
        } while (h == null && z != this.w());
        return h;
    }
    
    @Override
    public E poll() {
        final long[] c0 = super.c0;
        long w = -1L;
        while (true) {
            final long z = this.z();
            final long q = this.q(z);
            final long r = this.r(c0, q);
            final long n = z + 1L;
            final long n2 = lcmp(r - n, 0L);
            if (n2 == 0) {
                if (this.x(z, n)) {
                    final long b = this.b(z);
                    final E h = this.h(b);
                    this.o(b, null);
                    this.t(c0, q, z + super.W + 1L);
                    return h;
                }
                continue;
            }
            else {
                if (n2 < 0 && z >= w && z == (w = this.w())) {
                    return null;
                }
                continue;
            }
        }
    }
    
    @Override
    public int size() {
        long z = this.z();
        long w;
        long z2;
        while (true) {
            w = this.w();
            z2 = this.z();
            if (z == z2) {
                break;
            }
            z = z2;
        }
        return (int)(w - z2);
    }
}
