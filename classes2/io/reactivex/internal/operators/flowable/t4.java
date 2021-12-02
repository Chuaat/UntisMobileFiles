// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.processors.h;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.d;
import o7.c;
import o7.b;
import io.reactivex.l;

public final class t4<T, B> extends io.reactivex.internal.operators.flowable.a<T, l<T>>
{
    final o7.b<B> I;
    final int J;
    
    public t4(final l<T> l, final o7.b<B> i, final int j) {
        super(l);
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void n6(final c<? super l<T>> c) {
        final b b = new b((c<? super l<T>>)c, this.J);
        c.z((d)b);
        b.e();
        this.I.e((c)b.I);
        super.H.m6(b);
    }
    
    static final class a<T, B> extends io.reactivex.subscribers.b<B>
    {
        final t4.b<T, B> H;
        boolean I;
        
        a(final t4.b<T, B> h) {
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.I = true;
            this.H.d(t);
        }
        
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.H.c();
        }
        
        public void m(final B b) {
            if (this.I) {
                return;
            }
            this.H.e();
        }
    }
    
    static final class b<T, B> extends AtomicInteger implements q<T>, d, Runnable
    {
        private static final long S = 2233020065421370272L;
        static final Object T;
        final c<? super l<T>> G;
        final int H;
        final a<T, B> I;
        final AtomicReference<d> J;
        final AtomicInteger K;
        final io.reactivex.internal.queue.a<Object> L;
        final io.reactivex.internal.util.c M;
        final AtomicBoolean N;
        final AtomicLong O;
        volatile boolean P;
        io.reactivex.processors.h<T> Q;
        long R;
        
        static {
            T = new Object();
        }
        
        b(final c<? super l<T>> g, final int h) {
            this.G = g;
            this.H = h;
            this.I = (a<T, B>)new a((b<Object, Object>)this);
            this.J = new AtomicReference<d>();
            this.K = new AtomicInteger(1);
            this.L = new io.reactivex.internal.queue.a<Object>();
            this.M = new io.reactivex.internal.util.c();
            this.N = new AtomicBoolean();
            this.O = new AtomicLong();
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super l<T>> g = this.G;
            final io.reactivex.internal.queue.a<Object> l = this.L;
            final io.reactivex.internal.util.c m = this.M;
            long r = this.R;
            int addAndGet = 1;
            while (this.K.get() != 0) {
                final io.reactivex.processors.h<T> q = this.Q;
                final boolean p = this.P;
                if (p && m.get() != null) {
                    l.clear();
                    final Throwable c = m.c();
                    if (q != null) {
                        this.Q = null;
                        q.b(c);
                    }
                    g.b(c);
                    return;
                }
                final T poll = l.poll();
                final boolean b = poll == null;
                if (p && b) {
                    final Throwable c2 = m.c();
                    if (c2 == null) {
                        if (q != null) {
                            this.Q = null;
                            q.f();
                        }
                        g.f();
                    }
                    else {
                        if (q != null) {
                            this.Q = null;
                            q.b(c2);
                        }
                        g.b(c2);
                    }
                    return;
                }
                if (b) {
                    this.R = r;
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else if (poll != t4.b.T) {
                    q.m(poll);
                }
                else {
                    if (q != null) {
                        this.Q = null;
                        q.f();
                    }
                    if (this.N.get()) {
                        continue;
                    }
                    final io.reactivex.processors.h<T> x8 = io.reactivex.processors.h.X8(this.H, this);
                    this.Q = x8;
                    this.K.getAndIncrement();
                    if (r != this.O.get()) {
                        ++r;
                        g.m((Object)x8);
                    }
                    else {
                        j.b(this.J);
                        this.I.dispose();
                        m.a(new io.reactivex.exceptions.c("Could not deliver a window due to lack of requests"));
                        this.P = true;
                    }
                }
            }
            l.clear();
            this.Q = null;
        }
        
        public void b(final Throwable t) {
            this.I.dispose();
            if (this.M.a(t)) {
                this.P = true;
                this.a();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c() {
            j.b(this.J);
            this.P = true;
            this.a();
        }
        
        public void cancel() {
            if (this.N.compareAndSet(false, true)) {
                this.I.dispose();
                if (this.K.decrementAndGet() == 0) {
                    j.b(this.J);
                }
            }
        }
        
        void d(final Throwable t) {
            j.b(this.J);
            if (this.M.a(t)) {
                this.P = true;
                this.a();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void e() {
            this.L.offer(b.T);
            this.a();
        }
        
        public void f() {
            this.I.dispose();
            this.P = true;
            this.a();
        }
        
        public void m(final T t) {
            this.L.offer(t);
            this.a();
        }
        
        public void run() {
            if (this.K.decrementAndGet() == 0) {
                j.b(this.J);
            }
        }
        
        public void v(final long n) {
            io.reactivex.internal.util.d.a(this.O, n);
        }
        
        @Override
        public void z(final d d) {
            j.l(this.J, d, Long.MAX_VALUE);
        }
    }
}
