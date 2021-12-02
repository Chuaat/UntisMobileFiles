// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;

public abstract class p<E> extends m<E> implements List<E>, RandomAccess
{
    private static final s<Object> H;
    
    static {
        H = new n<Object>(q.J, 0);
    }
    
    p() {
    }
    
    public static <E> p<E> m() {
        return (p<E>)q.J;
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
    int b(final Object[] array, int i) {
        int size;
        for (size = this.size(), i = 0; i < size; ++i) {
            array[i] = this.get(i);
        }
        return size;
    }
    
    @Override
    public final boolean contains(@NullableDecl final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    @Override
    public final boolean equals(@NullableDecl final Object o) {
        final boolean b = true;
        boolean b2;
        if (o == this) {
            b2 = b;
        }
        else {
            Label_0019: {
                if (o instanceof List) {
                    final List list = (List)o;
                    final int size = this.size();
                    if (size == list.size()) {
                        if (list instanceof RandomAccess) {
                            int n = 0;
                            while (true) {
                                b2 = b;
                                if (n >= size) {
                                    return b2;
                                }
                                if (!i.a(this.get(n), list.get(n))) {
                                    break;
                                }
                                ++n;
                            }
                        }
                        else {
                            final Iterator<Object> iterator = this.iterator();
                            final Iterator<Object> iterator2 = list.iterator();
                            while (iterator.hasNext()) {
                                if (!iterator2.hasNext()) {
                                    break Label_0019;
                                }
                                if (!i.a(iterator.next(), iterator2.next())) {
                                    break Label_0019;
                                }
                            }
                            if (!iterator2.hasNext()) {
                                b2 = b;
                                return b2;
                            }
                        }
                    }
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        final int size = this.size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = n * 31 + this.get(i).hashCode();
        }
        return n;
    }
    
    @Override
    public final r<E> i() {
        return this.n(0);
    }
    
    @Override
    public final int indexOf(@NullableDecl final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        final int size = this.size();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= size) {
                break;
            }
            if (o.equals(this.get(n2))) {
                n3 = n2;
                break;
            }
            ++n2;
        }
        return n3;
    }
    
    public p<E> l(final int n, int n2) {
        j.c(n, n2, this.size());
        n2 -= n;
        if (n2 == this.size()) {
            return this;
        }
        if (n2 == 0) {
            return (p<E>)q.J;
        }
        return (p<E>)new o(this, n, n2);
    }
    
    @Override
    public final int lastIndexOf(@NullableDecl final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        int n2 = this.size() - 1;
        int n3;
        while (true) {
            n3 = n;
            if (n2 < 0) {
                break;
            }
            if (o.equals(this.get(n2))) {
                n3 = n2;
                break;
            }
            --n2;
        }
        return n3;
    }
    
    public final s<E> n(final int n) {
        j.b(n, this.size(), "index");
        if (this.isEmpty()) {
            return (s<E>)p.H;
        }
        return new n<E>(this, n);
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
