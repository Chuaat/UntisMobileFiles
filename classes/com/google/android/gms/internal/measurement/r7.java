// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.RandomAccess;
import java.util.List;
import java.util.Collection;
import java.util.AbstractList;

abstract class r7<E> extends AbstractList<E> implements r9<E>
{
    private boolean G;
    
    r7() {
        this.G = true;
    }
    
    @Override
    public final boolean a() {
        return this.G;
    }
    
    @Override
    public void add(final int index, final E element) {
        this.b();
        super.add(index, element);
    }
    
    @Override
    public boolean add(final E e) {
        this.b();
        return super.add(e);
    }
    
    @Override
    public boolean addAll(final int index, final Collection<? extends E> c) {
        this.b();
        return super.addAll(index, c);
    }
    
    @Override
    public boolean addAll(final Collection<? extends E> c) {
        this.b();
        return super.addAll(c);
    }
    
    protected final void b() {
        if (this.G) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void clear() {
        this.b();
        super.clear();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        if (!(o instanceof RandomAccess)) {
            return super.equals(o);
        }
        final List list = (List)o;
        final int size = this.size();
        if (size == list.size()) {
            for (int i = 0; i < size; ++i) {
                if (!this.get(i).equals(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int size = this.size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = n * 31 + this.get(i).hashCode();
        }
        return n;
    }
    
    @Override
    public E remove(final int index) {
        this.b();
        return super.remove(index);
    }
    
    @Override
    public final boolean remove(final Object o) {
        this.b();
        final int index = this.indexOf(o);
        if (index == -1) {
            return false;
        }
        this.remove(index);
        return true;
    }
    
    @Override
    public final boolean removeAll(final Collection<?> c) {
        this.b();
        return super.removeAll(c);
    }
    
    @Override
    public final boolean retainAll(final Collection<?> c) {
        this.b();
        return super.retainAll(c);
    }
    
    @Override
    public E set(final int index, final E element) {
        this.b();
        return super.set(index, element);
    }
    
    @Override
    public final void zzb() {
        this.G = false;
    }
}
