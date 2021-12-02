// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Collection;
import java.util.Arrays;
import java.util.RandomAccess;

final class a0 extends w<Boolean> implements q1<Boolean>, RandomAccess
{
    private static final a0 J;
    private boolean[] H;
    private int I;
    
    static {
        (J = new a0()).V();
    }
    
    a0() {
        this(new boolean[10], 0);
    }
    
    private a0(final boolean[] h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    private final void h(final int n, final boolean b) {
        this.b();
        if (n >= 0) {
            final int i = this.I;
            if (n <= i) {
                final boolean[] h = this.H;
                if (i < h.length) {
                    System.arraycopy(h, n, h, n + 1, i - n);
                }
                else {
                    final boolean[] h2 = new boolean[i * 3 / 2 + 1];
                    System.arraycopy(h, 0, h2, 0, n);
                    System.arraycopy(this.H, n, h2, n + 1, this.I - n);
                    this.H = h2;
                }
                this.H[n] = b;
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
    public final boolean addAll(final Collection<? extends Boolean> collection) {
        this.b();
        l1.a(collection);
        if (!(collection instanceof a0)) {
            return super.addAll(collection);
        }
        final a0 a0 = (a0)collection;
        final int i = a0.I;
        if (i == 0) {
            return false;
        }
        final int j = this.I;
        if (Integer.MAX_VALUE - j >= i) {
            final int n = j + i;
            final boolean[] h = this.H;
            if (n > h.length) {
                this.H = Arrays.copyOf(h, n);
            }
            System.arraycopy(a0.H, 0, this.H, this.I, a0.I);
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
        if (!(o instanceof a0)) {
            return super.equals(o);
        }
        final a0 a0 = (a0)o;
        if (this.I != a0.I) {
            return false;
        }
        final boolean[] h = a0.H;
        for (int i = 0; i < this.I; ++i) {
            if (this.H[i] != h[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final void f(final boolean b) {
        this.h(this.I, b);
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.I; ++i) {
            n = n * 31 + l1.f(this.H[i]);
        }
        return n;
    }
    
    @Override
    public final boolean remove(final Object o) {
        this.b();
        for (int i = 0; i < this.I; ++i) {
            if (o.equals(this.H[i])) {
                final boolean[] h = this.H;
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
            final boolean[] h = this.H;
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
