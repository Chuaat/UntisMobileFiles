// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.plugins;

import io.reactivex.internal.schedulers.r;
import io.reactivex.internal.schedulers.h;
import java.util.concurrent.ThreadFactory;
import io.reactivex.internal.util.k;
import io.reactivex.exceptions.d;
import x5.e;
import io.reactivex.f;
import io.reactivex.n0;
import io.reactivex.i0;
import io.reactivex.v;
import io.reactivex.parallel.b;
import io.reactivex.c;
import io.reactivex.k0;
import io.reactivex.s;
import io.reactivex.b0;
import io.reactivex.l;
import io.reactivex.j0;
import java.util.concurrent.Callable;
import x5.o;
import x5.g;

public final class a
{
    @io.reactivex.annotations.g
    static volatile g<? super Throwable> a;
    @io.reactivex.annotations.g
    static volatile o<? super Runnable, ? extends Runnable> b;
    @io.reactivex.annotations.g
    static volatile o<? super Callable<j0>, ? extends j0> c;
    @io.reactivex.annotations.g
    static volatile o<? super Callable<j0>, ? extends j0> d;
    @io.reactivex.annotations.g
    static volatile o<? super Callable<j0>, ? extends j0> e;
    @io.reactivex.annotations.g
    static volatile o<? super Callable<j0>, ? extends j0> f;
    @io.reactivex.annotations.g
    static volatile o<? super j0, ? extends j0> g;
    @io.reactivex.annotations.g
    static volatile o<? super j0, ? extends j0> h;
    @io.reactivex.annotations.g
    static volatile o<? super j0, ? extends j0> i;
    @io.reactivex.annotations.g
    static volatile o<? super j0, ? extends j0> j;
    @io.reactivex.annotations.g
    static volatile o<? super l, ? extends l> k;
    @io.reactivex.annotations.g
    static volatile o<? super io.reactivex.flowables.a, ? extends io.reactivex.flowables.a> l;
    @io.reactivex.annotations.g
    static volatile o<? super b0, ? extends b0> m;
    @io.reactivex.annotations.g
    static volatile o<? super io.reactivex.observables.a, ? extends io.reactivex.observables.a> n;
    @io.reactivex.annotations.g
    static volatile o<? super s, ? extends s> o;
    @io.reactivex.annotations.g
    static volatile o<? super k0, ? extends k0> p;
    @io.reactivex.annotations.g
    static volatile o<? super c, ? extends c> q;
    @io.reactivex.annotations.g
    static volatile o<? super b, ? extends b> r;
    @io.reactivex.annotations.g
    static volatile x5.c<? super l, ? super o7.c, ? extends o7.c> s;
    @io.reactivex.annotations.g
    static volatile x5.c<? super s, ? super v, ? extends v> t;
    @io.reactivex.annotations.g
    static volatile x5.c<? super b0, ? super i0, ? extends i0> u;
    @io.reactivex.annotations.g
    static volatile x5.c<? super k0, ? super n0, ? extends n0> v;
    @io.reactivex.annotations.g
    static volatile x5.c<? super c, ? super f, ? extends f> w;
    @io.reactivex.annotations.g
    static volatile e x;
    static volatile boolean y;
    static volatile boolean z;
    
    private a() {
        throw new IllegalStateException("No instances!");
    }
    
    @io.reactivex.annotations.g
    public static x5.c<? super b0, ? super i0, ? extends i0> A() {
        return io.reactivex.plugins.a.u;
    }
    
    public static void A0(@io.reactivex.annotations.g final x5.c<? super s, v, ? extends v> t) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.t = t;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super b, ? extends b> B() {
        return io.reactivex.plugins.a.r;
    }
    
    public static void B0(@io.reactivex.annotations.g final o<? super b0, ? extends b0> m) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.m = m;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super k0, ? extends k0> C() {
        return io.reactivex.plugins.a.p;
    }
    
    public static void C0(@io.reactivex.annotations.g final x5.c<? super b0, ? super i0, ? extends i0> u) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.u = u;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static x5.c<? super k0, ? super n0, ? extends n0> D() {
        return io.reactivex.plugins.a.v;
    }
    
    public static void D0(@io.reactivex.annotations.g final o<? super b, ? extends b> r) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.r = r;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super Runnable, ? extends Runnable> E() {
        return io.reactivex.plugins.a.b;
    }
    
    public static void E0(@io.reactivex.annotations.g final o<? super k0, ? extends k0> p) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.p = p;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super j0, ? extends j0> F() {
        return io.reactivex.plugins.a.h;
    }
    
    public static void F0(@io.reactivex.annotations.g final x5.c<? super k0, ? super n0, ? extends n0> v) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.v = v;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.f
    public static j0 G(@io.reactivex.annotations.f final Callable<j0> callable) {
        io.reactivex.internal.functions.b.g(callable, "Scheduler Callable can't be null");
        final o<? super Callable<j0>, ? extends j0> c = io.reactivex.plugins.a.c;
        if (c == null) {
            return d(callable);
        }
        return c(c, callable);
    }
    
    public static void G0(@io.reactivex.annotations.g final o<? super Runnable, ? extends Runnable> b) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.b = b;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.f
    public static j0 H(@io.reactivex.annotations.f final Callable<j0> callable) {
        io.reactivex.internal.functions.b.g(callable, "Scheduler Callable can't be null");
        final o<? super Callable<j0>, ? extends j0> e = io.reactivex.plugins.a.e;
        if (e == null) {
            return d(callable);
        }
        return c(e, callable);
    }
    
    public static void H0(@io.reactivex.annotations.g final o<? super j0, ? extends j0> h) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.h = h;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.f
    public static j0 I(@io.reactivex.annotations.f final Callable<j0> callable) {
        io.reactivex.internal.functions.b.g(callable, "Scheduler Callable can't be null");
        final o<? super Callable<j0>, ? extends j0> f = io.reactivex.plugins.a.f;
        if (f == null) {
            return d(callable);
        }
        return c(f, callable);
    }
    
    static void I0(@io.reactivex.annotations.f final Throwable t) {
        final Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t);
    }
    
    @io.reactivex.annotations.f
    public static j0 J(@io.reactivex.annotations.f final Callable<j0> callable) {
        io.reactivex.internal.functions.b.g(callable, "Scheduler Callable can't be null");
        final o<? super Callable<j0>, ? extends j0> d = io.reactivex.plugins.a.d;
        if (d == null) {
            return d(callable);
        }
        return c(d, callable);
    }
    
    static void J0() {
        io.reactivex.plugins.a.y = false;
    }
    
    static boolean K(final Throwable t) {
        return t instanceof d || t instanceof io.reactivex.exceptions.c || t instanceof IllegalStateException || t instanceof NullPointerException || t instanceof IllegalArgumentException || t instanceof io.reactivex.exceptions.a;
    }
    
    public static boolean L() {
        return io.reactivex.plugins.a.z;
    }
    
    public static boolean M() {
        return io.reactivex.plugins.a.y;
    }
    
    public static void N() {
        io.reactivex.plugins.a.y = true;
    }
    
    @io.reactivex.annotations.f
    public static c O(@io.reactivex.annotations.f final c c) {
        final o<? super c, ? extends c> q = io.reactivex.plugins.a.q;
        c c2 = c;
        if (q != null) {
            c2 = b(q, c);
        }
        return c2;
    }
    
    @io.reactivex.annotations.f
    public static <T> l<T> P(@io.reactivex.annotations.f final l<T> l) {
        final o<? super l, ? extends l> k = io.reactivex.plugins.a.k;
        l<T> i = l;
        if (k != null) {
            i = b((o<l<T>, l<T>>)k, l);
        }
        return i;
    }
    
    @io.reactivex.annotations.f
    public static <T> s<T> Q(@io.reactivex.annotations.f final s<T> s) {
        final o<? super s, ? extends s> o = io.reactivex.plugins.a.o;
        s<T> s2 = s;
        if (o != null) {
            s2 = b((o<s<T>, s<T>>)o, s);
        }
        return s2;
    }
    
    @io.reactivex.annotations.f
    public static <T> b0<T> R(@io.reactivex.annotations.f final b0<T> b0) {
        final o<? super b0, ? extends b0> m = io.reactivex.plugins.a.m;
        b0<T> b2 = b0;
        if (m != null) {
            b2 = b((o<b0<T>, b0<T>>)m, b0);
        }
        return b2;
    }
    
    @io.reactivex.annotations.f
    public static <T> k0<T> S(@io.reactivex.annotations.f final k0<T> k0) {
        final o<? super k0, ? extends k0> p = io.reactivex.plugins.a.p;
        k0<T> k2 = k0;
        if (p != null) {
            k2 = b((o<k0<T>, k0<T>>)p, k0);
        }
        return k2;
    }
    
    @io.reactivex.annotations.f
    public static <T> io.reactivex.flowables.a<T> T(@io.reactivex.annotations.f final io.reactivex.flowables.a<T> a) {
        final o<? super io.reactivex.flowables.a, ? extends io.reactivex.flowables.a> l = a.l;
        io.reactivex.flowables.a<T> a2 = a;
        if (l != null) {
            a2 = b((o<io.reactivex.flowables.a<T>, io.reactivex.flowables.a<T>>)l, a);
        }
        return a2;
    }
    
    @io.reactivex.annotations.f
    public static <T> io.reactivex.observables.a<T> U(@io.reactivex.annotations.f final io.reactivex.observables.a<T> a) {
        final o<? super io.reactivex.observables.a, ? extends io.reactivex.observables.a> n = a.n;
        io.reactivex.observables.a<T> a2 = a;
        if (n != null) {
            a2 = b((o<io.reactivex.observables.a<T>, io.reactivex.observables.a<T>>)n, a);
        }
        return a2;
    }
    
    @io.reactivex.annotations.f
    public static <T> b<T> V(@io.reactivex.annotations.f final b<T> b) {
        final o<? super b, ? extends b> r = io.reactivex.plugins.a.r;
        b<T> b2 = b;
        if (r != null) {
            b2 = b((o<b<T>, b<T>>)r, b);
        }
        return b2;
    }
    
    public static boolean W() {
        final e x = io.reactivex.plugins.a.x;
        if (x != null) {
            try {
                return x.a();
            }
            finally {
                final Throwable t;
                throw io.reactivex.internal.util.k.f(t);
            }
        }
        return false;
    }
    
    @io.reactivex.annotations.f
    public static j0 X(@io.reactivex.annotations.f final j0 j0) {
        final o<? super j0, ? extends j0> g = io.reactivex.plugins.a.g;
        if (g == null) {
            return j0;
        }
        return b(g, j0);
    }
    
    public static void Y(@io.reactivex.annotations.f final Throwable t) {
        final g<? super Throwable> a = io.reactivex.plugins.a.a;
        Throwable t2;
        if (t == null) {
            t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        else {
            t2 = t;
            if (!K(t)) {
                t2 = new io.reactivex.exceptions.f(t);
            }
        }
        if (a != null) {
            try {
                a.accept(t2);
                return;
            }
            finally {
                t.printStackTrace();
                I0(t);
            }
        }
        t2.printStackTrace();
        I0(t2);
    }
    
    @io.reactivex.annotations.f
    public static j0 Z(@io.reactivex.annotations.f final j0 j0) {
        final o<? super j0, ? extends j0> i = io.reactivex.plugins.a.i;
        if (i == null) {
            return j0;
        }
        return b(i, j0);
    }
    
    @io.reactivex.annotations.f
    static <T, U, R> R a(@io.reactivex.annotations.f final x5.c<T, U, R> c, @io.reactivex.annotations.f final T t, @io.reactivex.annotations.f final U u) {
        try {
            return c.b(t, u);
        }
        finally {
            final Throwable t2;
            throw io.reactivex.internal.util.k.f(t2);
        }
    }
    
    @io.reactivex.annotations.f
    public static j0 a0(@io.reactivex.annotations.f final j0 j0) {
        final o<? super j0, ? extends j0> i = io.reactivex.plugins.a.j;
        if (i == null) {
            return j0;
        }
        return b(i, j0);
    }
    
    @io.reactivex.annotations.f
    static <T, R> R b(@io.reactivex.annotations.f final o<T, R> o, @io.reactivex.annotations.f final T t) {
        try {
            return o.apply(t);
        }
        finally {
            final Throwable t2;
            throw io.reactivex.internal.util.k.f(t2);
        }
    }
    
    @io.reactivex.annotations.f
    public static Runnable b0(@io.reactivex.annotations.f final Runnable runnable) {
        io.reactivex.internal.functions.b.g(runnable, "run is null");
        final o<? super Runnable, ? extends Runnable> b = io.reactivex.plugins.a.b;
        if (b == null) {
            return runnable;
        }
        return b(b, runnable);
    }
    
    @io.reactivex.annotations.f
    static j0 c(@io.reactivex.annotations.f final o<? super Callable<j0>, ? extends j0> o, final Callable<j0> callable) {
        return io.reactivex.internal.functions.b.g((j0)b((o<Callable<j0>, T>)o, callable), "Scheduler Callable result can't be null");
    }
    
    @io.reactivex.annotations.f
    public static j0 c0(@io.reactivex.annotations.f final j0 j0) {
        final o<? super j0, ? extends j0> h = io.reactivex.plugins.a.h;
        if (h == null) {
            return j0;
        }
        return b(h, j0);
    }
    
    @io.reactivex.annotations.f
    static j0 d(@io.reactivex.annotations.f final Callable<j0> callable) {
        try {
            return io.reactivex.internal.functions.b.g(callable.call(), "Scheduler Callable result can't be null");
        }
        finally {
            final Throwable t;
            throw io.reactivex.internal.util.k.f(t);
        }
    }
    
    @io.reactivex.annotations.f
    public static f d0(@io.reactivex.annotations.f final c c, @io.reactivex.annotations.f final f f) {
        final x5.c<? super c, ? super f, ? extends f> w = io.reactivex.plugins.a.w;
        if (w != null) {
            return a(w, c, f);
        }
        return f;
    }
    
    @io.reactivex.annotations.f
    public static j0 e(@io.reactivex.annotations.f final ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.b(io.reactivex.internal.functions.b.g(threadFactory, "threadFactory is null"));
    }
    
    @io.reactivex.annotations.f
    public static <T> v<? super T> e0(@io.reactivex.annotations.f final s<T> s, @io.reactivex.annotations.f final v<? super T> v) {
        final x5.c<? super s, ? super v, ? extends v> t = io.reactivex.plugins.a.t;
        if (t != null) {
            return a((x5.c<s<T>, v<? super T>, v<? super T>>)t, s, v);
        }
        return v;
    }
    
    @io.reactivex.annotations.f
    public static j0 f(@io.reactivex.annotations.f final ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.g(io.reactivex.internal.functions.b.g(threadFactory, "threadFactory is null"));
    }
    
    @io.reactivex.annotations.f
    public static <T> i0<? super T> f0(@io.reactivex.annotations.f final b0<T> b0, @io.reactivex.annotations.f final i0<? super T> i0) {
        final x5.c<? super b0, ? super i0, ? extends i0> u = io.reactivex.plugins.a.u;
        if (u != null) {
            return a((x5.c<b0<T>, i0<? super T>, i0<? super T>>)u, b0, i0);
        }
        return i0;
    }
    
    @io.reactivex.annotations.f
    public static j0 g(@io.reactivex.annotations.f final ThreadFactory threadFactory) {
        return new h(io.reactivex.internal.functions.b.g(threadFactory, "threadFactory is null"));
    }
    
    @io.reactivex.annotations.f
    public static <T> n0<? super T> g0(@io.reactivex.annotations.f final k0<T> k0, @io.reactivex.annotations.f final n0<? super T> n0) {
        final x5.c<? super k0, ? super n0, ? extends n0> v = io.reactivex.plugins.a.v;
        if (v != null) {
            return a((x5.c<k0<T>, n0<? super T>, n0<? super T>>)v, k0, n0);
        }
        return n0;
    }
    
    @io.reactivex.annotations.f
    public static j0 h(@io.reactivex.annotations.f final ThreadFactory threadFactory) {
        return new r(io.reactivex.internal.functions.b.g(threadFactory, "threadFactory is null"));
    }
    
    @io.reactivex.annotations.f
    public static <T> o7.c<? super T> h0(@io.reactivex.annotations.f final l<T> l, @io.reactivex.annotations.f final o7.c<? super T> c) {
        final x5.c<? super l, ? super o7.c, ? extends o7.c> s = io.reactivex.plugins.a.s;
        if (s != null) {
            return (o7.c<? super T>)a((x5.c<l<T>, o7.c<? super T>, o7.c>)s, l, c);
        }
        return c;
    }
    
    @io.reactivex.annotations.g
    public static o<? super j0, ? extends j0> i() {
        return io.reactivex.plugins.a.g;
    }
    
    public static void i0() {
        k0(null);
        G0(null);
        j0(null);
        m0(null);
        q0(null);
        n0(null);
        H0(null);
        p0(null);
        r0(null);
        o0(null);
        x0(null);
        y0(null);
        B0(null);
        C0(null);
        E0(null);
        F0(null);
        t0(null);
        u0(null);
        v0(null);
        w0(null);
        z0(null);
        A0(null);
        D0(null);
        l0(false);
        s0(null);
    }
    
    @io.reactivex.annotations.g
    public static g<? super Throwable> j() {
        return io.reactivex.plugins.a.a;
    }
    
    public static void j0(@io.reactivex.annotations.g final o<? super j0, ? extends j0> g) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.g = g;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super Callable<j0>, ? extends j0> k() {
        return io.reactivex.plugins.a.c;
    }
    
    public static void k0(@io.reactivex.annotations.g final g<? super Throwable> a) {
        if (!a.y) {
            a.a = a;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super Callable<j0>, ? extends j0> l() {
        return io.reactivex.plugins.a.e;
    }
    
    public static void l0(final boolean z) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.z = z;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super Callable<j0>, ? extends j0> m() {
        return io.reactivex.plugins.a.f;
    }
    
    public static void m0(@io.reactivex.annotations.g final o<? super Callable<j0>, ? extends j0> c) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.c = c;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super Callable<j0>, ? extends j0> n() {
        return io.reactivex.plugins.a.d;
    }
    
    public static void n0(@io.reactivex.annotations.g final o<? super Callable<j0>, ? extends j0> e) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.e = e;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super j0, ? extends j0> o() {
        return io.reactivex.plugins.a.i;
    }
    
    public static void o0(@io.reactivex.annotations.g final o<? super Callable<j0>, ? extends j0> f) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.f = f;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super j0, ? extends j0> p() {
        return io.reactivex.plugins.a.j;
    }
    
    public static void p0(@io.reactivex.annotations.g final o<? super Callable<j0>, ? extends j0> d) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.d = d;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static e q() {
        return io.reactivex.plugins.a.x;
    }
    
    public static void q0(@io.reactivex.annotations.g final o<? super j0, ? extends j0> i) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.i = i;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super c, ? extends c> r() {
        return io.reactivex.plugins.a.q;
    }
    
    public static void r0(@io.reactivex.annotations.g final o<? super j0, ? extends j0> j) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.j = j;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static x5.c<? super c, ? super f, ? extends f> s() {
        return io.reactivex.plugins.a.w;
    }
    
    public static void s0(@io.reactivex.annotations.g final e x) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.x = x;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super io.reactivex.flowables.a, ? extends io.reactivex.flowables.a> t() {
        return io.reactivex.plugins.a.l;
    }
    
    public static void t0(@io.reactivex.annotations.g final o<? super c, ? extends c> q) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.q = q;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super io.reactivex.observables.a, ? extends io.reactivex.observables.a> u() {
        return io.reactivex.plugins.a.n;
    }
    
    public static void u0(@io.reactivex.annotations.g final x5.c<? super c, ? super f, ? extends f> w) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.w = w;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super l, ? extends l> v() {
        return io.reactivex.plugins.a.k;
    }
    
    public static void v0(@io.reactivex.annotations.g final o<? super io.reactivex.flowables.a, ? extends io.reactivex.flowables.a> l) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.l = l;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static x5.c<? super l, ? super o7.c, ? extends o7.c> w() {
        return io.reactivex.plugins.a.s;
    }
    
    public static void w0(@io.reactivex.annotations.g final o<? super io.reactivex.observables.a, ? extends io.reactivex.observables.a> n) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.n = n;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super s, ? extends s> x() {
        return io.reactivex.plugins.a.o;
    }
    
    public static void x0(@io.reactivex.annotations.g final o<? super l, ? extends l> k) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.k = k;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static x5.c<? super s, ? super v, ? extends v> y() {
        return io.reactivex.plugins.a.t;
    }
    
    public static void y0(@io.reactivex.annotations.g final x5.c<? super l, ? super o7.c, ? extends o7.c> s) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.s = s;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    @io.reactivex.annotations.g
    public static o<? super b0, ? extends b0> z() {
        return io.reactivex.plugins.a.m;
    }
    
    public static void z0(@io.reactivex.annotations.g final o<? super s, ? extends s> o) {
        if (!io.reactivex.plugins.a.y) {
            io.reactivex.plugins.a.o = o;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
}
