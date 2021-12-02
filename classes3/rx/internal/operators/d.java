// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.BlockingQueue;
import java.util.NoSuchElementException;
import rx.exceptions.c;
import rx.f;
import rx.n;
import java.util.Iterator;
import rx.g;

public final class d
{
    private d() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> Iterable<T> a(final g<? extends T> g) {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new b<T>(g, (c<T>)new c());
            }
        };
    }
    
    static final class b<T> implements Iterator<T>
    {
        private final c<T> G;
        private final g<? extends T> H;
        private T I;
        private boolean J;
        private boolean K;
        private Throwable L;
        private boolean M;
        
        b(final g<? extends T> h, final c<T> g) {
            this.J = true;
            this.K = true;
            this.H = h;
            this.G = g;
        }
        
        private boolean a() {
            try {
                if (!this.M) {
                    this.M = true;
                    this.G.x(1);
                    this.H.m3().z5((n<? super f<? extends T>>)this.G);
                }
                final f<? extends T> a = this.G.A();
                if (a.m()) {
                    this.K = false;
                    this.I = (T)a.h();
                    return true;
                }
                this.J = false;
                if (a.k()) {
                    return false;
                }
                if (a.l()) {
                    final Throwable g = a.g();
                    this.L = g;
                    throw rx.exceptions.c.c(g);
                }
                throw new IllegalStateException("Should not reach here");
            }
            catch (InterruptedException l) {
                this.G.i();
                Thread.currentThread().interrupt();
                this.L = l;
                throw rx.exceptions.c.c(l);
            }
        }
        
        @Override
        public boolean hasNext() {
            final Throwable l = this.L;
            if (l != null) {
                throw rx.exceptions.c.c(l);
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
                throw rx.exceptions.c.c(l);
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
    
    static final class c<T> extends n<f<? extends T>>
    {
        private final BlockingQueue<f<? extends T>> L;
        final AtomicInteger M;
        
        c() {
            this.L = new ArrayBlockingQueue<f<? extends T>>(1);
            this.M = new AtomicInteger();
        }
        
        public f<? extends T> A() throws InterruptedException {
            this.x(1);
            return this.L.take();
        }
        
        @Override
        public void b(final Throwable t) {
        }
        
        @Override
        public void c() {
        }
        
        public void w(final f<? extends T> f) {
            f<? extends T> f2 = f;
            if (this.M.getAndSet(0) != 1) {
                if (f.m()) {
                    return;
                }
                f2 = f;
            }
            while (!this.L.offer(f2)) {
                final f<? extends T> f3 = this.L.poll();
                if (f3 != null && !f3.m()) {
                    f2 = f3;
                }
            }
        }
        
        void x(final int newValue) {
            this.M.set(newValue);
        }
    }
}
