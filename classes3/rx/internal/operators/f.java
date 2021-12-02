// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.exceptions.c;
import java.util.concurrent.LinkedBlockingQueue;
import rx.internal.util.m;
import java.util.concurrent.BlockingQueue;
import rx.n;
import java.util.Iterator;
import rx.g;

public final class f
{
    private f() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> Iterator<T> a(final g<? extends T> g) {
        final a a = new a<Object>();
        g.m3().z5((n<? super rx.f<? extends T>>)a);
        return (Iterator<T>)a;
    }
    
    public static final class a<T> extends n<rx.f<? extends T>> implements Iterator<T>
    {
        static final int O;
        private final BlockingQueue<rx.f<? extends T>> L;
        private rx.f<? extends T> M;
        private int N;
        
        static {
            O = m.J * 3 / 4;
        }
        
        public a() {
            this.L = new LinkedBlockingQueue<rx.f<? extends T>>();
        }
        
        private rx.f<? extends T> x() {
            try {
                final rx.f<? extends T> f = this.L.poll();
                if (f != null) {
                    return f;
                }
                return this.L.take();
            }
            catch (InterruptedException ex) {
                this.i();
                throw c.c(ex);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.offer(rx.f.d(t));
        }
        
        @Override
        public void c() {
        }
        
        @Override
        public void f() {
            this.v(m.J);
        }
        
        @Override
        public boolean hasNext() {
            if (this.M == null) {
                this.M = this.x();
                final int n = this.N + 1;
                if ((this.N = n) >= a.O) {
                    this.v(n);
                    this.N = 0;
                }
            }
            if (!this.M.l()) {
                return this.M.k() ^ true;
            }
            throw c.c(this.M.g());
        }
        
        @Override
        public T next() {
            if (this.hasNext()) {
                final T h = (T)this.M.h();
                this.M = null;
                return h;
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator");
        }
        
        public void w(final rx.f<? extends T> f) {
            this.L.offer(f);
        }
    }
}
