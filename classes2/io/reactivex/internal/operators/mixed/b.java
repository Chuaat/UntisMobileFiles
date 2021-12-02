// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.q;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.f;
import o7.c;
import io.reactivex.i;
import io.reactivex.l;

public final class b<R> extends l<R>
{
    final i H;
    final o7.b<? extends R> I;
    
    public b(final i h, final o7.b<? extends R> i) {
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        this.H.c(new a<Object>(c, this.I));
    }
    
    static final class a<R> extends AtomicReference<d> implements q<R>, f, d
    {
        private static final long K = -8948264376121066672L;
        final c<? super R> G;
        o7.b<? extends R> H;
        io.reactivex.disposables.c I;
        final AtomicLong J;
        
        a(final c<? super R> g, final o7.b<? extends R> h) {
            this.G = g;
            this.H = h;
            this.J = new AtomicLong();
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            this.I.dispose();
            j.b(this);
        }
        
        @Override
        public void f() {
            final o7.b<? extends R> h = this.H;
            if (h == null) {
                this.G.f();
            }
            else {
                this.H = null;
                h.e((c)this);
            }
        }
        
        @Override
        public void l(final io.reactivex.disposables.c i) {
            if (io.reactivex.internal.disposables.d.l(this.I, i)) {
                this.I = i;
                this.G.z((d)this);
            }
        }
        
        public void m(final R r) {
            this.G.m((Object)r);
        }
        
        public void v(final long n) {
            j.d(this, this.J, n);
        }
        
        @Override
        public void z(final d d) {
            j.f(this, this.J, d);
        }
    }
}
