// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import io.reactivex.internal.util.e;
import io.reactivex.internal.util.k;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.i0;
import java.util.Iterator;
import io.reactivex.g0;

public final class b<T> implements Iterable<T>
{
    final g0<? extends T> G;
    final int H;
    
    public b(final g0<? extends T> g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public Iterator<T> iterator() {
        final a<Object> a = new a<Object>(this.H);
        this.G.c(a);
        return (Iterator<T>)a;
    }
    
    static final class a<T> extends AtomicReference<c> implements i0<T>, Iterator<T>, c
    {
        private static final long L = 6695226475494099826L;
        final io.reactivex.internal.queue.c<T> G;
        final Lock H;
        final Condition I;
        volatile boolean J;
        Throwable K;
        
        a(final int n) {
            this.G = new io.reactivex.internal.queue.c<T>(n);
            final ReentrantLock h = new ReentrantLock();
            this.H = h;
            this.I = h.newCondition();
        }
        
        void a() {
            this.H.lock();
            try {
                this.I.signalAll();
            }
            finally {
                this.H.unlock();
            }
        }
        
        @Override
        public void b(final Throwable k) {
            this.K = k;
            this.J = true;
            this.a();
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            this.J = true;
            this.a();
        }
        
        @Override
        public boolean hasNext() {
            while (true) {
                final boolean j = this.J;
                final boolean empty = this.G.isEmpty();
                if (j) {
                    final Throwable k = this.K;
                    if (k != null) {
                        throw io.reactivex.internal.util.k.f(k);
                    }
                    if (empty) {
                        return false;
                    }
                }
                if (empty) {
                    try {
                        e.b();
                        this.H.lock();
                        try {
                            while (!this.J && this.G.isEmpty()) {
                                this.I.await();
                            }
                        }
                        finally {
                            this.H.unlock();
                        }
                    }
                    catch (InterruptedException ex) {
                        d.b(this);
                        this.a();
                        throw k.f(ex);
                    }
                    break;
                }
                break;
            }
            return true;
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            d.j(this, c);
        }
        
        @Override
        public void m(final T t) {
            this.G.offer(t);
            this.a();
        }
        
        @Override
        public T next() {
            if (this.hasNext()) {
                return this.G.poll();
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }
}
