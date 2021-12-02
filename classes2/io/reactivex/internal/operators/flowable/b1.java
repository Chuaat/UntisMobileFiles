// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.plugins.a;
import io.reactivex.q;
import io.reactivex.f;
import io.reactivex.i;
import x5.o;
import io.reactivex.l;
import y5.b;
import io.reactivex.c;

public final class b1<T> extends c implements b<T>
{
    final l<T> G;
    final o<? super T, ? extends i> H;
    final int I;
    final boolean J;
    
    public b1(final l<T> g, final o<? super T, ? extends i> h, final boolean j, final int i) {
        this.G = g;
        this.H = h;
        this.J = j;
        this.I = i;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.m6(new a<Object>(f, this.H, this.J, this.I));
    }
    
    @Override
    public l<T> g() {
        return io.reactivex.plugins.a.P(new a1((l<Object>)this.G, (o<? super Object, ? extends i>)this.H, this.J, this.I));
    }
    
    static final class a<T> extends AtomicInteger implements q<T>, io.reactivex.disposables.c
    {
        private static final long O = 8443155186132538303L;
        final f G;
        final io.reactivex.internal.util.c H;
        final o<? super T, ? extends i> I;
        final boolean J;
        final io.reactivex.disposables.b K;
        final int L;
        d M;
        volatile boolean N;
        
        a(final f g, final o<? super T, ? extends i> i, final boolean j, final int l) {
            this.G = g;
            this.I = i;
            this.J = j;
            this.H = new io.reactivex.internal.util.c();
            this.K = new io.reactivex.disposables.b();
            this.L = l;
            this.lazySet(1);
        }
        
        void a(final b1.a.a a) {
            this.K.c(a);
            this.f();
        }
        
        public void b(Throwable c) {
            if (this.H.a(c)) {
                if (this.J) {
                    if (this.decrementAndGet() != 0) {
                        if (this.L != Integer.MAX_VALUE) {
                            this.M.v(1L);
                        }
                        return;
                    }
                }
                else {
                    this.dispose();
                    if (this.getAndSet(0) <= 0) {
                        return;
                    }
                }
                c = this.H.c();
                this.G.b(c);
            }
            else {
                a.Y(c);
            }
        }
        
        void c(final b1.a.a a, final Throwable t) {
            this.K.c(a);
            this.b(t);
        }
        
        @Override
        public void dispose() {
            this.N = true;
            this.M.cancel();
            this.K.dispose();
        }
        
        public void f() {
            if (this.decrementAndGet() == 0) {
                final Throwable c = this.H.c();
                if (c != null) {
                    this.G.b(c);
                }
                else {
                    this.G.f();
                }
            }
            else if (this.L != Integer.MAX_VALUE) {
                this.M.v(1L);
            }
        }
        
        @Override
        public boolean i() {
            return this.K.i();
        }
        
        public void m(final T t) {
            try {
                final i i = io.reactivex.internal.functions.b.g((i)this.I.apply((Object)t), "The mapper returned a null CompletableSource");
                this.getAndIncrement();
                final b1.a.a a = new b1.a.a();
                if (!this.N && this.K.b(a)) {
                    i.c(a);
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.M.cancel();
                this.b(t2);
            }
        }
        
        @Override
        public void z(final d m) {
            if (j.o(this.M, m)) {
                this.M = m;
                this.G.l(this);
                final int l = this.L;
                long n;
                if (l == Integer.MAX_VALUE) {
                    n = Long.MAX_VALUE;
                }
                else {
                    n = l;
                }
                m.v(n);
            }
        }
        
        final class a extends AtomicReference<io.reactivex.disposables.c> implements f, io.reactivex.disposables.c
        {
            private static final long H = 8606673141535671828L;
            
            @Override
            public void b(final Throwable t) {
                b1.a.this.c(this, t);
            }
            
            @Override
            public void dispose() {
                io.reactivex.internal.disposables.d.b(this);
            }
            
            @Override
            public void f() {
                b1.a.this.a(this);
            }
            
            @Override
            public boolean i() {
                return io.reactivex.internal.disposables.d.d(this.get());
            }
            
            @Override
            public void l(final io.reactivex.disposables.c c) {
                io.reactivex.internal.disposables.d.j(this, c);
            }
        }
    }
}
