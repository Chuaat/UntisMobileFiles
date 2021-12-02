// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.subjects.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.observers.e;
import io.reactivex.i0;
import io.reactivex.g0;
import java.util.concurrent.Callable;
import io.reactivex.b0;

public final class h4<T, B> extends io.reactivex.internal.operators.observable.a<T, b0<T>>
{
    final Callable<? extends g0<B>> H;
    final int I;
    
    public h4(final g0<T> g0, final Callable<? extends g0<B>> h, final int i) {
        super(g0);
        this.H = h;
        this.I = i;
    }
    
    public void L5(final i0<? super b0<T>> i0) {
        super.G.c(new b<Object, Object>((i0<? super b0<? super T>>)i0, this.I, this.H));
    }
    
    static final class a<T, B> extends e<B>
    {
        final b<T, B> H;
        boolean I;
        
        a(final b<T, B> h) {
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.I = true;
            this.H.e(t);
        }
        
        @Override
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.H.d();
        }
        
        @Override
        public void m(final B b) {
            if (this.I) {
                return;
            }
            this.I = true;
            this.dispose();
            this.H.g(this);
        }
    }
    
    static final class b<T, B> extends AtomicInteger implements i0<T>, c, Runnable
    {
        private static final long R = 2233020065421370272L;
        static final a<Object, Object> S;
        static final Object T;
        final i0<? super b0<T>> G;
        final int H;
        final AtomicReference<a<T, B>> I;
        final AtomicInteger J;
        final io.reactivex.internal.queue.a<Object> K;
        final io.reactivex.internal.util.c L;
        final AtomicBoolean M;
        final Callable<? extends g0<B>> N;
        c O;
        volatile boolean P;
        j<T> Q;
        
        static {
            S = new a(null);
            T = new Object();
        }
        
        b(final i0<? super b0<T>> g, final int h, final Callable<? extends g0<B>> n) {
            this.G = g;
            this.H = h;
            this.I = new AtomicReference<a<T, B>>();
            this.J = new AtomicInteger(1);
            this.K = new io.reactivex.internal.queue.a<Object>();
            this.L = new io.reactivex.internal.util.c();
            this.M = new AtomicBoolean();
            this.N = n;
        }
        
        void a() {
            final AtomicReference<a<T, B>> i = this.I;
            final a<Object, Object> s = b.S;
            final a a = (a)i.getAndSet((a<T, B>)s);
            if (a != null && a != s) {
                a.dispose();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.a();
            if (this.L.a(t)) {
                this.P = true;
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
            final i0<? super b0<T>> g = this.G;
            final io.reactivex.internal.queue.a<Object> k = this.K;
            final io.reactivex.internal.util.c l = this.L;
            int addAndGet = 1;
            while (this.J.get() != 0) {
                final j<T> q = this.Q;
                final boolean p = this.P;
                if (p && l.get() != null) {
                    k.clear();
                    final Throwable c = l.c();
                    if (q != null) {
                        this.Q = null;
                        q.b(c);
                    }
                    g.b(c);
                    return;
                }
                final T poll = k.poll();
                final boolean b = poll == null;
                if (p && b) {
                    final Throwable c2 = l.c();
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
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else if (poll != h4.b.T) {
                    q.m(poll);
                }
                else {
                    if (q != null) {
                        this.Q = null;
                        q.f();
                    }
                    if (this.M.get()) {
                        continue;
                    }
                    final j<T> s8 = j.s8(this.H, this);
                    this.Q = s8;
                    this.J.getAndIncrement();
                    try {
                        final g0 g2 = io.reactivex.internal.functions.b.g((g0)this.N.call(), "The other Callable returned a null ObservableSource");
                        final a newValue = new a((b<Object, Object>)this);
                        if (!this.I.compareAndSet(null, (a<T, B>)newValue)) {
                            continue;
                        }
                        g2.c(newValue);
                        g.m(s8);
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        l.a(t);
                        this.P = true;
                    }
                }
            }
            k.clear();
            this.Q = null;
        }
        
        void d() {
            this.O.dispose();
            this.P = true;
            this.c();
        }
        
        @Override
        public void dispose() {
            if (this.M.compareAndSet(false, true)) {
                this.a();
                if (this.J.decrementAndGet() == 0) {
                    this.O.dispose();
                }
            }
        }
        
        void e(final Throwable t) {
            this.O.dispose();
            if (this.L.a(t)) {
                this.P = true;
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void f() {
            this.a();
            this.P = true;
            this.c();
        }
        
        void g(final a<T, B> expectedValue) {
            this.I.compareAndSet(expectedValue, null);
            this.K.offer(b.T);
            this.c();
        }
        
        @Override
        public boolean i() {
            return this.M.get();
        }
        
        @Override
        public void l(final c o) {
            if (d.l(this.O, o)) {
                this.O = o;
                this.G.l(this);
                this.K.offer(b.T);
                this.c();
            }
        }
        
        @Override
        public void m(final T t) {
            this.K.offer(t);
            this.c();
        }
        
        @Override
        public void run() {
            if (this.J.decrementAndGet() == 0) {
                this.O.dispose();
            }
        }
    }
}
