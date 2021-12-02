// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Collection;
import java.util.Arrays;
import java.util.RandomAccess;

final class h1 extends w<Float> implements q1<Float>, RandomAccess
{
    private static final h1 J;
    private float[] H;
    private int I;
    
    static {
        (J = new h1()).V();
    }
    
    h1() {
        this(new float[10], 0);
    }
    
    private h1(final float[] h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    private final void h(final int n, final float n2) {
        this.b();
        if (n >= 0) {
            final int i = this.I;
            if (n <= i) {
                final float[] h = this.H;
                if (i < h.length) {
                    System.arraycopy(h, n, h, n + 1, i - n);
                }
                else {
                    final float[] h2 = new float[i * 3 / 2 + 1];
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
    
    @Override
    public final boolean addAll(final Collection<? extends Float> collection) {
        this.b();
        l1.a(collection);
        if (!(collection instanceof h1)) {
            return super.addAll(collection);
        }
        final h1 h1 = (h1)collection;
        final int i = h1.I;
        if (i == 0) {
            return false;
        }
        final int j = this.I;
        if (Integer.MAX_VALUE - j >= i) {
            final int n = j + i;
            final float[] h2 = this.H;
            if (n > h2.length) {
                this.H = Arrays.copyOf(h2, n);
            }
            System.arraycopy(h1.H, 0, this.H, this.I, h1.I);
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
        if (!(o instanceof h1)) {
            return super.equals(o);
        }
        final h1 h1 = (h1)o;
        if (this.I != h1.I) {
            return false;
        }
        final float[] h2 = h1.H;
        for (int i = 0; i < this.I; ++i) {
            if (this.H[i] != h2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final void f(final float n) {
        this.h(this.I, n);
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.I; ++i) {
            n = n * 31 + Float.floatToIntBits(this.H[i]);
        }
        return n;
    }
    
    @Override
    public final boolean remove(final Object o) {
        this.b();
        for (int i = 0; i < this.I; ++i) {
            if (o.equals(this.H[i])) {
                final float[] h = this.H;
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
            final float[] h = this.H;
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
