// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex;

import io.reactivex.internal.operators.completable.h0;
import io.reactivex.internal.operators.completable.z;
import io.reactivex.internal.operators.completable.p0;
import io.reactivex.internal.operators.completable.x;
import io.reactivex.internal.operators.completable.o0;
import io.reactivex.internal.util.k;
import io.reactivex.internal.operators.completable.l0;
import io.reactivex.internal.operators.completable.m;
import io.reactivex.internal.operators.completable.k0;
import io.reactivex.internal.observers.j;
import io.reactivex.internal.operators.completable.n;
import io.reactivex.internal.operators.completable.f0;
import io.reactivex.internal.operators.completable.d0;
import io.reactivex.internal.operators.completable.c0;
import io.reactivex.internal.operators.completable.b0;
import io.reactivex.internal.operators.completable.r0;
import io.reactivex.internal.operators.completable.a0;
import io.reactivex.internal.operators.completable.w;
import io.reactivex.internal.operators.completable.e0;
import io.reactivex.internal.operators.completable.v;
import io.reactivex.internal.operators.completable.u;
import io.reactivex.internal.operators.completable.t;
import io.reactivex.internal.operators.completable.s;
import io.reactivex.internal.operators.completable.n0;
import io.reactivex.internal.operators.maybe.q0;
import java.util.concurrent.Future;
import io.reactivex.internal.operators.completable.m0;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.operators.completable.r;
import io.reactivex.internal.operators.completable.q;
import io.reactivex.internal.operators.completable.p;
import io.reactivex.internal.operators.completable.o;
import io.reactivex.internal.operators.completable.i0;
import java.util.concurrent.Callable;
import io.reactivex.annotations.f;
import io.reactivex.annotations.h;
import io.reactivex.annotations.d;
import io.reactivex.plugins.a;
import io.reactivex.internal.operators.completable.e;
import io.reactivex.internal.functions.b;

public abstract class c implements i
{
    @d
    @h("none")
    @f
    public static c A(final i... array) {
        b.g(array, "sources is null");
        if (array.length == 0) {
            return v();
        }
        if (array.length == 1) {
            return j1(array[0]);
        }
        return a.O(new e(array));
    }
    
    @d
    @h("none")
    @f
    public static c C(final g g) {
        b.g(g, "source is null");
        return a.O(new io.reactivex.internal.operators.completable.g(g));
    }
    
    @d
    @h("none")
    @f
    public static c D(final Callable<? extends i> callable) {
        b.g(callable, "completableSupplier");
        return a.O(new io.reactivex.internal.operators.completable.h(callable));
    }
    
    @d
    @h("none")
    @f
    private c P(final x5.g<? super io.reactivex.disposables.c> g, final x5.g<? super Throwable> g2, final x5.a a, final x5.a a2, final x5.a a3, final x5.a a4) {
        b.g(g, "onSubscribe is null");
        b.g(g2, "onError is null");
        b.g(a, "onComplete is null");
        b.g(a2, "onTerminate is null");
        b.g(a3, "onAfterTerminate is null");
        b.g(a4, "onDispose is null");
        return a.O(new i0(this, g, g2, a, a2, a3, a4));
    }
    
    @d
    @h("none")
    @f
    public static c S(final Throwable t) {
        b.g(t, "error is null");
        return a.O(new o(t));
    }
    
    @d
    @h("none")
    @f
    public static c T(final Callable<? extends Throwable> callable) {
        b.g(callable, "errorSupplier is null");
        return a.O(new p(callable));
    }
    
    @d
    @h("none")
    @f
    public static c U(final x5.a a) {
        b.g(a, "run is null");
        return a.O(new q(a));
    }
    
    @d
    @h("none")
    @f
    public static c V(final Callable<?> callable) {
        b.g(callable, "callable is null");
        return a.O(new r(callable));
    }
    
    @d
    @h("custom")
    @f
    private c V0(final long n, final TimeUnit timeUnit, final j0 j0, final i i) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return a.O(new m0(this, n, timeUnit, j0, i));
    }
    
    @d
    @h("none")
    @f
    public static c W(final Future<?> future) {
        b.g(future, "future is null");
        return U(io.reactivex.internal.functions.a.j(future));
    }
    
    @d
    @h("io.reactivex:computation")
    public static c W0(final long n, final TimeUnit timeUnit) {
        return X0(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    @f
    public static <T> c X(final y<T> y) {
        b.g(y, "maybe is null");
        return a.O(new q0<Object>(y));
    }
    
    @d
    @h("custom")
    @f
    public static c X0(final long n, final TimeUnit timeUnit, final j0 j0) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return a.O(new n0(n, timeUnit, j0));
    }
    
    @d
    @h("none")
    @f
    public static <T> c Y(final g0<T> g0) {
        b.g(g0, "observable is null");
        return a.O(new s<Object>(g0));
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.J)
    @d
    @h("none")
    @f
    public static <T> c Z(final o7.b<T> b) {
        b.g(b, "publisher is null");
        return a.O(new t<Object>(b));
    }
    
    @d
    @h("none")
    @f
    public static c a0(final Runnable runnable) {
        b.g(runnable, "run is null");
        return a.O(new u(runnable));
    }
    
    @d
    @h("none")
    @f
    public static <T> c b0(final io.reactivex.q0<T> q0) {
        b.g(q0, "single is null");
        return a.O(new v<Object>(q0));
    }
    
    private static NullPointerException b1(final Throwable cause) {
        final NullPointerException ex = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        ex.initCause(cause);
        return ex;
    }
    
    @d
    @h("none")
    @f
    public static c d(final Iterable<? extends i> iterable) {
        b.g(iterable, "sources is null");
        return a.O(new io.reactivex.internal.operators.completable.a(null, iterable));
    }
    
    @d
    @h("none")
    @f
    public static c f0(final Iterable<? extends i> iterable) {
        b.g(iterable, "sources is null");
        return a.O(new e0(iterable));
    }
    
    @d
    @h("none")
    @f
    public static c f1(final i i) {
        b.g(i, "source is null");
        if (!(i instanceof c)) {
            return a.O(new w(i));
        }
        throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.J)
    @d
    @h("none")
    public static c g0(final o7.b<? extends i> b) {
        return i0(b, Integer.MAX_VALUE, false);
    }
    
    @d
    @h("none")
    @f
    public static c h(final i... array) {
        b.g(array, "sources is null");
        if (array.length == 0) {
            return v();
        }
        if (array.length == 1) {
            return j1(array[0]);
        }
        return a.O(new io.reactivex.internal.operators.completable.a(array, null));
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.H)
    @d
    @h("none")
    public static c h0(final o7.b<? extends i> b, final int n) {
        return i0(b, n, false);
    }
    
    @d
    @h("none")
    public static <R> c h1(final Callable<R> callable, final x5.o<? super R, ? extends i> o, final x5.g<? super R> g) {
        return i1(callable, o, g, true);
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.H)
    @d
    @h("none")
    @f
    private static c i0(final o7.b<? extends i> b, final int n, final boolean b2) {
        b.g(b, "sources is null");
        b.h(n, "maxConcurrency");
        return a.O(new a0(b, n, b2));
    }
    
    @d
    @h("none")
    @f
    public static <R> c i1(final Callable<R> callable, final x5.o<? super R, ? extends i> o, final x5.g<? super R> g, final boolean b) {
        b.g(callable, "resourceSupplier is null");
        b.g(o, "completableFunction is null");
        b.g(g, "disposer is null");
        return a.O(new r0<Object>(callable, o, g, b));
    }
    
    @d
    @h("none")
    @f
    public static c j0(final i... array) {
        b.g(array, "sources is null");
        if (array.length == 0) {
            return v();
        }
        if (array.length == 1) {
            return j1(array[0]);
        }
        return a.O(new b0(array));
    }
    
    @d
    @h("none")
    @f
    public static c j1(final i i) {
        b.g(i, "source is null");
        if (i instanceof c) {
            return a.O((c)i);
        }
        return a.O(new w(i));
    }
    
    @d
    @h("none")
    @f
    public static c k0(final i... array) {
        b.g(array, "sources is null");
        return a.O(new c0(array));
    }
    
    @d
    @h("none")
    @f
    public static c l0(final Iterable<? extends i> iterable) {
        b.g(iterable, "sources is null");
        return a.O(new d0(iterable));
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.J)
    @d
    @h("none")
    public static c m0(final o7.b<? extends i> b) {
        return i0(b, Integer.MAX_VALUE, true);
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.H)
    @d
    @h("none")
    public static c n0(final o7.b<? extends i> b, final int n) {
        return i0(b, n, true);
    }
    
    @d
    @h("none")
    public static c p0() {
        return a.O(f0.G);
    }
    
    @d
    @h("none")
    @f
    public static c v() {
        return a.O(n.G);
    }
    
    @d
    @h("none")
    @f
    public static c x(final Iterable<? extends i> iterable) {
        b.g(iterable, "sources is null");
        return a.O(new io.reactivex.internal.operators.completable.f(iterable));
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.H)
    @d
    @h("none")
    public static c y(final o7.b<? extends i> b) {
        return z(b, 2);
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.H)
    @d
    @h("none")
    @f
    public static c z(final o7.b<? extends i> b, final int n) {
        b.g(b, "sources is null");
        b.h(n, "prefetch");
        return a.O(new io.reactivex.internal.operators.completable.d(b, n));
    }
    
    @d
    @h("none")
    public final c A0(final long n) {
        return Z((o7.b<Object>)this.Z0().r5(n));
    }
    
    @d
    @h("none")
    @f
    public final c B(final i i) {
        b.g(i, "other is null");
        return a.O(new io.reactivex.internal.operators.completable.b(this, i));
    }
    
    @d
    @h("none")
    public final c B0(final long n, final x5.r<? super Throwable> r) {
        return Z((o7.b<Object>)this.Z0().s5(n, r));
    }
    
    @d
    @h("none")
    public final c C0(final x5.d<? super Integer, ? super Throwable> d) {
        return Z((o7.b<Object>)this.Z0().t5(d));
    }
    
    @d
    @h("none")
    public final c D0(final x5.r<? super Throwable> r) {
        return Z((o7.b<Object>)this.Z0().u5(r));
    }
    
    @d
    @h("io.reactivex:computation")
    public final c E(final long n, final TimeUnit timeUnit) {
        return this.G(n, timeUnit, io.reactivex.schedulers.b.a(), false);
    }
    
    @d
    @h("none")
    public final c E0(final x5.o<? super l<Throwable>, ? extends o7.b<?>> o) {
        return Z((o7.b<Object>)this.Z0().w5(o));
    }
    
    @d
    @h("custom")
    public final c F(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.G(n, timeUnit, j0, false);
    }
    
    @d
    @h("none")
    @f
    public final c F0(final i i) {
        b.g(i, "other is null");
        return A(i, this);
    }
    
    @d
    @h("custom")
    @f
    public final c G(final long n, final TimeUnit timeUnit, final j0 j0, final boolean b) {
        b.g(timeUnit, "unit is null");
        b.g(j0, "scheduler is null");
        return a.O(new io.reactivex.internal.operators.completable.i(this, n, timeUnit, j0, b));
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.H)
    @d
    @h("none")
    @f
    public final <T> l<T> G0(final o7.b<T> b) {
        b.g(b, "other is null");
        return this.Z0().f6((o7.b<? extends T>)b);
    }
    
    @d
    @h("io.reactivex:computation")
    @io.reactivex.annotations.e
    public final c H(final long n, final TimeUnit timeUnit) {
        return this.I(n, timeUnit, io.reactivex.schedulers.b.a());
    }
    
    @d
    @h("none")
    @f
    public final <T> io.reactivex.b0<T> H0(final io.reactivex.b0<T> b0) {
        b.g(b0, "other is null");
        return b0.q1((g0<? extends T>)this.c1());
    }
    
    @d
    @h("custom")
    @io.reactivex.annotations.e
    public final c I(final long n, final TimeUnit timeUnit, final j0 j0) {
        return X0(n, timeUnit, j0).j(this);
    }
    
    @h("none")
    public final io.reactivex.disposables.c I0() {
        final io.reactivex.internal.observers.o o = new io.reactivex.internal.observers.o();
        this.c(o);
        return o;
    }
    
    @d
    @h("none")
    public final c J(final x5.a a) {
        final x5.g<? super io.reactivex.disposables.c> h = io.reactivex.internal.functions.a.h();
        final x5.g<? super Throwable> h2 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return this.P(h, h2, c, c, a, c);
    }
    
    @d
    @h("none")
    @f
    public final io.reactivex.disposables.c J0(final x5.a a) {
        b.g(a, "onComplete is null");
        final j j = new j(a);
        this.c(j);
        return j;
    }
    
    @d
    @h("none")
    @f
    public final c K(final x5.a a) {
        b.g(a, "onFinally is null");
        return a.O(new io.reactivex.internal.operators.completable.l(this, a));
    }
    
    @d
    @h("none")
    @f
    public final io.reactivex.disposables.c K0(final x5.a a, final x5.g<? super Throwable> g) {
        b.g(g, "onError is null");
        b.g(a, "onComplete is null");
        final j j = new j(g, a);
        this.c(j);
        return j;
    }
    
    @d
    @h("none")
    public final c L(final x5.a a) {
        final x5.g<? super io.reactivex.disposables.c> h = io.reactivex.internal.functions.a.h();
        final x5.g<? super Throwable> h2 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return this.P(h, h2, a, c, c, c);
    }
    
    protected abstract void L0(final io.reactivex.f p0);
    
    @d
    @h("none")
    public final c M(final x5.a a) {
        final x5.g<? super io.reactivex.disposables.c> h = io.reactivex.internal.functions.a.h();
        final x5.g<? super Throwable> h2 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return this.P(h, h2, c, c, c, a);
    }
    
    @d
    @h("custom")
    @f
    public final c M0(final j0 j0) {
        b.g(j0, "scheduler is null");
        return a.O(new k0(this, j0));
    }
    
    @d
    @h("none")
    public final c N(final x5.g<? super Throwable> g) {
        final x5.g<? super io.reactivex.disposables.c> h = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return this.P(h, g, c, c, c, c);
    }
    
    @d
    @h("none")
    public final <E extends io.reactivex.f> E N0(final E e) {
        this.c(e);
        return e;
    }
    
    @d
    @h("none")
    @f
    public final c O(final x5.g<? super Throwable> g) {
        b.g(g, "onEvent is null");
        return a.O(new m(this, g));
    }
    
    @d
    @h("none")
    @f
    public final c O0(final i i) {
        b.g(i, "other is null");
        return a.O(new l0(this, i));
    }
    
    @d
    @h("none")
    public final io.reactivex.observers.n<Void> P0() {
        final io.reactivex.observers.n<Void> n = new io.reactivex.observers.n<Void>();
        this.c(n);
        return n;
    }
    
    @d
    @h("none")
    public final c Q(final x5.g<? super io.reactivex.disposables.c> g) {
        final x5.g<? super Throwable> h = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return this.P(g, h, c, c, c, c);
    }
    
    @d
    @h("none")
    public final io.reactivex.observers.n<Void> Q0(final boolean b) {
        final io.reactivex.observers.n<Void> n = new io.reactivex.observers.n<Void>();
        if (b) {
            n.cancel();
        }
        this.c(n);
        return n;
    }
    
    @d
    @h("none")
    public final c R(final x5.a a) {
        final x5.g<? super io.reactivex.disposables.c> h = io.reactivex.internal.functions.a.h();
        final x5.g<? super Throwable> h2 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return this.P(h, h2, c, a, c, c);
    }
    
    @d
    @h("io.reactivex:computation")
    public final c R0(final long n, final TimeUnit timeUnit) {
        return this.V0(n, timeUnit, io.reactivex.schedulers.b.a(), null);
    }
    
    @d
    @h("io.reactivex:computation")
    @f
    public final c S0(final long n, final TimeUnit timeUnit, final i i) {
        b.g(i, "other is null");
        return this.V0(n, timeUnit, io.reactivex.schedulers.b.a(), i);
    }
    
    @d
    @h("custom")
    public final c T0(final long n, final TimeUnit timeUnit, final j0 j0) {
        return this.V0(n, timeUnit, j0, null);
    }
    
    @d
    @h("custom")
    @f
    public final c U0(final long n, final TimeUnit timeUnit, final j0 j0, final i i) {
        b.g(i, "other is null");
        return this.V0(n, timeUnit, j0, i);
    }
    
    @d
    @h("none")
    public final <U> U Y0(final x5.o<? super c, U> o) {
        try {
            return b.g(o, "converter is null").apply(this);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            throw k.f(t);
        }
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.H)
    @d
    @h("none")
    public final <T> l<T> Z0() {
        if (this instanceof y5.b) {
            return ((y5.b)this).g();
        }
        return a.P(new o0<T>(this));
    }
    
    @d
    @h("none")
    public final <T> io.reactivex.s<T> a1() {
        if (this instanceof y5.c) {
            return ((y5.c)this).e();
        }
        return a.Q(new io.reactivex.internal.operators.maybe.k0<T>(this));
    }
    
    @h("none")
    @Override
    public final void c(io.reactivex.f d0) {
        b.g(d0, "observer is null");
        try {
            d0 = a.d0(this, d0);
            b.g(d0, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.L0(d0);
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            a.Y(t);
            throw b1(t);
        }
    }
    
    @d
    @h("none")
    public final c c0() {
        return a.O(new x(this));
    }
    
    @d
    @h("none")
    public final <T> io.reactivex.b0<T> c1() {
        if (this instanceof y5.d) {
            return ((y5.d)this).a();
        }
        return a.R(new p0<T>(this));
    }
    
    @d
    @h("none")
    @f
    public final c d0(final io.reactivex.h h) {
        b.g(h, "onLift is null");
        return a.O(new io.reactivex.internal.operators.completable.y(this, h));
    }
    
    @d
    @h("none")
    @f
    public final <T> io.reactivex.k0<T> d1(final Callable<? extends T> callable) {
        b.g(callable, "completionValueSupplier is null");
        return a.S(new io.reactivex.internal.operators.completable.q0<T>(this, callable, null));
    }
    
    @d
    @h("none")
    @io.reactivex.annotations.e
    public final <T> io.reactivex.k0<io.reactivex.a0<T>> e0() {
        return a.S(new z(this));
    }
    
    @d
    @h("none")
    @f
    public final <T> io.reactivex.k0<T> e1(final T t) {
        b.g(t, "completionValue is null");
        return a.S(new io.reactivex.internal.operators.completable.q0<T>(this, null, t));
    }
    
    @d
    @h("custom")
    @f
    public final c g1(final j0 j0) {
        b.g(j0, "scheduler is null");
        return a.O(new io.reactivex.internal.operators.completable.k(this, j0));
    }
    
    @d
    @h("none")
    @f
    public final c i(final i i) {
        b.g(i, "other is null");
        return h(this, i);
    }
    
    @d
    @h("none")
    public final c j(final i i) {
        b.g(i, "next is null");
        return a.O(new io.reactivex.internal.operators.completable.b(this, i));
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.H)
    @d
    @h("none")
    @f
    public final <T> l<T> k(final o7.b<T> b) {
        b.g(b, "next is null");
        return a.P(new io.reactivex.internal.operators.mixed.b<T>(this, (o7.b<? extends T>)b));
    }
    
    @d
    @h("none")
    @f
    public final <T> io.reactivex.s<T> m(final y<T> y) {
        b.g(y, "next is null");
        return a.Q(new io.reactivex.internal.operators.maybe.o<T>(y, this));
    }
    
    @d
    @h("none")
    @f
    public final <T> io.reactivex.b0<T> n(final g0<T> g0) {
        b.g(g0, "next is null");
        return a.R(new io.reactivex.internal.operators.mixed.a<T>(this, (g0<? extends T>)g0));
    }
    
    @d
    @h("none")
    @f
    public final <T> io.reactivex.k0<T> o(final io.reactivex.q0<T> q0) {
        b.g(q0, "next is null");
        return a.S(new io.reactivex.internal.operators.single.g<T>(q0, this));
    }
    
    @d
    @h("none")
    @f
    public final c o0(final i i) {
        b.g(i, "other is null");
        return j0(this, i);
    }
    
    @d
    @h("none")
    public final <R> R p(@f final io.reactivex.d<? extends R> d) {
        return (R)b.g(d, "converter is null").a(this);
    }
    
    @h("none")
    public final void q() {
        final io.reactivex.internal.observers.h h = new io.reactivex.internal.observers.h();
        this.c(h);
        h.c();
    }
    
    @d
    @h("custom")
    @f
    public final c q0(final j0 j0) {
        b.g(j0, "scheduler is null");
        return a.O(new io.reactivex.internal.operators.completable.g0(this, j0));
    }
    
    @d
    @h("none")
    @f
    public final boolean r(final long n, final TimeUnit timeUnit) {
        b.g(timeUnit, "unit is null");
        final io.reactivex.internal.observers.h h = new io.reactivex.internal.observers.h();
        this.c(h);
        return h.a(n, timeUnit);
    }
    
    @d
    @h("none")
    public final c r0() {
        return this.s0(io.reactivex.internal.functions.a.c());
    }
    
    @d
    @h("none")
    @io.reactivex.annotations.g
    public final Throwable s() {
        final io.reactivex.internal.observers.h h = new io.reactivex.internal.observers.h();
        this.c(h);
        return h.g();
    }
    
    @d
    @h("none")
    @f
    public final c s0(final x5.r<? super Throwable> r) {
        b.g(r, "predicate is null");
        return a.O(new h0(this, r));
    }
    
    @d
    @h("none")
    @io.reactivex.annotations.g
    public final Throwable t(final long n, final TimeUnit timeUnit) {
        b.g(timeUnit, "unit is null");
        final io.reactivex.internal.observers.h h = new io.reactivex.internal.observers.h();
        this.c(h);
        return h.h(n, timeUnit);
    }
    
    @d
    @h("none")
    @f
    public final c t0(final x5.o<? super Throwable, ? extends i> o) {
        b.g(o, "errorMapper is null");
        return a.O(new io.reactivex.internal.operators.completable.j0(this, o));
    }
    
    @d
    @h("none")
    public final c u() {
        return a.O(new io.reactivex.internal.operators.completable.c(this));
    }
    
    @d
    @h("none")
    public final c u0() {
        return a.O(new io.reactivex.internal.operators.completable.j(this));
    }
    
    @d
    @h("none")
    public final c v0() {
        return Z((o7.b<Object>)this.Z0().W4());
    }
    
    @d
    @h("none")
    public final c w(final io.reactivex.j j) {
        return j1(b.g(j, "transformer is null").a(this));
    }
    
    @d
    @h("none")
    public final c w0(final long n) {
        return Z((o7.b<Object>)this.Z0().X4(n));
    }
    
    @d
    @h("none")
    public final c x0(final x5.e e) {
        return Z((o7.b<Object>)this.Z0().Y4(e));
    }
    
    @d
    @h("none")
    public final c y0(final x5.o<? super l<Object>, ? extends o7.b<?>> o) {
        return Z((o7.b<Object>)this.Z0().Z4(o));
    }
    
    @d
    @h("none")
    public final c z0() {
        return Z((o7.b<Object>)this.Z0().q5());
    }
}
