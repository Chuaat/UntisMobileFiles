// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.observers.m;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class u3<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final long H;
    final TimeUnit I;
    final j0 J;
    
    public u3(final g0<T> g0, final long h, final TimeUnit i, final j0 j) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>(new m<Object>((i0<? super T>)i0), this.H, this.I, this.J.c()));
    }
    
    static final class a<T> extends AtomicReference<c> implements i0<T>, c, Runnable
    {
        private static final long N = 786994795061867455L;
        final i0<? super T> G;
        final long H;
        final TimeUnit I;
        final j0.c J;
        c K;
        volatile boolean L;
        boolean M;
        
        a(final i0<? super T> g, final long h, final TimeUnit i, final j0.c j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.M) {
                io.reactivex.plugins.a.Y(t);
            }
            else {
                this.M = true;
                this.G.b(t);
                this.J.dispose();
            }
        }
        
        @Override
        public void dispose() {
            this.K.dispose();
            this.J.dispose();
        }
        
        @Override
        public void f() {
            if (!this.M) {
                this.M = true;
                this.G.f();
                this.J.dispose();
            }
        }
        
        @Override
        public boolean i() {
            return this.J.i();
        }
        
        @Override
        public void l(final c k) {
            if (d.l(this.K, k)) {
                this.K = k;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (!this.L && !this.M) {
                this.L = true;
                this.G.m((Object)t);
                final c c = this.get();
                if (c != null) {
                    c.dispose();
                }
                d.f(this, this.J.c(this, this.H, this.I));
            }
        }
        
        @Override
        public void run() {
            this.L = false;
        }
    }
}
