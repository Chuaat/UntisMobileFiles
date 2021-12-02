// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.n0;
import io.reactivex.internal.disposables.d;
import io.reactivex.b0;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.q0;
import x5.o;

public final class a1<T, R> extends io.reactivex.internal.operators.observable.a<T, R>
{
    final o<? super T, ? extends q0<? extends R>> H;
    final boolean I;
    
    public a1(final g0<T> g0, final o<? super T, ? extends q0<? extends R>> h, final boolean i) {
        super(g0);
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        super.G.c(new a<Object, Object>(i0, this.H, this.I));
    }
    
    static final class a<T, R> extends AtomicInteger implements i0<T>, c
    {
        private static final long P = 8600231336733376951L;
        final i0<? super R> G;
        final boolean H;
        final b I;
        final AtomicInteger J;
        final io.reactivex.internal.util.c K;
        final o<? super T, ? extends q0<? extends R>> L;
        final AtomicReference<io.reactivex.internal.queue.c<R>> M;
        c N;
        volatile boolean O;
        
        a(final i0<? super R> g, final o<? super T, ? extends q0<? extends R>> l, final boolean h) {
            this.G = g;
            this.L = l;
            this.H = h;
            this.I = new b();
            this.K = new io.reactivex.internal.util.c();
            this.J = new AtomicInteger(1);
            this.M = new AtomicReference<io.reactivex.internal.queue.c<R>>();
        }
        
        void a() {
            final io.reactivex.internal.queue.c<R> c = this.M.get();
            if (c != null) {
                c.clear();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.J.decrementAndGet();
            if (this.K.a(t)) {
                if (!this.H) {
                    this.I.dispose();
                }
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c() {
            if (this.getAndIncrement() == 0) {
                this.d();
            }
        }
        
        void d() {
            final i0<? super R> g = this.G;
            final AtomicInteger j = this.J;
            final AtomicReference<io.reactivex.internal.queue.c<R>> m = this.M;
            int addAndGet = 1;
            while (!this.O) {
                if (!this.H && this.K.get() != null) {
                    final Throwable c = this.K.c();
                    this.a();
                    g.b(c);
                    return;
                }
                final int value = j.get();
                boolean b = false;
                final boolean b2 = value == 0;
                final io.reactivex.internal.queue.c<R> c2 = m.get();
                Object poll;
                if (c2 != null) {
                    poll = c2.poll();
                }
                else {
                    poll = null;
                }
                if (poll == null) {
                    b = true;
                }
                if (b2 && b) {
                    final Throwable c3 = this.K.c();
                    if (c3 != null) {
                        g.b(c3);
                    }
                    else {
                        g.f();
                    }
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
            this.a();
        }
        
        @Override
        public void dispose() {
            this.O = true;
            this.N.dispose();
            this.I.dispose();
        }
        
        io.reactivex.internal.queue.c<R> e() {
            io.reactivex.internal.queue.c<R> newValue;
            do {
                final io.reactivex.internal.queue.c<R> c = this.M.get();
                if (c != null) {
                    return c;
                }
                newValue = new io.reactivex.internal.queue.c<R>(b0.X());
            } while (!this.M.compareAndSet(null, newValue));
            return newValue;
        }
        
        @Override
        public void f() {
            this.J.decrementAndGet();
            this.c();
        }
        
        void g(final a1.a.a a, final Throwable t) {
            this.I.c(a);
            if (this.K.a(t)) {
                if (!this.H) {
                    this.N.dispose();
                    this.I.dispose();
                }
                this.J.decrementAndGet();
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void h(a1.a.a e, final R r) {
            this.I.c(e);
            Label_0149: {
                if (this.get() == 0) {
                    boolean b = false;
                    if (this.compareAndSet(0, 1)) {
                        this.G.m((Object)r);
                        if (this.J.decrementAndGet() == 0) {
                            b = true;
                        }
                        e = (a1.a.a)this.M.get();
                        if (b && (e == null || ((io.reactivex.internal.queue.c)e).isEmpty())) {
                            final Throwable c = this.K.c();
                            if (c != null) {
                                this.G.b(c);
                            }
                            else {
                                this.G.f();
                            }
                            return;
                        }
                        if (this.decrementAndGet() == 0) {
                            return;
                        }
                        break Label_0149;
                    }
                }
                e = (a1.a.a)this.e();
                synchronized (e) {
                    ((io.reactivex.internal.queue.c<R>)e).offer(r);
                    // monitorexit(e)
                    this.J.decrementAndGet();
                    if (this.getAndIncrement() != 0) {
                        return;
                    }
                    this.d();
                }
            }
        }
        
        @Override
        public boolean i() {
            return this.O;
        }
        
        @Override
        public void l(final c n) {
            if (d.l(this.N, n)) {
                this.N = n;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            try {
                final q0 q0 = io.reactivex.internal.functions.b.g((q0)this.L.apply((Object)t), "The mapper returned a null SingleSource");
                this.J.getAndIncrement();
                final a1.a.a a = new a1.a.a();
                if (!this.O && this.I.b(a)) {
                    q0.c(a);
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.N.dispose();
                this.b(t2);
            }
        }
        
        final class a extends AtomicReference<c> implements n0<R>, c
        {
            private static final long H = -502562646270949838L;
            
            @Override
            public void b(final Throwable t) {
                a1.a.this.g(this, t);
            }
            
            @Override
            public void d(final R r) {
                a1.a.this.h(this, r);
            }
            
            @Override
            public void dispose() {
                d.b(this);
            }
            
            @Override
            public boolean i() {
                return d.d(this.get());
            }
            
            @Override
            public void l(final c c) {
                d.j(this, c);
            }
        }
    }
}
