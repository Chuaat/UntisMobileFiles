// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.types;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Collection;
import e7.a;
import java.util.Set;

class i implements Set<String>
{
    private static final String[] H;
    private final int G;
    
    static {
        H = new String[1024];
        int i = 0;
        while (true) {
            final String[] h = org.bson.types.i.H;
            if (i >= h.length) {
                break;
            }
            h[i] = String.valueOf(i);
            ++i;
        }
    }
    
    i(final int g) {
        a.b("size >= 0", g >= 0);
        this.G = g;
    }
    
    private String i(final int i) {
        final String[] h = i.H;
        String string;
        if (i < h.length) {
            string = h[i];
        }
        else {
            string = Integer.toString(i);
        }
        return string;
    }
    
    @Override
    public boolean addAll(final Collection<? extends String> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean contains(final Object o) {
        final boolean b = o instanceof String;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        try {
            final int int1 = Integer.parseInt((String)o);
            boolean b3 = b2;
            if (int1 >= 0) {
                final int size = this.size();
                b3 = b2;
                if (int1 < size) {
                    b3 = true;
                }
            }
            return b3;
        }
        catch (NumberFormatException ex) {
            return b2;
        }
    }
    
    @Override
    public boolean containsAll(final Collection<?> collection) {
        final Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public boolean h(final String s) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int G = 0;
            
            public String a() {
                if (this.hasNext()) {
                    return i.this.i(this.G++);
                }
                throw new NoSuchElementException();
            }
            
            @Override
            public boolean hasNext() {
                return this.G < i.this.G;
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
    @Override
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public int size() {
        return this.G;
    }
    
    @Override
    public Object[] toArray() {
        final Object[] array = new Object[this.size()];
        for (int i = 0; i < this.size(); ++i) {
            array[i] = this.i(i);
        }
        return array;
    }
    
    @Override
    public <T> T[] toArray(final T[] array) {
        Object[] array2;
        if (array.length >= this.size()) {
            array2 = array;
        }
        else {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), this.G);
        }
        for (int i = 0; i < this.size(); ++i) {
            array2[i] = this.i(i);
        }
        if (array.length > this.size()) {
            array[this.G] = null;
        }
        return (T[])array2;
    }
}
