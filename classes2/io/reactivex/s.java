// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex;

import io.reactivex.internal.operators.maybe.u0;
import io.reactivex.internal.operators.maybe.g1;
import io.reactivex.internal.operators.maybe.f1;
import io.reactivex.internal.operators.maybe.s0;
import io.reactivex.internal.operators.maybe.e1;
import io.reactivex.internal.operators.maybe.o0;
import io.reactivex.internal.operators.maybe.d0;
import io.reactivex.internal.operators.maybe.c0;
import io.reactivex.internal.operators.maybe.f0;
import io.reactivex.internal.operators.maybe.e0;
import io.reactivex.internal.operators.maybe.p;
import io.reactivex.internal.operators.maybe.c1;
import io.reactivex.internal.operators.maybe.t;
import io.reactivex.internal.operators.maybe.b1;
import io.reactivex.internal.operators.maybe.a1;
import io.reactivex.internal.operators.maybe.r1;
import io.reactivex.internal.operators.maybe.z0;
import io.reactivex.internal.operators.maybe.r;
import io.reactivex.internal.operators.maybe.p1;
import io.reactivex.internal.operators.maybe.q;
import io.reactivex.internal.operators.maybe.n1;
import io.reactivex.internal.operators.maybe.w0;
import io.reactivex.internal.operators.maybe.v0;
import io.reactivex.internal.operators.maybe.t0;
import io.reactivex.internal.operators.maybe.e;
import io.reactivex.internal.operators.flowable.z;
import io.reactivex.internal.operators.maybe.n0;
import io.reactivex.internal.operators.maybe.m0;
import io.reactivex.internal.operators.maybe.l0;
import java.util.concurrent.Future;
import io.reactivex.internal.operators.maybe.v;
import io.reactivex.internal.operators.maybe.i0;
import io.reactivex.internal.operators.maybe.t1;
import io.reactivex.internal.operators.maybe.u1;
import x5.c;
import x5.i;
import io.reactivex.internal.operators.maybe.x;
import io.reactivex.internal.operators.maybe.u;
import x5.m;
import x5.n;
import io.reactivex.internal.operators.maybe.s1;
import x5.g;
import io.reactivex.internal.operators.maybe.q1;
import io.reactivex.internal.operators.maybe.y0;
import io.reactivex.internal.operators.maybe.l1;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.operators.maybe.x0;
import io.reactivex.internal.operators.maybe.m1;
import io.reactivex.internal.operators.maybe.k;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.maybe.h0;
import io.reactivex.internal.operators.flowable.d1;
import io.reactivex.internal.operators.maybe.j;
import io.reactivex.annotations.f;
import io.reactivex.annotations.h;
import io.reactivex.annotations.d;
import io.reactivex.annotations.a;
import x5.o;
import io.reactivex.internal.operators.maybe.o1;
import o7.b;

public abstract class s<T> implements y<T>
{
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> A(final b<? extends y<? extends T>> b) {
        return l.b3((o7.b<?>)b).b1((o<? super Object, ? extends o7.b<? extends T>>)o1.d());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> B(final Iterable<? extends y<? extends T>> iterable) {
        return l.a3((Iterable<?>)iterable).d1((o<? super Object, ? extends o7.b<? extends T>>)o1.d());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> C(final b<? extends y<? extends T>> b) {
        return l.b3((o7.b<?>)b).d1((o<? super Object, ? extends o7.b<? extends T>>)o1.d());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> C0(final y<? extends T> y, final y<? extends T> y2) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        return J0(y, y2);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> D0(final y<? extends T> y, final y<? extends T> y2, final y<? extends T> y3) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        return J0(y, y2, y3);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> E0(final y<? extends T> y, final y<? extends T> y2, final y<? extends T> y3, final y<? extends T> y4) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        io.reactivex.internal.functions.b.g(y4, "source4 is null");
        return J0(y, y2, y3, y4);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> F0(final Iterable<? extends y<? extends T>> iterable) {
        return G0((o7.b<? extends y<? extends T>>)l.a3((Iterable<?>)iterable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> G0(final b<? extends y<? extends T>> b) {
        return H0(b, Integer.MAX_VALUE);
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> H(final w<T> w) {
        io.reactivex.internal.functions.b.g(w, "onSubscribe is null");
        return io.reactivex.plugins.a.Q(new j<T>(w));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> H0(final b<? extends y<? extends T>> b, final int n) {
        io.reactivex.internal.functions.b.g(b, "source is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        return io.reactivex.plugins.a.P((l<T>)new d1((o7.b<Object>)b, (o<? super Object, ? extends o7.b<?>>)o1.d(), false, n, 1));
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> I0(final y<? extends y<? extends T>> y) {
        io.reactivex.internal.functions.b.g(y, "source is null");
        return io.reactivex.plugins.a.Q((s<T>)new h0((y<Object>)y, (o<? super Object, ? extends y<?>>)io.reactivex.internal.functions.a.k()));
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> J(final Callable<? extends y<? extends T>> callable) {
        io.reactivex.internal.functions.b.g(callable, "maybeSupplier is null");
        return io.reactivex.plugins.a.Q(new k<T>(callable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> J0(final y<? extends T>... array) {
        io.reactivex.internal.functions.b.g(array, "sources is null");
        if (array.length == 0) {
            return l.n2();
        }
        Object o;
        if (array.length == 1) {
            o = new m1<T>((y<Object>)array[0]);
        }
        else {
            o = new x0<T>(array);
        }
        return io.reactivex.plugins.a.P((l<T>)o);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> K0(final y<? extends T>... array) {
        if (array.length == 0) {
            return l.n2();
        }
        return l.U2(array).E2((o<? super y<? extends T>, ? extends o7.b<? extends T>>)o1.d(), true, array.length);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> L0(final y<? extends T> y, final y<? extends T> y2) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        return K0(y, y2);
    }
    
    @d
    @h("io.reactivex:computation")
    public static s<Long> L1(final long n, final TimeUnit timeUnit) {
        return M1(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> M0(final y<? extends T> y, final y<? extends T> y2, final y<? extends T> y3) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        return K0(y, y2, y3);
    }
    
    @d
    @h("custom")
    @f
    public static s<Long> M1(final long b, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.Q((s<Long>)new l1(Math.max(0L, b), timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> N0(final y<? extends T> y, final y<? extends T> y2, final y<? extends T> y3, final y<? extends T> y4) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        io.reactivex.internal.functions.b.g(y4, "source4 is null");
        return K0(y, y2, y3, y4);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> O0(final Iterable<? extends y<? extends T>> iterable) {
        return l.a3((Iterable<?>)iterable).D2((o<? super Object, ? extends o7.b<? extends T>>)o1.d(), true);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> P0(final b<? extends y<? extends T>> b) {
        return Q0(b, Integer.MAX_VALUE);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> Q0(final b<? extends y<? extends T>> b, final int n) {
        io.reactivex.internal.functions.b.g(b, "source is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        return io.reactivex.plugins.a.P((l<T>)new d1((o7.b<Object>)b, (o<? super Object, ? extends o7.b<?>>)o1.d(), true, n, 1));
    }
    
    @d
    @h("none")
    public static <T> s<T> S0() {
        return io.reactivex.plugins.a.Q((s<T>)y0.G);
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> S1(final y<T> y) {
        if (!(y instanceof s)) {
            io.reactivex.internal.functions.b.g(y, "onSubscribe is null");
            return io.reactivex.plugins.a.Q(new q1((y<Object>)y));
        }
        throw new IllegalArgumentException("unsafeCreate(Maybe) should be upgraded");
    }
    
    @d
    @h("none")
    public static <T, D> s<T> U1(final Callable<? extends D> callable, final o<? super D, ? extends y<? extends T>> o, final g<? super D> g) {
        return V1((Callable<?>)callable, (o<? super Object, ? extends y<? extends T>>)o, (g<? super Object>)g, true);
    }
    
    @d
    @h("none")
    @f
    public static <T, D> s<T> V1(final Callable<? extends D> callable, final o<? super D, ? extends y<? extends T>> o, final g<? super D> g, final boolean b) {
        io.reactivex.internal.functions.b.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.b.g(o, "sourceSupplier is null");
        io.reactivex.internal.functions.b.g(g, "disposer is null");
        return io.reactivex.plugins.a.Q((s<T>)new s1(callable, (o<? super Object, ? extends y<?>>)o, (g<? super Object>)g, b));
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> W1(final y<T> y) {
        if (y instanceof s) {
            return io.reactivex.plugins.a.Q((s<T>)y);
        }
        io.reactivex.internal.functions.b.g((s<T>)y, "onSubscribe is null");
        return io.reactivex.plugins.a.Q(new q1((y<Object>)y));
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> s<R> X1(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final y<? extends T6> y6, final y<? extends T7> y7, final y<? extends T8> y8, final y<? extends T9> y9, final n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> n) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        io.reactivex.internal.functions.b.g(y4, "source4 is null");
        io.reactivex.internal.functions.b.g(y5, "source5 is null");
        io.reactivex.internal.functions.b.g(y6, "source6 is null");
        io.reactivex.internal.functions.b.g(y7, "source7 is null");
        io.reactivex.internal.functions.b.g(y8, "source8 is null");
        io.reactivex.internal.functions.b.g(y9, "source9 is null");
        return g2((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.E((n<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object>)n), (y<?>[])new y[] { y, y2, y3, y4, y5, y6, y7, y8, y9 });
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> s<R> Y1(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final y<? extends T6> y6, final y<? extends T7> y7, final y<? extends T8> y8, final m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> m) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        io.reactivex.internal.functions.b.g(y4, "source4 is null");
        io.reactivex.internal.functions.b.g(y5, "source5 is null");
        io.reactivex.internal.functions.b.g(y6, "source6 is null");
        io.reactivex.internal.functions.b.g(y7, "source7 is null");
        io.reactivex.internal.functions.b.g(y8, "source8 is null");
        return g2((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.D((m<Object, Object, Object, Object, Object, Object, Object, Object, Object>)m), (y<?>[])new y[] { y, y2, y3, y4, y5, y6, y7, y8 });
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, R> s<R> Z1(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final y<? extends T6> y6, final y<? extends T7> y7, final x5.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> l) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        io.reactivex.internal.functions.b.g(y4, "source4 is null");
        io.reactivex.internal.functions.b.g(y5, "source5 is null");
        io.reactivex.internal.functions.b.g(y6, "source6 is null");
        io.reactivex.internal.functions.b.g(y7, "source7 is null");
        return g2((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.C((x5.l<Object, Object, Object, Object, Object, Object, Object, Object>)l), (y<?>[])new y[] { y, y2, y3, y4, y5, y6, y7 });
    }
    
    @d
    @h("none")
    public static <T> s<T> a0() {
        return io.reactivex.plugins.a.Q((s<T>)u.G);
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, R> s<R> a2(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final y<? extends T6> y6, final x5.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> k) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        io.reactivex.internal.functions.b.g(y4, "source4 is null");
        io.reactivex.internal.functions.b.g(y5, "source5 is null");
        io.reactivex.internal.functions.b.g(y6, "source6 is null");
        return g2((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.B((x5.k<Object, Object, Object, Object, Object, Object, Object>)k), (y<?>[])new y[] { y, y2, y3, y4, y5, y6 });
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> b0(final Throwable t) {
        io.reactivex.internal.functions.b.g(t, "exception is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.w<T>(t));
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, R> s<R> b2(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final x5.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> j) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        io.reactivex.internal.functions.b.g(y4, "source4 is null");
        io.reactivex.internal.functions.b.g(y5, "source5 is null");
        return g2((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.A((x5.j<Object, Object, Object, Object, Object, Object>)j), (y<?>[])new y[] { y, y2, y3, y4, y5 });
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> c0(final Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.b.g(callable, "errorSupplier is null");
        return io.reactivex.plugins.a.Q(new x<T>(callable));
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, R> s<R> c2(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        io.reactivex.internal.functions.b.g(y4, "source4 is null");
        return g2((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.z((i<Object, Object, Object, Object, Object>)i), (y<?>[])new y[] { y, y2, y3, y4 });
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, R> s<R> d2(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final x5.h<? super T1, ? super T2, ? super T3, ? extends R> h) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        return g2((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.y((x5.h<Object, Object, Object, Object>)h), (y<?>[])new y[] { y, y2, y3 });
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> e(final Iterable<? extends y<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.b<T>(null, iterable));
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, R> s<R> e2(final y<? extends T1> y, final y<? extends T2> y2, final c<? super T1, ? super T2, ? extends R> c) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        return g2((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.x((c<? super Object, ? super Object, ? extends R>)c), (y<?>[])new y[] { y, y2 });
    }
    
    @d
    @h("none")
    @f
    public static <T, R> s<R> f2(final Iterable<? extends y<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        io.reactivex.internal.functions.b.g(o, "zipper is null");
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.Q((s<R>)new u1(iterable, o));
    }
    
    @d
    @h("none")
    @f
    public static <T, R> s<R> g2(final o<? super Object[], ? extends R> o, final y<? extends T>... array) {
        io.reactivex.internal.functions.b.g(array, "sources is null");
        if (array.length == 0) {
            return a0();
        }
        io.reactivex.internal.functions.b.g(o, "zipper is null");
        return io.reactivex.plugins.a.Q((s<R>)new t1(array, o));
    }
    
    @d
    @h("none")
    public static <T> s<T> h(final y<? extends T>... array) {
        if (array.length == 0) {
            return a0();
        }
        if (array.length == 1) {
            return W1((y<T>)array[0]);
        }
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.b<T>(array, null));
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> o0(final x5.a a) {
        io.reactivex.internal.functions.b.g(a, "run is null");
        return io.reactivex.plugins.a.Q(new i0<T>(a));
    }
    
    @d
    @h("none")
    public static <T> k0<Boolean> o1(final y<? extends T> y, final y<? extends T> y2) {
        return p1((y<?>)y, (y<?>)y2, (x5.d<? super Object, ? super Object>)io.reactivex.internal.functions.b.d());
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> p0(@f final Callable<? extends T> callable) {
        io.reactivex.internal.functions.b.g(callable, "callable is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.j0<T>(callable));
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<Boolean> p1(final y<? extends T> y, final y<? extends T> y2, final x5.d<? super T, ? super T> d) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(d, "isEqual is null");
        return io.reactivex.plugins.a.S((k0<Boolean>)new v<Object>(y, y2, d));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> q(final y<? extends T> y, final y<? extends T> y2) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        return w(y, y2);
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> q0(final io.reactivex.i i) {
        io.reactivex.internal.functions.b.g(i, "completableSource is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.k0<T>(i));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> r(final y<? extends T> y, final y<? extends T> y2, final y<? extends T> y3) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        return w(y, y2, y3);
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> r0(final Future<? extends T> future) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        return io.reactivex.plugins.a.Q(new l0<T>(future, 0L, null));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> s(final y<? extends T> y, final y<? extends T> y2, final y<? extends T> y3, final y<? extends T> y4) {
        io.reactivex.internal.functions.b.g(y, "source1 is null");
        io.reactivex.internal.functions.b.g(y2, "source2 is null");
        io.reactivex.internal.functions.b.g(y3, "source3 is null");
        io.reactivex.internal.functions.b.g(y4, "source4 is null");
        return w(y, y2, y3, y4);
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> s0(final Future<? extends T> future, final long n, final TimeUnit timeUnit) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.Q(new l0<T>(future, n, timeUnit));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> t(final Iterable<? extends y<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.maybe.g<T>(iterable));
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> t0(final Runnable runnable) {
        io.reactivex.internal.functions.b.g(runnable, "run is null");
        return io.reactivex.plugins.a.Q(new m0<T>(runnable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> u(final b<? extends y<? extends T>> b) {
        return v(b, 2);
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> u0(final q0<T> q0) {
        io.reactivex.internal.functions.b.g(q0, "singleSource is null");
        return io.reactivex.plugins.a.Q(new n0<T>(q0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> v(final b<? extends y<? extends T>> b, final int n) {
        io.reactivex.internal.functions.b.g(b, "sources is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        return io.reactivex.plugins.a.P((l<T>)new z((o7.b<Object>)b, (o<? super Object, ? extends o7.b<?>>)o1.d(), n, io.reactivex.internal.util.j.G));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> w(final y<? extends T>... array) {
        io.reactivex.internal.functions.b.g(array, "sources is null");
        if (array.length == 0) {
            return l.n2();
        }
        Object o;
        if (array.length == 1) {
            o = new m1<T>((y<Object>)array[0]);
        }
        else {
            o = new e<T>(array);
        }
        return io.reactivex.plugins.a.P((l<T>)o);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> x(final y<? extends T>... array) {
        if (array.length == 0) {
            return l.n2();
        }
        Object o;
        if (array.length == 1) {
            o = new m1<T>((y<Object>)array[0]);
        }
        else {
            o = new io.reactivex.internal.operators.maybe.f<T>(array);
        }
        return io.reactivex.plugins.a.P((l<T>)o);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> y(final y<? extends T>... array) {
        return l.U2(array).d1((o<? super y<? extends T>, ? extends o7.b<? extends T>>)o1.d());
    }
    
    @d
    @h("none")
    @f
    public static <T> s<T> y0(final T t) {
        io.reactivex.internal.functions.b.g(t, "item is null");
        return io.reactivex.plugins.a.Q(new t0<T>(t));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> z(final Iterable<? extends y<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return l.a3((Iterable<?>)iterable).b1((o<? super Object, ? extends o7.b<? extends T>>)o1.d());
    }
    
    @d
    @h("none")
    @f
    public final <R> s<R> A0(final o<? super T, ? extends R> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.Q((s<R>)new v0((y<Object>)this, (o<? super Object, ?>)o));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <U> s<T> A1(final b<U> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "other is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: new             Lio/reactivex/internal/operators/maybe/i1;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   io/reactivex/internal/operators/maybe/i1.<init>:(Lio/reactivex/y;Lo7/b;)V
        //    17: invokestatic    io/reactivex/plugins/a.Q:(Lio/reactivex/s;)Lio/reactivex/s;
        //    20: areturn        
        //    Signature:
        //  <U:Ljava/lang/Object;>(Lo7/b<TU;>;)Lio/reactivex/s<TT;>;
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
    @io.reactivex.annotations.e
    public final k0<a0<T>> B0() {
        return io.reactivex.plugins.a.S(new w0((s<Object>)this));
    }
    
    @d
    @h("none")
    public final io.reactivex.observers.n<T> B1() {
        final io.reactivex.observers.n<Object> n = new io.reactivex.observers.n<Object>();
        this.c(n);
        return (io.reactivex.observers.n<T>)n;
    }
    
    @d
    @h("none")
    public final io.reactivex.observers.n<T> C1(final boolean b) {
        final io.reactivex.observers.n<Object> n = new io.reactivex.observers.n<Object>();
        if (b) {
            n.cancel();
        }
        this.c(n);
        return (io.reactivex.observers.n<T>)n;
    }
    
    @d
    @h("none")
    @f
    public final <R> s<R> D(final o<? super T, ? extends y<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.Q((s<R>)new h0((y<Object>)this, (o<? super Object, ? extends y<?>>)o));
    }
    
    @d
    @h("io.reactivex:computation")
    public final s<T> D1(final long n, final TimeUnit timeUnit) {
        return this.F1(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> E(final y<? extends T> y) {
        io.reactivex.internal.functions.b.g(y, "other is null");
        return q((y<? extends T>)this, y);
    }
    
    @d
    @h("io.reactivex:computation")
    @f
    public final s<T> E1(final long n, final TimeUnit timeUnit, final y<? extends T> y) {
        io.reactivex.internal.functions.b.g(y, "fallback is null");
        return this.G1(n, timeUnit, io.reactivex.schedulers.b.a(), y);
    }
    
    @d
    @h("none")
    @f
    public final k0<Boolean> F(final Object o) {
        io.reactivex.internal.functions.b.g(o, "item is null");
        return io.reactivex.plugins.a.S((k0<Boolean>)new io.reactivex.internal.operators.maybe.h<Object>(this, o));
    }
    
    @d
    @h("custom")
    public final s<T> F1(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.H1(M1(n, timeUnit, j0));
    }
    
    @d
    @h("none")
    public final k0<Long> G() {
        return io.reactivex.plugins.a.S((k0<Long>)new io.reactivex.internal.operators.maybe.i<Object>(this));
    }
    
    @d
    @h("custom")
    @f
    public final s<T> G1(final long n, final TimeUnit timeUnit, final j0 j0, final y<? extends T> y) {
        io.reactivex.internal.functions.b.g(y, "fallback is null");
        return this.I1(M1(n, timeUnit, j0), y);
    }
    
    @d
    @h("none")
    @f
    public final <U> s<T> H1(final y<U> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "timeoutIndicator is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: new             Lio/reactivex/internal/operators/maybe/j1;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: aconst_null    
        //    15: invokespecial   io/reactivex/internal/operators/maybe/j1.<init>:(Lio/reactivex/y;Lio/reactivex/y;Lio/reactivex/y;)V
        //    18: invokestatic    io/reactivex/plugins/a.Q:(Lio/reactivex/s;)Lio/reactivex/s;
        //    21: areturn        
        //    Signature:
        //  <U:Ljava/lang/Object;>(Lio/reactivex/y<TU;>;)Lio/reactivex/s<TT;>;
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
    @f
    public final s<T> I(final T t) {
        io.reactivex.internal.functions.b.g(t, "defaultItem is null");
        return this.x1((y<? extends T>)y0(t));
    }
    
    @d
    @h("none")
    @f
    public final <U> s<T> I1(final y<U> p0, final y<? extends T> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "timeoutIndicator is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: aload_2        
        //     9: ldc_w           "fallback is null"
        //    12: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    15: pop            
        //    16: new             Lio/reactivex/internal/operators/maybe/j1;
        //    19: dup            
        //    20: aload_0        
        //    21: aload_1        
        //    22: aload_2        
        //    23: invokespecial   io/reactivex/internal/operators/maybe/j1.<init>:(Lio/reactivex/y;Lio/reactivex/y;Lio/reactivex/y;)V
        //    26: invokestatic    io/reactivex/plugins/a.Q:(Lio/reactivex/s;)Lio/reactivex/s;
        //    29: areturn        
        //    Signature:
        //  <U:Ljava/lang/Object;>(Lio/reactivex/y<TU;>;Lio/reactivex/y<+TT;>;)Lio/reactivex/s<TT;>;
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
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <U> s<T> J1(final b<U> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "timeoutIndicator is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: new             Lio/reactivex/internal/operators/maybe/k1;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: aconst_null    
        //    15: invokespecial   io/reactivex/internal/operators/maybe/k1.<init>:(Lio/reactivex/y;Lo7/b;Lio/reactivex/y;)V
        //    18: invokestatic    io/reactivex/plugins/a.Q:(Lio/reactivex/s;)Lio/reactivex/s;
        //    21: areturn        
        //    Signature:
        //  <U:Ljava/lang/Object;>(Lo7/b<TU;>;)Lio/reactivex/s<TT;>;
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
    public final s<T> K(final long n, final TimeUnit timeUnit) {
        return this.L(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <U> s<T> K1(final b<U> p0, final y<? extends T> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "timeoutIndicator is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: aload_2        
        //     9: ldc_w           "fallback is null"
        //    12: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    15: pop            
        //    16: new             Lio/reactivex/internal/operators/maybe/k1;
        //    19: dup            
        //    20: aload_0        
        //    21: aload_1        
        //    22: aload_2        
        //    23: invokespecial   io/reactivex/internal/operators/maybe/k1.<init>:(Lio/reactivex/y;Lo7/b;Lio/reactivex/y;)V
        //    26: invokestatic    io/reactivex/plugins/a.Q:(Lio/reactivex/s;)Lio/reactivex/s;
        //    29: areturn        
        //    Signature:
        //  <U:Ljava/lang/Object;>(Lo7/b<TU;>;Lio/reactivex/y<+TT;>;)Lio/reactivex/s<TT;>;
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
    @f
    public final s<T> L(final long b, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.l((y<Object>)this, Math.max(0L, b), timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <U, V> s<T> M(final b<U> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "delayIndicator is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: new             Lio/reactivex/internal/operators/maybe/m;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   io/reactivex/internal/operators/maybe/m.<init>:(Lio/reactivex/y;Lo7/b;)V
        //    17: invokestatic    io/reactivex/plugins/a.Q:(Lio/reactivex/s;)Lio/reactivex/s;
        //    20: areturn        
        //    Signature:
        //  <U:Ljava/lang/Object;V:Ljava/lang/Object;>(Lo7/b<TU;>;)Lio/reactivex/s<TT;>;
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
    public final s<T> N(final long n, final TimeUnit timeUnit) {
        return this.O(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    @f
    public final <R> R N1(final o<? super s<T>, R> o) {
        try {
            return io.reactivex.internal.functions.b.g(o, "convert is null").apply(this);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            throw io.reactivex.internal.util.k.f(t);
        }
    }
    
    @d
    @h("custom")
    public final s<T> O(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.P((o7.b<Object>)l.y7(n, timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> O1() {
        if (this instanceof y5.b) {
            return ((y5.b)this).g();
        }
        return io.reactivex.plugins.a.P(new m1<T>(this));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <U> s<T> P(final b<U> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "subscriptionIndicator is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: new             Lio/reactivex/internal/operators/maybe/n;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   io/reactivex/internal/operators/maybe/n.<init>:(Lio/reactivex/y;Lo7/b;)V
        //    17: invokestatic    io/reactivex/plugins/a.Q:(Lio/reactivex/s;)Lio/reactivex/s;
        //    20: areturn        
        //    Signature:
        //  <U:Ljava/lang/Object;>(Lo7/b<TU;>;)Lio/reactivex/s<TT;>;
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
    public final b0<T> P1() {
        if (this instanceof y5.d) {
            return ((y5.d)this).a();
        }
        return io.reactivex.plugins.a.R(new n1<T>(this));
    }
    
    @d
    @h("none")
    @f
    public final s<T> Q(final g<? super T> g) {
        io.reactivex.internal.functions.b.g(g, "onAfterSuccess is null");
        return io.reactivex.plugins.a.Q(new q((y<Object>)this, (g<? super Object>)g));
    }
    
    @d
    @h("none")
    public final k0<T> Q1() {
        return io.reactivex.plugins.a.S(new p1<T>(this, null));
    }
    
    @d
    @h("none")
    @f
    public final s<T> R(final x5.a a) {
        final g<? super io.reactivex.disposables.c> h = io.reactivex.internal.functions.a.h();
        final g<? super Object> h2 = io.reactivex.internal.functions.a.h();
        final g<? super Throwable> h3 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.d1((y<Object>)this, h, h2, h3, c, io.reactivex.internal.functions.b.g(a, "onAfterTerminate is null"), c));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> R0(final y<? extends T> y) {
        io.reactivex.internal.functions.b.g(y, "other is null");
        return C0((y<? extends T>)this, y);
    }
    
    @d
    @h("none")
    @f
    public final k0<T> R1(final T t) {
        io.reactivex.internal.functions.b.g(t, "defaultValue is null");
        return io.reactivex.plugins.a.S(new p1<T>(this, t));
    }
    
    @d
    @h("none")
    @f
    public final s<T> S(final x5.a a) {
        io.reactivex.internal.functions.b.g(a, "onFinally is null");
        return io.reactivex.plugins.a.Q(new r((y<Object>)this, a));
    }
    
    @d
    @h("none")
    @f
    public final s<T> T(x5.a a) {
        final g<? super io.reactivex.disposables.c> h = io.reactivex.internal.functions.a.h();
        final g<? super Object> h2 = io.reactivex.internal.functions.a.h();
        final g<? super Throwable> h3 = io.reactivex.internal.functions.a.h();
        a = io.reactivex.internal.functions.b.g(a, "onComplete is null");
        final x5.a c = io.reactivex.internal.functions.a.c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.d1((y<Object>)this, h, h2, h3, a, c, c));
    }
    
    @d
    @h("custom")
    @f
    public final s<T> T0(final j0 j0) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.Q(new z0((y<Object>)this, j0));
    }
    
    @d
    @h("custom")
    @f
    public final s<T> T1(final j0 j0) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.Q(new r1((y<Object>)this, j0));
    }
    
    @d
    @h("none")
    @f
    public final s<T> U(final x5.a a) {
        final g<? super io.reactivex.disposables.c> h = io.reactivex.internal.functions.a.h();
        final g<? super Object> h2 = io.reactivex.internal.functions.a.h();
        final g<? super Throwable> h3 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.d1((y<Object>)this, h, h2, h3, c, c, io.reactivex.internal.functions.b.g(a, "onDispose is null")));
    }
    
    @d
    @h("none")
    @f
    public final <U> s<U> U0(final Class<U> clazz) {
        io.reactivex.internal.functions.b.g(clazz, "clazz is null");
        return (s<U>)this.d0(io.reactivex.internal.functions.a.l(clazz)).o((Class<?>)clazz);
    }
    
    @d
    @h("none")
    @f
    public final s<T> V(final g<? super Throwable> g) {
        final g<? super io.reactivex.disposables.c> h = io.reactivex.internal.functions.a.h();
        final g<? super Object> h2 = io.reactivex.internal.functions.a.h();
        final g<? super Throwable> g2 = io.reactivex.internal.functions.b.g(g, "onError is null");
        final x5.a c = io.reactivex.internal.functions.a.c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.d1((y<Object>)this, h, h2, g2, c, c, c));
    }
    
    @d
    @h("none")
    public final s<T> V0() {
        return this.W0(io.reactivex.internal.functions.a.c());
    }
    
    @d
    @h("none")
    public final s<T> W(final x5.b<? super T, ? super Throwable> b) {
        io.reactivex.internal.functions.b.g(b, "onEvent is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.s((y<Object>)this, (x5.b<? super Object, ? super Throwable>)b));
    }
    
    @d
    @h("none")
    @f
    public final s<T> W0(final x5.r<? super Throwable> r) {
        io.reactivex.internal.functions.b.g(r, "predicate is null");
        return io.reactivex.plugins.a.Q(new a1((y<Object>)this, r));
    }
    
    @d
    @h("none")
    @f
    public final s<T> X(final g<? super io.reactivex.disposables.c> g) {
        final g<? super io.reactivex.disposables.c> g2 = io.reactivex.internal.functions.b.g(g, "onSubscribe is null");
        final g<? super Object> h = io.reactivex.internal.functions.a.h();
        final g<? super Throwable> h2 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.d1((y<Object>)this, g2, h, h2, c, c, c));
    }
    
    @d
    @h("none")
    @f
    public final s<T> X0(final y<? extends T> y) {
        io.reactivex.internal.functions.b.g(y, "next is null");
        return this.Y0(io.reactivex.internal.functions.a.n(y));
    }
    
    @d
    @h("none")
    @f
    public final s<T> Y(final g<? super T> g) {
        final g<? super io.reactivex.disposables.c> h = io.reactivex.internal.functions.a.h();
        final g<? super Object> g2 = io.reactivex.internal.functions.b.g(g, "onSuccess is null");
        final g<? super Throwable> h2 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.d1((y<Object>)this, h, g2, h2, c, c, c));
    }
    
    @d
    @h("none")
    @f
    public final s<T> Y0(final o<? super Throwable, ? extends y<? extends T>> o) {
        io.reactivex.internal.functions.b.g(o, "resumeFunction is null");
        return io.reactivex.plugins.a.Q(new b1((y<Object>)this, o, true));
    }
    
    @d
    @h("none")
    @io.reactivex.annotations.e
    @f
    public final s<T> Z(final x5.a a) {
        io.reactivex.internal.functions.b.g(a, "onTerminate is null");
        return io.reactivex.plugins.a.Q(new t<T>(this, a));
    }
    
    @d
    @h("none")
    @f
    public final s<T> Z0(final o<? super Throwable, ? extends T> o) {
        io.reactivex.internal.functions.b.g(o, "valueSupplier is null");
        return io.reactivex.plugins.a.Q(new c1((y<Object>)this, o));
    }
    
    @d
    @h("none")
    @f
    public final s<T> a1(final T t) {
        io.reactivex.internal.functions.b.g(t, "item is null");
        return this.Z0(io.reactivex.internal.functions.a.n(t));
    }
    
    @d
    @h("none")
    @f
    public final s<T> b1(final y<? extends T> y) {
        io.reactivex.internal.functions.b.g(y, "next is null");
        return io.reactivex.plugins.a.Q(new b1((y<Object>)this, io.reactivex.internal.functions.a.n((y<? extends T>)y), false));
    }
    
    @h("none")
    @Override
    public final void c(final io.reactivex.v<? super T> v) {
        io.reactivex.internal.functions.b.g(v, "observer is null");
        final io.reactivex.v<? super Object> e0 = io.reactivex.plugins.a.e0((s<Object>)this, (io.reactivex.v<? super Object>)v);
        io.reactivex.internal.functions.b.g(e0, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            this.u1(e0);
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable cause;
            io.reactivex.exceptions.b.b(cause);
            final NullPointerException ex2 = new NullPointerException("subscribeActual failed");
            ex2.initCause(cause);
            throw ex2;
        }
    }
    
    @d
    @h("none")
    public final s<T> c1() {
        return io.reactivex.plugins.a.Q(new p((y<Object>)this));
    }
    
    @d
    @h("none")
    @f
    public final s<T> d0(final x5.r<? super T> r) {
        io.reactivex.internal.functions.b.g(r, "predicate is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.y((y<Object>)this, (x5.r<? super Object>)r));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> d1() {
        return this.e1(Long.MAX_VALUE);
    }
    
    @d
    @h("none")
    @f
    public final <R> s<R> e0(final o<? super T, ? extends y<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.Q((s<R>)new h0((y<Object>)this, (o<? super Object, ? extends y<?>>)o));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> e1(final long n) {
        return this.O1().X4(n);
    }
    
    @d
    @h("none")
    @f
    public final <U, R> s<R> f0(final o<? super T, ? extends y<? extends U>> o, final c<? super T, ? super U, ? extends R> c) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.g(c, "resultSelector is null");
        return io.reactivex.plugins.a.Q((s<R>)new io.reactivex.internal.operators.maybe.a0((y<Object>)this, (o<? super Object, ? extends y<?>>)o, (c<? super Object, ? super Object, ?>)c));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> f1(final x5.e e) {
        return this.O1().Y4(e);
    }
    
    @d
    @h("none")
    @f
    public final <R> s<R> g0(final o<? super T, ? extends y<? extends R>> o, final o<? super Throwable, ? extends y<? extends R>> o2, final Callable<? extends y<? extends R>> callable) {
        io.reactivex.internal.functions.b.g(o, "onSuccessMapper is null");
        io.reactivex.internal.functions.b.g(o2, "onErrorMapper is null");
        io.reactivex.internal.functions.b.g(callable, "onCompleteSupplier is null");
        return io.reactivex.plugins.a.Q((s<R>)new e0((y<Object>)this, (o<? super Object, ? extends y<?>>)o, o2, callable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> g1(final o<? super l<Object>, ? extends b<?>> o) {
        return this.O1().Z4(o);
    }
    
    @d
    @h("none")
    @f
    public final io.reactivex.c h0(final o<? super T, ? extends io.reactivex.i> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.maybe.b0<Object>(this, o));
    }
    
    @d
    @h("none")
    public final s<T> h1() {
        return this.j1(Long.MAX_VALUE, io.reactivex.internal.functions.a.c());
    }
    
    @d
    @h("none")
    @f
    public final <U, R> s<R> h2(final y<? extends U> y, final c<? super T, ? super U, ? extends R> c) {
        io.reactivex.internal.functions.b.g(y, "other is null");
        return e2((y<?>)this, (y<?>)y, (c<? super Object, ? super Object, ? extends R>)c);
    }
    
    @d
    @h("none")
    @f
    public final s<T> i(final y<? extends T> y) {
        io.reactivex.internal.functions.b.g(y, "other is null");
        return h(this, y);
    }
    
    @d
    @h("none")
    @f
    public final <R> b0<R> i0(final o<? super T, ? extends g0<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<R>)new io.reactivex.internal.operators.mixed.j((y<Object>)this, (o<? super Object, ? extends g0<?>>)o));
    }
    
    @d
    @h("none")
    public final s<T> i1(final long n) {
        return this.j1(n, io.reactivex.internal.functions.a.c());
    }
    
    @d
    @h("none")
    public final <R> R j(@f final io.reactivex.t<T, ? extends R> t) {
        return (R)io.reactivex.internal.functions.b.g(t, "converter is null").a(this);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> j0(final o<? super T, ? extends b<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.P((l<R>)new io.reactivex.internal.operators.mixed.k((y<Object>)this, (o<? super Object, ? extends o7.b<?>>)o));
    }
    
    @d
    @h("none")
    public final s<T> j1(final long n, final x5.r<? super Throwable> r) {
        return this.O1().s5(n, r).O5();
    }
    
    @d
    @h("none")
    public final T k() {
        final io.reactivex.internal.observers.h<T> h = new io.reactivex.internal.observers.h<T>();
        this.c(h);
        return h.c();
    }
    
    @d
    @h("none")
    @f
    public final <R> k0<R> k0(final o<? super T, ? extends q0<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.S((k0<R>)new f0((y<Object>)this, (o<? super Object, ? extends q0<?>>)o));
    }
    
    @d
    @h("none")
    public final s<T> k1(final x5.d<? super Integer, ? super Throwable> d) {
        return this.O1().t5(d).O5();
    }
    
    @d
    @h("none")
    @f
    public final <R> s<R> l0(final o<? super T, ? extends q0<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.Q((s<R>)new io.reactivex.internal.operators.maybe.g0((y<Object>)this, (o<? super Object, ? extends q0<?>>)o));
    }
    
    @d
    @h("none")
    public final s<T> l1(final x5.r<? super Throwable> r) {
        return this.j1(Long.MAX_VALUE, r);
    }
    
    @d
    @h("none")
    public final T m(final T t) {
        io.reactivex.internal.functions.b.g(t, "defaultValue is null");
        final io.reactivex.internal.observers.h<T> h = new io.reactivex.internal.observers.h<T>();
        this.c(h);
        return h.e(t);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U> l<U> m0(final o<? super T, ? extends Iterable<? extends U>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.P((l<U>)new c0((y<Object>)this, (o<? super Object, ? extends Iterable<?>>)o));
    }
    
    @d
    @h("none")
    @f
    public final s<T> m1(final x5.e e) {
        io.reactivex.internal.functions.b.g(e, "stop is null");
        return this.j1(Long.MAX_VALUE, io.reactivex.internal.functions.a.v(e));
    }
    
    @d
    @h("none")
    public final s<T> n() {
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.c<T>(this));
    }
    
    @d
    @h("none")
    @f
    public final <U> b0<U> n0(final o<? super T, ? extends Iterable<? extends U>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<U>)new d0((y<Object>)this, (o<? super Object, ? extends Iterable<?>>)o));
    }
    
    @d
    @h("none")
    public final s<T> n1(final o<? super l<Throwable>, ? extends b<?>> o) {
        return this.O1().w5(o).O5();
    }
    
    @d
    @h("none")
    @f
    public final <U> s<U> o(final Class<? extends U> clazz) {
        io.reactivex.internal.functions.b.g(clazz, "clazz is null");
        return this.A0((o<? super T, ? extends U>)io.reactivex.internal.functions.a.e((Class<? extends R>)clazz));
    }
    
    @d
    @h("none")
    public final <R> s<R> p(final io.reactivex.z<? super T, ? extends R> z) {
        return W1((y<R>)io.reactivex.internal.functions.b.g(z, "transformer is null").a(this));
    }
    
    @h("none")
    public final io.reactivex.disposables.c q1() {
        return this.t1(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f, io.reactivex.internal.functions.a.c);
    }
    
    @d
    @h("none")
    public final io.reactivex.disposables.c r1(final g<? super T> g) {
        return this.t1(g, io.reactivex.internal.functions.a.f, io.reactivex.internal.functions.a.c);
    }
    
    @d
    @h("none")
    public final io.reactivex.disposables.c s1(final g<? super T> g, final g<? super Throwable> g2) {
        return this.t1(g, g2, io.reactivex.internal.functions.a.c);
    }
    
    @d
    @h("none")
    @f
    public final io.reactivex.disposables.c t1(final g<? super T> g, final g<? super Throwable> g2, final x5.a a) {
        io.reactivex.internal.functions.b.g(g, "onSuccess is null");
        io.reactivex.internal.functions.b.g(g2, "onError is null");
        io.reactivex.internal.functions.b.g(a, "onComplete is null");
        return this.w1((io.reactivex.internal.operators.maybe.d<?>)new io.reactivex.internal.operators.maybe.d<Object>(g, g2, a));
    }
    
    protected abstract void u1(final io.reactivex.v<? super T> p0);
    
    @d
    @h("none")
    public final s<T> v0() {
        return io.reactivex.plugins.a.Q(new o0((y<Object>)this));
    }
    
    @d
    @h("custom")
    @f
    public final s<T> v1(final j0 j0) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.Q(new e1((y<Object>)this, j0));
    }
    
    @d
    @h("none")
    public final io.reactivex.c w0() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.maybe.q0<Object>(this));
    }
    
    @d
    @h("none")
    public final <E extends io.reactivex.v<? super T>> E w1(final E e) {
        this.c(e);
        return e;
    }
    
    @d
    @h("none")
    public final k0<Boolean> x0() {
        return io.reactivex.plugins.a.S((k0<Boolean>)new s0<Object>(this));
    }
    
    @d
    @h("none")
    @f
    public final s<T> x1(final y<? extends T> y) {
        io.reactivex.internal.functions.b.g(y, "other is null");
        return io.reactivex.plugins.a.Q(new f1((y<Object>)this, y));
    }
    
    @d
    @h("none")
    @f
    public final k0<T> y1(final q0<? extends T> q0) {
        io.reactivex.internal.functions.b.g(q0, "other is null");
        return io.reactivex.plugins.a.S(new g1<T>(this, q0));
    }
    
    @d
    @h("none")
    @f
    public final <R> s<R> z0(final io.reactivex.x<? extends R, ? super T> x) {
        io.reactivex.internal.functions.b.g(x, "lift is null");
        return io.reactivex.plugins.a.Q((s<R>)new u0((y<Object>)this, (io.reactivex.x<?, ? super Object>)x));
    }
    
    @d
    @h("none")
    @f
    public final <U> s<T> z1(final y<U> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "other is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: new             Lio/reactivex/internal/operators/maybe/h1;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   io/reactivex/internal/operators/maybe/h1.<init>:(Lio/reactivex/y;Lio/reactivex/y;)V
        //    17: invokestatic    io/reactivex/plugins/a.Q:(Lio/reactivex/s;)Lio/reactivex/s;
        //    20: areturn        
        //    Signature:
        //  <U:Ljava/lang/Object;>(Lio/reactivex/y<TU;>;)Lio/reactivex/s<TT;>;
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
}
