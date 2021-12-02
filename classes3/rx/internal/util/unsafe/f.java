// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

import java.util.Iterator;
import sun.misc.Unsafe;
import rx.internal.util.r;

@r
public abstract class f<E> extends g<E>
{
    protected static final int Y;
    protected static final int Z = 32;
    private static final long a0;
    private static final int b0;
    protected final long W;
    protected final E[] X;
    
    static {
        final int n = Y = Integer.getInteger("sparse.shift", 0);
        final Unsafe a = n0.a;
        final int arrayIndexScale = a.arrayIndexScale(Object[].class);
        int b;
        if (4 == arrayIndexScale) {
            b = n + 2;
        }
        else {
            if (8 != arrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            b = n + 3;
        }
        b0 = b;
        a0 = a.arrayBaseOffset(Object[].class) + (32 << f.b0 - n);
    }
    
    public f(int b) {
        b = p.b(b);
        this.W = b - 1;
        this.X = (E[])new Object[(b << f.Y) + 64];
    }
    
    protected final long b(final long n) {
        return this.f(n, this.W);
    }
    
    @Override
    public void clear() {
        while (true) {
            if (this.poll() == null) {
                if (!this.isEmpty()) {
                    continue;
                }
                break;
            }
        }
    }
    
    protected final long f(final long n, final long n2) {
        return f.a0 + ((n & n2) << f.b0);
    }
    
    protected final E h(final long n) {
        return this.i(this.X, n);
    }
    
    protected final E i(final E[] o, final long offset) {
        return (E)n0.a.getObject(o, offset);
    }
    
    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
    
    protected final E k(final long n) {
        return this.l(this.X, n);
    }
    
    protected final E l(final E[] o, final long offset) {
        return (E)n0.a.getObjectVolatile(o, offset);
    }
    
    protected final void m(final long n, final E e) {
        this.n(this.X, n, e);
    }
    
    protected final void n(final E[] o, final long offset, final E x) {
        n0.a.putOrderedObject(o, offset, x);
    }
    
    protected final void o(final long n, final E e) {
        this.p(this.X, n, e);
    }
    
    protected final void p(final E[] o, final long offset, final E x) {
        n0.a.putObject(o, offset, x);
    }
}
