// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.plugins.c;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.i;
import rx.o;
import rx.n;
import rx.g;

public final class i0<T> implements g.a<T>
{
    final g<T> G;
    
    public i0(final g<T> g) {
        this.G = g;
    }
    
    public void a(final n<? super T> n) {
        final b b = new b((n<? super Object>)n);
        final a a = new a((b)b);
        n.r(a);
        n.s0(a);
        this.G.R6((n<? super T>)b);
    }
    
    static final class a<T> implements i, o
    {
        final b<T> G;
        
        public a(final b<T> g) {
            this.G = g;
        }
        
        @Override
        public boolean g() {
            return this.G.g();
        }
        
        @Override
        public void i() {
            this.G.x();
        }
        
        @Override
        public void v(final long n) {
            this.G.w(n);
        }
    }
    
    static final class b<T> extends n<T>
    {
        final AtomicReference<n<? super T>> L;
        final AtomicReference<i> M;
        final AtomicLong N;
        
        public b(final n<? super T> initialValue) {
            this.L = new AtomicReference<n<? super T>>(initialValue);
            this.M = new AtomicReference<i>();
            this.N = new AtomicLong();
        }
        
        @Override
        public void b(final Throwable t) {
            this.M.lazySet(c.G);
            final n<? super T> n = this.L.getAndSet(null);
            if (n != null) {
                n.b(t);
            }
            else {
                rx.plugins.c.I(t);
            }
        }
        
        @Override
        public void c() {
            this.M.lazySet(c.G);
            final n<? super T> n = this.L.getAndSet(null);
            if (n != null) {
                n.c();
            }
        }
        
        @Override
        public void m(final T t) {
            final n<? super T> n = this.L.get();
            if (n != null) {
                n.m(t);
            }
        }
        
        @Override
        public void s0(final i newValue) {
            if (this.M.compareAndSet(null, newValue)) {
                newValue.v(this.N.getAndSet(0L));
            }
            else if (this.M.get() != c.G) {
                throw new IllegalStateException("Producer already set!");
            }
        }
        
        void w(final long lng) {
            if (lng >= 0L) {
                final i i = this.M.get();
                if (i != null) {
                    i.v(lng);
                }
                else {
                    rx.internal.operators.a.b(this.N, lng);
                    final i j = this.M.get();
                    if (j != null && j != c.G) {
                        j.v(this.N.getAndSet(0L));
                    }
                }
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("n >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
        
        void x() {
            this.M.lazySet(c.G);
            this.L.lazySet(null);
            this.i();
        }
    }
    
    enum c implements i
    {
        G;
        
        @Override
        public void v(final long n) {
        }
    }
}
