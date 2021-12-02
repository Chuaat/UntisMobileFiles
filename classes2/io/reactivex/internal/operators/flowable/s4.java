// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayDeque;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.processors.h;
import java.util.concurrent.atomic.AtomicBoolean;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class s4<T> extends io.reactivex.internal.operators.flowable.a<T, l<T>>
{
    final long I;
    final long J;
    final int K;
    
    public s4(final l<T> l, final long i, final long j, final int k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void n6(final o7.c<? super l<T>> c) {
        final long j = this.J;
        final long i = this.I;
        if (j == i) {
            super.H.m6(new a<Object>((o7.c<? super l<Object>>)c, this.I, this.K));
        }
        else {
            final l<T> h = (l<T>)super.H;
            Runnable runnable;
            if (j > i) {
                runnable = new c<Object>((o7.c<? super l<? super T>>)c, this.I, this.J, this.K);
            }
            else {
                runnable = new b<Object>((o7.c<? super l<? super T>>)c, this.I, this.J, this.K);
            }
            h.m6((q<? super T>)runnable);
        }
    }
    
    static final class a<T> extends AtomicInteger implements q<T>, d, Runnable
    {
        private static final long N = -2365647875069161133L;
        final o7.c<? super l<T>> G;
        final long H;
        final AtomicBoolean I;
        final int J;
        long K;
        d L;
        io.reactivex.processors.h<T> M;
        
        a(final o7.c<? super l<T>> g, final long h, final int j) {
            super(1);
            this.G = g;
            this.H = h;
            this.I = new AtomicBoolean();
            this.J = j;
        }
        
        public void b(final Throwable t) {
            final io.reactivex.processors.h<T> m = this.M;
            if (m != null) {
                this.M = null;
                ((o7.c)m).b(t);
            }
            this.G.b(t);
        }
        
        public void cancel() {
            if (this.I.compareAndSet(false, true)) {
                this.run();
            }
        }
        
        public void f() {
            final io.reactivex.processors.h<T> m = this.M;
            if (m != null) {
                this.M = null;
                ((o7.c)m).f();
            }
            this.G.f();
        }
        
        public void m(final T t) {
            final long k = this.K;
            io.reactivex.processors.h<T> m = this.M;
            if (k == 0L) {
                this.getAndIncrement();
                m = (io.reactivex.processors.h<T>)io.reactivex.processors.h.X8(this.J, this);
                this.M = m;
                this.G.m((Object)m);
            }
            final long i = k + 1L;
            m.m(t);
            if (i == this.H) {
                this.K = 0L;
                this.M = null;
                m.f();
            }
            else {
                this.K = i;
            }
        }
        
        public void run() {
            if (this.decrementAndGet() == 0) {
                this.L.cancel();
            }
        }
        
        public void v(long d) {
            if (j.m(d)) {
                d = io.reactivex.internal.util.d.d(this.H, d);
                this.L.v(d);
            }
        }
        
        @Override
        public void z(final d l) {
            if (j.o(this.L, l)) {
                this.L = l;
                this.G.z((d)this);
            }
        }
    }
    
    static final class b<T> extends AtomicInteger implements q<T>, d, Runnable
    {
        private static final long W = 2428527070996323976L;
        final o7.c<? super l<T>> G;
        final io.reactivex.internal.queue.c<io.reactivex.processors.h<T>> H;
        final long I;
        final long J;
        final ArrayDeque<io.reactivex.processors.h<T>> K;
        final AtomicBoolean L;
        final AtomicBoolean M;
        final AtomicLong N;
        final AtomicInteger O;
        final int P;
        long Q;
        long R;
        d S;
        volatile boolean T;
        Throwable U;
        volatile boolean V;
        
        b(final o7.c<? super l<T>> g, final long i, final long j, final int p4) {
            super(1);
            this.G = g;
            this.I = i;
            this.J = j;
            this.H = new io.reactivex.internal.queue.c<io.reactivex.processors.h<T>>(p4);
            this.K = new ArrayDeque<io.reactivex.processors.h<T>>();
            this.L = new AtomicBoolean();
            this.M = new AtomicBoolean();
            this.N = new AtomicLong();
            this.O = new AtomicInteger();
            this.P = p4;
        }
        
        boolean a(final boolean b, final boolean b2, final o7.c<?> c, final io.reactivex.internal.queue.c<?> c2) {
            if (this.V) {
                c2.clear();
                return true;
            }
            if (b) {
                final Throwable u = this.U;
                if (u != null) {
                    c2.clear();
                    c.b(u);
                    return true;
                }
                if (b2) {
                    c.f();
                    return true;
                }
            }
            return false;
        }
        
        public void b(final Throwable u) {
            if (this.T) {
                io.reactivex.plugins.a.Y(u);
                return;
            }
            final Iterator<io.reactivex.processors.h<T>> iterator = this.K.iterator();
            while (iterator.hasNext()) {
                ((o7.c)iterator.next()).b(u);
            }
            this.K.clear();
            this.U = u;
            this.T = true;
            this.c();
        }
        
        void c() {
            if (this.O.getAndIncrement() != 0) {
                return;
            }
            final o7.c<? super l<T>> g = this.G;
            final io.reactivex.internal.queue.c<io.reactivex.processors.h<T>> h = this.H;
            int addAndGet = 1;
            do {
                final long value = this.N.get();
                long n = 0L;
                long n2;
                while (true) {
                    n2 = lcmp(n, value);
                    if (n2 == 0) {
                        break;
                    }
                    final boolean t = this.T;
                    final io.reactivex.processors.h<T> h2 = (io.reactivex.processors.h<T>)h.poll();
                    final boolean b = h2 == null;
                    if (this.a(t, b, g, h)) {
                        return;
                    }
                    if (b) {
                        break;
                    }
                    g.m((Object)h2);
                    ++n;
                }
                if (n2 == 0 && this.a(this.T, h.isEmpty(), g, h)) {
                    return;
                }
                if (n == 0L || value == Long.MAX_VALUE) {
                    continue;
                }
                this.N.addAndGet(-n);
            } while ((addAndGet = this.O.addAndGet(-addAndGet)) != 0);
        }
        
        public void cancel() {
            this.V = true;
            if (this.L.compareAndSet(false, true)) {
                this.run();
            }
        }
        
        public void f() {
            if (this.T) {
                return;
            }
            final Iterator<io.reactivex.processors.h<T>> iterator = this.K.iterator();
            while (iterator.hasNext()) {
                ((o7.c)iterator.next()).f();
            }
            this.K.clear();
            this.T = true;
            this.c();
        }
        
        public void m(final T t) {
            if (this.T) {
                return;
            }
            final long q = this.Q;
            if (q == 0L && !this.V) {
                this.getAndIncrement();
                final io.reactivex.processors.h<T> x8 = io.reactivex.processors.h.X8(this.P, this);
                this.K.offer(x8);
                this.H.offer(x8);
                this.c();
            }
            final long q2 = q + 1L;
            final Iterator<io.reactivex.processors.h<T>> iterator = this.K.iterator();
            while (iterator.hasNext()) {
                ((o7.c)iterator.next()).m((Object)t);
            }
            final long r = this.R + 1L;
            if (r == this.I) {
                this.R = r - this.J;
                final o7.a a = (o7.a)this.K.poll();
                if (a != null) {
                    ((o7.c)a).f();
                }
            }
            else {
                this.R = r;
            }
            if (q2 == this.J) {
                this.Q = 0L;
            }
            else {
                this.Q = q2;
            }
        }
        
        public void run() {
            if (this.decrementAndGet() == 0) {
                this.S.cancel();
            }
        }
        
        public void v(long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.N, n);
                if (!this.M.get() && this.M.compareAndSet(false, true)) {
                    n = io.reactivex.internal.util.d.d(this.J, n - 1L);
                    n = io.reactivex.internal.util.d.c(this.I, n);
                }
                else {
                    n = io.reactivex.internal.util.d.d(this.J, n);
                }
                this.S.v(n);
                this.c();
            }
        }
        
        @Override
        public void z(final d s) {
            if (j.o(this.S, s)) {
                this.S = s;
                this.G.z((d)this);
            }
        }
    }
    
    static final class c<T> extends AtomicInteger implements q<T>, d, Runnable
    {
        private static final long P = -8792836352386833856L;
        final o7.c<? super l<T>> G;
        final long H;
        final long I;
        final AtomicBoolean J;
        final AtomicBoolean K;
        final int L;
        long M;
        d N;
        io.reactivex.processors.h<T> O;
        
        c(final o7.c<? super l<T>> g, final long h, final long i, final int l) {
            super(1);
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = new AtomicBoolean();
            this.K = new AtomicBoolean();
            this.L = l;
        }
        
        public void b(final Throwable t) {
            final io.reactivex.processors.h<T> o = this.O;
            if (o != null) {
                this.O = null;
                ((o7.c)o).b(t);
            }
            this.G.b(t);
        }
        
        public void cancel() {
            if (this.J.compareAndSet(false, true)) {
                this.run();
            }
        }
        
        public void f() {
            final io.reactivex.processors.h<T> o = this.O;
            if (o != null) {
                this.O = null;
                ((o7.c)o).f();
            }
            this.G.f();
        }
        
        public void m(final T t) {
            final long m = this.M;
            io.reactivex.processors.h<T> o = this.O;
            if (m == 0L) {
                this.getAndIncrement();
                o = (io.reactivex.processors.h<T>)io.reactivex.processors.h.X8(this.L, this);
                this.O = o;
                this.G.m((Object)o);
            }
            final long i = m + 1L;
            if (o != null) {
                o.m(t);
            }
            if (i == this.H) {
                this.O = null;
                o.f();
            }
            if (i == this.I) {
                this.M = 0L;
            }
            else {
                this.M = i;
            }
        }
        
        public void run() {
            if (this.decrementAndGet() == 0) {
                this.N.cancel();
            }
        }
        
        public void v(long n) {
            if (j.m(n)) {
                if (!this.K.get() && this.K.compareAndSet(false, true)) {
                    n = io.reactivex.internal.util.d.c(io.reactivex.internal.util.d.d(this.H, n), io.reactivex.internal.util.d.d(this.I - this.H, n - 1L));
                }
                else {
                    n = io.reactivex.internal.util.d.d(this.I, n);
                }
                this.N.v(n);
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
