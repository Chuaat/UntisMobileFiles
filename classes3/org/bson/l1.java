// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.NoSuchElementException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.ListIterator;
import java.util.Iterator;
import org.bson.io.c;
import org.bson.io.f;
import java.util.AbstractList;
import java.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import e7.a;
import java.util.List;
import java.io.Serializable;

public class l1 extends n implements Serializable
{
    private static final long I = 2L;
    private static final String J = "RawBsonArray instances are immutable";
    private final transient a H;
    
    private l1(final a h) {
        super(h, false);
        this.H = h;
    }
    
    public l1(final byte[] array) {
        this(e7.a.e("bytes", array), 0, array.length);
    }
    
    public l1(final byte[] array, final int n, final int n2) {
        this(new a(array, n, n2));
    }
    
    private void m1(final ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object n1() {
        return new b(this.H.H, this.H.I, this.H.J);
    }
    
    @Override
    public void X0(final int n, final y0 y0) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }
    
    @Override
    public boolean Y0(final y0 y0) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }
    
    @Override
    public n Z0() {
        return new l1(this.H.H.clone(), this.H.I, this.H.J);
    }
    
    @Override
    public boolean addAll(final int n, final Collection<? extends y0> collection) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }
    
    @Override
    public boolean addAll(final Collection<? extends y0> collection) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public y0 i1(final int n) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }
    
    @Override
    public y0 j1(final int n, final y0 y0) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }
    
    b1 l1() {
        return this.H.m();
    }
    
    @Override
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }
    
    @Override
    public boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }
    
    @Override
    public boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }
    
    static class a extends AbstractList<y0>
    {
        private static final int K = 5;
        private Integer G;
        private final byte[] H;
        private final int I;
        private final int J;
        
        a(final byte[] h, final int i, final int j) {
            a.e("bytes", h);
            final boolean b = true;
            a.d("offset >= 0", i >= 0);
            a.d("offset < bytes.length", i < h.length);
            a.d("length <= bytes.length - offset", j <= h.length - i);
            a.d("length >= 5", j >= 5 && b);
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        private p k() {
            return new p(new f(this.m()));
        }
        
        @Override
        public Iterator<y0> iterator() {
            return new l1.a.a();
        }
        
        public y0 l(final int n) {
            if (n >= 0) {
                int n2 = 0;
                final p k = this.k();
                try {
                    k.b4();
                    while (k.o5() != w0.H) {
                        k.C1();
                        if (n2 == n) {
                            return n1.a(this.H, k);
                        }
                        k.skipValue();
                        ++n2;
                    }
                    k.K3();
                    k.close();
                    throw new IndexOutOfBoundsException();
                }
                finally {
                    k.close();
                }
            }
            throw new IndexOutOfBoundsException();
        }
        
        @Override
        public ListIterator<y0> listIterator() {
            return new b(0);
        }
        
        @Override
        public ListIterator<y0> listIterator(final int n) {
            return new b(n);
        }
        
        b1 m() {
            final ByteBuffer wrap = ByteBuffer.wrap(this.H, this.I, this.J);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            return new c1(wrap);
        }
        
        @Override
        public int size() {
            final Integer g = this.G;
            if (g != null) {
                return g;
            }
            int i = 0;
            final p k = this.k();
            try {
                k.b4();
                while (k.o5() != w0.H) {
                    ++i;
                    k.F4();
                    k.skipValue();
                }
                k.K3();
                k.close();
                final Integer value = i;
                this.G = value;
                return value;
            }
            finally {
                k.close();
            }
        }
        
        private class a implements Iterator<y0>
        {
            private int G;
            private p H;
            private int I;
            
            a(final l1.a a) {
                this(a, 0);
            }
            
            a(final int n) {
                this.G = 0;
                this.I = 0;
                this.d(n);
            }
            
            public int a() {
                return this.G;
            }
            
            public y0 b() {
                while (this.G > this.I && this.H.o5() != w0.H) {
                    this.H.C1();
                    this.H.skipValue();
                    ++this.I;
                }
                if (this.H.o5() != w0.H) {
                    this.H.C1();
                    final int n = this.G + 1;
                    this.G = n;
                    this.I = n;
                    return n1.a(l1.a.this.H, this.H);
                }
                this.H.close();
                throw new NoSuchElementException();
            }
            
            public void c(final int g) {
                this.G = g;
            }
            
            void d(final int g) {
                this.G = g;
                this.I = 0;
                final p h = this.H;
                if (h != null) {
                    h.close();
                }
                (this.H = l1.a.this.k()).b4();
            }
            
            @Override
            public boolean hasNext() {
                final boolean b = this.G != l1.a.this.size();
                if (!b) {
                    this.H.close();
                }
                return b;
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("RawBsonArray instances are immutable");
            }
        }
        
        private class b extends l1.a.a implements ListIterator<y0>
        {
            b(final int n) {
                super(n);
            }
            
            public void e(final y0 y0) {
                throw new UnsupportedOperationException("RawBsonArray instances are immutable");
            }
            
            public y0 f() {
                try {
                    final y0 l = l1.a.this.l(this.previousIndex());
                    ((l1.a.a)this).d(this.previousIndex());
                    return l;
                }
                catch (IndexOutOfBoundsException ex) {
                    throw new NoSuchElementException();
                }
            }
            
            public void g(final y0 y0) {
                throw new UnsupportedOperationException("RawBsonArray instances are immutable");
            }
            
            @Override
            public boolean hasPrevious() {
                return ((l1.a.a)this).a() != 0;
            }
            
            @Override
            public int nextIndex() {
                return ((l1.a.a)this).a();
            }
            
            @Override
            public int previousIndex() {
                return ((l1.a.a)this).a() - 1;
            }
        }
    }
    
    private static class b implements Serializable
    {
        private static final long H = 1L;
        private final byte[] G;
        
        b(final byte[] g, final int n, final int n2) {
            if (g.length == n2) {
                this.G = g;
            }
            else {
                System.arraycopy(g, n, this.G = new byte[n2], 0, n2);
            }
        }
        
        private Object a() {
            return new l1(this.G);
        }
    }
}
