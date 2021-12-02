// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import io.reactivex.internal.util.k;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Semaphore;
import io.reactivex.observers.e;
import io.reactivex.a0;
import io.reactivex.i0;
import io.reactivex.b0;
import java.util.Iterator;
import io.reactivex.g0;

public final class c<T> implements Iterable<T>
{
    final g0<T> G;
    
    public c(final g0<T> g) {
        this.G = g;
    }
    
    @Override
    public Iterator<T> iterator() {
        final a a = new a<Object>();
        b0.S7(this.G).E3().c((i0<? super a0<T>>)a);
        return (Iterator<T>)a;
    }
    
    static final class a<T> extends e<a0<T>> implements Iterator<T>
    {
        a0<T> H;
        final Semaphore I;
        final AtomicReference<a0<T>> J;
        
        a() {
            this.I = new Semaphore(0);
            this.J = new AtomicReference<a0<T>>();
        }
        
        @Override
        public void b(final Throwable t) {
            io.reactivex.plugins.a.Y(t);
        }
        
        public void c(final a0<T> newValue) {
            if (this.J.getAndSet(newValue) == null) {
                this.I.release();
            }
        }
        
        @Override
        public void f() {
        }
        
        @Override
        public boolean hasNext() {
            final a0<T> h = this.H;
            if (h != null && h.g()) {
                throw k.f(this.H.d());
            }
            if (this.H == null) {
                try {
                    io.reactivex.internal.util.e.b();
                    this.I.acquire();
                    final a0<T> h2 = this.J.getAndSet(null);
                    this.H = h2;
                    if (h2.g()) {
                        throw k.f(h2.d());
                    }
                }
                catch (InterruptedException ex) {
                    this.dispose();
                    this.H = a0.b(ex);
                    throw k.f(ex);
                }
            }
            return this.H.h();
        }
        
        @Override
        public T next() {
            if (this.hasNext()) {
                final T e = this.H.e();
                this.H = null;
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
