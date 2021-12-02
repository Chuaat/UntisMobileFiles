// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.ListIterator;
import java.util.Iterator;
import androidx.annotation.k0;
import java.util.Collection;
import java.util.Arrays;
import androidx.annotation.j0;
import java.util.Collections;
import java.util.RandomAccess;
import java.util.List;

public final class b0<E> implements List<E>, RandomAccess
{
    private final List<E> G;
    
    private b0(final List<E> list) {
        this.G = Collections.unmodifiableList((List<? extends E>)list);
    }
    
    @j0
    public static <E> b0<E> b(@j0 final List<E> list) {
        return new b0<E>(list);
    }
    
    @j0
    public static <E> b0<E> f(final E... a) {
        return new b0<E>(Arrays.asList(a));
    }
    
    @Override
    public void add(final int n, @j0 final E e) {
        this.G.add(n, e);
    }
    
    @Override
    public boolean add(@j0 final E e) {
        return this.G.add(e);
    }
    
    @Override
    public boolean addAll(final int n, @j0 final Collection<? extends E> collection) {
        return this.G.addAll(n, collection);
    }
    
    @Override
    public boolean addAll(@j0 final Collection<? extends E> collection) {
        return this.G.addAll(collection);
    }
    
    @Override
    public void clear() {
        this.G.clear();
    }
    
    @Override
    public boolean contains(@k0 final Object o) {
        return this.G.contains(o);
    }
    
    @Override
    public boolean containsAll(@j0 final Collection<?> collection) {
        return this.G.containsAll(collection);
    }
    
    @Override
    public boolean equals(@k0 final Object o) {
        return this.G.equals(o);
    }
    
    @j0
    @Override
    public E get(final int n) {
        return this.G.get(n);
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode();
    }
    
    @Override
    public int indexOf(@k0 final Object o) {
        return this.G.indexOf(o);
    }
    
    @Override
    public boolean isEmpty() {
        return this.G.isEmpty();
    }
    
    @j0
    @Override
    public Iterator<E> iterator() {
        return this.G.iterator();
    }
    
    @Override
    public int lastIndexOf(@k0 final Object o) {
        return this.G.lastIndexOf(o);
    }
    
    @j0
    @Override
    public ListIterator<E> listIterator() {
        return this.G.listIterator();
    }
    
    @j0
    @Override
    public ListIterator<E> listIterator(final int n) {
        return this.G.listIterator(n);
    }
    
    @Override
    public E remove(final int n) {
        return this.G.remove(n);
    }
    
    @Override
    public boolean remove(@k0 final Object o) {
        return this.G.remove(o);
    }
    
    @Override
    public boolean removeAll(@j0 final Collection<?> collection) {
        return this.G.removeAll(collection);
    }
    
    @Override
    public boolean retainAll(@j0 final Collection<?> collection) {
        return this.G.retainAll(collection);
    }
    
    @j0
    @Override
    public E set(final int n, @j0 final E e) {
        return this.G.set(n, e);
    }
    
    @Override
    public int size() {
        return this.G.size();
    }
    
    @j0
    @Override
    public List<E> subList(final int n, final int n2) {
        return this.G.subList(n, n2);
    }
    
    @k0
    @Override
    public Object[] toArray() {
        return this.G.toArray();
    }
    
    @Override
    public <T> T[] toArray(@k0 final T[] array) {
        return this.G.toArray(array);
    }
}
