// 
// Decompiled by Procyon v0.5.36
// 

package rx;

import java.util.List;
import rx.subscriptions.e;
import rx.internal.util.s;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.CountDownLatch;
import rx.internal.operators.l;
import java.util.Objects;
import java.util.Iterator;
import rx.internal.operators.q;
import rx.internal.operators.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Collection;
import java.util.Arrays;
import rx.functions.p;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import rx.functions.a;
import java.util.concurrent.TimeUnit;
import rx.plugins.c;
import rx.subscriptions.f;

public class b
{
    static final b b;
    static final b c;
    private final j0 a;
    
    static {
        b = new b((j0)new j0() {
            public void a(final d d) {
                d.a(f.e());
                d.c();
            }
        }, false);
        c = new b((j0)new j0() {
            public void a(final d d) {
                d.a(f.e());
            }
        }, false);
    }
    
    protected b(final j0 j0) {
        this.a = rx.plugins.c.F(j0);
    }
    
    protected b(final j0 j0, final boolean b) {
        Object f = j0;
        if (b) {
            f = rx.plugins.c.F(j0);
        }
        this.a = (j0)f;
    }
    
    public static b A0(final long n, final TimeUnit timeUnit, final j j) {
        g0(timeUnit);
        g0(j);
        return p((j0)new j0() {
            public void a(final d d) {
                final rx.subscriptions.c c = new rx.subscriptions.c();
                d.a(c);
                if (!c.g()) {
                    final j.a a = j.a();
                    c.b(a);
                    a.d(new a() {
                        @Override
                        public void call() {
                            try {
                                d.c();
                            }
                            finally {
                                a.i();
                            }
                        }
                    }, n, timeUnit);
                }
            }
        });
    }
    
    static NullPointerException C0(final Throwable cause) {
        final NullPointerException ex = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        ex.initCause(cause);
        return ex;
    }
    
    public static b D(final Throwable t) {
        g0(t);
        return p((j0)new j0() {
            public void a(final d d) {
                d.a(f.e());
                d.b(t);
            }
        });
    }
    
    public static b E(final rx.functions.o<? extends Throwable> o) {
        g0(o);
        return p((j0)new j0() {
            public void a(final d d) {
                d.a(f.e());
                try {
                    final Throwable t = o.call();
                }
                finally {}
                final Throwable t3;
                Throwable t2 = t3;
                if (t3 == null) {
                    t2 = new NullPointerException("The error supplied is null");
                }
                d.b(t2);
            }
        });
    }
    
    public static b F(final a a) {
        g0(a);
        return p((j0)new j0() {
            public void a(final d d) {
                final rx.subscriptions.a a = new rx.subscriptions.a();
                d.a(a);
                try {
                    a.call();
                    if (!a.g()) {
                        d.c();
                    }
                }
                finally {
                    if (!a.g()) {
                        final Throwable t;
                        d.b(t);
                    }
                }
            }
        });
    }
    
    public static b G(final Callable<?> callable) {
        g0(callable);
        return p((j0)new j0() {
            public void a(final d d) {
                final rx.subscriptions.a a = new rx.subscriptions.a();
                d.a(a);
                try {
                    callable.call();
                    if (!a.g()) {
                        d.c();
                    }
                }
                finally {
                    if (!a.g()) {
                        final Throwable t;
                        d.b(t);
                    }
                }
            }
        });
    }
    
    public static b H(final rx.functions.b<rx.c> b) {
        return p((j0)new rx.internal.operators.j(b));
    }
    
    public static b I(final Future<?> future) {
        g0(future);
        return J(g.D2(future));
    }
    
    private <T> void I0(final n<T> n, final boolean b) {
        g0(n);
        Label_0013: {
            if (!b) {
                break Label_0013;
            }
            try {
                n.f();
                this.G0(new d() {
                    @Override
                    public void a(final o o) {
                        n.r(o);
                    }
                    
                    @Override
                    public void b(final Throwable t) {
                        n.b(t);
                    }
                    
                    @Override
                    public void c() {
                        n.c();
                    }
                });
                rx.plugins.c.N(n);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            finally {
                final Throwable t;
                rx.exceptions.c.e(t);
                final Throwable l = rx.plugins.c.L(t);
                rx.plugins.c.I(l);
                throw C0(l);
            }
        }
    }
    
    public static b J(final g<?> g) {
        g0(g);
        return p((j0)new j0() {
            public void a(final d d) {
                final n<Object> n = new n<Object>() {
                    @Override
                    public void b(final Throwable t) {
                        d.b(t);
                    }
                    
                    @Override
                    public void c() {
                        d.c();
                    }
                    
                    @Override
                    public void m(final Object o) {
                    }
                };
                d.a(n);
                g.R6(n);
            }
        });
    }
    
    public static b K(final k<?> k) {
        g0(k);
        return p((j0)new j0() {
            public void a(final d d) {
                final m<Object> m = new m<Object>() {
                    @Override
                    public void b(final Throwable t) {
                        d.b(t);
                    }
                    
                    @Override
                    public void e(final Object o) {
                        d.c();
                    }
                };
                d.a(m);
                k.j0(m);
            }
        });
    }
    
    public static <R> b K0(final rx.functions.o<R> o, final p<? super R, ? extends b> p3, final rx.functions.b<? super R> b) {
        return L0(o, p3, b, true);
    }
    
    public static <R> b L0(final rx.functions.o<R> o, final p<? super R, ? extends b> p4, final rx.functions.b<? super R> b, final boolean b2) {
        g0(o);
        g0(p4);
        g0(b);
        return p((j0)new j0() {
            public void a(final d d) {
                try {
                    final Throwable call = o.call();
                    try {
                        final b b = p4.h(call);
                        if (b == null) {
                            try {
                                b.h(call);
                                d.a(f.e());
                                d.b(new NullPointerException("The completable supplied is null"));
                                return;
                            }
                            finally {
                                rx.exceptions.c.e(call);
                                d.a(f.e());
                                d.b(new rx.exceptions.b(Arrays.asList(new NullPointerException("The completable supplied is null"), call)));
                                return;
                            }
                        }
                        b.G0(new d() {
                            o G;
                            final /* synthetic */ AtomicBoolean H = new AtomicBoolean();
                            
                            @Override
                            public void a(final o g) {
                                this.G = g;
                                d.a(f.a(new a() {
                                    @Override
                                    public void call() {
                                        d.this.d();
                                    }
                                }));
                            }
                            
                            @Override
                            public void b(final Throwable t) {
                                Throwable t2 = t;
                                if (b2) {
                                    t2 = t;
                                    if (this.H.compareAndSet(false, true)) {
                                        try {
                                            b.h(call);
                                        }
                                        finally {
                                            final Throwable t3;
                                            t2 = new rx.exceptions.b(Arrays.asList(t, t3));
                                        }
                                    }
                                }
                                d.b(t2);
                                if (!b2) {
                                    this.d();
                                }
                            }
                            
                            @Override
                            public void c() {
                                if (b2 && this.H.compareAndSet(false, true)) {
                                    try {
                                        b.h(call);
                                    }
                                    finally {
                                        final Throwable t;
                                        d.b(t);
                                        return;
                                    }
                                }
                                d.c();
                                if (!b2) {
                                    this.d();
                                }
                            }
                            
                            void d() {
                                this.G.i();
                                if (this.H.compareAndSet(false, true)) {
                                    try {
                                        b.h(call);
                                    }
                                    finally {
                                        final Throwable t;
                                        rx.plugins.c.I(t);
                                    }
                                }
                            }
                        });
                    }
                    finally {
                        try {
                            b.h(call);
                            final Throwable t;
                            rx.exceptions.c.e(t);
                            d.a(f.e());
                            d.b(t);
                        }
                        finally {
                            final Throwable t;
                            rx.exceptions.c.e(t);
                            final Throwable t2;
                            rx.exceptions.c.e(t2);
                            d.a(f.e());
                            d.b(new rx.exceptions.b(Arrays.asList(t, t2)));
                        }
                    }
                }
                finally {
                    d.a(f.e());
                    final Throwable t3;
                    d.b(t3);
                }
            }
        });
    }
    
    public static b O(final Iterable<? extends b> iterable) {
        g0(iterable);
        return p((j0)new r(iterable));
    }
    
    public static b P(final g<? extends b> g) {
        return S(g, Integer.MAX_VALUE, false);
    }
    
    public static b Q(final g<? extends b> g, final int n) {
        return S(g, n, false);
    }
    
    public static b R(final b... array) {
        g0(array);
        if (array.length == 0) {
            return i();
        }
        if (array.length == 1) {
            return array[0];
        }
        return p((j0)new rx.internal.operators.o(array));
    }
    
    protected static b S(final g<? extends b> g, final int i, final boolean b) {
        g0(g);
        if (i >= 1) {
            return p((j0)new rx.internal.operators.n(g, i, b));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("maxConcurrency > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static b T(final Iterable<? extends b> iterable) {
        g0(iterable);
        return p((j0)new q(iterable));
    }
    
    public static b U(final g<? extends b> g) {
        return S(g, Integer.MAX_VALUE, true);
    }
    
    public static b V(final g<? extends b> g, final int n) {
        return S(g, n, true);
    }
    
    public static b W(final b... array) {
        g0(array);
        return p((j0)new rx.internal.operators.p(array));
    }
    
    public static b Y() {
        final b c = rx.b.c;
        final j0 f = rx.plugins.c.F(c.a);
        if (f == c.a) {
            return c;
        }
        return new b(f, false);
    }
    
    public static b a(final Iterable<? extends b> iterable) {
        g0(iterable);
        return p((j0)new j0() {
            public void a(final d d) {
                final rx.subscriptions.b b = new rx.subscriptions.b();
                d.a(b);
                try {
                    final Iterator iterator = iterable.iterator();
                    if (iterator == null) {
                        d.b(new NullPointerException("The iterator returned is null"));
                        return;
                    }
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    final d d2 = new d() {
                        @Override
                        public void a(final o o) {
                            b.a(o);
                        }
                        
                        @Override
                        public void b(final Throwable t) {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                b.i();
                                d.b(t);
                            }
                            else {
                                rx.plugins.c.I(t);
                            }
                        }
                        
                        @Override
                        public void c() {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                b.i();
                                d.c();
                            }
                        }
                    };
                    int n = 1;
                    while (!atomicBoolean.get()) {
                        if (b.g()) {
                            break;
                        }
                        try {
                            if (!iterator.hasNext()) {
                                if (n != 0) {
                                    d.c();
                                }
                                return;
                            }
                            if (!atomicBoolean.get()) {
                                if (!b.g()) {
                                    try {
                                        final b b2 = iterator.next();
                                        if (b2 == null) {
                                            final NullPointerException ex = new NullPointerException("One of the sources is null");
                                            return;
                                        }
                                        if (!atomicBoolean.get() && !b.g()) {
                                            b2.G0(d2);
                                            n = 0;
                                            continue;
                                        }
                                    }
                                    finally {}
                                }
                            }
                            return;
                        }
                        finally {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                b.i();
                                final Throwable t;
                                d.b(t);
                            }
                            else {
                                final Throwable t;
                                rx.plugins.c.I(t);
                            }
                        }
                        break;
                    }
                }
                finally {
                    final Throwable t2;
                    d.b(t2);
                }
            }
        });
    }
    
    public static b b(final b... array) {
        g0(array);
        if (array.length == 0) {
            return i();
        }
        if (array.length == 1) {
            return array[0];
        }
        return p((j0)new j0() {
            public void a(final d d) {
                final rx.subscriptions.b b = new rx.subscriptions.b();
                d.a(b);
                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                final d d2 = new d() {
                    @Override
                    public void a(final o o) {
                        b.a(o);
                    }
                    
                    @Override
                    public void b(final Throwable t) {
                        if (atomicBoolean.compareAndSet(false, true)) {
                            b.i();
                            d.b(t);
                        }
                        else {
                            rx.plugins.c.I(t);
                        }
                    }
                    
                    @Override
                    public void c() {
                        if (atomicBoolean.compareAndSet(false, true)) {
                            b.i();
                            d.c();
                        }
                    }
                };
                for (final b b2 : array) {
                    if (b.g()) {
                        return;
                    }
                    if (b2 == null) {
                        final NullPointerException ex = new NullPointerException("One of the sources is null");
                        if (atomicBoolean.compareAndSet(false, true)) {
                            b.i();
                            d.b(ex);
                        }
                        else {
                            rx.plugins.c.I(ex);
                        }
                        return;
                    }
                    if (atomicBoolean.get()) {
                        break;
                    }
                    if (b.g()) {
                        break;
                    }
                    b2.G0(d2);
                }
            }
        });
    }
    
    static <T> T g0(final T obj) {
        Objects.requireNonNull(obj);
        return obj;
    }
    
    public static b i() {
        final b b = rx.b.b;
        final j0 f = rx.plugins.c.F(b.a);
        if (f == b.a) {
            return b;
        }
        return new b(f, false);
    }
    
    public static b k(final Iterable<? extends b> iterable) {
        g0(iterable);
        return p((j0)new rx.internal.operators.m(iterable));
    }
    
    public static b l(final g<? extends b> g) {
        return m(g, 2);
    }
    
    public static b m(final g<? extends b> g, final int i) {
        g0(g);
        if (i >= 1) {
            return p((j0)new rx.internal.operators.k(g, i));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("prefetch > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static b n(final b... array) {
        g0(array);
        if (array.length == 0) {
            return i();
        }
        if (array.length == 1) {
            return array[0];
        }
        return p((j0)new l(array));
    }
    
    public static b p(final j0 j0) {
        g0(j0);
        try {
            return new b(j0);
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            rx.plugins.c.I(t);
            throw C0(t);
        }
    }
    
    public static b q(final rx.functions.o<? extends b> o) {
        g0(o);
        return p((j0)new j0() {
            public void a(final d d) {
                while (true) {
                    try {
                        final b b = o.call();
                        if (b == null) {
                            d.a(f.e());
                            final NullPointerException ex = new NullPointerException("The completable returned is null");
                            d.b(ex);
                            return;
                        }
                        b.G0(d);
                    }
                    finally {
                        d.a(f.e());
                        continue;
                    }
                    break;
                }
            }
        });
    }
    
    static void u(final Throwable t) {
        final Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t);
    }
    
    public static b z0(final long n, final TimeUnit timeUnit) {
        return A0(n, timeUnit, rx.schedulers.c.a());
    }
    
    public final b A(final rx.functions.b<? super o> b) {
        return this.z(b, rx.functions.m.a(), rx.functions.m.a(), rx.functions.m.a(), rx.functions.m.a());
    }
    
    public final b B(final a a) {
        return this.z(rx.functions.m.a(), new rx.functions.b<Throwable>() {
            public void a(final Throwable t) {
                a.call();
            }
        }, a, rx.functions.m.a(), rx.functions.m.a());
    }
    
    public final <R> R B0(final p<? super b, R> p) {
        return p.h(this);
    }
    
    public final b C(final a a) {
        return this.z(rx.functions.m.a(), rx.functions.m.a(), rx.functions.m.a(), rx.functions.m.a(), a);
    }
    
    public final <T> g<T> D0() {
        return g.Q6((g.a<T>)new g.a<T>() {
            public void a(final n<? super T> n) {
                b.this.H0(n);
            }
        });
    }
    
    public final <T> k<T> E0(final rx.functions.o<? extends T> o) {
        g0(o);
        return k.n((k.t<T>)new k.t<T>() {
            public void a(final m<? super T> m) {
                b.this.G0(new d() {
                    @Override
                    public void a(final o o) {
                        m.d(o);
                    }
                    
                    @Override
                    public void b(final Throwable t) {
                        m.b(t);
                    }
                    
                    @Override
                    public void c() {
                        try {
                            final Object call = o.call();
                            if (call == null) {
                                m.b(new NullPointerException("The value supplied is null"));
                            }
                            else {
                                m.e(call);
                            }
                        }
                        finally {
                            final Throwable t;
                            m.b(t);
                        }
                    }
                });
            }
        });
    }
    
    public final <T> k<T> F0(final T t) {
        g0(t);
        return this.E0((rx.functions.o<? extends T>)new rx.functions.o<T>() {
            @Override
            public T call() {
                return t;
            }
        });
    }
    
    public final void G0(final d d) {
        g0(d);
        try {
            rx.plugins.c.D(this, this.a).h(d);
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            rx.exceptions.c.e(t);
            final Throwable b = rx.plugins.c.B(t);
            rx.plugins.c.I(b);
            throw C0(b);
        }
    }
    
    public final <T> void H0(final n<T> n) {
        this.I0(n, true);
    }
    
    public final b J0(final j j) {
        g0(j);
        return p((j0)new j0() {
            public void a(final d d) {
                b.this.G0(new d() {
                    @Override
                    public void a(final o o) {
                        d.a(f.a(new a() {
                            @Override
                            public void call() {
                                final j.a a = j.a();
                                a.c(new a() {
                                    @Override
                                    public void call() {
                                        try {
                                            o.i();
                                        }
                                        finally {
                                            a.i();
                                        }
                                    }
                                });
                            }
                        }));
                    }
                    
                    @Override
                    public void b(final Throwable t) {
                        d.b(t);
                    }
                    
                    @Override
                    public void c() {
                        d.c();
                    }
                });
            }
        });
    }
    
    public final Throwable L() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] array = { null };
        this.G0(new d() {
            @Override
            public void a(final o o) {
            }
            
            @Override
            public void b(final Throwable t) {
                array[0] = t;
                countDownLatch.countDown();
            }
            
            @Override
            public void c() {
                countDownLatch.countDown();
            }
        });
        if (countDownLatch.getCount() == 0L) {
            return array[0];
        }
        try {
            countDownLatch.await();
            return array[0];
        }
        catch (InterruptedException ex) {
            throw rx.exceptions.c.c(ex);
        }
    }
    
    public final Throwable M(final long timeout, final TimeUnit unit) {
        g0(unit);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] array = { null };
        this.G0(new d() {
            @Override
            public void a(final o o) {
            }
            
            @Override
            public void b(final Throwable t) {
                array[0] = t;
                countDownLatch.countDown();
            }
            
            @Override
            public void c() {
                countDownLatch.countDown();
            }
        });
        if (countDownLatch.getCount() == 0L) {
            return array[0];
        }
        try {
            if (countDownLatch.await(timeout, unit)) {
                return array[0];
            }
            rx.exceptions.c.c(new TimeoutException());
            return null;
        }
        catch (InterruptedException ex) {
            throw rx.exceptions.c.c(ex);
        }
    }
    
    public final b N(final k0 k0) {
        g0(k0);
        return p((j0)new j0() {
            public void a(d d) {
                try {
                    d = rx.plugins.c.C(k0).h(d);
                    b.this.G0(d);
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                finally {
                    final Throwable t;
                    throw b.C0(t);
                }
            }
        });
    }
    
    public final b X(final b b) {
        g0(b);
        return R(this, b);
    }
    
    public final b Z(final j j) {
        g0(j);
        return p((j0)new j0() {
            public void a(final d d) {
                final rx.internal.util.q q = new rx.internal.util.q();
                final j.a a = j.a();
                q.a(a);
                d.a(q);
                b.this.G0(new d() {
                    @Override
                    public void a(final o o) {
                        q.a(o);
                    }
                    
                    @Override
                    public void b(final Throwable t) {
                        a.c(new a() {
                            @Override
                            public void call() {
                                try {
                                    d.b(t);
                                }
                                finally {
                                    q.i();
                                }
                            }
                        });
                    }
                    
                    @Override
                    public void c() {
                        a.c(new a() {
                            @Override
                            public void call() {
                                try {
                                    d.c();
                                }
                                finally {
                                    q.i();
                                }
                            }
                        });
                    }
                });
            }
        });
    }
    
    public final b a0() {
        return this.b0(s.b());
    }
    
    public final b b0(final p<? super Throwable, Boolean> p) {
        g0(p);
        return p((j0)new j0() {
            public void a(final d d) {
                b.this.G0(new d() {
                    @Override
                    public void a(final o o) {
                        d.a(o);
                    }
                    
                    @Override
                    public void b(final Throwable t) {
                        final int n = 0;
                        rx.exceptions.b b = null;
                        int n2 = 0;
                        try {
                            p.h(t);
                        }
                        finally {
                            final Throwable t2;
                            rx.exceptions.c.e(t2);
                            b = new rx.exceptions.b(Arrays.asList(t, t2));
                            n2 = n;
                        }
                        if (n2 != 0) {
                            d.c();
                        }
                        else {
                            d.b(b);
                        }
                    }
                    
                    @Override
                    public void c() {
                        d.c();
                    }
                });
            }
        });
    }
    
    public final b c(final b b) {
        g0(b);
        return b(this, b);
    }
    
    public final b c0(final p<? super Throwable, ? extends b> p) {
        g0(p);
        return p((j0)new j0() {
            public void a(final d d) {
                final e e = new e();
                d.a(e);
                b.this.G0(new d() {
                    @Override
                    public void a(final o o) {
                        e.b(o);
                    }
                    
                    @Override
                    public void b(Throwable t) {
                        try {
                            final b b = p.h(t);
                            if (b == null) {
                                t = new rx.exceptions.b(Arrays.asList(t, new NullPointerException("The completable returned is null")));
                                d.b(t);
                                return;
                            }
                            b.G0(new d() {
                                @Override
                                public void a(final o o) {
                                    e.b(o);
                                }
                                
                                @Override
                                public void b(final Throwable t) {
                                    d.b(t);
                                }
                                
                                @Override
                                public void c() {
                                    d.c();
                                }
                            });
                        }
                        finally {
                            final Throwable t2;
                            d.b(new rx.exceptions.b(Arrays.asList(t, t2)));
                        }
                    }
                    
                    @Override
                    public void c() {
                        d.c();
                    }
                });
            }
        });
    }
    
    public final b d(final b b) {
        return this.o(b);
    }
    
    public final b d0() {
        return J(this.D0().o4());
    }
    
    public final <T> g<T> e(final g<T> g) {
        g0(g);
        return g.G1(this.D0());
    }
    
    public final b e0(final long n) {
        return J(this.D0().p4(n));
    }
    
    public final <T> k<T> f(final k<T> k) {
        g0(k);
        return k.r(this.D0());
    }
    
    public final b f0(final p<? super g<? extends Void>, ? extends g<?>> p) {
        g0(p);
        return J(this.D0().s4(p));
    }
    
    public final void g() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] array = { null };
        this.G0(new d() {
            @Override
            public void a(final o o) {
            }
            
            @Override
            public void b(final Throwable t) {
                array[0] = t;
                countDownLatch.countDown();
            }
            
            @Override
            public void c() {
                countDownLatch.countDown();
            }
        });
        if (countDownLatch.getCount() == 0L) {
            if (array[0] != null) {
                rx.exceptions.c.c(array[0]);
            }
            return;
        }
        try {
            countDownLatch.await();
            if (array[0] != null) {
                rx.exceptions.c.c(array[0]);
            }
        }
        catch (InterruptedException ex) {
            throw rx.exceptions.c.c(ex);
        }
    }
    
    public final boolean h(final long timeout, final TimeUnit unit) {
        g0(unit);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] array = { null };
        this.G0(new d() {
            @Override
            public void a(final o o) {
            }
            
            @Override
            public void b(final Throwable t) {
                array[0] = t;
                countDownLatch.countDown();
            }
            
            @Override
            public void c() {
                countDownLatch.countDown();
            }
        });
        if (countDownLatch.getCount() == 0L) {
            if (array[0] != null) {
                rx.exceptions.c.c(array[0]);
            }
            return true;
        }
        try {
            final boolean await = countDownLatch.await(timeout, unit);
            if (await && array[0] != null) {
                rx.exceptions.c.c(array[0]);
            }
            return await;
        }
        catch (InterruptedException ex) {
            throw rx.exceptions.c.c(ex);
        }
    }
    
    public final b h0() {
        return J(this.D0().K4());
    }
    
    public final b i0(final long n) {
        return J(this.D0().L4(n));
    }
    
    public final b j(final l0 l0) {
        return this.B0((p<? super b, b>)l0);
    }
    
    public final b j0(final rx.functions.q<Integer, Throwable, Boolean> q) {
        return J(this.D0().M4(q));
    }
    
    public final b k0(final p<? super g<? extends Throwable>, ? extends g<?>> p) {
        return J(this.D0().N4(p));
    }
    
    public final b l0(final b b) {
        g0(b);
        return n(b, this);
    }
    
    public final <T> g<T> m0(final g<T> g) {
        g0(g);
        return this.D0().w5(g);
    }
    
    public final o n0() {
        final rx.subscriptions.c c = new rx.subscriptions.c();
        this.G0(new d() {
            @Override
            public void a(final o o) {
                c.b(o);
            }
            
            @Override
            public void b(final Throwable t) {
                rx.plugins.c.I(t);
                c.i();
                rx.b.u(t);
            }
            
            @Override
            public void c() {
                c.i();
            }
        });
        return c;
    }
    
    public final b o(final b b) {
        g0(b);
        return n(this, b);
    }
    
    public final o o0(final a a) {
        g0(a);
        final rx.subscriptions.c c = new rx.subscriptions.c();
        this.G0(new d() {
            boolean G;
            
            @Override
            public void a(final o o) {
                c.b(o);
            }
            
            @Override
            public void b(final Throwable t) {
                rx.plugins.c.I(t);
                c.i();
                rx.b.u(t);
            }
            
            @Override
            public void c() {
                if (!this.G) {
                    this.G = true;
                    try {
                        a.call();
                        c.i();
                    }
                    finally {
                        try {
                            final Throwable t;
                            rx.plugins.c.I(t);
                            rx.b.u(t);
                        }
                        finally {
                            c.i();
                        }
                    }
                }
            }
        });
        return c;
    }
    
    public final o p0(final a a, final rx.functions.b<? super Throwable> b) {
        g0(a);
        g0(b);
        final rx.subscriptions.c c = new rx.subscriptions.c();
        this.G0(new d() {
            boolean G;
            
            @Override
            public void a(final o o) {
                c.b(o);
            }
            
            @Override
            public void b(final Throwable t) {
                if (!this.G) {
                    this.G = true;
                    this.d(t);
                }
                else {
                    rx.plugins.c.I(t);
                    rx.b.u(t);
                }
            }
            
            @Override
            public void c() {
                if (!this.G) {
                    this.G = true;
                    try {
                        a.call();
                        c.i();
                    }
                    finally {
                        final Throwable t;
                        this.d(t);
                    }
                }
            }
            
            void d(final Throwable t) {
                while (true) {
                    final Throwable t4;
                    try {
                        b.h(t);
                        c.i();
                        return;
                    }
                    finally {
                        final rx.exceptions.b b = new(rx.exceptions.b.class);
                        final rx.exceptions.b b3;
                        final rx.exceptions.b b2 = b3 = b;
                        final int n = 2;
                        final Throwable[] array = new Throwable[n];
                        final int n2 = 0;
                        final Throwable t2 = t;
                        array[n2] = t2;
                        final int n3 = 1;
                        final Throwable t3 = t4;
                        array[n3] = t3;
                        final List<Throwable> list = Arrays.asList(array);
                        new rx.exceptions.b(list);
                        final rx.exceptions.b b4 = b2;
                        rx.plugins.c.I(b4);
                        final rx.exceptions.b b5 = b2;
                        rx.b.u(b5);
                        continue;
                    }
                    try {
                        final rx.exceptions.b b = new(rx.exceptions.b.class);
                        final rx.exceptions.b b3;
                        final rx.exceptions.b b2 = b3 = b;
                        final int n = 2;
                        final Throwable[] array = new Throwable[n];
                        final int n2 = 0;
                        final Throwable t2 = t;
                        array[n2] = t2;
                        final int n3 = 1;
                        final Throwable t3 = t4;
                        array[n3] = t3;
                        final List<Throwable> list = Arrays.asList(array);
                        new rx.exceptions.b(list);
                        final rx.exceptions.b b4 = b2;
                        rx.plugins.c.I(b4);
                        final rx.exceptions.b b5 = b2;
                        rx.b.u(b5);
                        continue;
                    }
                    finally {
                        c.i();
                    }
                    break;
                }
            }
        });
        return c;
    }
    
    public final void q0(final d d) {
        d d2 = d;
        if (!(d instanceof rx.observers.d)) {
            d2 = new rx.observers.d(d);
        }
        this.G0(d2);
    }
    
    public final b r(final long n, final TimeUnit timeUnit) {
        return this.t(n, timeUnit, rx.schedulers.c.a(), false);
    }
    
    public final <T> void r0(final n<T> n) {
        n.f();
        n<T> n2 = n;
        if (!(n instanceof rx.observers.e)) {
            n2 = new rx.observers.e<T>(n);
        }
        this.I0(n2, false);
    }
    
    public final b s(final long n, final TimeUnit timeUnit, final j j) {
        return this.t(n, timeUnit, j, false);
    }
    
    public final b s0(final j j) {
        g0(j);
        return p((j0)new j0() {
            public void a(final d d) {
                final j.a a = j.a();
                a.c(new a() {
                    @Override
                    public void call() {
                        try {
                            b.this.G0(d);
                        }
                        finally {
                            a.i();
                        }
                    }
                });
            }
        });
    }
    
    public final b t(final long n, final TimeUnit timeUnit, final j j, final boolean b) {
        g0(timeUnit);
        g0(j);
        return p((j0)new j0() {
            public void a(final d d) {
                final rx.subscriptions.b b = new rx.subscriptions.b();
                final j.a a = j.a();
                b.a(a);
                rx.b.this.G0(new d() {
                    @Override
                    public void a(final o o) {
                        b.a(o);
                        d.a(b);
                    }
                    
                    @Override
                    public void b(final Throwable t) {
                        if (b) {
                            final rx.subscriptions.b g = b;
                            final j.a h = a;
                            final a a = new a() {
                                @Override
                                public void call() {
                                    try {
                                        d.b(t);
                                    }
                                    finally {
                                        a.i();
                                    }
                                }
                            };
                            final j0 j = j0.this;
                            g.a(h.d(a, n, timeUnit));
                        }
                        else {
                            d.b(t);
                        }
                    }
                    
                    @Override
                    public void c() {
                        final rx.subscriptions.b g = b;
                        final j.a h = a;
                        final a a = new a() {
                            @Override
                            public void call() {
                                try {
                                    d.c();
                                }
                                finally {
                                    a.i();
                                }
                            }
                        };
                        final j0 j = j0.this;
                        g.a(h.d(a, n, timeUnit));
                    }
                });
            }
        });
    }
    
    public final rx.observers.a<Void> t0() {
        final s7.a<Object> w = s7.a.w(Long.MAX_VALUE);
        this.r0(w);
        return (rx.observers.a<Void>)w;
    }
    
    public final b u0(final long n, final TimeUnit timeUnit) {
        return this.y0(n, timeUnit, rx.schedulers.c.a(), null);
    }
    
    public final b v(final a a) {
        return this.z(rx.functions.m.a(), rx.functions.m.a(), rx.functions.m.a(), a, rx.functions.m.a());
    }
    
    public final b v0(final long n, final TimeUnit timeUnit, final b b) {
        g0(b);
        return this.y0(n, timeUnit, rx.schedulers.c.a(), b);
    }
    
    public final b w(final a a) {
        return this.z(rx.functions.m.a(), rx.functions.m.a(), a, rx.functions.m.a(), rx.functions.m.a());
    }
    
    public final b w0(final long n, final TimeUnit timeUnit, final j j) {
        return this.y0(n, timeUnit, j, null);
    }
    
    public final b x(final rx.functions.b<rx.f<Object>> b) {
        if (b != null) {
            return this.z(rx.functions.m.a(), new rx.functions.b<Throwable>() {
                public void a(final Throwable t) {
                    b.h(rx.f.d(t));
                }
            }, new a() {
                @Override
                public void call() {
                    b.h(rx.f.b());
                }
            }, rx.functions.m.a(), rx.functions.m.a());
        }
        throw new IllegalArgumentException("onNotification is null");
    }
    
    public final b x0(final long n, final TimeUnit timeUnit, final j j, final b b) {
        g0(b);
        return this.y0(n, timeUnit, j, b);
    }
    
    public final b y(final rx.functions.b<? super Throwable> b) {
        return this.z(rx.functions.m.a(), b, rx.functions.m.a(), rx.functions.m.a(), rx.functions.m.a());
    }
    
    public final b y0(final long n, final TimeUnit timeUnit, final j j, final b b) {
        g0(timeUnit);
        g0(j);
        return p((j0)new rx.internal.operators.s(this, n, timeUnit, j, b));
    }
    
    protected final b z(final rx.functions.b<? super o> b, final rx.functions.b<? super Throwable> b2, final a a, final a a2, final a a3) {
        g0(b);
        g0(b2);
        g0(a);
        g0(a2);
        g0(a3);
        return p((j0)new j0() {
            public void a(final d d) {
                b.this.G0(new d() {
                    @Override
                    public void a(final o o) {
                        try {
                            b.h(o);
                            d.a(f.a(new a() {
                                @Override
                                public void call() {
                                    try {
                                        a3.call();
                                    }
                                    finally {
                                        final Throwable t;
                                        rx.plugins.c.I(t);
                                    }
                                    o.i();
                                }
                            }));
                        }
                        finally {
                            o.i();
                            d.a(f.e());
                            final Throwable t;
                            d.b(t);
                        }
                    }
                    
                    @Override
                    public void b(final Throwable t) {
                        rx.exceptions.b b = null;
                        try {
                            b2.h(t);
                        }
                        finally {
                            final Throwable t2;
                            b = new rx.exceptions.b(Arrays.asList(t, t2));
                        }
                        d.b(b);
                        try {
                            a2.call();
                        }
                        finally {
                            rx.plugins.c.I(t);
                        }
                    }
                    
                    @Override
                    public void c() {
                        try {
                            a.call();
                            d.c();
                            try {
                                a2.call();
                            }
                            finally {
                                final Throwable t;
                                rx.plugins.c.I(t);
                            }
                        }
                        finally {
                            final Throwable t2;
                            d.b(t2);
                        }
                    }
                });
            }
        });
    }
    
    public interface j0 extends b<d>
    {
    }
    
    public interface k0 extends p<d, d>
    {
    }
    
    public interface l0 extends p<b, b>
    {
    }
}
