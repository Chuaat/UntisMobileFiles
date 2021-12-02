// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.f;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import io.reactivex.i;

public final class a0<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final i I;
    
    public a0(final l<T> l, final i i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I));
    }
    
    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements q<T>, f, d
    {
        private static final long K = -7346385463600070225L;
        final c<? super T> G;
        d H;
        i I;
        boolean J;
        
        a(final c<? super T> g, final i i) {
            this.G = g;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            this.H.cancel();
            io.reactivex.internal.disposables.d.b(this);
        }
        
        @Override
        public void f() {
            if (this.J) {
                this.G.f();
            }
            else {
                this.J = true;
                this.H = (d)j.G;
                final i i = this.I;
                this.I = null;
                i.c(this);
            }
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            io.reactivex.internal.disposables.d.j(this, c);
        }
        
        public void m(final T t) {
            this.G.m((Object)t);
        }
        
        public void v(final long n) {
            this.H.v(n);
        }
        
        @Override
        public void z(final d h) {
            if (j.o(this.H, h)) {
                this.H = h;
                this.G.z((d)this);
            }
        }
    }
}
