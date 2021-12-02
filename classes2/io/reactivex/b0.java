// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex;

import io.reactivex.internal.operators.observable.j3;
import io.reactivex.internal.operators.observable.q2;
import io.reactivex.internal.operators.observable.p2;
import io.reactivex.internal.operators.observable.d0;
import io.reactivex.internal.operators.observable.h3;
import io.reactivex.internal.operators.observable.o2;
import io.reactivex.internal.operators.observable.e4;
import io.reactivex.internal.operators.observable.u3;
import io.reactivex.internal.operators.observable.x1;
import io.reactivex.internal.operators.observable.m2;
import io.reactivex.internal.operators.observable.l2;
import io.reactivex.internal.operators.observable.g3;
import io.reactivex.internal.operators.observable.k2;
import io.reactivex.internal.operators.observable.t3;
import io.reactivex.internal.operators.observable.z;
import io.reactivex.internal.operators.observable.c4;
import io.reactivex.internal.operators.observable.s3;
import io.reactivex.internal.operators.observable.r3;
import io.reactivex.internal.operators.observable.f3;
import io.reactivex.internal.operators.observable.g2;
import java.util.Iterator;
import io.reactivex.internal.operators.observable.h2;
import io.reactivex.internal.operators.observable.r1;
import io.reactivex.internal.operators.observable.x;
import io.reactivex.internal.operators.observable.d3;
import java.util.NoSuchElementException;
import io.reactivex.internal.operators.observable.e3;
import io.reactivex.internal.operators.observable.m4;
import io.reactivex.internal.operators.observable.c3;
import io.reactivex.internal.operators.observable.f2;
import io.reactivex.internal.operators.observable.v0;
import io.reactivex.internal.operators.observable.q3;
import io.reactivex.internal.operators.observable.e2;
import io.reactivex.internal.operators.observable.o3;
import io.reactivex.internal.operators.observable.p3;
import io.reactivex.internal.operators.observable.m1;
import io.reactivex.internal.operators.observable.d2;
import io.reactivex.internal.operators.observable.n1;
import io.reactivex.internal.operators.observable.z2;
import io.reactivex.internal.operators.observable.l1;
import io.reactivex.internal.operators.observable.s0;
import java.util.Map;
import io.reactivex.internal.operators.observable.y2;
import io.reactivex.internal.operators.observable.r0;
import io.reactivex.internal.operators.observable.n3;
import io.reactivex.internal.operators.observable.b4;
import io.reactivex.internal.operators.observable.b2;
import io.reactivex.internal.operators.observable.j1;
import io.reactivex.internal.operators.observable.w2;
import io.reactivex.internal.operators.observable.t;
import io.reactivex.internal.operators.observable.a2;
import io.reactivex.internal.operators.observable.p0;
import io.reactivex.internal.operators.flowable.n2;
import io.reactivex.internal.operators.flowable.k1;
import io.reactivex.internal.operators.observable.z1;
import io.reactivex.internal.operators.observable.w;
import io.reactivex.internal.operators.observable.v2;
import io.reactivex.internal.operators.observable.u2;
import io.reactivex.internal.operators.observable.n0;
import io.reactivex.internal.operators.observable.s2;
import io.reactivex.internal.operators.observable.t2;
import io.reactivex.internal.operators.observable.m0;
import io.reactivex.internal.operators.observable.k4;
import io.reactivex.internal.operators.observable.x2;
import io.reactivex.internal.operators.observable.j4;
import io.reactivex.internal.operators.observable.l0;
import io.reactivex.internal.operators.observable.l3;
import io.reactivex.internal.operators.observable.k3;
import io.reactivex.internal.operators.observable.h4;
import io.reactivex.internal.observers.p;
import io.reactivex.annotations.e;
import io.reactivex.internal.operators.observable.q;
import io.reactivex.internal.operators.observable.g4;
import x5.r;
import io.reactivex.internal.operators.observable.h0;
import io.reactivex.internal.operators.observable.f4;
import io.reactivex.internal.operators.observable.w3;
import io.reactivex.internal.operators.observable.a1;
import java.util.Collection;
import io.reactivex.internal.operators.observable.i4;
import io.reactivex.internal.operators.observable.z0;
import io.reactivex.internal.operators.observable.y1;
import io.reactivex.internal.operators.observable.w1;
import io.reactivex.internal.operators.observable.v1;
import io.reactivex.internal.operators.observable.b1;
import java.util.Comparator;
import io.reactivex.internal.operators.observable.u1;
import io.reactivex.internal.operators.observable.y0;
import io.reactivex.internal.operators.observable.v3;
import java.util.List;
import io.reactivex.internal.operators.observable.r2;
import io.reactivex.internal.operators.observable.t1;
import io.reactivex.internal.operators.observable.f0;
import io.reactivex.internal.operators.observable.c0;
import io.reactivex.internal.operators.observable.d4;
import io.reactivex.internal.operators.observable.j2;
import io.reactivex.internal.operators.observable.i2;
import io.reactivex.internal.operators.observable.s1;
import io.reactivex.internal.operators.observable.q1;
import io.reactivex.internal.operators.observable.u;
import io.reactivex.internal.operators.observable.b3;
import io.reactivex.internal.operators.observable.u0;
import io.reactivex.internal.operators.observable.p1;
import io.reactivex.internal.operators.observable.t0;
import io.reactivex.internal.operators.observable.l4;
import io.reactivex.internal.operators.observable.a4;
import io.reactivex.internal.operators.observable.c2;
import io.reactivex.internal.operators.observable.m3;
import x5.i;
import io.reactivex.internal.operators.observable.o0;
import io.reactivex.internal.operators.observable.i1;
import x5.l;
import x5.g;
import x5.m;
import x5.c;
import io.reactivex.internal.operators.observable.o1;
import x5.n;
import io.reactivex.internal.operators.observable.z3;
import io.reactivex.internal.operators.observable.g1;
import io.reactivex.internal.operators.observable.h1;
import io.reactivex.internal.operators.observable.f1;
import io.reactivex.internal.operators.observable.x3;
import io.reactivex.internal.operators.observable.y3;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.operators.observable.e1;
import java.util.concurrent.Future;
import io.reactivex.internal.operators.observable.d1;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.observable.c1;
import io.reactivex.internal.operators.observable.w0;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.internal.util.j;
import x5.o;
import io.reactivex.internal.functions.a;
import io.reactivex.annotations.f;
import io.reactivex.annotations.h;
import io.reactivex.annotations.d;
import io.reactivex.internal.functions.b;

public abstract class b0<T> implements g0<T>
{
    @d
    @h("none")
    @f
    public static <T> b0<T> A0(final g0<? extends T> g0, final g0<? extends T> g2, final g0<? extends T> g3, final g0<? extends T> g4) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        return C0(g0, g2, g3, g4);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> B0(final Iterable<? extends g0<? extends T>> iterable) {
        b.g(iterable, "sources is null");
        return S2((Iterable<?>)iterable).X0((o<? super Object, ? extends g0<? extends T>>)a.k(), X(), false);
    }
    
    @d
    @h("none")
    public static <T> b0<T> C0(final g0<? extends T>... array) {
        if (array.length == 0) {
            return h2();
        }
        if (array.length == 1) {
            return S7((g0<T>)array[0]);
        }
        return io.reactivex.plugins.a.R((b0<T>)new v((g0<Object>)M2(array), (o<? super Object, ? extends g0<?>>)a.k(), X(), j.H));
    }
    
    @d
    @h("none")
    public static <T> b0<T> D0(final g0<? extends T>... array) {
        if (array.length == 0) {
            return h2();
        }
        if (array.length == 1) {
            return S7((g0<T>)array[0]);
        }
        return I0((g0<? extends g0<? extends T>>)M2(array));
    }
    
    @d
    @h("none")
    public static <T> b0<T> E0(final int n, final int n2, final g0<? extends T>... array) {
        return M2(array).a1((o<? super g0<? extends T>, ? extends g0<? extends T>>)a.k(), n, n2, false);
    }
    
    @d
    @h("none")
    public static <T> b0<T> F0(final g0<? extends T>... array) {
        return E0(X(), X(), array);
    }
    
    @d
    @h("none")
    public static <T> b0<T> F3(final g0<? extends g0<? extends T>> g0) {
        b.g(g0, "sources is null");
        return io.reactivex.plugins.a.R((b0<T>)new w0((g0<Object>)g0, (o<? super Object, ? extends g0<?>>)a.k(), false, Integer.MAX_VALUE, X()));
    }
    
    @d
    @h("none")
    public static <T> b0<T> G0(final int n, final int n2, final g0<? extends T>... array) {
        return M2(array).a1((o<? super g0<? extends T>, ? extends g0<? extends T>>)a.k(), n, n2, true);
    }
    
    @d
    @h("none")
    public static <T> b0<T> G3(final g0<? extends g0<? extends T>> g0, final int n) {
        b.g(g0, "sources is null");
        b.h(n, "maxConcurrency");
        return io.reactivex.plugins.a.R((b0<T>)new w0((g0<Object>)g0, (o<? super Object, ? extends g0<?>>)a.k(), false, n, X()));
    }
    
    @d
    @h("none")
    public static <T> b0<T> H0(final g0<? extends T>... array) {
        return G0(X(), X(), array);
    }
    
    @d
    @h("none")
    public static <T> b0<T> H3(final g0<? extends T> g0, final g0<? extends T> g2) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        return M2(g0, g2).y2((o<? super g0, ? extends g0<? extends T>>)a.k(), false, 2);
    }
    
    @d
    @h("none")
    public static <T> b0<T> I0(final g0<? extends g0<? extends T>> g0) {
        return J0(g0, X(), true);
    }
    
    @d
    @h("none")
    public static <T> b0<T> I3(final g0<? extends T> g0, final g0<? extends T> g2, final g0<? extends T> g3) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        return M2(g0, g2, g3).y2((o<? super g0, ? extends g0<? extends T>>)a.k(), false, 3);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> J0(final g0<? extends g0<? extends T>> g0, final int n, final boolean b) {
        b.g(g0, "sources is null");
        b.h(n, "prefetch is null");
        final o<Object, Object> k = a.k();
        j j;
        if (b) {
            j = io.reactivex.internal.util.j.I;
        }
        else {
            j = io.reactivex.internal.util.j.H;
        }
        return io.reactivex.plugins.a.R((b0<T>)new v((g0<Object>)g0, (o<? super Object, ? extends g0<?>>)k, n, j));
    }
    
    @d
    @h("none")
    public static <T> b0<T> J3(final g0<? extends T> g0, final g0<? extends T> g2, final g0<? extends T> g3, final g0<? extends T> g4) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        return M2(g0, g2, g3, g4).y2((o<? super g0, ? extends g0<? extends T>>)a.k(), false, 4);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> K0(final Iterable<? extends g0<? extends T>> iterable) {
        b.g(iterable, "sources is null");
        return I0((g0<? extends g0<? extends T>>)S2((Iterable<?>)iterable));
    }
    
    @d
    @h("none")
    public static <T> b0<T> K3(final Iterable<? extends g0<? extends T>> iterable) {
        return S2((Iterable<?>)iterable).o2((o<? super Object, ? extends g0<? extends T>>)a.k());
    }
    
    @d
    @h("none")
    public static <T> b0<T> L0(final g0<? extends g0<? extends T>> g0) {
        return M0(g0, X(), X());
    }
    
    @d
    @h("none")
    public static <T> b0<T> L3(final Iterable<? extends g0<? extends T>> iterable, final int n) {
        return S2((Iterable<?>)iterable).p2((o<? super Object, ? extends g0<? extends T>>)a.k(), n);
    }
    
    @d
    @h("none")
    public static <T> b0<T> M0(final g0<? extends g0<? extends T>> g0, final int n, final int n2) {
        return S7((g0<Object>)g0).Z0((o<? super Object, ? extends g0<? extends T>>)a.k(), n, n2);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> M2(final T... array) {
        b.g(array, "items is null");
        if (array.length == 0) {
            return h2();
        }
        if (array.length == 1) {
            return p3(array[0]);
        }
        return io.reactivex.plugins.a.R(new c1<T>(array));
    }
    
    @d
    @h("none")
    public static <T> b0<T> M3(final Iterable<? extends g0<? extends T>> iterable, final int n, final int n2) {
        return S2((Iterable<?>)iterable).z2((o<? super Object, ? extends g0<? extends T>>)a.k(), false, n, n2);
    }
    
    @d
    @h("none")
    public static <T> b0<T> N0(final Iterable<? extends g0<? extends T>> iterable) {
        return O0(iterable, X(), X());
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> N2(final Callable<? extends T> callable) {
        b.g(callable, "supplier is null");
        return io.reactivex.plugins.a.R(new d1<T>(callable));
    }
    
    @d
    @h("none")
    public static <T> b0<T> N3(final int n, final int n2, final g0<? extends T>... array) {
        return M2(array).z2((o<? super g0<? extends T>, ? extends g0<? extends T>>)a.k(), false, n, n2);
    }
    
    @d
    @h("none")
    public static <T> b0<T> O0(final Iterable<? extends g0<? extends T>> iterable, final int n, final int n2) {
        return S2((Iterable<?>)iterable).a1((o<? super Object, ? extends g0<? extends T>>)a.k(), n, n2, false);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> O2(final Future<? extends T> future) {
        b.g(future, "future is null");
        return io.reactivex.plugins.a.R(new e1<T>(future, 0L, null));
    }
    
    @d
    @h("none")
    public static <T> b0<T> O3(final g0<? extends T>... array) {
        return M2(array).p2((o<? super g0<? extends T>, ? extends g0<? extends T>>)a.k(), array.length);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> P2(final Future<? extends T> future, final long n, final TimeUnit timeUnit) {
        b.g(future, "future is null");
        b.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.R(new e1<T>(future, n, timeUnit));
    }
    
    @d
    @h("none")
    public static <T> b0<T> P3(final int n, final int n2, final g0<? extends T>... array) {
        return M2(array).z2((o<? super g0<? extends T>, ? extends g0<? extends T>>)a.k(), true, n, n2);
    }
    
    @d
    @h("custom")
    @f
    public static <T> b0<T> Q2(final Future<? extends T> future, final long n, final TimeUnit timeUnit, final j0 j0) {
        b.g(j0, "scheduler is null");
        return P2(future, n, timeUnit).M5(j0);
    }
    
    @d
    @h("none")
    public static <T> b0<T> Q3(final g0<? extends T>... array) {
        return M2(array).y2((o<? super g0<? extends T>, ? extends g0<? extends T>>)a.k(), true, array.length);
    }
    
    private b0<T> Q6(final long n, final TimeUnit timeUnit, final g0<? extends T> g0, final j0 j0) {
        b.g(timeUnit, "timeUnit is null");
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R(new y3((b0<Object>)this, n, timeUnit, j0, g0));
    }
    
    @d
    @h("custom")
    @f
    public static <T> b0<T> R2(final Future<? extends T> future, final j0 j0) {
        b.g(j0, "scheduler is null");
        return O2(future).M5(j0);
    }
    
    @d
    @h("none")
    public static <T> b0<T> R3(final g0<? extends g0<? extends T>> g0) {
        b.g(g0, "sources is null");
        return io.reactivex.plugins.a.R((b0<T>)new w0((g0<Object>)g0, (o<? super Object, ? extends g0<?>>)a.k(), true, Integer.MAX_VALUE, X()));
    }
    
    private <U, V> b0<T> R6(final g0<U> g0, final o<? super T, ? extends g0<V>> o, final g0<? extends T> g2) {
        b.g(o, "itemTimeoutIndicator is null");
        return io.reactivex.plugins.a.R((b0<T>)new x3((b0<Object>)this, (g0<Object>)g0, (o<? super Object, ? extends g0<Object>>)o, g2));
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> S2(final Iterable<? extends T> iterable) {
        b.g(iterable, "source is null");
        return io.reactivex.plugins.a.R(new f1<T>(iterable));
    }
    
    @d
    @h("none")
    public static <T> b0<T> S3(final g0<? extends g0<? extends T>> g0, final int n) {
        b.g(g0, "sources is null");
        b.h(n, "maxConcurrency");
        return io.reactivex.plugins.a.R((b0<T>)new w0((g0<Object>)g0, (o<? super Object, ? extends g0<?>>)a.k(), true, n, X()));
    }
    
    @d
    @h("io.reactivex:computation")
    public static b0<Long> S6(final long n, final TimeUnit timeUnit) {
        return T6(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public static <T> b0<T> S7(final g0<T> g0) {
        b.g(g0, "source is null");
        if (g0 instanceof b0) {
            return io.reactivex.plugins.a.R((b0<T>)g0);
        }
        return io.reactivex.plugins.a.R(new h1<T>(g0));
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.J)
    @d
    @h("none")
    @f
    public static <T> b0<T> T2(final o7.b<? extends T> b) {
        b.g(b, "publisher is null");
        return io.reactivex.plugins.a.R(new g1<T>(b));
    }
    
    @d
    @h("none")
    public static <T> b0<T> T3(final g0<? extends T> g0, final g0<? extends T> g2) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        return M2(g0, g2).y2((o<? super g0, ? extends g0<? extends T>>)a.k(), true, 2);
    }
    
    @d
    @h("custom")
    public static b0<Long> T6(final long a, final TimeUnit timeUnit, final j0 j0) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R((b0<Long>)new z3(Math.max(a, 0L), timeUnit, j0));
    }
    
    @d
    @h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> b0<R> T7(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final g0<? extends T4> g4, final g0<? extends T5> g5, final g0<? extends T6> g6, final g0<? extends T7> g7, final g0<? extends T8> g8, final g0<? extends T9> g9, final n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> n) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        b.g(g5, "source5 is null");
        b.g(g6, "source6 is null");
        b.g(g7, "source7 is null");
        b.g(g8, "source8 is null");
        b.g(g9, "source9 is null");
        return f8((o<? super Object[], ? extends R>)a.E((n<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object>)n), false, X(), (g0<?>[])new g0[] { g0, g2, g3, g4, g5, g6, g7, g8, g9 });
    }
    
    @d
    @h("none")
    @f
    public static <T, S> b0<T> U2(final Callable<S> callable, final x5.b<S, k<T>> b) {
        b.g(b, "generator is null");
        return X2(callable, (c<S, k<T>, S>)o1.l((x5.b<S, k<T>>)b), a.h());
    }
    
    @d
    @h("none")
    public static <T> b0<T> U3(final g0<? extends T> g0, final g0<? extends T> g2, final g0<? extends T> g3) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        return M2(g0, g2, g3).y2((o<? super g0, ? extends g0<? extends T>>)a.k(), true, 3);
    }
    
    @d
    @h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> b0<R> U7(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final g0<? extends T4> g4, final g0<? extends T5> g5, final g0<? extends T6> g6, final g0<? extends T7> g7, final g0<? extends T8> g8, final m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> m) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        b.g(g5, "source5 is null");
        b.g(g6, "source6 is null");
        b.g(g7, "source7 is null");
        b.g(g8, "source8 is null");
        return f8((o<? super Object[], ? extends R>)a.D((m<Object, Object, Object, Object, Object, Object, Object, Object, Object>)m), false, X(), (g0<?>[])new g0[] { g0, g2, g3, g4, g5, g6, g7, g8 });
    }
    
    @d
    @h("none")
    @f
    public static <T, S> b0<T> V2(final Callable<S> callable, final x5.b<S, k<T>> b, final g<? super S> g) {
        b.g(b, "generator is null");
        return X2(callable, (c<S, k<T>, S>)o1.l((x5.b<S, k<T>>)b), g);
    }
    
    @d
    @h("none")
    public static <T> b0<T> V3(final g0<? extends T> g0, final g0<? extends T> g2, final g0<? extends T> g3, final g0<? extends T> g4) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        return M2(g0, g2, g3, g4).y2((o<? super g0, ? extends g0<? extends T>>)a.k(), true, 4);
    }
    
    @d
    @h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> b0<R> V7(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final g0<? extends T4> g4, final g0<? extends T5> g5, final g0<? extends T6> g6, final g0<? extends T7> g7, final l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> l) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        b.g(g5, "source5 is null");
        b.g(g6, "source6 is null");
        b.g(g7, "source7 is null");
        return f8((o<? super Object[], ? extends R>)a.C((l<Object, Object, Object, Object, Object, Object, Object, Object>)l), false, X(), (g0<?>[])new g0[] { g0, g2, g3, g4, g5, g6, g7 });
    }
    
    @d
    @h("none")
    public static <T, S> b0<T> W2(final Callable<S> callable, final c<S, k<T>, S> c) {
        return X2(callable, c, a.h());
    }
    
    @d
    @h("none")
    public static <T> b0<T> W3(final Iterable<? extends g0<? extends T>> iterable) {
        return S2((Iterable<?>)iterable).x2((o<? super Object, ? extends g0<? extends T>>)a.k(), true);
    }
    
    @d
    @h("none")
    public static <T1, T2, T3, T4, T5, T6, R> b0<R> W7(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final g0<? extends T4> g4, final g0<? extends T5> g5, final g0<? extends T6> g6, final x5.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> k) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        b.g(g5, "source5 is null");
        b.g(g6, "source6 is null");
        return f8((o<? super Object[], ? extends R>)a.B((x5.k<Object, Object, Object, Object, Object, Object, Object>)k), false, X(), (g0<?>[])new g0[] { g0, g2, g3, g4, g5, g6 });
    }
    
    public static int X() {
        return io.reactivex.l.b0();
    }
    
    @d
    @h("none")
    @f
    public static <T, S> b0<T> X2(final Callable<S> callable, final c<S, k<T>, S> c, final g<? super S> g) {
        b.g(callable, "initialState is null");
        b.g(c, "generator is null");
        b.g(g, "disposeState is null");
        return io.reactivex.plugins.a.R((b0<T>)new i1((Callable<Object>)callable, (c<Object, k<Object>, Object>)c, (g<? super Object>)g));
    }
    
    @d
    @h("none")
    public static <T> b0<T> X3(final Iterable<? extends g0<? extends T>> iterable, final int n) {
        return S2((Iterable<?>)iterable).y2((o<? super Object, ? extends g0<? extends T>>)a.k(), true, n);
    }
    
    @d
    @h("none")
    public static <T1, T2, T3, T4, T5, R> b0<R> X7(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final g0<? extends T4> g4, final g0<? extends T5> g5, final x5.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> j) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        b.g(g5, "source5 is null");
        return f8((o<? super Object[], ? extends R>)a.A((x5.j<Object, Object, Object, Object, Object, Object>)j), false, X(), (g0<?>[])new g0[] { g0, g2, g3, g4, g5 });
    }
    
    @d
    @h("none")
    private b0<T> Y1(final g<? super T> g, final g<? super Throwable> g2, final x5.a a, final x5.a a2) {
        b.g(g, "onNext is null");
        b.g(g2, "onError is null");
        b.g(a, "onComplete is null");
        b.g(a2, "onAfterTerminate is null");
        return io.reactivex.plugins.a.R(new o0((g0<Object>)this, (g<? super Object>)g, g2, a, a2));
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> Y2(final g<k<T>> g) {
        b.g(g, "generator is null");
        return X2(a.u(), (c<Object, k<T>, Object>)o1.m((g<k<T>>)g), a.h());
    }
    
    @d
    @h("none")
    public static <T> b0<T> Y3(final Iterable<? extends g0<? extends T>> iterable, final int n, final int n2) {
        return S2((Iterable<?>)iterable).z2((o<? super Object, ? extends g0<? extends T>>)a.k(), true, n, n2);
    }
    
    @d
    @h("none")
    public static <T1, T2, T3, T4, R> b0<R> Y7(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final g0<? extends T4> g4, final i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        return f8((o<? super Object[], ? extends R>)a.z((i<Object, Object, Object, Object, Object>)i), false, X(), (g0<?>[])new g0[] { g0, g2, g3, g4 });
    }
    
    @d
    @h("none")
    public static <T> b0<T> Z5(final g0<? extends g0<? extends T>> g0) {
        return a6(g0, X());
    }
    
    @d
    @h("none")
    public static <T1, T2, T3, R> b0<R> Z7(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final x5.h<? super T1, ? super T2, ? super T3, ? extends R> h) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        return f8((o<? super Object[], ? extends R>)a.y((x5.h<Object, Object, Object, Object>)h), false, X(), (g0<?>[])new g0[] { g0, g2, g3 });
    }
    
    @d
    @h("none")
    public static <T> b0<T> a6(final g0<? extends g0<? extends T>> g0, final int n) {
        b.g(g0, "sources is null");
        b.h(n, "bufferSize");
        return io.reactivex.plugins.a.R((b0<T>)new m3((g0<Object>)g0, (o<? super Object, ? extends g0<?>>)a.k(), n, false));
    }
    
    @d
    @h("none")
    public static <T1, T2, R> b0<R> a8(final g0<? extends T1> g0, final g0<? extends T2> g2, final c<? super T1, ? super T2, ? extends R> c) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        return f8((o<? super Object[], ? extends R>)a.x((c<? super Object, ? super Object, ? extends R>)c), false, X(), (g0<?>[])new g0[] { g0, g2 });
    }
    
    @d
    @h("none")
    public static <T> b0<T> b6(final g0<? extends g0<? extends T>> g0) {
        return c6(g0, X());
    }
    
    @d
    @h("none")
    public static <T1, T2, R> b0<R> b8(final g0<? extends T1> g0, final g0<? extends T2> g2, final c<? super T1, ? super T2, ? extends R> c, final boolean b) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        return f8((o<? super Object[], ? extends R>)a.x((c<? super Object, ? super Object, ? extends R>)c), b, X(), (g0<?>[])new g0[] { g0, g2 });
    }
    
    @d
    @h("none")
    public static <T> b0<T> c6(final g0<? extends g0<? extends T>> g0, final int n) {
        b.g(g0, "sources is null");
        b.h(n, "prefetch");
        return io.reactivex.plugins.a.R((b0<T>)new m3((g0<Object>)g0, (o<? super Object, ? extends g0<?>>)a.k(), n, true));
    }
    
    @d
    @h("none")
    public static <T1, T2, R> b0<R> c8(final g0<? extends T1> g0, final g0<? extends T2> g2, final c<? super T1, ? super T2, ? extends R> c, final boolean b, final int n) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        return f8((o<? super Object[], ? extends R>)a.x((c<? super Object, ? super Object, ? extends R>)c), b, n, (g0<?>[])new g0[] { g0, g2 });
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> b0<R> d0(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final g0<? extends T4> g4, final g0<? extends T5> g5, final g0<? extends T6> g6, final g0<? extends T7> g7, final g0<? extends T8> g8, final g0<? extends T9> g9, final n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> n) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        b.g(g5, "source5 is null");
        b.g(g6, "source6 is null");
        b.g(g7, "source7 is null");
        b.g(g8, "source8 is null");
        b.g(g9, "source9 is null");
        return n0((o<? super Object[], ? extends R>)a.E((n<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object>)n), X(), (g0<?>[])new g0[] { g0, g2, g3, g4, g5, g6, g7, g8, g9 });
    }
    
    @d
    @h("none")
    public static <T> b0<T> d4() {
        return io.reactivex.plugins.a.R((b0<T>)c2.G);
    }
    
    @d
    @h("none")
    public static <T, R> b0<R> d8(final g0<? extends g0<? extends T>> g0, final o<? super Object[], ? extends R> o) {
        b.g(o, "zipper is null");
        b.g(g0, "sources is null");
        return io.reactivex.plugins.a.R(new a4((g0<Object>)g0, 16).o2((o<? super Object, ? extends g0<? extends R>>)o1.n((o<? super Object[], ?>)o)));
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> b0<R> e0(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final g0<? extends T4> g4, final g0<? extends T5> g5, final g0<? extends T6> g6, final g0<? extends T7> g7, final g0<? extends T8> g8, final m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> m) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        b.g(g5, "source5 is null");
        b.g(g6, "source6 is null");
        b.g(g7, "source7 is null");
        b.g(g8, "source8 is null");
        return n0((o<? super Object[], ? extends R>)a.D((m<Object, Object, Object, Object, Object, Object, Object, Object, Object>)m), X(), (g0<?>[])new g0[] { g0, g2, g3, g4, g5, g6, g7, g8 });
    }
    
    @d
    @h("none")
    public static <T, R> b0<R> e8(final Iterable<? extends g0<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        b.g(o, "zipper is null");
        b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.R((b0<R>)new l4(null, iterable, o, X(), false));
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, R> b0<R> f0(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final g0<? extends T4> g4, final g0<? extends T5> g5, final g0<? extends T6> g6, final g0<? extends T7> g7, final l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> l) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        b.g(g5, "source5 is null");
        b.g(g6, "source6 is null");
        b.g(g7, "source7 is null");
        return n0((o<? super Object[], ? extends R>)a.C((l<Object, Object, Object, Object, Object, Object, Object, Object>)l), X(), (g0<?>[])new g0[] { g0, g2, g3, g4, g5, g6, g7 });
    }
    
    @d
    @h("none")
    public static <T, R> b0<R> f8(final o<? super Object[], ? extends R> o, final boolean b, final int n, final g0<? extends T>... array) {
        if (array.length == 0) {
            return h2();
        }
        b.g(o, "zipper is null");
        b.h(n, "bufferSize");
        return io.reactivex.plugins.a.R((b0<R>)new l4(array, null, o, n, b));
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> g(final Iterable<? extends g0<? extends T>> iterable) {
        b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.h<T>(null, iterable));
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, R> b0<R> g0(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final g0<? extends T4> g4, final g0<? extends T5> g5, final g0<? extends T6> g6, final x5.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> k) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        b.g(g5, "source5 is null");
        b.g(g6, "source6 is null");
        return n0((o<? super Object[], ? extends R>)a.B((x5.k<Object, Object, Object, Object, Object, Object, Object>)k), X(), (g0<?>[])new g0[] { g0, g2, g3, g4, g5, g6 });
    }
    
    @d
    @h("none")
    public static <T> k0<Boolean> g5(final g0<? extends T> g0, final g0<? extends T> g2) {
        return j5((g0<?>)g0, (g0<?>)g2, (x5.d<? super Object, ? super Object>)b.d(), X());
    }
    
    @d
    @h("none")
    public static <T, R> b0<R> g8(final Iterable<? extends g0<? extends T>> iterable, final o<? super Object[], ? extends R> o, final boolean b, final int n) {
        b.g(o, "zipper is null");
        b.g(iterable, "sources is null");
        b.h(n, "bufferSize");
        return io.reactivex.plugins.a.R((b0<R>)new l4(null, iterable, o, n, b));
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> h(final g0<? extends T>... array) {
        b.g(array, "sources is null");
        final int length = array.length;
        if (length == 0) {
            return h2();
        }
        if (length == 1) {
            return S7((g0<T>)array[0]);
        }
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.h<T>(array, null));
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, R> b0<R> h0(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final g0<? extends T4> g4, final g0<? extends T5> g5, final x5.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> j) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        b.g(g5, "source5 is null");
        return n0((o<? super Object[], ? extends R>)a.A((x5.j<Object, Object, Object, Object, Object, Object>)j), X(), (g0<?>[])new g0[] { g0, g2, g3, g4, g5 });
    }
    
    @d
    @h("none")
    public static <T> b0<T> h2() {
        return io.reactivex.plugins.a.R((b0<T>)t0.G);
    }
    
    @d
    @h("io.reactivex:computation")
    public static b0<Long> h3(final long n, final long n2, final TimeUnit timeUnit) {
        return i3(n, n2, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public static <T> k0<Boolean> h5(final g0<? extends T> g0, final g0<? extends T> g2, final int n) {
        return j5((g0<?>)g0, (g0<?>)g2, (x5.d<? super Object, ? super Object>)b.d(), n);
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, R> b0<R> i0(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final g0<? extends T4> g4, final i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        b.g(g4, "source4 is null");
        return n0((o<? super Object[], ? extends R>)a.z((i<Object, Object, Object, Object, Object>)i), X(), (g0<?>[])new g0[] { g0, g2, g3, g4 });
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> i2(final Throwable t) {
        b.g(t, "exception is null");
        return j2(a.m(t));
    }
    
    @d
    @h("custom")
    @f
    public static b0<Long> i3(final long b, final long b2, final TimeUnit timeUnit, final j0 j0) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R((b0<Long>)new p1(Math.max(0L, b), Math.max(0L, b2), timeUnit, j0));
    }
    
    @d
    @h("none")
    public static <T> k0<Boolean> i5(final g0<? extends T> g0, final g0<? extends T> g2, final x5.d<? super T, ? super T> d) {
        return j5((g0<?>)g0, (g0<?>)g2, (x5.d<? super Object, ? super Object>)d, X());
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, R> b0<R> j0(final g0<? extends T1> g0, final g0<? extends T2> g2, final g0<? extends T3> g3, final x5.h<? super T1, ? super T2, ? super T3, ? extends R> h) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        return n0((o<? super Object[], ? extends R>)a.y((x5.h<Object, Object, Object, Object>)h), X(), (g0<?>[])new g0[] { g0, g2, g3 });
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> j2(final Callable<? extends Throwable> callable) {
        b.g(callable, "errorSupplier is null");
        return io.reactivex.plugins.a.R(new u0<T>(callable));
    }
    
    @d
    @h("io.reactivex:computation")
    public static b0<Long> j3(final long n, final TimeUnit timeUnit) {
        return i3(n, n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public static <T> k0<Boolean> j5(final g0<? extends T> g0, final g0<? extends T> g2, final x5.d<? super T, ? super T> d, final int n) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(d, "isEqual is null");
        b.h(n, "bufferSize");
        return io.reactivex.plugins.a.S((k0<Boolean>)new b3<Object>(g0, g2, d, n));
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, R> b0<R> k0(final g0<? extends T1> g0, final g0<? extends T2> g2, final c<? super T1, ? super T2, ? extends R> c) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        return n0((o<? super Object[], ? extends R>)a.x((c<? super Object, ? super Object, ? extends R>)c), X(), (g0<?>[])new g0[] { g0, g2 });
    }
    
    @d
    @h("custom")
    public static b0<Long> k3(final long n, final TimeUnit timeUnit, final j0 j0) {
        return i3(n, n, timeUnit, j0);
    }
    
    @d
    @h("none")
    public static <T, R> b0<R> l0(final Iterable<? extends g0<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        return m0((Iterable<? extends g0<?>>)iterable, o, X());
    }
    
    @d
    @h("io.reactivex:computation")
    public static b0<Long> l3(final long n, final long n2, final long n3, final long n4, final TimeUnit timeUnit) {
        return m3(n, n2, n3, n4, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    @f
    public static <T, R> b0<R> m0(final Iterable<? extends g0<? extends T>> iterable, final o<? super Object[], ? extends R> o, final int n) {
        b.g(iterable, "sources is null");
        b.g(o, "combiner is null");
        b.h(n, "bufferSize");
        return io.reactivex.plugins.a.R((b0<R>)new u(null, iterable, o, n << 1, false));
    }
    
    @d
    @h("custom")
    @f
    public static b0<Long> m3(final long n, long lng, final long b, final long b2, final TimeUnit timeUnit, final j0 j0) {
        final long n2 = lcmp(lng, 0L);
        if (n2 < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n2 == 0) {
            return h2().B1(b, timeUnit, j0);
        }
        lng = n + (lng - 1L);
        if (n > 0L && lng < 0L) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R((b0<Long>)new q1(n, lng, Math.max(0L, b), Math.max(0L, b2), timeUnit, j0));
    }
    
    @d
    @h("none")
    public static <T, R> b0<R> n0(final o<? super Object[], ? extends R> o, final int n, final g0<? extends T>... array) {
        return p0((g0<?>[])array, o, n);
    }
    
    @d
    @h("none")
    public static <T, R> b0<R> o0(final g0<? extends T>[] array, final o<? super Object[], ? extends R> o) {
        return p0((g0<?>[])array, o, X());
    }
    
    @d
    @h("none")
    @f
    public static <T, R> b0<R> p0(final g0<? extends T>[] array, final o<? super Object[], ? extends R> o, final int n) {
        b.g(array, "sources is null");
        if (array.length == 0) {
            return h2();
        }
        b.g(o, "combiner is null");
        b.h(n, "bufferSize");
        return io.reactivex.plugins.a.R((b0<R>)new u(array, null, o, n << 1, false));
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> p3(final T t) {
        b.g(t, "item is null");
        return io.reactivex.plugins.a.R(new s1<T>(t));
    }
    
    @d
    @h("none")
    public static <T> b0<T> p7(final g0<T> g0) {
        b.g(g0, "onSubscribe is null");
        if (!(g0 instanceof b0)) {
            return io.reactivex.plugins.a.R(new h1<T>(g0));
        }
        throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
    }
    
    @d
    @h("none")
    public static <T, R> b0<R> q0(final Iterable<? extends g0<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        return r0((Iterable<? extends g0<?>>)iterable, o, X());
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> q3(final T t, final T t2) {
        b.g(t, "item1 is null");
        b.g(t2, "item2 is null");
        return M2(t, t2);
    }
    
    @d
    @h("none")
    public static b0<Integer> q4(final int i, final int j) {
        if (j < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        if (j == 0) {
            return h2();
        }
        if (j == 1) {
            return p3(i);
        }
        if (i + (long)(j - 1) <= 2147483647L) {
            return io.reactivex.plugins.a.R((b0<Integer>)new i2(i, j));
        }
        throw new IllegalArgumentException("Integer overflow");
    }
    
    @d
    @h("none")
    @f
    public static <T, R> b0<R> r0(final Iterable<? extends g0<? extends T>> iterable, final o<? super Object[], ? extends R> o, final int n) {
        b.g(iterable, "sources is null");
        b.g(o, "combiner is null");
        b.h(n, "bufferSize");
        return io.reactivex.plugins.a.R((b0<R>)new u(null, iterable, o, n << 1, true));
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> r3(final T t, final T t2, final T t3) {
        b.g(t, "item1 is null");
        b.g(t2, "item2 is null");
        b.g(t3, "item3 is null");
        return M2(t, t2, t3);
    }
    
    @d
    @h("none")
    public static b0<Long> r4(final long l, final long lng) {
        final long n = lcmp(lng, 0L);
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n == 0) {
            return h2();
        }
        if (lng == 1L) {
            return p3(l);
        }
        if (l > 0L && lng - 1L + l < 0L) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        return io.reactivex.plugins.a.R((b0<Long>)new j2(l, lng));
    }
    
    @d
    @h("none")
    public static <T, D> b0<T> r7(final Callable<? extends D> callable, final o<? super D, ? extends g0<? extends T>> o, final g<? super D> g) {
        return s7((Callable<?>)callable, (o<? super Object, ? extends g0<? extends T>>)o, (g<? super Object>)g, true);
    }
    
    @d
    @h("none")
    public static <T, R> b0<R> s0(final o<? super Object[], ? extends R> o, final int n, final g0<? extends T>... array) {
        return u0((g0<?>[])array, o, n);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> s3(final T t, final T t2, final T t3, final T t4) {
        b.g(t, "item1 is null");
        b.g(t2, "item2 is null");
        b.g(t3, "item3 is null");
        b.g(t4, "item4 is null");
        return M2(t, t2, t3, t4);
    }
    
    @d
    @h("none")
    public static <T, D> b0<T> s7(final Callable<? extends D> callable, final o<? super D, ? extends g0<? extends T>> o, final g<? super D> g, final boolean b) {
        b.g(callable, "resourceSupplier is null");
        b.g(o, "sourceSupplier is null");
        b.g(g, "disposer is null");
        return io.reactivex.plugins.a.R((b0<T>)new d4(callable, (o<? super Object, ? extends g0<?>>)o, (g<? super Object>)g, b));
    }
    
    @d
    @h("none")
    public static <T, R> b0<R> t0(final g0<? extends T>[] array, final o<? super Object[], ? extends R> o) {
        return u0((g0<?>[])array, o, X());
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> t3(final T t, final T t2, final T t3, final T t4, final T t5) {
        b.g(t, "item1 is null");
        b.g(t2, "item2 is null");
        b.g(t3, "item3 is null");
        b.g(t4, "item4 is null");
        b.g(t5, "item5 is null");
        return M2(t, t2, t3, t4, t5);
    }
    
    @d
    @h("none")
    @f
    public static <T, R> b0<R> u0(final g0<? extends T>[] array, final o<? super Object[], ? extends R> o, final int n) {
        b.h(n, "bufferSize");
        b.g(o, "combiner is null");
        if (array.length == 0) {
            return h2();
        }
        return io.reactivex.plugins.a.R((b0<R>)new u(array, null, o, n << 1, true));
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> u1(final e0<T> e0) {
        b.g(e0, "source is null");
        return io.reactivex.plugins.a.R(new c0<T>(e0));
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> u3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6) {
        b.g(t, "item1 is null");
        b.g(t2, "item2 is null");
        b.g(t3, "item3 is null");
        b.g(t4, "item4 is null");
        b.g(t5, "item5 is null");
        b.g(t6, "item6 is null");
        return M2(t, t2, t3, t4, t5, t6);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> v3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7) {
        b.g(t, "item1 is null");
        b.g(t2, "item2 is null");
        b.g(t3, "item3 is null");
        b.g(t4, "item4 is null");
        b.g(t5, "item5 is null");
        b.g(t6, "item6 is null");
        b.g(t7, "item7 is null");
        return M2(t, t2, t3, t4, t5, t6, t7);
    }
    
    @d
    @h("none")
    public static <T> b0<T> w0(final g0<? extends g0<? extends T>> g0) {
        return x0(g0, X());
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> w3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8) {
        b.g(t, "item1 is null");
        b.g(t2, "item2 is null");
        b.g(t3, "item3 is null");
        b.g(t4, "item4 is null");
        b.g(t5, "item5 is null");
        b.g(t6, "item6 is null");
        b.g(t7, "item7 is null");
        b.g(t8, "item8 is null");
        return M2(t, t2, t3, t4, t5, t6, t7, t8);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> x0(final g0<? extends g0<? extends T>> g0, final int n) {
        b.g(g0, "sources is null");
        b.h(n, "prefetch");
        return io.reactivex.plugins.a.R((b0<T>)new v((g0<Object>)g0, (o<? super Object, ? extends g0<?>>)a.k(), n, j.G));
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> x3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8, final T t9) {
        b.g(t, "item1 is null");
        b.g(t2, "item2 is null");
        b.g(t3, "item3 is null");
        b.g(t4, "item4 is null");
        b.g(t5, "item5 is null");
        b.g(t6, "item6 is null");
        b.g(t7, "item7 is null");
        b.g(t8, "item8 is null");
        b.g(t9, "item9 is null");
        return M2(t, t2, t3, t4, t5, t6, t7, t8, t9);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> y0(final g0<? extends T> g0, final g0<? extends T> g2) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        return C0(g0, g2);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> y3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8, final T t9, final T t10) {
        b.g(t, "item1 is null");
        b.g(t2, "item2 is null");
        b.g(t3, "item3 is null");
        b.g(t4, "item4 is null");
        b.g(t5, "item5 is null");
        b.g(t6, "item6 is null");
        b.g(t7, "item7 is null");
        b.g(t8, "item8 is null");
        b.g(t9, "item9 is null");
        b.g(t10, "item10 is null");
        return M2(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> z0(final g0<? extends T> g0, final g0<? extends T> g2, final g0<? extends T> g3) {
        b.g(g0, "source1 is null");
        b.g(g2, "source2 is null");
        b.g(g3, "source3 is null");
        return C0(g0, g2, g3);
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> z1(final Callable<? extends g0<? extends T>> callable) {
        b.g(callable, "supplier is null");
        return io.reactivex.plugins.a.R(new f0<T>(callable));
    }
    
    @h("none")
    public final void A(final i0<? super T> i0) {
        io.reactivex.internal.operators.observable.l.b((g0<?>)this, (i0<? super Object>)i0);
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> A1(final long n, final TimeUnit timeUnit) {
        return this.C1(n, timeUnit, io.reactivex.schedulers.b.a(), false);
    }
    
    @d
    @h("none")
    public final io.reactivex.c A2(final o<? super T, ? extends io.reactivex.i> o) {
        return this.B2(o, false);
    }
    
    @d
    @h("none")
    public final s<T> A3() {
        return io.reactivex.plugins.a.Q(new t1<T>(this));
    }
    
    @d
    @h("none")
    public final <R> b0<R> A4(final o<? super b0<T>, ? extends g0<R>> o, final int n) {
        b.g(o, "selector is null");
        b.h(n, "bufferSize");
        return r2.B8((Callable<? extends io.reactivex.observables.a<Object>>)o1.h((b0<Object>)this, n), (o<? super b0<Object>, ? extends g0<R>>)o);
    }
    
    @d
    @h("none")
    public final b0<T> A5() {
        return (b0<T>)this.b7().y1().D3((o<? super List<List<T>>, ?>)a.o(a.p())).C2((o<? super Object, ? extends Iterable<?>>)a.k());
    }
    
    @d
    @h("custom")
    public final b0<T> A6(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R(new v3((b0<Object>)this, n, timeUnit, j0, b));
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<b0<T>> A7(final long n, final TimeUnit timeUnit, final long n2) {
        return this.E7(n, timeUnit, io.reactivex.schedulers.b.a(), n2, false);
    }
    
    @h("none")
    public final void B(final g<? super T> g) {
        io.reactivex.internal.operators.observable.l.c((g0<?>)this, (g<? super Object>)g, (g<? super Throwable>)a.f, a.c);
    }
    
    @d
    @h("custom")
    public final b0<T> B1(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.C1(n, timeUnit, j0, false);
    }
    
    @d
    @h("none")
    public final io.reactivex.c B2(final o<? super T, ? extends io.reactivex.i> o, final boolean b) {
        b.g(o, "mapper is null");
        return io.reactivex.plugins.a.O(new y0<Object>(this, o, b));
    }
    
    @d
    @h("none")
    public final k0<T> B3() {
        return io.reactivex.plugins.a.S(new u1<T>(this, null));
    }
    
    @d
    @h("io.reactivex:computation")
    public final <R> b0<R> B4(final o<? super b0<T>, ? extends g0<R>> o, final int n, final long n2, final TimeUnit timeUnit) {
        return this.C4(o, n, n2, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public final b0<T> B5(final Comparator<? super T> comparator) {
        b.g(comparator, "sortFunction is null");
        return (b0<T>)this.b7().y1().D3((o<? super List<List<T>>, ?>)a.o((Comparator<? super Object>)comparator)).C2((o<? super Object, ? extends Iterable<?>>)a.k());
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> B6(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.A6(n, timeUnit, io.reactivex.schedulers.b.a(), b);
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<b0<T>> B7(final long n, final TimeUnit timeUnit, final long n2, final boolean b) {
        return this.E7(n, timeUnit, io.reactivex.schedulers.b.a(), n2, b);
    }
    
    @h("none")
    public final void C(final g<? super T> g, final g<? super Throwable> g2) {
        io.reactivex.internal.operators.observable.l.c((g0<?>)this, (g<? super Object>)g, g2, a.c);
    }
    
    @d
    @h("custom")
    public final b0<T> C1(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.g0((g0<Object>)this, n, timeUnit, j0, b));
    }
    
    @d
    @h("none")
    public final <U> b0<U> C2(final o<? super T, ? extends Iterable<? extends U>> o) {
        b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<U>)new b1((g0<Object>)this, (o<? super Object, ? extends Iterable<?>>)o));
    }
    
    @d
    @h("none")
    public final <R> b0<R> C3(final io.reactivex.f0<? extends R, ? super T> f0) {
        b.g(f0, "lifter is null");
        return io.reactivex.plugins.a.R((b0<R>)new v1((g0<Object>)this, (io.reactivex.f0<?, ? super Object>)f0));
    }
    
    @d
    @h("custom")
    public final <R> b0<R> C4(final o<? super b0<T>, ? extends g0<R>> o, final int n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        b.g(o, "selector is null");
        b.h(n, "bufferSize");
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return r2.B8((Callable<? extends io.reactivex.observables.a<Object>>)o1.i((b0<Object>)this, n, n2, timeUnit, j0), (o<? super b0<Object>, ? extends g0<R>>)o);
    }
    
    @d
    @h("none")
    public final b0<T> C5(final g0<? extends T> g0) {
        b.g(g0, "other is null");
        return C0(g0, this);
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> C6(final long n, final TimeUnit timeUnit) {
        return this.v1(n, timeUnit);
    }
    
    @d
    @h("custom")
    public final b0<b0<T>> C7(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.E7(n, timeUnit, j0, Long.MAX_VALUE, false);
    }
    
    @h("none")
    public final void D(final g<? super T> g, final g<? super Throwable> g2, final x5.a a) {
        io.reactivex.internal.operators.observable.l.c((g0<?>)this, (g<? super Object>)g, g2, a);
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> D1(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.C1(n, timeUnit, io.reactivex.schedulers.b.a(), b);
    }
    
    @d
    @h("none")
    public final <U, V> b0<V> D2(final o<? super T, ? extends Iterable<? extends U>> o, final c<? super T, ? super U, ? extends V> c) {
        b.g(o, "mapper is null");
        b.g(c, "resultSelector is null");
        return this.u2((o<? super T, ? extends g0<?>>)o1.a((o<? super T, ? extends Iterable<?>>)o), (c<? super T, ? super Object, ? extends V>)c, false, X(), X());
    }
    
    @d
    @h("none")
    public final <R> b0<R> D3(final o<? super T, ? extends R> o) {
        b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<R>)new w1((g0<Object>)this, (o<? super Object, ?>)o));
    }
    
    @d
    @h("custom")
    public final <R> b0<R> D4(final o<? super b0<T>, ? extends g0<R>> o, final int n, final j0 j0) {
        b.g(o, "selector is null");
        b.g(j0, "scheduler is null");
        b.h(n, "bufferSize");
        return r2.B8((Callable<? extends io.reactivex.observables.a<Object>>)o1.h((b0<Object>)this, n), (o<? super b0<Object>, ? extends g0<R>>)o1.k((o<? super b0<Object>, ? extends g0<Object>>)o, j0));
    }
    
    @d
    @h("none")
    public final b0<T> D5(final Iterable<? extends T> iterable) {
        return C0(S2((Iterable<?>)iterable), this);
    }
    
    @d
    @h("custom")
    public final b0<T> D6(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.w1(n, timeUnit, j0);
    }
    
    @d
    @h("custom")
    public final b0<b0<T>> D7(final long n, final TimeUnit timeUnit, final j0 j0, final long n2) {
        return this.E7(n, timeUnit, j0, n2, false);
    }
    
    @d
    @h("none")
    public final b0<List<T>> E(final int n) {
        return this.F(n, n);
    }
    
    @d
    @h("none")
    public final <U, V> b0<T> E1(final g0<U> g0, final o<? super T, ? extends g0<V>> o) {
        return this.I1(g0).F1((o<? super T, ? extends g0<Object>>)o);
    }
    
    @d
    @h("none")
    public final <R> b0<R> E2(final o<? super T, ? extends y<? extends R>> o) {
        return this.F2(o, false);
    }
    
    @d
    @h("none")
    public final b0<a0<T>> E3() {
        return io.reactivex.plugins.a.R(new y1((g0<Object>)this));
    }
    
    @d
    @h("io.reactivex:computation")
    public final <R> b0<R> E4(final o<? super b0<T>, ? extends g0<R>> o, final long n, final TimeUnit timeUnit) {
        return this.F4(o, n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public final b0<T> E5(final T t) {
        b.g(t, "item is null");
        return C0(p3(t), this);
    }
    
    @d
    @h("none")
    public final b0<io.reactivex.schedulers.d<T>> E6() {
        return this.H6(TimeUnit.MILLISECONDS, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("custom")
    public final b0<b0<T>> E7(final long n, final TimeUnit timeUnit, final j0 j0, final long n2, final boolean b) {
        return this.F7(n, timeUnit, j0, n2, b, X());
    }
    
    @d
    @h("none")
    public final b0<List<T>> F(final int n, final int n2) {
        return this.G(n, n2, io.reactivex.internal.util.b.d());
    }
    
    @d
    @h("none")
    public final <U> b0<T> F1(final o<? super T, ? extends g0<U>> o) {
        b.g(o, "itemDelay is null");
        return this.o2((o<? super T, ? extends g0<? extends T>>)o1.c((o<? super T, ? extends g0<Object>>)o));
    }
    
    @d
    @h("none")
    public final <R> b0<R> F2(final o<? super T, ? extends y<? extends R>> o, final boolean b) {
        b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<R>)new z0((g0<Object>)this, (o<? super Object, ? extends y<?>>)o, b));
    }
    
    @d
    @h("custom")
    public final <R> b0<R> F4(final o<? super b0<T>, ? extends g0<R>> o, final long n, final TimeUnit timeUnit, final j0 j0) {
        b.g(o, "selector is null");
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return r2.B8((Callable<? extends io.reactivex.observables.a<Object>>)o1.j((b0<Object>)this, n, timeUnit, j0), (o<? super b0<Object>, ? extends g0<R>>)o);
    }
    
    @d
    @h("none")
    public final b0<T> F5(final T... array) {
        final b0<T> m2 = M2(array);
        if (m2 == h2()) {
            return io.reactivex.plugins.a.R(this);
        }
        return (b0<T>)C0(m2, this);
    }
    
    @d
    @h("none")
    public final b0<io.reactivex.schedulers.d<T>> F6(final j0 j0) {
        return this.H6(TimeUnit.MILLISECONDS, j0);
    }
    
    @d
    @h("custom")
    public final b0<b0<T>> F7(final long n, final TimeUnit timeUnit, final j0 j0, final long n2, final boolean b, final int n3) {
        b.h(n3, "bufferSize");
        b.g(j0, "scheduler is null");
        b.g(timeUnit, "unit is null");
        b.i(n2, "count");
        return io.reactivex.plugins.a.R(new i4((g0<Object>)this, n, n, timeUnit, j0, n2, n3, b));
    }
    
    @d
    @h("none")
    public final <U extends Collection<? super T>> b0<U> G(final int n, final int n2, final Callable<U> callable) {
        b.h(n, "count");
        b.h(n2, "skip");
        b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.R((b0<U>)new io.reactivex.internal.operators.observable.m((g0<Object>)this, n, n2, (Callable<Collection>)callable));
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> G1(final long n, final TimeUnit timeUnit) {
        return this.H1(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public final <R> b0<R> G2(final o<? super T, ? extends q0<? extends R>> o) {
        return this.H2(o, false);
    }
    
    @d
    @h("custom")
    public final <R> b0<R> G4(final o<? super b0<T>, ? extends g0<R>> o, final j0 j0) {
        b.g(o, "selector is null");
        b.g(j0, "scheduler is null");
        return r2.B8((Callable<? extends io.reactivex.observables.a<Object>>)o1.g((b0<Object>)this), (o<? super b0<Object>, ? extends g0<R>>)o1.k((o<? super b0<Object>, ? extends g0<Object>>)o, j0));
    }
    
    @h("none")
    public final io.reactivex.disposables.c G5() {
        return this.K5(a.h(), a.f, a.c, a.h());
    }
    
    @d
    @h("none")
    public final b0<io.reactivex.schedulers.d<T>> G6(final TimeUnit timeUnit) {
        return this.H6(timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public final <B> b0<b0<T>> G7(final g0<B> g0) {
        return this.H7(g0, X());
    }
    
    @d
    @h("none")
    public final <U extends Collection<? super T>> b0<U> H(final int n, final Callable<U> callable) {
        return this.G(n, n, callable);
    }
    
    @d
    @h("custom")
    public final b0<T> H1(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.I1(T6(n, timeUnit, j0));
    }
    
    @d
    @h("none")
    public final <R> b0<R> H2(final o<? super T, ? extends q0<? extends R>> o, final boolean b) {
        b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<R>)new a1((g0<Object>)this, (o<? super Object, ? extends q0<?>>)o, b));
    }
    
    @d
    @h("none")
    public final io.reactivex.observables.a<T> H4() {
        return r2.A8((g0<? extends T>)this);
    }
    
    @d
    @h("none")
    public final io.reactivex.disposables.c H5(final g<? super T> g) {
        return this.K5(g, a.f, a.c, a.h());
    }
    
    @d
    @h("none")
    public final b0<io.reactivex.schedulers.d<T>> H6(final TimeUnit timeUnit, final j0 j0) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R(new w3((g0<Object>)this, timeUnit, j0));
    }
    
    @d
    @h("none")
    public final <B> b0<b0<T>> H7(final g0<B> g0, final int n) {
        b.g(g0, "boundary is null");
        b.h(n, "bufferSize");
        return io.reactivex.plugins.a.R((b0<b0<T>>)new f4((g0<Object>)this, (g0<Object>)g0, n));
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<List<T>> I(final long n, final long n2, final TimeUnit timeUnit) {
        return this.K(n, n2, timeUnit, io.reactivex.schedulers.b.a(), io.reactivex.internal.util.b.d());
    }
    
    @d
    @h("none")
    public final <U> b0<T> I1(final g0<U> g0) {
        b.g(g0, "other is null");
        return io.reactivex.plugins.a.R((b0<T>)new h0(this, (g0<Object>)g0));
    }
    
    @d
    @h("none")
    public final io.reactivex.disposables.c I2(final g<? super T> g) {
        return this.H5(g);
    }
    
    @d
    @h("none")
    public final io.reactivex.observables.a<T> I4(final int n) {
        b.h(n, "bufferSize");
        return r2.w8((g0<T>)this, n);
    }
    
    @d
    @h("none")
    public final io.reactivex.disposables.c I5(final g<? super T> g, final g<? super Throwable> g2) {
        return this.K5(g, g2, a.c, a.h());
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> I6(final long n, final TimeUnit timeUnit) {
        return this.Q6(n, timeUnit, null, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public final <U, V> b0<b0<T>> I7(final g0<U> g0, final o<? super U, ? extends g0<V>> o) {
        return this.J7(g0, (o<? super U, ? extends g0<Object>>)o, X());
    }
    
    @d
    @h("custom")
    public final b0<List<T>> J(final long n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        return this.K(n, n2, timeUnit, j0, io.reactivex.internal.util.b.d());
    }
    
    @d
    @h("none")
    @Deprecated
    public final <T2> b0<T2> J1() {
        return io.reactivex.plugins.a.R((b0<T2>)new io.reactivex.internal.operators.observable.i0((g0<Object>)this, (o<? super Object, ? extends a0<Object>>)a.k()));
    }
    
    @d
    @h("none")
    public final io.reactivex.disposables.c J2(final r<? super T> r) {
        return this.L2(r, a.f, a.c);
    }
    
    @d
    @h("io.reactivex:computation")
    public final io.reactivex.observables.a<T> J4(final int n, final long n2, final TimeUnit timeUnit) {
        return this.K4(n, n2, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public final io.reactivex.disposables.c J5(final g<? super T> g, final g<? super Throwable> g2, final x5.a a) {
        return this.K5(g, g2, a, a.h());
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> J6(final long n, final TimeUnit timeUnit, final g0<? extends T> g0) {
        b.g(g0, "other is null");
        return this.Q6(n, timeUnit, g0, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public final <U, V> b0<b0<T>> J7(final g0<U> g0, final o<? super U, ? extends g0<V>> o, final int n) {
        b.g(g0, "openingIndicator is null");
        b.g(o, "closingIndicator is null");
        b.h(n, "bufferSize");
        return io.reactivex.plugins.a.R((b0<b0<T>>)new g4((g0<Object>)this, (g0<Object>)g0, (o<? super Object, ? extends g0<Object>>)o, n));
    }
    
    @d
    @h("custom")
    public final <U extends Collection<? super T>> b0<U> K(final long n, final long n2, final TimeUnit timeUnit, final j0 j0, final Callable<U> callable) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.R((b0<U>)new q((g0<Object>)this, n, n2, timeUnit, j0, (Callable<Collection>)callable, Integer.MAX_VALUE, false));
    }
    
    @d
    @h("none")
    @e
    public final <R> b0<R> K1(final o<? super T, a0<R>> o) {
        b.g(o, "selector is null");
        return io.reactivex.plugins.a.R((b0<R>)new io.reactivex.internal.operators.observable.i0((g0<Object>)this, (o<? super Object, ? extends a0<Object>>)o));
    }
    
    @d
    @h("none")
    public final io.reactivex.disposables.c K2(final r<? super T> r, final g<? super Throwable> g) {
        return this.L2(r, g, a.c);
    }
    
    @d
    @h("custom")
    public final io.reactivex.observables.a<T> K4(final int n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        b.h(n, "bufferSize");
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return r2.y8((g0<T>)this, n2, timeUnit, j0, n);
    }
    
    @d
    @h("none")
    public final io.reactivex.disposables.c K5(final g<? super T> g, final g<? super Throwable> g2, final x5.a a, final g<? super io.reactivex.disposables.c> g3) {
        b.g(g, "onNext is null");
        b.g(g2, "onError is null");
        b.g(a, "onComplete is null");
        b.g(g3, "onSubscribe is null");
        final io.reactivex.internal.observers.u<Object> u = new io.reactivex.internal.observers.u<Object>((g<? super Object>)g, g2, a, g3);
        this.c(u);
        return u;
    }
    
    @d
    @h("custom")
    public final b0<T> K6(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.Q6(n, timeUnit, null, j0);
    }
    
    @d
    @h("none")
    public final <B> b0<b0<T>> K7(final Callable<? extends g0<B>> callable) {
        return this.L7((Callable<? extends g0<Object>>)callable, X());
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<List<T>> L(final long n, final TimeUnit timeUnit) {
        return this.O(n, timeUnit, io.reactivex.schedulers.b.a(), Integer.MAX_VALUE);
    }
    
    @d
    @h("none")
    public final b0<T> L1() {
        return this.N1(a.k(), a.g());
    }
    
    @d
    @h("none")
    public final io.reactivex.disposables.c L2(final r<? super T> r, final g<? super Throwable> g, final x5.a a) {
        b.g(r, "onNext is null");
        b.g(g, "onError is null");
        b.g(a, "onComplete is null");
        final p<Object> p3 = new p<Object>((r<? super Object>)r, g, a);
        this.c(p3);
        return p3;
    }
    
    @d
    @h("custom")
    public final io.reactivex.observables.a<T> L4(final int n, final j0 j0) {
        b.h(n, "bufferSize");
        return r2.C8(this.I4(n), j0);
    }
    
    protected abstract void L5(final i0<? super T> p0);
    
    @d
    @h("custom")
    public final b0<T> L6(final long n, final TimeUnit timeUnit, final j0 j0, final g0<? extends T> g0) {
        b.g(g0, "other is null");
        return this.Q6(n, timeUnit, g0, j0);
    }
    
    @d
    @h("none")
    public final <B> b0<b0<T>> L7(final Callable<? extends g0<B>> callable, final int n) {
        b.g(callable, "boundary is null");
        b.h(n, "bufferSize");
        return io.reactivex.plugins.a.R((b0<b0<T>>)new h4((g0<Object>)this, (Callable<? extends g0<Object>>)callable, n));
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<List<T>> M(final long n, final TimeUnit timeUnit, final int n2) {
        return this.O(n, timeUnit, io.reactivex.schedulers.b.a(), n2);
    }
    
    @d
    @h("none")
    public final <K> b0<T> M1(final o<? super T, K> o) {
        return this.N1(o, a.g());
    }
    
    @d
    @h("io.reactivex:computation")
    public final io.reactivex.observables.a<T> M4(final long n, final TimeUnit timeUnit) {
        return this.N4(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("custom")
    public final b0<T> M5(final j0 j0) {
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R(new k3((g0<Object>)this, j0));
    }
    
    @d
    @h("none")
    public final <U, V> b0<T> M6(final g0<U> g0, final o<? super T, ? extends g0<V>> o) {
        b.g(g0, "firstTimeoutIndicator is null");
        return this.R6(g0, (o<? super T, ? extends g0<Object>>)o, (g0<? extends T>)null);
    }
    
    @d
    @h("none")
    public final <T1, T2, T3, T4, R> b0<R> M7(final g0<T1> g0, final g0<T2> g2, final g0<T3> g3, final g0<T4> g4, final x5.j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> j) {
        b.g(g0, "o1 is null");
        b.g(g2, "o2 is null");
        b.g(g3, "o3 is null");
        b.g(g4, "o4 is null");
        b.g(j, "combiner is null");
        return this.R7(new g0[] { g0, g2, g3, g4 }, (o<? super Object[], R>)a.A((x5.j<Object, Object, Object, Object, Object, R>)j));
    }
    
    @d
    @h("custom")
    public final b0<List<T>> N(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.P(n, timeUnit, j0, Integer.MAX_VALUE, io.reactivex.internal.util.b.d(), false);
    }
    
    @d
    @h("none")
    public final <K> b0<T> N1(final o<? super T, K> p0, final Callable<? extends Collection<? super K>> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "keySelector is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: aload_2        
        //     9: ldc_w           "collectionSupplier is null"
        //    12: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    15: pop            
        //    16: new             Lio/reactivex/internal/operators/observable/k0;
        //    19: dup            
        //    20: aload_0        
        //    21: aload_1        
        //    22: aload_2        
        //    23: invokespecial   io/reactivex/internal/operators/observable/k0.<init>:(Lio/reactivex/g0;Lx5/o;Ljava/util/concurrent/Callable;)V
        //    26: invokestatic    io/reactivex/plugins/a.R:(Lio/reactivex/b0;)Lio/reactivex/b0;
        //    29: areturn        
        //    Signature:
        //  <K:Ljava/lang/Object;>(Lx5/o<-TT;TK;>;Ljava/util/concurrent/Callable<+Ljava/util/Collection<-TK;>;>;)Lio/reactivex/b0<TT;>;
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MetadataHelper$AdaptFailure
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2300)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2221)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2255)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2232)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2245)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2221)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.adapt(MetadataHelper.java:1312)
        //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1010)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitClassType(MetadataHelper.java:2146)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitParameterizedType(MetadataHelper.java:2165)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitParameterizedType(MetadataHelper.java:2075)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:21)
        //     at com.strobel.assembler.metadata.MetadataHelper.getSuperType(MetadataHelper.java:1264)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitClassType(MetadataHelper.java:2011)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitParameterizedType(MetadataHelper.java:2056)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitParameterizedType(MetadataHelper.java:1994)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.asSuper(MetadataHelper.java:727)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1853)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:568)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:922)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2515)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:759)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1011)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @d
    @h("custom")
    public final io.reactivex.observables.a<T> N4(final long n, final TimeUnit timeUnit, final j0 j0) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return r2.x8((g0<T>)this, n, timeUnit, j0);
    }
    
    @d
    @h("none")
    public final <E extends i0<? super T>> E N5(final E e) {
        this.c(e);
        return e;
    }
    
    @d
    @h("none")
    public final <U, V> b0<T> N6(final g0<U> g0, final o<? super T, ? extends g0<V>> o, final g0<? extends T> g2) {
        b.g(g0, "firstTimeoutIndicator is null");
        b.g(g2, "other is null");
        return this.R6((g0<Object>)g0, (o<? super T, ? extends g0<Object>>)o, g2);
    }
    
    @d
    @h("none")
    public final <T1, T2, T3, R> b0<R> N7(final g0<T1> g0, final g0<T2> g2, final g0<T3> g3, final i<? super T, ? super T1, ? super T2, ? super T3, R> i) {
        b.g(g0, "o1 is null");
        b.g(g2, "o2 is null");
        b.g(g3, "o3 is null");
        b.g(i, "combiner is null");
        return this.R7(new g0[] { g0, g2, g3 }, (o<? super Object[], R>)a.z((i<Object, Object, Object, Object, R>)i));
    }
    
    @d
    @h("custom")
    public final b0<List<T>> O(final long n, final TimeUnit timeUnit, final j0 j0, final int n2) {
        return this.P(n, timeUnit, j0, n2, io.reactivex.internal.util.b.d(), false);
    }
    
    @d
    @h("none")
    public final b0<T> O1() {
        return this.Q1(a.k());
    }
    
    @d
    @h("custom")
    public final io.reactivex.observables.a<T> O4(final j0 j0) {
        b.g(j0, "scheduler is null");
        return r2.C8(this.H4(), j0);
    }
    
    @d
    @h("none")
    public final b0<T> O5(final g0<? extends T> g0) {
        b.g(g0, "other is null");
        return io.reactivex.plugins.a.R(new l3((g0<Object>)this, g0));
    }
    
    @d
    @h("none")
    public final <V> b0<T> O6(final o<? super T, ? extends g0<V>> o) {
        return this.R6((g0<Object>)null, (o<? super T, ? extends g0<Object>>)o, (g0<? extends T>)null);
    }
    
    @d
    @h("none")
    public final <T1, T2, R> b0<R> O7(final g0<T1> g0, final g0<T2> g2, final x5.h<? super T, ? super T1, ? super T2, R> h) {
        b.g(g0, "o1 is null");
        b.g(g2, "o2 is null");
        b.g(h, "combiner is null");
        return this.R7(new g0[] { g0, g2 }, (o<? super Object[], R>)a.y((x5.h<Object, Object, Object, R>)h));
    }
    
    @d
    @h("custom")
    public final <U extends Collection<? super T>> b0<U> P(final long n, final TimeUnit timeUnit, final j0 j0, final int n2, final Callable<U> callable, final boolean b) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        b.g(callable, "bufferSupplier is null");
        b.h(n2, "count");
        return io.reactivex.plugins.a.R((b0<U>)new q((g0<Object>)this, n, n, timeUnit, j0, (Callable<Collection>)callable, n2, b));
    }
    
    @d
    @h("none")
    public final <R> b0<R> P0(final o<? super T, ? extends g0<? extends R>> o) {
        return this.Q0(o, 2);
    }
    
    @d
    @h("none")
    public final b0<T> P1(final x5.d<? super T, ? super T> d) {
        b.g(d, "comparer is null");
        return io.reactivex.plugins.a.R((b0<T>)new l0((g0<Object>)this, (o<? super Object, Object>)a.k(), (x5.d<? super Object, ? super Object>)d));
    }
    
    @d
    @h("none")
    public final b0<T> P4() {
        return this.R4(Long.MAX_VALUE, a.c());
    }
    
    @d
    @h("none")
    public final <R> b0<R> P5(final o<? super T, ? extends g0<? extends R>> o) {
        return this.Q5(o, X());
    }
    
    @d
    @h("none")
    public final <V> b0<T> P6(final o<? super T, ? extends g0<V>> o, final g0<? extends T> g0) {
        b.g(g0, "other is null");
        return this.R6((g0<Object>)null, (o<? super T, ? extends g0<Object>>)o, g0);
    }
    
    @d
    @h("none")
    public final <U, R> b0<R> P7(final g0<? extends U> g0, final c<? super T, ? super U, ? extends R> c) {
        b.g(g0, "other is null");
        b.g(c, "combiner is null");
        return io.reactivex.plugins.a.R((b0<R>)new j4((g0<Object>)this, (c<? super Object, ? super Object, ?>)c, g0));
    }
    
    @d
    @h("none")
    public final <B> b0<List<T>> Q(final g0<B> g0) {
        return this.S(g0, io.reactivex.internal.util.b.d());
    }
    
    @d
    @h("none")
    public final <R> b0<R> Q0(final o<? super T, ? extends g0<? extends R>> o, final int n) {
        b.g(o, "mapper is null");
        b.h(n, "prefetch");
        if (!(this instanceof y5.m)) {
            return io.reactivex.plugins.a.R((b0<R>)new v((g0<Object>)this, (o<? super Object, ? extends g0<?>>)o, n, j.G));
        }
        final Object call = ((y5.m)this).call();
        if (call == null) {
            return h2();
        }
        return (b0<R>)x2.a(call, (o<? super Object, ? extends g0<?>>)o);
    }
    
    @d
    @h("none")
    public final <K> b0<T> Q1(final o<? super T, K> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "keySelector is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: new             Lio/reactivex/internal/operators/observable/l0;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokestatic    io/reactivex/internal/functions/b.d:()Lx5/d;
        //    17: invokespecial   io/reactivex/internal/operators/observable/l0.<init>:(Lio/reactivex/g0;Lx5/o;Lx5/d;)V
        //    20: invokestatic    io/reactivex/plugins/a.R:(Lio/reactivex/b0;)Lio/reactivex/b0;
        //    23: areturn        
        //    Signature:
        //  <K:Ljava/lang/Object;>(Lx5/o<-TT;TK;>;)Lio/reactivex/b0<TT;>;
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MetadataHelper$AdaptFailure
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2300)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2221)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2255)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2232)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2245)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2221)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.adapt(MetadataHelper.java:1312)
        //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1010)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitClassType(MetadataHelper.java:2146)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitParameterizedType(MetadataHelper.java:2165)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitParameterizedType(MetadataHelper.java:2075)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:21)
        //     at com.strobel.assembler.metadata.MetadataHelper.getSuperType(MetadataHelper.java:1264)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitClassType(MetadataHelper.java:2011)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitParameterizedType(MetadataHelper.java:2056)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitParameterizedType(MetadataHelper.java:1994)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.asSuper(MetadataHelper.java:727)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1853)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:568)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:922)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2515)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:759)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1011)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @d
    @h("none")
    public final b0<T> Q4(final long n) {
        return this.R4(n, a.c());
    }
    
    @d
    @h("none")
    public final <R> b0<R> Q5(final o<? super T, ? extends g0<? extends R>> o, final int n) {
        b.g(o, "mapper is null");
        b.h(n, "bufferSize");
        if (!(this instanceof y5.m)) {
            return io.reactivex.plugins.a.R((b0<R>)new m3((g0<Object>)this, (o<? super Object, ? extends g0<?>>)o, n, false));
        }
        final Object call = ((y5.m)this).call();
        if (call == null) {
            return h2();
        }
        return (b0<R>)x2.a(call, (o<? super Object, ? extends g0<?>>)o);
    }
    
    @d
    @h("none")
    public final <R> b0<R> Q7(final Iterable<? extends g0<?>> iterable, final o<? super Object[], R> o) {
        b.g(iterable, "others is null");
        b.g(o, "combiner is null");
        return io.reactivex.plugins.a.R((b0<R>)new k4((g0<Object>)this, iterable, (o<? super Object[], Object>)o));
    }
    
    @d
    @h("none")
    public final <B> b0<List<T>> R(final g0<B> g0, final int n) {
        b.h(n, "initialCapacity");
        return this.S(g0, a.f(n));
    }
    
    @d
    @h("none")
    public final io.reactivex.c R0(final o<? super T, ? extends io.reactivex.i> o) {
        return this.S0(o, 2);
    }
    
    @d
    @h("none")
    public final b0<T> R1(final g<? super T> g) {
        b.g(g, "onAfterNext is null");
        return io.reactivex.plugins.a.R(new m0((g0<Object>)this, (g<? super Object>)g));
    }
    
    @d
    @h("none")
    public final b0<T> R4(final long lng, final r<? super Throwable> r) {
        if (lng >= 0L) {
            b.g(r, "predicate is null");
            return io.reactivex.plugins.a.R(new t2((b0<Object>)this, lng, r));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("times >= 0 required but it was ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @d
    @h("none")
    public final io.reactivex.c R5(@f final o<? super T, ? extends io.reactivex.i> o) {
        b.g(o, "mapper is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.o<Object>(this, o, false));
    }
    
    @d
    @h("none")
    public final <R> b0<R> R7(final g0<?>[] array, final o<? super Object[], R> o) {
        b.g(array, "others is null");
        b.g(o, "combiner is null");
        return io.reactivex.plugins.a.R((b0<R>)new k4((g0<Object>)this, array, (o<? super Object[], Object>)o));
    }
    
    @d
    @h("none")
    public final <B, U extends Collection<? super T>> b0<U> S(final g0<B> g0, final Callable<U> callable) {
        b.g(g0, "boundary is null");
        b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.R((b0<U>)new io.reactivex.internal.operators.observable.p((g0<Object>)this, (g0<Object>)g0, (Callable<Collection>)callable));
    }
    
    @d
    @h("none")
    public final io.reactivex.c S0(final o<? super T, ? extends io.reactivex.i> o, final int n) {
        b.g(o, "mapper is null");
        b.h(n, "capacityHint");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.l<Object>(this, o, j.G, n));
    }
    
    @d
    @h("none")
    public final b0<T> S1(final x5.a a) {
        b.g(a, "onFinally is null");
        return this.Y1(a.h(), a.h(), a.c, a);
    }
    
    @d
    @h("none")
    public final b0<T> S4(final x5.d<? super Integer, ? super Throwable> d) {
        b.g(d, "predicate is null");
        return io.reactivex.plugins.a.R(new s2((b0<Object>)this, d));
    }
    
    @d
    @h("none")
    public final io.reactivex.c S5(@f final o<? super T, ? extends io.reactivex.i> o) {
        b.g(o, "mapper is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.o<Object>(this, o, true));
    }
    
    @d
    @h("none")
    public final <TOpening, TClosing> b0<List<T>> T(final g0<? extends TOpening> g0, final o<? super TOpening, ? extends g0<? extends TClosing>> o) {
        return this.U((g0<?>)g0, (o<? super Object, ? extends g0<?>>)o, io.reactivex.internal.util.b.d());
    }
    
    @d
    @h("none")
    public final io.reactivex.c T0(final o<? super T, ? extends io.reactivex.i> o) {
        return this.V0(o, true, 2);
    }
    
    @d
    @h("none")
    public final b0<T> T1(final x5.a a) {
        b.g(a, "onFinally is null");
        return io.reactivex.plugins.a.R(new n0((g0<Object>)this, a));
    }
    
    @d
    @h("none")
    public final b0<T> T4(final r<? super Throwable> r) {
        return this.R4(Long.MAX_VALUE, r);
    }
    
    @d
    @h("none")
    public final <R> b0<R> T5(final o<? super T, ? extends g0<? extends R>> o) {
        return this.U5(o, X());
    }
    
    @d
    @h("none")
    public final <TOpening, TClosing, U extends Collection<? super T>> b0<U> U(final g0<? extends TOpening> g0, final o<? super TOpening, ? extends g0<? extends TClosing>> o, final Callable<U> callable) {
        b.g(g0, "openingIndicator is null");
        b.g(o, "closingIndicator is null");
        b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.R((b0<U>)new io.reactivex.internal.operators.observable.n((g0<Object>)this, g0, (o<? super Object, ? extends g0<?>>)o, (Callable<Collection>)callable));
    }
    
    @d
    @h("none")
    public final io.reactivex.c U0(final o<? super T, ? extends io.reactivex.i> o, final boolean b) {
        return this.V0(o, b, 2);
    }
    
    @d
    @h("none")
    public final b0<T> U1(final x5.a a) {
        return this.Y1(a.h(), a.h(), a, a.c);
    }
    
    @d
    @h("none")
    public final b0<T> U4(final x5.e e) {
        b.g(e, "stop is null");
        return this.R4(Long.MAX_VALUE, a.v(e));
    }
    
    @d
    @h("none")
    public final <R> b0<R> U5(final o<? super T, ? extends g0<? extends R>> o, final int n) {
        b.g(o, "mapper is null");
        b.h(n, "bufferSize");
        if (!(this instanceof y5.m)) {
            return io.reactivex.plugins.a.R((b0<R>)new m3((g0<Object>)this, (o<? super Object, ? extends g0<?>>)o, n, true));
        }
        final Object call = ((y5.m)this).call();
        if (call == null) {
            return h2();
        }
        return (b0<R>)x2.a(call, (o<? super Object, ? extends g0<?>>)o);
    }
    
    @d
    @h("none")
    public final b0<io.reactivex.schedulers.d<T>> U6() {
        return this.X6(TimeUnit.MILLISECONDS, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public final <B> b0<List<T>> V(final Callable<? extends g0<B>> callable) {
        return this.W((Callable<? extends g0<Object>>)callable, io.reactivex.internal.util.b.d());
    }
    
    @d
    @h("none")
    public final io.reactivex.c V0(final o<? super T, ? extends io.reactivex.i> o, final boolean b, final int n) {
        b.g(o, "mapper is null");
        b.h(n, "prefetch");
        j j;
        if (b) {
            j = io.reactivex.internal.util.j.I;
        }
        else {
            j = io.reactivex.internal.util.j.H;
        }
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.l<Object>((b0<Object>)this, (o<? super Object, ? extends io.reactivex.i>)o, j, n));
    }
    
    @d
    @h("none")
    public final b0<T> V1(final x5.a a) {
        return this.a2(a.h(), a);
    }
    
    @d
    @h("none")
    public final b0<T> V4(final o<? super b0<Throwable>, ? extends g0<?>> o) {
        b.g(o, "handler is null");
        return io.reactivex.plugins.a.R(new u2((g0<Object>)this, o));
    }
    
    @d
    @h("none")
    public final <R> b0<R> V5(@f final o<? super T, ? extends y<? extends R>> o) {
        b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<R>)new io.reactivex.internal.operators.mixed.p((b0<Object>)this, (o<? super Object, ? extends y<?>>)o, false));
    }
    
    @d
    @h("none")
    public final b0<io.reactivex.schedulers.d<T>> V6(final j0 j0) {
        return this.X6(TimeUnit.MILLISECONDS, j0);
    }
    
    @d
    @h("none")
    public final <B, U extends Collection<? super T>> b0<U> W(final Callable<? extends g0<B>> callable, final Callable<U> callable2) {
        b.g(callable, "boundarySupplier is null");
        b.g(callable2, "bufferSupplier is null");
        return io.reactivex.plugins.a.R((b0<U>)new io.reactivex.internal.operators.observable.o((g0<Object>)this, (Callable<? extends g0<Object>>)callable, (Callable<Collection>)callable2));
    }
    
    @d
    @h("none")
    public final <R> b0<R> W0(final o<? super T, ? extends g0<? extends R>> o) {
        return this.X0(o, X(), true);
    }
    
    @d
    @h("none")
    public final b0<T> W1(final i0<? super T> i0) {
        b.g(i0, "observer is null");
        return this.Y1(o1.f(i0), o1.e(i0), o1.d(i0), a.c);
    }
    
    @h("none")
    public final void W4(final i0<? super T> i0) {
        b.g(i0, "observer is null");
        if (i0 instanceof io.reactivex.observers.l) {
            this.c(i0);
        }
        else {
            this.c(new io.reactivex.observers.l<Object>(i0));
        }
    }
    
    @d
    @h("none")
    public final <R> b0<R> W5(@f final o<? super T, ? extends y<? extends R>> o) {
        b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<R>)new io.reactivex.internal.operators.mixed.p((b0<Object>)this, (o<? super Object, ? extends y<?>>)o, true));
    }
    
    @d
    @h("none")
    public final b0<io.reactivex.schedulers.d<T>> W6(final TimeUnit timeUnit) {
        return this.X6(timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public final <R> b0<R> X0(final o<? super T, ? extends g0<? extends R>> o, final int n, final boolean b) {
        b.g(o, "mapper is null");
        b.h(n, "prefetch");
        if (!(this instanceof y5.m)) {
            j j;
            if (b) {
                j = io.reactivex.internal.util.j.I;
            }
            else {
                j = io.reactivex.internal.util.j.H;
            }
            return io.reactivex.plugins.a.R((b0<R>)new v((g0<Object>)this, (o<? super Object, ? extends g0<?>>)o, n, j));
        }
        final Object call = ((y5.m)this).call();
        if (call == null) {
            return h2();
        }
        return (b0<R>)x2.a(call, (o<? super Object, ? extends g0<?>>)o);
    }
    
    @d
    @h("none")
    public final b0<T> X1(final g<? super a0<T>> g) {
        b.g(g, "onNotification is null");
        return this.Y1(a.t((g<? super a0<? super T>>)g), a.s((g<? super a0<Object>>)g), a.r((g<? super a0<Object>>)g), a.c);
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> X4(final long n, final TimeUnit timeUnit) {
        return this.Y4(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    @f
    public final <R> b0<R> X5(@f final o<? super T, ? extends q0<? extends R>> o) {
        b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<R>)new io.reactivex.internal.operators.mixed.q((b0<Object>)this, (o<? super Object, ? extends q0<?>>)o, false));
    }
    
    @d
    @h("none")
    public final b0<io.reactivex.schedulers.d<T>> X6(final TimeUnit timeUnit, final j0 j0) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return this.D3((o<? super T, ? extends io.reactivex.schedulers.d<T>>)a.w(timeUnit, j0));
    }
    
    @d
    @h("none")
    public final b0<T> Y() {
        return this.Z(16);
    }
    
    @d
    @h("none")
    public final <R> b0<R> Y0(final o<? super T, ? extends g0<? extends R>> o) {
        return this.Z0(o, Integer.MAX_VALUE, X());
    }
    
    @d
    @h("custom")
    public final b0<T> Y4(final long n, final TimeUnit timeUnit, final j0 j0) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R(new v2((g0<Object>)this, n, timeUnit, j0, false));
    }
    
    @d
    @h("none")
    @f
    public final <R> b0<R> Y5(@f final o<? super T, ? extends q0<? extends R>> o) {
        b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<R>)new io.reactivex.internal.operators.mixed.q((b0<Object>)this, (o<? super Object, ? extends q0<?>>)o, true));
    }
    
    @d
    @h("none")
    public final <R> R Y6(final o<? super b0<T>, R> o) {
        try {
            return b.g(o, "converter is null").apply(this);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            throw io.reactivex.internal.util.k.f(t);
        }
    }
    
    @d
    @h("none")
    public final b0<T> Z(final int n) {
        b.h(n, "initialCapacity");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.r((b0<Object>)this, n));
    }
    
    @d
    @h("none")
    public final <R> b0<R> Z0(final o<? super T, ? extends g0<? extends R>> o, final int n, final int n2) {
        b.g(o, "mapper is null");
        b.h(n, "maxConcurrency");
        b.h(n2, "prefetch");
        return io.reactivex.plugins.a.R((b0<R>)new w((g0<Object>)this, (o<? super Object, ? extends g0<?>>)o, j.G, n, n2));
    }
    
    @d
    @h("none")
    public final b0<T> Z1(final g<? super Throwable> g) {
        final g<? super T> h = a.h();
        final x5.a c = a.c;
        return this.Y1(h, g, c, c);
    }
    
    @d
    @h("none")
    public final <K> b0<io.reactivex.observables.b<K, T>> Z2(final o<? super T, ? extends K> o) {
        return this.c3(o, (o<? super T, ? extends T>)a.k(), false, X());
    }
    
    @d
    @h("none")
    public final b0<T> Z3(@f final io.reactivex.i i) {
        b.g(i, "other is null");
        return io.reactivex.plugins.a.R(new z1((b0<Object>)this, i));
    }
    
    @d
    @h("custom")
    public final b0<T> Z4(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R(new v2((g0<Object>)this, n, timeUnit, j0, b));
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.I)
    @d
    @h("none")
    public final io.reactivex.l<T> Z6(final io.reactivex.b b) {
        final k1<Object> k1 = new k1<Object>((b0<Object>)this);
        final int n = b0$a.a[b.ordinal()];
        if (n == 1) {
            return k1.A4();
        }
        if (n == 2) {
            return k1.C4();
        }
        if (n == 3) {
            return (io.reactivex.l<T>)k1;
        }
        if (n != 4) {
            return k1.s4();
        }
        return io.reactivex.plugins.a.P(new n2(k1));
    }
    
    @d
    @h("none")
    public final <U> b0<U> a0(final Class<U> clazz) {
        b.g(clazz, "clazz is null");
        return this.D3((o<? super T, ? extends U>)a.e((Class<? extends R>)clazz));
    }
    
    @d
    @h("none")
    public final <R> b0<R> a1(final o<? super T, ? extends g0<? extends R>> o, final int n, final int n2, final boolean b) {
        b.g(o, "mapper is null");
        b.h(n, "maxConcurrency");
        b.h(n2, "prefetch");
        j j;
        if (b) {
            j = io.reactivex.internal.util.j.I;
        }
        else {
            j = io.reactivex.internal.util.j.H;
        }
        return io.reactivex.plugins.a.R((b0<R>)new w((g0<Object>)this, (o<? super Object, ? extends g0<?>>)o, j, n, n2));
    }
    
    @d
    @h("none")
    public final b0<T> a2(final g<? super io.reactivex.disposables.c> g, final x5.a a) {
        b.g(g, "onSubscribe is null");
        b.g(a, "onDispose is null");
        return io.reactivex.plugins.a.R(new p0((b0<Object>)this, g, a));
    }
    
    @d
    @h("none")
    public final <K, V> b0<io.reactivex.observables.b<K, V>> a3(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        return this.c3(o, o2, false, X());
    }
    
    @d
    @h("none")
    public final b0<T> a4(@f final y<? extends T> y) {
        b.g(y, "other is null");
        return io.reactivex.plugins.a.R(new a2((b0<Object>)this, y));
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> a5(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.Z4(n, timeUnit, io.reactivex.schedulers.b.a(), b);
    }
    
    @d
    @h("none")
    public final Future<T> a7() {
        return this.N5(new io.reactivex.internal.observers.q<T>());
    }
    
    @d
    @h("none")
    public final <U> k0<U> b0(final Callable<? extends U> callable, final x5.b<? super U, ? super T> b) {
        b.g(callable, "initialValueSupplier is null");
        b.g(b, "collector is null");
        return io.reactivex.plugins.a.S((k0<U>)new t((g0<Object>)this, callable, (x5.b<? super Object, ? super Object>)b));
    }
    
    @d
    @h("none")
    public final <R> b0<R> b1(final o<? super T, ? extends g0<? extends R>> o, final boolean b) {
        return this.a1(o, Integer.MAX_VALUE, X(), b);
    }
    
    @d
    @h("none")
    public final b0<T> b2(final g<? super T> g) {
        final g<? super Throwable> h = a.h();
        final x5.a c = a.c;
        return this.Y1(g, h, c, c);
    }
    
    @d
    @h("none")
    public final <K, V> b0<io.reactivex.observables.b<K, V>> b3(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b) {
        return this.c3(o, o2, b, X());
    }
    
    @d
    @h("none")
    public final b0<T> b4(final g0<? extends T> g0) {
        b.g(g0, "other is null");
        return H3((g0<? extends T>)this, g0);
    }
    
    @d
    @h("none")
    public final <U> b0<T> b5(final g0<U> g0) {
        b.g(g0, "sampler is null");
        return io.reactivex.plugins.a.R(new w2((g0<Object>)this, g0, false));
    }
    
    @d
    @h("none")
    public final k0<List<T>> b7() {
        return this.c7(16);
    }
    
    @h("none")
    @Override
    public final void c(final i0<? super T> i0) {
        b.g(i0, "observer is null");
        try {
            final i0<? super Object> f0 = io.reactivex.plugins.a.f0((b0<Object>)this, (i0<? super Object>)i0);
            b.g(f0, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.L5(f0);
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable cause;
            io.reactivex.exceptions.b.b(cause);
            io.reactivex.plugins.a.Y(cause);
            final NullPointerException ex2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            ex2.initCause(cause);
            throw ex2;
        }
    }
    
    @d
    @h("none")
    public final <U> k0<U> c0(final U u, final x5.b<? super U, ? super T> b) {
        b.g(u, "initialValue is null");
        return this.b0((Callable<? extends U>)a.m((U)u), b);
    }
    
    @d
    @h("none")
    public final <U> b0<U> c1(final o<? super T, ? extends Iterable<? extends U>> o) {
        b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<U>)new b1((g0<Object>)this, (o<? super Object, ? extends Iterable<?>>)o));
    }
    
    @d
    @h("none")
    public final b0<T> c2(final g<? super io.reactivex.disposables.c> g) {
        return this.a2(g, a.c);
    }
    
    @d
    @h("none")
    public final <K, V> b0<io.reactivex.observables.b<K, V>> c3(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b, final int n) {
        b.g(o, "keySelector is null");
        b.g(o2, "valueSelector is null");
        b.h(n, "bufferSize");
        return io.reactivex.plugins.a.R((b0<io.reactivex.observables.b<K, V>>)new j1((g0<Object>)this, (o<? super Object, ?>)o, (o<? super Object, ?>)o2, n, b));
    }
    
    @d
    @h("none")
    public final b0<T> c4(@f final q0<? extends T> q0) {
        b.g(q0, "other is null");
        return io.reactivex.plugins.a.R(new b2((b0<Object>)this, q0));
    }
    
    @d
    @h("none")
    public final <U> b0<T> c5(final g0<U> g0, final boolean b) {
        b.g(g0, "sampler is null");
        return io.reactivex.plugins.a.R(new w2((g0<Object>)this, g0, b));
    }
    
    @d
    @h("none")
    public final k0<List<T>> c7(final int n) {
        b.h(n, "capacityHint");
        return io.reactivex.plugins.a.S((k0<List<T>>)new b4((g0<Object>)this, n));
    }
    
    @d
    @h("none")
    public final <U> b0<U> d1(final o<? super T, ? extends Iterable<? extends U>> o, final int n) {
        b.g(o, "mapper is null");
        b.h(n, "prefetch");
        return this.Q0((o<? super T, ? extends g0<? extends U>>)o1.a((o<? super T, ? extends Iterable<?>>)o), n);
    }
    
    @d
    @h("none")
    public final b0<T> d2(final x5.a a) {
        b.g(a, "onTerminate is null");
        return this.Y1(a.h(), a.a(a), a, a.c);
    }
    
    @d
    @h("none")
    public final <K> b0<io.reactivex.observables.b<K, T>> d3(final o<? super T, ? extends K> o, final boolean b) {
        return this.c3(o, (o<? super T, ? extends T>)a.k(), b, X());
    }
    
    @d
    @h("none")
    public final <R> b0<R> d5(final R r, final c<R, ? super T, R> c) {
        b.g(r, "initialValue is null");
        return this.f5((Callable<R>)a.m((R)r), c);
    }
    
    @d
    @h("none")
    public final b0<T> d6(final long lng) {
        if (lng >= 0L) {
            return io.reactivex.plugins.a.R(new n3((g0<Object>)this, lng));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @d
    @h("none")
    public final <U extends Collection<? super T>> k0<U> d7(final Callable<U> callable) {
        b.g(callable, "collectionSupplier is null");
        return io.reactivex.plugins.a.S((k0<U>)new b4((g0<Object>)this, (Callable<Collection>)callable));
    }
    
    @d
    @h("none")
    public final k0<Boolean> e(final r<? super T> r) {
        b.g(r, "predicate is null");
        return io.reactivex.plugins.a.S((k0<Boolean>)new io.reactivex.internal.operators.observable.g<Object>(this, r));
    }
    
    @d
    @h("none")
    public final <R> b0<R> e1(final o<? super T, ? extends y<? extends R>> o) {
        return this.f1(o, 2);
    }
    
    @d
    @h("none")
    public final s<T> e2(final long lng) {
        if (lng >= 0L) {
            return io.reactivex.plugins.a.Q(new r0<T>(this, lng));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(lng);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @d
    @h("none")
    public final <TRight, TLeftEnd, TRightEnd, R> b0<R> e3(final g0<? extends TRight> g0, final o<? super T, ? extends g0<TLeftEnd>> o, final o<? super TRight, ? extends g0<TRightEnd>> o2, final c<? super T, ? super b0<TRight>, ? extends R> c) {
        b.g(g0, "other is null");
        b.g(o, "leftEnd is null");
        b.g(o2, "rightEnd is null");
        b.g(c, "resultSelector is null");
        return io.reactivex.plugins.a.R((b0<R>)new io.reactivex.internal.operators.observable.k1((g0<Object>)this, g0, (o<? super Object, ? extends g0<Object>>)o, (o<? super Object, ? extends g0<Object>>)o2, (c<? super Object, ? super b0<Object>, ?>)c));
    }
    
    @d
    @h("custom")
    public final b0<T> e4(final j0 j0) {
        return this.g4(j0, false, X());
    }
    
    @d
    @h("none")
    public final b0<T> e5(final c<T, T, T> c) {
        b.g(c, "accumulator is null");
        return io.reactivex.plugins.a.R(new y2((g0<Object>)this, (c<Object, Object, Object>)c));
    }
    
    @d
    @h("none")
    public final b0<T> e6(final long n, final TimeUnit timeUnit) {
        return this.p6(S6(n, timeUnit));
    }
    
    @d
    @h("none")
    public final <K> k0<Map<K, T>> e7(final o<? super T, ? extends K> o) {
        b.g(o, "keySelector is null");
        return this.b0((Callable<? extends Map<K, T>>)io.reactivex.internal.util.m.b(), (x5.b<? super Map<K, T>, ? super T>)a.F((o<? super T, ?>)o));
    }
    
    @d
    @h("none")
    public final <R> b0<R> f1(final o<? super T, ? extends y<? extends R>> o, final int n) {
        b.g(o, "mapper is null");
        b.h(n, "prefetch");
        return io.reactivex.plugins.a.R((b0<R>)new io.reactivex.internal.operators.mixed.m((b0<Object>)this, (o<? super Object, ? extends y<?>>)o, j.G, n));
    }
    
    @d
    @h("none")
    public final k0<T> f2(final long lng, final T t) {
        if (lng >= 0L) {
            b.g(t, "defaultItem is null");
            return io.reactivex.plugins.a.S(new s0<T>(this, lng, t));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(lng);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @d
    @h("none")
    public final b0<T> f3() {
        return io.reactivex.plugins.a.R(new l1((g0<Object>)this));
    }
    
    @d
    @h("custom")
    public final b0<T> f4(final j0 j0, final boolean b) {
        return this.g4(j0, b, X());
    }
    
    @d
    @h("none")
    public final <R> b0<R> f5(final Callable<R> callable, final c<R, ? super T, R> c) {
        b.g(callable, "seedSupplier is null");
        b.g(c, "accumulator is null");
        return io.reactivex.plugins.a.R((b0<R>)new z2((g0<Object>)this, (Callable<Object>)callable, (c<Object, ? super Object, Object>)c));
    }
    
    @d
    @h("custom")
    public final b0<T> f6(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.p6(T6(n, timeUnit, j0));
    }
    
    @d
    @h("none")
    public final <K, V> k0<Map<K, V>> f7(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        b.g(o, "keySelector is null");
        b.g(o2, "valueSelector is null");
        return this.b0((Callable<? extends Map<K, V>>)io.reactivex.internal.util.m.b(), (x5.b<? super Map<K, V>, ? super T>)a.G((o<? super T, ?>)o, (o<? super T, ?>)o2));
    }
    
    @d
    @h("none")
    public final <R> b0<R> g1(final o<? super T, ? extends y<? extends R>> o) {
        return this.i1(o, true, 2);
    }
    
    @d
    @h("none")
    public final k0<T> g2(final long lng) {
        if (lng >= 0L) {
            return io.reactivex.plugins.a.S(new s0<T>(this, lng, null));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(lng);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @d
    @h("none")
    public final io.reactivex.c g3() {
        return io.reactivex.plugins.a.O(new n1<Object>(this));
    }
    
    @d
    @h("custom")
    public final b0<T> g4(final j0 j0, final boolean b, final int n) {
        b.g(j0, "scheduler is null");
        b.h(n, "bufferSize");
        return io.reactivex.plugins.a.R(new d2((g0<Object>)this, j0, b, n));
    }
    
    @d
    @h("none")
    public final b0<T> g6(final int i) {
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i == 0) {
            return io.reactivex.plugins.a.R(new m1((g0<Object>)this));
        }
        if (i == 1) {
            return io.reactivex.plugins.a.R(new p3((g0<Object>)this));
        }
        return io.reactivex.plugins.a.R(new o3((g0<Object>)this, i));
    }
    
    @d
    @h("none")
    public final <K, V> k0<Map<K, V>> g7(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final Callable<? extends Map<K, V>> callable) {
        b.g(o, "keySelector is null");
        b.g(o2, "valueSelector is null");
        b.g(callable, "mapSupplier is null");
        return this.b0(callable, (x5.b<? super Map<K, V>, ? super T>)a.G((o<? super T, ?>)o, (o<? super T, ?>)o2));
    }
    
    @d
    @h("none")
    public final <R> b0<R> h1(final o<? super T, ? extends y<? extends R>> o, final boolean b) {
        return this.i1(o, b, 2);
    }
    
    @d
    @h("none")
    public final <U> b0<U> h4(final Class<U> clazz) {
        b.g(clazz, "clazz is null");
        return (b0<U>)this.k2(a.l(clazz)).a0((Class<Object>)clazz);
    }
    
    @d
    @h("io.reactivex:trampoline")
    public final b0<T> h6(final long n, final long n2, final TimeUnit timeUnit) {
        return this.j6(n, n2, timeUnit, io.reactivex.schedulers.b.i(), false, X());
    }
    
    @d
    @h("none")
    public final <K> k0<Map<K, Collection<T>>> h7(final o<? super T, ? extends K> o) {
        return this.k7(o, (o<? super T, ? extends T>)a.k(), (Callable<? extends Map<K, Collection<T>>>)io.reactivex.internal.util.m.b(), (o<? super K, ? extends Collection<? super T>>)io.reactivex.internal.util.b.f());
    }
    
    @d
    @h("none")
    public final <U, R> b0<R> h8(final g0<? extends U> g0, final c<? super T, ? super U, ? extends R> c) {
        b.g(g0, "other is null");
        return a8((g0<?>)this, (g0<?>)g0, (c<? super Object, ? super Object, ? extends R>)c);
    }
    
    @d
    @h("none")
    public final b0<T> i(final g0<? extends T> g0) {
        b.g(g0, "other is null");
        return h(this, g0);
    }
    
    @d
    @h("none")
    public final <R> b0<R> i1(final o<? super T, ? extends y<? extends R>> o, final boolean b, final int n) {
        b.g(o, "mapper is null");
        b.h(n, "prefetch");
        j j;
        if (b) {
            j = io.reactivex.internal.util.j.I;
        }
        else {
            j = io.reactivex.internal.util.j.H;
        }
        return io.reactivex.plugins.a.R((b0<R>)new io.reactivex.internal.operators.mixed.m((b0<Object>)this, (o<? super Object, ? extends y<?>>)o, j, n));
    }
    
    @d
    @h("none")
    public final b0<T> i4(final g0<? extends T> g0) {
        b.g(g0, "next is null");
        return this.j4(a.n(g0));
    }
    
    @d
    @h("custom")
    public final b0<T> i6(final long n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        return this.j6(n, n2, timeUnit, j0, false, X());
    }
    
    @d
    @h("none")
    public final <K, V> k0<Map<K, Collection<V>>> i7(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        return this.k7(o, o2, (Callable<? extends Map<K, Collection<V>>>)io.reactivex.internal.util.m.b(), (o<? super K, ? extends Collection<? super V>>)io.reactivex.internal.util.b.f());
    }
    
    @d
    @h("none")
    public final <U, R> b0<R> i8(final g0<? extends U> g0, final c<? super T, ? super U, ? extends R> c, final boolean b) {
        return b8((g0<?>)this, (g0<?>)g0, (c<? super Object, ? super Object, ? extends R>)c, b);
    }
    
    @d
    @h("none")
    public final k0<Boolean> j(final r<? super T> r) {
        b.g(r, "predicate is null");
        return io.reactivex.plugins.a.S((k0<Boolean>)new io.reactivex.internal.operators.observable.j<Object>(this, r));
    }
    
    @d
    @h("none")
    public final <R> b0<R> j1(final o<? super T, ? extends q0<? extends R>> o) {
        return this.k1(o, 2);
    }
    
    @d
    @h("none")
    public final b0<T> j4(final o<? super Throwable, ? extends g0<? extends T>> o) {
        b.g(o, "resumeFunction is null");
        return io.reactivex.plugins.a.R(new e2((g0<Object>)this, o, false));
    }
    
    @d
    @h("custom")
    public final b0<T> j6(final long lng, final long n, final TimeUnit timeUnit, final j0 j0, final boolean b, final int n2) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        b.h(n2, "bufferSize");
        if (lng >= 0L) {
            return io.reactivex.plugins.a.R(new q3((g0<Object>)this, lng, n, timeUnit, j0, n2, b));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(lng);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @d
    @h("none")
    public final <K, V> k0<Map<K, Collection<V>>> j7(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final Callable<Map<K, Collection<V>>> callable) {
        return this.k7(o, o2, (Callable<? extends Map<K, Collection<V>>>)callable, (o<? super K, ? extends Collection<? super V>>)io.reactivex.internal.util.b.f());
    }
    
    @d
    @h("none")
    public final <U, R> b0<R> j8(final g0<? extends U> g0, final c<? super T, ? super U, ? extends R> c, final boolean b, final int n) {
        return c8((g0<?>)this, (g0<?>)g0, (c<? super Object, ? super Object, ? extends R>)c, b, n);
    }
    
    @d
    @h("none")
    public final <R> R k(@f final io.reactivex.c0<T, ? extends R> c0) {
        return (R)b.g(c0, "converter is null").a(this);
    }
    
    @d
    @h("none")
    public final <R> b0<R> k1(final o<? super T, ? extends q0<? extends R>> o, final int n) {
        b.g(o, "mapper is null");
        b.h(n, "prefetch");
        return io.reactivex.plugins.a.R((b0<R>)new io.reactivex.internal.operators.mixed.n((b0<Object>)this, (o<? super Object, ? extends q0<?>>)o, j.G, n));
    }
    
    @d
    @h("none")
    public final b0<T> k2(final r<? super T> r) {
        b.g(r, "predicate is null");
        return io.reactivex.plugins.a.R(new v0((g0<Object>)this, (r<? super Object>)r));
    }
    
    @d
    @h("none")
    public final b0<T> k4(final o<? super Throwable, ? extends T> o) {
        b.g(o, "valueSupplier is null");
        return io.reactivex.plugins.a.R(new f2((g0<Object>)this, o));
    }
    
    @d
    @h("none")
    public final b0<T> k5() {
        return io.reactivex.plugins.a.R(new c3((b0<Object>)this));
    }
    
    @d
    @h("io.reactivex:trampoline")
    public final b0<T> k6(final long n, final TimeUnit timeUnit) {
        return this.n6(n, timeUnit, io.reactivex.schedulers.b.i(), false, X());
    }
    
    @d
    @h("none")
    public final <K, V> k0<Map<K, Collection<V>>> k7(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final Callable<? extends Map<K, Collection<V>>> callable, final o<? super K, ? extends Collection<? super V>> o3) {
        b.g(o, "keySelector is null");
        b.g(o2, "valueSelector is null");
        b.g(callable, "mapSupplier is null");
        b.g(o3, "collectionFactory is null");
        return this.b0(callable, (x5.b<? super Map<K, Collection<V>>, ? super T>)a.H((o<? super T, ?>)o, (o<? super T, ?>)o2, (o<? super Object, ? extends Collection<? super Object>>)o3));
    }
    
    @d
    @h("none")
    public final <U, R> b0<R> k8(final Iterable<U> iterable, final c<? super T, ? super U, ? extends R> c) {
        b.g(iterable, "other is null");
        b.g(c, "zipper is null");
        return io.reactivex.plugins.a.R((b0<R>)new m4(this, (Iterable<Object>)iterable, (c<? super Object, ? super Object, ?>)c));
    }
    
    @d
    @h("none")
    public final <R> b0<R> l1(final o<? super T, ? extends q0<? extends R>> o) {
        return this.n1(o, true, 2);
    }
    
    @d
    @h("none")
    public final k0<T> l2(final T t) {
        return this.f2(0L, t);
    }
    
    @d
    @h("none")
    public final b0<T> l4(final T t) {
        b.g(t, "item is null");
        return this.k4(a.n(t));
    }
    
    @d
    @h("none")
    public final b0<T> l5() {
        return this.p4().q8();
    }
    
    @d
    @h("custom")
    public final b0<T> l6(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.n6(n, timeUnit, j0, false, X());
    }
    
    @d
    @h("none")
    public final k0<List<T>> l7() {
        return this.n7(a.q());
    }
    
    @d
    @h("none")
    public final <R> b0<R> m1(final o<? super T, ? extends q0<? extends R>> o, final boolean b) {
        return this.n1(o, b, 2);
    }
    
    @d
    @h("none")
    public final s<T> m2() {
        return this.e2(0L);
    }
    
    @d
    @h("none")
    public final b0<T> m4(final g0<? extends T> g0) {
        b.g(g0, "next is null");
        return io.reactivex.plugins.a.R(new e2((g0<Object>)this, a.n((g0<? extends T>)g0), true));
    }
    
    @d
    @h("none")
    public final k0<T> m5(final T t) {
        b.g(t, "defaultItem is null");
        return io.reactivex.plugins.a.S(new e3<T>((g0<? extends T>)this, t));
    }
    
    @d
    @h("custom")
    public final b0<T> m6(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b) {
        return this.n6(n, timeUnit, j0, b, X());
    }
    
    @d
    @h("none")
    public final k0<List<T>> m7(final int n) {
        return this.o7(a.q(), n);
    }
    
    @d
    @h("none")
    public final T n() {
        final io.reactivex.internal.observers.f<T> f = (io.reactivex.internal.observers.f<T>)new io.reactivex.internal.observers.f<Object>();
        this.c(f);
        final Object a = f.a();
        if (a != null) {
            return (T)a;
        }
        throw new NoSuchElementException();
    }
    
    @d
    @h("none")
    public final <R> b0<R> n1(final o<? super T, ? extends q0<? extends R>> o, final boolean b, final int n) {
        b.g(o, "mapper is null");
        b.h(n, "prefetch");
        j j;
        if (b) {
            j = io.reactivex.internal.util.j.I;
        }
        else {
            j = io.reactivex.internal.util.j.H;
        }
        return io.reactivex.plugins.a.R((b0<R>)new io.reactivex.internal.operators.mixed.n((b0<Object>)this, (o<? super Object, ? extends q0<?>>)o, j, n));
    }
    
    @d
    @h("none")
    public final k0<T> n2() {
        return this.g2(0L);
    }
    
    @d
    @h("none")
    public final k0<Boolean> n3() {
        return this.e(a.b());
    }
    
    @d
    @h("none")
    public final b0<T> n4() {
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.j0((g0<Object>)this));
    }
    
    @d
    @h("none")
    public final s<T> n5() {
        return io.reactivex.plugins.a.Q(new d3<T>(this));
    }
    
    @d
    @h("custom")
    public final b0<T> n6(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b, final int n2) {
        return this.j6(Long.MAX_VALUE, n, timeUnit, j0, b, n2);
    }
    
    @d
    @h("none")
    public final k0<List<T>> n7(final Comparator<? super T> comparator) {
        b.g(comparator, "comparator is null");
        return this.b7().v0((o<? super List<T>, ? extends List<T>>)a.o((Comparator<? super Object>)comparator));
    }
    
    @d
    @h("none")
    public final T o(T t) {
        final io.reactivex.internal.observers.f<T> f = (io.reactivex.internal.observers.f<T>)new io.reactivex.internal.observers.f<Object>();
        this.c(f);
        final Object a = f.a();
        if (a != null) {
            t = (T)a;
        }
        return t;
    }
    
    @d
    @h("none")
    public final b0<T> o1(@f final io.reactivex.i i) {
        b.g(i, "other is null");
        return io.reactivex.plugins.a.R(new x((b0<Object>)this, i));
    }
    
    @d
    @h("none")
    public final <R> b0<R> o2(final o<? super T, ? extends g0<? extends R>> o) {
        return this.x2(o, false);
    }
    
    @d
    @h("none")
    public final <TRight, TLeftEnd, TRightEnd, R> b0<R> o3(final g0<? extends TRight> g0, final o<? super T, ? extends g0<TLeftEnd>> o, final o<? super TRight, ? extends g0<TRightEnd>> o2, final c<? super T, ? super TRight, ? extends R> c) {
        b.g(g0, "other is null");
        b.g(o, "leftEnd is null");
        b.g(o2, "rightEnd is null");
        b.g(c, "resultSelector is null");
        return io.reactivex.plugins.a.R((b0<R>)new r1((g0<Object>)this, g0, (o<? super Object, ? extends g0<Object>>)o, (o<? super Object, ? extends g0<Object>>)o2, (c<? super Object, ? super Object, ?>)c));
    }
    
    @d
    @h("none")
    public final <R> b0<R> o4(final o<? super b0<T>, ? extends g0<R>> o) {
        b.g(o, "selector is null");
        return io.reactivex.plugins.a.R((b0<R>)new h2((g0<Object>)this, (o<? super b0<Object>, ? extends g0<Object>>)o));
    }
    
    @d
    @h("none")
    public final k0<T> o5() {
        return io.reactivex.plugins.a.S(new e3<T>((g0<? extends T>)this, null));
    }
    
    @d
    @h("io.reactivex:trampoline")
    public final b0<T> o6(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.n6(n, timeUnit, io.reactivex.schedulers.b.i(), b, X());
    }
    
    @d
    @h("none")
    public final k0<List<T>> o7(final Comparator<? super T> comparator, final int n) {
        b.g(comparator, "comparator is null");
        return this.c7(n).v0((o<? super List<T>, ? extends List<T>>)a.o((Comparator<? super Object>)comparator));
    }
    
    @h("none")
    public final void p(final g<? super T> g) {
        final Iterator<T> iterator = this.q().iterator();
        while (iterator.hasNext()) {
            try {
                g.accept(iterator.next());
                continue;
            }
            finally {
                io.reactivex.exceptions.b.b((Throwable)g);
                ((io.reactivex.disposables.c)iterator).dispose();
                throw io.reactivex.internal.util.k.f((Throwable)g);
            }
            break;
        }
    }
    
    @d
    @h("none")
    public final b0<T> p1(@f final y<? extends T> y) {
        b.g(y, "other is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.y((b0<Object>)this, y));
    }
    
    @d
    @h("none")
    public final <R> b0<R> p2(final o<? super T, ? extends g0<? extends R>> o, final int n) {
        return this.z2(o, false, n, X());
    }
    
    @d
    @h("none")
    public final io.reactivex.observables.a<T> p4() {
        return g2.w8((g0<T>)this);
    }
    
    @d
    @h("none")
    public final b0<T> p5(final long n) {
        if (n <= 0L) {
            return io.reactivex.plugins.a.R(this);
        }
        return io.reactivex.plugins.a.R(new f3((g0<Object>)this, n));
    }
    
    @d
    @h("none")
    public final <U> b0<T> p6(final g0<U> g0) {
        b.g(g0, "other is null");
        return io.reactivex.plugins.a.R((b0<T>)new r3((g0<Object>)this, g0));
    }
    
    @d
    @h("none")
    public final Iterable<T> q() {
        return this.r(X());
    }
    
    @d
    @h("none")
    public final b0<T> q1(final g0<? extends T> g0) {
        b.g(g0, "other is null");
        return y0((g0<? extends T>)this, g0);
    }
    
    @d
    @h("none")
    public final <U, R> b0<R> q2(final o<? super T, ? extends g0<? extends U>> o, final c<? super T, ? super U, ? extends R> c) {
        return this.u2((o<? super T, ? extends g0<?>>)o, (c<? super T, ? super Object, ? extends R>)c, false, X(), X());
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> q5(final long n, final TimeUnit timeUnit) {
        return this.y5(S6(n, timeUnit));
    }
    
    @d
    @h("none")
    public final b0<T> q6(final r<? super T> r) {
        b.g(r, "stopPredicate is null");
        return io.reactivex.plugins.a.R(new s3((g0<Object>)this, (r<? super Object>)r));
    }
    
    @d
    @h("custom")
    public final b0<T> q7(final j0 j0) {
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R(new c4((g0<Object>)this, j0));
    }
    
    @d
    @h("none")
    public final Iterable<T> r(final int n) {
        b.h(n, "bufferSize");
        return new io.reactivex.internal.operators.observable.b<T>((g0<? extends T>)this, n);
    }
    
    @d
    @h("none")
    public final b0<T> r1(@f final q0<? extends T> q0) {
        b.g(q0, "other is null");
        return io.reactivex.plugins.a.R(new z((b0<Object>)this, q0));
    }
    
    @d
    @h("none")
    public final <U, R> b0<R> r2(final o<? super T, ? extends g0<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final int n) {
        return this.u2((o<? super T, ? extends g0<?>>)o, (c<? super T, ? super Object, ? extends R>)c, false, n, X());
    }
    
    @d
    @h("custom")
    public final b0<T> r5(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.y5(T6(n, timeUnit, j0));
    }
    
    @d
    @h("none")
    public final b0<T> r6(final r<? super T> r) {
        b.g(r, "predicate is null");
        return io.reactivex.plugins.a.R(new t3((g0<Object>)this, (r<? super Object>)r));
    }
    
    @d
    @h("none")
    public final T s() {
        final io.reactivex.internal.observers.g<T> g = (io.reactivex.internal.observers.g<T>)new io.reactivex.internal.observers.g<Object>();
        this.c(g);
        final Object a = g.a();
        if (a != null) {
            return (T)a;
        }
        throw new NoSuchElementException();
    }
    
    @d
    @h("none")
    public final k0<Boolean> s1(final Object o) {
        b.g(o, "element is null");
        return this.j(a.i(o));
    }
    
    @d
    @h("none")
    public final <U, R> b0<R> s2(final o<? super T, ? extends g0<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b) {
        return this.u2((o<? super T, ? extends g0<?>>)o, (c<? super T, ? super Object, ? extends R>)c, b, X(), X());
    }
    
    @d
    @h("none")
    public final s<T> s4(final c<T, T, T> c) {
        b.g(c, "reducer is null");
        return io.reactivex.plugins.a.Q(new k2<T>(this, c));
    }
    
    @d
    @h("none")
    public final b0<T> s5(final int i) {
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i == 0) {
            return io.reactivex.plugins.a.R(this);
        }
        return io.reactivex.plugins.a.R(new g3((g0<Object>)this, i));
    }
    
    @d
    @h("none")
    public final io.reactivex.observers.n<T> s6() {
        final io.reactivex.observers.n<Object> n = new io.reactivex.observers.n<Object>();
        this.c(n);
        return (io.reactivex.observers.n<T>)n;
    }
    
    @d
    @h("none")
    public final T t(T t) {
        final io.reactivex.internal.observers.g<T> g = (io.reactivex.internal.observers.g<T>)new io.reactivex.internal.observers.g<Object>();
        this.c(g);
        final Object a = g.a();
        if (a != null) {
            t = (T)a;
        }
        return t;
    }
    
    @d
    @h("none")
    public final k0<Long> t1() {
        return io.reactivex.plugins.a.S((k0<Long>)new io.reactivex.internal.operators.observable.b0<Object>(this));
    }
    
    @d
    @h("none")
    public final <U, R> b0<R> t2(final o<? super T, ? extends g0<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b, final int n) {
        return this.u2((o<? super T, ? extends g0<?>>)o, (c<? super T, ? super Object, ? extends R>)c, b, n, X());
    }
    
    @d
    @h("none")
    public final <R> k0<R> t4(final R r, final c<R, ? super T, R> c) {
        b.g(r, "seed is null");
        b.g(c, "reducer is null");
        return io.reactivex.plugins.a.S((k0<R>)new l2((g0<Object>)this, r, (c<Object, ? super Object, Object>)c));
    }
    
    @d
    @h("io.reactivex:trampoline")
    public final b0<T> t5(final long n, final TimeUnit timeUnit) {
        return this.w5(n, timeUnit, io.reactivex.schedulers.b.i(), false, X());
    }
    
    @d
    @h("none")
    public final io.reactivex.observers.n<T> t6(final boolean b) {
        final io.reactivex.observers.n<Object> n = new io.reactivex.observers.n<Object>();
        if (b) {
            n.dispose();
        }
        this.c(n);
        return (io.reactivex.observers.n<T>)n;
    }
    
    @d
    @h("none")
    public final b0<b0<T>> t7(final long n) {
        return this.v7(n, n, X());
    }
    
    @d
    @h("none")
    public final Iterable<T> u() {
        return new io.reactivex.internal.operators.observable.c<T>(this);
    }
    
    @d
    @h("none")
    public final <U, R> b0<R> u2(final o<? super T, ? extends g0<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b, final int n, final int n2) {
        b.g(o, "mapper is null");
        b.g(c, "combiner is null");
        return this.z2((o<? super T, ? extends g0<? extends R>>)o1.b((o<? super T, ? extends g0<?>>)o, (c<? super T, ? super Object, ?>)c), b, n, n2);
    }
    
    @d
    @h("none")
    public final <R> k0<R> u4(final Callable<R> callable, final c<R, ? super T, R> c) {
        b.g(callable, "seedSupplier is null");
        b.g(c, "reducer is null");
        return io.reactivex.plugins.a.S((k0<R>)new m2((g0<Object>)this, (Callable<Object>)callable, (c<Object, ? super Object, Object>)c));
    }
    
    @d
    @h("custom")
    public final b0<T> u5(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.w5(n, timeUnit, j0, false, X());
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> u6(final long n, final TimeUnit timeUnit) {
        return this.v6(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public final b0<b0<T>> u7(final long n, final long n2) {
        return this.v7(n, n2, X());
    }
    
    @d
    @h("none")
    public final Iterable<T> v(final T t) {
        return new io.reactivex.internal.operators.observable.d<T>(this, t);
    }
    
    @d
    @h("none")
    public final <R> b0<R> v0(final io.reactivex.h0<? super T, ? extends R> h0) {
        return S7((g0<R>)b.g(h0, "composer is null").a(this));
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> v1(final long n, final TimeUnit timeUnit) {
        return this.w1(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    public final <R> b0<R> v2(final o<? super T, ? extends g0<? extends R>> o, final o<? super Throwable, ? extends g0<? extends R>> o2, final Callable<? extends g0<? extends R>> callable) {
        b.g(o, "onNextMapper is null");
        b.g(o2, "onErrorMapper is null");
        b.g(callable, "onCompleteSupplier is null");
        return F3((g0<? extends g0<? extends R>>)new x1((g0<Object>)this, (o<? super Object, ? extends g0<?>>)o, o2, callable));
    }
    
    @d
    @h("none")
    public final b0<T> v4() {
        return this.w4(Long.MAX_VALUE);
    }
    
    @d
    @h("custom")
    public final b0<T> v5(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b) {
        return this.w5(n, timeUnit, j0, b, X());
    }
    
    @d
    @h("custom")
    public final b0<T> v6(final long n, final TimeUnit timeUnit, final j0 j0) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R(new u3((g0<Object>)this, n, timeUnit, j0));
    }
    
    @d
    @h("none")
    public final b0<b0<T>> v7(final long n, final long n2, final int n3) {
        b.i(n, "count");
        b.i(n2, "skip");
        b.h(n3, "bufferSize");
        return io.reactivex.plugins.a.R(new e4((g0<Object>)this, n, n2, n3));
    }
    
    @d
    @h("none")
    public final Iterable<T> w() {
        return new io.reactivex.internal.operators.observable.e<T>(this);
    }
    
    @d
    @h("custom")
    public final b0<T> w1(final long n, final TimeUnit timeUnit, final j0 j0) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.e0((g0<Object>)this, n, timeUnit, j0));
    }
    
    @d
    @h("none")
    public final <R> b0<R> w2(final o<? super T, ? extends g0<? extends R>> o, final o<Throwable, ? extends g0<? extends R>> o2, final Callable<? extends g0<? extends R>> callable, final int n) {
        b.g(o, "onNextMapper is null");
        b.g(o2, "onErrorMapper is null");
        b.g(callable, "onCompleteSupplier is null");
        return G3((g0<? extends g0<? extends R>>)new x1((g0<Object>)this, (o<? super Object, ? extends g0<?>>)o, o2, callable), n);
    }
    
    @d
    @h("none")
    public final b0<T> w4(final long lng) {
        final long n = lcmp(lng, 0L);
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("times >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n == 0) {
            return h2();
        }
        return io.reactivex.plugins.a.R(new o2((b0<Object>)this, lng));
    }
    
    @d
    @h("custom")
    public final b0<T> w5(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b, final int n2) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        b.h(n2, "bufferSize");
        return io.reactivex.plugins.a.R(new h3((g0<Object>)this, n, timeUnit, j0, n2 << 1, b));
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> w6(final long n, final TimeUnit timeUnit) {
        return this.X4(n, timeUnit);
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<b0<T>> w7(final long n, final long n2, final TimeUnit timeUnit) {
        return this.y7(n, n2, timeUnit, io.reactivex.schedulers.b.a(), X());
    }
    
    @d
    @h("none")
    public final T x() {
        final T k = this.n5().k();
        if (k != null) {
            return k;
        }
        throw new NoSuchElementException();
    }
    
    @d
    @h("none")
    public final <U> b0<T> x1(final o<? super T, ? extends g0<U>> o) {
        b.g(o, "debounceSelector is null");
        return io.reactivex.plugins.a.R((b0<T>)new d0((g0<Object>)this, (o<? super Object, ? extends g0<Object>>)o));
    }
    
    @d
    @h("none")
    public final <R> b0<R> x2(final o<? super T, ? extends g0<? extends R>> o, final boolean b) {
        return this.y2(o, b, Integer.MAX_VALUE);
    }
    
    @d
    @h("none")
    public final b0<T> x4(final x5.e e) {
        b.g(e, "stop is null");
        return io.reactivex.plugins.a.R(new p2((b0<Object>)this, e));
    }
    
    @d
    @h("io.reactivex:trampoline")
    public final b0<T> x5(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.w5(n, timeUnit, io.reactivex.schedulers.b.i(), b, X());
    }
    
    @d
    @h("custom")
    public final b0<T> x6(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.Y4(n, timeUnit, j0);
    }
    
    @d
    @h("custom")
    public final b0<b0<T>> x7(final long n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        return this.y7(n, n2, timeUnit, j0, X());
    }
    
    @d
    @h("none")
    public final T y(final T t) {
        return this.m5(t).k();
    }
    
    @d
    @h("none")
    public final b0<T> y1(final T t) {
        b.g(t, "defaultItem is null");
        return this.O5((g0<? extends T>)p3(t));
    }
    
    @d
    @h("none")
    public final <R> b0<R> y2(final o<? super T, ? extends g0<? extends R>> o, final boolean b, final int n) {
        return this.z2(o, b, n, X());
    }
    
    @d
    @h("none")
    public final b0<T> y4(final o<? super b0<Object>, ? extends g0<?>> o) {
        b.g(o, "handler is null");
        return io.reactivex.plugins.a.R(new q2((g0<Object>)this, o));
    }
    
    @d
    @h("none")
    public final <U> b0<T> y5(final g0<U> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "other is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: new             Lio/reactivex/internal/operators/observable/i3;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   io/reactivex/internal/operators/observable/i3.<init>:(Lio/reactivex/g0;Lio/reactivex/g0;)V
        //    17: invokestatic    io/reactivex/plugins/a.R:(Lio/reactivex/b0;)Lio/reactivex/b0;
        //    20: areturn        
        //    Signature:
        //  <U:Ljava/lang/Object;>(Lio/reactivex/g0<TU;>;)Lio/reactivex/b0<TT;>;
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MetadataHelper$AdaptFailure
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2300)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2221)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2255)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2232)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2245)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2221)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.adapt(MetadataHelper.java:1312)
        //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1010)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitClassType(MetadataHelper.java:2146)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitParameterizedType(MetadataHelper.java:2165)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitParameterizedType(MetadataHelper.java:2075)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:21)
        //     at com.strobel.assembler.metadata.MetadataHelper.getSuperType(MetadataHelper.java:1264)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitClassType(MetadataHelper.java:2011)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitParameterizedType(MetadataHelper.java:2056)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitParameterizedType(MetadataHelper.java:1994)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.asSuper(MetadataHelper.java:727)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1853)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:568)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:922)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2515)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:759)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1011)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<T> y6(final long n, final TimeUnit timeUnit) {
        return this.A6(n, timeUnit, io.reactivex.schedulers.b.a(), false);
    }
    
    @d
    @h("custom")
    public final b0<b0<T>> y7(final long n, final long n2, final TimeUnit timeUnit, final j0 j0, final int n3) {
        b.i(n, "timespan");
        b.i(n2, "timeskip");
        b.h(n3, "bufferSize");
        b.g(j0, "scheduler is null");
        b.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.R(new i4((g0<Object>)this, n, n2, timeUnit, j0, Long.MAX_VALUE, n3, false));
    }
    
    @h("none")
    public final void z() {
        io.reactivex.internal.operators.observable.l.a((g0<?>)this);
    }
    
    @d
    @h("none")
    public final <R> b0<R> z2(final o<? super T, ? extends g0<? extends R>> o, final boolean b, final int n, final int n2) {
        b.g(o, "mapper is null");
        b.h(n, "maxConcurrency");
        b.h(n2, "bufferSize");
        if (!(this instanceof y5.m)) {
            return io.reactivex.plugins.a.R((b0<R>)new w0((g0<Object>)this, (o<? super Object, ? extends g0<?>>)o, b, n, n2));
        }
        final Object call = ((y5.m)this).call();
        if (call == null) {
            return h2();
        }
        return (b0<R>)x2.a(call, (o<? super Object, ? extends g0<?>>)o);
    }
    
    @d
    @h("none")
    public final k0<T> z3(final T t) {
        b.g(t, "defaultItem is null");
        return io.reactivex.plugins.a.S(new u1<T>(this, t));
    }
    
    @d
    @h("none")
    public final <R> b0<R> z4(final o<? super b0<T>, ? extends g0<R>> o) {
        b.g(o, "selector is null");
        return r2.B8((Callable<? extends io.reactivex.observables.a<Object>>)o1.g((b0<Object>)this), (o<? super b0<Object>, ? extends g0<R>>)o);
    }
    
    @d
    @h("none")
    public final b0<T> z5(final r<? super T> r) {
        b.g(r, "predicate is null");
        return io.reactivex.plugins.a.R(new j3((g0<Object>)this, (r<? super Object>)r));
    }
    
    @d
    @h("custom")
    public final b0<T> z6(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.A6(n, timeUnit, j0, false);
    }
    
    @d
    @h("io.reactivex:computation")
    public final b0<b0<T>> z7(final long n, final TimeUnit timeUnit) {
        return this.E7(n, timeUnit, io.reactivex.schedulers.b.a(), Long.MAX_VALUE, false);
    }
}
