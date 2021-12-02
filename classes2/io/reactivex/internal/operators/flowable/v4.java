// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.processors.h;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.c;
import o7.b;
import java.util.concurrent.Callable;
import io.reactivex.l;

public final class v4<T, B> extends io.reactivex.internal.operators.flowable.a<T, l<T>>
{
    final Callable<? extends o7.b<B>> I;
    final int J;
    
    public v4(final l<T> l, final Callable<? extends o7.b<B>> i, final int j) {
        super(l);
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void n6(final c<? super l<T>> c) {
        super.H.m6(new b<Object, Object>((o7.c<? super l<? super T>>)c, this.J, this.I));
    }
    
    static final class a<T, B> extends io.reactivex.subscribers.b<B>
    {
        final v4.b<T, B> H;
        boolean I;
        
        a(final v4.b<T, B> h) {
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.I = true;
            this.H.e(t);
        }
        
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.H.d();
        }
        
        public void m(final B b) {
            if (this.I) {
                return;
            }
            this.I = true;
            this.dispose();
            this.H.g(this);
        }
    }
    
    static final class b<T, B> extends AtomicInteger implements q<T>, d, Runnable
    {
        private static final long T = 2233020065421370272L;
        static final a<Object, Object> U;
        static final Object V;
        final c<? super l<T>> G;
        final int H;
        final AtomicReference<a<T, B>> I;
        final AtomicInteger J;
        final io.reactivex.internal.queue.a<Object> K;
        final io.reactivex.internal.util.c L;
        final AtomicBoolean M;
        final Callable<? extends o7.b<B>> N;
        final AtomicLong O;
        d P;
        volatile boolean Q;
        io.reactivex.processors.h<T> R;
        long S;
        
        static {
            U = new a(null);
            V = new Object();
        }
        
        b(final c<? super l<T>> g, final int h, final Callable<? extends o7.b<B>> n) {
            this.G = g;
            this.H = h;
            this.I = new AtomicReference<a<T, B>>();
            this.J = new AtomicInteger(1);
            this.K = new io.reactivex.internal.queue.a<Object>();
            this.L = new io.reactivex.internal.util.c();
            this.M = new AtomicBoolean();
            this.N = n;
            this.O = new AtomicLong();
        }
        
        void a() {
            final AtomicReference<a<T, B>> i = this.I;
            final a<Object, Object> u = b.U;
            final a a = (a)i.getAndSet((a<T, B>)u);
            if (a != null && a != u) {
                a.dispose();
            }
        }
        
        public void b(final Throwable t) {
            this.a();
            if (this.L.a(t)) {
                this.Q = true;
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super l<T>> g = this.G;
            final io.reactivex.internal.queue.a<Object> k = this.K;
            final io.reactivex.internal.util.c l = this.L;
            long s = this.S;
            int addAndGet = 1;
            while (this.J.get() != 0) {
                final io.reactivex.processors.h<T> r = this.R;
                final boolean q = this.Q;
                if (q && l.get() != null) {
                    k.clear();
                    final Throwable c = l.c();
                    if (r != null) {
                        this.R = null;
                        r.b(c);
                    }
                    g.b(c);
                    return;
                }
                final T poll = k.poll();
                final boolean b = poll == null;
                if (q && b) {
                    final Throwable c2 = l.c();
                    if (c2 == null) {
                        if (r != null) {
                            this.R = null;
                            r.f();
                        }
                        g.f();
                    }
                    else {
                        if (r != null) {
                            this.R = null;
                            r.b(c2);
                        }
                        g.b(c2);
                    }
                    return;
                }
                if (b) {
                    this.S = s;
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else if (poll != v4.b.V) {
                    r.m(poll);
                }
                else {
                    if (r != null) {
                        this.R = null;
                        r.f();
                    }
                    if (this.M.get()) {
                        continue;
                    }
                    io.reactivex.exceptions.c c3 = null;
                    if (s != this.O.get()) {
                        final io.reactivex.processors.h<T> x8 = io.reactivex.processors.h.X8(this.H, this);
                        this.R = x8;
                        this.J.getAndIncrement();
                        try {
                            final o7.b b2 = io.reactivex.internal.functions.b.g((o7.b)this.N.call(), "The other Callable returned a null Publisher");
                            final a newValue = new a((b<Object, Object>)this);
                            if (this.I.compareAndSet(null, (a<T, B>)newValue)) {
                                b2.e((c)newValue);
                                ++s;
                                g.m((Object)x8);
                                continue;
                            }
                            continue;
                        }
                        finally {
                            io.reactivex.exceptions.b.b(c3);
                        }
                    }
                    else {
                        this.P.cancel();
                        this.a();
                        c3 = new io.reactivex.exceptions.c("Could not deliver a window due to lack of requests");
                    }
                    l.a(c3);
                    this.Q = true;
                }
            }
            k.clear();
            this.R = null;
        }
        
        public void cancel() {
            if (this.M.compareAndSet(false, true)) {
                this.a();
                if (this.J.decrementAndGet() == 0) {
                    this.P.cancel();
                }
            }
        }
        
        void d() {
            this.P.cancel();
            this.Q = true;
            this.c();
        }
        
        void e(final Throwable t) {
            this.P.cancel();
            if (this.L.a(t)) {
                this.Q = true;
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void f() {
            this.a();
            this.Q = true;
            this.c();
        }
        
        void g(final a<T, B> expectedValue) {
            this.I.compareAndSet(expectedValue, null);
            this.K.offer(b.V);
            this.c();
        }
        
        public void m(final T t) {
            this.K.offer(t);
            this.c();
        }
        
        public void run() {
            if (this.J.decrementAndGet() == 0) {
                this.P.cancel();
            }
        }
        
        public void v(final long n) {
            io.reactivex.internal.util.d.a(this.O, n);
        }
        
        @Override
        public void z(final d p) {
            if (j.o(this.P, p)) {
                this.P = p;
                this.G.z((d)this);
                this.K.offer(b.V);
                this.c();
                p.v(Long.MAX_VALUE);
            }
        }
    }
}
