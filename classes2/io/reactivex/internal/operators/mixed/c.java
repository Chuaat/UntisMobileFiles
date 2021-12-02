// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.plugins.a;
import io.reactivex.internal.util.k;
import io.reactivex.internal.queue.b;
import o7.d;
import y5.n;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import io.reactivex.f;
import io.reactivex.internal.util.j;
import io.reactivex.i;
import x5.o;
import io.reactivex.l;

public final class c<T> extends io.reactivex.c
{
    final l<T> G;
    final o<? super T, ? extends i> H;
    final j I;
    final int J;
    
    public c(final l<T> g, final o<? super T, ? extends i> h, final j i, final int j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.m6(new a<Object>(f, this.H, this.I, this.J));
    }
    
    static final class a<T> extends AtomicInteger implements q<T>, io.reactivex.disposables.c
    {
        private static final long S = 3610901111000061034L;
        final f G;
        final o<? super T, ? extends i> H;
        final j I;
        final io.reactivex.internal.util.c J;
        final a K;
        final int L;
        final n<T> M;
        d N;
        volatile boolean O;
        volatile boolean P;
        volatile boolean Q;
        int R;
        
        a(final f g, final o<? super T, ? extends i> h, final j i, final int l) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.L = l;
            this.J = new io.reactivex.internal.util.c();
            this.K = new a(this);
            this.M = new b<T>(l);
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            while (!this.Q) {
                if (!this.O) {
                    if (this.I == j.H && this.J.get() != null) {
                        this.M.clear();
                        this.G.b(this.J.c());
                        return;
                    }
                    final boolean p = this.P;
                    final T poll = this.M.poll();
                    final boolean b = poll == null;
                    if (p && b) {
                        final Throwable c = this.J.c();
                        if (c != null) {
                            this.G.b(c);
                        }
                        else {
                            this.G.f();
                        }
                        return;
                    }
                    if (!b) {
                        final int l = this.L;
                        final int n = l - (l >> 1);
                        final int r = this.R + 1;
                        if (r == n) {
                            this.R = 0;
                            this.N.v((long)n);
                        }
                        else {
                            this.R = r;
                        }
                        try {
                            final i i = io.reactivex.internal.functions.b.g((i)this.H.apply((Object)poll), "The mapper returned a null CompletableSource");
                            this.O = true;
                            i.c(this.K);
                        }
                        finally {
                            final Throwable t;
                            io.reactivex.exceptions.b.b(t);
                            this.M.clear();
                            this.N.cancel();
                            this.J.a(t);
                            this.G.b(this.J.c());
                            return;
                        }
                    }
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            this.M.clear();
        }
        
        public void b(Throwable c) {
            if (this.J.a(c)) {
                if (this.I == j.G) {
                    this.K.a();
                    c = this.J.c();
                    if (c != k.a) {
                        this.G.b(c);
                    }
                    if (this.getAndIncrement() == 0) {
                        this.M.clear();
                    }
                }
                else {
                    this.P = true;
                    this.a();
                }
            }
            else {
                a.Y(c);
            }
        }
        
        void c() {
            this.O = false;
            this.a();
        }
        
        void d(Throwable c) {
            if (this.J.a(c)) {
                if (this.I == j.G) {
                    this.N.cancel();
                    c = this.J.c();
                    if (c != k.a) {
                        this.G.b(c);
                    }
                    if (this.getAndIncrement() == 0) {
                        this.M.clear();
                    }
                }
                else {
                    this.O = false;
                    this.a();
                }
            }
            else {
                a.Y(c);
            }
        }
        
        @Override
        public void dispose() {
            this.Q = true;
            this.N.cancel();
            this.K.a();
            if (this.getAndIncrement() == 0) {
                this.M.clear();
            }
        }
        
        public void f() {
            this.P = true;
            this.a();
        }
        
        @Override
        public boolean i() {
            return this.Q;
        }
        
        public void m(final T t) {
            if (this.M.offer(t)) {
                this.a();
            }
            else {
                this.N.cancel();
                this.b(new io.reactivex.exceptions.c("Queue full?!"));
            }
        }
        
        @Override
        public void z(final d n) {
            if (io.reactivex.internal.subscriptions.j.o(this.N, n)) {
                this.N = n;
                this.G.l(this);
                n.v((long)this.L);
            }
        }
        
        static final class a extends AtomicReference<io.reactivex.disposables.c> implements f
        {
            private static final long H = 5638352172918776687L;
            final io.reactivex.internal.operators.mixed.c.a<?> G;
            
            a(final io.reactivex.internal.operators.mixed.c.a<?> g) {
                this.G = g;
            }
            
            void a() {
                io.reactivex.internal.disposables.d.b(this);
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
