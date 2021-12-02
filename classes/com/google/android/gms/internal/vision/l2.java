// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.ListIterator;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;

public abstract class l2<E> extends i2<E> implements List<E>, RandomAccess
{
    private static final g3<Object> H;
    
    static {
        H = new k2<Object>(w2.K, 0);
    }
    
    l2() {
    }
    
    public static <E> l2<E> o(final E e) {
        final Object[] array = { e };
        for (int i = 0; i <= 0; ++i) {
            x2.a(array[0], 0);
        }
        return (l2<E>)q(array, 1);
    }
    
    static <E> l2<E> p(final Object[] array) {
        return q(array, array.length);
    }
    
    static <E> l2<E> q(final Object[] array, final int n) {
        if (n == 0) {
            return (l2<E>)w2.K;
        }
        return new w2<E>(array, n);
    }
    
    public static <E> l2<E> r() {
        return (l2<E>)w2.K;
    }
    
    @Deprecated
    @Override
    public final void add(final int n, final E e) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean addAll(final int n, final Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    int b(final Object[] array, final int n) {
        final int size = this.size();
        for (int i = 0; i < size; ++i) {
            array[n + i] = this.get(i);
        }
        return n + size;
    }
    
    @Override
    public boolean contains(@NullableDecl final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    @Override
    public boolean equals(@NullableDecl final Object o) {
        if (o == k1.b(this)) {
            return true;
        }
        if (o instanceof List) {
            final List list = (List)o;
            final int size = this.size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; ++i) {
                        if (!e1.a(this.get(i), list.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
                final int size2 = this.size();
                final Iterator<Object> iterator = list.iterator();
                int j = 0;
                while (j < size2) {
                    if (!iterator.hasNext()) {
                        return false;
                    }
                    final E value = this.get(j);
                    ++j;
                    if (e1.a(value, iterator.next())) {
                        continue;
                    }
                    return false;
                }
                if (!iterator.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final i3<E> f() {
        return (i3<E>)this.listIterator();
    }
    
    @Override
    public int hashCode() {
        final int size = this.size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = ~(~(n * 31 + this.get(i).hashCode()));
        }
        return n;
    }
    
    @Override
    public int indexOf(@NullableDecl final Object o) {
        if (o == null) {
            return -1;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (o.equals(this.get(i))) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public final l2<E> l() {
        return this;
    }
    
    @Override
    public int lastIndexOf(@NullableDecl final Object o) {
        if (o == null) {
            return -1;
        }
        for (int i = this.size() - 1; i >= 0; --i) {
            if (o.equals(this.get(i))) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public /* synthetic */ ListIterator listIterator() {
        return this.listIterator(0);
    }
    
    @Override
    public /* synthetic */ ListIterator listIterator(final int n) {
        k1.g(n, this.size());
        if (this.isEmpty()) {
            return l2.H;
        }
        return new k2(this, n);
    }
    
    public l2<E> n(final int n, int n2) {
        k1.e(n, n2, this.size());
        n2 -= n;
        if (n2 == this.size()) {
            return this;
        }
        if (n2 == 0) {
            return (l2<E>)w2.K;
        }
        return (l2<E>)new n2(this, n, n2);
    }
    
    @Deprecated
    @Override
    public final E remove(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final E set(final int n, final E e) {
        throw new UnsupportedOperationException();
    }
}
