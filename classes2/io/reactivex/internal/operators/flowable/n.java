// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import io.reactivex.internal.subscriptions.j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.d;
import o7.c;
import io.reactivex.l;
import x5.o;
import o7.b;
import java.util.concurrent.Callable;
import java.util.Collection;

public final class n<T, U extends Collection<? super T>, Open, Close> extends io.reactivex.internal.operators.flowable.a<T, U>
{
    final Callable<U> I;
    final o7.b<? extends Open> J;
    final o<? super Open, ? extends o7.b<? extends Close>> K;
    
    public n(final l<T> l, final o7.b<? extends Open> j, final o<? super Open, ? extends o7.b<? extends Close>> k, final Callable<U> i) {
        super(l);
        this.J = j;
        this.K = k;
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super U> c) {
        final a a = new a<Object, Object, Object, Object>(c, this.J, this.K, this.I);
        c.z((d)a);
        super.H.m6(a);
    }
    
    static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements q<T>, d
    {
        private static final long U = -8466418554264089604L;
        final c<? super C> G;
        final Callable<C> H;
        final o7.b<? extends Open> I;
        final o<? super Open, ? extends o7.b<? extends Close>> J;
        final io.reactivex.disposables.b K;
        final AtomicLong L;
        final AtomicReference<d> M;
        final io.reactivex.internal.util.c N;
        volatile boolean O;
        final io.reactivex.internal.queue.c<C> P;
        volatile boolean Q;
        long R;
        Map<Long, C> S;
        long T;
        
        a(final c<? super C> g, final o7.b<? extends Open> i, final o<? super Open, ? extends o7.b<? extends Close>> j, final Callable<C> h) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.P = new io.reactivex.internal.queue.c<C>(l.b0());
            this.K = new io.reactivex.disposables.b();
            this.L = new AtomicLong();
            this.M = new AtomicReference<d>();
            this.S = new LinkedHashMap<Long, C>();
            this.N = new io.reactivex.internal.util.c();
        }
        
        void a(final io.reactivex.disposables.c c, final Throwable t) {
            j.b(this.M);
            this.K.c(c);
            this.b(t);
        }
        
        public void b(final Throwable t) {
            if (this.N.a(t)) {
                this.K.dispose();
                synchronized (this) {
                    this.S = null;
                    // monitorexit(this)
                    this.O = true;
                    this.d();
                    return;
                }
            }
            io.reactivex.plugins.a.Y(t);
        }
        
        void c(final b<T, C> b, final long l) {
            this.K.c(b);
            boolean b2;
            if (this.K.g() == 0) {
                j.b(this.M);
                b2 = true;
            }
            else {
                b2 = false;
            }
            synchronized (this) {
                final Map<Long, C> s = this.S;
                if (s == null) {
                    return;
                }
                this.P.offer(s.remove(l));
                // monitorexit(this)
                if (b2) {
                    this.O = true;
                }
                this.d();
            }
        }
        
        public void cancel() {
            if (j.b(this.M)) {
                this.Q = true;
                this.K.dispose();
                synchronized (this) {
                    this.S = null;
                    // monitorexit(this)
                    if (this.getAndIncrement() != 0) {
                        this.P.clear();
                    }
                }
            }
        }
        
        void d() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            long t = this.T;
            final c<? super C> g = this.G;
            final io.reactivex.internal.queue.c<C> p = this.P;
            int addAndGet = 1;
            do {
                final long value = this.L.get();
                Label_0081: {
                    long n;
                    while (true) {
                        n = lcmp(t, value);
                        if (n == 0) {
                            break;
                        }
                        if (this.Q) {
                            p.clear();
                            return;
                        }
                        final boolean o = this.O;
                        if (o && this.N.get() != null) {
                            break Label_0081;
                        }
                        final Collection<? super T> collection = p.poll();
                        final boolean b = collection == null;
                        if (o && b) {
                            g.f();
                            return;
                        }
                        if (b) {
                            break;
                        }
                        g.m((Object)collection);
                        ++t;
                    }
                    if (n == 0) {
                        if (this.Q) {
                            p.clear();
                            return;
                        }
                        if (this.O) {
                            if (this.N.get() != null) {
                                break Label_0081;
                            }
                            if (p.isEmpty()) {
                                g.f();
                                return;
                            }
                        }
                    }
                    this.T = t;
                    continue;
                }
                p.clear();
                g.b(this.N.c());
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        void e(final Open open) {
            try {
                final Collection<? super T> collection = io.reactivex.internal.functions.b.g(this.H.call(), "The bufferSupplier returned a null Collection");
                final o7.b b = io.reactivex.internal.functions.b.g((o7.b)this.J.apply((Object)open), "The bufferClose returned a null Publisher");
                final long r = this.R;
                this.R = 1L + r;
                synchronized (this) {
                    final Map<Long, C> s = this.S;
                    if (s == null) {
                        return;
                    }
                    s.put(r, (C)collection);
                    // monitorexit(this)
                    final b b2 = new b<Object, Object>((n.a<Object, Collection, ?, ?>)this, r);
                    this.K.b(b2);
                    b.e((c)b2);
                }
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                j.b(this.M);
                this.b(t);
            }
        }
        
        public void f() {
            this.K.dispose();
            synchronized (this) {
                final Map<Long, C> s = this.S;
                if (s == null) {
                    return;
                }
                final Iterator<C> iterator = s.values().iterator();
                while (iterator.hasNext()) {
                    this.P.offer(iterator.next());
                }
                this.S = null;
                // monitorexit(this)
                this.O = true;
                this.d();
            }
        }
        
        void g(final n.a.a<Open> a) {
            this.K.c(a);
            if (this.K.g() == 0) {
                j.b(this.M);
                this.O = true;
                this.d();
            }
        }
        
        public void m(final T t) {
            synchronized (this) {
                final Map<Long, C> s = this.S;
                if (s == null) {
                    return;
                }
                final Iterator<C> iterator = s.values().iterator();
                while (iterator.hasNext()) {
                    iterator.next().add((Object)t);
                }
            }
        }
        
        public void v(final long n) {
            io.reactivex.internal.util.d.a(this.L, n);
            this.d();
        }
        
        @Override
        public void z(final d d) {
            if (j.k(this.M, d)) {
                final n.a.a<Object> a = new n.a.a<Object>((n.a<?, ?, Object, ?>)this);
                this.K.b(a);
                this.I.e((c)a);
                d.v(Long.MAX_VALUE);
            }
        }
        
        static final class a<Open> extends AtomicReference<d> implements q<Open>, c
        {
            private static final long H = -8498650778633225126L;
            final n.a<?, ?, Open, ?> G;
            
            a(final n.a<?, ?, Open, ?> g) {
                this.G = g;
            }
            
            public void b(final Throwable t) {
                this.lazySet((d)j.G);
                this.G.a(this, t);
            }
            
            @Override
            public void dispose() {
                j.b(this);
            }
            
            public void f() {
                this.lazySet((d)j.G);
                this.G.g(this);
            }
            
            @Override
            public boolean i() {
                return this.get() == j.G;
            }
            
            public void m(final Open open) {
                this.G.e(open);
            }
            
            @Override
            public void z(final d d) {
                j.l(this, d, Long.MAX_VALUE);
            }
        }
    }
    
    static final class b<T, C extends Collection<? super T>> extends AtomicReference<d> implements q<Object>, c
    {
        private static final long I = -8498650778633225126L;
        final n.a<T, C, ?, ?> G;
        final long H;
        
        b(final n.a<T, C, ?, ?> g, final long h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            final j value = this.get();
            final j g = j.G;
            if (value != g) {
                this.lazySet((d)g);
                this.G.a(this, t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            j.b(this);
        }
        
        public void f() {
            final j value = this.get();
            final j g = j.G;
            if (value != g) {
                this.lazySet((d)g);
                this.G.c(this, this.H);
            }
        }
        
        @Override
        public boolean i() {
            return this.get() == j.G;
        }
        
        public void m(final Object o) {
            final d d = this.get();
            final j g = j.G;
            if (d != g) {
                this.lazySet((d)g);
                d.cancel();
                this.G.c(this, this.H);
            }
        }
        
        @Override
        public void z(final d d) {
            j.l(this, d, Long.MAX_VALUE);
        }
    }
}
