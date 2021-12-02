// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.pcollections;

import java.util.NoSuchElementException;
import java.util.Iterator;

final class a<E> implements Iterable<E>
{
    private static final a<Object> J;
    final E G;
    final a<E> H;
    private final int I;
    
    static {
        J = new a<Object>();
    }
    
    private a() {
        this.I = 0;
        this.G = null;
        this.H = null;
    }
    
    private a(final E g, final a<E> h) {
        this.G = g;
        this.H = h;
        this.I = h.I + 1;
    }
    
    public static <E> a<E> f() {
        return (a<E>)a.J;
    }
    
    private Iterator<E> h(final int n) {
        return new a<E>(this.m(n));
    }
    
    private a<E> k(final Object obj) {
        if (this.I == 0) {
            return this;
        }
        if (this.G.equals(obj)) {
            return this.H;
        }
        final a<E> k = this.H.k(obj);
        if (k == this.H) {
            return this;
        }
        return new a<E>(this.G, (a<Object>)k);
    }
    
    private a<E> m(final int n) {
        if (n < 0 || n > this.I) {
            throw new IndexOutOfBoundsException();
        }
        if (n == 0) {
            return this;
        }
        return this.H.m(n - 1);
    }
    
    public E get(final int i) {
        if (i >= 0 && i <= this.I) {
            try {
                return this.h(i).next();
            }
            catch (NoSuchElementException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Index: ");
                sb.append(i);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }
        throw new IndexOutOfBoundsException();
    }
    
    public a<E> i(final int n) {
        return this.k(this.get(n));
    }
    
    @Override
    public Iterator<E> iterator() {
        return this.h(0);
    }
    
    public a<E> l(final E e) {
        return new a<E>(e, this);
    }
    
    public int size() {
        return this.I;
    }
    
    private static class a<E> implements Iterator<E>
    {
        private kotlin.reflect.jvm.internal.pcollections.a<E> G;
        
        public a(final kotlin.reflect.jvm.internal.pcollections.a<E> g) {
            this.G = g;
        }
        
        @Override
        public boolean hasNext() {
            return ((kotlin.reflect.jvm.internal.pcollections.a<Object>)this.G).I > 0;
        }
        
        @Override
        public E next() {
            final kotlin.reflect.jvm.internal.pcollections.a<E> g = this.G;
            final E g2 = g.G;
            this.G = g.H;
            return g2;
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
