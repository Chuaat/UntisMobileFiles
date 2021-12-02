// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.exceptions.c;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Semaphore;
import rx.f;
import rx.n;
import java.util.Iterator;
import rx.g;

public final class b
{
    private b() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> Iterable<T> a(final g<? extends T> g) {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                final b<T> b = new b<T>();
                g.m3().z5(b);
                return b;
            }
        };
    }
    
    static final class b<T> extends n<f<? extends T>> implements Iterator<T>
    {
        final Semaphore L;
        final AtomicReference<f<? extends T>> M;
        f<? extends T> N;
        
        b() {
            this.L = new Semaphore(0);
            this.M = new AtomicReference<f<? extends T>>();
        }
        
        @Override
        public void b(final Throwable t) {
        }
        
        @Override
        public void c() {
        }
        
        @Override
        public boolean hasNext() {
            final f<? extends T> n = this.N;
            if (n != null && n.l()) {
                throw c.c(this.N.g());
            }
            final f<? extends T> n2 = this.N;
            if ((n2 == null || !n2.k()) && this.N == null) {
                try {
                    this.L.acquire();
                    final f<? extends T> n3 = this.M.getAndSet(null);
                    this.N = n3;
                    if (n3.l()) {
                        throw c.c(this.N.g());
                    }
                }
                catch (InterruptedException ex) {
                    this.i();
                    Thread.currentThread().interrupt();
                    this.N = f.d(ex);
                    throw c.c(ex);
                }
            }
            return this.N.k() ^ true;
        }
        
        @Override
        public T next() {
            if (this.hasNext() && this.N.m()) {
                final T h = (T)this.N.h();
                this.N = null;
                return h;
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
        
        public void w(final f<? extends T> newValue) {
            if (this.M.getAndSet(newValue) == null) {
                this.L.release();
            }
        }
    }
}
