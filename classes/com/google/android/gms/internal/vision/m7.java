// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class m7 extends v4<Long> implements z6<Long>, l8, RandomAccess
{
    private static final m7 J;
    private long[] H;
    private int I;
    
    static {
        (J = new m7(new long[0], 0)).zzb();
    }
    
    m7() {
        this(new long[10], 0);
    }
    
    private m7(final long[] h, final int i) {
        this.H = h;
        this.I = i;
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
    public final boolean addAll(final Collection<? extends Long> collection) {
        this.b();
        t6.d(collection);
        if (!(collection instanceof m7)) {
            return super.addAll(collection);
        }
        final m7 m7 = (m7)collection;
        final int i = m7.I;
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
            System.arraycopy(m7.H, 0, this.H, this.I, m7.I);
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
        if (!(o instanceof m7)) {
            return super.equals(o);
        }
        final m7 m7 = (m7)o;
        if (this.I != m7.I) {
            return false;
        }
        final long[] h = m7.H;
        for (int i = 0; i < this.I; ++i) {
            if (this.H[i] != h[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final void f(final long n) {
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
    
    public final long h(final int n) {
        this.i(n);
        return this.H[n];
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.I; ++i) {
            n = n * 31 + t6.b(this.H[i]);
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Long)) {
            return -1;
        }
        final long longValue = (long)o;
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.H[i] == longValue) {
                return i;
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
