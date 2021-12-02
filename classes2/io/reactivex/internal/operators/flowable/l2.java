// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.exceptions.b;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class l2<T> extends a<T, T>
{
    final long I;
    final x5.a J;
    final io.reactivex.a K;
    
    public l2(final l<T> l, final long i, final x5.a j, final io.reactivex.a k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new b<Object>((o7.c<? super T>)c, this.J, this.K, this.I));
    }
    
    static final class b<T> extends AtomicInteger implements q<T>, d
    {
        private static final long Q = 3240706908776709697L;
        final c<? super T> G;
        final x5.a H;
        final io.reactivex.a I;
        final long J;
        final AtomicLong K;
        final Deque<T> L;
        d M;
        volatile boolean N;
        volatile boolean O;
        Throwable P;
        
        b(final c<? super T> g, final x5.a h, final io.reactivex.a i, final long j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = new AtomicLong();
            this.L = new ArrayDeque<T>();
        }
        
        void a(final Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }
        
        public void b(final Throwable p) {
            if (this.O) {
                io.reactivex.plugins.a.Y(p);
                return;
            }
            this.P = p;
            this.O = true;
            this.c();
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final Deque<T> l = this.L;
            final c<? super T> g = this.G;
            int addAndGet = 1;
            do {
                final long value = this.K.get();
                long n = 0L;
                long n2;
                while (true) {
                    n2 = lcmp(n, value);
                    if (n2 == 0) {
                        break;
                    }
                    if (this.N) {
                        this.a(l);
                        return;
                    }
                    final boolean o = this.O;
                    synchronized (l) {
                        final T poll = l.poll();
                        // monitorexit(l)
                        final boolean b = poll == null;
                        if (o) {
                            final Throwable p = this.P;
                            if (p != null) {
                                this.a(l);
                                g.b(p);
                                return;
                            }
                            if (b) {
                                g.f();
                                return;
                            }
                        }
                        if (!b) {
                            g.m((Object)poll);
                            ++n;
                            continue;
                        }
                    }
                    break;
                }
                if (n2 == 0) {
                    if (this.N) {
                        this.a(l);
                        return;
                    }
                    final boolean o2 = this.O;
                    synchronized (l) {
                        final boolean empty = l.isEmpty();
                        // monitorexit(l)
                        if (o2) {
                            final Throwable p2 = this.P;
                            if (p2 != null) {
                                this.a(l);
                                g.b(p2);
                                return;
                            }
                            if (empty) {
                                g.f();
                                return;
                            }
                        }
                    }
                }
                if (n != 0L) {
                    io.reactivex.internal.util.d.e(this.K, n);
                }
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        public void cancel() {
            this.N = true;
            this.M.cancel();
            if (this.getAndIncrement() == 0) {
                this.a(this.L);
            }
        }
        
        public void f() {
            this.O = true;
            this.c();
        }
        
        public void m(final T t) {
            if (this.O) {
                return;
            }
            final Deque<T> l = this.L;
            synchronized (l) {
                final long n = l.size();
                final long j = this.J;
                int n2 = 0;
                final int n3 = 0;
                boolean b = true;
                Label_0119: {
                    if (n == j) {
                        final int n4 = l2$a.a[this.I.ordinal()];
                        if (n4 != 1) {
                            if (n4 != 2) {
                                break Label_0119;
                            }
                            l.poll();
                        }
                        else {
                            l.pollLast();
                        }
                        l.offer(t);
                        n2 = 1;
                    }
                    else {
                        l.offer(t);
                        n2 = n3;
                    }
                    b = false;
                }
                // monitorexit(l)
                final io.reactivex.exceptions.c c;
                Label_0183: {
                    if (n2 != 0) {
                        final x5.a h = this.H;
                        if (h == null) {
                            return;
                        }
                        try {
                            h.run();
                            return;
                        }
                        finally {
                            io.reactivex.exceptions.b.b(c);
                            this.M.cancel();
                            break Label_0183;
                        }
                    }
                    if (!b) {
                        this.c();
                        return;
                    }
                    this.M.cancel();
                    c = new io.reactivex.exceptions.c();
                }
                this.b(c);
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.K, n);
                this.c();
            }
        }
        
        @Override
        public void z(final d m) {
            if (j.o(this.M, m)) {
                this.M = m;
                this.G.z((d)this);
                m.v(Long.MAX_VALUE);
            }
        }
    }
}
