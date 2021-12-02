// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.ArrayList;
import rx.h;
import rx.exceptions.c;
import rx.n;
import rx.functions.o;
import java.util.List;
import rx.g;

public final class u1<T, TClosing> implements b<List<T>, T>
{
    final o<? extends g<? extends TClosing>> G;
    final int H;
    
    public u1(final o<? extends g<? extends TClosing>> g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    public u1(final g<? extends TClosing> g, final int h) {
        this.G = new o<g<? extends TClosing>>() {
            public g<? extends TClosing> a() {
                return g;
            }
        };
        this.H = h;
    }
    
    public n<? super T> a(final n<? super List<T>> n) {
        try {
            final g g = (g)this.G.call();
            final c c = new c(new rx.observers.g<Object>(n));
            final n<TClosing> n2 = new n<TClosing>() {
                @Override
                public void b(final Throwable t) {
                    c.b(t);
                }
                
                @Override
                public void c() {
                    c.c();
                }
                
                @Override
                public void m(final TClosing tClosing) {
                    c.w();
                }
            };
            n.r(n2);
            n.r(c);
            g.R6(n2);
            return c;
        }
        finally {
            final Throwable t;
            rx.exceptions.c.f(t, n);
            return rx.observers.h.d();
        }
    }
    
    final class c extends n<T>
    {
        final n<? super List<T>> L;
        List<T> M;
        boolean N;
        
        public c(final n<? super List<T>> l) {
            this.L = l;
            this.M = new ArrayList<T>(u1.this.H);
        }
        
        @Override
        public void b(final Throwable t) {
            synchronized (this) {
                if (this.N) {
                    return;
                }
                this.N = true;
                this.M = null;
                // monitorexit(this)
                this.L.b(t);
                this.i();
            }
        }
        
        @Override
        public void c() {
            try {
                synchronized (this) {
                    if (this.N) {
                        return;
                    }
                    this.N = true;
                    final List<T> m = this.M;
                    this.M = null;
                    // monitorexit(this)
                    this.L.m(m);
                    this.L.c();
                    this.i();
                }
            }
            finally {
                final Throwable t;
                rx.exceptions.c.f(t, this.L);
            }
        }
        
        @Override
        public void m(final T t) {
            synchronized (this) {
                if (this.N) {
                    return;
                }
                this.M.add(t);
            }
        }
        
        void w() {
            synchronized (this) {
                if (this.N) {
                    return;
                }
                final List<T> m = this.M;
                this.M = new ArrayList<T>(u1.this.H);
                // monitorexit(this)
                try {
                    this.L.m(m);
                }
                finally {
                    this.i();
                    synchronized (this) {
                        if (this.N) {
                            return;
                        }
                        this.N = true;
                        // monitorexit(this)
                        final Throwable t;
                        rx.exceptions.c.f(t, this.L);
                    }
                }
            }
        }
    }
}
