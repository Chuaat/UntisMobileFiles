// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class d5 extends v4<Boolean> implements z6<Boolean>, l8, RandomAccess
{
    private static final d5 J;
    private boolean[] H;
    private int I;
    
    static {
        (J = new d5(new boolean[0], 0)).zzb();
    }
    
    d5() {
        this(new boolean[10], 0);
    }
    
    private d5(final boolean[] h, final int i) {
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
    public final boolean addAll(final Collection<? extends Boolean> collection) {
        this.b();
        t6.d(collection);
        if (!(collection instanceof d5)) {
            return super.addAll(collection);
        }
        final d5 d5 = (d5)collection;
        final int i = d5.I;
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
            System.arraycopy(d5.H, 0, this.H, this.I, d5.I);
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
        if (!(o instanceof d5)) {
            return super.equals(o);
        }
        final d5 d5 = (d5)o;
        if (this.I != d5.I) {
            return false;
        }
        final boolean[] h = d5.H;
        for (int i = 0; i < this.I; ++i) {
            if (this.H[i] != h[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final void f(final boolean b) {
        this.b();
        final int i = this.I;
        final boolean[] h = this.H;
        if (i == h.length) {
            final boolean[] h2 = new boolean[i * 3 / 2 + 1];
            System.arraycopy(h, 0, h2, 0, i);
            this.H = h2;
        }
        this.H[this.I++] = b;
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.I; ++i) {
            n = n * 31 + t6.c(this.H[i]);
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Boolean)) {
            return -1;
        }
        final boolean booleanValue = (boolean)o;
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.H[i] == booleanValue) {
                return i;
            }
        }
        return -1;
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
