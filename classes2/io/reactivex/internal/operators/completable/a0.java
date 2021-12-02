// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.plugins.a;
import o7.d;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.f;
import io.reactivex.i;
import o7.b;
import io.reactivex.c;

public final class a0 extends c
{
    final b<? extends i> G;
    final int H;
    final boolean I;
    
    public a0(final b<? extends i> g, final int h, final boolean i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void L0(final f f) {
        this.G.e((o7.c)new a(f, this.H, this.I));
    }
    
    static final class a extends AtomicInteger implements q<i>, io.reactivex.disposables.c
    {
        private static final long M = -2108443387387077490L;
        final f G;
        final int H;
        final boolean I;
        final io.reactivex.internal.util.c J;
        final io.reactivex.disposables.b K;
        d L;
        
        a(final f g, final int h, final boolean i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.K = new io.reactivex.disposables.b();
            this.J = new io.reactivex.internal.util.c();
            this.lazySet(1);
        }
        
        void a(final a0.a.a a) {
            this.K.c(a);
            if (this.decrementAndGet() == 0) {
                final Throwable t = this.J.get();
                if (t != null) {
                    this.G.b(t);
                }
                else {
                    this.G.f();
                }
            }
            else if (this.H != Integer.MAX_VALUE) {
                this.L.v(1L);
            }
        }
        
        public void b(final Throwable t) {
            Label_0073: {
                if (!this.I) {
                    this.K.dispose();
                    if (!this.J.a(t)) {
                        break Label_0073;
                    }
                    if (this.getAndSet(0) <= 0) {
                        return;
                    }
                }
                else {
                    if (!this.J.a(t)) {
                        break Label_0073;
                    }
                    if (this.decrementAndGet() != 0) {
                        return;
                    }
                }
                this.G.b(this.J.c());
                return;
            }
            a.Y(t);
        }
        
        void c(final a0.a.a a, final Throwable t) {
            this.K.c(a);
            Label_0113: {
                if (!this.I) {
                    this.L.cancel();
                    this.K.dispose();
                    if (!this.J.a(t)) {
                        break Label_0113;
                    }
                    if (this.getAndSet(0) <= 0) {
                        return;
                    }
                }
                else {
                    if (!this.J.a(t)) {
                        break Label_0113;
                    }
                    if (this.decrementAndGet() != 0) {
                        if (this.H != Integer.MAX_VALUE) {
                            this.L.v(1L);
                        }
                        return;
                    }
                }
                this.G.b(this.J.c());
                return;
            }
            a.Y(t);
        }
        
        public void d(final i i) {
            this.getAndIncrement();
            final a0.a.a a = new a0.a.a();
            this.K.b(a);
            i.c(a);
        }
        
        @Override
        public void dispose() {
            this.L.cancel();
            this.K.dispose();
        }
        
        public void f() {
            if (this.decrementAndGet() == 0) {
                if (this.J.get() != null) {
                    this.G.b(this.J.c());
                }
                else {
                    this.G.f();
                }
            }
        }
        
        @Override
        public boolean i() {
            return this.K.i();
        }
        
        @Override
        public void z(final d l) {
            if (j.o(this.L, l)) {
                this.L = l;
                this.G.l(this);
                final int h = this.H;
                long n;
                if (h == Integer.MAX_VALUE) {
                    n = Long.MAX_VALUE;
                }
                else {
                    n = h;
                }
                l.v(n);
            }
        }
        
        final class a extends AtomicReference<io.reactivex.disposables.c> implements f, io.reactivex.disposables.c
        {
            private static final long H = 251330541679988317L;
            
            @Override
            public void b(final Throwable t) {
                a0.a.this.c(this, t);
            }
            
            @Override
            public void dispose() {
                io.reactivex.internal.disposables.d.b(this);
            }
            
            @Override
            public void f() {
                a0.a.this.a(this);
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
