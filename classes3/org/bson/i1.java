// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.NoSuchElementException;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;
import java.util.List;

public class i1 extends j1 implements List
{
    public i1(final byte[] array, final int n, final g1 g1) {
        super(array, n, g1);
    }
    
    public i1(final byte[] array, final g1 g1) {
        super(array, g1);
    }
    
    @Override
    public void add(final int n, final Object o) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    @Override
    public boolean add(final Object o) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.indexOf(o) > -1;
    }
    
    @Override
    public boolean containsAll(final Collection collection) {
        final HashSet<Object> set = new HashSet<Object>();
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next());
        }
        return set.containsAll(collection);
    }
    
    @Override
    public Object get(final int i) {
        return this.j(String.valueOf(i));
    }
    
    @Override
    public int indexOf(final Object o) {
        final Iterator iterator = this.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (o.equals(iterator.next())) {
                return n;
            }
            ++n;
        }
        return -1;
    }
    
    @Override
    public Iterator iterator() {
        return new a();
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        final Iterator iterator = this.iterator();
        int n = -1;
        int n2 = 0;
        while (iterator.hasNext()) {
            if (o.equals(iterator.next())) {
                n = n2;
            }
            ++n2;
        }
        return n;
    }
    
    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Operation is not supported instance of this type");
    }
    
    @Override
    public ListIterator listIterator(final int n) {
        throw new UnsupportedOperationException("Operation is not supported instance of this type");
    }
    
    @Override
    public Object remove(final int n) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    @Override
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    @Override
    public boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    @Override
    public boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    @Override
    public Object set(final int n, final Object o) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    @Override
    public int size() {
        return this.keySet().size();
    }
    
    @Override
    public List subList(final int n, final int n2) {
        throw new UnsupportedOperationException("Operation is not supported");
    }
    
    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Operation is not supported");
    }
    
    @Override
    public Object[] toArray(final Object[] array) {
        throw new UnsupportedOperationException("Operation is not supported");
    }
    
    public class a implements Iterator
    {
        private final p G;
        private w0 H;
        
        public a() {
            (this.G = i1.this.l()).b4();
        }
        
        @Override
        public boolean hasNext() {
            if (this.H == null) {
                this.H = this.G.o5();
            }
            return this.H != w0.H;
        }
        
        @Override
        public Object next() {
            if (this.hasNext()) {
                this.H = null;
                this.G.F4();
                return i1.this.z(this.G);
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported");
        }
    }
}
