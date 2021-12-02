// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import java.util.concurrent.TimeUnit;
import io.reactivex.j0;
import io.reactivex.schedulers.d;

public final class k4<T> extends io.reactivex.internal.operators.flowable.a<T, d<T>>
{
    final j0 I;
    final TimeUnit J;
    
    public k4(final l<T> l, final TimeUnit j, final j0 i) {
        super(l);
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void n6(final c<? super d<T>> c) {
        super.H.m6(new a<Object>((o7.c<? super d<? super T>>)c, this.J, this.I));
    }
    
    static final class a<T> implements q<T>, o7.d
    {
        final c<? super d<T>> G;
        final TimeUnit H;
        final j0 I;
        o7.d J;
        long K;
        
        a(final c<? super d<T>> g, final TimeUnit h, final j0 i) {
            this.G = g;
            this.I = i;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            this.J.cancel();
        }
        
        public void f() {
            this.G.f();
        }
        
        public void m(final T t) {
            final long d = this.I.d(this.H);
            final long k = this.K;
            this.K = d;
            this.G.m((Object)new d(t, d - k, this.H));
        }
        
        public void v(final long n) {
            this.J.v(n);
        }
        
        @Override
        public void z(final o7.d j) {
            if (j.o(this.J, j)) {
                this.K = this.I.d(this.H);
                this.J = j;
                this.G.z((o7.d)this);
            }
        }
    }
}
