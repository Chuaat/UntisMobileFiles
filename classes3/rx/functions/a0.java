// 
// Decompiled by Procyon v0.5.36
// 

package rx.functions;

public final class a0
{
    private a0() {
        throw new IllegalStateException("No instances!");
    }
    
    public static y<Void> a(final a a) {
        return new y<Void>() {
            public Void a(final Object... array) {
                if (array.length == 0) {
                    a.call();
                    return null;
                }
                throw new IllegalArgumentException("Action0 expecting 0 arguments.");
            }
        };
    }
    
    public static <T0> y<Void> b(final b<? super T0> b) {
        return new y<Void>() {
            public Void a(final Object... array) {
                if (array.length == 1) {
                    b.h(array[0]);
                    return null;
                }
                throw new IllegalArgumentException("Action1 expecting 1 argument.");
            }
        };
    }
    
    public static <T0, T1> y<Void> c(final c<? super T0, ? super T1> c) {
        return new y<Void>() {
            public Void a(final Object... array) {
                if (array.length == 2) {
                    c.s(array[0], array[1]);
                    return null;
                }
                throw new IllegalArgumentException("Action3 expecting 2 arguments.");
            }
        };
    }
    
    public static <T0, T1, T2> y<Void> d(final d<? super T0, ? super T1, ? super T2> d) {
        return new y<Void>() {
            public Void a(final Object... array) {
                if (array.length == 3) {
                    d.k(array[0], array[1], array[2]);
                    return null;
                }
                throw new IllegalArgumentException("Action3 expecting 3 arguments.");
            }
        };
    }
    
    public static <R> y<R> e(final o<? extends R> o) {
        return new y<R>() {
            @Override
            public R call(final Object... array) {
                if (array.length == 0) {
                    return o.call();
                }
                throw new IllegalArgumentException("Func0 expecting 0 arguments.");
            }
        };
    }
    
    public static <T0, R> y<R> f(final p<? super T0, ? extends R> p) {
        return new y<R>() {
            @Override
            public R call(final Object... array) {
                if (array.length == 1) {
                    return p.h(array[0]);
                }
                throw new IllegalArgumentException("Func1 expecting 1 argument.");
            }
        };
    }
    
    public static <T0, T1, R> y<R> g(final q<? super T0, ? super T1, ? extends R> q) {
        return new y<R>() {
            @Override
            public R call(final Object... array) {
                if (array.length == 2) {
                    return q.s(array[0], array[1]);
                }
                throw new IllegalArgumentException("Func2 expecting 2 arguments.");
            }
        };
    }
    
    public static <T0, T1, T2, R> y<R> h(final r<? super T0, ? super T1, ? super T2, ? extends R> r) {
        return new y<R>() {
            @Override
            public R call(final Object... array) {
                if (array.length == 3) {
                    return r.k(array[0], array[1], array[2]);
                }
                throw new IllegalArgumentException("Func3 expecting 3 arguments.");
            }
        };
    }
    
    public static <T0, T1, T2, T3, R> y<R> i(final s<? super T0, ? super T1, ? super T2, ? super T3, ? extends R> s) {
        return new y<R>() {
            @Override
            public R call(final Object... array) {
                if (array.length == 4) {
                    return s.p(array[0], array[1], array[2], array[3]);
                }
                throw new IllegalArgumentException("Func4 expecting 4 arguments.");
            }
        };
    }
    
    public static <T0, T1, T2, T3, T4, R> y<R> j(final t<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> t) {
        return new y<R>() {
            @Override
            public R call(final Object... array) {
                if (array.length == 5) {
                    return t.j(array[0], array[1], array[2], array[3], array[4]);
                }
                throw new IllegalArgumentException("Func5 expecting 5 arguments.");
            }
        };
    }
    
    public static <T0, T1, T2, T3, T4, T5, R> y<R> k(final u<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> u) {
        return new y<R>() {
            @Override
            public R call(final Object... array) {
                if (array.length == 6) {
                    return u.u(array[0], array[1], array[2], array[3], array[4], array[5]);
                }
                throw new IllegalArgumentException("Func6 expecting 6 arguments.");
            }
        };
    }
    
    public static <T0, T1, T2, T3, T4, T5, T6, R> y<R> l(final v<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> v) {
        return new y<R>() {
            @Override
            public R call(final Object... array) {
                if (array.length == 7) {
                    return v.l(array[0], array[1], array[2], array[3], array[4], array[5], array[6]);
                }
                throw new IllegalArgumentException("Func7 expecting 7 arguments.");
            }
        };
    }
    
    public static <T0, T1, T2, T3, T4, T5, T6, T7, R> y<R> m(final w<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> w) {
        return new y<R>() {
            @Override
            public R call(final Object... array) {
                if (array.length == 8) {
                    return w.o(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7]);
                }
                throw new IllegalArgumentException("Func8 expecting 8 arguments.");
            }
        };
    }
    
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, R> y<R> n(final x<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> x) {
        return new y<R>() {
            @Override
            public R call(final Object... array) {
                if (array.length == 9) {
                    return x.y(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
                }
                throw new IllegalArgumentException("Func9 expecting 9 arguments.");
            }
        };
    }
}
