// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Collection;
import java.util.Arrays;
import java.util.RandomAccess;

final class k1 extends w<Integer> implements q1<Integer>, RandomAccess
{
    private static final k1 J;
    private int[] H;
    private int I;
    
    static {
        (J = new k1()).V();
    }
    
    k1() {
        this(new int[10], 0);
    }
    
    private k1(final int[] h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    public static k1 i() {
        return k1.J;
    }
    
    private final void k(final int n) {
        if (n >= 0 && n < this.I) {
            return;
        }
        throw new IndexOutOfBoundsException(this.l(n));
    }
    
    private final String l(final int i) {
        final int j = this.I;
        final StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(j);
        return sb.toString();
    }
    
    private final void m(final int n, final int n2) {
        this.b();
        if (n >= 0) {
            final int i = this.I;
            if (n <= i) {
                final int[] h = this.H;
                if (i < h.length) {
                    System.arraycopy(h, n, h, n + 1, i - n);
                }
                else {
                    final int[] h2 = new int[i * 3 / 2 + 1];
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
        throw new IndexOutOfBoundsException(this.l(n));
    }
    
    @Override
    public final boolean addAll(final Collection<? extends Integer> collection) {
        this.b();
        l1.a(collection);
        if (!(collection instanceof k1)) {
            return super.addAll(collection);
        }
        final k1 k1 = (k1)collection;
        final int i = k1.I;
        if (i == 0) {
            return false;
        }
        final int j = this.I;
        if (Integer.MAX_VALUE - j >= i) {
            final int n = j + i;
            final int[] h = this.H;
            if (n > h.length) {
                this.H = Arrays.copyOf(h, n);
            }
            System.arraycopy(k1.H, 0, this.H, this.I, k1.I);
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
        if (!(o instanceof k1)) {
            return super.equals(o);
        }
        final k1 k1 = (k1)o;
        if (this.I != k1.I) {
            return false;
        }
        final int[] h = k1.H;
        for (int i = 0; i < this.I; ++i) {
            if (this.H[i] != h[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final int f(final int n) {
        this.k(n);
        return this.H[n];
    }
    
    public final void h(final int n) {
        this.m(this.I, n);
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.I; ++i) {
            n = n * 31 + this.H[i];
        }
        return n;
    }
    
    @Override
    public final boolean remove(final Object o) {
        this.b();
        for (int i = 0; i < this.I; ++i) {
            if (o.equals(this.H[i])) {
                final int[] h = this.H;
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
            final int[] h = this.H;
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
