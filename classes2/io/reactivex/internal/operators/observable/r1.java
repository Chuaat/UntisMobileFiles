// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.io.Serializable;
import io.reactivex.internal.util.k;
import java.util.LinkedHashMap;
import io.reactivex.b0;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;
import io.reactivex.disposables.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;
import x5.c;
import x5.o;
import io.reactivex.g0;

public final class r1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.a<TLeft, R>
{
    final g0<? extends TRight> H;
    final o<? super TLeft, ? extends g0<TLeftEnd>> I;
    final o<? super TRight, ? extends g0<TRightEnd>> J;
    final c<? super TLeft, ? super TRight, ? extends R> K;
    
    public r1(final g0<TLeft> g0, final g0<? extends TRight> h, final o<? super TLeft, ? extends g0<TLeftEnd>> i, final o<? super TRight, ? extends g0<TRightEnd>> j, final c<? super TLeft, ? super TRight, ? extends R> k) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        final a a = new a((i0<? super Object>)i0, (o<? super Object, ? extends g0<Object>>)this.I, (o<? super Object, ? extends g0<Object>>)this.J, (c<? super Object, ? super Object, ?>)this.K);
        i0.l(a);
        final k1.d d = new k1.d(a, true);
        a.I.b(d);
        final k1.d d2 = new k1.d(a, false);
        a.I.b(d2);
        super.G.c(d);
        this.H.c(d2);
    }
    
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements io.reactivex.disposables.c, b
    {
        private static final long T = -6071216598687999801L;
        static final Integer U;
        static final Integer V;
        static final Integer W;
        static final Integer X;
        final i0<? super R> G;
        final io.reactivex.internal.queue.c<Object> H;
        final io.reactivex.disposables.b I;
        final Map<Integer, TLeft> J;
        final Map<Integer, TRight> K;
        final AtomicReference<Throwable> L;
        final o<? super TLeft, ? extends g0<TLeftEnd>> M;
        final o<? super TRight, ? extends g0<TRightEnd>> N;
        final c<? super TLeft, ? super TRight, ? extends R> O;
        final AtomicInteger P;
        int Q;
        int R;
        volatile boolean S;
        
        static {
            U = 1;
            V = 2;
            W = 3;
            X = 4;
        }
        
        a(final i0<? super R> g, final o<? super TLeft, ? extends g0<TLeftEnd>> m, final o<? super TRight, ? extends g0<TRightEnd>> n, final c<? super TLeft, ? super TRight, ? extends R> o) {
            this.G = g;
            this.I = new io.reactivex.disposables.b();
            this.H = new io.reactivex.internal.queue.c<Object>(b0.X());
            this.J = new LinkedHashMap<Integer, TLeft>();
            this.K = new LinkedHashMap<Integer, TRight>();
            this.L = new AtomicReference<Throwable>();
            this.M = m;
            this.N = n;
            this.O = o;
            this.P = new AtomicInteger(2);
        }
        
        @Override
        public void a(final Throwable t) {
            if (k.a(this.L, t)) {
                this.P.decrementAndGet();
                this.g();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (k.a(this.L, t)) {
                this.g();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void c(final boolean b, final Object o) {
            synchronized (this) {
                final io.reactivex.internal.queue.c<Object> h = this.H;
                Integer n;
                if (b) {
                    n = a.U;
                }
                else {
                    n = a.V;
                }
                h.p(n, o);
                // monitorexit(this)
                this.g();
            }
        }
        
        @Override
        public void d(final boolean b, final k1.c c) {
            synchronized (this) {
                final io.reactivex.internal.queue.c<Object> h = this.H;
                Integer n;
                if (b) {
                    n = a.W;
                }
                else {
                    n = a.X;
                }
                h.p(n, c);
                // monitorexit(this)
                this.g();
            }
        }
        
        @Override
        public void dispose() {
            if (!this.S) {
                this.S = true;
                this.f();
                if (this.getAndIncrement() == 0) {
                    this.H.clear();
                }
            }
        }
        
        @Override
        public void e(final d d) {
            this.I.c(d);
            this.P.decrementAndGet();
            this.g();
        }
        
        void f() {
            this.I.dispose();
        }
        
        void g() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final io.reactivex.internal.queue.c<Object> h = this.H;
            final i0<? super R> g = this.G;
            int addAndGet = 1;
            while (!this.S) {
                if (this.L.get() != null) {
                    h.clear();
                    this.f();
                    this.h(g);
                    return;
                }
                final boolean b = this.P.get() == 0;
                final Integer n = h.poll();
                final boolean b2 = n == null;
                if (b && b2) {
                    this.J.clear();
                    this.K.clear();
                    this.I.dispose();
                    g.f();
                    return;
                }
                if (b2) {
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    final Object poll = h.poll();
                    if (n == a.U) {
                        final int i = this.Q++;
                        this.J.put(i, (TLeft)poll);
                        try {
                            final g0 g2 = io.reactivex.internal.functions.b.g((g0)this.M.apply((Object)poll), "The leftEnd returned a null ObservableSource");
                            final k1.c c = new k1.c(this, true, i);
                            this.I.b(c);
                            g2.c(c);
                            if (this.L.get() != null) {
                                h.clear();
                                this.f();
                                this.h(g);
                                return;
                            }
                            for (final TRight next : this.K.values()) {
                                try {
                                    g.m((Object)io.reactivex.internal.functions.b.g((Object)this.O.b((Object)poll, (Object)next), "The resultSelector returned a null value"));
                                }
                                finally {
                                    this.j((Throwable)poll, g, h);
                                    return;
                                }
                            }
                            continue;
                        }
                        finally {
                            final Throwable t;
                            this.j(t, g, h);
                            return;
                        }
                    }
                    if (n == a.V) {
                        final int j = this.R++;
                        this.K.put(j, (TRight)poll);
                        try {
                            final g0 g3 = io.reactivex.internal.functions.b.g((g0)this.N.apply((Object)poll), "The rightEnd returned a null ObservableSource");
                            final k1.c c2 = new k1.c(this, false, j);
                            this.I.b(c2);
                            g3.c(c2);
                            if (this.L.get() != null) {
                                h.clear();
                                this.f();
                                this.h(g);
                                return;
                            }
                            for (final TLeft next2 : this.J.values()) {
                                try {
                                    g.m((Object)io.reactivex.internal.functions.b.g((Object)this.O.b((Object)next2, (Object)poll), "The resultSelector returned a null value"));
                                }
                                finally {
                                    this.j((Throwable)poll, g, h);
                                    return;
                                }
                            }
                            continue;
                        }
                        finally {
                            final Throwable t2;
                            this.j(t2, g, h);
                            return;
                        }
                    }
                    final Integer w = a.W;
                    final k1.c c3 = (k1.c)poll;
                    Object o;
                    if (n == w) {
                        o = this.J;
                    }
                    else {
                        o = this.K;
                    }
                    ((Map)o).remove(c3.I);
                    this.I.a(c3);
                }
            }
            h.clear();
        }
        
        void h(final i0<?> i0) {
            final Throwable c = k.c(this.L);
            this.J.clear();
            this.K.clear();
            i0.b(c);
        }
        
        @Override
        public boolean i() {
            return this.S;
        }
        
        void j(final Throwable t, final i0<?> i0, final io.reactivex.internal.queue.c<?> c) {
            io.reactivex.exceptions.b.b(t);
            k.a(this.L, t);
            c.clear();
            this.f();
            this.h(i0);
        }
    }
}
