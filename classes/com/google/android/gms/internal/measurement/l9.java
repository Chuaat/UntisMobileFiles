// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class l9 extends r7<Integer> implements RandomAccess, p9, za
{
    private static final l9 J;
    private int[] H;
    private int I;
    
    static {
        (J = new l9(new int[0], 0)).zzb();
    }
    
    l9() {
        this(new int[10], 0);
    }
    
    private l9(final int[] h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    public static l9 h() {
        return l9.J;
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
    
    private final void l(final int n) {
        if (n >= 0 && n < this.I) {
            return;
        }
        throw new IndexOutOfBoundsException(this.k(n));
    }
    
    @Override
    public final boolean addAll(final Collection<? extends Integer> collection) {
        this.b();
        s9.e(collection);
        if (!(collection instanceof l9)) {
            return super.addAll(collection);
        }
        final l9 l9 = (l9)collection;
        final int i = l9.I;
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
            System.arraycopy(l9.H, 0, this.H, this.I, l9.I);
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
        if (!(o instanceof l9)) {
            return super.equals(o);
        }
        final l9 l9 = (l9)o;
        if (this.I != l9.I) {
            return false;
        }
        final int[] h = l9.H;
        for (int i = 0; i < this.I; ++i) {
            if (this.H[i] != h[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final int f(final int n) {
        this.l(n);
        return this.H[n];
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.I; ++i) {
            n = n * 31 + this.H[i];
        }
        return n;
    }
    
    public final void i(final int n) {
        this.b();
        final int i = this.I;
        final int[] h = this.H;
        if (i == h.length) {
            final int[] h2 = new int[i * 3 / 2 + 1];
            System.arraycopy(h, 0, h2, 0, i);
            this.H = h2;
        }
        this.H[this.I++] = n;
    }
    
    @Override
    public final p9 i0(final int newLength) {
        if (newLength >= this.I) {
            return new l9(Arrays.copyOf(this.H, newLength), this.I);
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Integer)) {
            return -1;
        }
        final int intValue = (int)o;
        for (int i = this.I, j = 0; j < i; ++j) {
            if (this.H[j] == intValue) {
                return j;
            }
        }
        return -1;
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
