// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.n0;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.b;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import io.reactivex.q0;
import x5.o;

public final class e1<T, R> extends io.reactivex.internal.operators.flowable.a<T, R>
{
    final o<? super T, ? extends q0<? extends R>> I;
    final boolean J;
    final int K;
    
    public e1(final l<T> l, final o<? super T, ? extends q0<? extends R>> i, final boolean j, final int k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        super.H.m6(new a<Object, Object>(c, this.I, this.J, this.K));
    }
    
    static final class a<T, R> extends AtomicInteger implements q<T>, d
    {
        private static final long R = 8600231336733376951L;
        final c<? super R> G;
        final boolean H;
        final int I;
        final AtomicLong J;
        final b K;
        final AtomicInteger L;
        final io.reactivex.internal.util.c M;
        final o<? super T, ? extends q0<? extends R>> N;
        final AtomicReference<io.reactivex.internal.queue.c<R>> O;
        d P;
        volatile boolean Q;
        
        a(final c<? super R> g, final o<? super T, ? extends q0<? extends R>> n, final boolean h, final int i) {
            this.G = g;
            this.N = n;
            this.H = h;
            this.I = i;
            this.J = new AtomicLong();
            this.K = new b();
            this.M = new io.reactivex.internal.util.c();
            this.L = new AtomicInteger(1);
            this.O = new AtomicReference<io.reactivex.internal.queue.c<R>>();
        }
        
        void a() {
            final io.reactivex.internal.queue.c<R> c = this.O.get();
            if (c != null) {
                c.clear();
            }
        }
        
        public void b(final Throwable t) {
            this.L.decrementAndGet();
            if (this.M.a(t)) {
                if (!this.H) {
                    this.K.dispose();
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
        
        public void cancel() {
            this.Q = true;
            this.P.cancel();
            this.K.dispose();
        }
        
        void d() {
            final c<? super R> g = this.G;
            final AtomicInteger l = this.L;
            final AtomicReference<io.reactivex.internal.queue.c<R>> o = this.O;
            int addAndGet = 1;
            do {
                final long value = this.J.get();
                long n = 0L;
                Label_0077: {
                    int n2;
                    long n3;
                    while (true) {
                        n2 = 0;
                        n3 = lcmp(n, value);
                        if (n3 == 0) {
                            break;
                        }
                        if (this.Q) {
                            this.a();
                            return;
                        }
                        if (!this.H && this.M.get() != null) {
                            break Label_0077;
                        }
                        final boolean b = l.get() == 0;
                        final io.reactivex.internal.queue.c<R> c = o.get();
                        Object poll;
                        if (c != null) {
                            poll = c.poll();
                        }
                        else {
                            poll = null;
                        }
                        final boolean b2 = poll == null;
                        if (b && b2) {
                            final Throwable c2 = this.M.c();
                            if (c2 != null) {
                                g.b(c2);
                            }
                            else {
                                g.f();
                            }
                            return;
                        }
                        if (b2) {
                            break;
                        }
                        g.m(poll);
                        ++n;
                    }
                    if (n3 == 0) {
                        if (this.Q) {
                            this.a();
                            return;
                        }
                        if (!this.H && this.M.get() != null) {
                            break Label_0077;
                        }
                        final boolean b3 = l.get() == 0;
                        final io.reactivex.internal.queue.c<R> c3 = o.get();
                        int n4 = 0;
                        Label_0308: {
                            if (c3 != null) {
                                n4 = n2;
                                if (!c3.isEmpty()) {
                                    break Label_0308;
                                }
                            }
                            n4 = 1;
                        }
                        if (b3 && n4 != 0) {
                            final Throwable c4 = this.M.c();
                            if (c4 != null) {
                                g.b(c4);
                            }
                            else {
                                g.f();
                            }
                            return;
                        }
                    }
                    if (n == 0L) {
                        continue;
                    }
                    io.reactivex.internal.util.d.e(this.J, n);
                    if (this.I != Integer.MAX_VALUE) {
                        this.P.v(n);
                        continue;
                    }
                    continue;
                }
                final Throwable c5 = this.M.c();
                this.a();
                g.b(c5);
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        io.reactivex.internal.queue.c<R> e() {
            io.reactivex.internal.queue.c<R> newValue;
            do {
                final io.reactivex.internal.queue.c<R> c = this.O.get();
                if (c != null) {
                    return c;
                }
                newValue = new io.reactivex.internal.queue.c<R>(l.b0());
            } while (!this.O.compareAndSet(null, newValue));
            return newValue;
        }
        
        public void f() {
            this.L.decrementAndGet();
            this.c();
        }
        
        void g(final e1.a.a a, final Throwable t) {
            this.K.c(a);
            if (this.M.a(t)) {
                if (!this.H) {
                    this.P.cancel();
                    this.K.dispose();
                }
                else if (this.I != Integer.MAX_VALUE) {
                    this.P.v(1L);
                }
                this.L.decrementAndGet();
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void h(e1.a.a a, final R r) {
            this.K.c(a);
            Label_0212: {
                if (this.get() == 0) {
                    boolean b = false;
                    if (this.compareAndSet(0, 1)) {
                        if (this.L.decrementAndGet() == 0) {
                            b = true;
                        }
                        Label_0168: {
                            if (this.J.get() != 0L) {
                                this.G.m((Object)r);
                                a = (e1.a.a)this.O.get();
                                if (b && (a == null || ((io.reactivex.internal.queue.c)a).isEmpty())) {
                                    final Throwable c = this.M.c();
                                    if (c != null) {
                                        this.G.b(c);
                                    }
                                    else {
                                        this.G.f();
                                    }
                                    return;
                                }
                                io.reactivex.internal.util.d.e(this.J, 1L);
                                if (this.I != Integer.MAX_VALUE) {
                                    this.P.v(1L);
                                    break Label_0168;
                                }
                                break Label_0168;
                            }
                            a = (e1.a.a)this.e();
                            synchronized (a) {
                                ((io.reactivex.internal.queue.c<R>)a).offer(r);
                                // monitorexit(a)
                                if (this.decrementAndGet() == 0) {
                                    return;
                                }
                                break Label_0212;
                            }
                        }
                    }
                }
                a = (e1.a.a)this.e();
                synchronized (a) {
                    ((io.reactivex.internal.queue.c<R>)a).offer(r);
                    // monitorexit(a)
                    this.L.decrementAndGet();
                    if (this.getAndIncrement() != 0) {
                        return;
                    }
                    this.d();
                }
            }
        }
        
        public void m(final T t) {
            try {
                final q0 q0 = io.reactivex.internal.functions.b.g((q0)this.N.apply((Object)t), "The mapper returned a null SingleSource");
                this.L.getAndIncrement();
                final e1.a.a a = new e1.a.a();
                if (!this.Q && this.K.b(a)) {
                    q0.c(a);
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.P.cancel();
                this.b(t2);
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.J, n);
                this.c();
            }
        }
        
        @Override
        public void z(final d p) {
            if (j.o(this.P, p)) {
                this.P = p;
                this.G.z((d)this);
                final int i = this.I;
                long n;
                if (i == Integer.MAX_VALUE) {
                    n = Long.MAX_VALUE;
                }
                else {
                    n = i;
                }
                p.v(n);
            }
        }
        
        final class a extends AtomicReference<c> implements n0<R>, c
        {
            private static final long H = -502562646270949838L;
            
            @Override
            public void b(final Throwable t) {
                e1.a.this.g(this, t);
            }
            
            @Override
            public void d(final R r) {
                e1.a.this.h(this, r);
            }
            
            @Override
            public void dispose() {
                io.reactivex.internal.disposables.d.b(this);
            }
            
            @Override
            public boolean i() {
                return io.reactivex.internal.disposables.d.d(this.get());
            }
            
            @Override
            public void l(final c c) {
                io.reactivex.internal.disposables.d.j(this, c);
            }
        }
    }
}
