// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.q;
import io.reactivex.subscribers.e;
import o7.c;
import io.reactivex.l;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class h0<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final long I;
    final TimeUnit J;
    final j0 K;
    
    public h0(final l<T> l, final long i, final TimeUnit j, final j0 k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new b<Object>((o7.c<? super T>)new e((o7.c<? super Object>)c), this.I, this.J, this.K.c()));
    }
    
    static final class a<T> extends AtomicReference<c> implements Runnable, c
    {
        private static final long K = 6812032969491025141L;
        final T G;
        final long H;
        final b<T> I;
        final AtomicBoolean J;
        
        a(final T g, final long h, final b<T> i) {
            this.J = new AtomicBoolean();
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        void a() {
            if (this.J.compareAndSet(false, true)) {
                this.I.a(this.H, this.G, this);
            }
        }
        
        public void b(final c c) {
            d.f(this, c);
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public boolean i() {
            return this.get() == d.G;
        }
        
        @Override
        public void run() {
            this.a();
        }
    }
    
    static final class b<T> extends AtomicLong implements q<T>, o7.d
    {
        private static final long O = -9102637559663639004L;
        final c<? super T> G;
        final long H;
        final TimeUnit I;
        final j0.c J;
        o7.d K;
        io.reactivex.disposables.c L;
        volatile long M;
        boolean N;
        
        b(final c<? super T> g, final long h, final TimeUnit i, final j0.c j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        void a(final long n, final T t, final a<T> a) {
            if (n == this.M) {
                if (this.get() != 0L) {
                    this.G.m((Object)t);
                    io.reactivex.internal.util.d.e(this, 1L);
                    a.dispose();
                }
                else {
                    this.cancel();
                    this.G.b((Throwable)new io.reactivex.exceptions.c("Could not deliver value due to lack of requests"));
                }
            }
        }
        
        public void b(final Throwable t) {
            if (this.N) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.N = true;
            final io.reactivex.disposables.c l = this.L;
            if (l != null) {
                l.dispose();
            }
            this.G.b(t);
            this.J.dispose();
        }
        
        public void cancel() {
            this.K.cancel();
            this.J.dispose();
        }
        
        public void f() {
            if (this.N) {
                return;
            }
            this.N = true;
            final io.reactivex.disposables.c l = this.L;
            if (l != null) {
                l.dispose();
            }
            final a a = (a)l;
            if (a != null) {
                a.a();
            }
            this.G.f();
            this.J.dispose();
        }
        
        public void m(final T t) {
            if (this.N) {
                return;
            }
            final long m = this.M + 1L;
            this.M = m;
            final io.reactivex.disposables.c l = this.L;
            if (l != null) {
                l.dispose();
            }
            final a i = new a(t, m, (b)this);
            ((a)(this.L = i)).b(this.J.c(i, this.H, this.I));
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this, n);
            }
        }
        
        @Override
        public void z(final o7.d k) {
            if (j.o(this.K, k)) {
                this.K = k;
                this.G.z((o7.d)this);
                k.v(Long.MAX_VALUE);
            }
        }
    }
}
