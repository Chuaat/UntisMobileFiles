// 
// Decompiled by Procyon v0.5.36
// 

package rx;

import rx.internal.operators.p4;
import rx.internal.operators.g5;
import java.util.concurrent.TimeoutException;
import rx.internal.operators.o4;
import rx.internal.operators.n4;
import rx.internal.operators.m4;
import rx.internal.operators.x4;
import rx.internal.operators.f5;
import rx.internal.operators.l4;
import rx.internal.operators.e5;
import rx.internal.operators.d5;
import rx.observers.e;
import rx.internal.operators.w4;
import rx.internal.operators.a5;
import rx.internal.operators.b5;
import rx.internal.operators.v4;
import rx.internal.operators.y4;
import rx.functions.a;
import rx.internal.operators.i;
import rx.internal.operators.h5;
import rx.functions.q;
import rx.functions.r;
import rx.functions.s;
import rx.functions.t;
import rx.functions.u;
import rx.functions.v;
import rx.functions.w;
import java.util.Iterator;
import java.util.Collection;
import rx.functions.x;
import rx.internal.operators.r4;
import rx.internal.operators.c5;
import rx.functions.y;
import rx.internal.operators.q4;
import java.util.concurrent.Callable;
import rx.internal.operators.z4;
import rx.functions.b;
import rx.functions.p;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import rx.internal.operators.s4;
import java.util.concurrent.Future;
import rx.subscriptions.f;
import rx.internal.operators.u4;
import rx.plugins.c;
import rx.internal.operators.t4;

public class k<T>
{
    final t<T> a;
    
    @Deprecated
    protected k(final g.a<T> a) {
        this.a = c.H(new t4<T>(a));
    }
    
    protected k(final t<T> t) {
        this.a = c.H(t);
    }
    
    private o B0(final n<? super T> n, final boolean b) {
        Label_0008: {
            if (!b) {
                break Label_0008;
            }
            try {
                n.f();
                c.T(this, this.a).h(u4.b(n));
                return c.S(n);
            }
            finally {
                final Throwable t;
                rx.exceptions.c.e(t);
                try {
                    n.b(c.Q(t));
                    return f.e();
                }
                finally {
                    final Throwable cause;
                    rx.exceptions.c.e(cause);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Error occurred attempting to subscribe [");
                    sb.append(t.getMessage());
                    sb.append("] and then again while trying to pass to onError.");
                    c.Q(new RuntimeException(sb.toString(), cause));
                }
            }
        }
    }
    
    public static <T> k<T> C(final Future<? extends T> future) {
        return n((t<T>)new s4(future, 0L, null));
    }
    
    public static <T> k<T> D(final Future<? extends T> future, final long n, final TimeUnit obj) {
        Objects.requireNonNull(obj, "unit is null");
        return n((t<T>)new s4(future, n, obj));
    }
    
    public static <T, Resource> k<T> D0(final rx.functions.o<Resource> o, final p<? super Resource, ? extends k<? extends T>> p3, final b<? super Resource> b) {
        return E0(o, p3, b, false);
    }
    
    public static <T> k<T> E(final Future<? extends T> future, final j j) {
        return C(future).n0(j);
    }
    
    public static <T, Resource> k<T> E0(final rx.functions.o<Resource> obj, final p<? super Resource, ? extends k<? extends T>> obj2, final b<? super Resource> obj3, final boolean b) {
        Objects.requireNonNull(obj, "resourceFactory is null");
        Objects.requireNonNull(obj2, "singleFactory is null");
        Objects.requireNonNull(obj3, "disposeAction is null");
        return n((t<T>)new z4((rx.functions.o<Object>)obj, (p<? super Object, ? extends k<?>>)obj2, (b<? super Object>)obj3, b));
    }
    
    public static <T> k<T> F(final Callable<? extends T> callable) {
        return n((t<T>)new q4(callable));
    }
    
    public static <R> k<R> F0(final Iterable<? extends k<?>> iterable, final y<? extends R> y) {
        return c5.a(H(iterable), y);
    }
    
    public static <T> k<T> G(final b<l<T>> obj) {
        Objects.requireNonNull(obj, "producer is null");
        return n((t<T>)new r4((b<l<Object>>)obj));
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> k<R> G0(final k<? extends T1> k, final k<? extends T2> i, final k<? extends T3> j, final k<? extends T4> l, final k<? extends T5> m, final k<? extends T6> k2, final k<? extends T7> k3, final k<? extends T8> k4, final k<? extends T9> k5, final x<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> x) {
        return c5.a((k<?>[])new k[] { k, i, j, l, m, k2, k3, k4, k5 }, (y<? extends R>)new y<R>() {
            @Override
            public R call(final Object... array) {
                return x.y(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
            }
        });
    }
    
    static <T> k<? extends T>[] H(final Iterable<? extends k<? extends T>> iterable) {
        k<? extends T>[] array;
        if (iterable instanceof Collection) {
            final Collection<k> collection = (Collection<k>)iterable;
            array = collection.toArray(new k[collection.size()]);
        }
        else {
            final k[] array2 = new k[8];
            final Iterator<k<? extends T>> iterator = iterable.iterator();
            int n = 0;
            array = (k<? extends T>[])array2;
            while (iterator.hasNext()) {
                final k<? extends T> k = iterator.next();
                k<? extends T>[] array3 = array;
                if (n == array.length) {
                    array3 = (k<? extends T>[])new k[(n >> 2) + n];
                    System.arraycopy(array, 0, array3, 0, n);
                }
                array3[n] = k;
                ++n;
                array = array3;
            }
            if (array.length != n) {
                final k[] array4 = new k[n];
                System.arraycopy(array, 0, array4, 0, n);
                array = (k<? extends T>[])array4;
            }
        }
        return array;
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> k<R> H0(final k<? extends T1> k, final k<? extends T2> i, final k<? extends T3> j, final k<? extends T4> l, final k<? extends T5> m, final k<? extends T6> k2, final k<? extends T7> k3, final k<? extends T8> k4, final w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> w) {
        return c5.a((k<?>[])new k[] { k, i, j, l, m, k2, k3, k4 }, (y<? extends R>)new y<R>() {
            @Override
            public R call(final Object... array) {
                return w.o(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7]);
            }
        });
    }
    
    public static <T> k<T> I(final T t) {
        return rx.internal.util.p.P0(t);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, R> k<R> I0(final k<? extends T1> k, final k<? extends T2> i, final k<? extends T3> j, final k<? extends T4> l, final k<? extends T5> m, final k<? extends T6> k2, final k<? extends T7> k3, final v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> v) {
        return c5.a((k<?>[])new k[] { k, i, j, l, m, k2, k3 }, (y<? extends R>)new y<R>() {
            @Override
            public R call(final Object... array) {
                return v.l(array[0], array[1], array[2], array[3], array[4], array[5], array[6]);
            }
        });
    }
    
    public static <T1, T2, T3, T4, T5, T6, R> k<R> J0(final k<? extends T1> k, final k<? extends T2> i, final k<? extends T3> j, final k<? extends T4> l, final k<? extends T5> m, final k<? extends T6> k2, final rx.functions.u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> u) {
        return c5.a((k<?>[])new k[] { k, i, j, l, m, k2 }, (y<? extends R>)new y<R>() {
            @Override
            public R call(final Object... array) {
                return u.u(array[0], array[1], array[2], array[3], array[4], array[5]);
            }
        });
    }
    
    public static <T1, T2, T3, T4, T5, R> k<R> K0(final k<? extends T1> k, final k<? extends T2> i, final k<? extends T3> j, final k<? extends T4> l, final k<? extends T5> m, final rx.functions.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> t) {
        return c5.a((k<?>[])new k[] { k, i, j, l, m }, (y<? extends R>)new y<R>() {
            @Override
            public R call(final Object... array) {
                return t.j(array[0], array[1], array[2], array[3], array[4]);
            }
        });
    }
    
    public static <T> g<T> L(final g<? extends k<? extends T>> g) {
        return M(g, Integer.MAX_VALUE);
    }
    
    public static <T1, T2, T3, T4, R> k<R> L0(final k<? extends T1> k, final k<? extends T2> i, final k<? extends T3> j, final k<? extends T4> l, final s<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> s) {
        return c5.a((k<?>[])new k[] { k, i, j, l }, (y<? extends R>)new y<R>() {
            @Override
            public R call(final Object... array) {
                return s.p(array[0], array[1], array[2], array[3]);
            }
        });
    }
    
    public static <T> g<T> M(final g<? extends k<? extends T>> g, final int n) {
        return g.y2((p<? super k<? extends T>, ? extends k<? extends T>>)rx.internal.util.s.c(), false, n);
    }
    
    public static <T1, T2, T3, R> k<R> M0(final k<? extends T1> k, final k<? extends T2> i, final k<? extends T3> j, final r<? super T1, ? super T2, ? super T3, ? extends R> r) {
        return c5.a((k<?>[])new k[] { k, i, j }, (y<? extends R>)new y<R>() {
            @Override
            public R call(final Object... array) {
                return r.k(array[0], array[1], array[2]);
            }
        });
    }
    
    public static <T> g<T> N(final k<? extends T> k, final k<? extends T> i) {
        return g.r3((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i));
    }
    
    public static <T1, T2, R> k<R> N0(final k<? extends T1> k, final k<? extends T2> i, final q<? super T1, ? super T2, ? extends R> q) {
        return c5.a((k<?>[])new k[] { k, i }, (y<? extends R>)new y<R>() {
            @Override
            public R call(final Object... array) {
                return q.s(array[0], array[1]);
            }
        });
    }
    
    public static <T> g<T> O(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j) {
        return g.s3((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j));
    }
    
    public static <T> g<T> P(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j, final k<? extends T> l) {
        return g.t3((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j), (g<? extends T>)a((k<? extends T>)l));
    }
    
    public static <T> g<T> Q(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j, final k<? extends T> l, final k<? extends T> m) {
        return g.u3((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j), (g<? extends T>)a((k<? extends T>)l), (g<? extends T>)a((k<? extends T>)m));
    }
    
    public static <T> g<T> R(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j, final k<? extends T> l, final k<? extends T> m, final k<? extends T> k2) {
        return g.v3((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j), (g<? extends T>)a((k<? extends T>)l), (g<? extends T>)a((k<? extends T>)m), (g<? extends T>)a((k<? extends T>)k2));
    }
    
    public static <T> g<T> S(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j, final k<? extends T> l, final k<? extends T> m, final k<? extends T> k2, final k<? extends T> k3) {
        return g.w3((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j), (g<? extends T>)a((k<? extends T>)l), (g<? extends T>)a((k<? extends T>)m), (g<? extends T>)a((k<? extends T>)k2), (g<? extends T>)a((k<? extends T>)k3));
    }
    
    public static <T> g<T> T(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j, final k<? extends T> l, final k<? extends T> m, final k<? extends T> k2, final k<? extends T> k3, final k<? extends T> k4) {
        return g.x3((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j), (g<? extends T>)a((k<? extends T>)l), (g<? extends T>)a((k<? extends T>)m), (g<? extends T>)a((k<? extends T>)k2), (g<? extends T>)a((k<? extends T>)k3), (g<? extends T>)a((k<? extends T>)k4));
    }
    
    public static <T> g<T> U(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j, final k<? extends T> l, final k<? extends T> m, final k<? extends T> k2, final k<? extends T> k3, final k<? extends T> k4, final k<? extends T> k5) {
        return g.y3((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j), (g<? extends T>)a((k<? extends T>)l), (g<? extends T>)a((k<? extends T>)m), (g<? extends T>)a((k<? extends T>)k2), (g<? extends T>)a((k<? extends T>)k3), (g<? extends T>)a((k<? extends T>)k4), (g<? extends T>)a((k<? extends T>)k5));
    }
    
    public static <T> k<T> V(final k<? extends k<? extends T>> k) {
        if (k instanceof rx.internal.util.p) {
            return ((rx.internal.util.p<Object>)k).R0((p<? super Object, ? extends k<? extends T>>)rx.internal.util.s.c());
        }
        return n((t<T>)new t<T>() {
            public void a(final m<? super T> m) {
                final m<k<? extends T>> i = new m<k<? extends T>>() {
                    @Override
                    public void b(final Throwable t) {
                        m.b(t);
                    }
                    
                    public void m(final k<? extends T> k) {
                        k.j0(m);
                    }
                };
                m.d(i);
                k.j0(i);
            }
        });
    }
    
    public static <T> g<T> W(final g<? extends k<? extends T>> g) {
        return M(g, Integer.MAX_VALUE);
    }
    
    public static <T> g<T> X(final g<? extends k<? extends T>> g, final int n) {
        return g.y2((p<? super k<? extends T>, ? extends k<? extends T>>)rx.internal.util.s.c(), true, n);
    }
    
    private static <T> g<T> a(final k<T> k) {
        return g.Q6((g.a<T>)new h5((t<Object>)k.a));
    }
    
    public static <T> g<T> e(final k<? extends T> k, final k<? extends T> i) {
        return g.D0((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i));
    }
    
    public static <T> g<T> f(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j) {
        return g.E0((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j));
    }
    
    public static <T> g<T> g(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j, final k<? extends T> l) {
        return g.F0((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j), (g<? extends T>)a((k<? extends T>)l));
    }
    
    public static <T> g<T> h(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j, final k<? extends T> l, final k<? extends T> m) {
        return g.G0((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j), (g<? extends T>)a((k<? extends T>)l), (g<? extends T>)a((k<? extends T>)m));
    }
    
    public static <T> g<T> i(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j, final k<? extends T> l, final k<? extends T> m, final k<? extends T> k2) {
        return g.H0((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j), (g<? extends T>)a((k<? extends T>)l), (g<? extends T>)a((k<? extends T>)m), (g<? extends T>)a((k<? extends T>)k2));
    }
    
    public static <T> g<T> j(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j, final k<? extends T> l, final k<? extends T> m, final k<? extends T> k2, final k<? extends T> k3) {
        return g.I0((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j), (g<? extends T>)a((k<? extends T>)l), (g<? extends T>)a((k<? extends T>)m), (g<? extends T>)a((k<? extends T>)k2), (g<? extends T>)a((k<? extends T>)k3));
    }
    
    public static <T> g<T> k(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j, final k<? extends T> l, final k<? extends T> m, final k<? extends T> k2, final k<? extends T> k3, final k<? extends T> k4) {
        return g.J0((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j), (g<? extends T>)a((k<? extends T>)l), (g<? extends T>)a((k<? extends T>)m), (g<? extends T>)a((k<? extends T>)k2), (g<? extends T>)a((k<? extends T>)k3), (g<? extends T>)a((k<? extends T>)k4));
    }
    
    public static <T> g<T> l(final k<? extends T> k, final k<? extends T> i, final k<? extends T> j, final k<? extends T> l, final k<? extends T> m, final k<? extends T> k2, final k<? extends T> k3, final k<? extends T> k4, final k<? extends T> k5) {
        return g.K0((g<? extends T>)a((k<? extends T>)k), (g<? extends T>)a((k<? extends T>)i), (g<? extends T>)a((k<? extends T>)j), (g<? extends T>)a((k<? extends T>)l), (g<? extends T>)a((k<? extends T>)m), (g<? extends T>)a((k<? extends T>)k2), (g<? extends T>)a((k<? extends T>)k3), (g<? extends T>)a((k<? extends T>)k4), (g<? extends T>)a((k<? extends T>)k5));
    }
    
    public static <T> k<T> n(final t<T> t) {
        return new k<T>(t);
    }
    
    public static <T> k<T> o(final Callable<k<T>> callable) {
        return n((t<T>)new t<T>() {
            public void a(final m<? super T> m) {
                try {
                    callable.call().j0((m<? super Object>)m);
                }
                finally {
                    final Throwable t;
                    rx.exceptions.c.e(t);
                    m.b(t);
                }
            }
        });
    }
    
    public static <T> k<T> y(final Throwable t) {
        return n((t<T>)new t<T>() {
            public void a(final m<? super T> m) {
                m.b(t);
            }
        });
    }
    
    public final rx.b A(final p<? super T, ? extends rx.b> p) {
        return rx.b.p((rx.b.j0)new i((k<Object>)this, (p<? super Object, ? extends rx.b>)p));
    }
    
    public final o A0(final n<? super T> n) {
        return this.B0(n, true);
    }
    
    public final <R> g<R> B(final p<? super T, ? extends g<? extends R>> p) {
        return g.p3((g<? extends g<? extends R>>)a(this.K((p<? super T, ? extends g<? extends T>>)p)));
    }
    
    @r7.b
    public final k<T> C0(final j j) {
        return n((t<T>)new t<T>() {
            public void a(final m<? super T> m) {
                final m<T> i = new m<T>() {
                    @Override
                    public void b(final Throwable t) {
                        m.b(t);
                    }
                    
                    @Override
                    public void e(final T t) {
                        m.e(t);
                    }
                };
                m.d(f.a(new a() {
                    @Override
                    public void call() {
                        final j.a a = j.a();
                        a.c(new a() {
                            @Override
                            public void call() {
                                try {
                                    i.i();
                                }
                                finally {
                                    a.i();
                                }
                            }
                        });
                    }
                }));
                k.this.j0(i);
            }
        });
    }
    
    public final <R> k<R> J(final g.b<? extends R, ? super T> b) {
        return n((t<R>)new u4((t<Object>)this.a, (g.b<?, ? super Object>)b));
    }
    
    public final <R> k<R> K(final p<? super T, ? extends R> p) {
        return n((t<R>)new y4((k<Object>)this, (p<? super Object, ?>)p));
    }
    
    public final <T2, R> k<R> O0(final k<? extends T2> k, final q<? super T, ? super T2, ? extends R> q) {
        return N0((k<?>)this, (k<?>)k, (q<? super Object, ? super Object, ? extends R>)q);
    }
    
    public final g<T> Y(final k<? extends T> k) {
        return N((k<? extends T>)this, k);
    }
    
    public final k<T> Z(final j obj) {
        if (this instanceof rx.internal.util.p) {
            return ((rx.internal.util.p)this).S0(obj);
        }
        Objects.requireNonNull(obj, "scheduler is null");
        return n((t<T>)new v4((t<Object>)this.a, obj));
    }
    
    public final k<T> a0(final k<? extends T> k) {
        return new k<T>((t<T>)b5.c((k<?>)this, (k<?>)k));
    }
    
    public final k<T> b() {
        return this.z0().N(1).L6();
    }
    
    public final k<T> b0(final p<Throwable, ? extends k<? extends T>> p) {
        return new k<T>((t<T>)b5.b((k<?>)this, (p<Throwable, ? extends k<?>>)p));
    }
    
    @r7.b
    public final <R> k<R> c(final Class<R> clazz) {
        return this.K((p<? super T, ? extends R>)new a5<Object, R>((Class<? extends R>)clazz));
    }
    
    public final k<T> c0(final p<Throwable, ? extends T> p) {
        return n((t<T>)new w4((t<Object>)this.a, p));
    }
    
    public <R> k<R> d(final u<? super T, ? extends R> u) {
        return u.h(this);
    }
    
    public final k<T> d0() {
        return this.z0().K4().L6();
    }
    
    public final k<T> e0(final long n) {
        return this.z0().L4(n).L6();
    }
    
    public final k<T> f0(final q<Integer, Throwable, Boolean> q) {
        return this.z0().M4(q).L6();
    }
    
    public final k<T> g0(final p<g<? extends Throwable>, ? extends g<?>> p) {
        return this.z0().N4(p).L6();
    }
    
    public final o h0() {
        return this.m0(rx.functions.m.a(), rx.functions.m.b());
    }
    
    public final o i0(final h<? super T> obj) {
        Objects.requireNonNull(obj, "observer is null");
        return this.j0(new m<T>() {
            @Override
            public void b(final Throwable t) {
                obj.b(t);
            }
            
            @Override
            public void e(final T t) {
                obj.m(t);
                obj.c();
            }
        });
    }
    
    public final o j0(final m<? super T> m) {
        if (m != null) {
            try {
                c.T(this, this.a).h(m);
                return c.S(m);
            }
            finally {
                final Throwable t;
                rx.exceptions.c.e(t);
                try {
                    m.b(c.Q(t));
                    return f.b();
                }
                finally {
                    final Throwable cause;
                    rx.exceptions.c.e(cause);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Error occurred attempting to subscribe [");
                    sb.append(t.getMessage());
                    sb.append("] and then again while trying to pass to onError.");
                    c.Q(new RuntimeException(sb.toString(), cause));
                }
            }
        }
        throw new IllegalArgumentException("te is null");
    }
    
    public final o k0(final n<? super T> n) {
        if (n == null) {
            throw new IllegalArgumentException("observer can not be null");
        }
        n.f();
        if (!(n instanceof e)) {
            return this.B0(new e<Object>(n), false);
        }
        return this.B0(n, true);
    }
    
    public final o l0(final b<? super T> b) {
        return this.m0(b, rx.functions.m.b());
    }
    
    public final g<T> m(final k<? extends T> k) {
        return e((k<? extends T>)this, k);
    }
    
    public final o m0(final b<? super T> b, final b<Throwable> b2) {
        if (b == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        }
        if (b2 != null) {
            return this.j0(new m<T>() {
                @Override
                public final void b(final Throwable t) {
                    try {
                        b2.h(t);
                    }
                    finally {
                        this.i();
                    }
                }
                
                @Override
                public final void e(final T t) {
                    try {
                        b.h(t);
                    }
                    finally {
                        this.i();
                    }
                }
            });
        }
        throw new IllegalArgumentException("onError can not be null");
    }
    
    public final k<T> n0(final j j) {
        if (this instanceof rx.internal.util.p) {
            return ((rx.internal.util.p)this).S0(j);
        }
        return n((t<T>)new t<T>() {
            public void a(final m<? super T> m) {
                final j.a a = j.a();
                m.d(a);
                a.c(new a() {
                    @Override
                    public void call() {
                        final m<T> m = new m<T>() {
                            @Override
                            public void b(final Throwable t) {
                                try {
                                    m.b(t);
                                }
                                finally {
                                    a.i();
                                }
                            }
                            
                            @Override
                            public void e(final T t) {
                                try {
                                    m.e(t);
                                }
                                finally {
                                    a.i();
                                }
                            }
                        };
                        m.d(m);
                        k.this.j0(m);
                    }
                });
            }
        });
    }
    
    public final k<T> o0(final rx.b b) {
        return n((t<T>)new d5((t<Object>)this.a, b));
    }
    
    public final k<T> p(final long n, final TimeUnit timeUnit) {
        return this.q(n, timeUnit, rx.schedulers.c.a());
    }
    
    public final <E> k<T> p0(final g<? extends E> g) {
        return n((t<T>)new e5((t<Object>)this.a, g));
    }
    
    public final k<T> q(final long n, final TimeUnit timeUnit, final j j) {
        return n((t<T>)new l4((t<Object>)this.a, n, timeUnit, j));
    }
    
    public final <E> k<T> q0(final k<? extends E> k) {
        return n((t<T>)new f5((t<Object>)this.a, k));
    }
    
    public final k<T> r(final g<?> obj) {
        Objects.requireNonNull(obj);
        return n((t<T>)new x4(this, obj));
    }
    
    public final rx.observers.a<T> r0() {
        final s7.a<? super T> w = s7.a.w(Long.MAX_VALUE);
        this.k0(w);
        return (rx.observers.a<T>)w;
    }
    
    public final k<T> s(final a a) {
        return n((t<T>)new m4((k<Object>)this, a));
    }
    
    public final k<T> s0(final long n, final TimeUnit timeUnit) {
        return this.v0(n, timeUnit, null, rx.schedulers.c.a());
    }
    
    public final k<T> t(final b<rx.f<? extends T>> b) {
        if (b != null) {
            return n((t<T>)new n4((k<Object>)this, (b<? super Object>)new b<T>() {
                @Override
                public void h(final T t) {
                    b.h(rx.f.e(t));
                }
            }, new b<Throwable>() {
                public void a(final Throwable t) {
                    b.h(rx.f.d(t));
                }
            }));
        }
        throw new IllegalArgumentException("onNotification is null");
    }
    
    public final k<T> t0(final long n, final TimeUnit timeUnit, final j j) {
        return this.v0(n, timeUnit, null, j);
    }
    
    public final k<T> u(final b<Throwable> b) {
        if (b != null) {
            return n((t<T>)new n4((k<Object>)this, rx.functions.m.a(), new b<Throwable>() {
                public void a(final Throwable t) {
                    b.h(t);
                }
            }));
        }
        throw new IllegalArgumentException("onError is null");
    }
    
    public final k<T> u0(final long n, final TimeUnit timeUnit, final k<? extends T> k) {
        return this.v0(n, timeUnit, k, rx.schedulers.c.a());
    }
    
    public final k<T> v(final a a) {
        return n((t<T>)new o4((t<Object>)this.a, a));
    }
    
    public final k<T> v0(final long n, final TimeUnit timeUnit, final k<? extends T> k, final j j) {
        k<? extends T> o = k;
        if (k == null) {
            o = o((Callable<k<? extends T>>)new rx.functions.o<k<T>>() {
                public k<T> a() {
                    return k.y(new TimeoutException());
                }
            });
        }
        return n((t<T>)new g5((t<Object>)this.a, n, timeUnit, j, (t<?>)o.a));
    }
    
    public final k<T> w(final b<? super T> b) {
        if (b != null) {
            return n((t<T>)new n4((k<Object>)this, (b<? super Object>)b, (b<Throwable>)rx.functions.m.a()));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }
    
    public final <R> R w0(final p<? super k<T>, R> p) {
        return p.h(this);
    }
    
    public final k<T> x(final a a) {
        return n((t<T>)new p4((t<Object>)this.a, a));
    }
    
    public final rx.singles.a<T> x0() {
        return rx.singles.a.a((k<? extends T>)this);
    }
    
    public final rx.b y0() {
        return rx.b.K(this);
    }
    
    public final <R> k<R> z(final p<? super T, ? extends k<? extends R>> p) {
        if (this instanceof rx.internal.util.p) {
            return ((rx.internal.util.p)this).R0(p);
        }
        return V(this.K(p));
    }
    
    public final g<T> z0() {
        return a(this);
    }
    
    public interface t<T> extends b<m<? super T>>
    {
    }
    
    public interface u<T, R> extends p<k<T>, k<R>>
    {
    }
}
