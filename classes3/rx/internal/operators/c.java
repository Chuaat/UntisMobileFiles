// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.n;
import java.util.Iterator;
import rx.g;

public final class c
{
    private c() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> Iterable<T> a(final g<? extends T> g, final T t) {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                final b<T> b = new b<T>(t);
                g.z5(b);
                return b.w();
            }
        };
    }
    
    static final class b<T> extends n<T>
    {
        volatile Object L;
        
        b(final T t) {
            this.L = x.j(t);
        }
        
        @Override
        public void b(final Throwable t) {
            this.L = x.c(t);
        }
        
        @Override
        public void c() {
            this.L = x.b();
        }
        
        @Override
        public void m(final T t) {
            this.L = x.j(t);
        }
        
        public Iterator<T> w() {
            return new Iterator<T>() {
                private Object G;
                
                @Override
                public boolean hasNext() {
                    final Object l = b.this.L;
                    this.G = l;
                    return x.f(l) ^ true;
                }
                
                @Override
                public T next() {
                    try {
                        if (this.G == null) {
                            this.G = b.this.L;
                        }
                        if (x.f(this.G)) {
                            throw new NoSuchElementException();
                        }
                        if (!x.g(this.G)) {
                            return x.e(this.G);
                        }
                        throw rx.exceptions.c.c(x.d(this.G));
                    }
                    finally {
                        this.G = null;
                    }
                }
                
                @Override
                public void remove() {
                    throw new UnsupportedOperationException("Read only iterator");
                }
            };
        }
    }
}
