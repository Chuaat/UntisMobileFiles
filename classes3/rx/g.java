// 
// Decompiled by Procyon v0.5.36
// 

package rx;

import rx.internal.operators.y3;
import rx.internal.operators.m0;
import rx.internal.operators.z1;
import rx.internal.operators.a2;
import rx.internal.operators.v1;
import rx.internal.operators.t1;
import rx.internal.operators.j1;
import rx.internal.operators.l0;
import rx.internal.operators.h4;
import rx.internal.operators.k1;
import rx.internal.operators.b1;
import rx.internal.operators.q2;
import rx.internal.operators.c1;
import rx.internal.operators.r2;
import rx.internal.operators.n0;
import rx.internal.operators.x3;
import rx.internal.operators.u0;
import rx.internal.operators.k2;
import rx.internal.operators.m3;
import rx.internal.operators.l3;
import rx.internal.operators.t0;
import rx.internal.operators.i4;
import rx.internal.operators.k3;
import rx.internal.operators.z2;
import rx.internal.operators.c0;
import rx.internal.operators.r1;
import rx.internal.operators.d4;
import rx.internal.operators.i0;
import rx.internal.operators.f4;
import rx.internal.operators.w3;
import rx.internal.operators.j3;
import rx.internal.operators.c4;
import rx.internal.operators.f1;
import rx.internal.operators.k0;
import rx.internal.operators.i3;
import rx.internal.operators.y2;
import rx.internal.operators.s1;
import rx.internal.operators.v3;
import rx.internal.operators.x2;
import rx.internal.operators.u3;
import rx.internal.operators.t3;
import rx.internal.operators.w2;
import rx.internal.operators.g4;
import rx.internal.operators.h3;
import rx.internal.operators.l2;
import rx.internal.operators.j2;
import rx.internal.operators.e4;
import rx.internal.operators.g3;
import rx.internal.operators.v2;
import rx.internal.operators.i2;
import rx.internal.operators.h2;
import rx.internal.operators.u2;
import rx.internal.operators.s0;
import rx.internal.operators.b4;
import rx.internal.operators.e3;
import rx.internal.operators.r3;
import rx.internal.operators.c3;
import rx.internal.operators.y1;
import rx.internal.operators.d3;
import rx.internal.operators.q3;
import rx.internal.operators.h1;
import rx.internal.operators.j0;
import rx.internal.operators.g2;
import rx.internal.operators.s3;
import rx.internal.operators.o2;
import rx.internal.operators.a4;
import rx.internal.operators.r0;
import rx.internal.operators.e1;
import rx.internal.operators.p3;
import rx.internal.operators.m2;
import rx.internal.operators.f2;
import rx.internal.operators.a1;
import rx.internal.operators.e2;
import rx.internal.operators.w1;
import rx.internal.operators.n2;
import rx.observables.d;
import rx.internal.operators.d2;
import rx.internal.operators.o1;
import java.util.Collection;
import rx.internal.operators.h0;
import rx.internal.operators.u1;
import rx.internal.operators.g1;
import rx.internal.operators.g0;
import java.util.Objects;
import rx.internal.operators.n3;
import rx.internal.operators.f0;
import rx.internal.operators.n1;
import java.util.Map;
import rx.internal.operators.z3;
import rx.internal.operators.k4;
import rx.internal.operators.c2;
import rx.internal.operators.x1;
import rx.internal.operators.b2;
import rx.internal.operators.a3;
import rx.internal.operators.e0;
import rx.internal.operators.l1;
import rx.observables.a;
import rx.internal.operators.d0;
import java.util.Iterator;
import java.util.ArrayList;
import rx.internal.util.m;
import rx.internal.operators.p2;
import rx.internal.operators.z0;
import rx.functions.r;
import rx.functions.t;
import rx.functions.u;
import rx.internal.operators.i1;
import rx.internal.operators.v;
import rx.functions.a0;
import java.util.Arrays;
import rx.functions.x;
import rx.internal.operators.b0;
import rx.internal.operators.f3;
import rx.internal.operators.q1;
import rx.functions.q;
import rx.functions.b;
import rx.internal.operators.w;
import rx.internal.operators.m1;
import rx.internal.util.s;
import rx.internal.operators.o3;
import rx.internal.operators.p0;
import java.util.concurrent.Callable;
import rx.internal.operators.o0;
import java.util.concurrent.TimeUnit;
import rx.internal.operators.s2;
import rx.internal.operators.p1;
import java.util.concurrent.Future;
import rx.internal.operators.q0;
import rx.internal.operators.j4;
import java.util.List;
import rx.functions.p;
import rx.internal.util.h;
import rx.functions.y;
import rx.subscriptions.f;
import rx.plugins.c;
import rx.observers.e;

public class g<T>
{
    final a<T> G;
    
    protected g(final a<T> g) {
        this.G = g;
    }
    
    public static <T> g<T> A3(final g<? extends T>[] array, final int n) {
        return q3((g<? extends g<? extends T>>)G2((g<? extends T>[])array), n);
    }
    
    static <T> o A5(final n<? super T> t, final g<T> g) {
        if (t != null) {
            if (g.G != null) {
                ((n)t).f();
                n<? super T> n = (n<? super T>)t;
                if (!(t instanceof e)) {
                    n = new e<Object>((n<? super T>)t);
                }
                try {
                    rx.plugins.c.O(g, g.G).h(n);
                    return rx.plugins.c.N(n);
                }
                finally {
                    rx.exceptions.c.e(t);
                    Label_0086: {
                        if (n.g()) {
                            rx.plugins.c.I(rx.plugins.c.L(t));
                            break Label_0086;
                        }
                        try {
                            n.b(rx.plugins.c.L(t));
                            return f.e();
                        }
                        finally {
                            final Throwable t2;
                            rx.exceptions.c.e(t2);
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Error occurred attempting to subscribe [");
                            sb.append(t.getMessage());
                            sb.append("] and then again while trying to pass to onError.");
                            rx.plugins.c.L(new rx.exceptions.f(sb.toString(), t2));
                        }
                    }
                }
            }
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
        throw new IllegalArgumentException("subscriber can not be null");
    }
    
    public static <R> g<R> A7(final g<? extends g<?>> g, final y<? extends R> y) {
        return g.D6().k3((p<? super List<? extends g<?>>, ?>)h.I).i3((b<? extends R, ? super Object>)new j4(y));
    }
    
    public static <T> g<T> B3(final Iterable<? extends g<? extends T>> iterable) {
        return D3(C2(iterable));
    }
    
    public static <R> g<R> B7(final g<?>[] array, final y<? extends R> y) {
        return U2(array).i3((b<? extends R, ? super g[]>)new j4(y));
    }
    
    public static <T> g<T> C2(final Iterable<? extends T> iterable) {
        return Q6((a<T>)new q0(iterable));
    }
    
    public static <T> g<T> C3(final Iterable<? extends g<? extends T>> iterable, final int n) {
        return E3(C2(iterable), n);
    }
    
    public static <T> g<T> D0(final g<? extends T> g, final g<? extends T> g2) {
        return y0((g<? extends g<? extends T>>)V2((g<? extends T>)g, (g<? extends T>)g2));
    }
    
    public static <T> g<T> D2(final Future<? extends T> future) {
        return Q6(p1.a(future));
    }
    
    public static <T> g<T> D3(final g<? extends g<? extends T>> g) {
        return g.i3((b<? extends T, ? super g<? extends T>>)s2.b(true));
    }
    
    public static <T> g<T> E0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3) {
        return y0((g<? extends g<? extends T>>)W2((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3));
    }
    
    public static <T> g<T> E2(final Future<? extends T> future, final long n, final TimeUnit timeUnit) {
        return Q6(p1.b(future, n, timeUnit));
    }
    
    public static <T> g<T> E3(final g<? extends g<? extends T>> g, final int n) {
        return g.i3((b<? extends T, ? super g<? extends T>>)s2.c(true, n));
    }
    
    public static <T> g<T> F0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4) {
        return y0((g<? extends g<? extends T>>)X2((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4));
    }
    
    public static <T> g<T> F2(final Future<? extends T> future, final j j) {
        return Q6(p1.a(future)).E5(j);
    }
    
    public static <T> g<T> F3(final g<? extends T> g, final g<? extends T> g2) {
        return D3((g<? extends g<? extends T>>)V2((g<? extends T>)g, (g<? extends T>)g2));
    }
    
    public static <T> g<T> G0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5) {
        return y0((g<? extends g<? extends T>>)Y2((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5));
    }
    
    public static <T> g<T> G2(final T[] array) {
        final int length = array.length;
        if (length == 0) {
            return a2();
        }
        if (length == 1) {
            return U2(array[0]);
        }
        return Q6((a<T>)new o0(array));
    }
    
    public static <T> g<T> G3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3) {
        return D3((g<? extends g<? extends T>>)W2((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3));
    }
    
    public static <T> g<T> H0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6) {
        return y0((g<? extends g<? extends T>>)Z2((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5, (g<? extends T>)g6));
    }
    
    public static <T> g<T> H2(final Callable<? extends T> callable) {
        return Q6((a<T>)new p0(callable));
    }
    
    public static <T> g<T> H3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4) {
        return D3((g<? extends g<? extends T>>)X2((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4));
    }
    
    public static <T> g<T> I0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7) {
        return y0((g<? extends g<? extends T>>)a3((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5, (g<? extends T>)g6, (g<? extends T>)g7));
    }
    
    public static <T> g<T> I3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5) {
        return D3((g<? extends g<? extends T>>)Y2((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5));
    }
    
    public static <T> g<T> J0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8) {
        return y0((g<? extends g<? extends T>>)b3((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5, (g<? extends T>)g6, (g<? extends T>)g7, (g<? extends T>)g8));
    }
    
    public static <T> g<T> J3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6) {
        return D3((g<? extends g<? extends T>>)Z2((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5, (g<? extends T>)g6));
    }
    
    public static <T> g<T> J5(final g<? extends g<? extends T>> g) {
        return g.i3((b<? extends T, ? super g<? extends T>>)o3.b(false));
    }
    
    public static <T> g<T> K0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8, final g<? extends T> g9) {
        return y0((g<? extends g<? extends T>>)c3((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5, (g<? extends T>)g6, (g<? extends T>)g7, (g<? extends T>)g8, (g<? extends T>)g9));
    }
    
    public static <T> g<T> K3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7) {
        return D3((g<? extends g<? extends T>>)a3((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5, (g<? extends T>)g6, (g<? extends T>)g7));
    }
    
    public static <T> g<T> K5(final g<? extends g<? extends T>> g) {
        return g.i3((b<? extends T, ? super g<? extends T>>)o3.b(true));
    }
    
    public static <T> g<T> L0(final Iterable<? extends g<? extends T>> iterable) {
        return M0(C2(iterable));
    }
    
    public static <T> g<T> L3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8) {
        return D3((g<? extends g<? extends T>>)b3((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5, (g<? extends T>)g6, (g<? extends T>)g7, (g<? extends T>)g8));
    }
    
    public static <T> g<T> M0(final g<? extends g<? extends T>> g) {
        return g.i1((p<? super g<? extends T>, ? extends g<? extends T>>)s.c());
    }
    
    public static <T> g<T> M3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8, final g<? extends T> g9) {
        return D3((g<? extends g<? extends T>>)c3((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5, (g<? extends T>)g6, (g<? extends T>)g7, (g<? extends T>)g8, (g<? extends T>)g9));
    }
    
    public static <T> g<T> N0(final g<? extends T> g, final g<? extends T> g2) {
        return M0((g<? extends g<? extends T>>)V2((g<? extends T>)g, (g<? extends T>)g2));
    }
    
    public static <T> g<T> O0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3) {
        return M0((g<? extends g<? extends T>>)W2((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3));
    }
    
    public static g<Long> O2(final long n, final long n2, final TimeUnit timeUnit) {
        return P2(n, n2, timeUnit, rx.schedulers.c.a());
    }
    
    public static <T> g<T> P0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4) {
        return M0((g<? extends g<? extends T>>)X2((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4));
    }
    
    public static g<Long> P2(final long n, final long n2, final TimeUnit timeUnit, final j j) {
        return Q6((a<Long>)new m1(n, n2, timeUnit, j));
    }
    
    public static <T> g<T> P3() {
        return w.d();
    }
    
    public static <T> g<T> Q0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5) {
        return M0((g<? extends g<? extends T>>)Y2((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5));
    }
    
    public static g<Long> Q2(final long n, final TimeUnit timeUnit) {
        return P2(n, n, timeUnit, rx.schedulers.c.a());
    }
    
    public static <T> g<T> Q6(final a<T> a) {
        return new g<T>(rx.plugins.c.G(a));
    }
    
    public static <T> g<T> R0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6) {
        return M0((g<? extends g<? extends T>>)Z2((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5, (g<? extends T>)g6));
    }
    
    public static g<Long> R2(final long n, final TimeUnit timeUnit, final j j) {
        return P2(n, n, timeUnit, j);
    }
    
    public static <T> g<T> S0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7) {
        return M0((g<? extends g<? extends T>>)a3((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5, (g<? extends T>)g6, (g<? extends T>)g7));
    }
    
    public static <T> g<T> T0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8) {
        return M0((g<? extends g<? extends T>>)b3((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5, (g<? extends T>)g6, (g<? extends T>)g7, (g<? extends T>)g8));
    }
    
    public static <T, Resource> g<T> T6(final rx.functions.o<Resource> o, final p<? super Resource, ? extends g<? extends T>> p3, final rx.functions.b<? super Resource> b) {
        return U6(o, p3, b, false);
    }
    
    public static <T> g<T> U0(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8, final g<? extends T> g9) {
        return M0((g<? extends g<? extends T>>)c3((g<? extends T>)g, (g<? extends T>)g2, (g<? extends T>)g3, (g<? extends T>)g4, (g<? extends T>)g5, (g<? extends T>)g6, (g<? extends T>)g7, (g<? extends T>)g8, (g<? extends T>)g9));
    }
    
    public static <T> g<T> U2(final T t) {
        return rx.internal.util.o.E7(t);
    }
    
    public static <T> g<Boolean> U4(final g<? extends T> g, final g<? extends T> g2) {
        return V4((g<?>)g, (g<?>)g2, (q<? super Object, ? super Object, Boolean>)h.H);
    }
    
    public static <T, Resource> g<T> U6(final rx.functions.o<Resource> o, final p<? super Resource, ? extends g<? extends T>> p4, final rx.functions.b<? super Resource> b, final boolean b2) {
        return Q6((a<T>)new q1((rx.functions.o<Object>)o, (p<? super Object, ? extends g<?>>)p4, (rx.functions.b<? super Object>)b, b2));
    }
    
    public static <T> g<T> V0(final Iterable<? extends g<? extends T>> iterable) {
        return C2((Iterable<?>)iterable).j1((p<? super Object, ? extends g<? extends T>>)s.c());
    }
    
    public static <T> g<T> V2(final T t, final T t2) {
        return G2(new Object[] { t, t2 });
    }
    
    public static <T> g<Boolean> V4(final g<? extends T> g, final g<? extends T> g2, final q<? super T, ? super T, Boolean> q) {
        return f3.b((g<?>)g, (g<?>)g2, (q<? super Object, ? super Object, Boolean>)q);
    }
    
    public static <T, R> g<R> W(final Iterable<? extends g<? extends T>> iterable, final y<? extends R> y) {
        return Q6((a<R>)new b0(iterable, y));
    }
    
    public static <T> g<T> W0(final Iterable<? extends g<? extends T>> iterable, final int n) {
        return C2((Iterable<?>)iterable).k1((p<? super Object, ? extends g<? extends T>>)s.c(), n);
    }
    
    public static <T> g<T> W2(final T t, final T t2, final T t3) {
        return G2(new Object[] { t, t2, t3 });
    }
    
    public static <T, R> g<R> X(final List<? extends g<? extends T>> list, final y<? extends R> y) {
        return Q6((a<R>)new b0(list, y));
    }
    
    public static <T> g<T> X0(final g<? extends g<? extends T>> g) {
        return g.j1((p<? super g<? extends T>, ? extends g<? extends T>>)s.c());
    }
    
    public static <T> g<T> X2(final T t, final T t2, final T t3, final T t4) {
        return G2(new Object[] { t, t2, t3, t4 });
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> g<R> Y(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final g<? extends T4> g4, final g<? extends T5> g5, final g<? extends T6> g6, final g<? extends T7> g7, final g<? extends T8> g8, final g<? extends T9> g9, final x<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> x) {
        return X((List<? extends g<?>>)Arrays.asList(g, g2, g3, g4, g5, g6, g7, g8, g9), a0.n((x<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? extends R>)x));
    }
    
    public static <T> g<T> Y0(final g<? extends g<? extends T>> g, final int n) {
        return g.k1((p<? super g<? extends T>, ? extends g<? extends T>>)s.c(), n);
    }
    
    public static <T> g<T> Y2(final T t, final T t2, final T t3, final T t4, final T t5) {
        return G2(new Object[] { t, t2, t3, t4, t5 });
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> g<R> Z(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final g<? extends T4> g4, final g<? extends T5> g5, final g<? extends T6> g6, final g<? extends T7> g7, final g<? extends T8> g8, final rx.functions.w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> w) {
        return X((List<? extends g<?>>)Arrays.asList(g, g2, g3, g4, g5, g6, g7, g8), a0.m((rx.functions.w<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? extends R>)w));
    }
    
    public static <T> g<T> Z0(final g<? extends T> g, final g<? extends T> g2) {
        return V0((Iterable<? extends g<? extends T>>)Arrays.asList(g, g2));
    }
    
    public static <T> g<T> Z2(final T t, final T t2, final T t3, final T t4, final T t5, final T t6) {
        return G2(new Object[] { t, t2, t3, t4, t5, t6 });
    }
    
    public static <T> g<T> a1(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3) {
        return V0((Iterable<? extends g<? extends T>>)Arrays.asList(g, g2, g3));
    }
    
    public static <T> g<T> a2() {
        return v.d();
    }
    
    public static <T> g<T> a3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7) {
        return G2(new Object[] { t, t2, t3, t4, t5, t6, t7 });
    }
    
    public static <T> g<T> b1(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4) {
        return V0((Iterable<? extends g<? extends T>>)Arrays.asList(g, g2, g3, g4));
    }
    
    public static <T> g<T> b2(final Throwable t) {
        return Q6((a<T>)new i1(t));
    }
    
    public static <T> g<T> b3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8) {
        return G2(new Object[] { t, t2, t3, t4, t5, t6, t7, t8 });
    }
    
    public static <T> g<T> c1(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5) {
        return V0((Iterable<? extends g<? extends T>>)Arrays.asList(g, g2, g3, g4, g5));
    }
    
    public static <T> g<T> c3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8, final T t9) {
        return G2(new Object[] { t, t2, t3, t4, t5, t6, t7, t8, t9 });
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, R> g<R> d0(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final g<? extends T4> g4, final g<? extends T5> g5, final g<? extends T6> g6, final g<? extends T7> g7, final rx.functions.v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> v) {
        return X((List<? extends g<?>>)Arrays.asList(g, g2, g3, g4, g5, g6, g7), a0.l((rx.functions.v<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? extends R>)v));
    }
    
    public static <T> g<T> d1(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6) {
        return V0((Iterable<? extends g<? extends T>>)Arrays.asList(g, g2, g3, g4, g5, g6));
    }
    
    public static <T> g<T> d3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8, final T t9, final T t10) {
        return G2(new Object[] { t, t2, t3, t4, t5, t6, t7, t8, t9, t10 });
    }
    
    public static <T1, T2, T3, T4, T5, T6, R> g<R> e0(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final g<? extends T4> g4, final g<? extends T5> g5, final g<? extends T6> g6, final u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> u) {
        return X((List<? extends g<?>>)Arrays.asList(g, g2, g3, g4, g5, g6), a0.k((u<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? extends R>)u));
    }
    
    public static <T> g<T> e1(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7) {
        return V0((Iterable<? extends g<? extends T>>)Arrays.asList(g, g2, g3, g4, g5, g6, g7));
    }
    
    public static <T1, T2, T3, T4, T5, R> g<R> f0(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final g<? extends T4> g4, final g<? extends T5> g5, final t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> t) {
        return X((List<? extends g<?>>)Arrays.asList(g, g2, g3, g4, g5), a0.j((t<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? extends R>)t));
    }
    
    public static <T> g<T> f1(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8) {
        return V0((Iterable<? extends g<? extends T>>)Arrays.asList(g, g2, g3, g4, g5, g6, g7, g8));
    }
    
    public static <T1, T2, T3, T4, R> g<R> g0(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final g<? extends T4> g4, final rx.functions.s<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> s) {
        return X((List<? extends g<?>>)Arrays.asList(g, g2, g3, g4), a0.i((rx.functions.s<? super Object, ? super Object, ? super Object, ? super Object, ? extends R>)s));
    }
    
    public static <T> g<T> g1(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8, final g<? extends T> g9) {
        return V0((Iterable<? extends g<? extends T>>)Arrays.asList(g, g2, g3, g4, g5, g6, g7, g8, g9));
    }
    
    public static <T1, T2, T3, R> g<R> h0(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final r<? super T1, ? super T2, ? super T3, ? extends R> r) {
        return X((List<? extends g<?>>)Arrays.asList(g, g2, g3), a0.h((r<? super Object, ? super Object, ? super Object, ? extends R>)r));
    }
    
    public static <T> g<T> j(final Iterable<? extends g<? extends T>> iterable) {
        return Q6(rx.internal.operators.y.a(iterable));
    }
    
    public static <T1, T2, R> g<R> j0(final g<? extends T1> g, final g<? extends T2> g2, final q<? super T1, ? super T2, ? extends R> q) {
        return X((List<? extends g<?>>)Arrays.asList(g, g2), a0.g((q<? super Object, ? super Object, ? extends R>)q));
    }
    
    public static g<Integer> j4(final int i, final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Count can not be negative");
        }
        if (n == 0) {
            return a2();
        }
        if (i > Integer.MAX_VALUE - n + 1) {
            throw new IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
        }
        if (n == 1) {
            return U2(i);
        }
        return Q6((a<Integer>)new z0(i, n - 1 + i));
    }
    
    public static <T> g<T> k(final g<? extends T> g, final g<? extends T> g2) {
        return Q6(rx.internal.operators.y.b(g, g2));
    }
    
    public static g<Integer> k4(final int n, final int n2, final j j) {
        return j4(n, n2).E5(j);
    }
    
    public static <T> g<T> l(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3) {
        return Q6(rx.internal.operators.y.c(g, g2, g3));
    }
    
    private <R> g<R> l3(final p<? super T, ? extends R> p3, final p<? super Throwable, ? extends R> p4, final rx.functions.o<? extends R> o) {
        return this.i3((b<? extends R, ? super T>)new p2((p<? super Object, ?>)p3, p4, o));
    }
    
    public static <T, R> g<R> m0(final Iterable<? extends g<? extends T>> iterable, final y<? extends R> y) {
        return Q6((a<R>)new b0(null, iterable, y, m.J, true));
    }
    
    public static <T> g<T> n(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4) {
        return Q6(rx.internal.operators.y.d(g, g2, g3, g4));
    }
    
    public static <T> g<T> n3(final Iterable<? extends g<? extends T>> iterable) {
        return p3(C2(iterable));
    }
    
    public static <T> g<T> o(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5) {
        return Q6(rx.internal.operators.y.e(g, g2, g3, g4, g5));
    }
    
    public static <T> g<T> o3(final Iterable<? extends g<? extends T>> iterable, final int n) {
        return q3(C2(iterable), n);
    }
    
    public static <T> g<T> p(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6) {
        return Q6(rx.internal.operators.y.f(g, g2, g3, g4, g5, g6));
    }
    
    public static <T> g<T> p3(final g<? extends g<? extends T>> g) {
        if (((rx.internal.util.o<Object>)g).getClass() == rx.internal.util.o.class) {
            return ((rx.internal.util.o<Object>)g).H7((p<? super Object, ? extends g<? extends T>>)s.c());
        }
        return g.i3((b<? extends T, ? super Object>)s2.b(false));
    }
    
    public static <T> g<T> q(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7) {
        return Q6(rx.internal.operators.y.g(g, g2, g3, g4, g5, g6, g7));
    }
    
    public static <T> g<T> q3(final g<? extends g<? extends T>> g, final int n) {
        if (((rx.internal.util.o<Object>)g).getClass() == rx.internal.util.o.class) {
            return ((rx.internal.util.o<Object>)g).H7((p<? super Object, ? extends g<? extends T>>)s.c());
        }
        return g.i3((b<? extends T, ? super Object>)s2.c(false, n));
    }
    
    public static <T> g<T> r(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8) {
        return Q6(rx.internal.operators.y.i(g, g2, g3, g4, g5, g6, g7, g8));
    }
    
    @Deprecated
    public static <T> g<T> r1(final a<T> a) {
        return new g<T>(rx.plugins.c.G(a));
    }
    
    public static <T> g<T> r3(final g<? extends T> g, final g<? extends T> g2) {
        return z3((g<? extends T>[])new g[] { g, g2 });
    }
    
    public static <R> g<R> r7(final Iterable<? extends g<?>> iterable, final y<? extends R> y) {
        final ArrayList<g<?>> list = new ArrayList<g<?>>();
        final Iterator<? extends g<?>> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add((g<?>)iterator.next());
        }
        return (g<R>)U2(list.toArray(new g[list.size()])).i3((b<?, ? super g[]>)new j4(y));
    }
    
    public static <T> g<T> s(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8, final g<? extends T> g9) {
        return Q6(rx.internal.operators.y.m(g, g2, g3, g4, g5, g6, g7, g8, g9));
    }
    
    public static <T> g<T> s1(final rx.functions.b<rx.e<T>> b, final rx.e.a a) {
        return Q6((a<T>)new d0((rx.functions.b<rx.e<Object>>)b, a));
    }
    
    public static <T> g<T> s3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3) {
        return z3((g<? extends T>[])new g[] { g, g2, g3 });
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> g<R> s7(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final g<? extends T4> g4, final g<? extends T5> g5, final g<? extends T6> g6, final g<? extends T7> g7, final g<? extends T8> g8, final g<? extends T9> g9, final x<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> x) {
        return U2(new g[] { g, g2, g3, g4, g5, g6, g7, g8, g9 }).i3((b<? extends R, ? super g[]>)new j4(x));
    }
    
    @r7.a
    public static <S, T> g<T> t1(final rx.observables.a<S, T> a) {
        return Q6((a<T>)a);
    }
    
    public static <T> g<T> t3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4) {
        return z3((g<? extends T>[])new g[] { g, g2, g3, g4 });
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> g<R> t7(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final g<? extends T4> g4, final g<? extends T5> g5, final g<? extends T6> g6, final g<? extends T7> g7, final g<? extends T8> g8, final rx.functions.w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> w) {
        return U2(new g[] { g, g2, g3, g4, g5, g6, g7, g8 }).i3((b<? extends R, ? super g[]>)new j4(w));
    }
    
    public static <S, T> g<T> u1(final rx.observables.e<S, T> e) {
        return Q6((a<T>)e);
    }
    
    public static <T> g<T> u3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5) {
        return z3((g<? extends T>[])new g[] { g, g2, g3, g4, g5 });
    }
    
    @Deprecated
    public static g<Long> u6(final long n, final long n2, final TimeUnit timeUnit) {
        return P2(n, n2, timeUnit, rx.schedulers.c.a());
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, R> g<R> u7(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final g<? extends T4> g4, final g<? extends T5> g5, final g<? extends T6> g6, final g<? extends T7> g7, final rx.functions.v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> v) {
        return U2(new g[] { g, g2, g3, g4, g5, g6, g7 }).i3((b<? extends R, ? super g[]>)new j4(v));
    }
    
    public static <T> g<T> v3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6) {
        return z3((g<? extends T>[])new g[] { g, g2, g3, g4, g5, g6 });
    }
    
    @Deprecated
    public static g<Long> v6(final long n, final long n2, final TimeUnit timeUnit, final j j) {
        return P2(n, n2, timeUnit, j);
    }
    
    public static <T1, T2, T3, T4, T5, T6, R> g<R> v7(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final g<? extends T4> g4, final g<? extends T5> g5, final g<? extends T6> g6, final u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> u) {
        return U2(new g[] { g, g2, g3, g4, g5, g6 }).i3((b<? extends R, ? super g[]>)new j4(u));
    }
    
    public static <T> g<T> w0(final Iterable<? extends g<? extends T>> iterable) {
        return y0(C2(iterable));
    }
    
    public static <T> g<T> w3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7) {
        return z3((g<? extends T>[])new g[] { g, g2, g3, g4, g5, g6, g7 });
    }
    
    public static g<Long> w6(final long n, final TimeUnit timeUnit) {
        return x6(n, timeUnit, rx.schedulers.c.a());
    }
    
    public static <T1, T2, T3, T4, T5, R> g<R> w7(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final g<? extends T4> g4, final g<? extends T5> g5, final t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> t) {
        return U2(new g[] { g, g2, g3, g4, g5 }).i3((b<? extends R, ? super g[]>)new j4(t));
    }
    
    public static <T> g<T> x3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8) {
        return z3((g<? extends T>[])new g[] { g, g2, g3, g4, g5, g6, g7, g8 });
    }
    
    public static g<Long> x6(final long n, final TimeUnit timeUnit, final j j) {
        return Q6((a<Long>)new l1(n, timeUnit, j));
    }
    
    public static <T1, T2, T3, T4, R> g<R> x7(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final g<? extends T4> g4, final rx.functions.s<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> s) {
        return U2(new g[] { g, g2, g3, g4 }).i3((b<? extends R, ? super g[]>)new j4(s));
    }
    
    public static <T> g<T> y0(final g<? extends g<? extends T>> g) {
        return g.h1((p<? super g<? extends T>, ? extends g<? extends T>>)s.c());
    }
    
    public static <T> g<T> y3(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8, final g<? extends T> g9) {
        return z3((g<? extends T>[])new g[] { g, g2, g3, g4, g5, g6, g7, g8, g9 });
    }
    
    public static <T1, T2, T3, R> g<R> y7(final g<? extends T1> g, final g<? extends T2> g2, final g<? extends T3> g3, final r<? super T1, ? super T2, ? super T3, ? extends R> r) {
        return U2(new g[] { g, g2, g3 }).i3((b<? extends R, ? super g[]>)new j4(r));
    }
    
    public static <T> g<T> z1(final rx.functions.o<g<T>> o) {
        return Q6((a<T>)new e0(o));
    }
    
    public static <T> g<T> z3(final g<? extends T>[] array) {
        return p3((g<? extends g<? extends T>>)G2((g<? extends T>[])array));
    }
    
    public static <T1, T2, R> g<R> z7(final g<? extends T1> g, final g<? extends T2> g2, final q<? super T1, ? super T2, ? extends R> q) {
        return U2(new g[] { g, g2 }).i3((b<? extends R, ? super g[]>)new j4(q));
    }
    
    public final g<List<T>> A(final long n, final TimeUnit timeUnit) {
        return this.D(n, timeUnit, Integer.MAX_VALUE, rx.schedulers.c.a());
    }
    
    public final g<T> A1(final long n, final TimeUnit timeUnit) {
        return this.B1(n, timeUnit, rx.schedulers.c.a());
    }
    
    public final void A2(final rx.functions.b<? super T> b, final rx.functions.b<Throwable> b2) {
        this.C5(b, b2);
    }
    
    public final <R> g<R> A4(final p<? super g<T>, ? extends g<R>> p4, final long n, final TimeUnit timeUnit, final j j) {
        return a3.P7((rx.functions.o<? extends rx.observables.c<Object>>)h.j((g<Object>)this, n, timeUnit, j), (p<? super g<Object>, ? extends g<R>>)p4);
    }
    
    public final <R> R A6(final p<? super g<T>, R> p) {
        return p.h(this);
    }
    
    public final g<T> B1(final long n, final TimeUnit timeUnit, final j j) {
        return this.i3((b<? extends T, ? super T>)new b2(n, timeUnit, j));
    }
    
    public final void B2(final rx.functions.b<? super T> b, final rx.functions.b<Throwable> b2, final rx.functions.a a) {
        this.D5(b, b2, a);
    }
    
    public final <R> g<R> B4(final p<? super g<T>, ? extends g<R>> p2, final j j) {
        return a3.P7((rx.functions.o<? extends rx.observables.c<Object>>)h.g((g<Object>)this), (p<? super g<Object>, ? extends g<R>>)h.f((p<? super g<Object>, ? extends g<Object>>)p2, j));
    }
    
    public final o B5(final rx.functions.b<? super T> b) {
        if (b != null) {
            return this.z5(new rx.internal.util.c<Object>(b, h.M, rx.functions.m.a()));
        }
        throw new IllegalArgumentException("onNext can not be null");
    }
    
    public final rx.observables.b<T> B6() {
        return rx.observables.b.g((g<? extends T>)this);
    }
    
    public final g<List<T>> C(final long n, final TimeUnit timeUnit, final int n2) {
        return this.i3((b<? extends List<T>, ? super T>)new x1(n, n, timeUnit, n2, rx.schedulers.c.a()));
    }
    
    public final <U, V> g<T> C1(final rx.functions.o<? extends g<U>> o, final p<? super T, ? extends g<V>> p2) {
        return this.H1((rx.functions.o<? extends g<Object>>)o).i3((b<? extends T, ? super T>)new c2(this, (p<? super Object, ? extends g<Object>>)p2));
    }
    
    public final rx.observables.c<T> C4() {
        return a3.K7((g<? extends T>)this);
    }
    
    public final o C5(final rx.functions.b<? super T> b, final rx.functions.b<Throwable> b2) {
        if (b == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (b2 != null) {
            return this.z5(new rx.internal.util.c<Object>(b, b2, rx.functions.m.a()));
        }
        throw new IllegalArgumentException("onError can not be null");
    }
    
    public rx.b C6() {
        return rx.b.J(this);
    }
    
    public final <T2, R> g<R> C7(final Iterable<? extends T2> iterable, final q<? super T, ? super T2, ? extends R> q) {
        return this.i3((b<? extends R, ? super T>)new k4(iterable, (q<? super Object, ? super Object, ?>)q));
    }
    
    public final g<List<T>> D(final long n, final TimeUnit timeUnit, final int n2, final j j) {
        return this.i3((b<? extends List<T>, ? super T>)new x1(n, n, timeUnit, n2, j));
    }
    
    public final <U> g<T> D1(final p<? super T, ? extends g<U>> p) {
        return this.i3((b<? extends T, ? super T>)new c2(this, (p<? super Object, ? extends g<Object>>)p));
    }
    
    public final rx.observables.c<T> D4(final int n) {
        return a3.L7((g<? extends T>)this, n);
    }
    
    public final o D5(final rx.functions.b<? super T> b, final rx.functions.b<Throwable> b2, final rx.functions.a a) {
        if (b == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (b2 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        if (a != null) {
            return this.z5(new rx.internal.util.c<Object>(b, b2, a));
        }
        throw new IllegalArgumentException("onComplete can not be null");
    }
    
    public final g<List<T>> D6() {
        return this.i3((b<? extends List<T>, ? super T>)z3.b());
    }
    
    public final <T2, R> g<R> D7(final g<? extends T2> g, final q<? super T, ? super T2, ? extends R> q) {
        return z7((g<?>)this, (g<?>)g, (q<? super Object, ? super Object, ? extends R>)q);
    }
    
    public final g<T> E1(final long n, final TimeUnit timeUnit) {
        return this.F1(n, timeUnit, rx.schedulers.c.a());
    }
    
    public final rx.observables.c<T> E4(final int n, final long n2, final TimeUnit timeUnit) {
        return this.F4(n, n2, timeUnit, rx.schedulers.c.a());
    }
    
    public final g<T> E5(final j j) {
        return this.F5(j, this.G instanceof d0 ^ true);
    }
    
    public final <K> g<Map<K, T>> E6(final p<? super T, ? extends K> p) {
        return Q6((a<Map<K, T>>)new n1((g<Object>)this, (p<? super Object, ?>)p, (p<? super Object, ?>)s.c()));
    }
    
    public final g<List<T>> F(final long n, final TimeUnit timeUnit, final j j) {
        return this.y(n, n, timeUnit, j);
    }
    
    public final g<T> F1(final long n, final TimeUnit timeUnit, final j j) {
        return Q6((a<T>)new f0(this, n, timeUnit, j));
    }
    
    public final rx.observables.c<T> F4(final int n, final long n2, final TimeUnit timeUnit, final j j) {
        if (n >= 0) {
            return a3.N7((g<? extends T>)this, n2, timeUnit, j, n);
        }
        throw new IllegalArgumentException("bufferSize < 0");
    }
    
    public final g<T> F5(final j j, final boolean b) {
        if (this instanceof rx.internal.util.o) {
            return ((rx.internal.util.o)this).I7(j);
        }
        return Q6((a<T>)new n3((g<Object>)this, j, b));
    }
    
    public final <K, V> g<Map<K, V>> F6(final p<? super T, ? extends K> p2, final p<? super T, ? extends V> p3) {
        return Q6((a<Map<K, V>>)new n1((g<Object>)this, (p<? super Object, ?>)p2, (p<? super Object, ?>)p3));
    }
    
    public final <B> g<List<T>> G(final g<B> g) {
        return this.H(g, 16);
    }
    
    public final <U> g<T> G1(final g<U> obj) {
        Objects.requireNonNull(obj);
        return Q6((a<T>)new g0(this, (g<Object>)obj));
    }
    
    public final rx.observables.c<T> G4(final int n, final j j) {
        return a3.Q7(this.D4(n), j);
    }
    
    public final g<T> G5(final g<? extends T> obj) {
        Objects.requireNonNull(obj, "alternate is null");
        return Q6((a<T>)new g1(this, obj));
    }
    
    public final <K, V> g<Map<K, V>> G6(final p<? super T, ? extends K> p3, final p<? super T, ? extends V> p4, final rx.functions.o<? extends Map<K, V>> o) {
        return Q6((a<Map<K, V>>)new n1((g<Object>)this, (p<? super Object, ?>)p3, (p<? super Object, ?>)p4, (rx.functions.o<? extends Map<Object, Object>>)o));
    }
    
    public final <B> g<List<T>> H(final g<B> g, final int n) {
        return this.i3((b<? extends List<T>, ? super T>)new u1(g, n));
    }
    
    public final <U> g<T> H1(final rx.functions.o<? extends g<U>> o) {
        return Q6((a<T>)new h0(this, (rx.functions.o<? extends g<Object>>)o));
    }
    
    public final rx.observables.c<T> H4(final long n, final TimeUnit timeUnit) {
        return this.I4(n, timeUnit, rx.schedulers.c.a());
    }
    
    public final <R> g<R> H5(final p<? super T, ? extends g<? extends R>> p) {
        return J5(this.k3(p));
    }
    
    public final <K> g<Map<K, Collection<T>>> H6(final p<? super T, ? extends K> p) {
        return Q6((a<Map<K, Collection<T>>>)new o1((g<Object>)this, (p<? super Object, ?>)p, (p<? super Object, ?>)s.c()));
    }
    
    public final <T2> g<T2> I1() {
        return this.i3((b<? extends T2, ? super T>)d2.b());
    }
    
    public final <K> g<d<K, T>> I2(final p<? super T, ? extends K> p) {
        return this.i3((b<? extends d<K, T>, ? super T>)new n2((p<? super Object, ?>)p));
    }
    
    public final rx.observables.c<T> I4(final long n, final TimeUnit timeUnit, final j j) {
        return a3.M7((g<? extends T>)this, n, timeUnit, j);
    }
    
    public final <R> g<R> I5(final p<? super T, ? extends g<? extends R>> p) {
        return K5(this.k3(p));
    }
    
    public final <K, V> g<Map<K, Collection<V>>> I6(final p<? super T, ? extends K> p2, final p<? super T, ? extends V> p3) {
        return Q6((a<Map<K, Collection<V>>>)new o1((g<Object>)this, (p<? super Object, ?>)p2, (p<? super Object, ?>)p3));
    }
    
    public final <TOpening, TClosing> g<List<T>> J(final g<? extends TOpening> g, final p<? super TOpening, ? extends g<? extends TClosing>> p2) {
        return this.i3((b<? extends List<T>, ? super T>)new w1(g, (p<? super Object, ? extends g<?>>)p2));
    }
    
    public final g<T> J1() {
        return this.i3((b<? extends T, ? super T>)e2.b());
    }
    
    public final <K, R> g<d<K, R>> J2(final p<? super T, ? extends K> p2, final p<? super T, ? extends R> p3) {
        return this.i3((b<? extends d<K, R>, ? super T>)new n2((p<? super Object, ?>)p2, (p<? super Object, ?>)p3));
    }
    
    public final rx.observables.c<T> J4(final j j) {
        return a3.Q7(this.C4(), j);
    }
    
    public final <K, V> g<Map<K, Collection<V>>> J6(final p<? super T, ? extends K> p3, final p<? super T, ? extends V> p4, final rx.functions.o<? extends Map<K, Collection<V>>> o) {
        return Q6((a<Map<K, Collection<V>>>)new o1((g<Object>)this, (p<? super Object, ?>)p3, (p<? super Object, ?>)p4, (rx.functions.o<? extends Map<Object, Collection<Object>>>)o));
    }
    
    public final <TClosing> g<List<T>> K(final rx.functions.o<? extends g<? extends TClosing>> o) {
        return this.i3((b<? extends List<T>, ? super T>)new u1(o, 16));
    }
    
    public final <U> g<T> K1(final p<? super T, ? extends U> p) {
        return this.i3((b<? extends T, ? super T>)new e2((p<? super Object, ?>)p));
    }
    
    @r7.b
    public final <K, R> g<d<K, R>> K2(final p<? super T, ? extends K> p5, final p<? super T, ? extends R> p6, final int n, final boolean b, final p<rx.functions.b<Object>, Map<K, Object>> obj) {
        Objects.requireNonNull(obj, "evictingMapFactory cannot be null");
        return this.i3((b<? extends d<K, R>, ? super T>)new n2((p<? super Object, ?>)p5, (p<? super Object, ?>)p6, n, b, (p<rx.functions.b<Object>, Map<Object, Object>>)obj));
    }
    
    public final g<T> K4() {
        return a1.m(this);
    }
    
    public final <K, V> g<Map<K, Collection<V>>> K6(final p<? super T, ? extends K> p4, final p<? super T, ? extends V> p5, final rx.functions.o<? extends Map<K, Collection<V>>> o, final p<? super K, ? extends Collection<V>> p6) {
        return Q6((a<Map<K, Collection<V>>>)new o1((g<Object>)this, (p<? super Object, ?>)p4, (p<? super Object, ?>)p5, (rx.functions.o<? extends Map<Object, Collection<Object>>>)o, (p<? super Object, ? extends Collection<Object>>)p6));
    }
    
    public final g<T> L() {
        return (g<T>)rx.internal.operators.h.E7((g<?>)this);
    }
    
    public final g<T> L1() {
        return this.i3((b<? extends T, ? super T>)f2.c());
    }
    
    @Deprecated
    public final <K, R> g<d<K, R>> L2(final p<? super T, ? extends K> p3, final p<? super T, ? extends R> p4, final p<rx.functions.b<K>, Map<K, Object>> obj) {
        Objects.requireNonNull(obj, "evictingMapFactory cannot be null");
        return this.i3((b<? extends d<K, R>, ? super T>)new m2((p<? super Object, ?>)p3, (p<? super Object, ?>)p4, (p<rx.functions.b<Object>, Map<Object, Object>>)obj));
    }
    
    public final g<T> L4(final long n) {
        return a1.n(this, n);
    }
    
    public final g<T> L5(final int n) {
        return this.i3((b<? extends T, ? super T>)new p3(n));
    }
    
    public k<T> L6() {
        return new k<T>((k.t<T>)e1.b((g<Object>)this));
    }
    
    @Deprecated
    public final g<T> M(final int n) {
        return this.N(n);
    }
    
    public final <U> g<T> M1(final p<? super T, ? extends U> p) {
        return this.i3((b<? extends T, ? super T>)new f2((p<? super Object, ?>)p));
    }
    
    public final <T2, D1, D2, R> g<R> M2(final g<T2> g, final p<? super T, ? extends g<D1>> p4, final p<? super T2, ? extends g<D2>> p5, final q<? super T, ? super g<T2>, ? extends R> q) {
        return Q6((a<R>)new r0((g<Object>)this, (g<Object>)g, (p<? super Object, ? extends g<Object>>)p4, (p<? super Object, ? extends g<Object>>)p5, (q<? super Object, ? super g<Object>, ?>)q));
    }
    
    public final g<T> M4(final q<Integer, Throwable, Boolean> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   rx/g.O3:()Lrx/g;
        //     4: new             Lrx/internal/operators/b3;
        //     7: dup            
        //     8: aload_1        
        //     9: invokespecial   rx/internal/operators/b3.<init>:(Lrx/functions/q;)V
        //    12: invokevirtual   rx/g.i3:(Lrx/g$b;)Lrx/g;
        //    15: areturn        
        //    Signature:
        //  (Lrx/functions/q<Ljava/lang/Integer;Ljava/lang/Throwable;Ljava/lang/Boolean;>;)Lrx/g<TT;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:881)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:759)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1011)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2463)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypesForVariables(TypeAnalysis.java:586)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:397)
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
    
    public final g<T> M5(final long n, final TimeUnit timeUnit) {
        return this.N5(n, timeUnit, rx.schedulers.c.a());
    }
    
    public final g<List<T>> M6() {
        return this.i3((b<? extends List<T>, ? super T>)new a4(10));
    }
    
    public final g<T> N(final int n) {
        return (g<T>)rx.internal.operators.h.F7((g<?>)this, n);
    }
    
    public final g<T> N1(final q<? super T, ? super T, Boolean> q) {
        return this.i3((b<? extends T, ? super T>)new f2((q<? super Object, ? super Object, Boolean>)q));
    }
    
    public final g<T> N2() {
        return this.i3((b<? extends T, ? super T>)o2.b());
    }
    
    public final g<T> N3(final g<? extends T> g) {
        return r3((g<? extends T>)this, g);
    }
    
    public final g<T> N4(final p<? super g<? extends Throwable>, ? extends g<?>> p) {
        return a1.q(this, (p<? super g<? extends rx.f<?>>, ? extends g<?>>)h.k(p));
    }
    
    public final g<T> N5(final long n, final TimeUnit timeUnit, final j j) {
        return this.i3((b<? extends T, ? super T>)new s3(n, timeUnit, j));
    }
    
    public final g<List<T>> N6(final int n) {
        return this.i3((b<? extends List<T>, ? super T>)new a4(n));
    }
    
    public final g<T> O1(final rx.functions.a a) {
        return this.i3((b<? extends T, ? super T>)new g2(a));
    }
    
    public final g<g<T>> O3() {
        return U2(this);
    }
    
    public final g<T> O4(final p<? super g<? extends Throwable>, ? extends g<?>> p2, final j j) {
        return a1.r(this, (p<? super g<? extends rx.f<?>>, ? extends g<?>>)h.k(p2), j);
    }
    
    public final g<T> O5(final p<? super T, Boolean> p) {
        return this.d2(p).L5(1);
    }
    
    public final g<List<T>> O6(final q<? super T, ? super T, Integer> q) {
        return this.i3((b<? extends List<T>, ? super T>)new a4((q<? super Object, ? super Object, Integer>)q, 10));
    }
    
    public final g<T> P1(final rx.functions.a a) {
        return Q6((a<T>)new j0((g<Object>)this, new rx.internal.util.b<Object>(rx.functions.m.a(), rx.functions.m.a(), a)));
    }
    
    public final g<T> P4(final long n, final TimeUnit timeUnit) {
        return this.Q4(n, timeUnit, rx.schedulers.c.a());
    }
    
    public final g<T> P5(final int n) {
        if (n == 0) {
            return this.N2();
        }
        if (n == 1) {
            return Q6((a<T>)new h1((g<Object>)this));
        }
        return this.i3((b<? extends T, ? super T>)new q3(n));
    }
    
    public final g<List<T>> P6(final q<? super T, ? super T, Integer> q, final int n) {
        return this.i3((b<? extends List<T>, ? super T>)new a4((q<? super Object, ? super Object, Integer>)q, n));
    }
    
    public final g<T> Q1(final rx.h<? super T> h) {
        return Q6((a<T>)new j0((g<Object>)this, (rx.h<? super Object>)h));
    }
    
    public final g<T> Q3(final j j) {
        return this.R3(j, m.J);
    }
    
    public final g<T> Q4(final long n, final TimeUnit timeUnit, final j j) {
        return this.i3((b<? extends T, ? super T>)new d3(n, timeUnit, j));
    }
    
    public final g<T> Q5(final int n, final long n2, final TimeUnit timeUnit) {
        return this.R5(n, n2, timeUnit, rx.schedulers.c.a());
    }
    
    public final <R> g<R> R(final Class<R> clazz) {
        return this.i3((b<? extends R, ? super T>)new y1((Class<Object>)clazz));
    }
    
    public final g<T> R1(final rx.functions.b<rx.f<? super T>> b) {
        return Q6((a<T>)new j0((g<Object>)this, new rx.internal.util.a<Object>((rx.functions.b<rx.f<? super Object>>)b)));
    }
    
    public final g<T> R3(final j j, final int n) {
        return this.T3(j, false, n);
    }
    
    public final <U> g<T> R4(final g<U> g) {
        return this.i3((b<? extends T, ? super T>)new c3((g<Object>)g));
    }
    
    public final g<T> R5(final int n, final long n2, final TimeUnit timeUnit, final j j) {
        return this.i3((b<? extends T, ? super T>)new r3(n, n2, timeUnit, j));
    }
    
    public final o R6(final n<? super T> n) {
        try {
            n.f();
            rx.plugins.c.O(this, this.G).h(n);
            return rx.plugins.c.N(n);
        }
        finally {
            final Throwable t;
            rx.exceptions.c.e(t);
            try {
                n.b(rx.plugins.c.L(t));
                return f.e();
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.e(t2);
                final StringBuilder sb = new StringBuilder();
                sb.append("Error occurred attempting to subscribe [");
                sb.append(t.getMessage());
                sb.append("] and then again while trying to pass to onError.");
                rx.plugins.c.L(new rx.exceptions.f(sb.toString(), t2));
            }
        }
    }
    
    public final <R> g<R> S(final rx.functions.o<R> o, final rx.functions.c<R, ? super T> c) {
        return Q6((a<R>)new rx.internal.operators.a0((g<Object>)this, (rx.functions.o<Object>)o, (rx.functions.c<Object, ? super Object>)c));
    }
    
    public final g<T> S1(final rx.functions.b<? super Throwable> b) {
        return Q6((a<T>)new j0((g<Object>)this, new rx.internal.util.b<Object>(rx.functions.m.a(), b, rx.functions.m.a())));
    }
    
    public final g<Boolean> S2() {
        return this.i3((b<? extends Boolean, ? super T>)h.N);
    }
    
    public final g<T> S3(final j j, final boolean b) {
        return this.T3(j, b, m.J);
    }
    
    public final <R> g<R> S4(final R r, final q<R, ? super T, R> q) {
        return this.i3((b<? extends R, ? super T>)new e3(r, (q<Object, ? super Object, Object>)q));
    }
    
    public final g<T> S5(final long n, final TimeUnit timeUnit) {
        return this.T5(n, timeUnit, rx.schedulers.c.a());
    }
    
    public final g<T> S6(final j j) {
        return this.i3((b<? extends T, ? super T>)new b4(j));
    }
    
    public final g<T> T1(final rx.functions.b<? super T> b) {
        return Q6((a<T>)new j0((g<Object>)this, new rx.internal.util.b<Object>((rx.functions.b<? super Object>)b, rx.functions.m.a(), rx.functions.m.a())));
    }
    
    public final <TRight, TLeftDuration, TRightDuration, R> g<R> T2(final g<TRight> g, final p<T, g<TLeftDuration>> p4, final p<TRight, g<TRightDuration>> p5, final q<T, TRight, R> q) {
        return Q6((a<R>)new s0((g<Object>)this, (g<Object>)g, (p<Object, g<Object>>)p4, (p<Object, g<Object>>)p5, (q<Object, Object, Object>)q));
    }
    
    public final g<T> T3(final j j, final boolean b, final int n) {
        if (this instanceof rx.internal.util.o) {
            return ((rx.internal.util.o)this).I7(j);
        }
        return this.i3((b<? extends T, ? super T>)new u2(j, b, n));
    }
    
    public final g<T> T4(final q<T, T, T> q) {
        return this.i3((b<? extends T, ? super T>)new e3((q<Object, ? super Object, Object>)q));
    }
    
    public final g<T> T5(final long n, final TimeUnit timeUnit, final j j) {
        return this.i3((b<? extends T, ? super T>)new r3(n, timeUnit, j));
    }
    
    public final g<T> U1(final rx.functions.b<? super Long> b) {
        return this.i3((b<? extends T, ? super T>)new h2(b));
    }
    
    public final <R> g<R> U3(final Class<R> clazz) {
        return (g<R>)this.d2(h.m(clazz)).R((Class<Object>)clazz);
    }
    
    public final g<List<T>> U5(final int n) {
        return this.P5(n).D6();
    }
    
    public final g<T> V1(final rx.functions.a a) {
        return this.i3((b<? extends T, ? super T>)new i2(a));
    }
    
    public final g<T> V3() {
        return this.i3((b<? extends T, ? super T>)v2.b());
    }
    
    public final g<List<T>> V5(final int n, final long n2, final TimeUnit timeUnit) {
        return this.Q5(n, n2, timeUnit).D6();
    }
    
    public final g<g<T>> V6(final int n) {
        return this.W6(n, n);
    }
    
    public final g<T> W1(final rx.functions.a a) {
        return Q6((a<T>)new j0((g<Object>)this, new rx.internal.util.b<Object>(rx.functions.m.a(), rx.functions.m.c(a), a)));
    }
    
    public final g<T> W3(final long n) {
        return this.i3((b<? extends T, ? super T>)new v2(n));
    }
    
    public final g<T> W4() {
        return this.i3((b<? extends T, ? super T>)g3.b());
    }
    
    public final g<List<T>> W5(final int n, final long n2, final TimeUnit timeUnit, final j j) {
        return this.R5(n, n2, timeUnit, j).D6();
    }
    
    public final g<g<T>> W6(final int i, final int j) {
        if (i <= 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("count > 0 required but it was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (j > 0) {
            return this.i3((b<? extends g<T>, ? super T>)new e4(i, j));
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("skip > 0 required but it was ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public final g<T> X1(final rx.functions.a a) {
        return this.i3((b<? extends T, ? super T>)new j2(a));
    }
    
    public final g<T> X3(final long n, final rx.functions.a a) {
        return this.i3((b<? extends T, ? super T>)new v2(n, a));
    }
    
    public final g<T> X4() {
        return this.i4().J7();
    }
    
    public final g<List<T>> X5(final long n, final TimeUnit timeUnit) {
        return this.S5(n, timeUnit).D6();
    }
    
    public final g<g<T>> X6(final long n, final long n2, final TimeUnit timeUnit) {
        return this.Y6(n, n2, timeUnit, Integer.MAX_VALUE, rx.schedulers.c.a());
    }
    
    public final g<T> Y1(final int n) {
        return this.i3((b<? extends T, ? super T>)new l2(n));
    }
    
    public final g<T> Y3(final long n, final rx.functions.a a, final rx.a.d d) {
        return this.i3((b<? extends T, ? super T>)new v2(n, a, d));
    }
    
    public final g<T> Y4() {
        return this.i3((b<? extends T, ? super T>)h3.b());
    }
    
    public final g<List<T>> Y5(final long n, final TimeUnit timeUnit, final j j) {
        return this.T5(n, timeUnit, j).D6();
    }
    
    public final g<g<T>> Y6(final long n, final long n2, final TimeUnit timeUnit, final int n3, final j j) {
        return this.i3((b<? extends g<T>, ? super T>)new g4(n, n2, timeUnit, n3, j));
    }
    
    public final g<T> Z1(final int n, final T t) {
        return this.i3((b<? extends T, ? super T>)new l2(n, t));
    }
    
    public final g<T> Z3() {
        return this.i3((b<? extends T, ? super T>)w2.b());
    }
    
    public final g<T> Z4(final p<? super T, Boolean> p) {
        return this.d2(p).Y4();
    }
    
    public final <E> g<T> Z5(final g<? extends E> g) {
        return this.i3((b<? extends T, ? super T>)new t3(g));
    }
    
    public final g<g<T>> Z6(final long n, final long n2, final TimeUnit timeUnit, final j j) {
        return this.Y6(n, n2, timeUnit, Integer.MAX_VALUE, j);
    }
    
    public final g<T> a4(final rx.functions.b<? super T> b) {
        return this.i3((b<? extends T, ? super T>)new w2((rx.functions.b<? super Object>)b));
    }
    
    public final g<T> a5(final T t) {
        return this.i3((b<? extends T, ? super T>)new h3(t));
    }
    
    public final g<T> a6(final p<? super T, Boolean> p) {
        return this.i3((b<? extends T, ? super T>)new u3((p<? super Object, Boolean>)p));
    }
    
    public final g<g<T>> a7(final long n, final TimeUnit timeUnit) {
        return this.Z6(n, n, timeUnit, rx.schedulers.c.a());
    }
    
    public final g<T> b4() {
        return this.i3((b<? extends T, ? super T>)x2.b());
    }
    
    public final g<T> b5(final T t, final p<? super T, Boolean> p2) {
        return this.d2(p2).a5(t);
    }
    
    public final g<T> b6(final p<? super T, Boolean> p) {
        return this.i3((b<? extends T, ? super T>)new v3((p<? super Object, Boolean>)p));
    }
    
    public final g<g<T>> b7(final long n, final TimeUnit timeUnit, final int n2) {
        return this.c7(n, timeUnit, n2, rx.schedulers.c.a());
    }
    
    public final g<Boolean> c2(final p<? super T, Boolean> p) {
        return this.i3((b<? extends Boolean, ? super T>)new s1((p<? super Object, Boolean>)p, false));
    }
    
    public final g<T> c4(final g<? extends T> g) {
        return this.i3((b<? extends T, ? super T>)y2.c((g<?>)g));
    }
    
    public final g<T> c5(final int n) {
        return this.i3((b<? extends T, ? super T>)new i3(n));
    }
    
    public final rx.observers.a<T> c6() {
        final s7.a<? super T> w = s7.a.w(Long.MAX_VALUE);
        this.y5(w);
        return (rx.observers.a<T>)w;
    }
    
    public final g<g<T>> c7(final long n, final TimeUnit timeUnit, final int n2, final j j) {
        return this.Y6(n, n, timeUnit, n2, j);
    }
    
    public final g<T> d2(final p<? super T, Boolean> p) {
        return Q6((a<T>)new k0((g<Object>)this, (p<? super Object, Boolean>)p));
    }
    
    public final g<T> d4(final p<? super Throwable, ? extends g<? extends T>> p) {
        return this.i3((b<? extends T, ? super T>)new y2(p));
    }
    
    public final g<T> d5(final long n, final TimeUnit timeUnit) {
        return this.e5(n, timeUnit, rx.schedulers.c.a());
    }
    
    public final rx.observers.a<T> d6(final long n) {
        final s7.a<? super T> w = s7.a.w(n);
        this.y5(w);
        return (rx.observers.a<T>)w;
    }
    
    public final g<g<T>> d7(final long n, final TimeUnit timeUnit, final j j) {
        return this.c7(n, timeUnit, Integer.MAX_VALUE, j);
    }
    
    @Deprecated
    public final g<T> e2(final rx.functions.a a) {
        return this.i3((b<? extends T, ? super T>)new g2(a));
    }
    
    public final g<T> e3() {
        return this.P5(1).Y4();
    }
    
    public final g<T> e4(final p<? super Throwable, ? extends T> p) {
        return this.i3((b<? extends T, ? super T>)y2.d((p<? super Throwable, ?>)p));
    }
    
    public final g<T> e5(final long n, final TimeUnit timeUnit, final j j) {
        return Q6((a<T>)new f1((g<Object>)this, n, timeUnit, j));
    }
    
    public final g<T> e6(final long n, final TimeUnit timeUnit) {
        return this.f6(n, timeUnit, rx.schedulers.c.a());
    }
    
    public final <U> g<g<T>> e7(final g<U> g) {
        return this.i3((b<? extends g<T>, ? super T>)new c4((g<Object>)g));
    }
    
    public final g<T> f2() {
        return this.L5(1).Y4();
    }
    
    public final g<T> f3(final p<? super T, Boolean> p) {
        return this.d2(p).P5(1).Y4();
    }
    
    public final g<T> f4(final g<? extends T> g) {
        return this.i3((b<? extends T, ? super T>)y2.b((g<?>)g));
    }
    
    public final g<T> f5(final int n) {
        return this.i3((b<? extends T, ? super T>)new j3(n));
    }
    
    public final g<T> f6(final long n, final TimeUnit timeUnit, final j j) {
        return this.i3((b<? extends T, ? super T>)new w3(n, timeUnit, j));
    }
    
    public final <TOpening, TClosing> g<g<T>> f7(final g<? extends TOpening> g, final p<? super TOpening, ? extends g<? extends TClosing>> p2) {
        return this.i3((b<? extends g<T>, ? super T>)new f4(g, (p<? super Object, ? extends g<?>>)p2));
    }
    
    public final g<T> g2(final p<? super T, Boolean> p) {
        return this.O5(p).Y4();
    }
    
    public final g<T> g3(final T t) {
        return this.P5(1).a5(t);
    }
    
    public final g<T> g4() {
        return Q6((a<T>)new i0((g<Object>)this));
    }
    
    public final g<T> g5(final long n, final TimeUnit timeUnit) {
        return this.h5(n, timeUnit, rx.schedulers.c.a());
    }
    
    public final g<T> g6(final long n, final TimeUnit timeUnit) {
        return this.P4(n, timeUnit);
    }
    
    public final <TClosing> g<g<T>> g7(final rx.functions.o<? extends g<? extends TClosing>> o) {
        return this.i3((b<? extends g<T>, ? super T>)new d4(o));
    }
    
    public final g<Boolean> h(final p<? super T, Boolean> p) {
        return this.i3((b<? extends Boolean, ? super T>)new r1((p<? super Object, Boolean>)p));
    }
    
    public final <R> g<R> h1(final p<? super T, ? extends g<? extends R>> p) {
        if (this instanceof rx.internal.util.o) {
            return ((rx.internal.util.o)this).H7(p);
        }
        return Q6((a<R>)new c0(this, (p<? super Object, ? extends g<?>>)p, 2, 0));
    }
    
    public final g<T> h2(final T t) {
        return this.L5(1).a5(t);
    }
    
    public final g<T> h3(final T t, final p<? super T, Boolean> p2) {
        return this.d2(p2).P5(1).a5(t);
    }
    
    public final <R> g<R> h4(final p<? super g<T>, ? extends g<R>> p) {
        return z2.K7((g<?>)this, (p<? super g<Object>, ? extends g<R>>)p);
    }
    
    public final g<T> h5(final long n, final TimeUnit timeUnit, final j j) {
        return this.i3((b<? extends T, ? super T>)new k3(n, timeUnit, j));
    }
    
    public final g<T> h6(final long n, final TimeUnit timeUnit, final j j) {
        return this.Q4(n, timeUnit, j);
    }
    
    public final <R> g<R> h7(final Iterable<g<?>> iterable, final y<R> y) {
        return Q6((a<R>)new i4((g<Object>)this, null, iterable, (y<Object>)y));
    }
    
    public final <R> g<R> i1(final p<? super T, ? extends g<? extends R>> p) {
        if (this instanceof rx.internal.util.o) {
            return ((rx.internal.util.o)this).H7(p);
        }
        return Q6((a<R>)new c0(this, (p<? super Object, ? extends g<?>>)p, 2, 2));
    }
    
    public final g<T> i2(final T t, final p<? super T, Boolean> p2) {
        return this.O5(p2).a5(t);
    }
    
    public final <R> g<R> i3(final b<? extends R, ? super T> b) {
        return Q6((a<R>)new t0((a<Object>)this.G, (b<?, ? super Object>)b));
    }
    
    public final rx.observables.c<T> i4() {
        return z2.M7((g<? extends T>)this);
    }
    
    public final <U> g<T> i5(final g<U> g) {
        return this.i3((b<? extends T, ? super T>)new l3((g<Object>)g));
    }
    
    public final g<T> i6(final long n, final TimeUnit timeUnit) {
        return this.v1(n, timeUnit);
    }
    
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> g<R> i7(final g<T1> g, final g<T2> g2, final g<T3> g3, final g<T4> g4, final g<T5> g5, final g<T6> g6, final g<T7> g7, final g<T8> g8, final x<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, R> x) {
        return Q6((a<R>)new i4((g<Object>)this, new g[] { g, g2, g3, g4, g5, g6, g7, g8 }, null, a0.n((x<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ?>)x)));
    }
    
    public final <R> g<R> j1(final p<? super T, ? extends g<? extends R>> p) {
        return this.k1(p, m.J);
    }
    
    public final <R> g<R> j2(final p<? super T, ? extends g<? extends R>> p) {
        if (this.getClass() == rx.internal.util.o.class) {
            return ((rx.internal.util.o)this).H7(p);
        }
        return p3(this.k3(p));
    }
    
    public final g<T> j3(final int n) {
        return this.L5(n);
    }
    
    public final g<T> j5(final p<? super T, Boolean> p) {
        return this.i3((b<? extends T, ? super T>)new m3(m3.b((p<? super Object, Boolean>)p)));
    }
    
    public final g<T> j6(final long n, final TimeUnit timeUnit, final j j) {
        return this.w1(n, timeUnit, j);
    }
    
    public final <T1, T2, T3, T4, T5, T6, T7, R> g<R> j7(final g<T1> g, final g<T2> g2, final g<T3> g3, final g<T4> g4, final g<T5> g5, final g<T6> g6, final g<T7> g7, final rx.functions.w<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, R> w) {
        return Q6((a<R>)new i4((g<Object>)this, new g[] { g, g2, g3, g4, g5, g6, g7 }, null, a0.m((rx.functions.w<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ?>)w)));
    }
    
    public final <R> g<R> k1(final p<? super T, ? extends g<? extends R>> p2, final int i) {
        if (i >= 1) {
            return this.i3((b<? extends R, ? super T>)new k2((p<? super Object, ? extends g<?>>)p2, i, Integer.MAX_VALUE));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("capacityHint > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final <R> g<R> k2(final p<? super T, ? extends g<? extends R>> p2, final int n) {
        if (this.getClass() == rx.internal.util.o.class) {
            return ((rx.internal.util.o)this).H7(p2);
        }
        return q3(this.k3(p2), n);
    }
    
    public final <R> g<R> k3(final p<? super T, ? extends R> p) {
        return Q6((a<R>)new u0((g<Object>)this, (p<? super Object, ?>)p));
    }
    
    public final g<T> k5() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   rx/g.M6:()Lrx/g;
        //     4: invokestatic    rx/internal/util/s.c:()Lrx/functions/p;
        //     7: invokevirtual   rx/g.s2:(Lrx/functions/p;)Lrx/g;
        //    10: areturn        
        //    Signature:
        //  ()Lrx/g<TT;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:173)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:173)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2463)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    public final g<rx.schedulers.e<T>> k6() {
        return this.l6(rx.schedulers.c.a());
    }
    
    public final <T1, T2, T3, T4, T5, T6, R> g<R> k7(final g<T1> g, final g<T2> g2, final g<T3> g3, final g<T4> g4, final g<T5> g5, final g<T6> g6, final rx.functions.v<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, R> v) {
        return Q6((a<R>)new i4((g<Object>)this, new g[] { g, g2, g3, g4, g5, g6 }, null, a0.l((rx.functions.v<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ?>)v)));
    }
    
    public final <R> g<R> l1(final p<? super T, ? extends g<? extends R>> p3, final int n, final int n2) {
        if (n < 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("capacityHint > 0 required but it was ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n2 >= 1) {
            return this.i3((b<? extends R, ? super T>)new k2((p<? super Object, ? extends g<?>>)p3, n, n2));
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("maxConcurrent > 0 required but it was ");
        sb2.append(n);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public final <R> g<R> l2(final p<? super T, ? extends g<? extends R>> p3, final p<? super Throwable, ? extends g<? extends R>> p4, final rx.functions.o<? extends g<? extends R>> o) {
        return p3(this.l3(p3, p4, o));
    }
    
    public final g<T> l4(final int i) {
        if (i > 0) {
            return this.i3((b<? extends T, ? super T>)u2.b(i));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("n > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final g<T> l5(final q<? super T, ? super T, Integer> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokevirtual   rx/g.O6:(Lrx/functions/q;)Lrx/g;
        //     5: invokestatic    rx/internal/util/s.c:()Lrx/functions/p;
        //     8: invokevirtual   rx/g.s2:(Lrx/functions/p;)Lrx/g;
        //    11: areturn        
        //    Signature:
        //  (Lrx/functions/q<-TT;-TT;Ljava/lang/Integer;>;)Lrx/g<TT;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:173)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:173)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2463)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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
    
    public final g<rx.schedulers.e<T>> l6(final j j) {
        return this.i3((b<? extends rx.schedulers.e<T>, ? super T>)new x3(j));
    }
    
    public final <T1, T2, T3, T4, T5, R> g<R> l7(final g<T1> g, final g<T2> g2, final g<T3> g3, final g<T4> g4, final g<T5> g5, final u<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, R> u) {
        return Q6((a<R>)new i4((g<Object>)this, new g[] { g, g2, g3, g4, g5 }, null, a0.k((u<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ?>)u)));
    }
    
    public final <R> g<R> m1(final p<? super T, ? extends Iterable<? extends R>> p) {
        return n0.b((g<?>)this, (p<? super Object, ? extends Iterable<? extends R>>)p, m.J);
    }
    
    public final <R> g<R> m2(final p<? super T, ? extends g<? extends R>> p4, final p<? super Throwable, ? extends g<? extends R>> p5, final rx.functions.o<? extends g<? extends R>> o, final int n) {
        return q3(this.l3(p4, p5, o), n);
    }
    
    public final g<rx.f<T>> m3() {
        return this.i3((b<? extends rx.f<T>, ? super T>)r2.b());
    }
    
    public final <R> g<R> m4(final R r, final q<R, ? super T, R> q) {
        return Q6((a<R>)new c1((g<Object>)this, r, (q<Object, ? super Object, Object>)q));
    }
    
    public final g<T> m5(final Iterable<T> iterable) {
        return D0(C2((Iterable<? extends T>)iterable), (g<? extends T>)this);
    }
    
    public final g<T> m6(final long n, final TimeUnit timeUnit) {
        return this.o6(n, timeUnit, null, rx.schedulers.c.a());
    }
    
    public final <T1, T2, T3, T4, R> g<R> m7(final g<T1> g, final g<T2> g2, final g<T3> g3, final g<T4> g4, final t<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> t) {
        return Q6((a<R>)new i4((g<Object>)this, new g[] { g, g2, g3, g4 }, null, a0.j((t<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ?>)t)));
    }
    
    public final g<T> n1(final g<? extends T> g) {
        return D0((g<? extends T>)this, g);
    }
    
    public final <U, R> g<R> n2(final p<? super T, ? extends g<? extends U>> p2, final q<? super T, ? super U, ? extends R> q) {
        return p3(this.i3((b<? extends g<? extends R>, ? super T>)new q2((p<? super Object, ? extends g<?>>)p2, (q<? super Object, ? super Object, ?>)q)));
    }
    
    public final g<T> n4(final q<T, T, T> q) {
        return Q6((a<T>)new b1((g<Object>)this, (q<Object, Object, Object>)q));
    }
    
    public final g<T> n5(final T t) {
        return D0((g<? extends T>)U2((T)t), (g<? extends T>)this);
    }
    
    public final g<T> n6(final long n, final TimeUnit timeUnit, final g<? extends T> g) {
        return this.o6(n, timeUnit, g, rx.schedulers.c.a());
    }
    
    public final <T1, T2, T3, R> g<R> n7(final g<T1> g, final g<T2> g2, final g<T3> g3, final rx.functions.s<? super T, ? super T1, ? super T2, ? super T3, R> s) {
        return Q6((a<R>)new i4((g<Object>)this, new g[] { g, g2, g3 }, null, a0.i((rx.functions.s<? super Object, ? super Object, ? super Object, ? super Object, ?>)s)));
    }
    
    public final g<Boolean> o1(final Object o) {
        return this.c2(h.l(o));
    }
    
    public final <U, R> g<R> o2(final p<? super T, ? extends g<? extends U>> p3, final q<? super T, ? super U, ? extends R> q, final int n) {
        return q3(this.i3((b<? extends g<? extends R>, ? super T>)new q2((p<? super Object, ? extends g<?>>)p3, (q<? super Object, ? super Object, ?>)q)), n);
    }
    
    public final g<T> o4() {
        return a1.c(this);
    }
    
    public final g<T> o5(final T t, final T t2) {
        return D0((g<? extends T>)V2(t, (T)t2), (g<? extends T>)this);
    }
    
    public final g<T> o6(final long n, final TimeUnit timeUnit, final g<? extends T> g, final j j) {
        return Q6((a<T>)new k1((g<Object>)this, n, timeUnit, j, g));
    }
    
    public final <T1, T2, R> g<R> o7(final g<T1> g, final g<T2> g2, final r<? super T, ? super T1, ? super T2, R> r) {
        return Q6((a<R>)new i4((g<Object>)this, new g[] { g, g2 }, null, a0.h((r<? super Object, ? super Object, ? super Object, ?>)r)));
    }
    
    public <R> g<R> p0(final c<? super T, ? extends R> c) {
        return c.h(this);
    }
    
    public final g<Integer> p1() {
        return this.m4(0, h.K);
    }
    
    public final g<T> p2(final p<? super T, ? extends rx.b> p) {
        return this.r2(p, false, Integer.MAX_VALUE);
    }
    
    public final g<T> p4(final long n) {
        return a1.d(this, n);
    }
    
    public final g<T> p5(final T t, final T t2, final T t3) {
        return D0((g<? extends T>)W2(t, t2, (T)t3), (g<? extends T>)this);
    }
    
    public final g<T> p6(final long n, final TimeUnit timeUnit, final j j) {
        return this.o6(n, timeUnit, null, j);
    }
    
    public final <U, R> g<R> p7(final g<? extends U> g, final q<? super T, ? super U, ? extends R> q) {
        return this.i3((b<? extends R, ? super T>)new h4(g, (q<? super Object, ? super Object, ?>)q));
    }
    
    public final g<Long> q1() {
        return this.m4(0L, h.G);
    }
    
    public final g<T> q2(final p<? super T, ? extends rx.b> p2, final boolean b) {
        return this.r2(p2, b, Integer.MAX_VALUE);
    }
    
    public final g<T> q4(final long n, final j j) {
        return a1.e(this, n, j);
    }
    
    public final g<T> q5(final T t, final T t2, final T t3, final T t4) {
        return D0((g<? extends T>)X2(t, t2, t3, (T)t4), (g<? extends T>)this);
    }
    
    public final <U, V> g<T> q6(final rx.functions.o<? extends g<U>> o, final p<? super T, ? extends g<V>> p2) {
        return this.r6((rx.functions.o<? extends g<Object>>)o, (p<? super T, ? extends g<Object>>)p2, (g<? extends T>)null);
    }
    
    public final <R> g<R> q7(final g<?>[] array, final y<R> y) {
        return Q6((a<R>)new i4((g<Object>)this, array, null, (y<Object>)y));
    }
    
    public final g<T> r2(final p<? super T, ? extends rx.b> p3, final boolean b, final int n) {
        return Q6((a<T>)new l0((g<Object>)this, (p<? super Object, ? extends rx.b>)p3, b, n));
    }
    
    public final g<T> r4(final j j) {
        return a1.f(this, j);
    }
    
    public final g<T> r5(final T t, final T t2, final T t3, final T t4, final T t5) {
        return D0((g<? extends T>)Y2(t, t2, t3, t4, (T)t5), (g<? extends T>)this);
    }
    
    public final <U, V> g<T> r6(final rx.functions.o<? extends g<U>> o, final p<? super T, ? extends g<V>> obj, final g<? extends T> g) {
        Objects.requireNonNull(obj, "timeoutSelector is null");
        g<Object> z1;
        if (o != null) {
            z1 = z1((rx.functions.o<g<Object>>)o);
        }
        else {
            z1 = null;
        }
        return Q6((a<T>)new j1((g<Object>)this, z1, (p<? super Object, ? extends g<Object>>)obj, g));
    }
    
    public final <R> g<R> s2(final p<? super T, ? extends Iterable<? extends R>> p) {
        return this.t2(p, m.J);
    }
    
    public final g<T> s4(final p<? super g<? extends Void>, ? extends g<?>> p) {
        return a1.g(this, (p<? super g<? extends rx.f<?>>, ? extends g<?>>)h.d(p));
    }
    
    public final g<T> s5(final T t, final T t2, final T t3, final T t4, final T t5, final T t6) {
        return D0((g<? extends T>)Z2(t, t2, t3, t4, t5, (T)t6), (g<? extends T>)this);
    }
    
    public final <V> g<T> s6(final p<? super T, ? extends g<V>> p) {
        return this.r6((rx.functions.o<? extends g<Object>>)null, (p<? super T, ? extends g<Object>>)p, (g<? extends T>)null);
    }
    
    public final g<T> t(final g<? extends T> g) {
        return k((g<? extends T>)this, g);
    }
    
    public final <R> g<R> t2(final p<? super T, ? extends Iterable<? extends R>> p2, final int n) {
        return n0.b((g<?>)this, (p<? super Object, ? extends Iterable<? extends R>>)p2, n);
    }
    
    public final g<T> t4(final p<? super g<? extends Void>, ? extends g<?>> p2, final j j) {
        return a1.i(this, (p<? super g<? extends rx.f<?>>, ? extends g<?>>)h.d(p2), j);
    }
    
    public final g<T> t5(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7) {
        return D0((g<? extends T>)a3(t, t2, t3, t4, t5, t6, (T)t7), (g<? extends T>)this);
    }
    
    public final <V> g<T> t6(final p<? super T, ? extends g<V>> p2, final g<? extends T> g) {
        return this.r6((rx.functions.o<? extends g<Object>>)null, (p<? super T, ? extends g<Object>>)p2, g);
    }
    
    public final g<T> u() {
        return this.i3((b<? extends T, ? super T>)t1.b());
    }
    
    public final <U, R> g<R> u2(final p<? super T, ? extends Iterable<? extends U>> p2, final q<? super T, ? super U, ? extends R> q) {
        return (g<R>)this.n2((p<? super T, ? extends g<?>>)q2.b((p<? super T, ? extends Iterable<?>>)p2), (q<? super T, ? super Object, ?>)q);
    }
    
    public final <R> g<R> u4(final p<? super g<T>, ? extends g<R>> p) {
        return a3.P7((rx.functions.o<? extends rx.observables.c<Object>>)h.g((g<Object>)this), (p<? super g<Object>, ? extends g<R>>)p);
    }
    
    public final g<T> u5(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8) {
        return D0((g<? extends T>)b3(t, t2, t3, t4, t5, t6, t7, (T)t8), (g<? extends T>)this);
    }
    
    public final g<List<T>> v(final int n) {
        return this.w(n, n);
    }
    
    public final g<T> v1(final long n, final TimeUnit timeUnit) {
        return this.w1(n, timeUnit, rx.schedulers.c.a());
    }
    
    public final <U, R> g<R> v2(final p<? super T, ? extends Iterable<? extends U>> p3, final q<? super T, ? super U, ? extends R> q, final int n) {
        return (g<R>)this.o2((p<? super T, ? extends g<?>>)q2.b((p<? super T, ? extends Iterable<?>>)p3), (q<? super T, ? super Object, ?>)q, n);
    }
    
    public final <R> g<R> v4(final p<? super g<T>, ? extends g<R>> p2, final int n) {
        return a3.P7((rx.functions.o<? extends rx.observables.c<Object>>)h.h((g<Object>)this, n), (p<? super g<Object>, ? extends g<R>>)p2);
    }
    
    public final g<T> v5(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8, final T t9) {
        return D0((g<? extends T>)c3(t, t2, t3, t4, t5, t6, t7, t8, (T)t9), (g<? extends T>)this);
    }
    
    public final g<List<T>> w(final int n, final int n2) {
        return this.i3((b<? extends List<T>, ? super T>)new v1(n, n2));
    }
    
    public final g<T> w1(final long n, final TimeUnit timeUnit, final j j) {
        return this.i3((b<? extends T, ? super T>)new a2(n, timeUnit, j));
    }
    
    public final <R> g<R> w2(final p<? super T, ? extends k<? extends R>> p) {
        return this.y2(p, false, Integer.MAX_VALUE);
    }
    
    public final <R> g<R> w4(final p<? super g<T>, ? extends g<R>> p4, final int n, final long n2, final TimeUnit timeUnit) {
        return this.x4(p4, n, n2, timeUnit, rx.schedulers.c.a());
    }
    
    public final g<T> w5(final g<T> g) {
        return D0((g<? extends T>)g, (g<? extends T>)this);
    }
    
    public final g<List<T>> x(final long n, final long n2, final TimeUnit timeUnit) {
        return this.y(n, n2, timeUnit, rx.schedulers.c.a());
    }
    
    public final <U> g<T> x1(final p<? super T, ? extends g<U>> p) {
        return this.i3((b<? extends T, ? super T>)new z1((p<? super Object, ? extends g<Object>>)p));
    }
    
    public final <R> g<R> x2(final p<? super T, ? extends k<? extends R>> p2, final boolean b) {
        return this.y2(p2, b, Integer.MAX_VALUE);
    }
    
    public final <R> g<R> x4(final p<? super g<T>, ? extends g<R>> p5, final int n, final long n2, final TimeUnit timeUnit, final j j) {
        if (n >= 0) {
            return a3.P7((rx.functions.o<? extends rx.observables.c<Object>>)h.i((g<Object>)this, n, n2, timeUnit, j), (p<? super g<Object>, ? extends g<R>>)p5);
        }
        throw new IllegalArgumentException("bufferSize < 0");
    }
    
    public final o x5() {
        return this.z5(new rx.internal.util.c<Object>(rx.functions.m.a(), h.M, rx.functions.m.a()));
    }
    
    public final g<List<T>> y(final long n, final long n2, final TimeUnit timeUnit, final j j) {
        return this.i3((b<? extends List<T>, ? super T>)new x1(n, n2, timeUnit, Integer.MAX_VALUE, j));
    }
    
    public final g<T> y1(final T t) {
        return this.G5(U2(t));
    }
    
    public final <R> g<R> y2(final p<? super T, ? extends k<? extends R>> p3, final boolean b, final int n) {
        return Q6((a<R>)new m0((g<Object>)this, (p<? super Object, ? extends k<?>>)p3, b, n));
    }
    
    public final <R> g<R> y4(final p<? super g<T>, ? extends g<R>> p3, final int n, final j j) {
        return a3.P7((rx.functions.o<? extends rx.observables.c<Object>>)h.h((g<Object>)this, n), (p<? super g<Object>, ? extends g<R>>)h.f((p<? super g<Object>, ? extends g<Object>>)p3, j));
    }
    
    public final o y5(final rx.h<? super T> obj) {
        if (obj instanceof n) {
            return this.z5((n<? super T>)obj);
        }
        Objects.requireNonNull(obj, "observer is null");
        return this.z5(new rx.internal.util.j<Object>(obj));
    }
    
    public final g<rx.schedulers.f<T>> y6() {
        return this.z6(rx.schedulers.c.a());
    }
    
    public final void z2(final rx.functions.b<? super T> b) {
        this.B5(b);
    }
    
    public final <R> g<R> z4(final p<? super g<T>, ? extends g<R>> p3, final long n, final TimeUnit timeUnit) {
        return this.A4(p3, n, timeUnit, rx.schedulers.c.a());
    }
    
    public final o z5(final n<? super T> n) {
        return A5((n<? super Object>)n, (g<Object>)this);
    }
    
    public final g<rx.schedulers.f<T>> z6(final j j) {
        return this.i3((b<? extends rx.schedulers.f<T>, ? super T>)new y3(j));
    }
    
    public interface a<T> extends b<n<? super T>>
    {
    }
    
    public interface b<R, T> extends p<n<? super R>, n<? super T>>
    {
    }
    
    public interface c<T, R> extends p<g<T>, g<R>>
    {
    }
}
