// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import io.reactivex.internal.disposables.d;
import java.util.LinkedHashMap;
import io.reactivex.b0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import x5.o;
import io.reactivex.g0;
import java.util.concurrent.Callable;
import java.util.Collection;

public final class n<T, U extends Collection<? super T>, Open, Close> extends io.reactivex.internal.operators.observable.a<T, U>
{
    final Callable<U> H;
    final g0<? extends Open> I;
    final o<? super Open, ? extends g0<? extends Close>> J;
    
    public n(final g0<T> g0, final g0<? extends Open> i, final o<? super Open, ? extends g0<? extends Close>> j, final Callable<U> h) {
        super(g0);
        this.I = i;
        this.J = j;
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super U> i0) {
        final a<Object, Object, Object, Object> a = new a<Object, Object, Object, Object>((i0<? super Object>)i0, this.I, (o<? super Object, ? extends g0<?>>)this.J, (Callable<Object>)this.H);
        i0.l(a);
        super.G.c(a);
    }
    
    static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements i0<T>, c
    {
        private static final long S = -8466418554264089604L;
        final i0<? super C> G;
        final Callable<C> H;
        final g0<? extends Open> I;
        final o<? super Open, ? extends g0<? extends Close>> J;
        final io.reactivex.disposables.b K;
        final AtomicReference<c> L;
        final io.reactivex.internal.util.c M;
        volatile boolean N;
        final io.reactivex.internal.queue.c<C> O;
        volatile boolean P;
        long Q;
        Map<Long, C> R;
        
        a(final i0<? super C> g, final g0<? extends Open> i, final o<? super Open, ? extends g0<? extends Close>> j, final Callable<C> h) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.O = new io.reactivex.internal.queue.c<C>(b0.X());
            this.K = new io.reactivex.disposables.b();
            this.L = new AtomicReference<c>();
            this.R = new LinkedHashMap<Long, C>();
            this.M = new io.reactivex.internal.util.c();
        }
        
        void a(final c c, final Throwable t) {
            d.b(this.L);
            this.K.c(c);
            this.b(t);
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.M.a(t)) {
                this.K.dispose();
                synchronized (this) {
                    this.R = null;
                    // monitorexit(this)
                    this.N = true;
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
                d.b(this.L);
                b2 = true;
            }
            else {
                b2 = false;
            }
            synchronized (this) {
                final Map<Long, C> r = this.R;
                if (r == null) {
                    return;
                }
                this.O.offer(r.remove(l));
                // monitorexit(this)
                if (b2) {
                    this.N = true;
                }
                this.d();
            }
        }
        
        void d() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final i0<? super C> g = this.G;
            final io.reactivex.internal.queue.c<C> o = this.O;
            int addAndGet = 1;
            while (!this.P) {
                final boolean n = this.N;
                if (n && this.M.get() != null) {
                    o.clear();
                    g.b(this.M.c());
                    return;
                }
                final Collection<? super T> collection = o.poll();
                final boolean b = collection == null;
                if (n && b) {
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
                    g.m(collection);
                }
            }
            o.clear();
        }
        
        @Override
        public void dispose() {
            if (d.b(this.L)) {
                this.P = true;
                this.K.dispose();
                synchronized (this) {
                    this.R = null;
                    // monitorexit(this)
                    if (this.getAndIncrement() != 0) {
                        this.O.clear();
                    }
                }
            }
        }
        
        void e(final Open open) {
            try {
                final Collection<? super T> collection = io.reactivex.internal.functions.b.g(this.H.call(), "The bufferSupplier returned a null Collection");
                final g0 g0 = io.reactivex.internal.functions.b.g((g0)this.J.apply((Object)open), "The bufferClose returned a null ObservableSource");
                final long q = this.Q;
                this.Q = 1L + q;
                synchronized (this) {
                    final Map<Long, C> r = this.R;
                    if (r == null) {
                        return;
                    }
                    r.put(q, (C)collection);
                    // monitorexit(this)
                    final b b = new b((n.a<Object, Collection, ?, ?>)this, q);
                    this.K.b(b);
                    g0.c(b);
                }
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                d.b(this.L);
                this.b(t);
            }
        }
        
        @Override
        public void f() {
            this.K.dispose();
            synchronized (this) {
                final Map<Long, C> r = this.R;
                if (r == null) {
                    return;
                }
                final Iterator<C> iterator = r.values().iterator();
                while (iterator.hasNext()) {
                    this.O.offer(iterator.next());
                }
                this.R = null;
                // monitorexit(this)
                this.N = true;
                this.d();
            }
        }
        
        void g(final n.a.a<Open> a) {
            this.K.c(a);
            if (this.K.g() == 0) {
                d.b(this.L);
                this.N = true;
                this.d();
            }
        }
        
        @Override
        public boolean i() {
            return d.d(this.L.get());
        }
        
        @Override
        public void l(final c c) {
            if (d.j(this.L, c)) {
                final n.a.a<Object> a = new n.a.a<Object>((n.a<?, ?, Object, ?>)this);
                this.K.b(a);
                this.I.c(a);
            }
        }
        
        @Override
        public void m(final T t) {
            synchronized (this) {
                final Map<Long, C> r = this.R;
                if (r == null) {
                    return;
                }
                final Iterator<C> iterator = r.values().iterator();
                while (iterator.hasNext()) {
                    iterator.next().add((Object)t);
                }
            }
        }
        
        static final class a<Open> extends AtomicReference<c> implements i0<Open>, c
        {
            private static final long H = -8498650778633225126L;
            final n.a<?, ?, Open, ?> G;
            
            a(final n.a<?, ?, Open, ?> g) {
                this.G = g;
            }
            
            @Override
            public void b(final Throwable t) {
                this.lazySet(d.G);
                this.G.a(this, t);
            }
            
            @Override
            public void dispose() {
                d.b(this);
            }
            
            @Override
            public void f() {
                this.lazySet(d.G);
                this.G.g(this);
            }
            
            @Override
            public boolean i() {
                return this.get() == d.G;
            }
            
            @Override
            public void l(final c c) {
                d.j(this, c);
            }
            
            @Override
            public void m(final Open open) {
                this.G.e(open);
            }
        }
    }
    
    static final class b<T, C extends Collection<? super T>> extends AtomicReference<c> implements i0<Object>, c
    {
        private static final long I = -8498650778633225126L;
        final n.a<T, C, ?, ?> G;
        final long H;
        
        b(final n.a<T, C, ?, ?> g, final long h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            final d value = this.get();
            final d g = d.G;
            if (value != g) {
                this.lazySet(g);
                this.G.a(this, t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            final d value = this.get();
            final d g = d.G;
            if (value != g) {
                this.lazySet(g);
                this.G.c(this, this.H);
            }
        }
        
        @Override
        public boolean i() {
            return this.get() == d.G;
        }
        
        @Override
        public void l(final c c) {
            d.j(this, c);
        }
        
        @Override
        public void m(final Object o) {
            final c c = this.get();
            final d g = d.G;
            if (c != g) {
                this.lazySet(g);
                c.dispose();
                this.G.c(this, this.H);
            }
        }
    }
}
