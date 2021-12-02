// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import java.util.Iterator;
import java.io.Serializable;
import io.reactivex.internal.util.k;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.subjects.j;
import java.util.Map;
import io.reactivex.disposables.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;
import io.reactivex.b0;
import x5.c;
import x5.o;
import io.reactivex.g0;

public final class k1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.a<TLeft, R>
{
    final g0<? extends TRight> H;
    final o<? super TLeft, ? extends g0<TLeftEnd>> I;
    final o<? super TRight, ? extends g0<TRightEnd>> J;
    final x5.c<? super TLeft, ? super b0<TRight>, ? extends R> K;
    
    public k1(final g0<TLeft> g0, final g0<? extends TRight> h, final o<? super TLeft, ? extends g0<TLeftEnd>> i, final o<? super TRight, ? extends g0<TRightEnd>> j, final x5.c<? super TLeft, ? super b0<TRight>, ? extends R> k) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        final a a = new a(i0, this.I, this.J, this.K);
        i0.l(a);
        final d d = new d(a, true);
        a.I.b(d);
        final d d2 = new d(a, false);
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
        final Map<Integer, j<TRight>> J;
        final Map<Integer, TRight> K;
        final AtomicReference<Throwable> L;
        final o<? super TLeft, ? extends g0<TLeftEnd>> M;
        final o<? super TRight, ? extends g0<TRightEnd>> N;
        final c<? super TLeft, ? super b0<TRight>, ? extends R> O;
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
        
        a(final i0<? super R> g, final o<? super TLeft, ? extends g0<TLeftEnd>> m, final o<? super TRight, ? extends g0<TRightEnd>> n, final c<? super TLeft, ? super b0<TRight>, ? extends R> o) {
            this.G = g;
            this.I = new io.reactivex.disposables.b();
            this.H = new io.reactivex.internal.queue.c<Object>(b0.X());
            this.J = new LinkedHashMap<Integer, j<TRight>>();
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
            if (this.S) {
                return;
            }
            this.S = true;
            this.f();
            if (this.getAndIncrement() == 0) {
                this.H.clear();
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
                    final Iterator<j<TRight>> iterator = this.J.values().iterator();
                    while (iterator.hasNext()) {
                        iterator.next().f();
                    }
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
                        final j<TRight> q8 = j.q8();
                        final int i = this.Q++;
                        this.J.put(i, q8);
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
                            try {
                                g.m((Object)io.reactivex.internal.functions.b.g((Object)this.O.b((Object)poll, q8), "The resultSelector returned a null value"));
                                final Iterator<TRight> iterator2 = this.K.values().iterator();
                                while (iterator2.hasNext()) {
                                    q8.m(iterator2.next());
                                }
                            }
                            finally {
                                final Throwable t;
                                this.j(t, g, h);
                                return;
                            }
                        }
                        finally {
                            final Throwable t2;
                            this.j(t2, g, h);
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
                            final Iterator<j<TRight>> iterator3 = this.J.values().iterator();
                            while (iterator3.hasNext()) {
                                iterator3.next().m((TRight)poll);
                            }
                            continue;
                        }
                        finally {
                            final Throwable t3;
                            this.j(t3, g, h);
                            return;
                        }
                    }
                    if (n == a.W) {
                        final k1.c c3 = (k1.c)poll;
                        final j<TRight> k = this.J.remove(c3.I);
                        this.I.a(c3);
                        if (k == null) {
                            continue;
                        }
                        k.f();
                    }
                    else {
                        if (n != a.X) {
                            continue;
                        }
                        final k1.c c4 = (k1.c)poll;
                        this.K.remove(c4.I);
                        this.I.a(c4);
                    }
                }
            }
            h.clear();
        }
        
        void h(final i0<?> i0) {
            final Throwable c = k.c(this.L);
            final Iterator<j<TRight>> iterator = this.J.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().b(c);
            }
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
    
    interface b
    {
        void a(final Throwable p0);
        
        void b(final Throwable p0);
        
        void c(final boolean p0, final Object p1);
        
        void d(final boolean p0, final c p1);
        
        void e(final d p0);
    }
    
    static final class c extends AtomicReference<io.reactivex.disposables.c> implements i0<Object>, io.reactivex.disposables.c
    {
        private static final long J = 1883890389173668373L;
        final b G;
        final boolean H;
        final int I;
        
        c(final b g, final boolean h, final int i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }
        
        @Override
        public void f() {
            this.G.d(this.H, this);
        }
        
        @Override
        public boolean i() {
            return io.reactivex.internal.disposables.d.d(this.get());
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            io.reactivex.internal.disposables.d.j(this, c);
        }
        
        @Override
        public void m(final Object o) {
            if (io.reactivex.internal.disposables.d.b(this)) {
                this.G.d(this.H, this);
            }
        }
    }
    
    static final class d extends AtomicReference<io.reactivex.disposables.c> implements i0<Object>, io.reactivex.disposables.c
    {
        private static final long I = 1883890389173668373L;
        final b G;
        final boolean H;
        
        d(final b g, final boolean h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.a(t);
        }
        
        @Override
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }
        
        @Override
        public void f() {
            this.G.e(this);
        }
        
        @Override
        public boolean i() {
            return io.reactivex.internal.disposables.d.d(this.get());
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            io.reactivex.internal.disposables.d.j(this, c);
        }
        
        @Override
        public void m(final Object o) {
            this.G.c(this.H, o);
        }
    }
}
