// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import io.reactivex.j0;

public final class q4<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final j0 I;
    
    public q4(final l<T> l, final j0 i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I));
    }
    
    static final class a<T> extends AtomicBoolean implements q<T>, d
    {
        private static final long J = 1015244841293359600L;
        final c<? super T> G;
        final j0 H;
        d I;
        
        a(final c<? super T> g, final j0 h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.get()) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.G.b(t);
        }
        
        public void cancel() {
            if (this.compareAndSet(false, true)) {
                this.H.e(new q4.a.a());
            }
        }
        
        public void f() {
            if (!this.get()) {
                this.G.f();
            }
        }
        
        public void m(final T t) {
            if (!this.get()) {
                this.G.m((Object)t);
            }
        }
        
        public void v(final long n) {
            this.I.v(n);
        }
        
        @Override
        public void z(final d i) {
            if (j.o(this.I, i)) {
                this.I = i;
                this.G.z((d)this);
            }
        }
        
        final class a implements Runnable
        {
            @Override
            public void run() {
                q4.a.this.I.cancel();
            }
        }
    }
}
