// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.plugins.a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.BlockingQueue;
import java.util.NoSuchElementException;
import io.reactivex.a0;
import io.reactivex.internal.util.k;
import io.reactivex.i0;
import java.util.Iterator;
import io.reactivex.g0;

public final class e<T> implements Iterable<T>
{
    final g0<T> G;
    
    public e(final g0<T> g) {
        this.G = g;
    }
    
    @Override
    public Iterator<T> iterator() {
        return new a<T>(this.G, (b<T>)new b());
    }
    
    static final class a<T> implements Iterator<T>
    {
        private final b<T> G;
        private final g0<T> H;
        private T I;
        private boolean J;
        private boolean K;
        private Throwable L;
        private boolean M;
        
        a(final g0<T> h, final b<T> g) {
            this.J = true;
            this.K = true;
            this.H = h;
            this.G = g;
        }
        
        private boolean a() {
            if (!this.M) {
                this.M = true;
                this.G.d();
                new y1<Object>(this.H).c((i0<? super U>)this.G);
            }
            try {
                final a0<T> e = this.G.e();
                if (e.h()) {
                    this.K = false;
                    this.I = e.e();
                    return true;
                }
                this.J = false;
                if (e.f()) {
                    return false;
                }
                final Throwable d = e.d();
                this.L = d;
                throw k.f(d);
            }
            catch (InterruptedException l) {
                this.G.dispose();
                this.L = l;
                throw k.f(l);
            }
        }
        
        @Override
        public boolean hasNext() {
            final Throwable l = this.L;
            if (l != null) {
                throw k.f(l);
            }
            final boolean j = this.J;
            boolean b = false;
            if (!j) {
                return false;
            }
            if (!this.K || this.a()) {
                b = true;
            }
            return b;
        }
        
        @Override
        public T next() {
            final Throwable l = this.L;
            if (l != null) {
                throw k.f(l);
            }
            if (this.hasNext()) {
                this.K = true;
                return this.I;
            }
            throw new NoSuchElementException("No more elements");
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }
    
    static final class b<T> extends e<a0<T>>
    {
        private final BlockingQueue<a0<T>> H;
        final AtomicInteger I;
        
        b() {
            this.H = new ArrayBlockingQueue<a0<T>>(1);
            this.I = new AtomicInteger();
        }
        
        @Override
        public void b(final Throwable t) {
            io.reactivex.plugins.a.Y(t);
        }
        
        public void c(final a0<T> a0) {
            a0<T> a2 = a0;
            if (this.I.getAndSet(0) != 1) {
                if (a0.h()) {
                    return;
                }
                a2 = a0;
            }
            while (!this.H.offer(a2)) {
                final a0<T> a3 = this.H.poll();
                if (a3 != null && !a3.h()) {
                    a2 = a3;
                }
            }
        }
        
        void d() {
            this.I.set(1);
        }
        
        public a0<T> e() throws InterruptedException {
            this.d();
            io.reactivex.internal.util.e.b();
            return this.H.take();
        }
        
        @Override
        public void f() {
        }
    }
}
