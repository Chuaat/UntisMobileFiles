// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import java.util.Objects;
import java.util.Iterator;
import sun.misc.Unsafe;
import rx.internal.util.r;

@r
public class h0<E> extends j0<E> implements q
{
    static final int Z;
    private static final long a0;
    private static final long b0;
    private static final long c0;
    private static final int d0;
    private static final Object e0;
    
    static {
        Z = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
        e0 = new Object();
        final Unsafe a = n0.a;
        final int arrayIndexScale = a.arrayIndexScale(Object[].class);
        int d;
        if (4 == arrayIndexScale) {
            d = 2;
        }
        else {
            if (8 != arrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            d = 3;
        }
        d0 = d;
        c0 = a.arrayBaseOffset(Object[].class);
        try {
            a0 = a.objectFieldOffset(m0.class.getDeclaredField("producerIndex"));
            try {
                b0 = a.objectFieldOffset(j0.class.getDeclaredField("consumerIndex"));
                return;
            }
            catch (NoSuchFieldException cause) {
                final InternalError internalError = new InternalError();
                internalError.initCause(cause);
                throw internalError;
            }
        }
        catch (NoSuchFieldException cause2) {
            final InternalError internalError2 = new InternalError();
            internalError2.initCause(cause2);
            throw internalError2;
        }
        throw new IllegalStateException("Unknown pointer size");
    }
    
    public h0(int b) {
        b = p.b(b);
        final long n = b - 1;
        final Object[] array = new Object[b + 1];
        super.J = array;
        super.I = n;
        this.h(b);
        super.Y = array;
        super.X = n;
        super.H = n - 1L;
        this.x(0L);
    }
    
    private void h(final int n) {
        super.G = Math.min(n / 4, h0.Z);
    }
    
    private static long i(final long n) {
        return h0.c0 + (n << h0.d0);
    }
    
    private static long k(final long n, final long n2) {
        return i(n & n2);
    }
    
    private long l() {
        return n0.a.getLongVolatile(this, h0.b0);
    }
    
    private static <E> Object m(final E[] o, final long offset) {
        return n0.a.getObjectVolatile(o, offset);
    }
    
    private E[] n(final E[] array) {
        return (E[])m(array, i(array.length - 1));
    }
    
    private long o() {
        return n0.a.getLongVolatile(this, h0.a0);
    }
    
    private E p(final E[] y, final long n, final long n2) {
        super.Y = y;
        return (E)m(y, k(n, n2));
    }
    
    private E q(final E[] y, final long n, long k) {
        super.Y = y;
        k = k(n, k);
        final Object m = m(y, k);
        if (m == null) {
            return null;
        }
        v(y, k, null);
        this.t(n + 1L);
        return (E)m;
    }
    
    private void r(final E[] array, final long n, final long n2, final E e, final long n3) {
        final Object[] j = new Object[array.length];
        super.J = j;
        super.H = n3 + n - 1L;
        v(j, n2, e);
        this.w(array, (E[])j);
        v(array, n2, h0.e0);
        this.x(n + 1L);
    }
    
    private void t(final long x) {
        n0.a.putOrderedLong(this, h0.b0, x);
    }
    
    private static void v(final Object[] o, final long offset, final Object x) {
        n0.a.putOrderedObject(o, offset, x);
    }
    
    private void w(final E[] array, final E[] array2) {
        v(array, i(array.length - 1), array2);
    }
    
    private void x(final long x) {
        n0.a.putOrderedLong(this, h0.a0, x);
    }
    
    private boolean z(final E[] array, final E e, final long n, final long n2) {
        v(array, n2, e);
        this.x(n + 1L);
        return true;
    }
    
    @Override
    public long b() {
        return this.o();
    }
    
    @Override
    public long f() {
        return this.l();
    }
    
    @Override
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean offer(final E obj) {
        Objects.requireNonNull(obj, "Null is not a valid element");
        final E[] j = (E[])super.J;
        final long producerIndex = super.producerIndex;
        final long i = super.I;
        final long k = k(producerIndex, i);
        if (producerIndex < super.H) {
            return this.z(j, obj, producerIndex, k);
        }
        final long n = super.G + producerIndex;
        if (m(j, k(n, i)) == null) {
            super.H = n - 1L;
            return this.z(j, obj, producerIndex, k);
        }
        if (m(j, k(1L + producerIndex, i)) != null) {
            return this.z(j, obj, producerIndex, k);
        }
        this.r(j, producerIndex, k, obj, i);
        return true;
    }
    
    @Override
    public final E peek() {
        final E[] y = (E[])super.Y;
        final long consumerIndex = super.consumerIndex;
        final long x = super.X;
        final Object m = m(y, k(consumerIndex, x));
        if (m == h0.e0) {
            return this.p(this.n(y), consumerIndex, x);
        }
        return (E)m;
    }
    
    @Override
    public final E poll() {
        final E[] y = (E[])super.Y;
        final long consumerIndex = super.consumerIndex;
        final long x = super.X;
        final long k = k(consumerIndex, x);
        final Object m = m(y, k);
        final boolean b = m == h0.e0;
        if (m != null && !b) {
            v(y, k, null);
            this.t(consumerIndex + 1L);
            return (E)m;
        }
        if (b) {
            return this.q(this.n(y), consumerIndex, x);
        }
        return null;
    }
    
    @Override
    public final int size() {
        long l = this.l();
        long o;
        long i;
        while (true) {
            o = this.o();
            i = this.l();
            if (l == i) {
                break;
            }
            l = i;
        }
        return (int)(o - i);
    }
}
