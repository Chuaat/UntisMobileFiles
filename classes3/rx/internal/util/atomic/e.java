// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.Objects;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

public final class e<E> extends a<E>
{
    private static final Integer M;
    final AtomicLong I;
    long J;
    final AtomicLong K;
    final int L;
    
    static {
        M = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    }
    
    public e(final int n) {
        super(n);
        this.I = new AtomicLong();
        this.K = new AtomicLong();
        this.L = Math.min(n / 4, e.M);
    }
    
    private long r() {
        return this.K.get();
    }
    
    private long t() {
        return this.I.get();
    }
    
    private void v(final long newValue) {
        this.K.lazySet(newValue);
    }
    
    private void w(final long newValue) {
        this.I.lazySet(newValue);
    }
    
    @Override
    public boolean isEmpty() {
        return this.t() == this.r();
    }
    
    @Override
    public boolean offer(final E obj) {
        Objects.requireNonNull(obj, "Null is not a valid element");
        final AtomicReferenceArray<E> g = (AtomicReferenceArray<E>)super.G;
        final int h = super.H;
        final long value = this.I.get();
        final int f = this.f(value, h);
        if (value >= this.J) {
            final long j = this.L + value;
            if (this.l(g, this.f(j, h)) == null) {
                this.J = j;
            }
            else if (this.l(g, f) != null) {
                return false;
            }
        }
        this.n(g, f, obj);
        this.w(value + 1L);
        return true;
    }
    
    @Override
    public E peek() {
        return this.k(this.b(this.K.get()));
    }
    
    @Override
    public E poll() {
        final long value = this.K.get();
        final int b = this.b(value);
        final AtomicReferenceArray<E> g = (AtomicReferenceArray<E>)super.G;
        final E l = this.l(g, b);
        if (l == null) {
            return null;
        }
        this.n(g, b, null);
        this.v(value + 1L);
        return l;
    }
    
    @Override
    public int size() {
        long r = this.r();
        long t;
        long r2;
        while (true) {
            t = this.t();
            r2 = this.r();
            if (r == r2) {
                break;
            }
            r = r2;
        }
        return (int)(t - r2);
    }
}
