// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import java.util.concurrent.TimeUnit;
import io.reactivex.j0;
import io.reactivex.schedulers.d;

public final class w3<T> extends io.reactivex.internal.operators.observable.a<T, d<T>>
{
    final j0 H;
    final TimeUnit I;
    
    public w3(final g0<T> g0, final TimeUnit i, final j0 h) {
        super(g0);
        this.H = h;
        this.I = i;
    }
    
    public void L5(final i0<? super d<T>> i0) {
        super.G.c(new a<Object>((i0<? super d<? super T>>)i0, this.I, this.H));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final i0<? super d<T>> G;
        final TimeUnit H;
        final j0 I;
        long J;
        c K;
        
        a(final i0<? super d<T>> g, final TimeUnit h, final j0 i) {
            this.G = g;
            this.I = i;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.K.dispose();
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.K.i();
        }
        
        @Override
        public void l(final c k) {
            if (io.reactivex.internal.disposables.d.l(this.K, k)) {
                this.K = k;
                this.J = this.I.d(this.H);
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            final long d = this.I.d(this.H);
            final long j = this.J;
            this.J = d;
            this.G.m((Object)new d(t, d - j, this.H));
        }
    }
}
