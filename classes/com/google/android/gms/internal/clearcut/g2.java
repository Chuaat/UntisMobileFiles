// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Collection;
import java.util.Arrays;
import java.util.RandomAccess;

final class g2 extends w<Long> implements q1<Long>, RandomAccess
{
    private static final g2 J;
    private long[] H;
    private int I;
    
    static {
        (J = new g2()).V();
    }
    
    g2() {
        this(new long[10], 0);
    }
    
    private g2(final long[] h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    public static g2 h() {
        return g2.J;
    }
    
    private final void i(final int n) {
        if (n >= 0 && n < this.I) {
            return;
        }
        throw new IndexOutOfBoundsException(this.k(n));
    }
    
    private final String k(final int i) {
        final int j = this.I;
        final StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(j);
        return sb.toString();
    }
    
    private final void l(final int n, final long n2) {
        this.b();
        if (n >= 0) {
            final int i = this.I;
            if (n <= i) {
                final long[] h = this.H;
                if (i < h.length) {
                    System.arraycopy(h, n, h, n + 1, i - n);
                }
                else {
                    final long[] h2 = new long[i * 3 / 2 + 1];
                    System.arraycopy(h, 0, h2, 0, n);
                    System.arraycopy(this.H, n, h2, n + 1, this.I - n);
                    this.H = h2;
                }
                this.H[n] = n2;
                ++this.I;
                ++super.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.k(n));
    }
    
    @Override
    public final boolean addAll(final Collection<? extends Long> collection) {
        this.b();
        l1.a(collection);
        if (!(collection instanceof g2)) {
            return super.addAll(collection);
        }
        final g2 g2 = (g2)collection;
        final int i = g2.I;
        if (i == 0) {
            return false;
        }
        final int j = this.I;
        if (Integer.MAX_VALUE - j >= i) {
            final int n = j + i;
            final long[] h = this.H;
            if (n > h.length) {
                this.H = Arrays.copyOf(h, n);
            }
            System.arraycopy(g2.H, 0, this.H, this.I, g2.I);
            this.I = n;
            ++super.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g2)) {
            return super.equals(o);
        }
        final g2 g2 = (g2)o;
        if (this.I != g2.I) {
            return false;
        }
        final long[] h = g2.H;
        for (int i = 0; i < this.I; ++i) {
            if (this.H[i] != h[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final long f(final int n) {
        this.i(n);
        return this.H[n];
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.I; ++i) {
            n = n * 31 + l1.j(this.H[i]);
        }
        return n;
    }
    
    public final void m(final long n) {
        this.l(this.I, n);
    }
    
    @Override
    public final boolean remove(final Object o) {
        this.b();
        for (int i = 0; i < this.I; ++i) {
            if (o.equals(this.H[i])) {
                final long[] h = this.H;
                System.arraycopy(h, i + 1, h, i, this.I - i);
                --this.I;
                ++super.modCount;
                return true;
            }
        }
        return false;
    }
    
    @Override
    protected final void removeRange(final int n, final int n2) {
        this.b();
        if (n2 >= n) {
            final long[] h = this.H;
            System.arraycopy(h, n2, h, n, this.I - n2);
            this.I -= n2 - n;
            ++super.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
    
    @Override
    public final int size() {
        return this.I;
    }
}
