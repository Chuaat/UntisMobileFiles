// 
// Decompiled by Procyon v0.5.36
// 

package rx.plugins;

import rx.internal.operators.t4;
import rx.internal.operators.h5;
import rx.internal.operators.w0;
import rx.internal.operators.x0;
import rx.internal.operators.v0;
import java.io.PrintStream;
import java.util.concurrent.ScheduledExecutorService;
import rx.o;
import rx.functions.a;
import rx.j;
import rx.functions.q;
import rx.k;
import rx.g;
import rx.functions.p;
import rx.functions.b;

public final class c
{
    static volatile boolean a;
    static volatile b<Throwable> b;
    static volatile p<g.a, g.a> c;
    static volatile p<k.t, k.t> d;
    static volatile p<rx.b.j0, rx.b.j0> e;
    static volatile q<g, g.a, g.a> f;
    static volatile q<k, k.t, k.t> g;
    static volatile q<rx.b, rx.b.j0, rx.b.j0> h;
    static volatile p<j, j> i;
    static volatile p<j, j> j;
    static volatile p<j, j> k;
    static volatile p<a, a> l;
    static volatile p<o, o> m;
    static volatile p<o, o> n;
    static volatile rx.functions.o<? extends ScheduledExecutorService> o;
    static volatile p<Throwable, Throwable> p;
    static volatile p<Throwable, Throwable> q;
    static volatile p<Throwable, Throwable> r;
    static volatile p<g.b, g.b> s;
    static volatile p<g.b, g.b> t;
    static volatile p<rx.b.k0, rx.b.k0> u;
    
    static {
        x();
    }
    
    private c() {
        throw new IllegalStateException("No instances!");
    }
    
    public static void A() {
        rx.plugins.c.a = true;
    }
    
    public static Throwable B(final Throwable t) {
        final p<Throwable, Throwable> r = rx.plugins.c.r;
        Throwable t2 = t;
        if (r != null) {
            t2 = r.h(t);
        }
        return t2;
    }
    
    public static <T, R> rx.b.k0 C(final rx.b.k0 k0) {
        final p<rx.b.k0, rx.b.k0> u = rx.plugins.c.u;
        rx.b.k0 k2 = k0;
        if (u != null) {
            k2 = u.h(k0);
        }
        return k2;
    }
    
    public static <T> rx.b.j0 D(final rx.b b, final rx.b.j0 j0) {
        final q<rx.b, rx.b.j0, rx.b.j0> h = rx.plugins.c.h;
        if (h != null) {
            return h.s(b, j0);
        }
        return j0;
    }
    
    public static j E(final j j) {
        final p<j, j> i = rx.plugins.c.i;
        j k = j;
        if (i != null) {
            k = i.h(j);
        }
        return k;
    }
    
    public static rx.b.j0 F(final rx.b.j0 j0) {
        final p<rx.b.j0, rx.b.j0> e = rx.plugins.c.e;
        rx.b.j0 j2 = j0;
        if (e != null) {
            j2 = e.h(j0);
        }
        return j2;
    }
    
    public static <T> g.a<T> G(final g.a<T> a) {
        final p<g.a, g.a> c = rx.plugins.c.c;
        g.a<T> a2 = a;
        if (c != null) {
            a2 = (g.a<T>)c.h(a);
        }
        return a2;
    }
    
    public static <T> k.t<T> H(final k.t<T> t) {
        final p<k.t, k.t> d = rx.plugins.c.d;
        k.t<T> t2 = t;
        if (d != null) {
            t2 = (k.t<T>)d.h(t);
        }
        return t2;
    }
    
    public static void I(final Throwable t) {
        final b<Throwable> b = rx.plugins.c.b;
        if (b != null) {
            try {
                b.h(t);
                return;
            }
            finally {
                final PrintStream err = System.err;
                final StringBuilder sb = new StringBuilder();
                sb.append("The onError handler threw an Exception. It shouldn't. => ");
                final Throwable t2;
                sb.append(t2.getMessage());
                err.println(sb.toString());
                t2.printStackTrace();
                q0(t2);
            }
        }
        q0(t);
    }
    
    public static j J(final j j) {
        final p<j, j> i = rx.plugins.c.j;
        j k = j;
        if (i != null) {
            k = i.h(j);
        }
        return k;
    }
    
    public static j K(final j j) {
        final p<j, j> k = rx.plugins.c.k;
        j i = j;
        if (k != null) {
            i = k.h(j);
        }
        return i;
    }
    
    public static Throwable L(final Throwable t) {
        final p<Throwable, Throwable> p = rx.plugins.c.p;
        Throwable t2 = t;
        if (p != null) {
            t2 = p.h(t);
        }
        return t2;
    }
    
    public static <T, R> g.b<R, T> M(final g.b<R, T> b) {
        final p<g.b, g.b> s = rx.plugins.c.s;
        g.b<R, T> b2 = b;
        if (s != null) {
            b2 = (g.b<R, T>)s.h(b);
        }
        return b2;
    }
    
    public static o N(final o o) {
        final p<o, o> m = rx.plugins.c.m;
        o o2 = o;
        if (m != null) {
            o2 = m.h(o);
        }
        return o2;
    }
    
    public static <T> g.a<T> O(final g<T> g, final g.a<T> a) {
        final q<g, g.a, g.a> f = rx.plugins.c.f;
        if (f != null) {
            return (g.a<T>)f.s(g, a);
        }
        return a;
    }
    
    public static a P(final a a) {
        final p<a, a> l = rx.plugins.c.l;
        a a2 = a;
        if (l != null) {
            a2 = l.h(a);
        }
        return a2;
    }
    
    public static Throwable Q(final Throwable t) {
        final p<Throwable, Throwable> q = rx.plugins.c.q;
        Throwable t2 = t;
        if (q != null) {
            t2 = q.h(t);
        }
        return t2;
    }
    
    public static <T, R> g.b<R, T> R(final g.b<R, T> b) {
        final p<g.b, g.b> t = rx.plugins.c.t;
        g.b<R, T> b2 = b;
        if (t != null) {
            b2 = (g.b<R, T>)t.h(b);
        }
        return b2;
    }
    
    public static o S(final o o) {
        final p<o, o> n = rx.plugins.c.n;
        o o2 = o;
        if (n != null) {
            o2 = n.h(o);
        }
        return o2;
    }
    
    public static <T> k.t<T> T(final k<T> k, final k.t<T> t) {
        final q<k, k.t, k.t> g = rx.plugins.c.g;
        if (g != null) {
            return (k.t<T>)g.s(k, t);
        }
        return t;
    }
    
    public static void U() {
        if (rx.plugins.c.a) {
            return;
        }
        x();
        rx.plugins.c.i = null;
        rx.plugins.c.j = null;
        rx.plugins.c.k = null;
        rx.plugins.c.o = null;
    }
    
    public static void V() {
        if (rx.plugins.c.a) {
            return;
        }
        y();
    }
    
    public static void W(final p<rx.b.j0, rx.b.j0> e) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.e = e;
    }
    
    public static void X(final p<rx.b.k0, rx.b.k0> u) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.u = u;
    }
    
    public static void Y(final q<rx.b, rx.b.j0, rx.b.j0> h) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.h = h;
    }
    
    public static void Z(final p<Throwable, Throwable> r) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.r = r;
    }
    
    public static void a() {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.b = null;
        rx.plugins.c.c = null;
        rx.plugins.c.f = null;
        rx.plugins.c.m = null;
        rx.plugins.c.p = null;
        rx.plugins.c.s = null;
        rx.plugins.c.d = null;
        rx.plugins.c.g = null;
        rx.plugins.c.n = null;
        rx.plugins.c.q = null;
        rx.plugins.c.t = null;
        rx.plugins.c.e = null;
        rx.plugins.c.h = null;
        rx.plugins.c.r = null;
        rx.plugins.c.u = null;
        rx.plugins.c.i = null;
        rx.plugins.c.j = null;
        rx.plugins.c.k = null;
        rx.plugins.c.l = null;
        rx.plugins.c.o = null;
    }
    
    public static void a0(final p<j, j> i) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.i = i;
    }
    
    public static void b() {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.c = null;
        rx.plugins.c.d = null;
        rx.plugins.c.e = null;
    }
    
    public static void b0(final b<Throwable> b) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.b = b;
    }
    
    public static void c() {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.c = new p<g.a, g.a>() {
            public g.a a(final g.a a) {
                return new v0(a);
            }
        };
        rx.plugins.c.d = new p<k.t, k.t>() {
            public k.t a(final k.t t) {
                return new x0(t);
            }
        };
        rx.plugins.c.e = new p<rx.b.j0, rx.b.j0>() {
            public rx.b.j0 a(final rx.b.j0 j0) {
                return new w0<Object>(j0);
            }
        };
    }
    
    public static void c0(final rx.functions.o<? extends ScheduledExecutorService> o) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.o = o;
    }
    
    public static p<rx.b.j0, rx.b.j0> d() {
        return rx.plugins.c.e;
    }
    
    public static void d0(final p<j, j> j) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.j = j;
    }
    
    public static p<rx.b.k0, rx.b.k0> e() {
        return rx.plugins.c.u;
    }
    
    public static void e0(final p<j, j> k) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.k = k;
    }
    
    public static q<rx.b, rx.b.j0, rx.b.j0> f() {
        return rx.plugins.c.h;
    }
    
    public static void f0(final p<g.a, g.a> c) {
        if (c.a) {
            return;
        }
        c.c = c;
    }
    
    public static p<Throwable, Throwable> g() {
        return rx.plugins.c.r;
    }
    
    public static void g0(final p<g.b, g.b> s) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.s = s;
    }
    
    public static p<j, j> h() {
        return rx.plugins.c.i;
    }
    
    public static void h0(final p<o, o> m) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.m = m;
    }
    
    public static b<Throwable> i() {
        return rx.plugins.c.b;
    }
    
    public static void i0(final q<g, g.a, g.a> f) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.f = f;
    }
    
    public static rx.functions.o<? extends ScheduledExecutorService> j() {
        return rx.plugins.c.o;
    }
    
    public static void j0(final p<Throwable, Throwable> p) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.p = p;
    }
    
    public static p<j, j> k() {
        return rx.plugins.c.j;
    }
    
    public static void k0(final p<a, a> l) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.l = l;
    }
    
    public static p<j, j> l() {
        return rx.plugins.c.k;
    }
    
    public static void l0(final p<k.t, k.t> d) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.d = d;
    }
    
    public static p<g.a, g.a> m() {
        return rx.plugins.c.c;
    }
    
    public static void m0(final p<g.b, g.b> t) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.t = t;
    }
    
    public static p<g.b, g.b> n() {
        return rx.plugins.c.s;
    }
    
    public static void n0(final p<o, o> n) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.n = n;
    }
    
    public static p<o, o> o() {
        return rx.plugins.c.m;
    }
    
    public static void o0(final q<k, k.t, k.t> g) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.g = g;
    }
    
    public static q<g, g.a, g.a> p() {
        return rx.plugins.c.f;
    }
    
    public static void p0(final p<Throwable, Throwable> q) {
        if (rx.plugins.c.a) {
            return;
        }
        rx.plugins.c.q = q;
    }
    
    public static p<Throwable, Throwable> q() {
        return rx.plugins.c.p;
    }
    
    static void q0(final Throwable t) {
        final Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t);
    }
    
    public static p<a, a> r() {
        return rx.plugins.c.l;
    }
    
    public static p<k.t, k.t> s() {
        return rx.plugins.c.d;
    }
    
    public static p<g.b, g.b> t() {
        return rx.plugins.c.t;
    }
    
    public static p<o, o> u() {
        return rx.plugins.c.n;
    }
    
    public static q<k, k.t, k.t> v() {
        return rx.plugins.c.g;
    }
    
    public static p<Throwable, Throwable> w() {
        return rx.plugins.c.q;
    }
    
    static void x() {
        rx.plugins.c.b = new b<Throwable>() {
            public void a(final Throwable t) {
                rx.plugins.f.c().b().a(t);
            }
        };
        rx.plugins.c.f = new q<g, g.a, g.a>() {
            public g.a a(final g g, final g.a a) {
                return rx.plugins.f.c().d().e(g, (g.a<Object>)a);
            }
        };
        rx.plugins.c.m = new p<o, o>() {
            public o a(final o o) {
                return rx.plugins.f.c().d().d(o);
            }
        };
        rx.plugins.c.g = new q<k, k.t, k.t>() {
            public k.t a(final k k, final k.t t) {
                final h g = rx.plugins.f.c().g();
                if (g == rx.plugins.i.f()) {
                    return t;
                }
                return new t4(g.e(k, new h5<Object>(t)));
            }
        };
        rx.plugins.c.n = new p<o, o>() {
            public o a(final o o) {
                return rx.plugins.f.c().g().d(o);
            }
        };
        rx.plugins.c.h = new q<rx.b, rx.b.j0, rx.b.j0>() {
            public rx.b.j0 a(final rx.b b, final rx.b.j0 j0) {
                return rx.plugins.f.c().a().d(b, j0);
            }
        };
        rx.plugins.c.l = new p<a, a>() {
            public a a(final a a) {
                return rx.plugins.f.c().f().k(a);
            }
        };
        rx.plugins.c.p = new p<Throwable, Throwable>() {
            public Throwable a(final Throwable t) {
                return rx.plugins.f.c().d().c(t);
            }
        };
        rx.plugins.c.s = new p<g.b, g.b>() {
            public g.b a(final g.b b) {
                return rx.plugins.f.c().d().b((g.b<?, ? super Object>)b);
            }
        };
        rx.plugins.c.q = new p<Throwable, Throwable>() {
            public Throwable a(final Throwable t) {
                return rx.plugins.f.c().g().c(t);
            }
        };
        rx.plugins.c.t = new p<g.b, g.b>() {
            public g.b a(final g.b b) {
                return rx.plugins.f.c().g().b((g.b<?, ? super Object>)b);
            }
        };
        rx.plugins.c.r = new p<Throwable, Throwable>() {
            public Throwable a(final Throwable t) {
                return rx.plugins.f.c().a().c(t);
            }
        };
        rx.plugins.c.u = new p<rx.b.k0, rx.b.k0>() {
            public rx.b.k0 a(final rx.b.k0 k0) {
                return rx.plugins.f.c().a().b(k0);
            }
        };
        y();
    }
    
    static void y() {
        rx.plugins.c.c = new p<g.a, g.a>() {
            public g.a a(final g.a a) {
                return rx.plugins.f.c().d().a((g.a<Object>)a);
            }
        };
        rx.plugins.c.d = new p<k.t, k.t>() {
            public k.t a(final k.t t) {
                return rx.plugins.f.c().g().a((k.t<Object>)t);
            }
        };
        rx.plugins.c.e = new p<rx.b.j0, rx.b.j0>() {
            public rx.b.j0 a(final rx.b.j0 j0) {
                return rx.plugins.f.c().a().a(j0);
            }
        };
    }
    
    public static boolean z() {
        return rx.plugins.c.a;
    }
}
