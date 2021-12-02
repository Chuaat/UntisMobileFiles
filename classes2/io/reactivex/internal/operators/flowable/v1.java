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
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.d;
import io.reactivex.l;
import x5.c;
import x5.o;
import o7.b;

public final class v1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.flowable.a<TLeft, R>
{
    final b<? extends TRight> I;
    final o<? super TLeft, ? extends b<TLeftEnd>> J;
    final o<? super TRight, ? extends b<TRightEnd>> K;
    final c<? super TLeft, ? super TRight, ? extends R> L;
    
    public v1(final l<TLeft> l, final b<? extends TRight> i, final o<? super TLeft, ? extends b<TLeftEnd>> j, final o<? super TRight, ? extends b<TRightEnd>> k, final c<? super TLeft, ? super TRight, ? extends R> m) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
    }
    
    @Override
    protected void n6(final o7.c<? super R> c) {
        final a a = new a<Object, Object, Object, Object, Object>(c, this.J, this.K, this.L);
        c.z((d)a);
        final o1.d d = new o1.d(a, true);
        a.J.b(d);
        final o1.d d2 = new o1.d(a, false);
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
        final Map<Integer, TLeft> K;
        final Map<Integer, TRight> L;
        final AtomicReference<Throwable> M;
        final o<? super TLeft, ? extends o7.b<TLeftEnd>> N;
        final o<? super TRight, ? extends o7.b<TRightEnd>> O;
        final x5.c<? super TLeft, ? super TRight, ? extends R> P;
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
        
        a(final o7.c<? super R> g, final o<? super TLeft, ? extends o7.b<TLeftEnd>> n, final o<? super TRight, ? extends o7.b<TRightEnd>> o, final x5.c<? super TLeft, ? super TRight, ? extends R> p4) {
            this.G = g;
            this.H = new AtomicLong();
            this.J = new io.reactivex.disposables.b();
            this.I = new io.reactivex.internal.queue.c<Object>(l.b0());
            this.K = new LinkedHashMap<Integer, TLeft>();
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
        Label_0432_Outer:
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
                    while (true) {
                        Label_0456: {
                            if (n != a.V) {
                                break Label_0456;
                            }
                            final int j = this.R++;
                            this.K.put(j, (TLeft)poll);
                            try {
                                final o7.b b3 = io.reactivex.internal.functions.b.g((o7.b)this.N.apply((Object)poll), "The leftEnd returned a null Publisher");
                                final o1.c c = new o1.c(this, true, j);
                                this.J.b(c);
                                b3.e((o7.c)c);
                                if (this.M.get() != null) {
                                    i.clear();
                                    this.f();
                                    this.h(g);
                                    return;
                                }
                                final long value = this.H.get();
                                final Iterator<TRight> iterator = this.L.values().iterator();
                                long n2 = 0L;
                                while (iterator.hasNext()) {
                                    final TRight next = iterator.next();
                                    try {
                                        final Object g2 = io.reactivex.internal.functions.b.g((Object)this.P.b((Object)poll, (Object)next), "The resultSelector returned a null value");
                                        if (n2 != value) {
                                            g.m(g2);
                                            ++n2;
                                            continue Label_0432_Outer;
                                        }
                                        k.a(this.M, new io.reactivex.exceptions.c("Could not emit value due to lack of requests"));
                                        i.clear();
                                        this.f();
                                        this.h(g);
                                        return;
                                    }
                                    finally {
                                        this.i((Throwable)poll, g, i);
                                        return;
                                    }
                                    break;
                                }
                                if (n2 != 0L) {
                                    io.reactivex.internal.util.d.e(this.H, n2);
                                    continue Label_0432_Outer;
                                }
                                continue Label_0432_Outer;
                            }
                            finally {
                                final Throwable t;
                                this.i(t, g, i);
                                return;
                            }
                        }
                        if (n == a.W) {
                            final int k = this.S++;
                            this.L.put(k, (TRight)poll);
                            try {
                                final o7.b b4 = io.reactivex.internal.functions.b.g((o7.b)this.O.apply((Object)poll), "The rightEnd returned a null Publisher");
                                final o1.c c2 = new o1.c(this, false, k);
                                this.J.b(c2);
                                b4.e((o7.c)c2);
                                if (this.M.get() != null) {
                                    i.clear();
                                    this.f();
                                    this.h(g);
                                    return;
                                }
                                final long value2 = this.H.get();
                                final Iterator<TLeft> iterator2 = this.K.values().iterator();
                                long n2 = 0L;
                                while (iterator2.hasNext()) {
                                    final TLeft next2 = iterator2.next();
                                    try {
                                        final Object g3 = io.reactivex.internal.functions.b.g((Object)this.P.b((Object)next2, (Object)poll), "The resultSelector returned a null value");
                                        if (n2 != value2) {
                                            g.m(g3);
                                            ++n2;
                                            continue Label_0432_Outer;
                                        }
                                        io.reactivex.internal.util.k.a(this.M, new io.reactivex.exceptions.c("Could not emit value due to lack of requests"));
                                        i.clear();
                                        this.f();
                                        this.h(g);
                                        return;
                                    }
                                    finally {
                                        this.i((Throwable)poll, g, i);
                                        return;
                                    }
                                    break;
                                }
                                if (n2 != 0L) {
                                    continue;
                                }
                                continue Label_0432_Outer;
                            }
                            finally {
                                final Throwable t2;
                                this.i(t2, g, i);
                                return;
                            }
                        }
                        break;
                    }
                    c c3;
                    Object o;
                    if (n == a.X) {
                        c3 = (c)poll;
                        o = this.K;
                    }
                    else {
                        if (n != a.Y) {
                            continue Label_0432_Outer;
                        }
                        c3 = (c)poll;
                        o = this.L;
                    }
                    ((Map)o).remove(c3.I);
                    this.J.a(c3);
                }
            }
            i.clear();
        }
        
        void h(final o7.c<?> c) {
            final Throwable c2 = k.c(this.M);
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
}
