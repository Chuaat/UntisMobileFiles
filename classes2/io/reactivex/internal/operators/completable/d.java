// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import y5.l;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;
import y5.o;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.f;
import io.reactivex.i;
import o7.b;
import io.reactivex.c;

public final class d extends c
{
    final b<? extends i> G;
    final int H;
    
    public d(final b<? extends i> g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    public void L0(final f f) {
        this.G.e((o7.c)new a(f, this.H));
    }
    
    static final class a extends AtomicInteger implements q<i>, io.reactivex.disposables.c
    {
        private static final long R = 9032184911934499404L;
        final f G;
        final int H;
        final int I;
        final d.a.a J;
        final AtomicBoolean K;
        int L;
        int M;
        o<i> N;
        o7.d O;
        volatile boolean P;
        volatile boolean Q;
        
        a(final f g, final int h) {
            this.G = g;
            this.H = h;
            this.J = new d.a.a(this);
            this.K = new AtomicBoolean();
            this.I = h - (h >> 2);
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            while (!this.i()) {
                if (!this.Q) {
                    final boolean p = this.P;
                    try {
                        final i i = this.N.poll();
                        final boolean b = i == null;
                        if (p && b) {
                            if (this.K.compareAndSet(false, true)) {
                                this.G.f();
                            }
                            return;
                        }
                        if (!b) {
                            this.Q = true;
                            i.c(this.J);
                            this.g();
                        }
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        this.d(t);
                        return;
                    }
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
        }
        
        public void b(final Throwable t) {
            if (this.K.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.d.b(this.J);
                this.G.b(t);
            }
            else {
                a.Y(t);
            }
        }
        
        void c() {
            this.Q = false;
            this.a();
        }
        
        void d(final Throwable t) {
            if (this.K.compareAndSet(false, true)) {
                this.O.cancel();
                this.G.b(t);
            }
            else {
                a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            this.O.cancel();
            io.reactivex.internal.disposables.d.b(this.J);
        }
        
        public void e(final i i) {
            if (this.L == 0 && !this.N.offer(i)) {
                this.b(new io.reactivex.exceptions.c());
                return;
            }
            this.a();
        }
        
        public void f() {
            this.P = true;
            this.a();
        }
        
        void g() {
            if (this.L != 1) {
                final int m = this.M + 1;
                if (m == this.I) {
                    this.M = 0;
                    this.O.v((long)m);
                }
                else {
                    this.M = m;
                }
            }
        }
        
        @Override
        public boolean i() {
            return io.reactivex.internal.disposables.d.d(this.J.get());
        }
        
        @Override
        public void z(final o7.d o) {
            if (j.o(this.O, o)) {
                this.O = o;
                final int h = this.H;
                long n;
                if (h == Integer.MAX_VALUE) {
                    n = Long.MAX_VALUE;
                }
                else {
                    n = h;
                }
                if (o instanceof l) {
                    final l l = (l)o;
                    final int e = l.E(3);
                    if (e == 1) {
                        this.L = e;
                        this.N = (o<i>)l;
                        this.P = true;
                        this.G.l(this);
                        this.a();
                        return;
                    }
                    if (e == 2) {
                        this.L = e;
                        this.N = (o<i>)l;
                        this.G.l(this);
                        o.v(n);
                        return;
                    }
                }
                Object n2;
                if (this.H == Integer.MAX_VALUE) {
                    n2 = new io.reactivex.internal.queue.c<i>(io.reactivex.l.b0());
                }
                else {
                    n2 = new io.reactivex.internal.queue.b<i>(this.H);
                }
                this.N = (o<i>)n2;
                this.G.l(this);
                o.v(n);
            }
        }
        
        static final class a extends AtomicReference<io.reactivex.disposables.c> implements f
        {
            private static final long H = -5454794857847146511L;
            final d.a G;
            
            a(final d.a g) {
                this.G = g;
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.d(t);
            }
            
            @Override
            public void f() {
                this.G.c();
            }
            
            @Override
            public void l(final io.reactivex.disposables.c c) {
                io.reactivex.internal.disposables.d.f(this, c);
            }
        }
    }
}
