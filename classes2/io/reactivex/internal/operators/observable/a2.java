// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import y5.n;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.v;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;
import io.reactivex.y;

public final class a2<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final y<? extends T> H;
    
    public a2(final b0<T> b0, final y<? extends T> h) {
        super(b0);
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        final a<Object> a = new a<Object>((i0<? super Object>)i0);
        i0.l(a);
        super.G.c(a);
        this.H.c(a.I);
    }
    
    static final class a<T> extends AtomicInteger implements i0<T>, c
    {
        private static final long P = -4592979584110982903L;
        static final int Q = 1;
        static final int R = 2;
        final i0<? super T> G;
        final AtomicReference<c> H;
        final a2.a.a<T> I;
        final io.reactivex.internal.util.c J;
        volatile n<T> K;
        T L;
        volatile boolean M;
        volatile boolean N;
        volatile int O;
        
        a(final i0<? super T> g) {
            this.G = g;
            this.H = new AtomicReference<c>();
            this.I = new a2.a.a<T>(this);
            this.J = new io.reactivex.internal.util.c();
        }
        
        void a() {
            if (this.getAndIncrement() == 0) {
                this.c();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.J.a(t)) {
                d.b(this.H);
                this.a();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c() {
            final i0<? super T> g = this.G;
            int addAndGet = 1;
            while (!this.M) {
                if (this.J.get() != null) {
                    this.L = null;
                    this.K = null;
                    g.b(this.J.c());
                    return;
                }
                int o;
                if ((o = this.O) == 1) {
                    final T l = this.L;
                    this.L = null;
                    this.O = 2;
                    g.m(l);
                    o = 2;
                }
                final boolean n = this.N;
                final n<T> k = this.K;
                T poll;
                if (k != null) {
                    poll = k.poll();
                }
                else {
                    poll = null;
                }
                final boolean b = poll == null;
                if (n && b && o == 2) {
                    this.K = null;
                    g.f();
                    return;
                }
                if (b) {
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    g.m(poll);
                }
            }
            this.L = null;
            this.K = null;
        }
        
        n<T> d() {
            n<T> k;
            if ((k = this.K) == null) {
                k = new io.reactivex.internal.queue.c<T>(b0.X());
                this.K = k;
            }
            return k;
        }
        
        @Override
        public void dispose() {
            this.M = true;
            d.b(this.H);
            d.b(this.I);
            if (this.getAndIncrement() == 0) {
                this.K = null;
                this.L = null;
            }
        }
        
        void e() {
            this.O = 2;
            this.a();
        }
        
        @Override
        public void f() {
            this.N = true;
            this.a();
        }
        
        void g(final Throwable t) {
            if (this.J.a(t)) {
                d.b(this.H);
                this.a();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void h(final T l) {
            if (this.compareAndSet(0, 1)) {
                this.G.m((Object)l);
                this.O = 2;
            }
            else {
                this.L = l;
                this.O = 1;
                if (this.getAndIncrement() != 0) {
                    return;
                }
            }
            this.c();
        }
        
        @Override
        public boolean i() {
            return d.d(this.H.get());
        }
        
        @Override
        public void l(final c c) {
            d.j(this.H, c);
        }
        
        @Override
        public void m(final T t) {
            if (this.compareAndSet(0, 1)) {
                this.G.m((Object)t);
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            else {
                this.d().offer(t);
                if (this.getAndIncrement() != 0) {
                    return;
                }
            }
            this.c();
        }
        
        static final class a<T> extends AtomicReference<c> implements v<T>
        {
            private static final long H = -2935427570954647017L;
            final a2.a<T> G;
            
            a(final a2.a<T> g) {
                this.G = g;
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.g(t);
            }
            
            @Override
            public void d(final T t) {
                this.G.h(t);
            }
            
            @Override
            public void f() {
                this.G.e();
            }
            
            @Override
            public void l(final c c) {
                d.j(this, c);
            }
        }
    }
}
