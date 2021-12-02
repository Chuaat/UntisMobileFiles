// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.io.Serializable;
import io.reactivex.internal.subscribers.k;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import io.reactivex.internal.util.j;
import o7.b;
import x5.o;

public final class x<T, R> extends io.reactivex.internal.operators.flowable.a<T, R>
{
    final o<? super T, ? extends b<? extends R>> I;
    final int J;
    final int K;
    final j L;
    
    public x(final l<T> l, final o<? super T, ? extends b<? extends R>> i, final int j, final int k, final j m) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        super.H.m6(new a<Object, Object>(c, this.I, this.J, this.K, this.L));
    }
    
    static final class a<T, R> extends AtomicInteger implements q<T>, d, io.reactivex.internal.subscribers.l<R>
    {
        private static final long S = -4255299542215038287L;
        final c<? super R> G;
        final o<? super T, ? extends b<? extends R>> H;
        final int I;
        final int J;
        final j K;
        final io.reactivex.internal.util.c L;
        final AtomicLong M;
        final io.reactivex.internal.queue.c<k<R>> N;
        d O;
        volatile boolean P;
        volatile boolean Q;
        volatile k<R> R;
        
        a(final c<? super R> g, final o<? super T, ? extends b<? extends R>> h, final int n, final int n2, final j k) {
            this.G = g;
            this.H = h;
            this.I = n;
            this.J = n2;
            this.K = k;
            this.N = new io.reactivex.internal.queue.c<k<R>>(Math.min(n2, n));
            this.L = new io.reactivex.internal.util.c();
            this.M = new AtomicLong();
        }
        
        public void a(final k<R> k) {
            k.e();
            this.c();
        }
        
        public void b(final Throwable t) {
            if (this.L.a(t)) {
                this.Q = true;
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            Serializable r = this.R;
            final c<? super R> g = this.G;
            final j k = this.K;
            int addAndGet = 1;
            while (true) {
                final long value = this.M.get();
                if (r == null) {
                    if (k != j.I && this.L.get() != null) {
                        this.g();
                        g.b(this.L.c());
                        return;
                    }
                    final boolean q = this.Q;
                    final k<R> r2 = this.N.poll();
                    if (q && r2 == null) {
                        final Throwable c = this.L.c();
                        if (c != null) {
                            g.b(c);
                        }
                        else {
                            g.f();
                        }
                        return;
                    }
                    if ((r = r2) != null) {
                        this.R = r2;
                        r = r2;
                    }
                }
                boolean b3 = false;
                long n3 = 0L;
                Label_0527: {
                    if (r != null) {
                        final y5.o<Object> c2 = ((k<Object>)r).c();
                        if (c2 != null) {
                            long n = 0L;
                            long n2 = 0L;
                            boolean b2 = false;
                            final k<Object> i;
                            Label_0370: {
                                while (true) {
                                    n2 = lcmp(n, value);
                                    if (n2 == 0) {
                                        break;
                                    }
                                    if (this.P) {
                                        this.g();
                                        return;
                                    }
                                    if (k == j.G && this.L.get() != null) {
                                        this.R = null;
                                        ((k)r).cancel();
                                        this.g();
                                        g.b(this.L.c());
                                        return;
                                    }
                                    final boolean a = ((k)r).a();
                                    try {
                                        final Object poll = c2.poll();
                                        final boolean b = poll == null;
                                        if (a && b) {
                                            this.R = null;
                                            this.O.v(1L);
                                            b2 = true;
                                            break Label_0370;
                                        }
                                        if (!b) {
                                            g.m(poll);
                                            ++n;
                                            ((k)r).d();
                                            continue;
                                        }
                                    }
                                    finally {
                                        io.reactivex.exceptions.b.b((Throwable)i);
                                        this.R = null;
                                        ((k)r).cancel();
                                        this.g();
                                        g.b((Throwable)i);
                                        return;
                                    }
                                    break;
                                }
                                b2 = false;
                                i = (k<Object>)r;
                            }
                            b3 = b2;
                            r = i;
                            n3 = n;
                            if (n2 != 0) {
                                break Label_0527;
                            }
                            if (this.P) {
                                this.g();
                                return;
                            }
                            if (k == j.G && this.L.get() != null) {
                                this.R = null;
                                i.cancel();
                                this.g();
                                g.b(this.L.c());
                                return;
                            }
                            final boolean a2 = i.a();
                            final boolean empty = c2.isEmpty();
                            b3 = b2;
                            r = i;
                            n3 = n;
                            if (!a2) {
                                break Label_0527;
                            }
                            b3 = b2;
                            r = i;
                            n3 = n;
                            if (empty) {
                                this.R = null;
                                this.O.v(1L);
                                r = null;
                                b3 = true;
                                n3 = n;
                            }
                            break Label_0527;
                        }
                    }
                    n3 = 0L;
                    b3 = false;
                }
                if (n3 != 0L && value != Long.MAX_VALUE) {
                    this.M.addAndGet(-n3);
                }
                if (b3) {
                    continue;
                }
                addAndGet = this.addAndGet(-addAndGet);
                if (addAndGet == 0) {
                    return;
                }
            }
        }
        
        public void cancel() {
            if (this.P) {
                return;
            }
            this.P = true;
            this.O.cancel();
            this.h();
        }
        
        public void d(final k<R> k, final R r) {
            if (k.c().offer(r)) {
                this.c();
            }
            else {
                k.cancel();
                this.e(k, new io.reactivex.exceptions.c());
            }
        }
        
        public void e(final k<R> k, final Throwable t) {
            if (this.L.a(t)) {
                k.e();
                if (this.K != j.I) {
                    this.O.cancel();
                }
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void f() {
            this.Q = true;
            this.c();
        }
        
        void g() {
            k<R> r = this.R;
            this.R = null;
            while (true) {
                Label_0018: {
                    if (r == null) {
                        break Label_0018;
                    }
                    r.cancel();
                }
                r = this.N.poll();
                if (r != null) {
                    continue;
                }
                break;
            }
        }
        
        void h() {
            if (this.getAndIncrement() == 0) {
                do {
                    this.g();
                } while (this.decrementAndGet() != 0);
            }
        }
        
        public void m(final T t) {
            try {
                final b b = io.reactivex.internal.functions.b.g((b)this.H.apply((Object)t), "The mapper returned a null Publisher");
                final k k = new k<R>(this, this.J);
                if (this.P) {
                    return;
                }
                this.N.offer(k);
                b.e((c)k);
                if (this.P) {
                    k.cancel();
                    this.h();
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.O.cancel();
                this.b(t2);
            }
        }
        
        public void v(final long n) {
            if (io.reactivex.internal.subscriptions.j.m(n)) {
                io.reactivex.internal.util.d.a(this.M, n);
                this.c();
            }
        }
        
        @Override
        public void z(final d o) {
            if (io.reactivex.internal.subscriptions.j.o(this.O, o)) {
                this.O = o;
                this.G.z((d)this);
                final int i = this.I;
                long n;
                if (i == Integer.MAX_VALUE) {
                    n = Long.MAX_VALUE;
                }
                else {
                    n = i;
                }
                o.v(n);
            }
        }
    }
}
