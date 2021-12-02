// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Collection;
import java.io.Serializable;
import java.util.AbstractCollection;

public abstract class i2<E> extends AbstractCollection<E> implements Serializable
{
    private static final Object[] G;
    
    static {
        G = new Object[0];
    }
    
    i2() {
    }
    
    @Deprecated
    @Override
    public final boolean add(final E e) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean addAll(final Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }
    
    int b(final Object[] array, int n) {
        final i3 i3 = (i3)this.iterator();
        while (i3.hasNext()) {
            array[n] = i3.next();
            ++n;
        }
        return n;
    }
    
    @Deprecated
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public abstract boolean contains(@NullableDecl final Object p0);
    
    public abstract i3<E> f();
    
    @NullableDecl
    Object[] h() {
        return null;
    }
    
    int i() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public /* synthetic */ Iterator iterator() {
        return this.f();
    }
    
    int k() {
        throw new UnsupportedOperationException();
    }
    
    public l2<E> l() {
        if (this.isEmpty()) {
            return l2.r();
        }
        return l2.p(this.toArray());
    }
    
    abstract boolean m();
    
    @Deprecated
    @Override
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object[] toArray() {
        return this.toArray(i2.G);
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        k1.b(array);
        final int size = this.size();
        Object[] array2;
        if (array.length < size) {
            final Object[] h = this.h();
            if (h != null) {
                return (T[])Arrays.copyOfRange(h, this.i(), this.k(), array.getClass());
            }
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), size);
        }
        else {
            array2 = array;
            if (array.length > size) {
                array[size] = null;
                array2 = array;
            }
        }
        this.b(array2, 0);
        return (T[])array2;
    }
}
