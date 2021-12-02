// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.k;
import java.util.NoSuchElementException;
import io.reactivex.internal.util.q;
import io.reactivex.observers.b;
import io.reactivex.i0;
import java.util.Iterator;
import io.reactivex.g0;

public final class d<T> implements Iterable<T>
{
    final g0<T> G;
    final T H;
    
    public d(final g0<T> g, final T h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public Iterator<T> iterator() {
        final a<Object> a = new a<Object>(this.H);
        this.G.c(a);
        return (Iterator<T>)a.d();
    }
    
    static final class a<T> extends b<T>
    {
        volatile Object H;
        
        a(final T t) {
            this.H = q.y(t);
        }
        
        @Override
        public void b(final Throwable t) {
            this.H = q.j(t);
        }
        
        public d.a.a d() {
            return new d.a.a();
        }
        
        @Override
        public void f() {
            this.H = q.h();
        }
        
        @Override
        public void m(final T t) {
            this.H = q.y(t);
        }
        
        final class a implements Iterator<T>
        {
            private Object G;
            
            @Override
            public boolean hasNext() {
                final Object h = d.a.this.H;
                this.G = h;
                return q.p(h) ^ true;
            }
            
            @Override
            public T next() {
                try {
                    if (this.G == null) {
                        this.G = d.a.this.H;
                    }
                    if (q.p(this.G)) {
                        throw new NoSuchElementException();
                    }
                    if (!q.u(this.G)) {
                        return q.o(this.G);
                    }
                    throw k.f(q.l(this.G));
                }
                finally {
                    this.G = null;
                }
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }
    }
}
