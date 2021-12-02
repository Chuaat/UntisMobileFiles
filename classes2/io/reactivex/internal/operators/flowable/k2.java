// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.annotations.g;
import io.reactivex.internal.queue.b;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import y5.n;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class k2<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final int I;
    final boolean J;
    final boolean K;
    final x5.a L;
    
    public k2(final l<T> l, final int i, final boolean j, final boolean k, final x5.a m) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I, this.J, this.K, this.L));
    }
    
    static final class a<T> extends c<T> implements q<T>
    {
        private static final long R = -2514538129242366402L;
        final o7.c<? super T> H;
        final n<T> I;
        final boolean J;
        final x5.a K;
        d L;
        volatile boolean M;
        volatile boolean N;
        Throwable O;
        final AtomicLong P;
        boolean Q;
        
        a(final o7.c<? super T> h, final int n, final boolean b, final boolean j, final x5.a k) {
            this.P = new AtomicLong();
            this.H = h;
            this.K = k;
            this.J = j;
            Object i;
            if (b) {
                i = new io.reactivex.internal.queue.c<T>(n);
            }
            else {
                i = new b<T>(n);
            }
            this.I = (n<T>)i;
        }
        
        public int E(final int n) {
            if ((n & 0x2) != 0x0) {
                this.Q = true;
                return 2;
            }
            return 0;
        }
        
        public void b(final Throwable o) {
            this.O = o;
            this.N = true;
            if (this.Q) {
                this.H.b(o);
            }
            else {
                this.c();
            }
        }
        
        void c() {
            if (this.getAndIncrement() == 0) {
                final n<T> i = this.I;
                final o7.c<? super T> h = this.H;
                int addAndGet = 1;
                while (!this.g(this.N, i.isEmpty(), h)) {
                    final long value = this.P.get();
                    long n = 0L;
                    long n2;
                    while (true) {
                        n2 = lcmp(n, value);
                        if (n2 == 0) {
                            break;
                        }
                        final boolean n3 = this.N;
                        final T poll = i.poll();
                        final boolean b = poll == null;
                        if (this.g(n3, b, h)) {
                            return;
                        }
                        if (b) {
                            break;
                        }
                        h.m((Object)poll);
                        ++n;
                    }
                    if (n2 == 0 && this.g(this.N, i.isEmpty(), h)) {
                        return;
                    }
                    if (n != 0L && value != Long.MAX_VALUE) {
                        this.P.addAndGet(-n);
                    }
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                }
            }
        }
        
        public void cancel() {
            if (!this.M) {
                this.M = true;
                this.L.cancel();
                if (this.getAndIncrement() == 0) {
                    this.I.clear();
                }
            }
        }
        
        public void clear() {
            this.I.clear();
        }
        
        public void f() {
            this.N = true;
            if (this.Q) {
                this.H.f();
            }
            else {
                this.c();
            }
        }
        
        boolean g(final boolean b, final boolean b2, final o7.c<? super T> c) {
            if (this.M) {
                this.I.clear();
                return true;
            }
            if (b) {
                if (this.J) {
                    if (b2) {
                        final Throwable o = this.O;
                        if (o != null) {
                            c.b(o);
                        }
                        else {
                            c.f();
                        }
                        return true;
                    }
                }
                else {
                    final Throwable o2 = this.O;
                    if (o2 != null) {
                        this.I.clear();
                        c.b(o2);
                        return true;
                    }
                    if (b2) {
                        c.f();
                        return true;
                    }
                }
            }
            return false;
        }
        
        public boolean isEmpty() {
            return this.I.isEmpty();
        }
        
        public void m(T t) {
            if (!this.I.offer(t)) {
                this.L.cancel();
                t = (T)new io.reactivex.exceptions.c("Buffer is full");
                try {
                    this.K.run();
                }
                finally {
                    final Throwable cause;
                    io.reactivex.exceptions.b.b(cause);
                    ((Throwable)t).initCause(cause);
                }
                this.b((Throwable)t);
                return;
            }
            if (this.Q) {
                this.H.m((Object)null);
            }
            else {
                this.c();
            }
        }
        
        @g
        public T poll() throws Exception {
            return this.I.poll();
        }
        
        public void v(final long n) {
            if (!this.Q && j.m(n)) {
                io.reactivex.internal.util.d.a(this.P, n);
                this.c();
            }
        }
        
        @Override
        public void z(final d l) {
            if (j.o(this.L, l)) {
                this.L = l;
                this.H.z((d)this);
                l.v(Long.MAX_VALUE);
            }
        }
    }
}
