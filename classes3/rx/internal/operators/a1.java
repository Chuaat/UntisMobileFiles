// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.functions.q;
import rx.i;
import rx.internal.producers.a;
import rx.observers.h;
import rx.subjects.b;
import rx.subscriptions.e;
import rx.o;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.n;
import rx.schedulers.c;
import rx.j;
import rx.f;
import rx.functions.p;
import rx.g;

public final class a1<T> implements a<T>
{
    static final p<rx.g<? extends rx.f<?>>, rx.g<?>> L;
    final rx.g<T> G;
    private final p<? super rx.g<? extends rx.f<?>>, ? extends rx.g<?>> H;
    final boolean I;
    final boolean J;
    private final j K;
    
    static {
        L = new p<rx.g<? extends rx.f<?>>, rx.g<?>>() {
            public rx.g<?> a(final rx.g<? extends rx.f<?>> g) {
                return g.k3((p<? super rx.f<?>, ?>)new p<rx.f<?>, rx.f<?>>() {
                    public rx.f<?> a(final rx.f<?> f) {
                        return f.e((Object)null);
                    }
                });
            }
        };
    }
    
    private a1(final rx.g<T> g, final p<? super rx.g<? extends rx.f<?>>, ? extends rx.g<?>> h, final boolean i, final boolean j, final j k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public static <T> rx.g<T> b(final rx.g<T> g, final p<? super rx.g<? extends rx.f<?>>, ? extends rx.g<?>> p3, final j j) {
        return g.Q6((a<T>)new a1((rx.g<Object>)g, p3, false, false, j));
    }
    
    public static <T> rx.g<T> c(final rx.g<T> g) {
        return f(g, rx.schedulers.c.m());
    }
    
    public static <T> rx.g<T> d(final rx.g<T> g, final long n) {
        return e(g, n, rx.schedulers.c.m());
    }
    
    public static <T> rx.g<T> e(final rx.g<T> g, final long n, final j j) {
        final long n2 = lcmp(n, 0L);
        if (n2 == 0) {
            return g.a2();
        }
        if (n2 >= 0) {
            return i(g, new f(n - 1L), j);
        }
        throw new IllegalArgumentException("count >= 0 expected");
    }
    
    public static <T> rx.g<T> f(final rx.g<T> g, final j j) {
        return i(g, a1.L, j);
    }
    
    public static <T> rx.g<T> g(final rx.g<T> g, final p<? super rx.g<? extends rx.f<?>>, ? extends rx.g<?>> p2) {
        return g.Q6((a<T>)new a1((rx.g<Object>)g, p2, false, true, rx.schedulers.c.m()));
    }
    
    public static <T> rx.g<T> i(final rx.g<T> g, final p<? super rx.g<? extends rx.f<?>>, ? extends rx.g<?>> p3, final j j) {
        return g.Q6((a<T>)new a1((rx.g<Object>)g, p3, false, true, j));
    }
    
    public static <T> rx.g<T> m(final rx.g<T> g) {
        return q(g, a1.L);
    }
    
    public static <T> rx.g<T> n(final rx.g<T> g, final long n) {
        final long n2 = lcmp(n, 0L);
        if (n2 < 0) {
            throw new IllegalArgumentException("count >= 0 expected");
        }
        if (n2 == 0) {
            return g;
        }
        return q(g, new f(n));
    }
    
    public static <T> rx.g<T> q(final rx.g<T> g, final p<? super rx.g<? extends rx.f<?>>, ? extends rx.g<?>> p2) {
        return g.Q6((a<T>)new a1((rx.g<Object>)g, p2, true, false, rx.schedulers.c.m()));
    }
    
    public static <T> rx.g<T> r(final rx.g<T> g, final p<? super rx.g<? extends rx.f<?>>, ? extends rx.g<?>> p3, final j j) {
        return g.Q6((a<T>)new a1((rx.g<Object>)g, p3, true, false, j));
    }
    
    public void a(final n<? super T> n) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final AtomicLong atomicLong = new AtomicLong();
        final j.a a = this.K.a();
        n.r(a);
        final e e = new e();
        n.r(e);
        final rx.subjects.e<Object, Object> f7 = b.G7().F7();
        f7.z5(h.d());
        final rx.internal.producers.a a2 = new rx.internal.producers.a();
        final rx.functions.a a3 = new rx.functions.a() {
            @Override
            public void call() {
                if (n.g()) {
                    return;
                }
                final n<T> n = new n<T>() {
                    boolean L;
                    
                    private void w() {
                        long value;
                        do {
                            value = atomicLong.get();
                        } while (value != Long.MAX_VALUE && !atomicLong.compareAndSet(value, value - 1L));
                    }
                    
                    @Override
                    public void b(final Throwable t) {
                        if (!this.L) {
                            this.L = true;
                            this.i();
                            f7.m(rx.f.d(t));
                        }
                    }
                    
                    @Override
                    public void c() {
                        if (!this.L) {
                            this.L = true;
                            this.i();
                            f7.m(rx.f.b());
                        }
                    }
                    
                    @Override
                    public void m(final T t) {
                        if (!this.L) {
                            n.m(t);
                            this.w();
                            a2.b(1L);
                        }
                    }
                    
                    @Override
                    public void s0(final i i) {
                        a2.c(i);
                    }
                };
                e.b(n);
                a1.this.G.R6(n);
            }
        };
        a.c(new rx.functions.a() {
            final /* synthetic */ rx.g G = (rx.g)a1.this.H.h((Object)f7.i3((rx.g.b<?, ? super Object>)new rx.g.b<rx.f<?>, rx.f<?>>(this) {
                public n<? super rx.f<?>> a(final n<? super rx.f<?>> n) {
                    return new n<rx.f<?>>(this, n, n) {
                        final /* synthetic */ n L;
                        
                        @Override
                        public void b(final Throwable t) {
                            this.L.b(t);
                        }
                        
                        @Override
                        public void c() {
                            this.L.c();
                        }
                        
                        @Override
                        public void s0(final i i) {
                            i.v(Long.MAX_VALUE);
                        }
                        
                        public void w(final rx.f<?> f) {
                            if (f.k() && a1.this.I) {
                                this.L.c();
                            }
                            else if (f.l() && a1.this.J) {
                                this.L.b(f.g());
                            }
                            else {
                                this.L.m(f);
                            }
                        }
                    };
                }
            }));
            
            @Override
            public void call() {
                this.G.R6(new n<Object>(n) {
                    @Override
                    public void b(final Throwable t) {
                        n.b(t);
                    }
                    
                    @Override
                    public void c() {
                        n.c();
                    }
                    
                    @Override
                    public void m(final Object o) {
                        if (!n.g()) {
                            if (atomicLong.get() > 0L) {
                                final rx.functions.a l = a.this;
                                a.c(a3);
                            }
                            else {
                                atomicBoolean.compareAndSet(false, true);
                            }
                        }
                    }
                    
                    @Override
                    public void s0(final i i) {
                        i.v(Long.MAX_VALUE);
                    }
                });
            }
        });
        n.s0(new i() {
            @Override
            public void v(final long n) {
                if (n > 0L) {
                    rx.internal.operators.a.b(atomicLong, n);
                    a2.v(n);
                    if (atomicBoolean.compareAndSet(true, false)) {
                        a.c(a3);
                    }
                }
            }
        });
    }
    
    public static final class f implements p<rx.g<? extends rx.f<?>>, rx.g<?>>
    {
        final long G;
        
        public f(final long g) {
            this.G = g;
        }
        
        public rx.g<?> a(final rx.g<? extends rx.f<?>> g) {
            return g.k3((p<? super rx.f<?>, ?>)new p<rx.f<?>, rx.f<?>>() {
                int G;
                
                public rx.f<?> a(rx.f<?> e) {
                    final long g = f.this.G;
                    if (g == 0L) {
                        return e;
                    }
                    final int n = this.G + 1;
                    this.G = n;
                    if (n <= g) {
                        e = rx.f.e((Object)n);
                    }
                    return e;
                }
            }).I1();
        }
    }
    
    public static final class g implements p<rx.g<? extends rx.f<?>>, rx.g<? extends rx.f<?>>>
    {
        final q<Integer, Throwable, Boolean> G;
        
        public g(final q<Integer, Throwable, Boolean> g) {
            this.G = g;
        }
        
        public rx.g<? extends rx.f<?>> a(final rx.g<? extends rx.f<?>> g) {
            return g.S4((rx.f<?>)rx.f.e(0), (q<? extends rx.f<?>, ? super rx.f<?>, ? extends rx.f<?>>)new q<rx.f<Integer>, rx.f<?>, rx.f<Integer>>() {
                public rx.f<Integer> a(final rx.f<Integer> f, final rx.f<?> f2) {
                    final int intValue = f.h();
                    if (g.this.G.s(intValue, f2.g())) {
                        return f.e(intValue + 1);
                    }
                    return (rx.f<Integer>)f2;
                }
            });
        }
    }
}
