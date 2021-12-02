// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.annotations.g;
import y5.j;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import y5.o;
import io.reactivex.internal.observers.b;
import io.reactivex.internal.schedulers.s;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.j0;

public final class d2<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final j0 H;
    final boolean I;
    final int J;
    
    public d2(final g0<T> g0, final j0 h, final boolean i, final int j) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        final j0 h = this.H;
        if (h instanceof s) {
            super.G.c(i0);
        }
        else {
            super.G.c(new a<Object>((i0<? super Object>)i0, h.c(), this.I, this.J));
        }
    }
    
    static final class a<T> extends b<T> implements i0<T>, Runnable
    {
        private static final long S = 6576896619930983584L;
        final i0<? super T> H;
        final j0.c I;
        final boolean J;
        final int K;
        o<T> L;
        c M;
        Throwable N;
        volatile boolean O;
        volatile boolean P;
        int Q;
        boolean R;
        
        a(final i0<? super T> h, final j0.c i, final boolean j, final int k) {
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        @Override
        public int E(final int n) {
            if ((n & 0x2) != 0x0) {
                this.R = true;
                return 2;
            }
            return 0;
        }
        
        boolean a(final boolean b, final boolean b2, final i0<? super T> i0) {
            if (this.P) {
                this.L.clear();
                return true;
            }
            if (b) {
                final Throwable n = this.N;
                if (this.J) {
                    if (b2) {
                        this.P = true;
                        if (n != null) {
                            i0.b(n);
                        }
                        else {
                            i0.f();
                        }
                        this.I.dispose();
                        return true;
                    }
                }
                else {
                    if (n != null) {
                        this.P = true;
                        this.L.clear();
                        i0.b(n);
                        this.I.dispose();
                        return true;
                    }
                    if (b2) {
                        this.P = true;
                        i0.f();
                        this.I.dispose();
                        return true;
                    }
                }
            }
            return false;
        }
        
        @Override
        public void b(final Throwable n) {
            if (this.O) {
                io.reactivex.plugins.a.Y(n);
                return;
            }
            this.N = n;
            this.O = true;
            this.g();
        }
        
        void c() {
            int addAndGet = 1;
            while (!this.P) {
                final boolean o = this.O;
                final Throwable n = this.N;
                if (!this.J && o && n != null) {
                    this.P = true;
                    this.H.b(this.N);
                }
                else {
                    this.H.m((Object)null);
                    if (o) {
                        this.P = true;
                        final Throwable n2 = this.N;
                        if (n2 != null) {
                            this.H.b(n2);
                        }
                        else {
                            this.H.f();
                        }
                    }
                    else {
                        if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                            return;
                        }
                        continue;
                    }
                }
                this.I.dispose();
            }
        }
        
        @Override
        public void clear() {
            this.L.clear();
        }
        
        @Override
        public void dispose() {
            if (!this.P) {
                this.P = true;
                this.M.dispose();
                this.I.dispose();
                if (this.getAndIncrement() == 0) {
                    this.L.clear();
                }
            }
        }
        
        void e() {
            final o<T> l = this.L;
            final i0<? super T> h = this.H;
            int addAndGet = 1;
            while (!this.a(this.O, l.isEmpty(), h)) {
                while (true) {
                    final boolean o = this.O;
                    try {
                        final T poll = l.poll();
                        final boolean b = poll == null;
                        if (this.a(o, b, h)) {
                            return;
                        }
                        if (b) {
                            if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                                return;
                            }
                            break;
                        }
                        else {
                            h.m(poll);
                        }
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        this.P = true;
                        this.M.dispose();
                        l.clear();
                        h.b(t);
                        this.I.dispose();
                    }
                }
            }
        }
        
        @Override
        public void f() {
            if (this.O) {
                return;
            }
            this.O = true;
            this.g();
        }
        
        void g() {
            if (this.getAndIncrement() == 0) {
                this.I.b(this);
            }
        }
        
        @Override
        public boolean i() {
            return this.P;
        }
        
        @Override
        public boolean isEmpty() {
            return this.L.isEmpty();
        }
        
        @Override
        public void l(final c m) {
            if (d.l(this.M, m)) {
                this.M = m;
                if (m instanceof j) {
                    final j j = (j)m;
                    final int e = j.E(7);
                    if (e == 1) {
                        this.Q = e;
                        this.L = (o<T>)j;
                        this.O = true;
                        this.H.l(this);
                        this.g();
                        return;
                    }
                    if (e == 2) {
                        this.Q = e;
                        this.L = (o<T>)j;
                        this.H.l(this);
                        return;
                    }
                }
                this.L = new io.reactivex.internal.queue.c<T>(this.K);
                this.H.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.O) {
                return;
            }
            if (this.Q != 2) {
                this.L.offer(t);
            }
            this.g();
        }
        
        @io.reactivex.annotations.g
        @Override
        public T poll() throws Exception {
            return this.L.poll();
        }
        
        @Override
        public void run() {
            if (this.R) {
                this.c();
            }
            else {
                this.e();
            }
        }
    }
}
