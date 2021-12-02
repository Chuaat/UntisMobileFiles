// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import io.reactivex.internal.util.e;
import io.reactivex.internal.util.k;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import io.reactivex.disposables.c;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.q;
import java.util.Iterator;
import io.reactivex.l;

public final class b<T> implements Iterable<T>
{
    final l<T> G;
    final int H;
    
    public b(final l<T> g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public Iterator<T> iterator() {
        final a<Object> a = new a<Object>(this.H);
        this.G.m6(a);
        return (Iterator<T>)a;
    }
    
    static final class a<T> extends AtomicReference<d> implements q<T>, Iterator<T>, Runnable, c
    {
        private static final long O = 6695226475494099826L;
        final io.reactivex.internal.queue.b<T> G;
        final long H;
        final long I;
        final Lock J;
        final Condition K;
        long L;
        volatile boolean M;
        Throwable N;
        
        a(final int n) {
            this.G = new io.reactivex.internal.queue.b<T>(n);
            this.H = n;
            this.I = n - (n >> 2);
            final ReentrantLock j = new ReentrantLock();
            this.J = j;
            this.K = j.newCondition();
        }
        
        void a() {
            this.J.lock();
            try {
                this.K.signalAll();
            }
            finally {
                this.J.unlock();
            }
        }
        
        public void b(final Throwable n) {
            this.N = n;
            this.M = true;
            this.a();
        }
        
        @Override
        public void dispose() {
            j.b(this);
        }
        
        public void f() {
            this.M = true;
            this.a();
        }
        
        @Override
        public boolean hasNext() {
            while (true) {
                final boolean m = this.M;
                final boolean empty = this.G.isEmpty();
                if (m) {
                    final Throwable n = this.N;
                    if (n != null) {
                        throw k.f(n);
                    }
                    if (empty) {
                        return false;
                    }
                }
                if (!empty) {
                    return true;
                }
                e.b();
                this.J.lock();
                try {
                    try {
                        while (!this.M && this.G.isEmpty()) {
                            this.K.await();
                        }
                        this.J.unlock();
                    }
                    finally {}
                }
                catch (InterruptedException ex) {
                    this.run();
                    throw k.f(ex);
                }
                this.J.unlock();
            }
        }
        
        @Override
        public boolean i() {
            return this.get() == j.G;
        }
        
        public void m(final T t) {
            if (!this.G.offer(t)) {
                j.b(this);
                this.b(new io.reactivex.exceptions.c("Queue full?!"));
            }
            else {
                this.a();
            }
        }
        
        @Override
        public T next() {
            if (this.hasNext()) {
                final T poll = this.G.poll();
                final long l = this.L + 1L;
                if (l == this.I) {
                    this.L = 0L;
                    this.get().v(l);
                }
                else {
                    this.L = l;
                }
                return poll;
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
        
        @Override
        public void run() {
            j.b(this);
            this.a();
        }
        
        @Override
        public void z(final d d) {
            j.l(this, d, this.H);
        }
    }
}
