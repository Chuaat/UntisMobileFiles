// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

final class bb<E> extends r7<E> implements RandomAccess
{
    private static final bb<Object> J;
    private E[] H;
    private int I;
    
    static {
        (J = new bb<Object>(new Object[0], 0)).zzb();
    }
    
    bb() {
        this(new Object[10], 0);
    }
    
    private bb(final E[] h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    public static <E> bb<E> f() {
        return (bb<E>)bb.J;
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
    public final void add(final int n, final E e) {
        this.b();
        if (n >= 0) {
            final int i = this.I;
            if (n <= i) {
                final E[] h = this.H;
                if (i < h.length) {
                    System.arraycopy(h, n, h, n + 1, i - n);
                }
                else {
                    final Object[] h2 = new Object[i * 3 / 2 + 1];
                    System.arraycopy(h, 0, h2, 0, n);
                    System.arraycopy(this.H, n, h2, n + 1, this.I - n);
                    this.H = (E[])h2;
                }
                this.H[n] = e;
                ++this.I;
                ++super.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.h(n));
    }
    
    @Override
    public final boolean add(final E e) {
        this.b();
        final int i = this.I;
        final E[] h = this.H;
        if (i == h.length) {
            this.H = Arrays.copyOf(h, i * 3 / 2 + 1);
        }
        this.H[this.I++] = e;
        ++super.modCount;
        return true;
    }
    
    @Override
    public final E get(final int n) {
        this.i(n);
        return this.H[n];
    }
    
    @Override
    public final E remove(final int n) {
        this.b();
        this.i(n);
        final E[] h = this.H;
        final E e = h[n];
        final int i = this.I;
        if (n < i - 1) {
            System.arraycopy(h, n + 1, h, n, i - n - 1);
        }
        --this.I;
        ++super.modCount;
        return e;
    }
    
    @Override
    public final E set(final int n, final E e) {
        this.b();
        this.i(n);
        final E[] h = this.H;
        final E e2 = h[n];
        h[n] = e;
        ++super.modCount;
        return e2;
    }
    
    @Override
    public final int size() {
        return this.I;
    }
}
