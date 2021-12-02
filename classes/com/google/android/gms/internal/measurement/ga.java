// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Collection;
import java.util.Arrays;
import java.util.RandomAccess;

final class ga extends r7<Long> implements RandomAccess, q9, za
{
    private static final ga J;
    private long[] H;
    private int I;
    
    static {
        (J = new ga(new long[0], 0)).zzb();
    }
    
    ga() {
        this(new long[10], 0);
    }
    
    private ga(final long[] h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    public static ga f() {
        return ga.J;
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
    
    private final void k(final int n) {
        if (n >= 0 && n < this.I) {
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n));
    }
    
    @Override
    public final q9 W0(final int newLength) {
        if (newLength >= this.I) {
            return new ga(Arrays.copyOf(this.H, newLength), this.I);
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public final boolean addAll(final Collection<? extends Long> collection) {
        this.b();
        s9.e(collection);
        if (!(collection instanceof ga)) {
            return super.addAll(collection);
        }
        final ga ga = (ga)collection;
        final int i = ga.I;
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
            System.arraycopy(ga.H, 0, this.H, this.I, ga.I);
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
    public final long d(final int n) {
        this.k(n);
        return this.H[n];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ga)) {
            return super.equals(o);
        }
        final ga ga = (ga)o;
        if (this.I != ga.I) {
            return false;
        }
        final long[] h = ga.H;
        for (int i = 0; i < this.I; ++i) {
            if (this.H[i] != h[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final void h(final long n) {
        this.b();
        final int i = this.I;
        final long[] h = this.H;
        if (i == h.length) {
            final long[] h2 = new long[i * 3 / 2 + 1];
            System.arraycopy(h, 0, h2, 0, i);
            this.H = h2;
        }
        this.H[this.I++] = n;
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.I; ++i) {
            n = n * 31 + s9.c(this.H[i]);
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Long)) {
            return -1;
        }
        final long longValue = (long)o;
        for (int i = this.I, j = 0; j < i; ++j) {
            if (this.H[j] == longValue) {
                return j;
            }
        }
        return -1;
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
