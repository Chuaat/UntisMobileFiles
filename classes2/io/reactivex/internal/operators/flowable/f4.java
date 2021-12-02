// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.d;
import o7.c;
import io.reactivex.l;
import o7.b;

public final class f4<T, U> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final b<? extends U> I;
    
    public f4(final l<T> l, final b<? extends U> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        final a a = new a((c<? super T>)c);
        c.z((d)a);
        this.I.e((c)a.K);
        super.H.m6(a);
    }
    
    static final class a<T> extends AtomicInteger implements q<T>, d
    {
        private static final long L = -4945480365982832967L;
        final c<? super T> G;
        final AtomicLong H;
        final AtomicReference<d> I;
        final io.reactivex.internal.util.c J;
        final f4.a.a K;
        
        a(final c<? super T> g) {
            this.G = g;
            this.H = new AtomicLong();
            this.I = new AtomicReference<d>();
            this.K = new f4.a.a();
            this.J = new io.reactivex.internal.util.c();
        }
        
        public void b(final Throwable t) {
            j.b(this.K);
            io.reactivex.internal.util.l.d(this.G, t, this, this.J);
        }
        
        public void cancel() {
            j.b(this.I);
            j.b(this.K);
        }
        
        public void f() {
            j.b(this.K);
            io.reactivex.internal.util.l.b(this.G, this, this.J);
        }
        
        public void m(final T t) {
            io.reactivex.internal.util.l.f(this.G, t, this, this.J);
        }
        
        public void v(final long n) {
            j.d(this.I, this.H, n);
        }
        
        @Override
        public void z(final d d) {
            j.f(this.I, this.H, d);
        }
        
        final class a extends AtomicReference<d> implements q<Object>
        {
            private static final long H = -3592821756711087922L;
            
            public void b(final Throwable t) {
                j.b(f4.a.this.I);
                final f4.a g = f4.a.this;
                io.reactivex.internal.util.l.d(g.G, t, g, g.J);
            }
            
            public void f() {
                j.b(f4.a.this.I);
                final f4.a g = f4.a.this;
                io.reactivex.internal.util.l.b(g.G, g, g.J);
            }
            
            public void m(final Object o) {
                j.b(this);
                this.f();
            }
            
            @Override
            public void z(final d d) {
                j.l(this, d, Long.MAX_VALUE);
            }
        }
    }
}
