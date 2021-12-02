// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;
import o7.b;
import o7.c;
import io.reactivex.l;
import io.reactivex.j0;

public final class x3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final j0 I;
    final boolean J;
    
    public x3(final l<T> l, final j0 i, final boolean j) {
        super(l);
        this.I = i;
        this.J = j;
    }
    
    public void n6(final c<? super T> c) {
        final j0.c c2 = this.I.c();
        final a a = new a<Object>(c, c2, (o7.b<?>)super.H, this.J);
        c.z((d)a);
        c2.b(a);
    }
    
    static final class a<T> extends AtomicReference<Thread> implements q<T>, d, Runnable
    {
        private static final long M = 8094547886072529208L;
        final c<? super T> G;
        final j0.c H;
        final AtomicReference<d> I;
        final AtomicLong J;
        final boolean K;
        b<T> L;
        
        a(final c<? super T> g, final j0.c h, final b<T> l, final boolean b) {
            this.G = g;
            this.H = h;
            this.L = l;
            this.I = new AtomicReference<d>();
            this.J = new AtomicLong();
            this.K = (b ^ true);
        }
        
        void a(final long n, final d d) {
            if (!this.K && Thread.currentThread() != this.get()) {
                this.H.b(new x3.a.a(d, n));
            }
            else {
                d.v(n);
            }
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
            this.H.dispose();
        }
        
        public void cancel() {
            j.b(this.I);
            this.H.dispose();
        }
        
        public void f() {
            this.G.f();
            this.H.dispose();
        }
        
        public void m(final T t) {
            this.G.m((Object)t);
        }
        
        public void run() {
            this.lazySet(Thread.currentThread());
            final b<T> l = this.L;
            this.L = null;
            l.e((c)this);
        }
        
        public void v(long andSet) {
            if (j.m(andSet)) {
                final d d = this.I.get();
                if (d != null) {
                    this.a(andSet, d);
                }
                else {
                    io.reactivex.internal.util.d.a(this.J, andSet);
                    final d d2 = this.I.get();
                    if (d2 != null) {
                        andSet = this.J.getAndSet(0L);
                        if (andSet != 0L) {
                            this.a(andSet, d2);
                        }
                    }
                }
            }
        }
        
        @Override
        public void z(final d d) {
            if (j.k(this.I, d)) {
                final long andSet = this.J.getAndSet(0L);
                if (andSet != 0L) {
                    this.a(andSet, d);
                }
            }
        }
        
        static final class a implements Runnable
        {
            final d G;
            final long H;
            
            a(final d g, final long h) {
                this.G = g;
                this.H = h;
            }
            
            @Override
            public void run() {
                this.G.v(this.H);
            }
        }
    }
}
