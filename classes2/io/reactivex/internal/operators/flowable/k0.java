// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.plugins.a;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import o7.c;
import o7.b;
import io.reactivex.l;

public final class k0<T, U> extends l<T>
{
    final b<? extends T> H;
    final b<U> I;
    
    public k0(final b<? extends T> h, final b<U> i) {
        this.H = h;
        this.I = i;
    }
    
    public void n6(final c<? super T> c) {
        final a a = new a((c<? super T>)c, (b<? extends T>)this.H);
        c.z((d)a);
        this.I.e((c)a.I);
    }
    
    static final class a<T> extends AtomicLong implements q<T>, d
    {
        private static final long K = 2259811067697317255L;
        final c<? super T> G;
        final b<? extends T> H;
        final k0.a.a I;
        final AtomicReference<d> J;
        
        a(final c<? super T> g, final b<? extends T> h) {
            this.G = g;
            this.H = h;
            this.I = new k0.a.a();
            this.J = new AtomicReference<d>();
        }
        
        void a() {
            this.H.e((c)this);
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            j.b(this.I);
            j.b(this.J);
        }
        
        public void f() {
            this.G.f();
        }
        
        public void m(final T t) {
            this.G.m((Object)t);
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                j.d(this.J, this, n);
            }
        }
        
        @Override
        public void z(final d d) {
            j.f(this.J, this, d);
        }
        
        final class a extends AtomicReference<d> implements q<Object>
        {
            private static final long H = -3892798459447644106L;
            
            public void b(final Throwable t) {
                if ((d)this.get() != j.G) {
                    k0.a.this.G.b(t);
                }
                else {
                    io.reactivex.plugins.a.Y(t);
                }
            }
            
            public void f() {
                if ((d)this.get() != j.G) {
                    k0.a.this.a();
                }
            }
            
            public void m(final Object o) {
                final d d = this.get();
                final j g = j.G;
                if (d != g) {
                    this.lazySet((d)g);
                    d.cancel();
                    k0.a.this.a();
                }
            }
            
            @Override
            public void z(final d d) {
                if (j.k(this, d)) {
                    d.v(Long.MAX_VALUE);
                }
            }
        }
    }
}
