// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Iterator;
import java.util.Collection;
import java.io.Serializable;
import java.util.AbstractCollection;

public abstract class m<E> extends AbstractCollection<E> implements Serializable
{
    private static final Object[] G;
    
    static {
        G = new Object[0];
    }
    
    m() {
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
    
    int b(final Object[] array, final int n) {
        throw null;
    }
    
    @Deprecated
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    int f() {
        throw null;
    }
    
    int h() {
        throw null;
    }
    
    public abstract r<E> i();
    
    @NullableDecl
    Object[] k() {
        throw null;
    }
    
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
        return this.toArray(m.G);
    }
    
    @Override
    public final <T> T[] toArray(final T[] obj) {
        Objects.requireNonNull(obj);
        final int size = this.size();
        final int length = obj.length;
        Object[] array;
        if (length < size) {
            final Object[] k = this.k();
            if (k != null) {
                return (T[])Arrays.copyOfRange(k, this.h(), this.f(), obj.getClass());
            }
            array = (Object[])Array.newInstance(obj.getClass().getComponentType(), size);
        }
        else {
            array = obj;
            if (length > size) {
                obj[size] = null;
                array = obj;
            }
        }
        this.b(array, 0);
        return (T[])array;
    }
}
