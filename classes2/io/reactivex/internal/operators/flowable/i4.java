// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.disposables.h;
import o7.d;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.q;
import io.reactivex.subscribers.e;
import o7.c;
import io.reactivex.l;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;

public final class i4<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final long I;
    final TimeUnit J;
    final j0 K;
    
    public i4(final l<T> l, final long i, final TimeUnit j, final j0 k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)new e((o7.c<? super Object>)c), this.I, this.J, this.K.c()));
    }
    
    static final class a<T> extends AtomicLong implements q<T>, d, Runnable
    {
        private static final long O = -9102637559663639004L;
        final c<? super T> G;
        final long H;
        final TimeUnit I;
        final j0.c J;
        d K;
        final io.reactivex.internal.disposables.h L;
        volatile boolean M;
        boolean N;
        
        a(final c<? super T> g, final long h, final TimeUnit i, final j0.c j) {
            this.L = new io.reactivex.internal.disposables.h();
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        public void b(final Throwable t) {
            if (this.N) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.N = true;
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
            this.G.f();
            this.J.dispose();
        }
        
        public void m(final T t) {
            if (this.N) {
                return;
            }
            if (!this.M) {
                this.M = true;
                if (this.get() != 0L) {
                    this.G.m((Object)t);
                    io.reactivex.internal.util.d.e(this, 1L);
                    final io.reactivex.disposables.c c = this.L.get();
                    if (c != null) {
                        c.dispose();
                    }
                    this.L.a(this.J.c(this, this.H, this.I));
                }
                else {
                    this.N = true;
                    this.cancel();
                    this.G.b((Throwable)new io.reactivex.exceptions.c("Could not deliver value due to lack of requests"));
                }
            }
        }
        
        public void run() {
            this.M = false;
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this, n);
            }
        }
        
        @Override
        public void z(final d k) {
            if (j.o(this.K, k)) {
                this.K = k;
                this.G.z((d)this);
                k.v(Long.MAX_VALUE);
            }
        }
    }
}
