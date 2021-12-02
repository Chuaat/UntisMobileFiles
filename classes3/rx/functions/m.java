// 
// Decompiled by Procyon v0.5.36
// 

package rx.functions;

public final class m
{
    private static final m a;
    
    static {
        a = new m();
    }
    
    private m() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> m<T0, T1, T2, T3, T4, T5, T6, T7, T8> a() {
        return (m<T0, T1, T2, T3, T4, T5, T6, T7, T8>)m.a;
    }
    
    public static b<Throwable> b() {
        return n.G;
    }
    
    public static <T> b<T> c(final a a) {
        return new l<T>(a);
    }
    
    public static o<Void> d(final a a) {
        return e(a, (Void)null);
    }
    
    public static <R> o<R> e(final a a, final R r) {
        return new o<R>() {
            @Override
            public R call() {
                a.call();
                return r;
            }
        };
    }
    
    public static <T1> p<T1, Void> f(final b<T1> b) {
        return g(b, (Void)null);
    }
    
    public static <T1, R> p<T1, R> g(final b<T1> b, final R r) {
        return new p<T1, R>() {
            @Override
            public R h(final T1 t1) {
                b.h(t1);
                return r;
            }
        };
    }
    
    public static <T1, T2> q<T1, T2, Void> h(final c<T1, T2> c) {
        return i(c, (Void)null);
    }
    
    public static <T1, T2, R> q<T1, T2, R> i(final c<T1, T2> c, final R r) {
        return new q<T1, T2, R>() {
            @Override
            public R s(final T1 t1, final T2 t2) {
                c.s(t1, t2);
                return r;
            }
        };
    }
    
    public static <T1, T2, T3> r<T1, T2, T3, Void> j(final d<T1, T2, T3> d) {
        return k(d, (Void)null);
    }
    
    public static <T1, T2, T3, R> r<T1, T2, T3, R> k(final d<T1, T2, T3> d, final R r) {
        return new r<T1, T2, T3, R>() {
            @Override
            public R k(final T1 t1, final T2 t2, final T3 t3) {
                d.k(t1, t2, t3);
                return r;
            }
        };
    }
    
    public static <T1, T2, T3, T4> s<T1, T2, T3, T4, Void> l(final e<T1, T2, T3, T4> e) {
        return m(e, (Void)null);
    }
    
    public static <T1, T2, T3, T4, R> s<T1, T2, T3, T4, R> m(final e<T1, T2, T3, T4> e, final R r) {
        return new s<T1, T2, T3, T4, R>() {
            @Override
            public R p(final T1 t1, final T2 t2, final T3 t3, final T4 t4) {
                e.p(t1, t2, t3, t4);
                return r;
            }
        };
    }
    
    public static <T1, T2, T3, T4, T5> t<T1, T2, T3, T4, T5, Void> n(final f<T1, T2, T3, T4, T5> f) {
        return o(f, (Void)null);
    }
    
    public static <T1, T2, T3, T4, T5, R> t<T1, T2, T3, T4, T5, R> o(final f<T1, T2, T3, T4, T5> f, final R r) {
        return new t<T1, T2, T3, T4, T5, R>() {
            @Override
            public R j(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5) {
                f.j(t1, t2, t3, t4, t5);
                return r;
            }
        };
    }
    
    public static <T1, T2, T3, T4, T5, T6> u<T1, T2, T3, T4, T5, T6, Void> p(final g<T1, T2, T3, T4, T5, T6> g) {
        return q(g, (Void)null);
    }
    
    public static <T1, T2, T3, T4, T5, T6, R> u<T1, T2, T3, T4, T5, T6, R> q(final g<T1, T2, T3, T4, T5, T6> g, final R r) {
        return new u<T1, T2, T3, T4, T5, T6, R>() {
            @Override
            public R u(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6) {
                g.u(t1, t2, t3, t4, t5, t6);
                return r;
            }
        };
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7> v<T1, T2, T3, T4, T5, T6, T7, Void> r(final h<T1, T2, T3, T4, T5, T6, T7> h) {
        return s(h, (Void)null);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, R> v<T1, T2, T3, T4, T5, T6, T7, R> s(final h<T1, T2, T3, T4, T5, T6, T7> h, final R r) {
        return new v<T1, T2, T3, T4, T5, T6, T7, R>() {
            @Override
            public R l(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7) {
                h.l(t1, t2, t3, t4, t5, t6, t7);
                return r;
            }
        };
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8> w<T1, T2, T3, T4, T5, T6, T7, T8, Void> t(final i<T1, T2, T3, T4, T5, T6, T7, T8> i) {
        return u(i, (Void)null);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> w<T1, T2, T3, T4, T5, T6, T7, T8, R> u(final i<T1, T2, T3, T4, T5, T6, T7, T8> i, final R r) {
        return new w<T1, T2, T3, T4, T5, T6, T7, T8, R>() {
            @Override
            public R o(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8) {
                i.o(t1, t2, t3, t4, t5, t6, t7, t8);
                return r;
            }
        };
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> x<T1, T2, T3, T4, T5, T6, T7, T8, T9, Void> v(final j<T1, T2, T3, T4, T5, T6, T7, T8, T9> j) {
        return w(j, (Void)null);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> x<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> w(final j<T1, T2, T3, T4, T5, T6, T7, T8, T9> j, final R r) {
        return new x<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() {
            @Override
            public R y(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8, final T9 t9) {
                j.y(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                return r;
            }
        };
    }
    
    public static y<Void> x(final rx.functions.l l) {
        return y(l, (Void)null);
    }
    
    public static <R> y<R> y(final rx.functions.l l, final R r) {
        return new y<R>() {
            @Override
            public R call(final Object... array) {
                l.call(array);
                return r;
            }
        };
    }
    
    static final class l<T> implements b<T>
    {
        final a G;
        
        public l(final a g) {
            this.G = g;
        }
        
        @Override
        public void h(final T t) {
            this.G.call();
        }
    }
    
    static final class m<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements a, b<T0>, c<T0, T1>, d<T0, T1, T2>, e<T0, T1, T2, T3>, f<T0, T1, T2, T3, T4>, g<T0, T1, T2, T3, T4, T5>, h<T0, T1, T2, T3, T4, T5, T6>, i<T0, T1, T2, T3, T4, T5, T6, T7>, j<T0, T1, T2, T3, T4, T5, T6, T7, T8>, l
    {
        @Override
        public void call() {
        }
        
        @Override
        public void call(final Object... array) {
        }
        
        @Override
        public void h(final T0 t0) {
        }
        
        @Override
        public void j(final T0 t0, final T1 t2, final T2 t3, final T3 t4, final T4 t5) {
        }
        
        @Override
        public void k(final T0 t0, final T1 t2, final T2 t3) {
        }
        
        @Override
        public void l(final T0 t0, final T1 t2, final T2 t3, final T3 t4, final T4 t5, final T5 t6, final T6 t7) {
        }
        
        @Override
        public void o(final T0 t0, final T1 t2, final T2 t3, final T3 t4, final T4 t5, final T5 t6, final T6 t7, final T7 t8) {
        }
        
        @Override
        public void p(final T0 t0, final T1 t2, final T2 t3, final T3 t4) {
        }
        
        @Override
        public void s(final T0 t0, final T1 t2) {
        }
        
        @Override
        public void u(final T0 t0, final T1 t2, final T2 t3, final T3 t4, final T4 t5, final T5 t6) {
        }
        
        @Override
        public void y(final T0 t0, final T1 t2, final T2 t3, final T3 t4, final T4 t5, final T5 t6, final T6 t7, final T7 t8, final T8 t9) {
        }
    }
    
    enum n implements b<Throwable>
    {
        G;
        
        public void b(final Throwable t) {
            throw new rx.exceptions.g(t);
        }
    }
}
