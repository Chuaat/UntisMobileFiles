// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.o;
import rx.i;
import rx.exceptions.c;
import rx.subscriptions.e;
import rx.internal.producers.a;
import rx.n;
import rx.functions.p;
import rx.g;

public final class y2<T> implements b<T, T>
{
    final p<? super Throwable, ? extends g<? extends T>> G;
    
    public y2(final p<? super Throwable, ? extends g<? extends T>> g) {
        this.G = g;
    }
    
    public static <T> y2<T> b(final g<? extends T> g) {
        return new y2<T>(new p<Throwable, g<? extends T>>() {
            public g<? extends T> a(final Throwable t) {
                if (t instanceof Exception) {
                    return g;
                }
                return g.b2(t);
            }
        });
    }
    
    public static <T> y2<T> c(final g<? extends T> g) {
        return new y2<T>(new p<Throwable, g<? extends T>>() {
            public g<? extends T> a(final Throwable t) {
                return g;
            }
        });
    }
    
    public static <T> y2<T> d(final p<? super Throwable, ? extends T> p) {
        return new y2<T>(new p<Throwable, g<? extends T>>() {
            public g<? extends T> a(final Throwable t) {
                return g.U2(p.h(t));
            }
        });
    }
    
    public n<? super T> a(final n<? super T> n) {
        final rx.internal.producers.a a = new rx.internal.producers.a();
        final e e = new e();
        final n<T> n2 = new n<T>() {
            private boolean L;
            long M;
            
            @Override
            public void b(final Throwable t) {
                if (this.L) {
                    rx.exceptions.c.e(t);
                    rx.plugins.c.I(t);
                    return;
                }
                this.L = true;
                try {
                    this.i();
                    final n<T> n = new n<T>() {
                        @Override
                        public void b(final Throwable t) {
                            n.b(t);
                        }
                        
                        @Override
                        public void c() {
                            n.c();
                        }
                        
                        @Override
                        public void m(final T t) {
                            n.m(t);
                        }
                        
                        @Override
                        public void s0(final i i) {
                            a.c(i);
                        }
                    };
                    e.b(n);
                    final long m = this.M;
                    if (m != 0L) {
                        a.b(m);
                    }
                    ((g)y2.this.G.h(t)).R6(n);
                }
                finally {
                    rx.exceptions.c.f(t, n);
                }
            }
            
            @Override
            public void c() {
                if (this.L) {
                    return;
                }
                this.L = true;
                n.c();
            }
            
            @Override
            public void m(final T t) {
                if (this.L) {
                    return;
                }
                ++this.M;
                n.m(t);
            }
            
            @Override
            public void s0(final i i) {
                a.c(i);
            }
        };
        e.b(n2);
        n.r(e);
        n.s0(a);
        return n2;
    }
}
