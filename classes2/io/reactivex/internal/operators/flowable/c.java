// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import io.reactivex.internal.util.e;
import io.reactivex.internal.util.k;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Semaphore;
import io.reactivex.a0;
import io.reactivex.q;
import io.reactivex.l;
import java.util.Iterator;
import o7.b;

public final class c<T> implements Iterable<T>
{
    final b<? extends T> G;
    
    public c(final b<? extends T> g) {
        this.G = g;
    }
    
    @Override
    public Iterator<T> iterator() {
        final a a = new a<Object>();
        l.b3((o7.b<?>)this.G).O3().m6((q<? super a0<Object>>)a);
        return (Iterator<T>)a;
    }
    
    static final class a<T> extends b<a0<T>> implements Iterator<T>
    {
        final Semaphore H;
        final AtomicReference<a0<T>> I;
        a0<T> J;
        
        a() {
            this.H = new Semaphore(0);
            this.I = new AtomicReference<a0<T>>();
        }
        
        public void b(final Throwable t) {
            io.reactivex.plugins.a.Y(t);
        }
        
        public void e(final a0<T> newValue) {
            if (this.I.getAndSet(newValue) == null) {
                this.H.release();
            }
        }
        
        public void f() {
        }
        
        @Override
        public boolean hasNext() {
            final a0<T> j = this.J;
            if (j != null && j.g()) {
                throw k.f(this.J.d());
            }
            final a0<T> i = this.J;
            if ((i == null || i.h()) && this.J == null) {
                try {
                    e.b();
                    this.H.acquire();
                    final a0<T> k = this.I.getAndSet(null);
                    this.J = k;
                    if (k.g()) {
                        throw io.reactivex.internal.util.k.f(k.d());
                    }
                }
                catch (InterruptedException ex) {
                    this.dispose();
                    this.J = a0.b(ex);
                    throw k.f(ex);
                }
            }
            return this.J.h();
        }
        
        @Override
        public T next() {
            if (this.hasNext() && this.J.h()) {
                final T e = this.J.e();
                this.J = null;
                return e;
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }
}
