// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex;

import io.reactivex.internal.operators.flowable.l2;
import io.reactivex.internal.operators.flowable.e0;
import io.reactivex.internal.operators.flowable.v1;
import io.reactivex.internal.operators.flowable.g3;
import io.reactivex.internal.operators.flowable.k2;
import io.reactivex.internal.operators.flowable.x4;
import io.reactivex.internal.operators.flowable.c0;
import io.reactivex.internal.operators.flowable.z3;
import io.reactivex.internal.operators.flowable.e3;
import io.reactivex.internal.operators.flowable.f3;
import io.reactivex.internal.operators.flowable.y4;
import io.reactivex.internal.operators.flowable.y3;
import io.reactivex.internal.operators.flowable.u4;
import io.reactivex.internal.operators.flowable.j2;
import io.reactivex.internal.operators.flowable.y0;
import io.reactivex.internal.operators.flowable.x3;
import io.reactivex.internal.operators.flowable.r1;
import io.reactivex.internal.operators.flowable.t4;
import io.reactivex.internal.operators.flowable.p1;
import java.util.Iterator;
import io.reactivex.internal.operators.flowable.o1;
import io.reactivex.internal.operators.flowable.v4;
import io.reactivex.internal.operators.flowable.k4;
import io.reactivex.internal.operators.flowable.h2;
import io.reactivex.internal.operators.flowable.v0;
import java.util.NoSuchElementException;
import io.reactivex.internal.operators.flowable.g2;
import io.reactivex.internal.operators.flowable.n1;
import io.reactivex.internal.operators.flowable.u0;
import io.reactivex.internal.operators.flowable.f2;
import io.reactivex.internal.operators.flowable.j4;
import io.reactivex.internal.operators.flowable.s0;
import io.reactivex.internal.operators.flowable.t;
import io.reactivex.internal.operators.flowable.w4;
import io.reactivex.internal.operators.flowable.s4;
import io.reactivex.internal.operators.flowable.i4;
import io.reactivex.internal.operators.flowable.w3;
import io.reactivex.internal.operators.flowable.d3;
import io.reactivex.internal.operators.flowable.c3;
import io.reactivex.internal.operators.flowable.b3;
import io.reactivex.internal.operators.flowable.u3;
import io.reactivex.internal.operators.flowable.a3;
import io.reactivex.internal.operators.flowable.p0;
import io.reactivex.internal.operators.flowable.q4;
import io.reactivex.internal.operators.flowable.h4;
import io.reactivex.internal.operators.flowable.y2;
import io.reactivex.internal.operators.flowable.w;
import io.reactivex.internal.operators.flowable.g4;
import io.reactivex.internal.operators.flowable.x2;
import io.reactivex.internal.operators.flowable.o0;
import io.reactivex.internal.operators.flowable.f4;
import io.reactivex.internal.operators.flowable.t3;
import io.reactivex.internal.operators.flowable.w2;
import java.util.Comparator;
import io.reactivex.internal.operators.flowable.s3;
import io.reactivex.internal.operators.flowable.r2;
import io.reactivex.internal.operators.flowable.e1;
import io.reactivex.annotations.e;
import io.reactivex.internal.operators.flowable.q3;
import io.reactivex.internal.operators.flowable.e2;
import io.reactivex.internal.operators.flowable.l0;
import io.reactivex.internal.operators.flowable.q;
import io.reactivex.internal.operators.flowable.d4;
import io.reactivex.internal.operators.flowable.r3;
import io.reactivex.internal.operators.flowable.s2;
import io.reactivex.internal.operators.flowable.b2;
import io.reactivex.internal.operators.flowable.c1;
import io.reactivex.internal.operators.flowable.a2;
import io.reactivex.internal.operators.flowable.a5;
import io.reactivex.internal.operators.flowable.o3;
import io.reactivex.internal.operators.flowable.z1;
import io.reactivex.internal.operators.flowable.b4;
import io.reactivex.internal.operators.flowable.c4;
import io.reactivex.internal.operators.flowable.q1;
import io.reactivex.internal.operators.flowable.x1;
import io.reactivex.internal.operators.flowable.f1;
import java.util.Map;
import io.reactivex.internal.operators.flowable.m0;
import io.reactivex.internal.operators.flowable.y1;
import io.reactivex.internal.operators.flowable.a4;
import io.reactivex.internal.operators.flowable.b1;
import java.util.Collection;
import io.reactivex.internal.operators.flowable.l3;
import io.reactivex.internal.operators.flowable.p4;
import io.reactivex.internal.operators.flowable.k3;
import io.reactivex.internal.operators.flowable.q2;
import io.reactivex.internal.operators.flowable.j3;
import io.reactivex.internal.operators.flowable.z0;
import io.reactivex.internal.operators.flowable.p2;
import io.reactivex.internal.operators.flowable.h3;
import io.reactivex.internal.operators.flowable.o2;
import io.reactivex.internal.operators.flowable.g0;
import io.reactivex.internal.operators.flowable.c2;
import io.reactivex.internal.operators.flowable.h0;
import io.reactivex.internal.operators.flowable.i3;
import io.reactivex.internal.operators.flowable.m2;
import io.reactivex.internal.operators.flowable.f0;
import io.reactivex.internal.operators.flowable.n4;
import io.reactivex.internal.operators.flowable.w1;
import io.reactivex.internal.operators.flowable.l4;
import io.reactivex.internal.operators.flowable.m4;
import io.reactivex.internal.operators.flowable.u1;
import io.reactivex.internal.operators.flowable.t1;
import io.reactivex.internal.operators.flowable.x0;
import io.reactivex.internal.operators.flowable.i2;
import io.reactivex.internal.operators.flowable.w0;
import x5.m;
import x5.n;
import io.reactivex.internal.operators.flowable.u;
import io.reactivex.internal.operators.flowable.m1;
import io.reactivex.internal.operators.flowable.r0;
import io.reactivex.internal.operators.flowable.r4;
import x5.g;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.operators.flowable.i1;
import java.util.concurrent.Future;
import io.reactivex.internal.operators.flowable.h1;
import io.reactivex.internal.operators.flowable.l1;
import io.reactivex.internal.operators.flowable.y;
import io.reactivex.internal.operators.flowable.u2;
import io.reactivex.internal.operators.flowable.j1;
import io.reactivex.internal.operators.flowable.t2;
import io.reactivex.internal.operators.flowable.n3;
import io.reactivex.internal.operators.flowable.z4;
import io.reactivex.internal.operators.flowable.x;
import io.reactivex.internal.operators.flowable.g1;
import java.util.List;
import io.reactivex.internal.operators.flowable.s1;
import io.reactivex.internal.operators.flowable.v;
import org.reactivestreams.Publisher;
import x5.c;
import io.reactivex.internal.operators.flowable.i0;
import java.util.concurrent.Callable;
import x5.i;
import x5.j;
import x5.k;
import x5.o;
import io.reactivex.annotations.f;
import io.reactivex.annotations.h;
import io.reactivex.annotations.d;
import io.reactivex.annotations.a;
import o7.b;

public abstract class l<T> implements b<T>
{
    static final int G;
    
    static {
        G = Math.max(1, Integer.getInteger("rx2.buffer-size", 128));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> A3(final T t, final T t2, final T t3) {
        io.reactivex.internal.functions.b.g(t, "item1 is null");
        io.reactivex.internal.functions.b.g(t2, "item2 is null");
        io.reactivex.internal.functions.b.g(t3, "item3 is null");
        return U2(t, t2, t3);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, R> l<R> A8(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final b<? extends T7> b7, final x5.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> l) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        io.reactivex.internal.functions.b.g(b5, "source5 is null");
        io.reactivex.internal.functions.b.g(b6, "source6 is null");
        io.reactivex.internal.functions.b.g(b7, "source7 is null");
        return (l<R>)J8((o)io.reactivex.internal.functions.a.C((x5.l<Object, Object, Object, Object, Object, Object, Object, Object>)l), false, b0(), new b[] { b, b2, b3, b4, b5, b6, b7 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> B0(final Iterable<? extends b<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return a3((Iterable<?>)iterable).c1((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), 2, false);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> B3(final T t, final T t2, final T t3, final T t4) {
        io.reactivex.internal.functions.b.g(t, "item1 is null");
        io.reactivex.internal.functions.b.g(t2, "item2 is null");
        io.reactivex.internal.functions.b.g(t3, "item3 is null");
        io.reactivex.internal.functions.b.g(t4, "item4 is null");
        return U2(t, t2, t3, t4);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, R> l<R> B8(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> k) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        io.reactivex.internal.functions.b.g(b5, "source5 is null");
        io.reactivex.internal.functions.b.g(b6, "source6 is null");
        return (l<R>)J8((o)io.reactivex.internal.functions.a.B((k<Object, Object, Object, Object, Object, Object, Object>)k), false, b0(), new b[] { b, b2, b3, b4, b5, b6 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> C0(final b<? extends b<? extends T>> b) {
        return D0(b, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> C3(final T t, final T t2, final T t3, final T t4, final T t5) {
        io.reactivex.internal.functions.b.g(t, "item1 is null");
        io.reactivex.internal.functions.b.g(t2, "item2 is null");
        io.reactivex.internal.functions.b.g(t3, "item3 is null");
        io.reactivex.internal.functions.b.g(t4, "item4 is null");
        io.reactivex.internal.functions.b.g(t5, "item5 is null");
        return U2(t, t2, t3, t4, t5);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, R> l<R> C8(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> j) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        io.reactivex.internal.functions.b.g(b5, "source5 is null");
        return (l<R>)J8((o)io.reactivex.internal.functions.a.A((j<Object, Object, Object, Object, Object, Object>)j), false, b0(), new b[] { b, b2, b3, b4, b5 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> D0(final b<? extends b<? extends T>> b, final int n) {
        return b3((o7.b<?>)b).V0((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> D3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6) {
        io.reactivex.internal.functions.b.g(t, "item1 is null");
        io.reactivex.internal.functions.b.g(t2, "item2 is null");
        io.reactivex.internal.functions.b.g(t3, "item3 is null");
        io.reactivex.internal.functions.b.g(t4, "item4 is null");
        io.reactivex.internal.functions.b.g(t5, "item5 is null");
        io.reactivex.internal.functions.b.g(t6, "item6 is null");
        return U2(t, t2, t3, t4, t5, t6);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> D6(final b<? extends b<? extends T>> b) {
        return b3((o7.b<?>)b).s6((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, R> l<R> D8(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        return (l<R>)J8((o)io.reactivex.internal.functions.a.z((i<Object, Object, Object, Object, Object>)i), false, b0(), new b[] { b, b2, b3, b4 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> E0(final b<? extends T> b, final b<? extends T> b2) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        return (l<T>)H0(new b[] { b, b2 });
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public static <T> l<T> E1(final Callable<? extends b<? extends T>> callable) {
        io.reactivex.internal.functions.b.g(callable, "supplier is null");
        return io.reactivex.plugins.a.P(new i0<T>(callable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> E3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7) {
        io.reactivex.internal.functions.b.g(t, "item1 is null");
        io.reactivex.internal.functions.b.g(t2, "item2 is null");
        io.reactivex.internal.functions.b.g(t3, "item3 is null");
        io.reactivex.internal.functions.b.g(t4, "item4 is null");
        io.reactivex.internal.functions.b.g(t5, "item5 is null");
        io.reactivex.internal.functions.b.g(t6, "item6 is null");
        io.reactivex.internal.functions.b.g(t7, "item7 is null");
        return U2(t, t2, t3, t4, t5, t6, t7);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> E6(final b<? extends b<? extends T>> b, final int n) {
        return b3((o7.b<?>)b).t6((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, R> l<R> E8(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final x5.h<? super T1, ? super T2, ? super T3, ? extends R> h) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        return (l<R>)J8((o)io.reactivex.internal.functions.a.y((x5.h<Object, Object, Object, Object>)h), false, b0(), new b[] { b, b2, b3 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> F0(final b<? extends T> b, final b<? extends T> b2, final b<? extends T> b3) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        return (l<T>)H0(new b[] { b, b2, b3 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> F3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8) {
        io.reactivex.internal.functions.b.g(t, "item1 is null");
        io.reactivex.internal.functions.b.g(t2, "item2 is null");
        io.reactivex.internal.functions.b.g(t3, "item3 is null");
        io.reactivex.internal.functions.b.g(t4, "item4 is null");
        io.reactivex.internal.functions.b.g(t5, "item5 is null");
        io.reactivex.internal.functions.b.g(t6, "item6 is null");
        io.reactivex.internal.functions.b.g(t7, "item7 is null");
        io.reactivex.internal.functions.b.g(t8, "item8 is null");
        return U2(t, t2, t3, t4, t5, t6, t7, t8);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> F6(final b<? extends b<? extends T>> b) {
        return G6(b, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, R> l<R> F8(final b<? extends T1> b, final b<? extends T2> b2, final c<? super T1, ? super T2, ? extends R> c) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        return (l<R>)J8((o)io.reactivex.internal.functions.a.x((c<? super Object, ? super Object, ?>)c), false, b0(), new b[] { b, b2 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> G0(final b<? extends T> b, final b<? extends T> b2, final b<? extends T> b3, final b<? extends T> b4) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        return (l<T>)H0(new b[] { b, b2, b3, b4 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> G3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8, final T t9) {
        io.reactivex.internal.functions.b.g(t, "item1 is null");
        io.reactivex.internal.functions.b.g(t2, "item2 is null");
        io.reactivex.internal.functions.b.g(t3, "item3 is null");
        io.reactivex.internal.functions.b.g(t4, "item4 is null");
        io.reactivex.internal.functions.b.g(t5, "item5 is null");
        io.reactivex.internal.functions.b.g(t6, "item6 is null");
        io.reactivex.internal.functions.b.g(t7, "item7 is null");
        io.reactivex.internal.functions.b.g(t8, "item8 is null");
        io.reactivex.internal.functions.b.g(t9, "item9 is null");
        return U2(t, t2, t3, t4, t5, t6, t7, t8, t9);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> G6(final b<? extends b<? extends T>> b, final int n) {
        return b3((o7.b<?>)b).y6((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, R> l<R> G8(final b<? extends T1> b, final b<? extends T2> b2, final c<? super T1, ? super T2, ? extends R> c, final boolean b3) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        return (l<R>)J8((o)io.reactivex.internal.functions.a.x((c<? super Object, ? super Object, ?>)c), b3, b0(), new b[] { b, b2 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> H0(final Publisher<? extends T>... array) {
        if (array.length == 0) {
            return n2();
        }
        if (array.length == 1) {
            return b3((o7.b<? extends T>)array[0]);
        }
        return io.reactivex.plugins.a.P(new v<T>((b[])array, false));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> H3(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8, final T t9, final T t10) {
        io.reactivex.internal.functions.b.g(t, "item1 is null");
        io.reactivex.internal.functions.b.g(t2, "item2 is null");
        io.reactivex.internal.functions.b.g(t3, "item3 is null");
        io.reactivex.internal.functions.b.g(t4, "item4 is null");
        io.reactivex.internal.functions.b.g(t5, "item5 is null");
        io.reactivex.internal.functions.b.g(t6, "item6 is null");
        io.reactivex.internal.functions.b.g(t7, "item7 is null");
        io.reactivex.internal.functions.b.g(t8, "item8 is null");
        io.reactivex.internal.functions.b.g(t9, "item9 is null");
        io.reactivex.internal.functions.b.g(t10, "item10 is null");
        return U2(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> k0<Boolean> H5(final b<? extends T> b, final b<? extends T> b2) {
        return K5((o7.b<?>)b, (o7.b<?>)b2, (x5.d<? super Object, ? super Object>)io.reactivex.internal.functions.b.d(), b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, R> l<R> H8(final b<? extends T1> b, final b<? extends T2> b2, final c<? super T1, ? super T2, ? extends R> c, final boolean b3, final int n) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        return (l<R>)J8((o)io.reactivex.internal.functions.a.x((c<? super Object, ? super Object, ?>)c), b3, n, new b[] { b, b2 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> I0(final Publisher<? extends T>... array) {
        if (array.length == 0) {
            return n2();
        }
        if (array.length == 1) {
            return b3((o7.b<? extends T>)array[0]);
        }
        return io.reactivex.plugins.a.P(new v<T>((b[])array, true));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> k0<Boolean> I5(final b<? extends T> b, final b<? extends T> b2, final int n) {
        return K5((o7.b<?>)b, (o7.b<?>)b2, (x5.d<? super Object, ? super Object>)io.reactivex.internal.functions.b.d(), n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T, R> l<R> I8(final b<? extends b<? extends T>> b, final o<? super Object[], ? extends R> o) {
        io.reactivex.internal.functions.b.g(o, "zipper is null");
        return b3((o7.b<?>)b).F7().h0((o<? super List<Object>, ? extends o7.b<? extends R>>)s1.n((o<? super Object[], ?>)o));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> J0(final int n, final int n2, final Publisher<? extends T>... array) {
        io.reactivex.internal.functions.b.g(array, "sources is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        io.reactivex.internal.functions.b.h(n2, "prefetch");
        return io.reactivex.plugins.a.P((l<T>)new x(new g1<Object>(array), (o<? super Object, ? extends o7.b<?>>)io.reactivex.internal.functions.a.k(), n, n2, io.reactivex.internal.util.j.G));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> k0<Boolean> J5(final b<? extends T> b, final b<? extends T> b2, final x5.d<? super T, ? super T> d) {
        return K5((o7.b<?>)b, (o7.b<?>)b2, (x5.d<? super Object, ? super Object>)d, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T, R> l<R> J8(final o<? super Object[], ? extends R> o, final boolean b, final int n, final Publisher<? extends T>... array) {
        if (array.length == 0) {
            return n2();
        }
        io.reactivex.internal.functions.b.g(o, "zipper is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return io.reactivex.plugins.a.P((l<R>)new z4((b[])array, (Iterable)null, (o)o, n, b));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> K0(final Publisher<? extends T>... array) {
        return (l<T>)J0(b0(), b0(), (b[])array);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> k0<Boolean> K5(final b<? extends T> b, final b<? extends T> b2, final x5.d<? super T, ? super T> d, final int n) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(d, "isEqual is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return io.reactivex.plugins.a.S((k0<Boolean>)new n3<Object>(b, b2, d, n));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T, R> l<R> K8(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o, final boolean b, final int n) {
        io.reactivex.internal.functions.b.g(o, "zipper is null");
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return io.reactivex.plugins.a.P((l<R>)new z4((b[])null, (Iterable)iterable, (o)o, n, b));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> L0(final int n, final int n2, final Publisher<? extends T>... array) {
        return U2(array).f1((o<? super Publisher<? extends T>, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), n, n2, true);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> M0(final Publisher<? extends T>... array) {
        return (l<T>)L0(b0(), b0(), (b[])array);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> N0(final Iterable<? extends b<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return a3((Iterable<?>)iterable).b1((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> O0(final b<? extends b<? extends T>> b) {
        return P0(b, b0(), true);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> P0(final b<? extends b<? extends T>> b, final int n, final boolean b2) {
        return b3((o7.b<?>)b).c1((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), n, b2);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> P3(final Iterable<? extends b<? extends T>> iterable) {
        return a3((Iterable<?>)iterable).u2((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> Q0(final Iterable<? extends b<? extends T>> iterable) {
        return R0(iterable, b0(), b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> Q3(final Iterable<? extends b<? extends T>> iterable, final int n) {
        return a3((Iterable<?>)iterable).v2((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static l<Integer> Q4(final int i, final int j) {
        if (j < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        if (j == 0) {
            return n2();
        }
        if (j == 1) {
            return y3(i);
        }
        if (i + (long)(j - 1) <= 2147483647L) {
            return io.reactivex.plugins.a.P((l<Integer>)new t2(i, j));
        }
        throw new IllegalArgumentException("Integer overflow");
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> R0(final Iterable<? extends b<? extends T>> iterable, final int n, final int n2) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        io.reactivex.internal.functions.b.h(n2, "prefetch");
        return io.reactivex.plugins.a.P((l<T>)new x(new j1<Object>(iterable), (o<? super Object, ? extends o7.b<?>>)io.reactivex.internal.functions.a.k(), n, n2, io.reactivex.internal.util.j.G));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> R3(final Iterable<? extends b<? extends T>> iterable, final int n, final int n2) {
        return a3((Iterable<?>)iterable).F2((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), false, n, n2);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static l<Long> R4(final long l, final long lng) {
        final long n = lcmp(lng, 0L);
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n == 0) {
            return n2();
        }
        if (lng == 1L) {
            return y3(l);
        }
        if (l > 0L && lng - 1L + l < 0L) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        return io.reactivex.plugins.a.P((l<Long>)new u2(l, lng));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> S0(final b<? extends b<? extends T>> b) {
        return T0(b, b0(), b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> S3(final b<? extends b<? extends T>> b) {
        return T3(b, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> T0(final b<? extends b<? extends T>> b, final int n, final int n2) {
        io.reactivex.internal.functions.b.g(b, "sources is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        io.reactivex.internal.functions.b.h(n2, "prefetch");
        return io.reactivex.plugins.a.P((l<T>)new y((o7.b<Object>)b, (o<? super Object, ? extends o7.b<?>>)io.reactivex.internal.functions.a.k(), n, n2, io.reactivex.internal.util.j.G));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> T3(final b<? extends b<? extends T>> b, final int n) {
        return b3((o7.b<?>)b).v2((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> U2(final T... array) {
        io.reactivex.internal.functions.b.g(array, "items is null");
        if (array.length == 0) {
            return n2();
        }
        if (array.length == 1) {
            return y3(array[0]);
        }
        return io.reactivex.plugins.a.P(new g1<T>(array));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> U3(final b<? extends T> b, final b<? extends T> b2) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        return U2(b, b2).E2((o<? super b, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), false, 2);
    }
    
    @io.reactivex.annotations.b(a.L)
    @d
    @h("none")
    @f
    public static <T> l<T> U7(final b<T> b) {
        io.reactivex.internal.functions.b.g(b, "onSubscribe is null");
        if (!(b instanceof l)) {
            return io.reactivex.plugins.a.P(new l1<T>((o7.b<? extends T>)b));
        }
        throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> V2(final Callable<? extends T> callable) {
        io.reactivex.internal.functions.b.g(callable, "supplier is null");
        return io.reactivex.plugins.a.P(new h1<T>(callable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> V3(final b<? extends T> b, final b<? extends T> b2, final b<? extends T> b3) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        return U2(b, b2, b3).E2((o<? super b, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), false, 3);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> W2(final Future<? extends T> future) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        return io.reactivex.plugins.a.P(new i1<T>(future, 0L, null));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> W3(final b<? extends T> b, final b<? extends T> b2, final b<? extends T> b3, final b<? extends T> b4) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        return U2(b, b2, b3, b4).E2((o<? super b, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), false, 4);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public static <T, D> l<T> W7(final Callable<? extends D> callable, final o<? super D, ? extends b<? extends T>> o, final g<? super D> g) {
        return X7((Callable<?>)callable, (o<? super Object, ? extends o7.b<? extends T>>)o, (g<? super Object>)g, true);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> X2(final Future<? extends T> future, final long n, final TimeUnit timeUnit) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.P(new i1<T>(future, n, timeUnit));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> X3(final int n, final int n2, final Publisher<? extends T>... array) {
        return U2(array).F2((o<? super Publisher<? extends T>, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), false, n, n2);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public static <T, D> l<T> X7(final Callable<? extends D> callable, final o<? super D, ? extends b<? extends T>> o, final g<? super D> g, final boolean b) {
        io.reactivex.internal.functions.b.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.b.g(o, "sourceSupplier is null");
        io.reactivex.internal.functions.b.g(g, "resourceDisposer is null");
        return io.reactivex.plugins.a.P((l<T>)new r4(callable, (o<? super Object, ? extends o7.b<?>>)o, (g<? super Object>)g, b));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    @f
    public static <T> l<T> Y2(final Future<? extends T> future, final long n, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return X2(future, n, timeUnit).o6(j0);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> Y3(final Publisher<? extends T>... array) {
        return U2(array).v2((o<? super Publisher<? extends T>, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), array.length);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    @f
    public static <T> l<T> Z2(final Future<? extends T> future, final j0 j0) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return W2(future).o6(j0);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> Z3(final int n, final int n2, final Publisher<? extends T>... array) {
        return U2(array).F2((o<? super Publisher<? extends T>, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), true, n, n2);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> a3(final Iterable<? extends T> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "source is null");
        return io.reactivex.plugins.a.P(new j1<T>(iterable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> a4(final Publisher<? extends T>... array) {
        return U2(array).E2((o<? super Publisher<? extends T>, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), true, array.length);
    }
    
    public static int b0() {
        return l.G;
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public static <T> l<T> b3(final b<? extends T> b) {
        if (b instanceof l) {
            return io.reactivex.plugins.a.P((l<T>)b);
        }
        io.reactivex.internal.functions.b.g((l<T>)b, "source is null");
        return io.reactivex.plugins.a.P(new l1<T>(b));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> b4(final Iterable<? extends b<? extends T>> iterable) {
        return a3((Iterable<?>)iterable).D2((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), true);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public static <T> l<T> c(final Iterable<? extends b<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.h<T>((b[])null, (Iterable)iterable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T, S> l<T> c3(final Callable<S> callable, final x5.b<S, io.reactivex.k<T>> b) {
        io.reactivex.internal.functions.b.g(b, "generator is null");
        return f3(callable, (c<S, io.reactivex.k<T>, S>)s1.i((x5.b<S, io.reactivex.k<T>>)b), io.reactivex.internal.functions.a.h());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> c4(final Iterable<? extends b<? extends T>> iterable, final int n) {
        return a3((Iterable<?>)iterable).E2((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), true, n);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    private l<T> d2(final g<? super T> g, final g<? super Throwable> g2, final x5.a a, final x5.a a2) {
        io.reactivex.internal.functions.b.g(g, "onNext is null");
        io.reactivex.internal.functions.b.g(g2, "onError is null");
        io.reactivex.internal.functions.b.g(a, "onComplete is null");
        io.reactivex.internal.functions.b.g(a2, "onAfterTerminate is null");
        return io.reactivex.plugins.a.P(new r0((l<Object>)this, (g<? super Object>)g, g2, a, a2));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T, S> l<T> d3(final Callable<S> callable, final x5.b<S, io.reactivex.k<T>> b, final g<? super S> g) {
        io.reactivex.internal.functions.b.g(b, "generator is null");
        return f3(callable, (c<S, io.reactivex.k<T>, S>)s1.i((x5.b<S, io.reactivex.k<T>>)b), g);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> d4(final Iterable<? extends b<? extends T>> iterable, final int n, final int n2) {
        return a3((Iterable<?>)iterable).F2((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), true, n, n2);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T, S> l<T> e3(final Callable<S> callable, final c<S, io.reactivex.k<T>, S> c) {
        return f3(callable, c, io.reactivex.internal.functions.a.h());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> e4(final b<? extends b<? extends T>> b) {
        return f4(b, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T, S> l<T> f3(final Callable<S> callable, final c<S, io.reactivex.k<T>, S> c, final g<? super S> g) {
        io.reactivex.internal.functions.b.g(callable, "initialState is null");
        io.reactivex.internal.functions.b.g(c, "generator is null");
        io.reactivex.internal.functions.b.g(g, "disposeState is null");
        return io.reactivex.plugins.a.P((l<T>)new m1((Callable<Object>)callable, (c<Object, io.reactivex.k<Object>, Object>)c, (g<? super Object>)g));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T> l<T> f4(final b<? extends b<? extends T>> b, final int n) {
        return b3((o7.b<?>)b).E2((o<? super Object, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), true, n);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public static <T> l<T> g(final Publisher<? extends T>... array) {
        io.reactivex.internal.functions.b.g(array, "sources is null");
        final int length = array.length;
        if (length == 0) {
            return n2();
        }
        if (length == 1) {
            return b3((o7.b<? extends T>)array[0]);
        }
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.h<T>((b[])array, (Iterable)null));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> g3(final g<io.reactivex.k<T>> g) {
        io.reactivex.internal.functions.b.g(g, "generator is null");
        return f3(io.reactivex.internal.functions.a.u(), (c<Object, io.reactivex.k<T>, Object>)s1.j((g<io.reactivex.k<T>>)g), io.reactivex.internal.functions.a.h());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> g4(final b<? extends T> b, final b<? extends T> b2) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        return U2(b, b2).E2((o<? super b, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), true, 2);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T, R> l<R> h0(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        return i0((Iterable<? extends o7.b<?>>)iterable, o, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> h4(final b<? extends T> b, final b<? extends T> b2, final b<? extends T> b3) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        return U2(b, b2, b3).E2((o<? super b, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), true, 3);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T, R> l<R> i0(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o, final int n) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        io.reactivex.internal.functions.b.g(o, "combiner is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return io.reactivex.plugins.a.P((l<R>)new u(iterable, o, n, false));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> i4(final b<? extends T> b, final b<? extends T> b2, final b<? extends T> b3, final b<? extends T> b4) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        return U2(b, b2, b3, b4).E2((o<? super b, ? extends o7.b<? extends T>>)io.reactivex.internal.functions.a.k(), true, 4);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l<R> j0(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final b<? extends T7> b7, final b<? extends T8> b8, final b<? extends T9> b9, final n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> n) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        io.reactivex.internal.functions.b.g(b5, "source5 is null");
        io.reactivex.internal.functions.b.g(b6, "source6 is null");
        io.reactivex.internal.functions.b.g(b7, "source7 is null");
        io.reactivex.internal.functions.b.g(b8, "source8 is null");
        io.reactivex.internal.functions.b.g(b9, "source9 is null");
        return (l<R>)r0((o)io.reactivex.internal.functions.a.E((n<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object>)n), new b[] { b, b2, b3, b4, b5, b6, b7, b8, b9 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l<R> k0(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final b<? extends T7> b7, final b<? extends T8> b8, final m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> m) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        io.reactivex.internal.functions.b.g(b5, "source5 is null");
        io.reactivex.internal.functions.b.g(b6, "source6 is null");
        io.reactivex.internal.functions.b.g(b7, "source7 is null");
        io.reactivex.internal.functions.b.g(b8, "source8 is null");
        return (l<R>)r0((o)io.reactivex.internal.functions.a.D((m<Object, Object, Object, Object, Object, Object, Object, Object, Object>)m), new b[] { b, b2, b3, b4, b5, b6, b7, b8 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, R> l<R> l0(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final b<? extends T7> b7, final x5.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> l) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        io.reactivex.internal.functions.b.g(b5, "source5 is null");
        io.reactivex.internal.functions.b.g(b6, "source6 is null");
        io.reactivex.internal.functions.b.g(b7, "source7 is null");
        return (l<R>)r0((o)io.reactivex.internal.functions.a.C((x5.l<Object, Object, Object, Object, Object, Object, Object, Object>)l), new b[] { b, b2, b3, b4, b5, b6, b7 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, R> l<R> m0(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> k) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        io.reactivex.internal.functions.b.g(b5, "source5 is null");
        io.reactivex.internal.functions.b.g(b6, "source6 is null");
        return (l<R>)r0((o)io.reactivex.internal.functions.a.B((k<Object, Object, Object, Object, Object, Object, Object>)k), new b[] { b, b2, b3, b4, b5, b6 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, R> l<R> n0(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> j) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        io.reactivex.internal.functions.b.g(b5, "source5 is null");
        return (l<R>)r0((o)io.reactivex.internal.functions.a.A((j<Object, Object, Object, Object, Object, Object>)j), new b[] { b, b2, b3, b4, b5 });
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public static <T> l<T> n2() {
        return io.reactivex.plugins.a.P((l<T>)w0.H);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public static <T> l<T> n4() {
        return io.reactivex.plugins.a.P((l<T>)i2.H);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, R> l<R> o0(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        return (l<R>)r0((o)io.reactivex.internal.functions.a.z((i<Object, Object, Object, Object, Object>)i), new b[] { b, b2, b3, b4 });
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public static <T> l<T> o2(final Throwable t) {
        io.reactivex.internal.functions.b.g(t, "throwable is null");
        return p2(io.reactivex.internal.functions.a.m(t));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, R> l<R> p0(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final x5.h<? super T1, ? super T2, ? super T3, ? extends R> h) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        return (l<R>)r0((o)io.reactivex.internal.functions.a.y((x5.h<Object, Object, Object, Object>)h), new b[] { b, b2, b3 });
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public static <T> l<T> p2(final Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.b.g(callable, "supplier is null");
        return io.reactivex.plugins.a.P(new x0<T>(callable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T1, T2, R> l<R> q0(final b<? extends T1> b, final b<? extends T2> b2, final c<? super T1, ? super T2, ? extends R> c) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        return (l<R>)r0((o)io.reactivex.internal.functions.a.x((c<? super Object, ? super Object, ?>)c), new b[] { b, b2 });
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public static l<Long> q3(final long n, final long n2, final TimeUnit timeUnit) {
        return r3(n, n2, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T, R> l<R> r0(final o<? super Object[], ? extends R> o, final Publisher<? extends T>... array) {
        return (l<R>)t0((b[])array, (o)o, b0());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    @f
    public static l<Long> r3(final long b, final long b2, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P((l<Long>)new t1(Math.max(0L, b), Math.max(0L, b2), timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T, R> l<R> s0(final Publisher<? extends T>[] array, final o<? super Object[], ? extends R> o) {
        return (l<R>)t0((b[])array, (o)o, b0());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public static l<Long> s3(final long n, final TimeUnit timeUnit) {
        return r3(n, n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T, R> l<R> t0(final Publisher<? extends T>[] array, final o<? super Object[], ? extends R> o, final int n) {
        io.reactivex.internal.functions.b.g(array, "sources is null");
        if (array.length == 0) {
            return n2();
        }
        io.reactivex.internal.functions.b.g(o, "combiner is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return io.reactivex.plugins.a.P((l<R>)new u((b[])array, (o)o, n, false));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    public static l<Long> t3(final long n, final TimeUnit timeUnit, final j0 j0) {
        return r3(n, n, timeUnit, j0);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T, R> l<R> u0(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        return v0((Iterable<? extends o7.b<?>>)iterable, o, b0());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public static l<Long> u3(final long n, final long n2, final long n3, final long n4, final TimeUnit timeUnit) {
        return v3(n, n2, n3, n4, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T, R> l<R> v0(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o, final int n) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        io.reactivex.internal.functions.b.g(o, "combiner is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return io.reactivex.plugins.a.P((l<R>)new u(iterable, o, n, true));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    @f
    public static l<Long> v3(final long n, long lng, final long b, final long b2, final TimeUnit timeUnit, final j0 j0) {
        final long n2 = lcmp(lng, 0L);
        if (n2 < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n2 == 0) {
            return n2().G1(b, timeUnit, j0);
        }
        lng = n + (lng - 1L);
        if (n > 0L && lng < 0L) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P((l<Long>)new u1(n, lng, Math.max(0L, b), Math.max(0L, b2), timeUnit, j0));
    }
    
    private l<T> v7(final long n, final TimeUnit timeUnit, final b<? extends T> b, final j0 j0) {
        io.reactivex.internal.functions.b.g(timeUnit, "timeUnit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P(new m4((l<Object>)this, n, timeUnit, j0, b));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T, R> l<R> w0(final o<? super Object[], ? extends R> o, final int n, final Publisher<? extends T>... array) {
        return (l<R>)z0((b[])array, (o)o, n);
    }
    
    private <U, V> l<T> w7(final b<U> b, final o<? super T, ? extends b<V>> o, final b<? extends T> b2) {
        io.reactivex.internal.functions.b.g(o, "itemTimeoutIndicator is null");
        return io.reactivex.plugins.a.P((l<T>)new l4((l<Object>)this, (o7.b<Object>)b, (o<? super Object, ? extends o7.b<Object>>)o, b2));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T, R> l<R> x0(final o<? super Object[], ? extends R> o, final Publisher<? extends T>... array) {
        return (l<R>)z0((b[])array, (o)o, b0());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public static l<Long> x7(final long n, final TimeUnit timeUnit) {
        return y7(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T, R> l<R> x8(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        io.reactivex.internal.functions.b.g(o, "zipper is null");
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.P((l<R>)new z4((b[])null, (Iterable)iterable, (o)o, b0(), false));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public static <T, R> l<R> y0(final Publisher<? extends T>[] array, final o<? super Object[], ? extends R> o) {
        return (l<R>)z0((b[])array, (o)o, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> y3(final T t) {
        io.reactivex.internal.functions.b.g(t, "item is null");
        return io.reactivex.plugins.a.P(new w1<T>(t));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    @f
    public static l<Long> y7(final long b, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P((l<Long>)new n4(Math.max(0L, b), timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l<R> y8(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final b<? extends T7> b7, final b<? extends T8> b8, final b<? extends T9> b9, final n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> n) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        io.reactivex.internal.functions.b.g(b5, "source5 is null");
        io.reactivex.internal.functions.b.g(b6, "source6 is null");
        io.reactivex.internal.functions.b.g(b7, "source7 is null");
        io.reactivex.internal.functions.b.g(b8, "source8 is null");
        io.reactivex.internal.functions.b.g(b9, "source9 is null");
        return (l<R>)J8((o)io.reactivex.internal.functions.a.E((n<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object>)n), false, b0(), new b[] { b, b2, b3, b4, b5, b6, b7, b8, b9 });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T, R> l<R> z0(final Publisher<? extends T>[] array, final o<? super Object[], ? extends R> o, final int n) {
        io.reactivex.internal.functions.b.g(array, "sources is null");
        io.reactivex.internal.functions.b.g(o, "combiner is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        if (array.length == 0) {
            return n2();
        }
        return io.reactivex.plugins.a.P((l<R>)new u((b[])array, (o)o, n, true));
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    @f
    public static <T> l<T> z1(final io.reactivex.o<T> o, final io.reactivex.b b) {
        io.reactivex.internal.functions.b.g(o, "source is null");
        io.reactivex.internal.functions.b.g(b, "mode is null");
        return io.reactivex.plugins.a.P(new f0<T>(o, b));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T> l<T> z3(final T t, final T t2) {
        io.reactivex.internal.functions.b.g(t, "item1 is null");
        io.reactivex.internal.functions.b.g(t2, "item2 is null");
        return U2(t, t2);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l<R> z8(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final b<? extends T7> b7, final b<? extends T8> b8, final m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> m) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        io.reactivex.internal.functions.b.g(b5, "source5 is null");
        io.reactivex.internal.functions.b.g(b6, "source6 is null");
        io.reactivex.internal.functions.b.g(b7, "source7 is null");
        io.reactivex.internal.functions.b.g(b8, "source8 is null");
        return (l<R>)J8((o)io.reactivex.internal.functions.a.D((m<Object, Object, Object, Object, Object, Object, Object, Object, Object>)m), false, b0(), new b[] { b, b2, b3, b4, b5, b6, b7, b8 });
    }
    
    @io.reactivex.annotations.b(a.I)
    @h("none")
    public final void A(final o7.c<? super T> c) {
        io.reactivex.internal.operators.flowable.l.b((o7.b<?>)this, (o7.c<? super Object>)c);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final <R> l<R> A0(final r<? super T, ? extends R> r) {
        return b3(io.reactivex.internal.functions.b.g(r, "composer is null").a(this));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<T> A1(final long n, final TimeUnit timeUnit) {
        return this.B1(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U, R> l<R> A2(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b, final int n, final int n2) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.g(c, "combiner is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        io.reactivex.internal.functions.b.h(n2, "bufferSize");
        return this.F2((o<? super T, ? extends o7.b<? extends R>>)s1.b((o<? super T, ? extends o7.b<?>>)o, (c<? super T, ? super Object, ?>)c), b, n, n2);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final l<T> A4() {
        return io.reactivex.plugins.a.P(new m2((l<Object>)this));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    @f
    public final l<T> A5(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P(new i3((l<Object>)this, n, timeUnit, j0, b));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <R> l<R> A6(@f final o<? super T, ? extends io.reactivex.y<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.P((l<R>)new io.reactivex.internal.operators.mixed.g((l<Object>)this, (o<? super Object, ? extends io.reactivex.y<?>>)o, true));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<io.reactivex.schedulers.d<T>> A7(final j0 j0) {
        return this.C7(TimeUnit.MILLISECONDS, j0);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    @f
    public final l<T> B1(final long n, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P(new h0((l<Object>)this, n, timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> B2(final o<? super T, ? extends b<? extends R>> o, final o<? super Throwable, ? extends b<? extends R>> o2, final Callable<? extends b<? extends R>> callable) {
        io.reactivex.internal.functions.b.g(o, "onNextMapper is null");
        io.reactivex.internal.functions.b.g(o2, "onErrorMapper is null");
        io.reactivex.internal.functions.b.g(callable, "onCompleteSupplier is null");
        return S3((o7.b<? extends o7.b<? extends R>>)new c2((l<Object>)this, (o<? super Object, ?>)o, o2, callable));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final l<T> B4(final g<? super T> g) {
        io.reactivex.internal.functions.b.g(g, "onDrop is null");
        return io.reactivex.plugins.a.P(new m2((l<Object>)this, (g<? super Object>)g));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<T> B5(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.A5(n, timeUnit, io.reactivex.schedulers.b.a(), b);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <R> l<R> B6(@f final o<? super T, ? extends q0<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.P((l<R>)new io.reactivex.internal.operators.mixed.h((l<Object>)this, (o<? super Object, ? extends q0<?>>)o, false));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<io.reactivex.schedulers.d<T>> B7(final TimeUnit timeUnit) {
        return this.C7(timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.J)
    @h("none")
    public final void C(final g<? super T> g) {
        io.reactivex.internal.operators.flowable.l.c((o7.b<?>)this, (g<? super Object>)g, (g<? super Throwable>)io.reactivex.internal.functions.a.f, io.reactivex.internal.functions.a.c);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    @f
    public final <U> l<T> C1(final o<? super T, ? extends b<U>> o) {
        io.reactivex.internal.functions.b.g(o, "debounceIndicator is null");
        return io.reactivex.plugins.a.P((l<T>)new g0((l<Object>)this, (o<? super Object, ? extends o7.b<Object>>)o));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> C2(final o<? super T, ? extends b<? extends R>> o, final o<Throwable, ? extends b<? extends R>> o2, final Callable<? extends b<? extends R>> callable, final int n) {
        io.reactivex.internal.functions.b.g(o, "onNextMapper is null");
        io.reactivex.internal.functions.b.g(o2, "onErrorMapper is null");
        io.reactivex.internal.functions.b.g(callable, "onCompleteSupplier is null");
        return T3((o7.b<? extends o7.b<? extends R>>)new c2((l<Object>)this, (o<? super Object, ?>)o, o2, callable), n);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final l<T> C4() {
        return io.reactivex.plugins.a.P(new o2((l<Object>)this));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    @f
    public final <U> l<T> C5(final b<U> b) {
        io.reactivex.internal.functions.b.g(b, "sampler is null");
        return io.reactivex.plugins.a.P(new h3<T>((o7.b<T>)this, b, false));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <R> l<R> C6(@f final o<? super T, ? extends q0<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.P((l<R>)new io.reactivex.internal.operators.mixed.h((l<Object>)this, (o<? super Object, ? extends q0<?>>)o, true));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final l<io.reactivex.schedulers.d<T>> C7(final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return this.N3((o<? super T, ? extends io.reactivex.schedulers.d<T>>)io.reactivex.internal.functions.a.w(timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @h("none")
    public final void D(final g<? super T> g, final int n) {
        io.reactivex.internal.operators.flowable.l.d((o7.b<?>)this, (g<? super Object>)g, (g<? super Throwable>)io.reactivex.internal.functions.a.f, io.reactivex.internal.functions.a.c, n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> D1(final T t) {
        io.reactivex.internal.functions.b.g(t, "defaultItem is null");
        return this.r6((b<? extends T>)y3(t));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> D2(final o<? super T, ? extends b<? extends R>> o, final boolean b) {
        return this.F2(o, b, b0(), b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> D4(final b<? extends T> b) {
        io.reactivex.internal.functions.b.g(b, "next is null");
        return this.E4(io.reactivex.internal.functions.a.n(b));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    @f
    public final <U> l<T> D5(final b<U> b, final boolean b2) {
        io.reactivex.internal.functions.b.g(b, "sampler is null");
        return io.reactivex.plugins.a.P(new h3<T>((o7.b<T>)this, b, b2));
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    public final <R> R D7(final o<? super l<T>, R> o) {
        try {
            return io.reactivex.internal.functions.b.g(o, "converter is null").apply(this);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            throw io.reactivex.internal.util.k.f(t);
        }
    }
    
    @io.reactivex.annotations.b(a.J)
    @h("none")
    public final void E(final g<? super T> g, final g<? super Throwable> g2) {
        io.reactivex.internal.operators.flowable.l.c((o7.b<?>)this, (g<? super Object>)g, g2, io.reactivex.internal.functions.a.c);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> E2(final o<? super T, ? extends b<? extends R>> o, final boolean b, final int n) {
        return this.F2(o, b, n, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> E4(final o<? super Throwable, ? extends b<? extends T>> o) {
        io.reactivex.internal.functions.b.g(o, "resumeFunction is null");
        return io.reactivex.plugins.a.P(new p2((l<Object>)this, o, false));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> E5(final R r, final c<R, ? super T, R> c) {
        io.reactivex.internal.functions.b.g(r, "initialValue is null");
        return this.G5((Callable<R>)io.reactivex.internal.functions.a.m((R)r), c);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final Future<T> E7() {
        return this.q6(new io.reactivex.internal.subscribers.j<T>());
    }
    
    @io.reactivex.annotations.b(a.H)
    @h("none")
    public final void F(final g<? super T> g, final g<? super Throwable> g2, final int n) {
        io.reactivex.internal.operators.flowable.l.d((o7.b<?>)this, (g<? super Object>)g, g2, io.reactivex.internal.functions.a.c, n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("io.reactivex:computation")
    public final l<T> F1(final long n, final TimeUnit timeUnit) {
        return this.H1(n, timeUnit, io.reactivex.schedulers.b.a(), false);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> F2(final o<? super T, ? extends b<? extends R>> o, final boolean b, final int n, final int n2) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        io.reactivex.internal.functions.b.h(n2, "bufferSize");
        if (!(this instanceof y5.m)) {
            return io.reactivex.plugins.a.P((l<R>)new z0((l<Object>)this, (o<? super Object, ? extends o7.b<?>>)o, b, n, n2));
        }
        final Object call = ((y5.m)this).call();
        if (call == null) {
            return n2();
        }
        return (l<R>)j3.a(call, (o<? super Object, ? extends o7.b<?>>)o);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> F4(final o<? super Throwable, ? extends T> o) {
        io.reactivex.internal.functions.b.g(o, "valueSupplier is null");
        return io.reactivex.plugins.a.P(new q2((l<Object>)this, o));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> F5(final c<T, T, T> c) {
        io.reactivex.internal.functions.b.g(c, "accumulator is null");
        return io.reactivex.plugins.a.P(new k3((l<Object>)this, (c<Object, Object, Object>)c));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final k0<List<T>> F7() {
        return io.reactivex.plugins.a.S((k0<List<T>>)new p4((l<Object>)this));
    }
    
    @io.reactivex.annotations.b(a.J)
    @h("none")
    public final void G(final g<? super T> g, final g<? super Throwable> g2, final x5.a a) {
        io.reactivex.internal.operators.flowable.l.c((o7.b<?>)this, (g<? super Object>)g, g2, a);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final l<T> G1(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.H1(n, timeUnit, j0, false);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final io.reactivex.c G2(final o<? super T, ? extends io.reactivex.i> o) {
        return this.H2(o, false, Integer.MAX_VALUE);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> G4(final T t) {
        io.reactivex.internal.functions.b.g(t, "item is null");
        return this.F4(io.reactivex.internal.functions.a.n(t));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> G5(final Callable<R> callable, final c<R, ? super T, R> c) {
        io.reactivex.internal.functions.b.g(callable, "seedSupplier is null");
        io.reactivex.internal.functions.b.g(c, "accumulator is null");
        return io.reactivex.plugins.a.P((l<R>)new l3((l<Object>)this, (Callable<Object>)callable, (c<Object, ? super Object, Object>)c));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final k0<List<T>> G7(final int n) {
        io.reactivex.internal.functions.b.h(n, "capacityHint");
        return io.reactivex.plugins.a.S((k0<List<T>>)new p4((l<Object>)this, (Callable<Collection>)io.reactivex.internal.functions.a.f(n)));
    }
    
    @io.reactivex.annotations.b(a.H)
    @h("none")
    public final void H(final g<? super T> g, final g<? super Throwable> g2, final x5.a a, final int n) {
        io.reactivex.internal.operators.flowable.l.d((o7.b<?>)this, (g<? super Object>)g, g2, a, n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    @f
    public final l<T> H1(final long b, final TimeUnit timeUnit, final j0 j0, final boolean b2) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.j0((l<Object>)this, Math.max(0L, b), timeUnit, j0, b2));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final io.reactivex.c H2(final o<? super T, ? extends io.reactivex.i> o, final boolean b, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        return io.reactivex.plugins.a.O(new b1<Object>(this, o, b, n));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> H4(final b<? extends T> b) {
        io.reactivex.internal.functions.b.g(b, "next is null");
        return io.reactivex.plugins.a.P(new p2((l<Object>)this, io.reactivex.internal.functions.a.n((b<? extends T>)b), true));
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    public final l<T> H6(final long lng) {
        if (lng >= 0L) {
            return io.reactivex.plugins.a.P(new a4((l<Object>)this, lng));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final <U extends Collection<? super T>> k0<U> H7(final Callable<U> callable) {
        io.reactivex.internal.functions.b.g(callable, "collectionSupplier is null");
        return io.reactivex.plugins.a.S((k0<U>)new p4((l<Object>)this, (Callable<Collection>)callable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<List<T>> I(final int n) {
        return this.J(n, n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("io.reactivex:computation")
    public final l<T> I1(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.H1(n, timeUnit, io.reactivex.schedulers.b.a(), b);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <U> l<U> I2(final o<? super T, ? extends Iterable<? extends U>> o) {
        return this.J2(o, b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final k0<T> I3(final T t) {
        io.reactivex.internal.functions.b.g(t, "defaultItem");
        return io.reactivex.plugins.a.S(new y1<T>((o7.b<T>)this, t));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> I4() {
        return io.reactivex.plugins.a.P(new m0((l<Object>)this));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("io.reactivex:computation")
    public final l<T> I6(final long n, final TimeUnit timeUnit) {
        return this.T6((o7.b<Object>)x7(n, timeUnit));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <K> k0<Map<K, T>> I7(final o<? super T, ? extends K> o) {
        io.reactivex.internal.functions.b.g(o, "keySelector is null");
        return this.f0((Callable<? extends Map<K, T>>)io.reactivex.internal.util.m.b(), (x5.b<? super Map<K, T>, ? super T>)io.reactivex.internal.functions.a.F((o<? super T, ?>)o));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<List<T>> J(final int n, final int n2) {
        return this.K(n, n2, io.reactivex.internal.util.b.d());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <U, V> l<T> J1(final b<U> b, final o<? super T, ? extends b<V>> o) {
        return this.N1((o7.b<Object>)b).K1((o<? super T, ? extends o7.b<Object>>)o);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U> l<U> J2(final o<? super T, ? extends Iterable<? extends U>> o, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return io.reactivex.plugins.a.P((l<U>)new f1((l<Object>)this, (o<? super Object, ? extends Iterable<?>>)o, n));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final s<T> J3() {
        return io.reactivex.plugins.a.Q(new x1<T>((o7.b<T>)this));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final io.reactivex.parallel.b<T> J4() {
        return io.reactivex.parallel.b.y((o7.b<? extends T>)this);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("custom")
    public final l<T> J6(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.T6((o7.b<Object>)y7(n, timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <K, V> k0<Map<K, V>> J7(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        io.reactivex.internal.functions.b.g(o, "keySelector is null");
        io.reactivex.internal.functions.b.g(o2, "valueSelector is null");
        return this.f0((Callable<? extends Map<K, V>>)io.reactivex.internal.util.m.b(), (x5.b<? super Map<K, V>, ? super T>)io.reactivex.internal.functions.a.G((o<? super T, ?>)o, (o<? super T, ?>)o2));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U extends Collection<? super T>> l<U> K(final int n, final int n2, final Callable<U> callable) {
        io.reactivex.internal.functions.b.h(n, "count");
        io.reactivex.internal.functions.b.h(n2, "skip");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.P((l<U>)new io.reactivex.internal.operators.flowable.m((l<Object>)this, n, n2, (Callable<Collection>)callable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U> l<T> K1(final o<? super T, ? extends b<U>> o) {
        io.reactivex.internal.functions.b.g(o, "itemDelayIndicator is null");
        return this.u2((o<? super T, ? extends o7.b<? extends T>>)s1.c((o<? super T, ? extends o7.b<Object>>)o));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U, V> l<V> K2(final o<? super T, ? extends Iterable<? extends U>> o, final c<? super T, ? super U, ? extends V> c) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.g(c, "resultSelector is null");
        return this.A2((o<? super T, ? extends o7.b<?>>)s1.a((o<? super T, ? extends Iterable<?>>)o), (c<? super T, ? super Object, ? extends V>)c, false, b0(), b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final k0<T> K3() {
        return io.reactivex.plugins.a.S(new y1<T>((o7.b<T>)this, null));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final io.reactivex.parallel.b<T> K4(final int n) {
        io.reactivex.internal.functions.b.h(n, "parallelism");
        return io.reactivex.parallel.b.z((o7.b<? extends T>)this, n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> K6(final int i) {
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i == 0) {
            return io.reactivex.plugins.a.P(new q1((l<Object>)this));
        }
        if (i == 1) {
            return io.reactivex.plugins.a.P(new c4((l<Object>)this));
        }
        return io.reactivex.plugins.a.P(new b4((l<Object>)this, i));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <K, V> k0<Map<K, V>> K7(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final Callable<? extends Map<K, V>> callable) {
        io.reactivex.internal.functions.b.g(o, "keySelector is null");
        io.reactivex.internal.functions.b.g(o2, "valueSelector is null");
        return this.f0(callable, (x5.b<? super Map<K, V>, ? super T>)io.reactivex.internal.functions.a.G((o<? super T, ?>)o, (o<? super T, ?>)o2));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <U extends Collection<? super T>> l<U> L(final int n, final Callable<U> callable) {
        return this.K(n, n, callable);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("io.reactivex:computation")
    public final l<T> L1(final long n, final TimeUnit timeUnit) {
        return this.M1(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U, V> l<V> L2(final o<? super T, ? extends Iterable<? extends U>> o, final c<? super T, ? super U, ? extends V> c, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.g(c, "resultSelector is null");
        return this.A2((o<? super T, ? extends o7.b<?>>)s1.a((o<? super T, ? extends Iterable<?>>)o), (c<? super T, ? super Object, ? extends V>)c, false, b0(), n);
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    @f
    public final <R> l<R> L3(final p<? extends R, ? super T> p) {
        io.reactivex.internal.functions.b.g(p, "lifter is null");
        return io.reactivex.plugins.a.P((l<R>)new z1((l<Object>)this, (p<?, ? super Object>)p));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final io.reactivex.parallel.b<T> L4(final int n, final int n2) {
        io.reactivex.internal.functions.b.h(n, "parallelism");
        io.reactivex.internal.functions.b.h(n2, "prefetch");
        return io.reactivex.parallel.b.A((o7.b<? extends T>)this, n, n2);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> L5() {
        return io.reactivex.plugins.a.P(new o3((l<Object>)this));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> L6(final long n, final long n2, final TimeUnit timeUnit) {
        return this.N6(n, n2, timeUnit, io.reactivex.schedulers.b.a(), false, b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final <K> k0<Map<K, Collection<T>>> L7(final o<? super T, ? extends K> o) {
        return this.O7(o, (o<? super T, ? extends T>)io.reactivex.internal.functions.a.k(), (Callable<? extends Map<K, Collection<T>>>)io.reactivex.internal.util.m.b(), (o<? super K, ? extends Collection<? super T>>)io.reactivex.internal.util.b.f());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U, R> l<R> L8(final Iterable<U> iterable, final c<? super T, ? super U, ? extends R> c) {
        io.reactivex.internal.functions.b.g(iterable, "other is null");
        io.reactivex.internal.functions.b.g(c, "zipper is null");
        return io.reactivex.plugins.a.P((l<R>)new a5((l<Object>)this, (Iterable<Object>)iterable, (c<? super Object, ? super Object, ?>)c));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<List<T>> M(final long n, final long n2, final TimeUnit timeUnit) {
        return this.O(n, n2, timeUnit, io.reactivex.schedulers.b.a(), io.reactivex.internal.util.b.d());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final l<T> M1(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.N1((o7.b<Object>)y7(n, timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final <R> l<R> M2(final o<? super T, ? extends io.reactivex.y<? extends R>> o) {
        return this.N2(o, false, Integer.MAX_VALUE);
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    public final l<T> M3(final long lng) {
        if (lng >= 0L) {
            return io.reactivex.plugins.a.P(new a2((l<Object>)this, lng));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> M4(final o<? super l<T>, ? extends b<R>> o) {
        return this.N4((o<? super l<T>, ? extends o7.b<? extends R>>)o, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> M5() {
        return this.O4().U8();
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final l<T> M6(final long n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        return this.N6(n, n2, timeUnit, j0, false, b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final <K, V> k0<Map<K, Collection<V>>> M7(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        return this.O7(o, o2, (Callable<? extends Map<K, Collection<V>>>)io.reactivex.internal.util.m.b(), (o<? super K, ? extends Collection<? super V>>)io.reactivex.internal.util.b.f());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U, R> l<R> M8(final b<? extends U> b, final c<? super T, ? super U, ? extends R> c) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        return F8((o7.b<?>)this, (o7.b<?>)b, (c<? super Object, ? super Object, ? extends R>)c);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    public final l<List<T>> N(final long n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        return this.O(n, n2, timeUnit, j0, io.reactivex.internal.util.b.d());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U> l<T> N1(final b<U> b) {
        io.reactivex.internal.functions.b.g(b, "subscriptionIndicator is null");
        return io.reactivex.plugins.a.P((l<T>)new io.reactivex.internal.operators.flowable.k0((o7.b<?>)this, (o7.b<Object>)b));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <R> l<R> N2(final o<? super T, ? extends io.reactivex.y<? extends R>> o, final boolean b, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        return io.reactivex.plugins.a.P((l<R>)new c1((l<Object>)this, (o<? super Object, ? extends io.reactivex.y<?>>)o, b, n));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final <R> l<R> N3(final o<? super T, ? extends R> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.P((l<R>)new b2((l<Object>)this, (o<? super Object, ?>)o));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> N4(final o<? super l<T>, ? extends b<? extends R>> o, final int n) {
        io.reactivex.internal.functions.b.g(o, "selector is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        return io.reactivex.plugins.a.P((l<R>)new s2((l<Object>)this, (o<? super l<Object>, ? extends o7.b<?>>)o, n, false));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final k0<T> N5(final T t) {
        io.reactivex.internal.functions.b.g(t, "defaultItem is null");
        return io.reactivex.plugins.a.S(new r3<T>(this, t));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    @f
    public final l<T> N6(final long lng, final long n, final TimeUnit timeUnit, final j0 j0, final boolean b, final int n2) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        io.reactivex.internal.functions.b.h(n2, "bufferSize");
        if (lng >= 0L) {
            return io.reactivex.plugins.a.P(new d4((l<Object>)this, lng, n, timeUnit, j0, n2, b));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(lng);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final <K, V> k0<Map<K, Collection<V>>> N7(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final Callable<Map<K, Collection<V>>> callable) {
        return this.O7(o, o2, (Callable<? extends Map<K, Collection<V>>>)callable, (o<? super K, ? extends Collection<? super V>>)io.reactivex.internal.util.b.f());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <U, R> l<R> N8(final b<? extends U> b, final c<? super T, ? super U, ? extends R> c, final boolean b2) {
        return G8((o7.b<?>)this, (o7.b<?>)b, (c<? super Object, ? super Object, ? extends R>)c, b2);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    @f
    public final <U extends Collection<? super T>> l<U> O(final long n, final long n2, final TimeUnit timeUnit, final j0 j0, final Callable<U> callable) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.P((l<U>)new q((l<Object>)this, n, n2, timeUnit, j0, (Callable<Collection>)callable, Integer.MAX_VALUE, false));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @Deprecated
    public final <T2> l<T2> O1() {
        return io.reactivex.plugins.a.P((l<T2>)new l0((l<Object>)this, (o<? super Object, ? extends a0<Object>>)io.reactivex.internal.functions.a.k()));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final <R> l<R> O2(final o<? super T, ? extends q0<? extends R>> o) {
        return this.P2(o, false, Integer.MAX_VALUE);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<a0<T>> O3() {
        return io.reactivex.plugins.a.P(new e2((l<Object>)this));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final io.reactivex.flowables.a<T> O4() {
        return this.P4(b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final s<T> O5() {
        return io.reactivex.plugins.a.Q(new q3<T>(this));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("io.reactivex:computation")
    public final l<T> O6(final long n, final TimeUnit timeUnit) {
        return this.R6(n, timeUnit, io.reactivex.schedulers.b.a(), false, b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <K, V> k0<Map<K, Collection<V>>> O7(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final Callable<? extends Map<K, Collection<V>>> callable, final o<? super K, ? extends Collection<? super V>> o3) {
        io.reactivex.internal.functions.b.g(o, "keySelector is null");
        io.reactivex.internal.functions.b.g(o2, "valueSelector is null");
        io.reactivex.internal.functions.b.g(callable, "mapSupplier is null");
        io.reactivex.internal.functions.b.g(o3, "collectionFactory is null");
        return this.f0(callable, (x5.b<? super Map<K, Collection<V>>, ? super T>)io.reactivex.internal.functions.a.H((o<? super T, ?>)o, (o<? super T, ?>)o2, (o<? super Object, ? extends Collection<? super Object>>)o3));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <U, R> l<R> O8(final b<? extends U> b, final c<? super T, ? super U, ? extends R> c, final boolean b2, final int n) {
        return H8((o7.b<?>)this, (o7.b<?>)b, (c<? super Object, ? super Object, ? extends R>)c, b2, n);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<List<T>> P(final long n, final TimeUnit timeUnit) {
        return this.S(n, timeUnit, io.reactivex.schedulers.b.a(), Integer.MAX_VALUE);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @e
    @f
    public final <R> l<R> P1(final o<? super T, a0<R>> o) {
        io.reactivex.internal.functions.b.g(o, "selector is null");
        return io.reactivex.plugins.a.P((l<R>)new l0((l<Object>)this, (o<? super Object, ? extends a0<Object>>)o));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <R> l<R> P2(final o<? super T, ? extends q0<? extends R>> o, final boolean b, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        return io.reactivex.plugins.a.P((l<R>)new e1((l<Object>)this, (o<? super Object, ? extends q0<?>>)o, b, n));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final io.reactivex.flowables.a<T> P4(final int n) {
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return r2.a9(this, n);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final k0<T> P5() {
        return io.reactivex.plugins.a.S(new r3<T>(this, null));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final l<T> P6(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.R6(n, timeUnit, j0, false, b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final b0<T> P7() {
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.g1<T>((o7.b<? extends T>)this));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<List<T>> Q(final long n, final TimeUnit timeUnit, final int n2) {
        return this.S(n, timeUnit, io.reactivex.schedulers.b.a(), n2);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> Q1() {
        return this.S1(io.reactivex.internal.functions.a.k(), io.reactivex.internal.functions.a.g());
    }
    
    @io.reactivex.annotations.b(a.L)
    @d
    @h("none")
    public final io.reactivex.disposables.c Q2(final g<? super T> g) {
        return this.i6(g);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> Q5(final long n) {
        if (n <= 0L) {
            return io.reactivex.plugins.a.P(this);
        }
        return io.reactivex.plugins.a.P(new s3((l<Object>)this, n));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final l<T> Q6(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b) {
        return this.R6(n, timeUnit, j0, b, b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final k0<List<T>> Q7() {
        return this.S7(io.reactivex.internal.functions.a.p());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    public final l<List<T>> R(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.T(n, timeUnit, j0, Integer.MAX_VALUE, io.reactivex.internal.util.b.d(), false);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <K> l<T> R1(final o<? super T, K> o) {
        return this.S1(o, io.reactivex.internal.functions.a.g());
    }
    
    @io.reactivex.annotations.b(a.L)
    @d
    @h("none")
    public final io.reactivex.disposables.c R2(final x5.r<? super T> r) {
        return this.T2(r, io.reactivex.internal.functions.a.f, io.reactivex.internal.functions.a.c);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> R5(final long n, final TimeUnit timeUnit) {
        return this.Z5((o7.b<Object>)x7(n, timeUnit));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final l<T> R6(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b, final int n2) {
        return this.N6(Long.MAX_VALUE, n, timeUnit, j0, b, n2);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final k0<List<T>> R7(final int n) {
        return this.T7(io.reactivex.internal.functions.a.p(), n);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    public final l<List<T>> S(final long n, final TimeUnit timeUnit, final j0 j0, final int n2) {
        return this.T(n, timeUnit, j0, n2, io.reactivex.internal.util.b.d(), false);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <K> l<T> S1(final o<? super T, K> p0, final Callable<? extends Collection<? super K>> p1) {
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
        //    16: new             Lio/reactivex/internal/operators/flowable/n0;
        //    19: dup            
        //    20: aload_0        
        //    21: aload_1        
        //    22: aload_2        
        //    23: invokespecial   io/reactivex/internal/operators/flowable/n0.<init>:(Lio/reactivex/l;Lx5/o;Ljava/util/concurrent/Callable;)V
        //    26: invokestatic    io/reactivex/plugins/a.P:(Lio/reactivex/l;)Lio/reactivex/l;
        //    29: areturn        
        //    Signature:
        //  <K:Ljava/lang/Object;>(Lx5/o<-TT;TK;>;Ljava/util/concurrent/Callable<+Ljava/util/Collection<-TK;>;>;)Lio/reactivex/l<TT;>;
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
    
    @io.reactivex.annotations.b(a.L)
    @d
    @h("none")
    public final io.reactivex.disposables.c S2(final x5.r<? super T> r, final g<? super Throwable> g) {
        return this.T2(r, g, io.reactivex.internal.functions.a.c);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> S4(final int n) {
        return this.q4(io.reactivex.internal.schedulers.e.H, true, n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final l<T> S5(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.Z5((o7.b<Object>)y7(n, timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("io.reactivex:computation")
    public final l<T> S6(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.R6(n, timeUnit, io.reactivex.schedulers.b.a(), b, b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final k0<List<T>> S7(final Comparator<? super T> comparator) {
        io.reactivex.internal.functions.b.g(comparator, "comparator is null");
        return this.F7().v0((o<? super List<T>, ? extends List<T>>)io.reactivex.internal.functions.a.o((Comparator<? super Object>)comparator));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    public final <U extends Collection<? super T>> l<U> T(final long n, final TimeUnit timeUnit, final j0 j0, final int n2, final Callable<U> callable, final boolean b) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        io.reactivex.internal.functions.b.h(n2, "count");
        return io.reactivex.plugins.a.P((l<U>)new q((l<Object>)this, n, n, timeUnit, j0, (Callable<Collection>)callable, n2, b));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> T1() {
        return this.V1(io.reactivex.internal.functions.a.k());
    }
    
    @io.reactivex.annotations.b(a.L)
    @d
    @h("none")
    @f
    public final io.reactivex.disposables.c T2(final x5.r<? super T> r, final g<? super Throwable> g, final x5.a a) {
        io.reactivex.internal.functions.b.g(r, "onNext is null");
        io.reactivex.internal.functions.b.g(g, "onError is null");
        io.reactivex.internal.functions.b.g(a, "onComplete is null");
        final io.reactivex.internal.subscribers.i<Object> i = new io.reactivex.internal.subscribers.i<Object>((x5.r<? super Object>)r, g, a);
        this.m6(i);
        return i;
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final s<T> T4(final c<T, T, T> c) {
        io.reactivex.internal.functions.b.g(c, "reducer is null");
        return io.reactivex.plugins.a.Q(new w2<T>(this, c));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> T5(final int i) {
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("count >= 0 required but it was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i == 0) {
            return io.reactivex.plugins.a.P(this);
        }
        return io.reactivex.plugins.a.P(new t3((l<Object>)this, i));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final <U> l<T> T6(final b<U> b) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        return io.reactivex.plugins.a.P((l<T>)new f4((l<Object>)this, b));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final k0<List<T>> T7(final Comparator<? super T> comparator, final int n) {
        io.reactivex.internal.functions.b.g(comparator, "comparator is null");
        return this.G7(n).v0((o<? super List<T>, ? extends List<T>>)io.reactivex.internal.functions.a.o((Comparator<? super Object>)comparator));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final <TOpening, TClosing> l<List<T>> U(final l<? extends TOpening> l, final o<? super TOpening, ? extends b<? extends TClosing>> o) {
        return this.V((l<?>)l, (o<? super Object, ? extends o7.b<?>>)o, io.reactivex.internal.util.b.d());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> U0(final o<? super T, ? extends b<? extends R>> o) {
        return this.V0(o, 2);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> U1(final x5.d<? super T, ? super T> d) {
        io.reactivex.internal.functions.b.g(d, "comparer is null");
        return io.reactivex.plugins.a.P((l<T>)new o0((l<Object>)this, (o<? super Object, Object>)io.reactivex.internal.functions.a.k(), (x5.d<? super Object, ? super Object>)d));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <R> k0<R> U4(final R r, final c<R, ? super T, R> c) {
        io.reactivex.internal.functions.b.g(r, "seed is null");
        io.reactivex.internal.functions.b.g(c, "reducer is null");
        return io.reactivex.plugins.a.S((k0<R>)new x2((o7.b<Object>)this, r, (c<Object, ? super Object, Object>)c));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final l<T> U5(final long n, final TimeUnit timeUnit) {
        return this.X5(n, timeUnit, io.reactivex.schedulers.b.a(), false, b0());
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final l<T> U6(final x5.r<? super T> r) {
        io.reactivex.internal.functions.b.g(r, "stopPredicate is null");
        return io.reactivex.plugins.a.P(new g4((l<Object>)this, (x5.r<? super Object>)r));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final <TOpening, TClosing, U extends Collection<? super T>> l<U> V(final l<? extends TOpening> l, final o<? super TOpening, ? extends b<? extends TClosing>> o, final Callable<U> callable) {
        io.reactivex.internal.functions.b.g(l, "openingIndicator is null");
        io.reactivex.internal.functions.b.g(o, "closingIndicator is null");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.P((l<U>)new io.reactivex.internal.operators.flowable.n((l<Object>)this, (o7.b<?>)l, (o<? super Object, ? extends o7.b<?>>)o, (Callable<Collection>)callable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> V0(final o<? super T, ? extends b<? extends R>> o, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        if (!(this instanceof y5.m)) {
            return io.reactivex.plugins.a.P((l<R>)new w((l<Object>)this, (o<? super Object, ? extends o7.b<?>>)o, n, io.reactivex.internal.util.j.G));
        }
        final Object call = ((y5.m)this).call();
        if (call == null) {
            return n2();
        }
        return (l<R>)j3.a(call, (o<? super Object, ? extends o7.b<?>>)o);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <K> l<T> V1(final o<? super T, K> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "keySelector is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: new             Lio/reactivex/internal/operators/flowable/o0;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokestatic    io/reactivex/internal/functions/b.d:()Lx5/d;
        //    17: invokespecial   io/reactivex/internal/operators/flowable/o0.<init>:(Lio/reactivex/l;Lx5/o;Lx5/d;)V
        //    20: invokestatic    io/reactivex/plugins/a.P:(Lio/reactivex/l;)Lio/reactivex/l;
        //    23: areturn        
        //    Signature:
        //  <K:Ljava/lang/Object;>(Lx5/o<-TT;TK;>;)Lio/reactivex/l<TT;>;
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
    public final <R> k0<R> V4(final Callable<R> callable, final c<R, ? super T, R> c) {
        io.reactivex.internal.functions.b.g(callable, "seedSupplier is null");
        io.reactivex.internal.functions.b.g(c, "reducer is null");
        return io.reactivex.plugins.a.S((k0<R>)new y2((o7.b<Object>)this, (Callable<Object>)callable, (c<Object, ? super Object, Object>)c));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("custom")
    public final l<T> V5(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.X5(n, timeUnit, j0, false, b0());
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final l<T> V6(final x5.r<? super T> r) {
        io.reactivex.internal.functions.b.g(r, "predicate is null");
        return io.reactivex.plugins.a.P(new h4((l<Object>)this, (x5.r<? super Object>)r));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("custom")
    @f
    public final l<T> V7(final j0 j0) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P(new q4((l<Object>)this, j0));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final <B> l<List<T>> W(final Callable<? extends b<B>> callable) {
        return this.X((Callable<? extends o7.b<Object>>)callable, io.reactivex.internal.util.b.d());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final io.reactivex.c W0(final o<? super T, ? extends io.reactivex.i> o) {
        return this.X0(o, 2);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> W1(final g<? super T> g) {
        io.reactivex.internal.functions.b.g(g, "onAfterNext is null");
        return io.reactivex.plugins.a.P(new p0((l<Object>)this, (g<? super Object>)g));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> W4() {
        return this.X4(Long.MAX_VALUE);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("custom")
    public final l<T> W5(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b) {
        return this.X5(n, timeUnit, j0, b, b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final io.reactivex.subscribers.f<T> W6() {
        final io.reactivex.subscribers.f<Object> f = new io.reactivex.subscribers.f<Object>();
        this.m6(f);
        return (io.reactivex.subscribers.f<T>)f;
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final <B, U extends Collection<? super T>> l<U> X(final Callable<? extends b<B>> callable, final Callable<U> callable2) {
        io.reactivex.internal.functions.b.g(callable, "boundaryIndicatorSupplier is null");
        io.reactivex.internal.functions.b.g(callable2, "bufferSupplier is null");
        return io.reactivex.plugins.a.P((l<U>)new io.reactivex.internal.operators.flowable.o((l<Object>)this, (Callable<? extends o7.b<Object>>)callable, (Callable<Collection>)callable2));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final io.reactivex.c X0(final o<? super T, ? extends io.reactivex.i> o, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.c<Object>(this, o, io.reactivex.internal.util.j.G, n));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> X1(final x5.a a) {
        return this.d2(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.c, a);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> X4(final long lng) {
        final long n = lcmp(lng, 0L);
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("times >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n == 0) {
            return n2();
        }
        return io.reactivex.plugins.a.P(new a3((l<Object>)this, lng));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("custom")
    @f
    public final l<T> X5(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b, final int n2) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        io.reactivex.internal.functions.b.h(n2, "bufferSize");
        return io.reactivex.plugins.a.P(new u3((l<Object>)this, n, timeUnit, j0, n2 << 1, b));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final io.reactivex.subscribers.f<T> X6(final long n) {
        final io.reactivex.subscribers.f<Object> f = new io.reactivex.subscribers.f<Object>(n);
        this.m6(f);
        return (io.reactivex.subscribers.f<T>)f;
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final <B> l<List<T>> Y(final b<B> b) {
        return this.a0((o7.b<Object>)b, io.reactivex.internal.util.b.d());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final io.reactivex.c Y0(final o<? super T, ? extends io.reactivex.i> o) {
        return this.a1(o, true, 2);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> Y1(final x5.a a) {
        io.reactivex.internal.functions.b.g(a, "onFinally is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.q0((l<Object>)this, a));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> Y4(final x5.e e) {
        io.reactivex.internal.functions.b.g(e, "stop is null");
        return io.reactivex.plugins.a.P(new b3((l<Object>)this, e));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final l<T> Y5(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.X5(n, timeUnit, io.reactivex.schedulers.b.a(), b, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final io.reactivex.subscribers.f<T> Y6(final long n, final boolean b) {
        final io.reactivex.subscribers.f<Object> f = new io.reactivex.subscribers.f<Object>(n);
        if (b) {
            f.cancel();
        }
        this.m6(f);
        return (io.reactivex.subscribers.f<T>)f;
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<l<T>> Y7(final long n) {
        return this.a8(n, n, b0());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final <B> l<List<T>> Z(final b<B> b, final int n) {
        io.reactivex.internal.functions.b.h(n, "initialCapacity");
        return this.a0((o7.b<Object>)b, io.reactivex.internal.functions.a.f(n));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final io.reactivex.c Z0(final o<? super T, ? extends io.reactivex.i> o, final boolean b) {
        return this.a1(o, b, 2);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> Z1(final x5.a a) {
        return this.f2(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, a);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> Z4(final o<? super l<Object>, ? extends b<?>> o) {
        io.reactivex.internal.functions.b.g(o, "handler is null");
        return io.reactivex.plugins.a.P(new c3((l<Object>)this, o));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U> l<T> Z5(final b<U> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "other is null"
        //     4: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     7: pop            
        //     8: new             Lio/reactivex/internal/operators/flowable/v3;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   io/reactivex/internal/operators/flowable/v3.<init>:(Lio/reactivex/l;Lo7/b;)V
        //    17: invokestatic    io/reactivex/plugins/a.P:(Lio/reactivex/l;)Lio/reactivex/l;
        //    20: areturn        
        //    Signature:
        //  <U:Ljava/lang/Object;>(Lo7/b<TU;>;)Lio/reactivex/l<TT;>;
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
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<T> Z6(final long n, final TimeUnit timeUnit) {
        return this.a7(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<l<T>> Z7(final long n, final long n2) {
        return this.a8(n, n2, b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final k0<Boolean> a(final x5.r<? super T> r) {
        io.reactivex.internal.functions.b.g(r, "predicate is null");
        return io.reactivex.plugins.a.S((k0<Boolean>)new io.reactivex.internal.operators.flowable.g<Object>(this, r));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final <B, U extends Collection<? super T>> l<U> a0(final b<B> b, final Callable<U> callable) {
        io.reactivex.internal.functions.b.g(b, "boundaryIndicator is null");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.P((l<U>)new io.reactivex.internal.operators.flowable.p((l<Object>)this, (o7.b<Object>)b, (Callable<Collection>)callable));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final io.reactivex.c a1(final o<? super T, ? extends io.reactivex.i> o, final boolean b, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        io.reactivex.internal.util.j j;
        if (b) {
            j = io.reactivex.internal.util.j.I;
        }
        else {
            j = io.reactivex.internal.util.j.H;
        }
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.c<Object>((l<Object>)this, (o<? super Object, ? extends io.reactivex.i>)o, j, n));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> a2(final x5.a a) {
        return this.d2(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), a, io.reactivex.internal.functions.a.c);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> a5(final o<? super l<T>, ? extends b<R>> o) {
        io.reactivex.internal.functions.b.g(o, "selector is null");
        return d3.f9((Callable<? extends io.reactivex.flowables.a<Object>>)s1.d((l<Object>)this), (o<? super l<Object>, ? extends o7.b<R>>)o);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> a6(final x5.r<? super T> r) {
        io.reactivex.internal.functions.b.g(r, "predicate is null");
        return io.reactivex.plugins.a.P(new w3((l<Object>)this, (x5.r<? super Object>)r));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    @f
    public final l<T> a7(final long n, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P(new i4((l<Object>)this, n, timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<l<T>> a8(final long n, final long n2, final int n3) {
        io.reactivex.internal.functions.b.i(n2, "skip");
        io.reactivex.internal.functions.b.i(n, "count");
        io.reactivex.internal.functions.b.h(n3, "bufferSize");
        return io.reactivex.plugins.a.P(new s4((l<Object>)this, n, n2, n3));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> b1(final o<? super T, ? extends b<? extends R>> o) {
        return this.c1(o, 2, true);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final l<T> b2(final o7.c<? super T> c) {
        io.reactivex.internal.functions.b.g(c, "subscriber is null");
        return this.d2(s1.m(c), s1.l(c), s1.k(c), io.reactivex.internal.functions.a.c);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> b5(final o<? super l<T>, ? extends b<R>> o, final int n) {
        io.reactivex.internal.functions.b.g(o, "selector is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return d3.f9((Callable<? extends io.reactivex.flowables.a<Object>>)s1.e((l<Object>)this, n), (o<? super l<Object>, ? extends o7.b<R>>)o);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> b6() {
        return (l<T>)this.F7().v1().N3((o<? super List<List<T>>, ?>)io.reactivex.internal.functions.a.o(io.reactivex.internal.functions.a.p())).I2((o<? super Object, ? extends Iterable<?>>)io.reactivex.internal.functions.a.k());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<T> b7(final long n, final TimeUnit timeUnit) {
        return this.y5(n, timeUnit);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<l<T>> b8(final long n, final long n2, final TimeUnit timeUnit) {
        return this.d8(n, n2, timeUnit, io.reactivex.schedulers.b.a(), b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> c0() {
        return this.d0(16);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> c1(final o<? super T, ? extends b<? extends R>> o, final int n, final boolean b) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        if (!(this instanceof y5.m)) {
            io.reactivex.internal.util.j j;
            if (b) {
                j = io.reactivex.internal.util.j.I;
            }
            else {
                j = io.reactivex.internal.util.j.H;
            }
            return io.reactivex.plugins.a.P((l<R>)new w((l<Object>)this, (o<? super Object, ? extends o7.b<?>>)o, n, j));
        }
        final Object call = ((y5.m)this).call();
        if (call == null) {
            return n2();
        }
        return (l<R>)j3.a(call, (o<? super Object, ? extends o7.b<?>>)o);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final l<T> c2(final g<? super a0<T>> g) {
        io.reactivex.internal.functions.b.g(g, "onNotification is null");
        return this.d2(io.reactivex.internal.functions.a.t((g<? super a0<? super T>>)g), io.reactivex.internal.functions.a.s((g<? super a0<Object>>)g), io.reactivex.internal.functions.a.r((g<? super a0<Object>>)g), io.reactivex.internal.functions.a.c);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("io.reactivex:computation")
    public final <R> l<R> c5(final o<? super l<T>, ? extends b<R>> o, final int n, final long n2, final TimeUnit timeUnit) {
        return this.d5(o, n, n2, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> c6(final Comparator<? super T> comparator) {
        io.reactivex.internal.functions.b.g(comparator, "sortFunction");
        return (l<T>)this.F7().v1().N3((o<? super List<List<T>>, ?>)io.reactivex.internal.functions.a.o((Comparator<? super Object>)comparator)).I2((o<? super Object, ? extends Iterable<?>>)io.reactivex.internal.functions.a.k());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    public final l<T> c7(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.z5(n, timeUnit, j0);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    public final l<l<T>> c8(final long n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        return this.d8(n, n2, timeUnit, j0, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> d0(final int n) {
        io.reactivex.internal.functions.b.h(n, "initialCapacity");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.r((l<Object>)this, n));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> d1(final o<? super T, ? extends b<? extends R>> o) {
        return this.e1(o, b0(), b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    @f
    public final <R> l<R> d5(final o<? super l<T>, ? extends b<R>> o, final int n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(o, "selector is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return d3.f9((Callable<? extends io.reactivex.flowables.a<Object>>)s1.f((l<Object>)this, n, n2, timeUnit, j0), (o<? super l<Object>, ? extends o7.b<R>>)o);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> d6(final Iterable<? extends T> iterable) {
        return H0(new b[] { (b)a3((Iterable<?>)iterable), (b)this });
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<T> d7(final long n, final TimeUnit timeUnit) {
        return this.f7(n, timeUnit, io.reactivex.schedulers.b.a(), false);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    @f
    public final l<l<T>> d8(final long n, final long n2, final TimeUnit timeUnit, final j0 j0, final int n3) {
        io.reactivex.internal.functions.b.h(n3, "bufferSize");
        io.reactivex.internal.functions.b.i(n, "timespan");
        io.reactivex.internal.functions.b.i(n2, "timeskip");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.P(new w4((l<Object>)this, n, n2, timeUnit, j0, Long.MAX_VALUE, n3, false));
    }
    
    @io.reactivex.annotations.b(a.I)
    @h("none")
    public final void e(final o7.c<? super T> c) {
        if (c instanceof io.reactivex.q) {
            this.m6((io.reactivex.q<? super T>)c);
        }
        else {
            io.reactivex.internal.functions.b.g((io.reactivex.q<? super T>)c, "s is null");
            this.m6(new io.reactivex.internal.subscribers.u<Object>(c));
        }
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final <U> l<U> e0(final Class<U> clazz) {
        io.reactivex.internal.functions.b.g(clazz, "clazz is null");
        return this.N3((o<? super T, ? extends U>)io.reactivex.internal.functions.a.e((Class<? extends R>)clazz));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> e1(final o<? super T, ? extends b<? extends R>> o, final int n, final int n2) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        io.reactivex.internal.functions.b.h(n2, "prefetch");
        return io.reactivex.plugins.a.P((l<R>)new x((l<Object>)this, (o<? super Object, ? extends o7.b<?>>)o, n, n2, io.reactivex.internal.util.j.G));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> e2(final g<? super Throwable> g) {
        final g<? super T> h = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return this.d2(h, g, c, c);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    @f
    public final <R> l<R> e5(final o<? super l<T>, ? extends b<R>> o, final int n, final j0 j0) {
        io.reactivex.internal.functions.b.g(o, "selector is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return d3.f9((Callable<? extends io.reactivex.flowables.a<Object>>)s1.e((l<Object>)this, n), (o<? super l<Object>, ? extends o7.b<R>>)s1.h((o<? super l<Object>, ? extends o7.b<Object>>)o, j0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> e6(final T t) {
        io.reactivex.internal.functions.b.g(t, "value is null");
        return H0(new b[] { (b)y3(t), (b)this });
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    public final l<T> e7(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.f7(n, timeUnit, j0, false);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<l<T>> e8(final long n, final TimeUnit timeUnit) {
        return this.j8(n, timeUnit, io.reactivex.schedulers.b.a(), Long.MAX_VALUE, false);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <U> k0<U> f0(final Callable<? extends U> callable, final x5.b<? super U, ? super T> b) {
        io.reactivex.internal.functions.b.g(callable, "initialItemSupplier is null");
        io.reactivex.internal.functions.b.g(b, "collector is null");
        return io.reactivex.plugins.a.S((k0<U>)new t((l<Object>)this, callable, (x5.b<? super Object, ? super Object>)b));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> f1(final o<? super T, ? extends b<? extends R>> o, final int n, final int n2, final boolean b) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        io.reactivex.internal.functions.b.h(n2, "prefetch");
        io.reactivex.internal.util.j j;
        if (b) {
            j = io.reactivex.internal.util.j.I;
        }
        else {
            j = io.reactivex.internal.util.j.H;
        }
        return io.reactivex.plugins.a.P((l<R>)new x((l<Object>)this, (o<? super Object, ? extends o7.b<?>>)o, n, n2, j));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final l<T> f2(final g<? super o7.d> g, final x5.q q, final x5.a a) {
        io.reactivex.internal.functions.b.g(g, "onSubscribe is null");
        io.reactivex.internal.functions.b.g(q, "onRequest is null");
        io.reactivex.internal.functions.b.g(a, "onCancel is null");
        return io.reactivex.plugins.a.P(new s0((l<Object>)this, g, q, a));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("io.reactivex:computation")
    public final <R> l<R> f5(final o<? super l<T>, ? extends b<R>> o, final long n, final TimeUnit timeUnit) {
        return this.g5(o, n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> f6(final b<? extends T> b) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        return H0(new b[] { b, (b)this });
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    @f
    public final l<T> f7(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P(new j4((l<Object>)this, n, timeUnit, j0, b));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<l<T>> f8(final long n, final TimeUnit timeUnit, final long n2) {
        return this.j8(n, timeUnit, io.reactivex.schedulers.b.a(), n2, false);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <U> k0<U> g0(final U u, final x5.b<? super U, ? super T> b) {
        io.reactivex.internal.functions.b.g(u, "initialItem is null");
        return this.f0((Callable<? extends U>)io.reactivex.internal.functions.a.m((U)u), b);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> g1(final o<? super T, ? extends b<? extends R>> o, final boolean b) {
        return this.f1(o, b0(), b0(), b);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> g2(final g<? super T> g) {
        final g<? super Throwable> h = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return this.d2(g, h, c, c);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    @f
    public final <R> l<R> g5(final o<? super l<T>, ? extends b<R>> o, final long n, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(o, "selector is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return d3.f9((Callable<? extends io.reactivex.flowables.a<Object>>)s1.g((l<Object>)this, n, timeUnit, j0), (o<? super l<Object>, ? extends o7.b<R>>)o);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> g6(final T... array) {
        final l<T> u2 = U2(array);
        if (u2 == n2()) {
            return io.reactivex.plugins.a.P(this);
        }
        return H0(new b[] { (b)u2, (b)this });
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<T> g7(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.f7(n, timeUnit, io.reactivex.schedulers.b.a(), b);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<l<T>> g8(final long n, final TimeUnit timeUnit, final long n2, final boolean b) {
        return this.j8(n, timeUnit, io.reactivex.schedulers.b.a(), n2, b);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> h(final b<? extends T> b) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        return g(new b[] { (b)this, b });
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <U> l<U> h1(final o<? super T, ? extends Iterable<? extends U>> o) {
        return this.i1(o, 2);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> h2(final x5.q q) {
        return this.f2(io.reactivex.internal.functions.a.h(), q, io.reactivex.internal.functions.a.c);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <K> l<io.reactivex.flowables.b<K, T>> h3(final o<? super T, ? extends K> o) {
        return this.k3(o, (o<? super T, ? extends T>)io.reactivex.internal.functions.a.k(), false, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    @f
    public final <R> l<R> h5(final o<? super l<T>, ? extends b<R>> o, final j0 j0) {
        io.reactivex.internal.functions.b.g(o, "selector is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return d3.f9((Callable<? extends io.reactivex.flowables.a<Object>>)s1.d((l<Object>)this), (o<? super l<Object>, ? extends o7.b<R>>)s1.h((o<? super l<Object>, ? extends o7.b<Object>>)o, j0));
    }
    
    @io.reactivex.annotations.b(a.J)
    @h("none")
    public final io.reactivex.disposables.c h6() {
        return this.l6(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f, io.reactivex.internal.functions.a.c, s1.i.G);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<T> h7(final long n, final TimeUnit timeUnit) {
        return this.A1(n, timeUnit);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    public final l<l<T>> h8(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.j8(n, timeUnit, j0, Long.MAX_VALUE, false);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U> l<U> i1(final o<? super T, ? extends Iterable<? extends U>> o, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        return io.reactivex.plugins.a.P((l<U>)new f1((l<Object>)this, (o<? super Object, ? extends Iterable<?>>)o, n));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> i2(final g<? super o7.d> g) {
        return this.f2(g, io.reactivex.internal.functions.a.g, io.reactivex.internal.functions.a.c);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <K, V> l<io.reactivex.flowables.b<K, V>> i3(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        return this.k3(o, o2, false, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final io.reactivex.flowables.a<T> i5() {
        return d3.e9((l<? extends T>)this);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final io.reactivex.disposables.c i6(final g<? super T> g) {
        return this.l6(g, io.reactivex.internal.functions.a.f, io.reactivex.internal.functions.a.c, s1.i.G);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    public final l<T> i7(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.B1(n, timeUnit, j0);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    public final l<l<T>> i8(final long n, final TimeUnit timeUnit, final j0 j0, final long n2) {
        return this.j8(n, timeUnit, j0, n2, false);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final k0<Boolean> j(final x5.r<? super T> r) {
        io.reactivex.internal.functions.b.g(r, "predicate is null");
        return io.reactivex.plugins.a.S((k0<Boolean>)new io.reactivex.internal.operators.flowable.j<Object>(this, r));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> j1(final o<? super T, ? extends io.reactivex.y<? extends R>> o) {
        return this.k1(o, 2);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> j2(final x5.a a) {
        return this.d2(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.a(a), a, io.reactivex.internal.functions.a.c);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <K, V> l<io.reactivex.flowables.b<K, V>> j3(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b) {
        return this.k3(o, o2, b, b0());
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final l<T> j4(@f final io.reactivex.i i) {
        io.reactivex.internal.functions.b.g(i, "other is null");
        return io.reactivex.plugins.a.P(new f2((l<Object>)this, i));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final io.reactivex.flowables.a<T> j5(final int n) {
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return d3.a9(this, n);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final io.reactivex.disposables.c j6(final g<? super T> g, final g<? super Throwable> g2) {
        return this.l6(g, g2, io.reactivex.internal.functions.a.c, s1.i.G);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<io.reactivex.schedulers.d<T>> j7() {
        return this.m7(TimeUnit.MILLISECONDS, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    public final l<l<T>> j8(final long n, final TimeUnit timeUnit, final j0 j0, final long n2, final boolean b) {
        return this.k8(n, timeUnit, j0, n2, b, b0());
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    public final <R> R k(@f final io.reactivex.m<T, ? extends R> m) {
        return (R)io.reactivex.internal.functions.b.g(m, "converter is null").a(this);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> k1(final o<? super T, ? extends io.reactivex.y<? extends R>> o, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        return io.reactivex.plugins.a.P((l<R>)new io.reactivex.internal.operators.mixed.d((l<Object>)this, (o<? super Object, ? extends io.reactivex.y<?>>)o, io.reactivex.internal.util.j.G, n));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final s<T> k2(final long lng) {
        if (lng >= 0L) {
            return io.reactivex.plugins.a.Q(new u0<T>(this, lng));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(lng);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <K, V> l<io.reactivex.flowables.b<K, V>> k3(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b, final int n) {
        io.reactivex.internal.functions.b.g(o, "keySelector is null");
        io.reactivex.internal.functions.b.g(o2, "valueSelector is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return io.reactivex.plugins.a.P((l<io.reactivex.flowables.b<K, V>>)new n1((l<Object>)this, (o<? super Object, ?>)o, (o<? super Object, ?>)o2, n, b, null));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> k4(@f final io.reactivex.y<? extends T> y) {
        io.reactivex.internal.functions.b.g(y, "other is null");
        return io.reactivex.plugins.a.P(new g2((l<Object>)this, y));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("io.reactivex:computation")
    public final io.reactivex.flowables.a<T> k5(final int n, final long n2, final TimeUnit timeUnit) {
        return this.l5(n, n2, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final io.reactivex.disposables.c k6(final g<? super T> g, final g<? super Throwable> g2, final x5.a a) {
        return this.l6(g, g2, a, s1.i.G);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<io.reactivex.schedulers.d<T>> k7(final j0 j0) {
        return this.m7(TimeUnit.MILLISECONDS, j0);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    @f
    public final l<l<T>> k8(final long n, final TimeUnit timeUnit, final j0 j0, final long n2, final boolean b, final int n3) {
        io.reactivex.internal.functions.b.h(n3, "bufferSize");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.i(n2, "count");
        return io.reactivex.plugins.a.P(new w4((l<Object>)this, n, n, timeUnit, j0, n2, n3, b));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final T l() {
        final io.reactivex.internal.subscribers.d<T> d = (io.reactivex.internal.subscribers.d<T>)new io.reactivex.internal.subscribers.d<Object>();
        this.m6(d);
        final Object a = d.a();
        if (a != null) {
            return (T)a;
        }
        throw new NoSuchElementException();
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> l1(final o<? super T, ? extends io.reactivex.y<? extends R>> o) {
        return this.n1(o, true, 2);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final k0<T> l2(final long lng, final T t) {
        if (lng >= 0L) {
            io.reactivex.internal.functions.b.g(t, "defaultItem is null");
            return io.reactivex.plugins.a.S(new v0<T>(this, lng, t));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(lng);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <K, V> l<io.reactivex.flowables.b<K, V>> l3(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b, final int n, final o<? super g<Object>, ? extends Map<K, Object>> o3) {
        io.reactivex.internal.functions.b.g(o, "keySelector is null");
        io.reactivex.internal.functions.b.g(o2, "valueSelector is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        io.reactivex.internal.functions.b.g(o3, "evictingMapFactory is null");
        return io.reactivex.plugins.a.P((l<io.reactivex.flowables.b<K, V>>)new n1((l<Object>)this, (o<? super Object, ?>)o, (o<? super Object, ?>)o2, n, b, (o<? super g<Object>, ? extends Map<Object, Object>>)o3));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> l4(@f final q0<? extends T> q0) {
        io.reactivex.internal.functions.b.g(q0, "other is null");
        return io.reactivex.plugins.a.P(new h2((l<Object>)this, q0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final io.reactivex.flowables.a<T> l5(final int n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return d3.c9(this, n2, timeUnit, j0, n);
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    @f
    public final io.reactivex.disposables.c l6(final g<? super T> g, final g<? super Throwable> g2, final x5.a a, final g<? super o7.d> g3) {
        io.reactivex.internal.functions.b.g(g, "onNext is null");
        io.reactivex.internal.functions.b.g(g2, "onError is null");
        io.reactivex.internal.functions.b.g(a, "onComplete is null");
        io.reactivex.internal.functions.b.g(g3, "onSubscribe is null");
        final io.reactivex.internal.subscribers.m<Object> m = new io.reactivex.internal.subscribers.m<Object>((g<? super Object>)g, g2, a, g3);
        this.m6(m);
        return m;
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<io.reactivex.schedulers.d<T>> l7(final TimeUnit timeUnit) {
        return this.m7(timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final <B> l<l<T>> l8(final Callable<? extends b<B>> callable) {
        return this.m8((Callable<? extends o7.b<Object>>)callable, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> m1(final o<? super T, ? extends io.reactivex.y<? extends R>> o, final boolean b) {
        return this.n1(o, b, 2);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final k0<T> m2(final long lng) {
        if (lng >= 0L) {
            return io.reactivex.plugins.a.S(new v0<T>(this, lng, null));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(lng);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <K> l<io.reactivex.flowables.b<K, T>> m3(final o<? super T, ? extends K> o, final boolean b) {
        return this.k3(o, (o<? super T, ? extends T>)io.reactivex.internal.functions.a.k(), b, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> m4(final b<? extends T> b) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        return U3((o7.b<? extends T>)this, b);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final io.reactivex.flowables.a<T> m5(final int n, final j0 j0) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return d3.g9(this.j5(n), j0);
    }
    
    @io.reactivex.annotations.b(a.I)
    @h("none")
    public final void m6(final io.reactivex.q<? super T> q) {
        io.reactivex.internal.functions.b.g(q, "s is null");
        try {
            final o7.c<? super Object> h0 = io.reactivex.plugins.a.h0((l<Object>)this, (o7.c<? super Object>)q);
            io.reactivex.internal.functions.b.g(h0, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.n6(h0);
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
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<io.reactivex.schedulers.d<T>> m7(final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P(new k4((l<Object>)this, timeUnit, j0));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    @f
    public final <B> l<l<T>> m8(final Callable<? extends b<B>> callable, final int n) {
        io.reactivex.internal.functions.b.g(callable, "boundaryIndicatorSupplier is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return io.reactivex.plugins.a.P((l<l<T>>)new v4((l<Object>)this, (Callable<? extends o7.b<Object>>)callable, n));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final T n(T t) {
        final io.reactivex.internal.subscribers.d<T> d = (io.reactivex.internal.subscribers.d<T>)new io.reactivex.internal.subscribers.d<Object>();
        this.m6(d);
        final Object a = d.a();
        if (a != null) {
            t = (T)a;
        }
        return t;
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> n1(final o<? super T, ? extends io.reactivex.y<? extends R>> o, final boolean b, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        io.reactivex.internal.util.j j;
        if (b) {
            j = io.reactivex.internal.util.j.I;
        }
        else {
            j = io.reactivex.internal.util.j.H;
        }
        return io.reactivex.plugins.a.P((l<R>)new io.reactivex.internal.operators.mixed.d((l<Object>)this, (o<? super Object, ? extends io.reactivex.y<?>>)o, j, n));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    @f
    public final <TRight, TLeftEnd, TRightEnd, R> l<R> n3(final b<? extends TRight> b, final o<? super T, ? extends b<TLeftEnd>> o, final o<? super TRight, ? extends b<TRightEnd>> o2, final c<? super T, ? super l<TRight>, ? extends R> c) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        io.reactivex.internal.functions.b.g(o, "leftEnd is null");
        io.reactivex.internal.functions.b.g(o2, "rightEnd is null");
        io.reactivex.internal.functions.b.g(c, "resultSelector is null");
        return io.reactivex.plugins.a.P((l<R>)new o1((l<Object>)this, b, (o<? super Object, ? extends o7.b<Object>>)o, (o<? super Object, ? extends o7.b<Object>>)o2, (c<? super Object, ? super l<Object>, ?>)c));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("io.reactivex:computation")
    public final io.reactivex.flowables.a<T> n5(final long n, final TimeUnit timeUnit) {
        return this.o5(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    protected abstract void n6(final o7.c<? super T> p0);
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("io.reactivex:computation")
    public final l<T> n7(final long n, final TimeUnit timeUnit) {
        return this.v7(n, timeUnit, null, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final <B> l<l<T>> n8(final b<B> b) {
        return this.o8((o7.b<Object>)b, b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @h("none")
    public final void o(final g<? super T> g) {
        final Iterator<T> iterator = this.p().iterator();
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
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> o1(final o<? super T, ? extends q0<? extends R>> o) {
        return this.p1(o, 2);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> o3() {
        return io.reactivex.plugins.a.P(new p1((l<Object>)this));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final l<T> o4(final j0 j0) {
        return this.q4(j0, false, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final io.reactivex.flowables.a<T> o5(final long n, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return d3.b9(this, n, timeUnit, j0);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("custom")
    @f
    public final l<T> o6(@f final j0 j0) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return this.p6(j0, this instanceof f0 ^ true);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("custom")
    public final l<T> o7(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.v7(n, timeUnit, null, j0);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    @f
    public final <B> l<l<T>> o8(final b<B> b, final int n) {
        io.reactivex.internal.functions.b.g(b, "boundaryIndicator is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return io.reactivex.plugins.a.P((l<l<T>>)new t4((l<Object>)this, (o7.b<Object>)b, n));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final Iterable<T> p() {
        return this.q(b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> p1(final o<? super T, ? extends q0<? extends R>> o, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        return io.reactivex.plugins.a.P((l<R>)new io.reactivex.internal.operators.mixed.e((l<Object>)this, (o<? super Object, ? extends q0<?>>)o, io.reactivex.internal.util.j.G, n));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final io.reactivex.c p3() {
        return io.reactivex.plugins.a.O(new r1<Object>(this));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final l<T> p4(final j0 j0, final boolean b) {
        return this.q4(j0, b, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    public final io.reactivex.flowables.a<T> p5(final j0 j0) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return d3.g9(this.i5(), j0);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("custom")
    @f
    public final l<T> p6(@f final j0 j0, final boolean b) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P(new x3((l<Object>)this, j0, b));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    @f
    public final l<T> p7(final long n, final TimeUnit timeUnit, final j0 j0, final b<? extends T> b) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        return this.v7(n, timeUnit, b, j0);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final <U, V> l<l<T>> p8(final b<U> b, final o<? super U, ? extends b<V>> o) {
        return this.q8((o7.b<Object>)b, (o<? super Object, ? extends o7.b<Object>>)o, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final Iterable<T> q(final int n) {
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return new io.reactivex.internal.operators.flowable.b<T>(this, n);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> q1(final o<? super T, ? extends q0<? extends R>> o) {
        return this.s1(o, true, 2);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final l<T> q2(final x5.r<? super T> r) {
        io.reactivex.internal.functions.b.g(r, "predicate is null");
        return io.reactivex.plugins.a.P(new y0((l<Object>)this, (x5.r<? super Object>)r));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("custom")
    @f
    public final l<T> q4(final j0 j0, final boolean b, final int n) {
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return io.reactivex.plugins.a.P(new j2((l<Object>)this, j0, b, n));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> q5() {
        return this.s5(Long.MAX_VALUE, io.reactivex.internal.functions.a.c());
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    public final <E extends o7.c<? super T>> E q6(final E e) {
        this.e(e);
        return e;
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("io.reactivex:computation")
    @f
    public final l<T> q7(final long n, final TimeUnit timeUnit, final b<? extends T> b) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        return this.v7(n, timeUnit, b, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    @f
    public final <U, V> l<l<T>> q8(final b<U> b, final o<? super U, ? extends b<V>> o, final int n) {
        io.reactivex.internal.functions.b.g(b, "openingIndicator is null");
        io.reactivex.internal.functions.b.g(o, "closingIndicator is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        return io.reactivex.plugins.a.P((l<l<T>>)new u4((l<Object>)this, (o7.b<Object>)b, (o<? super Object, ? extends o7.b<Object>>)o, n));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final T r() {
        final io.reactivex.internal.subscribers.e<T> e = (io.reactivex.internal.subscribers.e<T>)new io.reactivex.internal.subscribers.e<Object>();
        this.m6(e);
        final Object a = e.a();
        if (a != null) {
            return (T)a;
        }
        throw new NoSuchElementException();
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> r1(final o<? super T, ? extends q0<? extends R>> o, final boolean b) {
        return this.s1(o, b, 2);
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    public final k0<T> r2(final T t) {
        return this.l2(0L, t);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final <U> l<U> r4(final Class<U> clazz) {
        io.reactivex.internal.functions.b.g(clazz, "clazz is null");
        return (l<U>)this.q2(io.reactivex.internal.functions.a.l(clazz)).e0((Class<Object>)clazz);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> r5(final long n) {
        return this.s5(n, io.reactivex.internal.functions.a.c());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> r6(final b<? extends T> b) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        return io.reactivex.plugins.a.P(new y3((l<Object>)this, b));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final <U, V> l<T> r7(final b<U> b, final o<? super T, ? extends b<V>> o) {
        io.reactivex.internal.functions.b.g(b, "firstTimeoutIndicator is null");
        return this.w7((o7.b<Object>)b, (o<? super T, ? extends o7.b<Object>>)o, (b<? extends T>)null);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final <R> l<R> r8(final Iterable<? extends b<?>> iterable, final o<? super Object[], R> o) {
        io.reactivex.internal.functions.b.g(iterable, "others is null");
        io.reactivex.internal.functions.b.g(o, "combiner is null");
        return io.reactivex.plugins.a.P((l<R>)new y4((l<Object>)this, iterable, (o<? super Object[], Object>)o));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final T s(T t) {
        final io.reactivex.internal.subscribers.e<T> e = (io.reactivex.internal.subscribers.e<T>)new io.reactivex.internal.subscribers.e<Object>();
        this.m6(e);
        final Object a = e.a();
        if (a != null) {
            t = (T)a;
        }
        return t;
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <R> l<R> s1(final o<? super T, ? extends q0<? extends R>> o, final boolean b, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        io.reactivex.internal.util.j j;
        if (b) {
            j = io.reactivex.internal.util.j.I;
        }
        else {
            j = io.reactivex.internal.util.j.H;
        }
        return io.reactivex.plugins.a.P((l<R>)new io.reactivex.internal.operators.mixed.e((l<Object>)this, (o<? super Object, ? extends q0<?>>)o, j, n));
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    public final s<T> s2() {
        return this.k2(0L);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final l<T> s4() {
        return this.w4(b0(), false, true);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> s5(final long lng, final x5.r<? super Throwable> r) {
        if (lng >= 0L) {
            io.reactivex.internal.functions.b.g(r, "predicate is null");
            return io.reactivex.plugins.a.P(new f3((l<Object>)this, lng, r));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("times >= 0 required but it was ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> s6(final o<? super T, ? extends b<? extends R>> o) {
        return this.t6(o, b0());
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <U, V> l<T> s7(final b<U> b, final o<? super T, ? extends b<V>> o, final b<? extends T> b2) {
        io.reactivex.internal.functions.b.g(b, "firstTimeoutSelector is null");
        io.reactivex.internal.functions.b.g(b2, "other is null");
        return this.w7((o7.b<Object>)b, (o<? super T, ? extends o7.b<Object>>)o, b2);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final <T1, T2, T3, T4, R> l<R> s8(final b<T1> b, final b<T2> b2, final b<T3> b3, final b<T4> b4, final j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> j) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        io.reactivex.internal.functions.b.g(b4, "source4 is null");
        return (l<R>)this.w8(new b[] { b, b2, b3, b4 }, (o)io.reactivex.internal.functions.a.A((j<Object, Object, Object, Object, Object, Object>)j));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final Iterable<T> t() {
        return new io.reactivex.internal.operators.flowable.c<T>((o7.b<? extends T>)this);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<T> t1(@f final io.reactivex.i i) {
        io.reactivex.internal.functions.b.g(i, "other is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.a0((l<Object>)this, i));
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    public final k0<T> t2() {
        return this.m2(0L);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final l<T> t4(final int n) {
        return this.w4(n, false, false);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> t5(final x5.d<? super Integer, ? super Throwable> d) {
        io.reactivex.internal.functions.b.g(d, "predicate is null");
        return io.reactivex.plugins.a.P(new e3((l<Object>)this, d));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> t6(final o<? super T, ? extends b<? extends R>> o, final int n) {
        return this.u6(o, n, false);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final <V> l<T> t7(final o<? super T, ? extends b<V>> o) {
        return this.w7((o7.b<Object>)null, (o<? super T, ? extends o7.b<Object>>)o, (b<? extends T>)null);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final <T1, T2, T3, R> l<R> t8(final b<T1> b, final b<T2> b2, final b<T3> b3, final i<? super T, ? super T1, ? super T2, ? super T3, R> i) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        io.reactivex.internal.functions.b.g(b3, "source3 is null");
        return (l<R>)this.w8(new b[] { b, b2, b3 }, (o)io.reactivex.internal.functions.a.z((i<Object, Object, Object, Object, Object>)i));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final Iterable<T> u(final T t) {
        return new io.reactivex.internal.operators.flowable.d<T>(this, t);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> u1(@f final io.reactivex.y<? extends T> y) {
        io.reactivex.internal.functions.b.g(y, "other is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.b0((l<Object>)this, y));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> u2(final o<? super T, ? extends b<? extends R>> o) {
        return this.F2(o, false, b0(), b0());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final l<T> u4(final int n, final x5.a a) {
        return this.x4(n, false, false, a);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> u5(final x5.r<? super Throwable> r) {
        return this.s5(Long.MAX_VALUE, r);
    }
    
     <R> l<R> u6(final o<? super T, ? extends b<? extends R>> o, final int n, final boolean b) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "bufferSize");
        if (!(this instanceof y5.m)) {
            return io.reactivex.plugins.a.P((l<R>)new z3((l<Object>)this, (o<? super Object, ? extends o7.b<?>>)o, n, b));
        }
        final Object call = ((y5.m)this).call();
        if (call == null) {
            return n2();
        }
        return (l<R>)j3.a(call, (o<? super Object, ? extends o7.b<?>>)o);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final <V> l<T> u7(final o<? super T, ? extends b<V>> o, final l<? extends T> l) {
        io.reactivex.internal.functions.b.g(l, "other is null");
        return this.w7((o7.b<Object>)null, (o<? super T, ? extends o7.b<Object>>)o, (b<? extends T>)l);
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final <T1, T2, R> l<R> u8(final b<T1> b, final b<T2> b2, final x5.h<? super T, ? super T1, ? super T2, R> h) {
        io.reactivex.internal.functions.b.g(b, "source1 is null");
        io.reactivex.internal.functions.b.g(b2, "source2 is null");
        return (l<R>)this.w8(new b[] { b, b2 }, (o)io.reactivex.internal.functions.a.y((x5.h<Object, Object, Object, Object>)h));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final Iterable<T> v() {
        return new io.reactivex.internal.operators.flowable.e<T>((o7.b<? extends T>)this);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final l<T> v1(@f final q0<? extends T> q0) {
        io.reactivex.internal.functions.b.g(q0, "other is null");
        return io.reactivex.plugins.a.P(new c0((l<Object>)this, q0));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <R> l<R> v2(final o<? super T, ? extends b<? extends R>> o, final int n) {
        return this.F2(o, false, n, b0());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    public final l<T> v4(final int n, final boolean b) {
        return this.w4(n, b, false);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> v5(final x5.e e) {
        io.reactivex.internal.functions.b.g(e, "stop is null");
        return this.s5(Long.MAX_VALUE, io.reactivex.internal.functions.a.v(e));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final io.reactivex.c v6(@f final o<? super T, ? extends io.reactivex.i> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.f<Object>(this, o, false));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final <U, R> l<R> v8(final b<? extends U> b, final c<? super T, ? super U, ? extends R> c) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        io.reactivex.internal.functions.b.g(c, "combiner is null");
        return io.reactivex.plugins.a.P((l<R>)new x4((l<Object>)this, (c<? super Object, ? super Object, ?>)c, b));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final T w() {
        return this.P5().k();
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> w1(final b<? extends T> b) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        return E0((o7.b<? extends T>)this, b);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <U, R> l<R> w2(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c) {
        return this.A2((o<? super T, ? extends o7.b<?>>)o, (c<? super T, ? super Object, ? extends R>)c, false, b0(), b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final k0<Boolean> w3() {
        return this.a(io.reactivex.internal.functions.a.b());
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    public final l<T> w4(final int n, final boolean b, final boolean b2) {
        io.reactivex.internal.functions.b.h(n, "capacity");
        return io.reactivex.plugins.a.P(new k2((l<Object>)this, n, b2, b, io.reactivex.internal.functions.a.c));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    @f
    public final l<T> w5(final o<? super l<Throwable>, ? extends b<?>> o) {
        io.reactivex.internal.functions.b.g(o, "handler is null");
        return io.reactivex.plugins.a.P(new g3((l<Object>)this, o));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final io.reactivex.c w6(@f final o<? super T, ? extends io.reactivex.i> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.f<Object>(this, o, true));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    @f
    public final <R> l<R> w8(final Publisher<?>[] array, final o<? super Object[], R> o) {
        io.reactivex.internal.functions.b.g(array, "others is null");
        io.reactivex.internal.functions.b.g(o, "combiner is null");
        return io.reactivex.plugins.a.P((l<R>)new y4((l)this, (b[])array, (o)o));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final T x(final T t) {
        return this.N5(t).k();
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final k0<Boolean> x1(final Object o) {
        io.reactivex.internal.functions.b.g(o, "item is null");
        return this.j(io.reactivex.internal.functions.a.i(o));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <U, R> l<R> x2(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final int n) {
        return this.A2((o<? super T, ? extends o7.b<?>>)o, (c<? super T, ? super Object, ? extends R>)c, false, n, b0());
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("none")
    @f
    public final <TRight, TLeftEnd, TRightEnd, R> l<R> x3(final b<? extends TRight> b, final o<? super T, ? extends b<TLeftEnd>> o, final o<? super TRight, ? extends b<TRightEnd>> o2, final c<? super T, ? super TRight, ? extends R> c) {
        io.reactivex.internal.functions.b.g(b, "other is null");
        io.reactivex.internal.functions.b.g(o, "leftEnd is null");
        io.reactivex.internal.functions.b.g(o2, "rightEnd is null");
        io.reactivex.internal.functions.b.g(c, "resultSelector is null");
        return io.reactivex.plugins.a.P((l<R>)new v1((l<Object>)this, b, (o<? super Object, ? extends o7.b<Object>>)o, (o<? super Object, ? extends o7.b<Object>>)o2, (c<? super Object, ? super Object, ?>)c));
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    @f
    public final l<T> x4(final int n, final boolean b, final boolean b2, final x5.a a) {
        io.reactivex.internal.functions.b.g(a, "onOverflow is null");
        io.reactivex.internal.functions.b.h(n, "capacity");
        return io.reactivex.plugins.a.P(new k2((l<Object>)this, n, b2, b, a));
    }
    
    @io.reactivex.annotations.b(a.G)
    @h("none")
    public final void x5(final o7.c<? super T> c) {
        io.reactivex.internal.functions.b.g(c, "s is null");
        if (c instanceof io.reactivex.subscribers.d) {
            this.m6((io.reactivex.q<? super T>)c);
        }
        else {
            this.m6(new io.reactivex.subscribers.d<Object>(c));
        }
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    public final <R> l<R> x6(final o<? super T, ? extends b<? extends R>> o) {
        return this.y6(o, b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @h("none")
    public final void y() {
        io.reactivex.internal.operators.flowable.l.a((o7.b<?>)this);
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final k0<Long> y1() {
        return io.reactivex.plugins.a.S((k0<Long>)new e0<Object>(this));
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <U, R> l<R> y2(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b) {
        return this.A2((o<? super T, ? extends o7.b<?>>)o, (c<? super T, ? super Object, ? extends R>)c, b, b0(), b0());
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    @f
    public final l<T> y4(final long n, final x5.a a, final io.reactivex.a a2) {
        io.reactivex.internal.functions.b.g(a2, "overflowStrategy is null");
        io.reactivex.internal.functions.b.i(n, "capacity");
        return io.reactivex.plugins.a.P(new l2((l<Object>)this, n, a, a2));
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("io.reactivex:computation")
    public final l<T> y5(final long n, final TimeUnit timeUnit) {
        return this.z5(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @io.reactivex.annotations.b(a.I)
    @d
    @h("none")
    public final <R> l<R> y6(final o<? super T, ? extends b<? extends R>> o, final int n) {
        return this.u6(o, n, true);
    }
    
    @io.reactivex.annotations.b(a.H)
    @d
    @h("none")
    public final <U, R> l<R> z2(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b, final int n) {
        return this.A2((o<? super T, ? extends o7.b<?>>)o, (c<? super T, ? super Object, ? extends R>)c, b, n, b0());
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    public final l<T> z4(final boolean b) {
        return this.w4(b0(), b, true);
    }
    
    @io.reactivex.annotations.b(a.K)
    @d
    @h("custom")
    @f
    public final l<T> z5(final long n, final TimeUnit timeUnit, final j0 j0) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0, "scheduler is null");
        return io.reactivex.plugins.a.P(new i3((l<Object>)this, n, timeUnit, j0, false));
    }
    
    @io.reactivex.annotations.b(a.J)
    @d
    @h("none")
    @f
    public final <R> l<R> z6(@f final o<? super T, ? extends io.reactivex.y<? extends R>> o) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        return io.reactivex.plugins.a.P((l<R>)new io.reactivex.internal.operators.mixed.g((l<Object>)this, (o<? super Object, ? extends io.reactivex.y<?>>)o, false));
    }
    
    @io.reactivex.annotations.b(a.G)
    @d
    @h("none")
    public final l<io.reactivex.schedulers.d<T>> z7() {
        return this.C7(TimeUnit.MILLISECONDS, io.reactivex.schedulers.b.a());
    }
}
