// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.f;
import io.reactivex.q;
import o7.d;
import o7.c;
import io.reactivex.l;
import io.reactivex.i;

public final class f2<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final i I;
    
    public f2(final l<T> l, final i i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        final a a = new a((c<? super T>)c);
        c.z((d)a);
        super.H.m6(a);
        this.I.c(a.I);
    }
    
    static final class a<T> extends AtomicInteger implements q<T>, d
    {
        private static final long N = -4592979584110982903L;
        final c<? super T> G;
        final AtomicReference<d> H;
        final f2.a.a I;
        final io.reactivex.internal.util.c J;
        final AtomicLong K;
        volatile boolean L;
        volatile boolean M;
        
        a(final c<? super T> g) {
            this.G = g;
            this.H = new AtomicReference<d>();
            this.I = new f2.a.a(this);
            this.J = new io.reactivex.internal.util.c();
            this.K = new AtomicLong();
        }
        
        void a() {
            this.M = true;
            if (this.L) {
                io.reactivex.internal.util.l.b(this.G, this, this.J);
            }
        }
        
        public void b(final Throwable t) {
            j.b(this.H);
            io.reactivex.internal.util.l.d(this.G, t, this, this.J);
        }
        
        void c(final Throwable t) {
            j.b(this.H);
            io.reactivex.internal.util.l.d(this.G, t, this, this.J);
        }
        
        public void cancel() {
            j.b(this.H);
            io.reactivex.internal.disposables.d.b(this.I);
        }
        
        public void f() {
            this.L = true;
            if (this.M) {
                io.reactivex.internal.util.l.b(this.G, this, this.J);
            }
        }
        
        public void m(final T t) {
            io.reactivex.internal.util.l.f(this.G, t, this, this.J);
        }
        
        public void v(final long n) {
            j.d(this.H, this.K, n);
        }
        
        @Override
        public void z(final d d) {
            j.f(this.H, this.K, d);
        }
        
        static final class a extends AtomicReference<io.reactivex.disposables.c> implements f
        {
            private static final long H = -2935427570954647017L;
            final f2.a<?> G;
            
            a(final f2.a<?> g) {
                this.G = g;
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.c(t);
            }
            
            @Override
            public void f() {
                this.G.a();
            }
            
            @Override
            public void l(final io.reactivex.disposables.c c) {
                io.reactivex.internal.disposables.d.j(this, c);
            }
        }
    }
}
