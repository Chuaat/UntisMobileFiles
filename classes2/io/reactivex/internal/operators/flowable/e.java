// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.plugins.a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.BlockingQueue;
import java.util.NoSuchElementException;
import io.reactivex.internal.util.k;
import io.reactivex.a0;
import io.reactivex.q;
import io.reactivex.l;
import java.util.Iterator;
import o7.b;

public final class e<T> implements Iterable<T>
{
    final o7.b<? extends T> G;
    
    public e(final o7.b<? extends T> g) {
        this.G = g;
    }
    
    @Override
    public Iterator<T> iterator() {
        return new a<T>(this.G, (b<T>)new b());
    }
    
    static final class a<T> implements Iterator<T>
    {
        private final b<T> G;
        private final o7.b<? extends T> H;
        private T I;
        private boolean J;
        private boolean K;
        private Throwable L;
        private boolean M;
        
        a(final o7.b<? extends T> h, final b<T> g) {
            this.J = true;
            this.K = true;
            this.H = h;
            this.G = g;
        }
        
        private boolean a() {
            try {
                if (!this.M) {
                    this.M = true;
                    this.G.g();
                    l.b3((o7.b<?>)this.H).O3().m6((q<? super a0<Object>>)this.G);
                }
                final a0<T> h = this.G.h();
                if (h.h()) {
                    this.K = false;
                    this.I = h.e();
                    return true;
                }
                this.J = false;
                if (h.f()) {
                    return false;
                }
                if (h.g()) {
                    final Throwable d = h.d();
                    this.L = d;
                    throw k.f(d);
                }
                throw new IllegalStateException("Should not reach here");
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
    
    static final class b<T> extends io.reactivex.subscribers.b<a0<T>>
    {
        private final BlockingQueue<a0<T>> H;
        final AtomicInteger I;
        
        b() {
            this.H = new ArrayBlockingQueue<a0<T>>(1);
            this.I = new AtomicInteger();
        }
        
        public void b(final Throwable t) {
            io.reactivex.plugins.a.Y(t);
        }
        
        public void e(final a0<T> a0) {
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
        
        public void f() {
        }
        
        void g() {
            this.I.set(1);
        }
        
        public a0<T> h() throws InterruptedException {
            this.g();
            io.reactivex.internal.util.e.b();
            return this.H.take();
        }
    }
}
