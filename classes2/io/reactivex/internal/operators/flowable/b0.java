// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import io.reactivex.internal.subscribers.t;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import io.reactivex.y;

public final class b0<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final y<? extends T> I;
    
    public b0(final l<T> l, final y<? extends T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a((o7.c<? super Object>)c, this.I));
    }
    
    static final class a<T> extends t<T, T> implements v<T>
    {
        private static final long Q = -7346385463600070225L;
        final AtomicReference<io.reactivex.disposables.c> N;
        y<? extends T> O;
        boolean P;
        
        a(final c<? super T> c, final y<? extends T> o) {
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
        
        @Override
        public void f() {
            if (this.P) {
                super.G.f();
            }
            else {
                this.P = true;
                super.H = (o7.d)j.G;
                final y<? extends T> o = this.O;
                this.O = null;
                o.c(this);
            }
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
