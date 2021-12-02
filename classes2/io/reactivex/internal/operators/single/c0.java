// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.n0;
import o7.c;
import o7.b;
import x5.o;
import io.reactivex.q0;
import io.reactivex.l;

public final class c0<T, R> extends l<R>
{
    final q0<T> H;
    final o<? super T, ? extends b<? extends R>> I;
    
    public c0(final q0<T> h, final o<? super T, ? extends b<? extends R>> i) {
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        this.H.c(new a<Object, Object>(c, this.I));
    }
    
    static final class a<S, T> extends AtomicLong implements n0<S>, q<T>, d
    {
        private static final long K = 7759721921468635667L;
        final c<? super T> G;
        final o<? super S, ? extends b<? extends T>> H;
        final AtomicReference<d> I;
        io.reactivex.disposables.c J;
        
        a(final c<? super T> g, final o<? super S, ? extends b<? extends T>> h) {
            this.G = g;
            this.H = h;
            this.I = new AtomicReference<d>();
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            this.J.dispose();
            j.b(this.I);
        }
        
        @Override
        public void d(final S n) {
            try {
                io.reactivex.internal.functions.b.g((b)this.H.apply((Object)n), "the mapper returned a null Publisher").e((c)this);
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.G.b(t);
            }
        }
        
        public void f() {
            this.G.f();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c j) {
            this.J = j;
            this.G.z((d)this);
        }
        
        public void m(final T t) {
            this.G.m((Object)t);
        }
        
        public void v(final long n) {
            j.d(this.I, this, n);
        }
        
        @Override
        public void z(final d d) {
            j.f(this.I, this, d);
        }
    }
}
