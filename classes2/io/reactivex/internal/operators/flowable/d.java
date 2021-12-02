// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.k;
import java.util.NoSuchElementException;
import io.reactivex.subscribers.a;
import io.reactivex.q;
import java.util.Iterator;
import io.reactivex.l;

public final class d<T> implements Iterable<T>
{
    final l<T> G;
    final T H;
    
    public d(final l<T> g, final T h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public Iterator<T> iterator() {
        final a<Object> a = new a<Object>(this.H);
        this.G.m6(a);
        return (Iterator<T>)a.e();
    }
    
    static final class a<T> extends a<T>
    {
        volatile Object H;
        
        a(final T t) {
            this.H = io.reactivex.internal.util.q.y(t);
        }
        
        public void b(final Throwable t) {
            this.H = io.reactivex.internal.util.q.j(t);
        }
        
        public d.a.a e() {
            return new d.a.a();
        }
        
        public void f() {
            this.H = io.reactivex.internal.util.q.h();
        }
        
        public void m(final T t) {
            this.H = io.reactivex.internal.util.q.y(t);
        }
        
        final class a implements Iterator<T>
        {
            private Object G;
            
            @Override
            public boolean hasNext() {
                final Object h = d.a.this.H;
                this.G = h;
                return io.reactivex.internal.util.q.p(h) ^ true;
            }
            
            @Override
            public T next() {
                try {
                    if (this.G == null) {
                        this.G = d.a.this.H;
                    }
                    if (io.reactivex.internal.util.q.p(this.G)) {
                        throw new NoSuchElementException();
                    }
                    if (!io.reactivex.internal.util.q.u(this.G)) {
                        return io.reactivex.internal.util.q.o(this.G);
                    }
                    throw k.f(io.reactivex.internal.util.q.l(this.G));
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
