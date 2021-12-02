// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.n0;
import io.reactivex.internal.subscribers.t;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import io.reactivex.q0;

public final class c0<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final q0<? extends T> I;
    
    public c0(final l<T> l, final q0<? extends T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a((o7.c<? super Object>)c, this.I));
    }
    
    static final class a<T> extends t<T, T> implements n0<T>
    {
        private static final long P = -7346385463600070225L;
        final AtomicReference<io.reactivex.disposables.c> N;
        q0<? extends T> O;
        
        a(final c<? super T> c, final q0<? extends T> o) {
            super(c);
            this.O = o;
            this.N = new AtomicReference<io.reactivex.disposables.c>();
        }
        
        @Override
        public void b(final Throwable t) {
            super.G.b(t);
        }
        
        @Override
        public void cancel() {
            super.cancel();
            d.b(this.N);
        }
        
        @Override
        public void d(final T t) {
            this.a(t);
        }
        
        public void f() {
            super.H = (o7.d)j.G;
            final q0<? extends T> o = this.O;
            this.O = null;
            o.c(this);
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            d.j(this.N, c);
        }
        
        public void m(final T t) {
            ++super.J;
            super.G.m((Object)t);
        }
    }
}
