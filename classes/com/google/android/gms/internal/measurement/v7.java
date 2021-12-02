// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class v7 extends r7<Boolean> implements RandomAccess, r9, za
{
    private static final v7 J;
    private boolean[] H;
    private int I;
    
    static {
        (J = new v7(new boolean[0], 0)).zzb();
    }
    
    v7() {
        this(new boolean[10], 0);
    }
    
    private v7(final boolean[] h, final int i) {
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
    public final boolean addAll(final Collection<? extends Boolean> collection) {
        this.b();
        s9.e(collection);
        if (!(collection instanceof v7)) {
            return super.addAll(collection);
        }
        final v7 v7 = (v7)collection;
        final int i = v7.I;
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
            System.arraycopy(v7.H, 0, this.H, this.I, v7.I);
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
        if (!(o instanceof v7)) {
            return super.equals(o);
        }
        final v7 v7 = (v7)o;
        if (this.I != v7.I) {
            return false;
        }
        final boolean[] h = v7.H;
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
            n = n * 31 + s9.a(this.H[i]);
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Boolean)) {
            return -1;
        }
        final boolean booleanValue = (boolean)o;
        for (int i = this.I, j = 0; j < i; ++j) {
            if (this.H[j] == booleanValue) {
                return j;
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
