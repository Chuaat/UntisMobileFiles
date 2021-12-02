// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex;

import io.reactivex.internal.operators.single.v0;
import io.reactivex.internal.operators.single.r0;
import io.reactivex.internal.operators.single.u0;
import io.reactivex.internal.operators.single.c0;
import io.reactivex.internal.operators.single.y;
import io.reactivex.internal.operators.single.u;
import io.reactivex.internal.operators.single.t;
import io.reactivex.internal.operators.single.r;
import io.reactivex.internal.operators.single.q;
import io.reactivex.internal.operators.single.p;
import io.reactivex.internal.operators.single.p0;
import io.reactivex.internal.operators.single.n0;
import io.reactivex.internal.operators.single.w0;
import io.reactivex.internal.operators.flowable.r3;
import io.reactivex.internal.operators.flowable.z;
import io.reactivex.internal.operators.single.i0;
import io.reactivex.internal.operators.single.t0;
import io.reactivex.internal.operators.single.s0;
import io.reactivex.internal.operators.single.e0;
import io.reactivex.internal.operators.observable.e3;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import io.reactivex.internal.operators.single.d0;
import io.reactivex.internal.operators.single.w;
import io.reactivex.internal.operators.single.v;
import io.reactivex.internal.operators.single.y0;
import java.util.NoSuchElementException;
import io.reactivex.internal.operators.single.z0;
import x5.c;
import x5.i;
import x5.j;
import io.reactivex.internal.operators.single.m0;
import x5.k;
import x5.m;
import x5.n;
import io.reactivex.internal.operators.single.e;
import io.reactivex.internal.operators.single.x0;
import x5.g;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.single.x;
import x5.o;
import io.reactivex.internal.operators.flowable.d1;
import io.reactivex.internal.operators.single.h0;
import io.reactivex.internal.operators.single.f0;
import io.reactivex.annotations.f;
import io.reactivex.annotations.h;
import io.reactivex.annotations.d;
import io.reactivex.annotations.a;
import o7.b;

public abstract class k0<T> implements q0<T>
{
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> A0(final Iterable<? extends q0<? extends T>> iterable) {
        return B0((o7.b<? extends q0<? extends T>>)l.a3((Iterable<?>)iterable));
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<T> A1(final q0<T> q0) {
        io.reactivex.internal.functions.b.g(q0, "onSubscribe is null");
        if (!(q0 instanceof k0)) {
            return io.reactivex.plugins.a.S(new f0<T>(q0));
        }
        throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> B0(final b<? extends q0<? extends T>> b) {
        io.reactivex.internal.functions.b.g(b, "sources is null");
        return io.reactivex.plugins.a.P((l<T>)new d1((o7.b<Object>)b, (o<? super Object, ? extends o7.b<?>>)h0.c(), false, Integer.MAX_VALUE, l.b0()));
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<T> C0(final q0<? extends q0<? extends T>> q0) {
        io.reactivex.internal.functions.b.g(q0, "source is null");
        return io.reactivex.plugins.a.S((k0<T>)new x(q0, (o<? super Object, ? extends q0<?>>)io.reactivex.internal.functions.a.k()));
    }
    
    @d
    @h("none")
    public static <T, U> k0<T> C1(final Callable<U> callable, final o<? super U, ? extends q0<? extends T>> o, final g<? super U> g) {
        return D1(callable, o, g, true);
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<T> D(final o0<T> o0) {
        io.reactivex.internal.functions.b.g(o0, "source is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.d<T>(o0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> D0(final q0<? extends T> q0, final q0<? extends T> q2) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        return H0((o7.b<? extends q0<? extends T>>)l.U2(q0, q2));
    }
    
    @d
    @h("none")
    @f
    public static <T, U> k0<T> D1(final Callable<U> callable, final o<? super U, ? extends q0<? extends T>> o, final g<? super U> g, final boolean b) {
        io.reactivex.internal.functions.b.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.b.g(o, "singleFunction is null");
        io.reactivex.internal.functions.b.g(g, "disposer is null");
        return io.reactivex.plugins.a.S((k0<T>)new x0((Callable<Object>)callable, (o<? super Object, ? extends q0<?>>)o, (g<? super Object>)g, b));
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<T> E(final Callable<? extends q0<? extends T>> callable) {
        io.reactivex.internal.functions.b.g(callable, "singleSupplier is null");
        return io.reactivex.plugins.a.S(new e<T>(callable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> E0(final q0<? extends T> q0, final q0<? extends T> q2, final q0<? extends T> q3) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        return H0((o7.b<? extends q0<? extends T>>)l.U2(q0, q2, q3));
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<T> E1(final q0<T> q0) {
        io.reactivex.internal.functions.b.g(q0, "source is null");
        if (q0 instanceof k0) {
            return io.reactivex.plugins.a.S((k0<T>)q0);
        }
        return io.reactivex.plugins.a.S(new f0<T>(q0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> F0(final q0<? extends T> q0, final q0<? extends T> q2, final q0<? extends T> q3, final q0<? extends T> q4) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        io.reactivex.internal.functions.b.g(q4, "source4 is null");
        return H0((o7.b<? extends q0<? extends T>>)l.U2(q0, q2, q3, q4));
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> k0<R> F1(final q0<? extends T1> q0, final q0<? extends T2> q2, final q0<? extends T3> q3, final q0<? extends T4> q4, final q0<? extends T5> q5, final q0<? extends T6> q6, final q0<? extends T7> q7, final q0<? extends T8> q8, final q0<? extends T9> q9, final n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> n) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        io.reactivex.internal.functions.b.g(q4, "source4 is null");
        io.reactivex.internal.functions.b.g(q5, "source5 is null");
        io.reactivex.internal.functions.b.g(q6, "source6 is null");
        io.reactivex.internal.functions.b.g(q7, "source7 is null");
        io.reactivex.internal.functions.b.g(q8, "source8 is null");
        io.reactivex.internal.functions.b.g(q9, "source9 is null");
        return O1((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.E((n<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object>)n), (q0<?>[])new q0[] { q0, q2, q3, q4, q5, q6, q7, q8, q9 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> G0(final Iterable<? extends q0<? extends T>> iterable) {
        return H0((o7.b<? extends q0<? extends T>>)l.a3((Iterable<?>)iterable));
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> k0<R> G1(final q0<? extends T1> q0, final q0<? extends T2> q2, final q0<? extends T3> q3, final q0<? extends T4> q4, final q0<? extends T5> q5, final q0<? extends T6> q6, final q0<? extends T7> q7, final q0<? extends T8> q8, final m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> m) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        io.reactivex.internal.functions.b.g(q4, "source4 is null");
        io.reactivex.internal.functions.b.g(q5, "source5 is null");
        io.reactivex.internal.functions.b.g(q6, "source6 is null");
        io.reactivex.internal.functions.b.g(q7, "source7 is null");
        io.reactivex.internal.functions.b.g(q8, "source8 is null");
        return O1((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.D((m<Object, Object, Object, Object, Object, Object, Object, Object, Object>)m), (q0<?>[])new q0[] { q0, q2, q3, q4, q5, q6, q7, q8 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> H0(final b<? extends q0<? extends T>> b) {
        io.reactivex.internal.functions.b.g(b, "sources is null");
        return io.reactivex.plugins.a.P((l<T>)new d1((o7.b<Object>)b, (o<? super Object, ? extends o7.b<?>>)h0.c(), true, Integer.MAX_VALUE, l.b0()));
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, R> k0<R> H1(final q0<? extends T1> q0, final q0<? extends T2> q2, final q0<? extends T3> q3, final q0<? extends T4> q4, final q0<? extends T5> q5, final q0<? extends T6> q6, final q0<? extends T7> q7, final x5.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> l) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        io.reactivex.internal.functions.b.g(q4, "source4 is null");
        io.reactivex.internal.functions.b.g(q5, "source5 is null");
        io.reactivex.internal.functions.b.g(q6, "source6 is null");
        io.reactivex.internal.functions.b.g(q7, "source7 is null");
        return O1((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.C((x5.l<Object, Object, Object, Object, Object, Object, Object, Object>)l), (q0<?>[])new q0[] { q0, q2, q3, q4, q5, q6, q7 });
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, R> k0<R> I1(final q0<? extends T1> q0, final q0<? extends T2> q2, final q0<? extends T3> q3, final q0<? extends T4> q4, final q0<? extends T5> q5, final q0<? extends T6> q6, final k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> k) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        io.reactivex.internal.functions.b.g(q4, "source4 is null");
        io.reactivex.internal.functions.b.g(q5, "source5 is null");
        io.reactivex.internal.functions.b.g(q6, "source6 is null");
        return O1((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.B((k<Object, Object, Object, Object, Object, Object, Object>)k), (q0<?>[])new q0[] { q0, q2, q3, q4, q5, q6 });
    }
    
    @d
    @h("none")
    public static <T> k0<T> J0() {
        return io.reactivex.plugins.a.S((k0<T>)m0.G);
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, R> k0<R> J1(final q0<? extends T1> q0, final q0<? extends T2> q2, final q0<? extends T3> q3, final q0<? extends T4> q4, final q0<? extends T5> q5, final j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> j) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        io.reactivex.internal.functions.b.g(q4, "source4 is null");
        io.reactivex.internal.functions.b.g(q5, "source5 is null");
        return O1((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.A((j<Object, Object, Object, Object, Object, Object>)j), (q0<?>[])new q0[] { q0, q2, q3, q4, q5 });
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, R> k0<R> K1(final q0<? extends T1> q0, final q0<? extends T2> q2, final q0<? extends T3> q3, final q0<? extends T4> q4, final i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        io.reactivex.internal.functions.b.g(q4, "source4 is null");
        return O1((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.z((i<Object, Object, Object, Object, Object>)i), (q0<?>[])new q0[] { q0, q2, q3, q4 });
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, T3, R> k0<R> L1(final q0<? extends T1> q0, final q0<? extends T2> q2, final q0<? extends T3> q3, final x5.h<? super T1, ? super T2, ? super T3, ? extends R> h) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        return O1((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.y((x5.h<Object, Object, Object, Object>)h), (q0<?>[])new q0[] { q0, q2, q3 });
    }
    
    @d
    @h("none")
    @f
    public static <T1, T2, R> k0<R> M1(final q0<? extends T1> q0, final q0<? extends T2> q2, final c<? super T1, ? super T2, ? extends R> c) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        return O1((o<? super Object[], ? extends R>)io.reactivex.internal.functions.a.x((c<? super Object, ? super Object, ? extends R>)c), (q0<?>[])new q0[] { q0, q2 });
    }
    
    @d
    @h("none")
    @f
    public static <T, R> k0<R> N1(final Iterable<? extends q0<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        io.reactivex.internal.functions.b.g(o, "zipper is null");
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.S((k0<R>)new z0(iterable, o));
    }
    
    @d
    @h("none")
    @f
    public static <T, R> k0<R> O1(final o<? super Object[], ? extends R> o, final q0<? extends T>... array) {
        io.reactivex.internal.functions.b.g(o, "zipper is null");
        io.reactivex.internal.functions.b.g(array, "sources is null");
        if (array.length == 0) {
            return a0(new NoSuchElementException());
        }
        return io.reactivex.plugins.a.S((k0<R>)new y0(array, o));
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<Boolean> Z(final q0<? extends T> q0, final q0<? extends T> q2) {
        io.reactivex.internal.functions.b.g(q0, "first is null");
        io.reactivex.internal.functions.b.g(q2, "second is null");
        return io.reactivex.plugins.a.S((k0<Boolean>)new v<Object>(q0, q2));
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<T> a0(final Throwable t) {
        io.reactivex.internal.functions.b.g(t, "exception is null");
        return b0(io.reactivex.internal.functions.a.m(t));
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<T> b0(final Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.b.g(callable, "errorSupplier is null");
        return io.reactivex.plugins.a.S(new w<T>(callable));
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<T> f(final Iterable<? extends q0<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.a<T>(null, iterable));
    }
    
    @d
    @h("none")
    public static <T> k0<T> h(final q0<? extends T>... array) {
        if (array.length == 0) {
            return b0(h0.a());
        }
        if (array.length == 1) {
            return E1((q0<T>)array[0]);
        }
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.a<T>(array, null));
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<T> k0(final Callable<? extends T> callable) {
        io.reactivex.internal.functions.b.g(callable, "callable is null");
        return io.reactivex.plugins.a.S(new d0<T>(callable));
    }
    
    @d
    @h("none")
    public static <T> k0<T> l0(final Future<? extends T> future) {
        return z1(l.W2(future));
    }
    
    @d
    @h("none")
    public static <T> k0<T> m0(final Future<? extends T> future, final long n, final TimeUnit timeUnit) {
        return z1(l.X2(future, n, timeUnit));
    }
    
    @d
    @h("custom")
    public static <T> k0<T> n0(final Future<? extends T> future, final long n, final TimeUnit timeUnit, final j0 j0) {
        return z1(l.Y2(future, n, timeUnit, j0));
    }
    
    @d
    @h("custom")
    public static <T> k0<T> o0(final Future<? extends T> future, final j0 j0) {
        return z1(l.Z2(future, j0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> p(final q0<? extends T> q0, final q0<? extends T> q2) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        return t((o7.b<? extends q0<? extends T>>)l.U2(q0, q2));
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<T> p0(final g0<? extends T> g0) {
        io.reactivex.internal.functions.b.g(g0, "observableSource is null");
        return io.reactivex.plugins.a.S(new e3<T>(g0, null));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> q(final q0<? extends T> q0, final q0<? extends T> q2, final q0<? extends T> q3) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        return t((o7.b<? extends q0<? extends T>>)l.U2(q0, q2, q3));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public static <T> k0<T> q0(final b<? extends T> b) {
        io.reactivex.internal.functions.b.g(b, "publisher is null");
        return io.reactivex.plugins.a.S(new e0<T>(b));
    }
    
    private k0<T> q1(final long n, final TimeUnit timeUnit, final j0 j0, final q0<? extends T> q0) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.S(new s0<T>(this, n, timeUnit, j0, q0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> r(final q0<? extends T> q0, final q0<? extends T> q2, final q0<? extends T> q3, final q0<? extends T> q4) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        io.reactivex.internal.functions.b.g(q4, "source4 is null");
        return t((o7.b<? extends q0<? extends T>>)l.U2(q0, q2, q3, q4));
    }
    
    @d
    @h("io.reactivex:computation")
    public static k0<Long> r1(final long n, final TimeUnit timeUnit) {
        return s1(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> s(final Iterable<? extends q0<? extends T>> iterable) {
        return t((o7.b<? extends q0<? extends T>>)l.a3((Iterable<?>)iterable));
    }
    
    @d
    @h("custom")
    @f
    public static k0<Long> s1(final long n, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.S((k0<Long>)new t0(n, timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> t(final b<? extends q0<? extends T>> b) {
        return u(b, 2);
    }
    
    @d
    @h("none")
    @f
    public static <T> k0<T> t0(final T t) {
        io.reactivex.internal.functions.b.g(t, "item is null");
        return io.reactivex.plugins.a.S(new i0<T>(t));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> u(final b<? extends q0<? extends T>> b, final int n) {
        io.reactivex.internal.functions.b.g(b, "sources is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        return io.reactivex.plugins.a.P((l<T>)new z((o7.b<Object>)b, (o<? super Object, ? extends o7.b<?>>)h0.c(), n, io.reactivex.internal.util.j.G));
    }
    
    @d
    @h("none")
    @f
    public static <T> b0<T> v(final g0<? extends q0<? extends T>> g0) {
        io.reactivex.internal.functions.b.g(g0, "sources is null");
        return io.reactivex.plugins.a.R((b0<T>)new io.reactivex.internal.operators.observable.v((g0<Object>)g0, (o<? super Object, ? extends g0<?>>)h0.d(), 2, io.reactivex.internal.util.j.G));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> w(final q0<? extends T>... array) {
        return io.reactivex.plugins.a.P((l<T>)new io.reactivex.internal.operators.flowable.w((l<Object>)l.U2(array), (o<? super Object, ? extends o7.b<?>>)h0.c(), 2, io.reactivex.internal.util.j.H));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> x(final q0<? extends T>... array) {
        return l.U2(array).d1((o<? super q0<? extends T>, ? extends o7.b<? extends T>>)h0.c());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> x0(final q0<? extends T> q0, final q0<? extends T> q2) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        return B0((o7.b<? extends q0<? extends T>>)l.U2(q0, q2));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> y(final Iterable<? extends q0<? extends T>> iterable) {
        return l.a3((Iterable<?>)iterable).d1((o<? super Object, ? extends o7.b<? extends T>>)h0.c());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> y0(final q0<? extends T> q0, final q0<? extends T> q2, final q0<? extends T> q3) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        return B0((o7.b<? extends q0<? extends T>>)l.U2(q0, q2, q3));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> z(final b<? extends q0<? extends T>> b) {
        return l.b3((o7.b<?>)b).d1((o<? super Object, ? extends o7.b<? extends T>>)h0.c());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> z0(final q0<? extends T> q0, final q0<? extends T> q2, final q0<? extends T> q3, final q0<? extends T> q4) {
        io.reactivex.internal.functions.b.g(q0, "source1 is null");
        io.reactivex.internal.functions.b.g(q2, "source2 is null");
        io.reactivex.internal.functions.b.g(q3, "source3 is null");
        io.reactivex.internal.functions.b.g(q4, "source4 is null");
        return B0((o7.b<? extends q0<? extends T>>)l.U2(q0, q2, q3, q4));
    }
    
    private static <T> k0<T> z1(final l<T> l) {
        return io.reactivex.plugins.a.S(new r3<T>(l, null));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> A(final q0<? extends T> q0) {
        return p((q0<? extends T>)this, q0);
    }
    
    @d
    @h("none")
    public final k0<Boolean> B(final Object o) {
        return this.C(o, io.reactivex.internal.functions.b.d());
    }
    
    @d
    @h("custom")
    @f
    public final k0<T> B1(final j0 j0) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.S(new w0<T>(this, j0));
    }
    
    @d
    @h("none")
    @f
    public final k0<Boolean> C(final Object o, final x5.d<Object, Object> d) {
        io.reactivex.internal.functions.b.g(o, "value is null");
        io.reactivex.internal.functions.b.g(d, "comparer is null");
        return io.reactivex.plugins.a.S((k0<Boolean>)new io.reactivex.internal.operators.single.c<Object>(this, o, d));
    }
    
    @d
    @h("io.reactivex:computation")
    public final k0<T> F(final long n, final TimeUnit timeUnit) {
        return this.H(n, timeUnit, io.reactivex.schedulers.b.a(), false);
    }
    
    @d
    @h("custom")
    public final k0<T> G(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.H(n, timeUnit, j0, false);
    }
    
    @d
    @h("custom")
    @f
    public final k0<T> H(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.f<T>((q0<? extends T>)this, n, timeUnit, j0, b));
    }
    
    @d
    @h("io.reactivex:computation")
    public final k0<T> I(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.H(n, timeUnit, io.reactivex.schedulers.b.a(), b);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> I0(final q0<? extends T> q0) {
        return x0((q0<? extends T>)this, q0);
    }
    
    @d
    @h("io.reactivex:computation")
    public final k0<T> J(final long n, final TimeUnit timeUnit) {
        return this.K(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("custom")
    public final k0<T> K(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.M(b0.T6(n, timeUnit, j0));
    }
    
    @d
    @h("custom")
    @f
    public final k0<T> K0(final j0 j0) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.S(new n0<T>(this, j0));
    }
    
    @d
    @h("none")
    @f
    public final k0<T> L(final io.reactivex.i i) {
        io.reactivex.internal.functions.b.g(i, "other is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.g<T>(this, i));
    }
    
    @d
    @h("none")
    @f
    public final k0<T> L0(final k0<? extends T> k0) {
        io.reactivex.internal.functions.b.g(k0, "resumeSingleInCaseOfError is null");
        return this.M0(io.reactivex.internal.functions.a.n((q0<? extends T>)k0));
    }
    
    @d
    @h("none")
    @f
    public final <U> k0<T> M(final g0<U> g0) {
        io.reactivex.internal.functions.b.g(g0, "other is null");
        return io.reactivex.plugins.a.S((k0<T>)new io.reactivex.internal.operators.single.h((q0<Object>)this, (g0<Object>)g0));
    }
    
    @d
    @h("none")
    @f
    public final k0<T> M0(final o<? super Throwable, ? extends q0<? extends T>> o) {
        io.reactivex.internal.functions.b.g(o, "resumeFunctionInCaseOfError is null");
        return io.reactivex.plugins.a.S(new p0<T>((q0<? extends T>)this, o));
    }
    
    @d
    @h("none")
    @f
    public final <U> k0<T> N(final q0<U> q0) {
        io.reactivex.internal.functions.b.g(q0, "other is null");
        return io.reactivex.plugins.a.S((k0<T>)new io.reactivex.internal.operators.single.j((q0<Object>)this, (q0<Object>)q0));
    }
    
    @d
    @h("none")
    @f
    public final k0<T> N0(final o<Throwable, ? extends T> o) {
        io.reactivex.internal.functions.b.g(o, "resumeFunction is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.o0<T>((q0<? extends T>)this, o, null));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U> k0<T> O(final b<U> b) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        return io.reactivex.plugins.a.S((k0<T>)new io.reactivex.internal.operators.single.i((q0<Object>)this, (o7.b<Object>)b));
    }
    
    @d
    @h("none")
    @f
    public final k0<T> O0(final T t) {
        io.reactivex.internal.functions.b.g(t, "value is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.o0<T>((q0<? extends T>)this, null, t));
    }
    
    @d
    @h("none")
    @io.reactivex.annotations.e
    @f
    public final <R> s<R> P(final o<? super T, a0<R>> o) {
        io.reactivex.internal.functions.b.g(o, "selector is null");
        return io.reactivex.plugins.a.Q((s<R>)new io.reactivex.internal.operators.single.k((k0<Object>)this, (o<? super Object, a0<Object>>)o));
    }
    
    @d
    @h("none")
    public final k0<T> P0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.l<T>(this));
    }
    
    @d
    @h("none")
    public final <U, R> k0<R> P1(final q0<U> q0, final c<? super T, ? super U, ? extends R> c) {
        return M1((q0<?>)this, (q0<?>)q0, (c<? super Object, ? super Object, ? extends R>)c);
    }
    
    @d
    @h("none")
    @f
    public final k0<T> Q(final g<? super T> g) {
        io.reactivex.internal.functions.b.g(g, "onAfterSuccess is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.m<T>(this, g));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> Q0() {
        return this.v1().W4();
    }
    
    @d
    @h("none")
    @f
    public final k0<T> R(final x5.a a) {
        io.reactivex.internal.functions.b.g(a, "onAfterTerminate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.n<T>(this, a));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> R0(final long n) {
        return this.v1().X4(n);
    }
    
    @d
    @h("none")
    @f
    public final k0<T> S(final x5.a a) {
        io.reactivex.internal.functions.b.g(a, "onFinally is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.o<T>(this, a));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> S0(final x5.e e) {
        return this.v1().Y4(e);
    }
    
    @d
    @h("none")
    @f
    public final k0<T> T(final x5.a a) {
        io.reactivex.internal.functions.b.g(a, "onDispose is null");
        return io.reactivex.plugins.a.S(new p<T>(this, a));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> T0(final o<? super l<Object>, ? extends b<?>> o) {
        return this.v1().Z4(o);
    }
    
    @d
    @h("none")
    @f
    public final k0<T> U(final g<? super Throwable> g) {
        io.reactivex.internal.functions.b.g(g, "onError is null");
        return io.reactivex.plugins.a.S(new q<T>(this, g));
    }
    
    @d
    @h("none")
    public final k0<T> U0() {
        return z1(this.v1().q5());
    }
    
    @d
    @h("none")
    @f
    public final k0<T> V(final x5.b<? super T, ? super Throwable> b) {
        io.reactivex.internal.functions.b.g(b, "onEvent is null");
        return io.reactivex.plugins.a.S(new r<T>(this, b));
    }
    
    @d
    @h("none")
    public final k0<T> V0(final long n) {
        return z1(this.v1().r5(n));
    }
    
    @d
    @h("none")
    @f
    public final k0<T> W(final g<? super io.reactivex.disposables.c> g) {
        io.reactivex.internal.functions.b.g(g, "onSubscribe is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.s<T>(this, g));
    }
    
    @d
    @h("none")
    public final k0<T> W0(final long n, final x5.r<? super Throwable> r) {
        return z1(this.v1().s5(n, r));
    }
    
    @d
    @h("none")
    @f
    public final k0<T> X(final g<? super T> g) {
        io.reactivex.internal.functions.b.g(g, "onSuccess is null");
        return io.reactivex.plugins.a.S(new t<T>(this, g));
    }
    
    @d
    @h("none")
    public final k0<T> X0(final x5.d<? super Integer, ? super Throwable> d) {
        return z1(this.v1().t5(d));
    }
    
    @d
    @h("none")
    @io.reactivex.annotations.e
    @f
    public final k0<T> Y(final x5.a a) {
        io.reactivex.internal.functions.b.g(a, "onTerminate is null");
        return io.reactivex.plugins.a.S(new u<T>(this, a));
    }
    
    @d
    @h("none")
    public final k0<T> Y0(final x5.r<? super Throwable> r) {
        return z1(this.v1().u5(r));
    }
    
    @d
    @h("none")
    public final k0<T> Z0(final o<? super l<Throwable>, ? extends b<?>> o) {
        return z1(this.v1().w5(o));
    }
    
    @h("none")
    public final io.reactivex.disposables.c a1() {
        return this.d1(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f);
    }
    
    @d
    @h("none")
    @f
    public final io.reactivex.disposables.c b1(final x5.b<? super T, ? super Throwable> b) {
        io.reactivex.internal.functions.b.g(b, "onCallback is null");
        final io.reactivex.internal.observers.d<Object> d = new io.reactivex.internal.observers.d<Object>((x5.b<? super Object, ? super Throwable>)b);
        this.c(d);
        return d;
    }
    
    @h("none")
    @Override
    public final void c(final io.reactivex.n0<? super T> n0) {
        io.reactivex.internal.functions.b.g(n0, "observer is null");
        final io.reactivex.n0<? super Object> g0 = io.reactivex.plugins.a.g0((k0<Object>)this, (io.reactivex.n0<? super Object>)n0);
        io.reactivex.internal.functions.b.g(g0, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            this.e1(g0);
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
    @f
    public final s<T> c0(final x5.r<? super T> r) {
        io.reactivex.internal.functions.b.g(r, "predicate is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.z<T>(this, r));
    }
    
    @d
    @h("none")
    public final io.reactivex.disposables.c c1(final g<? super T> g) {
        return this.d1(g, io.reactivex.internal.functions.a.f);
    }
    
    @d
    @h("none")
    @f
    public final <R> k0<R> d0(final o<? super T, ? extends q0<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.S((k0<R>)new x(this, (o<? super Object, ? extends q0<?>>)o));
    }
    
    @d
    @h("none")
    @f
    public final io.reactivex.disposables.c d1(final g<? super T> g, final g<? super Throwable> g2) {
        io.reactivex.internal.functions.b.g(g, "onSuccess is null");
        io.reactivex.internal.functions.b.g(g2, "onError is null");
        final io.reactivex.internal.observers.k<Object> k = new io.reactivex.internal.observers.k<Object>((g<? super Object>)g, g2);
        this.c(k);
        return k;
    }
    
    @d
    @h("none")
    @f
    public final io.reactivex.c e0(final o<? super T, ? extends io.reactivex.i> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.O(new y<Object>(this, o));
    }
    
    protected abstract void e1(@f final io.reactivex.n0<? super T> p0);
    
    @d
    @h("none")
    @f
    public final <R> s<R> f0(final o<? super T, ? extends io.reactivex.y<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.Q((s<R>)new io.reactivex.internal.operators.single.b0(this, (o<? super Object, ? extends io.reactivex.y<?>>)o));
    }
    
    @d
    @h("custom")
    @f
    public final k0<T> f1(final j0 j0) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.q0<T>((q0<? extends T>)this, j0));
    }
    
    @d
    @h("none")
    @f
    public final <R> b0<R> g0(final o<? super T, ? extends g0<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<R>)new io.reactivex.internal.operators.mixed.s((q0<Object>)this, (o<? super Object, ? extends g0<?>>)o));
    }
    
    @d
    @h("none")
    public final <E extends io.reactivex.n0<? super T>> E g1(final E e) {
        this.c(e);
        return e;
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> h0(final o<? super T, ? extends b<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.P((l<R>)new c0((q0<Object>)this, (o<? super Object, ? extends o7.b<?>>)o));
    }
    
    @d
    @h("none")
    @f
    public final k0<T> h1(final io.reactivex.i i) {
        io.reactivex.internal.functions.b.g(i, "other is null");
        return this.j1((o7.b<Object>)new io.reactivex.internal.operators.completable.o0(i));
    }
    
    @d
    @h("none")
    @f
    public final k0<T> i(final q0<? extends T> q0) {
        io.reactivex.internal.functions.b.g(q0, "other is null");
        return h(this, q0);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U> l<U> i0(final o<? super T, ? extends Iterable<? extends U>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.P((l<U>)new io.reactivex.internal.operators.single.z((q0<Object>)this, (o<? super Object, ? extends Iterable<?>>)o));
    }
    
    @d
    @h("none")
    @f
    public final <E> k0<T> i1(final q0<? extends E> q0) {
        io.reactivex.internal.functions.b.g(q0, "other is null");
        return this.j1((o7.b<Object>)new u0(q0));
    }
    
    @d
    @h("none")
    public final <R> R j(@f final l0<T, ? extends R> l0) {
        return (R)io.reactivex.internal.functions.b.g(l0, "converter is null").a(this);
    }
    
    @d
    @h("none")
    @f
    public final <U> b0<U> j0(final o<? super T, ? extends Iterable<? extends U>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.R((b0<U>)new io.reactivex.internal.operators.single.a0((q0<Object>)this, (o<? super Object, ? extends Iterable<?>>)o));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <E> k0<T> j1(final b<E> b) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        return io.reactivex.plugins.a.S((k0<T>)new r0((q0<Object>)this, (o7.b<Object>)b));
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
    public final io.reactivex.observers.n<T> k1() {
        final io.reactivex.observers.n<Object> n = new io.reactivex.observers.n<Object>();
        this.c(n);
        return (io.reactivex.observers.n<T>)n;
    }
    
    @d
    @h("none")
    public final io.reactivex.observers.n<T> l1(final boolean b) {
        final io.reactivex.observers.n<Object> n = new io.reactivex.observers.n<Object>();
        if (b) {
            n.cancel();
        }
        this.c(n);
        return (io.reactivex.observers.n<T>)n;
    }
    
    @d
    @h("none")
    public final k0<T> m() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.b<T>((q0<? extends T>)this));
    }
    
    @d
    @h("io.reactivex:computation")
    public final k0<T> m1(final long n, final TimeUnit timeUnit) {
        return this.q1(n, timeUnit, io.reactivex.schedulers.b.a(), null);
    }
    
    @d
    @h("none")
    @f
    public final <U> k0<U> n(final Class<? extends U> clazz) {
        io.reactivex.internal.functions.b.g(clazz, "clazz is null");
        return this.v0((o<? super T, ? extends U>)io.reactivex.internal.functions.a.e((Class<? extends R>)clazz));
    }
    
    @d
    @h("custom")
    public final k0<T> n1(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.q1(n, timeUnit, j0, null);
    }
    
    @d
    @h("none")
    public final <R> k0<R> o(final io.reactivex.r0<? super T, ? extends R> r0) {
        return E1((q0<R>)io.reactivex.internal.functions.b.g(r0, "transformer is null").a(this));
    }
    
    @d
    @h("custom")
    @f
    public final k0<T> o1(final long n, final TimeUnit timeUnit, final j0 j0, final q0<? extends T> q0) {
        io.reactivex.internal.functions.b.g(q0, "other is null");
        return this.q1(n, timeUnit, j0, q0);
    }
    
    @d
    @h("io.reactivex:computation")
    @f
    public final k0<T> p1(final long n, final TimeUnit timeUnit, final q0<? extends T> q0) {
        io.reactivex.internal.functions.b.g(q0, "other is null");
        return this.q1(n, timeUnit, io.reactivex.schedulers.b.a(), q0);
    }
    
    @d
    @h("none")
    public final k0<T> r0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.g0<T>((q0<? extends T>)this));
    }
    
    @d
    @h("none")
    public final io.reactivex.c s0() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.v<Object>(this));
    }
    
    @d
    @h("none")
    public final <R> R t1(final o<? super k0<T>, R> o) {
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
    @h("none")
    @f
    public final <R> k0<R> u0(final io.reactivex.p0<? extends R, ? super T> p) {
        io.reactivex.internal.functions.b.g(p, "lift is null");
        return io.reactivex.plugins.a.S((k0<R>)new io.reactivex.internal.operators.single.j0((q0<Object>)this, (io.reactivex.p0<?, ? super Object>)p));
    }
    
    @d
    @h("none")
    @Deprecated
    public final io.reactivex.c u1() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.v<Object>(this));
    }
    
    @d
    @h("none")
    @f
    public final <R> k0<R> v0(final o<? super T, ? extends R> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.S((k0<R>)new io.reactivex.internal.operators.single.k0(this, (o<? super Object, ?>)o));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> v1() {
        if (this instanceof y5.b) {
            return ((y5.b)this).g();
        }
        return io.reactivex.plugins.a.P(new u0<T>((q0<? extends T>)this));
    }
    
    @d
    @h("none")
    @io.reactivex.annotations.e
    public final k0<a0<T>> w0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.l0((k0<Object>)this));
    }
    
    @d
    @h("none")
    public final Future<T> w1() {
        return this.g1(new io.reactivex.internal.observers.r<T>());
    }
    
    @d
    @h("none")
    public final s<T> x1() {
        if (this instanceof y5.c) {
            return ((y5.c)this).e();
        }
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.n0<T>(this));
    }
    
    @d
    @h("none")
    public final b0<T> y1() {
        if (this instanceof y5.d) {
            return ((y5.d)this).a();
        }
        return io.reactivex.plugins.a.R(new v0<T>((q0<? extends T>)this));
    }
}
