// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import o7.b;
import x5.o;

public final class z3<T, R> extends io.reactivex.internal.operators.flowable.a<T, R>
{
    final o<? super T, ? extends o7.b<? extends R>> I;
    final int J;
    final boolean K;
    
    public z3(final l<T> l, final o<? super T, ? extends o7.b<? extends R>> i, final int j, final boolean k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        if (j3.b((o7.b<Object>)super.H, (o7.c<? super Object>)c, (o<? super Object, ? extends o7.b<?>>)this.I)) {
            return;
        }
        super.H.m6(new b<Object, Object>((o7.c<? super Object>)c, (o<? super Object, ? extends o7.b<?>>)this.I, this.J, this.K));
    }
    
    static final class a<T, R> extends AtomicReference<d> implements q<R>
    {
        private static final long M = 3837284832786408377L;
        final b<T, R> G;
        final long H;
        final int I;
        volatile y5.o<R> J;
        volatile boolean K;
        int L;
        
        a(final b<T, R> g, final long h, final int i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public void a() {
            j.b(this);
        }
        
        public void b(final Throwable t) {
            final b<T, R> g = this.G;
            if (this.H == g.Q && g.L.a(t)) {
                if (!g.J) {
                    g.N.cancel();
                }
                this.K = true;
                g.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void f() {
            final b<T, R> g = this.G;
            if (this.H == g.Q) {
                this.K = true;
                g.c();
            }
        }
        
        public void m(final R r) {
            final b<T, R> g = this.G;
            if (this.H == g.Q) {
                if (this.L == 0 && !this.J.offer(r)) {
                    this.b(new io.reactivex.exceptions.c("Queue full?!"));
                    return;
                }
                g.c();
            }
        }
        
        @Override
        public void z(final d d) {
            if (j.k(this, d)) {
                if (d instanceof y5.l) {
                    final y5.l l = (y5.l)d;
                    final int e = l.E(7);
                    if (e == 1) {
                        this.L = e;
                        this.J = (y5.o<R>)l;
                        this.K = true;
                        this.G.c();
                        return;
                    }
                    if (e == 2) {
                        this.L = e;
                        this.J = (y5.o<R>)l;
                        d.v((long)this.I);
                        return;
                    }
                }
                this.J = new io.reactivex.internal.queue.b<R>(this.I);
                d.v((long)this.I);
            }
        }
    }
    
    static final class b<T, R> extends AtomicInteger implements q<T>, d
    {
        private static final long R = -3491074160481096299L;
        static final a<Object, Object> S;
        final c<? super R> G;
        final o<? super T, ? extends o7.b<? extends R>> H;
        final int I;
        final boolean J;
        volatile boolean K;
        final io.reactivex.internal.util.c L;
        volatile boolean M;
        d N;
        final AtomicReference<a<T, R>> O;
        final AtomicLong P;
        volatile long Q;
        
        static {
            (S = new a(null, -1L, 1)).a();
        }
        
        b(final c<? super R> g, final o<? super T, ? extends o7.b<? extends R>> h, final int i, final boolean j) {
            this.O = new AtomicReference<a<T, R>>();
            this.P = new AtomicLong();
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.L = new io.reactivex.internal.util.c();
        }
        
        void a() {
            final a a = this.O.get();
            final a<Object, Object> s = b.S;
            if (a != s) {
                final a a2 = this.O.getAndSet((a<T, R>)s);
                if (a2 != s && a2 != null) {
                    a2.a();
                }
            }
        }
        
        public void b(final Throwable t) {
            if (!this.K && this.L.a(t)) {
                if (!this.J) {
                    this.a();
                }
                this.K = true;
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super R> g = this.G;
            int addAndGet = 1;
            while (!this.M) {
                if (this.K) {
                    if (this.J) {
                        if (this.O.get() == null) {
                            if (this.L.get() != null) {
                                g.b(this.L.c());
                            }
                            else {
                                g.f();
                            }
                            return;
                        }
                    }
                    else {
                        if (this.L.get() != null) {
                            this.a();
                            g.b(this.L.c());
                            return;
                        }
                        if (this.O.get() == null) {
                            g.f();
                            return;
                        }
                    }
                }
                final a a = this.O.get();
                Object j;
                if (a != null) {
                    j = a.J;
                }
                else {
                    j = null;
                }
                if (j != null) {
                    Label_0252: {
                        if (a.K) {
                            if (!this.J) {
                                if (this.L.get() != null) {
                                    this.a();
                                    g.b(this.L.c());
                                    return;
                                }
                                if (!((y5.o)j).isEmpty()) {
                                    break Label_0252;
                                }
                            }
                            else if (!((y5.o)j).isEmpty()) {
                                break Label_0252;
                            }
                            this.O.compareAndSet(a, null);
                            continue;
                        }
                    }
                    final long value = this.P.get();
                    long n = 0L;
                    int n2 = 0;
                    Label_0457: {
                        while (true) {
                            Label_0415: {
                                while (true) {
                                    n2 = 0;
                                    if (n == value) {
                                        break Label_0457;
                                    }
                                    if (this.M) {
                                        return;
                                    }
                                    final boolean k = a.K;
                                    Object o = null;
                                    boolean b = false;
                                    try {
                                        ((y5.o<Object>)j).poll();
                                    }
                                    finally {
                                        final Throwable t;
                                        io.reactivex.exceptions.b.b(t);
                                        a.a();
                                        this.L.a(t);
                                        o = null;
                                        b = true;
                                    }
                                    final boolean b2 = o == null;
                                    if (a != this.O.get()) {
                                        break;
                                    }
                                    if (b) {
                                        if (!this.J) {
                                            if (this.L.get() != null) {
                                                g.b(this.L.c());
                                                return;
                                            }
                                            if (b2) {
                                                break Label_0415;
                                            }
                                        }
                                        else if (b2) {
                                            break Label_0415;
                                        }
                                    }
                                    if (b2) {
                                        n2 = n2;
                                        break Label_0457;
                                    }
                                    g.m(o);
                                    ++n;
                                }
                                n2 = 1;
                                break Label_0457;
                            }
                            this.O.compareAndSet(a, null);
                            continue;
                        }
                    }
                    if (n != 0L && !this.M) {
                        if (value != Long.MAX_VALUE) {
                            this.P.addAndGet(-n);
                        }
                        a.get().v(n);
                    }
                    if (n2 != 0) {
                        continue;
                    }
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
            this.O.lazySet(null);
        }
        
        public void cancel() {
            if (!this.M) {
                this.M = true;
                this.N.cancel();
                this.a();
            }
        }
        
        public void f() {
            if (this.K) {
                return;
            }
            this.K = true;
            this.c();
        }
        
        public void m(final T t) {
            if (this.K) {
                return;
            }
            final long q = this.Q + 1L;
            this.Q = q;
            final a a = this.O.get();
            if (a != null) {
                a.a();
            }
            try {
                final o7.b b = io.reactivex.internal.functions.b.g((o7.b)this.H.apply((Object)t), "The publisher returned is null");
                final a newValue = new a((b<Object, Object>)this, q, this.I);
                a expectedValue;
                do {
                    expectedValue = this.O.get();
                    if (expectedValue == z3.b.S) {
                        return;
                    }
                } while (!this.O.compareAndSet(expectedValue, (a<T, R>)newValue));
                b.e((c)newValue);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.N.cancel();
                this.b(t2);
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.P, n);
                if (this.Q == 0L) {
                    this.N.v(Long.MAX_VALUE);
                }
                else {
                    this.c();
                }
            }
        }
        
        @Override
        public void z(final d n) {
            if (j.o(this.N, n)) {
                this.N = n;
                this.G.z((d)this);
            }
        }
    }
}
