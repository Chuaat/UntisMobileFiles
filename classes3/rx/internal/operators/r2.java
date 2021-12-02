// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.plugins.c;
import java.util.concurrent.atomic.AtomicLong;
import rx.i;
import rx.o;
import rx.n;
import rx.f;
import rx.g;

public final class r2<T> implements g.b<f<T>, T>
{
    r2() {
    }
    
    public static <T> r2<T> b() {
        return (r2<T>)b.a;
    }
    
    public n<? super T> a(final n<? super f<T>> n) {
        final c<Object> c = new c<Object>((n<? super f<Object>>)n);
        n.r(c);
        n.s0(new i() {
            @Override
            public void v(final long n) {
                if (n > 0L) {
                    c.A(n);
                }
            }
        });
        return c;
    }
    
    static final class b
    {
        static final r2<Object> a;
        
        static {
            a = new r2<Object>();
        }
    }
    
    static class c<T> extends n<T>
    {
        private final n<? super f<T>> L;
        private volatile f<T> M;
        private boolean N;
        private boolean O;
        private final AtomicLong P;
        
        c(final n<? super f<T>> l) {
            this.P = new AtomicLong();
            this.L = l;
        }
        
        private void w() {
            final AtomicLong p = this.P;
            long value;
            do {
                value = p.get();
                if (value == Long.MAX_VALUE) {
                    return;
                }
            } while (!p.compareAndSet(value, value - 1L));
        }
        
        private void x() {
            synchronized (this) {
                if (this.N) {
                    this.O = true;
                    return;
                }
                this.N = true;
                // monitorexit(this)
                final AtomicLong p = this.P;
                while (!this.L.g()) {
                    final f<T> m = this.M;
                    if (m != null && p.get() > 0L) {
                        this.M = null;
                        this.L.m(m);
                        if (!this.L.g()) {
                            this.L.c();
                        }
                        return;
                    }
                    // monitorenter(this)
                    try {
                        if (!this.O) {
                            this.N = false;
                            return;
                        }
                        // monitorexit(this)
                        continue;
                    }
                    finally {}
                    break;
                }
            }
        }
        
        void A(final long n) {
            rx.internal.operators.a.b(this.P, n);
            this.v(n);
            this.x();
        }
        
        @Override
        public void b(final Throwable t) {
            this.M = f.d(t);
            rx.plugins.c.I(t);
            this.x();
        }
        
        @Override
        public void c() {
            this.M = f.b();
            this.x();
        }
        
        @Override
        public void f() {
            this.v(0L);
        }
        
        @Override
        public void m(final T t) {
            this.L.m(f.e(t));
            this.w();
        }
    }
}
