// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.c;
import rx.functions.a;
import rx.o;
import rx.subscriptions.e;
import rx.n;
import rx.j;
import java.util.concurrent.TimeUnit;
import rx.g;

public final class a2<T> implements g.b<T, T>
{
    final long G;
    final TimeUnit H;
    final j I;
    
    public a2(final long g, final TimeUnit h, final j i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final j.a a = this.I.a();
        final rx.observers.g g = new rx.observers.g((n<? super T>)n);
        final e e = new e();
        g.r(a);
        g.r(e);
        return new n<T>(n) {
            final b<T> L = new b();
            final n<?> M = this;
            
            @Override
            public void b(final Throwable t) {
                g.b(t);
                this.i();
                this.L.a();
            }
            
            @Override
            public void c() {
                this.L.c(g, this);
            }
            
            @Override
            public void f() {
                this.v(Long.MAX_VALUE);
            }
            
            @Override
            public void m(final T t) {
                final int d = this.L.d(t);
                final e n = e;
                final j.a o = a;
                final rx.functions.a a = new rx.functions.a() {
                    @Override
                    public void call() {
                        final n<T> h = n.this;
                        h.L.b(d, g, h.M);
                    }
                };
                final a2 q = a2.this;
                n.b(o.d(a, q.G, q.H));
            }
        };
    }
    
    static final class b<T>
    {
        int a;
        T b;
        boolean c;
        boolean d;
        boolean e;
        
        public void a() {
            synchronized (this) {
                ++this.a;
                this.b = null;
                this.c = false;
            }
        }
        
        public void b(final int n, final n<T> n2, final n<?> n3) {
            synchronized (this) {
                if (!this.e && this.c) {
                    if (n == this.a) {
                        final T b = this.b;
                        this.b = null;
                        this.c = false;
                        this.e = true;
                        // monitorexit(this)
                        try {
                            n2.m(b);
                            synchronized (this) {
                                if (!this.d) {
                                    this.e = false;
                                    return;
                                }
                                // monitorexit(this)
                                n2.c();
                            }
                        }
                        finally {
                            final Throwable t;
                            rx.exceptions.c.g(t, n3, b);
                        }
                    }
                }
            }
        }
        
        public void c(final n<T> t, final n<?> n) {
            synchronized (this) {
                if (this.e) {
                    this.d = true;
                    return;
                }
                final T b = this.b;
                final boolean c = this.c;
                this.b = null;
                this.c = false;
                this.e = true;
                // monitorexit(this)
                if (c) {
                    try {
                        ((h<T>)t).m(b);
                    }
                    finally {
                        rx.exceptions.c.g(t, n, b);
                        return;
                    }
                }
                ((h)t).c();
            }
        }
        
        public int d(final T b) {
            synchronized (this) {
                this.b = b;
                this.c = true;
                return ++this.a;
            }
        }
    }
}
