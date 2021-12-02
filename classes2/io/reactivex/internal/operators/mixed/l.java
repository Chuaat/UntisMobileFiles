// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import io.reactivex.internal.util.k;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.i0;
import io.reactivex.f;
import io.reactivex.internal.util.j;
import io.reactivex.i;
import x5.o;
import io.reactivex.b0;
import io.reactivex.c;

public final class l<T> extends c
{
    final b0<T> G;
    final o<? super T, ? extends i> H;
    final j I;
    final int J;
    
    public l(final b0<T> g, final o<? super T, ? extends i> h, final j i, final int j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void L0(final f f) {
        if (!r.a(this.G, (o<? super Object, ? extends i>)this.H, f)) {
            this.G.c(new a<Object>(f, this.H, this.I, this.J));
        }
    }
    
    static final class a<T> extends AtomicInteger implements i0<T>, io.reactivex.disposables.c
    {
        private static final long R = 3610901111000061034L;
        final f G;
        final o<? super T, ? extends i> H;
        final j I;
        final io.reactivex.internal.util.c J;
        final l.a.a K;
        final int L;
        y5.o<T> M;
        io.reactivex.disposables.c N;
        volatile boolean O;
        volatile boolean P;
        volatile boolean Q;
        
        a(final f g, final o<? super T, ? extends i> h, final j i, final int l) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.L = l;
            this.J = new io.reactivex.internal.util.c();
            this.K = new l.a.a(this);
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final io.reactivex.internal.util.c j = this.J;
            final j i = this.I;
            while (!this.Q) {
                if (!this.O) {
                    if (i == io.reactivex.internal.util.j.H && j.get() != null) {
                        this.Q = true;
                        this.M.clear();
                        this.G.b(j.c());
                        return;
                    }
                    final boolean p = this.P;
                    i k = null;
                    try {
                        final T poll = this.M.poll();
                        boolean b;
                        if (poll != null) {
                            k = io.reactivex.internal.functions.b.g((i)this.H.apply((Object)poll), "The mapper returned a null CompletableSource");
                            b = false;
                        }
                        else {
                            b = true;
                        }
                        if (p && b) {
                            this.Q = true;
                            final Throwable c = j.c();
                            if (c != null) {
                                this.G.b(c);
                            }
                            else {
                                this.G.f();
                            }
                            return;
                        }
                        if (!b) {
                            this.O = true;
                            k.c(this.K);
                        }
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        this.Q = true;
                        this.M.clear();
                        this.N.dispose();
                        j.a(t);
                        this.G.b(j.c());
                        return;
                    }
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            this.M.clear();
        }
        
        @Override
        public void b(Throwable c) {
            if (this.J.a(c)) {
                if (this.I == j.G) {
                    this.Q = true;
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
                    this.Q = true;
                    this.N.dispose();
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
            this.N.dispose();
            this.K.a();
            if (this.getAndIncrement() == 0) {
                this.M.clear();
            }
        }
        
        @Override
        public void f() {
            this.P = true;
            this.a();
        }
        
        @Override
        public boolean i() {
            return this.Q;
        }
        
        @Override
        public void l(final io.reactivex.disposables.c n) {
            if (d.l(this.N, n)) {
                this.N = n;
                if (n instanceof y5.j) {
                    final y5.j j = (y5.j)n;
                    final int e = j.E(3);
                    if (e == 1) {
                        this.M = (y5.o<T>)j;
                        this.P = true;
                        this.G.l(this);
                        this.a();
                        return;
                    }
                    if (e == 2) {
                        this.M = (y5.o<T>)j;
                        this.G.l(this);
                        return;
                    }
                }
                this.M = new io.reactivex.internal.queue.c<T>(this.L);
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (t != null) {
                this.M.offer(t);
            }
            this.a();
        }
        
        static final class a extends AtomicReference<io.reactivex.disposables.c> implements f
        {
            private static final long H = 5638352172918776687L;
            final l.a<?> G;
            
            a(final l.a<?> g) {
                this.G = g;
            }
            
            void a() {
                d.b(this);
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
                d.f(this, c);
            }
        }
    }
}
