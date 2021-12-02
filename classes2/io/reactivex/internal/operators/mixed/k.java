// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.q;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import o7.c;
import o7.b;
import x5.o;
import io.reactivex.y;
import io.reactivex.l;

public final class k<T, R> extends l<R>
{
    final y<T> H;
    final o<? super T, ? extends b<? extends R>> I;
    
    public k(final y<T> h, final o<? super T, ? extends b<? extends R>> i) {
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        this.H.c(new a<Object, Object>(c, this.I));
    }
    
    static final class a<T, R> extends AtomicReference<d> implements q<R>, v<T>, d
    {
        private static final long K = -8948264376121066672L;
        final c<? super R> G;
        final o<? super T, ? extends b<? extends R>> H;
        io.reactivex.disposables.c I;
        final AtomicLong J;
        
        a(final c<? super R> g, final o<? super T, ? extends b<? extends R>> h) {
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
        public void d(final T t) {
            try {
                io.reactivex.internal.functions.b.g((b)this.H.apply((Object)t), "The mapper returned a null Publisher").e((c)this);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.G.b(t2);
            }
        }
        
        @Override
        public void f() {
            this.G.f();
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
