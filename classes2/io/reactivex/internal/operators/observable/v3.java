// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class v3<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final long H;
    final TimeUnit I;
    final j0 J;
    final boolean K;
    
    public v3(final b0<T> b0, final long h, final TimeUnit i, final j0 j, final boolean k) {
        super(b0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, this.H, this.I, this.J.c(), this.K));
    }
    
    static final class a<T> extends AtomicInteger implements i0<T>, c, Runnable
    {
        private static final long S = -8296689127439125014L;
        final i0<? super T> G;
        final long H;
        final TimeUnit I;
        final j0.c J;
        final boolean K;
        final AtomicReference<T> L;
        c M;
        volatile boolean N;
        Throwable O;
        volatile boolean P;
        volatile boolean Q;
        boolean R;
        
        a(final i0<? super T> g, final long h, final TimeUnit i, final j0.c j, final boolean k) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = new AtomicReference<T>();
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final AtomicReference<T> l = this.L;
            final i0<? super T> g = this.G;
            int addAndGet = 1;
            while (!this.P) {
                final boolean n = this.N;
                if (n && this.O != null) {
                    l.lazySet(null);
                    g.b(this.O);
                }
                else {
                    final boolean b = l.get() == null;
                    if (n) {
                        final T andSet = l.getAndSet(null);
                        if (!b && this.K) {
                            g.m(andSet);
                        }
                        g.f();
                    }
                    else {
                        if (b) {
                            if (this.Q) {
                                this.R = false;
                                this.Q = false;
                            }
                        }
                        else if (!this.R || this.Q) {
                            g.m(l.getAndSet(null));
                            this.Q = false;
                            this.R = true;
                            this.J.c(this, this.H, this.I);
                            continue;
                        }
                        if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                            return;
                        }
                        continue;
                    }
                }
                this.J.dispose();
                return;
            }
            l.lazySet(null);
        }
        
        @Override
        public void b(final Throwable o) {
            this.O = o;
            this.N = true;
            this.a();
        }
        
        @Override
        public void dispose() {
            this.P = true;
            this.M.dispose();
            this.J.dispose();
            if (this.getAndIncrement() == 0) {
                this.L.lazySet(null);
            }
        }
        
        @Override
        public void f() {
            this.N = true;
            this.a();
        }
        
        @Override
        public boolean i() {
            return this.P;
        }
        
        @Override
        public void l(final c m) {
            if (d.l(this.M, m)) {
                this.M = m;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T newValue) {
            this.L.set(newValue);
            this.a();
        }
        
        @Override
        public void run() {
            this.Q = true;
            this.a();
        }
    }
}
