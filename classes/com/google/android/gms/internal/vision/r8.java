// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.RandomAccess;

final class r8<E> extends v4<E> implements RandomAccess
{
    private static final r8<Object> J;
    private E[] H;
    private int I;
    
    static {
        (J = new r8<Object>(new Object[0], 0)).zzb();
    }
    
    r8() {
        this(new Object[10], 0);
    }
    
    private r8(final E[] h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    private final void f(final int n) {
        if (n >= 0 && n < this.I) {
            return;
        }
        throw new IndexOutOfBoundsException(this.h(n));
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
    
    public static <E> r8<E> i() {
        return (r8<E>)r8.J;
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
        this.f(n);
        return this.H[n];
    }
    
    @Override
    public final E remove(final int n) {
        this.b();
        this.f(n);
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
        this.f(n);
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
