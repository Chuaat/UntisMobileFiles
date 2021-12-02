// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class r6 extends v4<Integer> implements z6<Integer>, l8, RandomAccess
{
    private static final r6 J;
    private int[] H;
    private int I;
    
    static {
        (J = new r6(new int[0], 0)).zzb();
    }
    
    r6() {
        this(new int[10], 0);
    }
    
    private r6(final int[] h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    public static r6 i() {
        return r6.J;
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
    
    @Override
    public final boolean addAll(final Collection<? extends Integer> collection) {
        this.b();
        t6.d(collection);
        if (!(collection instanceof r6)) {
            return super.addAll(collection);
        }
        final r6 r6 = (r6)collection;
        final int i = r6.I;
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
            System.arraycopy(r6.H, 0, this.H, this.I, r6.I);
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
        if (!(o instanceof r6)) {
            return super.equals(o);
        }
        final r6 r6 = (r6)o;
        if (this.I != r6.I) {
            return false;
        }
        final int[] h = r6.H;
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
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.I; ++i) {
            n = n * 31 + this.H[i];
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Integer)) {
            return -1;
        }
        final int intValue = (int)o;
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.H[i] == intValue) {
                return i;
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
