// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.rx;

import java.util.IdentityHashMap;
import java.util.Map;
import io.realm.q0;
import io.realm.w;
import io.reactivex.k0;
import io.realm.RealmQuery;
import io.realm.OrderedRealmCollection;
import io.realm.z;
import io.reactivex.d0;
import io.reactivex.e0;
import io.realm.y;
import io.reactivex.b0;
import io.realm.k;
import io.realm.p0;
import io.realm.j;
import io.realm.i0;
import io.reactivex.n;
import io.reactivex.o;
import io.reactivex.l;
import io.realm.f0;
import io.reactivex.android.schedulers.a;
import android.os.Looper;
import io.reactivex.j0;
import io.realm.n0;
import io.realm.l0;
import io.realm.s0;
import io.reactivex.b;

public class c implements d
{
    private static final b e;
    private final boolean a;
    private ThreadLocal<r<s0>> b;
    private ThreadLocal<r<l0>> c;
    private ThreadLocal<r<n0>> d;
    
    static {
        e = b.K;
    }
    
    public c(final boolean a) {
        this.b = new ThreadLocal<r<s0>>() {
            protected r<s0> a() {
                return (r<s0>)new r();
            }
        };
        this.c = new ThreadLocal<r<l0>>() {
            protected r<l0> a() {
                return (r<l0>)new r();
            }
        };
        this.d = new ThreadLocal<r<n0>>() {
            protected r<n0> a() {
                return (r<n0>)new r();
            }
        };
        this.a = a;
    }
    
    private j0 u() {
        final Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return io.reactivex.android.schedulers.a.a(myLooper);
        }
        throw new IllegalStateException("No looper found");
    }
    
    @Override
    public <E> l<l0<E>> a(final f0 f0, final l0<E> l0) {
        if (f0.N()) {
            return l.y3(l0);
        }
        final io.realm.j0 d = f0.D();
        final j0 u = this.u();
        return l.z1((o<l0<E>>)new o<l0<E>>() {
            @Override
            public void a(final n<l0<E>> n) {
                if (!l0.T()) {
                    return;
                }
                final f0 q2 = f0.q2(d);
                io.realm.rx.c.this.c.get().a(l0);
                final i0<l0<E>> i0 = new i0<l0<E>>() {
                    public void b(final l0<E> l0) {
                        if (!l0.T()) {
                            n.f();
                            return;
                        }
                        if (!n.isCancelled()) {
                            final n a = n;
                            l0<E> w = l0;
                            if (io.realm.rx.c.this.a) {
                                w = l0.w();
                            }
                            a.m(w);
                        }
                    }
                };
                l0.n(i0);
                n.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!q2.isClosed()) {
                            l0.H(i0);
                            q2.close();
                        }
                        io.realm.rx.c.this.c.get().b(l0);
                    }
                }));
                l0<E> l0;
                if (io.realm.rx.c.this.a) {
                    l0 = l0.w();
                }
                else {
                    l0 = l0;
                }
                n.m(l0);
            }
        }, io.realm.rx.c.e).o6(u).V7(u);
    }
    
    @Override
    public <E> l<l0<E>> b(final j j, final l0<E> l0) {
        if (j.N()) {
            return l.y3(l0);
        }
        final io.realm.j0 d = j.D();
        final j0 u = this.u();
        return l.z1((o<l0<E>>)new o<l0<E>>() {
            @Override
            public void a(final n<l0<E>> n) {
                if (!l0.T()) {
                    return;
                }
                final j g0 = j.G0(d);
                io.realm.rx.c.this.c.get().a(l0);
                final i0<l0<E>> i0 = new i0<l0<E>>() {
                    public void b(final l0<E> l0) {
                        if (!l0.T()) {
                            n.f();
                            return;
                        }
                        if (!n.isCancelled()) {
                            final n a = n;
                            l0<E> w = l0;
                            if (io.realm.rx.c.this.a) {
                                w = l0.w();
                            }
                            a.m(w);
                        }
                    }
                };
                l0.n(i0);
                n.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!g0.isClosed()) {
                            l0.H(i0);
                            g0.close();
                        }
                        io.realm.rx.c.this.c.get().b(l0);
                    }
                }));
                l0<E> l0;
                if (io.realm.rx.c.this.a) {
                    l0 = l0.w();
                }
                else {
                    l0 = l0;
                }
                n.m(l0);
            }
        }, io.realm.rx.c.e).o6(u).V7(u);
    }
    
    @Override
    public <E> l<s0<E>> c(final f0 f0, final s0<E> s0) {
        if (f0.N()) {
            return l.y3(s0);
        }
        final io.realm.j0 d = f0.D();
        final j0 u = this.u();
        return l.z1((o<s0<E>>)new o<s0<E>>() {
            @Override
            public void a(final n<s0<E>> n) {
                if (!s0.T()) {
                    return;
                }
                final f0 q2 = f0.q2(d);
                io.realm.rx.c.this.b.get().a(s0);
                final i0<s0<E>> i0 = new i0<s0<E>>() {
                    public void b(final s0<E> s0) {
                        if (!n.isCancelled()) {
                            final n a = n;
                            s0<E> f = s0;
                            if (io.realm.rx.c.this.a) {
                                f = s0.F();
                            }
                            a.m(f);
                        }
                    }
                };
                s0.p(i0);
                n.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!q2.isClosed()) {
                            s0.K(i0);
                            q2.close();
                        }
                        io.realm.rx.c.this.b.get().b(s0);
                    }
                }));
                s0<E> s0;
                if (io.realm.rx.c.this.a) {
                    s0 = s0.F();
                }
                else {
                    s0 = s0;
                }
                n.m(s0);
            }
        }, io.realm.rx.c.e).o6(u).V7(u);
    }
    
    @Override
    public <E extends n0> l<E> d(final f0 f0, final E e) {
        if (f0.N()) {
            return l.y3(e);
        }
        final io.realm.j0 d = f0.D();
        final j0 u = this.u();
        return l.z1((o<E>)new o<E>() {
            @Override
            public void a(final n<E> n) {
                if (f0.isClosed()) {
                    return;
                }
                final f0 q2 = f0.q2(d);
                io.realm.rx.c.this.d.get().a(e);
                final i0<E> i0 = new i0<E>() {
                    public void b(final E e) {
                        if (!n.isCancelled()) {
                            final n a = n;
                            n0 e2 = e;
                            if (io.realm.rx.c.this.a) {
                                e2 = p0.e8(e);
                            }
                            a.m(e2);
                        }
                    }
                };
                p0.U7(e, (i0<n0>)i0);
                n.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!q2.isClosed()) {
                            p0.p8(e, i0);
                            q2.close();
                        }
                        io.realm.rx.c.this.d.get().b(e);
                    }
                }));
                n0 n2;
                if (io.realm.rx.c.this.a) {
                    n2 = p0.e8(e);
                }
                else {
                    n2 = e;
                }
                n.m((E)n2);
            }
        }, io.realm.rx.c.e).o6(u).V7(u);
    }
    
    @Override
    public l<j> e(final j j) {
        if (j.N()) {
            return l.y3(j);
        }
        final io.realm.j0 d = j.D();
        final j0 u = this.u();
        return l.z1((o<j>)new o<j>() {
            @Override
            public void a(final n<j> n) throws Exception {
                final j g0 = j.G0(d);
                final i0<j> i0 = new i0<j>() {
                    public void b(final j j) {
                        if (!n.isCancelled()) {
                            final n a = n;
                            j d0 = j;
                            if (io.realm.rx.c.this.a) {
                                d0 = j.D0();
                            }
                            a.m(d0);
                        }
                    }
                };
                g0.d0(i0);
                n.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!g0.isClosed()) {
                            g0.M0(i0);
                            g0.close();
                        }
                    }
                }));
                j d0 = g0;
                if (io.realm.rx.c.this.a) {
                    d0 = g0.D0();
                }
                n.m(d0);
            }
        }, io.realm.rx.c.e).o6(u).V7(u);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof c;
    }
    
    @Override
    public l<f0> f(final f0 f0) {
        if (f0.N()) {
            return l.y3(f0);
        }
        final io.realm.j0 d = f0.D();
        final j0 u = this.u();
        return l.z1((o<f0>)new o<f0>() {
            @Override
            public void a(final n<f0> n) throws Exception {
                final f0 q2 = f0.q2(d);
                final i0<f0> i0 = new i0<f0>() {
                    public void b(final f0 f0) {
                        if (!n.isCancelled()) {
                            final n a = n;
                            f0 q1 = f0;
                            if (io.realm.rx.c.this.a) {
                                q1 = f0.Q1();
                            }
                            a.m(q1);
                        }
                    }
                };
                q2.d0(i0);
                n.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!q2.isClosed()) {
                            q2.X2(i0);
                            q2.close();
                        }
                    }
                }));
                f0 q3 = q2;
                if (io.realm.rx.c.this.a) {
                    q3 = q2.Q1();
                }
                n.m(q3);
            }
        }, io.realm.rx.c.e).o6(u).V7(u);
    }
    
    @Override
    public <E> l<s0<E>> g(final j j, final s0<E> s0) {
        if (j.N()) {
            return l.y3(s0);
        }
        final io.realm.j0 d = j.D();
        final j0 u = this.u();
        return l.z1((o<s0<E>>)new o<s0<E>>() {
            @Override
            public void a(final n<s0<E>> n) {
                if (!s0.T()) {
                    return;
                }
                final j g0 = j.G0(d);
                io.realm.rx.c.this.b.get().a(s0);
                final i0<s0<E>> i0 = new i0<s0<E>>() {
                    public void b(final s0<E> s0) {
                        if (!n.isCancelled()) {
                            final n a = n;
                            s0<E> f = s0;
                            if (io.realm.rx.c.this.a) {
                                f = s0.F();
                            }
                            a.m(f);
                        }
                    }
                };
                s0.p(i0);
                n.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!g0.isClosed()) {
                            s0.K(i0);
                            g0.close();
                        }
                        io.realm.rx.c.this.b.get().b(s0);
                    }
                }));
                s0<E> s0;
                if (io.realm.rx.c.this.a) {
                    s0 = s0.F();
                }
                else {
                    s0 = s0;
                }
                n.m(s0);
            }
        }, io.realm.rx.c.e).o6(u).V7(u);
    }
    
    @Override
    public l<k> h(final j j, final k k) {
        if (j.N()) {
            return l.y3(k);
        }
        final io.realm.j0 d = j.D();
        final j0 u = this.u();
        return l.z1((o<k>)new o<k>() {
            @Override
            public void a(final n<k> n) {
                if (j.isClosed()) {
                    return;
                }
                final j g0 = j.G0(d);
                io.realm.rx.c.this.d.get().a(k);
                final i0<k> i0 = new i0<k>() {
                    public void b(final k k) {
                        if (!n.isCancelled()) {
                            final n a = n;
                            k i = k;
                            if (io.realm.rx.c.this.a) {
                                i = p0.e8(k);
                            }
                            a.m(i);
                        }
                    }
                };
                p0.U7(k, i0);
                n.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!g0.isClosed()) {
                            p0.p8(k, i0);
                            g0.close();
                        }
                        io.realm.rx.c.this.d.get().b(k);
                    }
                }));
                k c;
                if (io.realm.rx.c.this.a) {
                    c = p0.e8(k);
                }
                else {
                    c = k;
                }
                n.m(c);
            }
        }, io.realm.rx.c.e).o6(u).V7(u);
    }
    
    @Override
    public int hashCode() {
        return 37;
    }
    
    @Override
    public <E> b0<io.realm.rx.a<s0<E>>> i(final j j, final s0<E> s0) {
        if (j.N()) {
            return b0.p3(new io.realm.rx.a<s0<E>>(s0, null));
        }
        final io.realm.j0 d = j.D();
        final j0 u = this.u();
        return b0.u1((e0<io.realm.rx.a<s0<E>>>)new e0<io.realm.rx.a<s0<E>>>() {
            @Override
            public void a(final d0<io.realm.rx.a<s0<E>>> d0) {
                if (!s0.T()) {
                    return;
                }
                final j g0 = j.G0(d);
                io.realm.rx.c.this.b.get().a(s0);
                final z<s0<E>> z = new z<s0<E>>() {
                    public void b(final s0<E> s0, final y y) {
                        if (!d0.i()) {
                            final d0 a = d0;
                            s0<E> f = s0;
                            if (io.realm.rx.c.this.a) {
                                f = s0.F();
                            }
                            a.m(new io.realm.rx.a<s0<E>>(f, y));
                        }
                    }
                };
                s0.o(z);
                d0.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!g0.isClosed()) {
                            s0.J(z);
                            g0.close();
                        }
                        io.realm.rx.c.this.b.get().b(s0);
                    }
                }));
                s0 s0;
                if (io.realm.rx.c.this.a) {
                    s0 = s0.F();
                }
                else {
                    s0 = s0;
                }
                d0.m(new io.realm.rx.a<s0>(s0, null));
            }
        }).M5(u).q7(u);
    }
    
    @Override
    public <E> b0<io.realm.rx.a<l0<E>>> j(final f0 f0, final l0<E> l0) {
        if (f0.N()) {
            return b0.p3(new io.realm.rx.a<l0<E>>(l0, null));
        }
        final io.realm.j0 d = f0.D();
        final j0 u = this.u();
        return b0.u1((e0<io.realm.rx.a<l0<E>>>)new e0<io.realm.rx.a<l0<E>>>() {
            @Override
            public void a(final d0<io.realm.rx.a<l0<E>>> d0) {
                if (!l0.T()) {
                    return;
                }
                final f0 q2 = f0.q2(d);
                io.realm.rx.c.this.c.get().a(l0);
                final z<l0<E>> z = new z<l0<E>>() {
                    public void b(final l0<E> l0, final y y) {
                        if (!l0.T()) {
                            d0.f();
                            return;
                        }
                        if (!d0.i()) {
                            final d0 a = d0;
                            l0<E> w = l0;
                            if (io.realm.rx.c.this.a) {
                                w = l0.w();
                            }
                            a.m(new io.realm.rx.a<l0<E>>(w, y));
                        }
                    }
                };
                l0.m(z);
                d0.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!q2.isClosed()) {
                            l0.G(z);
                            q2.close();
                        }
                        io.realm.rx.c.this.c.get().b(l0);
                    }
                }));
                l0 l0;
                if (io.realm.rx.c.this.a) {
                    l0 = l0.w();
                }
                else {
                    l0 = l0;
                }
                d0.m(new io.realm.rx.a<l0>(l0, null));
            }
        }).M5(u).q7(u);
    }
    
    @Override
    public <E> k0<RealmQuery<E>> k(final f0 f0, final RealmQuery<E> realmQuery) {
        throw new RuntimeException("RealmQuery not supported yet.");
    }
    
    @Override
    public b0<io.realm.rx.b<k>> l(final j j, final k k) {
        if (j.N()) {
            return b0.p3(new io.realm.rx.b<k>(k, null));
        }
        final io.realm.j0 d = j.D();
        final j0 u = this.u();
        return b0.u1((e0<io.realm.rx.b<k>>)new e0<io.realm.rx.b<k>>() {
            @Override
            public void a(final d0<io.realm.rx.b<k>> d0) {
                if (!p0.k8(k)) {
                    return;
                }
                final j g0 = j.G0(d);
                io.realm.rx.c.this.d.get().a(k);
                final q0<k> q0 = new q0<k>() {
                    public void b(final k k, final w w) {
                        if (!d0.i()) {
                            final d0 a = d0;
                            k i = k;
                            if (io.realm.rx.c.this.a) {
                                i = p0.e8(k);
                            }
                            a.m(new io.realm.rx.b<k>(i, w));
                        }
                    }
                };
                k.W7((q0<n0>)q0);
                d0.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!g0.isClosed()) {
                            p0.q8(k, q0);
                            g0.close();
                        }
                        io.realm.rx.c.this.d.get().b(k);
                    }
                }));
                k a;
                if (io.realm.rx.c.this.a) {
                    a = p0.e8(k);
                }
                else {
                    a = k;
                }
                d0.m(new io.realm.rx.b<k>(a, null));
            }
        }).M5(u).q7(u);
    }
    
    @Override
    public <E> b0<io.realm.rx.a<l0<E>>> m(final j j, final l0<E> l0) {
        if (j.N()) {
            return b0.p3(new io.realm.rx.a<l0<E>>(l0, null));
        }
        final io.realm.j0 d = j.D();
        final j0 u = this.u();
        return b0.u1((e0<io.realm.rx.a<l0<E>>>)new e0<io.realm.rx.a<l0<E>>>() {
            @Override
            public void a(final d0<io.realm.rx.a<l0<E>>> d0) {
                if (!l0.T()) {
                    return;
                }
                final j g0 = j.G0(d);
                io.realm.rx.c.this.c.get().a(l0);
                final z<l0<E>> z = new z<l0<E>>() {
                    public void b(final l0<E> l0, final y y) {
                        if (!l0.T()) {
                            d0.f();
                            return;
                        }
                        if (!d0.i()) {
                            final d0 a = d0;
                            l0<E> w = l0;
                            if (io.realm.rx.c.this.a) {
                                w = l0.w();
                            }
                            a.m(new io.realm.rx.a<l0<E>>(w, y));
                        }
                    }
                };
                l0.m(z);
                d0.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!g0.isClosed()) {
                            l0.G(z);
                            g0.close();
                        }
                        io.realm.rx.c.this.c.get().b(l0);
                    }
                }));
                l0 l0;
                if (io.realm.rx.c.this.a) {
                    l0 = l0.w();
                }
                else {
                    l0 = l0;
                }
                d0.m(new io.realm.rx.a<l0>(l0, null));
            }
        }).M5(u).q7(u);
    }
    
    @Override
    public <E> k0<RealmQuery<E>> n(final j j, final RealmQuery<E> realmQuery) {
        throw new RuntimeException("RealmQuery not supported yet.");
    }
    
    @Override
    public <E> b0<io.realm.rx.a<s0<E>>> o(final f0 f0, final s0<E> s0) {
        if (f0.N()) {
            return b0.p3(new io.realm.rx.a<s0<E>>(s0, null));
        }
        final io.realm.j0 d = f0.D();
        final j0 u = this.u();
        return b0.u1((e0<io.realm.rx.a<s0<E>>>)new e0<io.realm.rx.a<s0<E>>>() {
            @Override
            public void a(final d0<io.realm.rx.a<s0<E>>> d0) {
                if (!s0.T()) {
                    return;
                }
                final f0 q2 = f0.q2(d);
                io.realm.rx.c.this.b.get().a(s0);
                final z<s0<E>> z = new z<s0<E>>() {
                    public void b(final s0<E> s0, final y y) {
                        if (!d0.i()) {
                            final d0 a = d0;
                            s0 s2;
                            if (io.realm.rx.c.this.a) {
                                s2 = s0.F();
                            }
                            else {
                                s2 = s0;
                            }
                            a.m(new io.realm.rx.a<s0>(s2, y));
                        }
                    }
                };
                s0.o(z);
                d0.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!q2.isClosed()) {
                            s0.J(z);
                            q2.close();
                        }
                        io.realm.rx.c.this.b.get().b(s0);
                    }
                }));
                s0 s0;
                if (io.realm.rx.c.this.a) {
                    s0 = s0.F();
                }
                else {
                    s0 = s0;
                }
                d0.m(new io.realm.rx.a<s0>(s0, null));
            }
        }).M5(u).q7(u);
    }
    
    @Override
    public <E extends n0> b0<io.realm.rx.b<E>> p(final f0 f0, final E e) {
        if (f0.N()) {
            return b0.p3(new io.realm.rx.b<E>(e, null));
        }
        final io.realm.j0 d = f0.D();
        final j0 u = this.u();
        return b0.u1((e0<io.realm.rx.b<E>>)new e0<io.realm.rx.b<E>>() {
            @Override
            public void a(final d0<io.realm.rx.b<E>> d0) {
                if (!p0.k8(e)) {
                    return;
                }
                final f0 q2 = f0.q2(d);
                io.realm.rx.c.this.d.get().a(e);
                final q0<E> q3 = new q0<E>() {
                    @Override
                    public void a(final E e, final w w) {
                        if (!d0.i()) {
                            final d0 a = d0;
                            n0 e2 = e;
                            if (io.realm.rx.c.this.a) {
                                e2 = p0.e8(e);
                            }
                            a.m(new io.realm.rx.b<n0>(e2, w));
                        }
                    }
                };
                p0.V7(e, (q0<n0>)q3);
                d0.j(io.reactivex.disposables.d.f(new Runnable() {
                    @Override
                    public void run() {
                        if (!q2.isClosed()) {
                            p0.q8(e, q3);
                            q2.close();
                        }
                        io.realm.rx.c.this.d.get().b(e);
                    }
                }));
                n0 n0;
                if (io.realm.rx.c.this.a) {
                    n0 = p0.e8(e);
                }
                else {
                    n0 = e;
                }
                d0.m(new io.realm.rx.b<n0>(n0, null));
            }
        }).M5(u).q7(u);
    }
    
    private static class r<K>
    {
        private final Map<K, Integer> a;
        
        private r() {
            this.a = new IdentityHashMap<K, Integer>();
        }
        
        public void a(final K k) {
            final Integer n = this.a.get(k);
            if (n == null) {
                this.a.put(k, 1);
            }
            else {
                this.a.put(k, n + 1);
            }
        }
        
        public void b(final K obj) {
            final Integer obj2 = this.a.get(obj);
            if (obj2 != null) {
                if (obj2 > 1) {
                    this.a.put(obj, obj2 - 1);
                }
                else {
                    if (obj2 != 1) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid reference count: ");
                        sb.append(obj2);
                        throw new IllegalStateException(sb.toString());
                    }
                    this.a.remove(obj);
                }
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Object does not have any references: ");
            sb2.append(obj);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
