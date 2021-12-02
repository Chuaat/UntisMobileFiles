// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.d;
import o7.c;
import io.reactivex.l;
import o7.b;

public final class v3<T, U> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final b<U> I;
    
    public v3(final l<T> l, final b<U> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        final a a = new a((c<? super T>)c);
        c.z((d)a);
        this.I.e((c)a.J);
        super.H.m6(a);
    }
    
    static final class a<T> extends AtomicInteger implements y5.a<T>, d
    {
        private static final long M = -6270983465606289181L;
        final c<? super T> G;
        final AtomicReference<d> H;
        final AtomicLong I;
        final v3.a.a J;
        final io.reactivex.internal.util.c K;
        volatile boolean L;
        
        a(final c<? super T> g) {
            this.G = g;
            this.H = new AtomicReference<d>();
            this.I = new AtomicLong();
            this.J = new v3.a.a();
            this.K = new io.reactivex.internal.util.c();
        }
        
        @Override
        public boolean B(final T t) {
            if (this.L) {
                io.reactivex.internal.util.l.f(this.G, t, this, this.K);
                return true;
            }
            return false;
        }
        
        public void b(final Throwable t) {
            j.b(this.J);
            io.reactivex.internal.util.l.d(this.G, t, this, this.K);
        }
        
        public void cancel() {
            j.b(this.H);
            j.b(this.J);
        }
        
        public void f() {
            j.b(this.J);
            io.reactivex.internal.util.l.b(this.G, this, this.K);
        }
        
        public void m(final T t) {
            if (!this.B(t)) {
                this.H.get().v(1L);
            }
        }
        
        public void v(final long n) {
            j.d(this.H, this.I, n);
        }
        
        public void z(final d d) {
            j.f(this.H, this.I, d);
        }
        
        final class a extends AtomicReference<d> implements q<Object>
        {
            private static final long H = -5592042965931999169L;
            
            public void b(final Throwable t) {
                j.b(v3.a.this.H);
                final v3.a g = v3.a.this;
                io.reactivex.internal.util.l.d(g.G, t, g, g.K);
            }
            
            public void f() {
                v3.a.this.L = true;
            }
            
            public void m(final Object o) {
                v3.a.this.L = true;
                this.get().cancel();
            }
            
            @Override
            public void z(final d d) {
                j.l(this, d, Long.MAX_VALUE);
            }
        }
    }
}
