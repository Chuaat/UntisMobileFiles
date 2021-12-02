// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.Iterator;
import java.io.Serializable;
import io.reactivex.internal.util.k;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.processors.h;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.d;
import io.reactivex.l;
import x5.c;
import x5.o;
import o7.b;

public final class o1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.flowable.a<TLeft, R>
{
    final o7.b<? extends TRight> I;
    final o<? super TLeft, ? extends o7.b<TLeftEnd>> J;
    final o<? super TRight, ? extends o7.b<TRightEnd>> K;
    final x5.c<? super TLeft, ? super l<TRight>, ? extends R> L;
    
    public o1(final l<TLeft> l, final o7.b<? extends TRight> i, final o<? super TLeft, ? extends o7.b<TLeftEnd>> j, final o<? super TRight, ? extends o7.b<TRightEnd>> k, final x5.c<? super TLeft, ? super l<TRight>, ? extends R> m) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
    }
    
    @Override
    protected void n6(final o7.c<? super R> c) {
        final a a = new a<Object, Object, Object, Object, Object>(c, this.J, this.K, (x5.c<?, ? super l<?>, ?>)this.L);
        c.z((o7.d)a);
        final d d = new d(a, true);
        a.J.b(d);
        final d d2 = new d(a, false);
        a.J.b(d2);
        super.H.m6(d);
        this.I.e((o7.c)d2);
    }
    
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements o7.d, b
    {
        private static final long U = -6071216598687999801L;
        static final Integer V;
        static final Integer W;
        static final Integer X;
        static final Integer Y;
        final o7.c<? super R> G;
        final AtomicLong H;
        final io.reactivex.internal.queue.c<Object> I;
        final io.reactivex.disposables.b J;
        final Map<Integer, io.reactivex.processors.h<TRight>> K;
        final Map<Integer, TRight> L;
        final AtomicReference<Throwable> M;
        final o<? super TLeft, ? extends o7.b<TLeftEnd>> N;
        final o<? super TRight, ? extends o7.b<TRightEnd>> O;
        final x5.c<? super TLeft, ? super l<TRight>, ? extends R> P;
        final AtomicInteger Q;
        int R;
        int S;
        volatile boolean T;
        
        static {
            V = 1;
            W = 2;
            X = 3;
            Y = 4;
        }
        
        a(final o7.c<? super R> g, final o<? super TLeft, ? extends o7.b<TLeftEnd>> n, final o<? super TRight, ? extends o7.b<TRightEnd>> o, final x5.c<? super TLeft, ? super l<TRight>, ? extends R> p4) {
            this.G = g;
            this.H = new AtomicLong();
            this.J = new io.reactivex.disposables.b();
            this.I = new io.reactivex.internal.queue.c<Object>(l.b0());
            this.K = new LinkedHashMap<Integer, io.reactivex.processors.h<TRight>>();
            this.L = new LinkedHashMap<Integer, TRight>();
            this.M = new AtomicReference<Throwable>();
            this.N = n;
            this.O = o;
            this.P = p4;
            this.Q = new AtomicInteger(2);
        }
        
        public void a(final Throwable t) {
            if (k.a(this.M, t)) {
                this.Q.decrementAndGet();
                this.g();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void b(final Throwable t) {
            if (k.a(this.M, t)) {
                this.g();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void c(final boolean b, final Object o) {
            synchronized (this) {
                final io.reactivex.internal.queue.c<Object> i = this.I;
                Integer n;
                if (b) {
                    n = a.V;
                }
                else {
                    n = a.W;
                }
                i.p(n, o);
                // monitorexit(this)
                this.g();
            }
        }
        
        public void cancel() {
            if (this.T) {
                return;
            }
            this.T = true;
            this.f();
            if (this.getAndIncrement() == 0) {
                this.I.clear();
            }
        }
        
        public void d(final boolean b, final c c) {
            synchronized (this) {
                final io.reactivex.internal.queue.c<Object> i = this.I;
                Integer n;
                if (b) {
                    n = a.X;
                }
                else {
                    n = a.Y;
                }
                i.p(n, c);
                // monitorexit(this)
                this.g();
            }
        }
        
        public void e(final d d) {
            this.J.c(d);
            this.Q.decrementAndGet();
            this.g();
        }
        
        void f() {
            this.J.dispose();
        }
        
        void g() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final io.reactivex.internal.queue.c<Object> i = this.I;
            final o7.c<? super R> g = this.G;
            int addAndGet = 1;
            while (!this.T) {
                if (this.M.get() != null) {
                    i.clear();
                    this.f();
                    this.h(g);
                    return;
                }
                final boolean b = this.Q.get() == 0;
                final Integer n = i.poll();
                final boolean b2 = n == null;
                if (b && b2) {
                    final Iterator<io.reactivex.processors.h<TRight>> iterator = this.K.values().iterator();
                    while (iterator.hasNext()) {
                        iterator.next().f();
                    }
                    this.K.clear();
                    this.L.clear();
                    this.J.dispose();
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
                    final Object poll = i.poll();
                    if (n == a.V) {
                        final io.reactivex.processors.h<TRight> v8 = io.reactivex.processors.h.V8();
                        final int j = this.R++;
                        this.K.put(j, v8);
                        try {
                            final o7.b b3 = io.reactivex.internal.functions.b.g((o7.b)this.N.apply((Object)poll), "The leftEnd returned a null Publisher");
                            final c c = new c(this, true, j);
                            this.J.b(c);
                            b3.e((o7.c)c);
                            if (this.M.get() != null) {
                                i.clear();
                                this.f();
                                this.h(g);
                                return;
                            }
                            try {
                                final Object g2 = io.reactivex.internal.functions.b.g((Object)this.P.b((Object)poll, v8), "The resultSelector returned a null value");
                                if (this.H.get() != 0L) {
                                    g.m(g2);
                                    io.reactivex.internal.util.d.e(this.H, 1L);
                                    final Iterator<TRight> iterator2 = this.L.values().iterator();
                                    while (iterator2.hasNext()) {
                                        v8.m(iterator2.next());
                                    }
                                    continue;
                                }
                                this.i(new io.reactivex.exceptions.c("Could not emit value due to lack of requests"), g, i);
                                return;
                            }
                            finally {
                                final Throwable t;
                                this.i(t, g, i);
                                return;
                            }
                        }
                        finally {
                            final Throwable t2;
                            this.i(t2, g, i);
                            return;
                        }
                    }
                    if (n == a.W) {
                        final int k = this.S++;
                        this.L.put(k, (TRight)poll);
                        try {
                            final o7.b b4 = io.reactivex.internal.functions.b.g((o7.b)this.O.apply((Object)poll), "The rightEnd returned a null Publisher");
                            final c c2 = new c(this, false, k);
                            this.J.b(c2);
                            b4.e((o7.c)c2);
                            if (this.M.get() != null) {
                                i.clear();
                                this.f();
                                this.h(g);
                                return;
                            }
                            final Iterator<io.reactivex.processors.h<TRight>> iterator3 = this.K.values().iterator();
                            while (iterator3.hasNext()) {
                                iterator3.next().m((TRight)poll);
                            }
                            continue;
                        }
                        finally {
                            final Throwable t3;
                            this.i(t3, g, i);
                            return;
                        }
                    }
                    if (n == a.X) {
                        final c c3 = (c)poll;
                        final io.reactivex.processors.h<TRight> h = this.K.remove(c3.I);
                        this.J.a(c3);
                        if (h == null) {
                            continue;
                        }
                        h.f();
                    }
                    else {
                        if (n != a.Y) {
                            continue;
                        }
                        final c c4 = (c)poll;
                        this.L.remove(c4.I);
                        this.J.a(c4);
                    }
                }
            }
            i.clear();
        }
        
        void h(final o7.c<?> c) {
            final Throwable c2 = k.c(this.M);
            final Iterator<io.reactivex.processors.h<TRight>> iterator = this.K.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().b(c2);
            }
            this.K.clear();
            this.L.clear();
            c.b(c2);
        }
        
        void i(final Throwable t, final o7.c<?> c, final y5.o<?> o) {
            io.reactivex.exceptions.b.b(t);
            k.a(this.M, t);
            o.clear();
            this.f();
            this.h(c);
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.H, n);
            }
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
    
    static final class c extends AtomicReference<o7.d> implements q<Object>, io.reactivex.disposables.c
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
        
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            j.b(this);
        }
        
        public void f() {
            this.G.d(this.H, this);
        }
        
        @Override
        public boolean i() {
            return this.get() == j.G;
        }
        
        public void m(final Object o) {
            if (j.b(this)) {
                this.G.d(this.H, this);
            }
        }
        
        @Override
        public void z(final o7.d d) {
            j.l(this, d, Long.MAX_VALUE);
        }
    }
    
    static final class d extends AtomicReference<o7.d> implements q<Object>, io.reactivex.disposables.c
    {
        private static final long I = 1883890389173668373L;
        final b G;
        final boolean H;
        
        d(final b g, final boolean h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            this.G.a(t);
        }
        
        @Override
        public void dispose() {
            j.b(this);
        }
        
        public void f() {
            this.G.e(this);
        }
        
        @Override
        public boolean i() {
            return this.get() == j.G;
        }
        
        public void m(final Object o) {
            this.G.c(this.H, o);
        }
        
        @Override
        public void z(final o7.d d) {
            j.l(this, d, Long.MAX_VALUE);
        }
    }
}
