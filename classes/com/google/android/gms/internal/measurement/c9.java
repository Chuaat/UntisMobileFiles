// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class c9 extends r7<Float> implements RandomAccess, r9, za
{
    private static final c9 J;
    private float[] H;
    private int I;
    
    static {
        (J = new c9(new float[0], 0)).zzb();
    }
    
    c9() {
        this(new float[10], 0);
    }
    
    private c9(final float[] h, final int i) {
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
    public final boolean addAll(final Collection<? extends Float> collection) {
        this.b();
        s9.e(collection);
        if (!(collection instanceof c9)) {
            return super.addAll(collection);
        }
        final c9 c9 = (c9)collection;
        final int i = c9.I;
        if (i == 0) {
            return false;
        }
        final int j = this.I;
        if (Integer.MAX_VALUE - j >= i) {
            final int n = j + i;
            final float[] h = this.H;
            if (n > h.length) {
                this.H = Arrays.copyOf(h, n);
            }
            System.arraycopy(c9.H, 0, this.H, this.I, c9.I);
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
        if (!(o instanceof c9)) {
            return super.equals(o);
        }
        final c9 c9 = (c9)o;
        if (this.I != c9.I) {
            return false;
        }
        final float[] h = c9.H;
        for (int i = 0; i < this.I; ++i) {
            if (Float.floatToIntBits(this.H[i]) != Float.floatToIntBits(h[i])) {
                return false;
            }
        }
        return true;
    }
    
    public final void f(final float n) {
        this.b();
        final int i = this.I;
        final float[] h = this.H;
        if (i == h.length) {
            final float[] h2 = new float[i * 3 / 2 + 1];
            System.arraycopy(h, 0, h2, 0, i);
            this.H = h2;
        }
        this.H[this.I++] = n;
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
    public final int indexOf(final Object o) {
        if (!(o instanceof Float)) {
            return -1;
        }
        final float floatValue = (float)o;
        for (int i = this.I, j = 0; j < i; ++j) {
            if (this.H[j] == floatValue) {
                return j;
            }
        }
        return -1;
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
