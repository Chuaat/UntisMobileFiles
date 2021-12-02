// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.subjects.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.observers.e;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;

public final class f4<T, B> extends io.reactivex.internal.operators.observable.a<T, b0<T>>
{
    final g0<B> H;
    final int I;
    
    public f4(final g0<T> g0, final g0<B> h, final int i) {
        super(g0);
        this.H = h;
        this.I = i;
    }
    
    public void L5(final i0<? super b0<T>> i0) {
        final b<Object, Object> b = new b<Object, Object>((i0<? super b0<Object>>)i0, this.I);
        i0.l(b);
        this.H.c((i0<? super B>)b.I);
        super.G.c(b);
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
            this.H.d(t);
        }
        
        @Override
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.H.c();
        }
        
        @Override
        public void m(final B b) {
            if (this.I) {
                return;
            }
            this.H.e();
        }
    }
    
    static final class b<T, B> extends AtomicInteger implements i0<T>, c, Runnable
    {
        private static final long Q = 2233020065421370272L;
        static final Object R;
        final i0<? super b0<T>> G;
        final int H;
        final a<T, B> I;
        final AtomicReference<c> J;
        final AtomicInteger K;
        final io.reactivex.internal.queue.a<Object> L;
        final io.reactivex.internal.util.c M;
        final AtomicBoolean N;
        volatile boolean O;
        j<T> P;
        
        static {
            R = new Object();
        }
        
        b(final i0<? super b0<T>> g, final int h) {
            this.G = g;
            this.H = h;
            this.I = (a<T, B>)new a((b<Object, Object>)this);
            this.J = new AtomicReference<c>();
            this.K = new AtomicInteger(1);
            this.L = new io.reactivex.internal.queue.a<Object>();
            this.M = new io.reactivex.internal.util.c();
            this.N = new AtomicBoolean();
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final i0<? super b0<T>> g = this.G;
            final io.reactivex.internal.queue.a<Object> l = this.L;
            final io.reactivex.internal.util.c m = this.M;
            int addAndGet = 1;
            while (this.K.get() != 0) {
                final j<T> p = this.P;
                final boolean o = this.O;
                if (o && m.get() != null) {
                    l.clear();
                    final Throwable c = m.c();
                    if (p != null) {
                        this.P = null;
                        p.b(c);
                    }
                    g.b(c);
                    return;
                }
                final T poll = l.poll();
                final boolean b = poll == null;
                if (o && b) {
                    final Throwable c2 = m.c();
                    if (c2 == null) {
                        if (p != null) {
                            this.P = null;
                            p.f();
                        }
                        g.f();
                    }
                    else {
                        if (p != null) {
                            this.P = null;
                            p.b(c2);
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
                else if (poll != f4.b.R) {
                    p.m(poll);
                }
                else {
                    if (p != null) {
                        this.P = null;
                        p.f();
                    }
                    if (this.N.get()) {
                        continue;
                    }
                    final j<T> s8 = j.s8(this.H, this);
                    this.P = s8;
                    this.K.getAndIncrement();
                    g.m(s8);
                }
            }
            l.clear();
            this.P = null;
        }
        
        @Override
        public void b(final Throwable t) {
            this.I.dispose();
            if (this.M.a(t)) {
                this.O = true;
                this.a();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c() {
            d.b(this.J);
            this.O = true;
            this.a();
        }
        
        void d(final Throwable t) {
            d.b(this.J);
            if (this.M.a(t)) {
                this.O = true;
                this.a();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            if (this.N.compareAndSet(false, true)) {
                this.I.dispose();
                if (this.K.decrementAndGet() == 0) {
                    d.b(this.J);
                }
            }
        }
        
        void e() {
            this.L.offer(b.R);
            this.a();
        }
        
        @Override
        public void f() {
            this.I.dispose();
            this.O = true;
            this.a();
        }
        
        @Override
        public boolean i() {
            return this.N.get();
        }
        
        @Override
        public void l(final c c) {
            if (d.j(this.J, c)) {
                this.e();
            }
        }
        
        @Override
        public void m(final T t) {
            this.L.offer(t);
            this.a();
        }
        
        @Override
        public void run() {
            if (this.K.decrementAndGet() == 0) {
                d.b(this.J);
            }
        }
    }
}
