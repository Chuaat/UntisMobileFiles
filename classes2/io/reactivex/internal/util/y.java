// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class y<T> extends AtomicInteger implements List<T>, RandomAccess
{
    private static final long H = 3972397474470203923L;
    final ArrayList<T> G;
    
    public y() {
        this.G = new ArrayList<T>();
    }
    
    public y(final int initialCapacity) {
        this.G = new ArrayList<T>(initialCapacity);
    }
    
    @Override
    public void add(final int index, final T element) {
        this.G.add(index, element);
        this.lazySet(this.G.size());
    }
    
    @Override
    public boolean add(final T e) {
        final boolean add = this.G.add(e);
        this.lazySet(this.G.size());
        return add;
    }
    
    @Override
    public boolean addAll(final int index, final Collection<? extends T> c) {
        final boolean addAll = this.G.addAll(index, c);
        this.lazySet(this.G.size());
        return addAll;
    }
    
    @Override
    public boolean addAll(final Collection<? extends T> c) {
        final boolean addAll = this.G.addAll(c);
        this.lazySet(this.G.size());
        return addAll;
    }
    
    @Override
    public void clear() {
        this.G.clear();
        this.lazySet(0);
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.G.contains(o);
    }
    
    @Override
    public boolean containsAll(final Collection<?> c) {
        return this.G.containsAll(c);
    }
    
    @Override
    public boolean equals(Object g) {
        ArrayList<T> list;
        if (g instanceof y) {
            list = this.G;
            g = ((y)g).G;
        }
        else {
            list = this.G;
        }
        return list.equals(g);
    }
    
    @Override
    public T get(final int index) {
        return this.G.get(index);
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode();
    }
    
    @Override
    public int indexOf(final Object o) {
        return this.G.indexOf(o);
    }
    
    @Override
    public boolean isEmpty() {
        return this.get() == 0;
    }
    
    @Override
    public Iterator<T> iterator() {
        return this.G.iterator();
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        return this.G.lastIndexOf(o);
    }
    
    @Override
    public ListIterator<T> listIterator() {
        return this.G.listIterator();
    }
    
    @Override
    public ListIterator<T> listIterator(final int index) {
        return this.G.listIterator(index);
    }
    
    @Override
    public T remove(final int index) {
        final T remove = this.G.remove(index);
        this.lazySet(this.G.size());
        return remove;
    }
    
    @Override
    public boolean remove(final Object o) {
        final boolean remove = this.G.remove(o);
        this.lazySet(this.G.size());
        return remove;
    }
    
    @Override
    public boolean removeAll(final Collection<?> c) {
        final boolean removeAll = this.G.removeAll(c);
        this.lazySet(this.G.size());
        return removeAll;
    }
    
    @Override
    public boolean retainAll(final Collection<?> c) {
        final boolean retainAll = this.G.retainAll(c);
        this.lazySet(this.G.size());
        return retainAll;
    }
    
    @Override
    public T set(final int index, final T element) {
        return this.G.set(index, element);
    }
    
    @Override
    public int size() {
        return this.get();
    }
    
    @Override
    public List<T> subList(final int fromIndex, final int toIndex) {
        return this.G.subList(fromIndex, toIndex);
    }
    
    @Override
    public Object[] toArray() {
        return this.G.toArray();
    }
    
    @Override
    public <E> E[] toArray(final E[] a) {
        return this.G.toArray(a);
    }
    
    @Override
    public String toString() {
        return this.G.toString();
    }
}
