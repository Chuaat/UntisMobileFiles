// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class s8 extends r7<Double> implements RandomAccess, r9, za
{
    private static final s8 J;
    private double[] H;
    private int I;
    
    static {
        (J = new s8(new double[0], 0)).zzb();
    }
    
    s8() {
        this(new double[10], 0);
    }
    
    private s8(final double[] h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    private final String h(final int i) {
        final int j = this.I;
        final StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(j);
        return sb.toString();
    }
    
    private final void i(final int n) {
        if (n >= 0 && n < this.I) {
            return;
        }
        throw new IndexOutOfBoundsException(this.h(n));
    }
    
    @Override
    public final boolean addAll(final Collection<? extends Double> collection) {
        this.b();
        s9.e(collection);
        if (!(collection instanceof s8)) {
            return super.addAll(collection);
        }
        final s8 s8 = (s8)collection;
        final int i = s8.I;
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
            System.arraycopy(s8.H, 0, this.H, this.I, s8.I);
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
        if (!(o instanceof s8)) {
            return super.equals(o);
        }
        final s8 s8 = (s8)o;
        if (this.I != s8.I) {
            return false;
        }
        final double[] h = s8.H;
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
            n = n * 31 + s9.c(Double.doubleToLongBits(this.H[i]));
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Double)) {
            return -1;
        }
        final double doubleValue = (double)o;
        for (int i = this.I, j = 0; j < i; ++j) {
            if (this.H[j] == doubleValue) {
                return j;
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
