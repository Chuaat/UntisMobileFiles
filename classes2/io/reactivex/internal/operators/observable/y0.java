// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.plugins.a;
import io.reactivex.b0;
import io.reactivex.i0;
import io.reactivex.f;
import io.reactivex.i;
import x5.o;
import io.reactivex.g0;
import y5.d;
import io.reactivex.c;

public final class y0<T> extends c implements d<T>
{
    final g0<T> G;
    final o<? super T, ? extends i> H;
    final boolean I;
    
    public y0(final g0<T> g, final o<? super T, ? extends i> h, final boolean i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.c(new a<Object>(f, this.H, this.I));
    }
    
    @Override
    public b0<T> a() {
        return io.reactivex.plugins.a.R(new x0((g0<Object>)this.G, (o<? super Object, ? extends i>)this.H, this.I));
    }
    
    static final class a<T> extends AtomicInteger implements io.reactivex.disposables.c, i0<T>
    {
        private static final long N = 8443155186132538303L;
        final f G;
        final io.reactivex.internal.util.c H;
        final o<? super T, ? extends i> I;
        final boolean J;
        final b K;
        io.reactivex.disposables.c L;
        volatile boolean M;
        
        a(final f g, final o<? super T, ? extends i> i, final boolean j) {
            this.G = g;
            this.I = i;
            this.J = j;
            this.H = new io.reactivex.internal.util.c();
            this.K = new b();
            this.lazySet(1);
        }
        
        void a(final y0.a.a a) {
            this.K.c(a);
            this.f();
        }
        
        @Override
        public void b(Throwable c) {
            if (this.H.a(c)) {
                if (this.J) {
                    if (this.decrementAndGet() != 0) {
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
        
        void c(final y0.a.a a, final Throwable t) {
            this.K.c(a);
            this.b(t);
        }
        
        @Override
        public void dispose() {
            this.M = true;
            this.L.dispose();
            this.K.dispose();
        }
        
        @Override
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
        }
        
        @Override
        public boolean i() {
            return this.L.i();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c l) {
            if (io.reactivex.internal.disposables.d.l(this.L, l)) {
                this.L = l;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            try {
                final i i = io.reactivex.internal.functions.b.g((i)this.I.apply((Object)t), "The mapper returned a null CompletableSource");
                this.getAndIncrement();
                final y0.a.a a = new y0.a.a();
                if (!this.M && this.K.b(a)) {
                    i.c(a);
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.L.dispose();
                this.b(t2);
            }
        }
        
        final class a extends AtomicReference<io.reactivex.disposables.c> implements f, io.reactivex.disposables.c
        {
            private static final long H = 8606673141535671828L;
            
            @Override
            public void b(final Throwable t) {
                y0.a.this.c(this, t);
            }
            
            @Override
            public void dispose() {
                io.reactivex.internal.disposables.d.b(this);
            }
            
            @Override
            public void f() {
                y0.a.this.a(this);
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
