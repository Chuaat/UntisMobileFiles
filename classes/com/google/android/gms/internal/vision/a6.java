// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class a6 extends v4<Double> implements z6<Double>, l8, RandomAccess
{
    private static final a6 J;
    private double[] H;
    private int I;
    
    static {
        (J = new a6(new double[0], 0)).zzb();
    }
    
    a6() {
        this(new double[10], 0);
    }
    
    private a6(final double[] h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    private final void h(final int n) {
        if (n >= 0 && n < this.I) {
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n));
    }
    
    private final String i(final int i) {
        final int j = this.I;
        final StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(j);
        return sb.toString();
    }
    
    @Override
    public final boolean addAll(final Collection<? extends Double> collection) {
        this.b();
        t6.d(collection);
        if (!(collection instanceof a6)) {
            return super.addAll(collection);
        }
        final a6 a6 = (a6)collection;
        final int i = a6.I;
        if (i == 0) {
            return false;
        }
        final int j = this.I;
        if (Integer.MAX_VALUE - j >= i) {
            final int n = j + i;
            final double[] h = this.H;
            if (n > h.length) {
                this.H = Arrays.copyOf(h, n);
            }
            System.arraycopy(a6.H, 0, this.H, this.I, a6.I);
            this.I = n;
            ++super.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a6)) {
            return super.equals(o);
        }
        final a6 a6 = (a6)o;
        if (this.I != a6.I) {
            return false;
        }
        final double[] h = a6.H;
        for (int i = 0; i < this.I; ++i) {
            if (Double.doubleToLongBits(this.H[i]) != Double.doubleToLongBits(h[i])) {
                return false;
            }
        }
        return true;
    }
    
    public final void f(final double n) {
        this.b();
        final int i = this.I;
        final double[] h = this.H;
        if (i == h.length) {
            final double[] h2 = new double[i * 3 / 2 + 1];
            System.arraycopy(h, 0, h2, 0, i);
            this.H = h2;
        }
        this.H[this.I++] = n;
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.I; ++i) {
            n = n * 31 + t6.b(Double.doubleToLongBits(this.H[i]));
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Double)) {
            return -1;
        }
        final double doubleValue = (double)o;
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.H[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    protected final void removeRange(final int n, final int n2) {
        this.b();
        if (n2 >= n) {
            final double[] h = this.H;
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
