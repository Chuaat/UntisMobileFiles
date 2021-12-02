// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class o6 extends v4<Float> implements z6<Float>, l8, RandomAccess
{
    private static final o6 J;
    private float[] H;
    private int I;
    
    static {
        (J = new o6(new float[0], 0)).zzb();
    }
    
    o6() {
        this(new float[10], 0);
    }
    
    private o6(final float[] h, final int i) {
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
    public final boolean addAll(final Collection<? extends Float> collection) {
        this.b();
        t6.d(collection);
        if (!(collection instanceof o6)) {
            return super.addAll(collection);
        }
        final o6 o6 = (o6)collection;
        final int i = o6.I;
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
            System.arraycopy(o6.H, 0, this.H, this.I, o6.I);
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
        if (!(o instanceof o6)) {
            return super.equals(o);
        }
        final o6 o2 = (o6)o;
        if (this.I != o2.I) {
            return false;
        }
        final float[] h = o2.H;
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
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.H[i] == floatValue) {
                return i;
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
