// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.schedulers.s;
import o7.d;
import o7.c;
import java.util.concurrent.TimeUnit;
import io.reactivex.j0;
import io.reactivex.l;

public final class u1 extends l<Long>
{
    final j0 H;
    final long I;
    final long J;
    final long K;
    final long L;
    final TimeUnit M;
    
    public u1(final long i, final long j, final long k, final long l, final TimeUnit m, final j0 h) {
        this.K = k;
        this.L = l;
        this.M = m;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void n6(final c<? super Long> c) {
        final a a = new a(c, this.I, this.J);
        c.z((d)a);
        final j0 h = this.H;
        if (h instanceof s) {
            final j0.c c2 = h.c();
            a.a(c2);
            c2.d(a, this.K, this.L, this.M);
        }
        else {
            a.a(h.g(a, this.K, this.L, this.M));
        }
    }
    
    static final class a extends AtomicLong implements d, Runnable
    {
        private static final long K = -2809475196591179431L;
        final c<? super Long> G;
        final long H;
        long I;
        final AtomicReference<io.reactivex.disposables.c> J;
        
        a(final c<? super Long> g, final long i, final long h) {
            this.J = new AtomicReference<io.reactivex.disposables.c>();
            this.G = g;
            this.I = i;
            this.H = h;
        }
        
        public void a(final io.reactivex.disposables.c c) {
            io.reactivex.internal.disposables.d.j(this.J, c);
        }
        
        public void cancel() {
            io.reactivex.internal.disposables.d.b(this.J);
        }
        
        public void run() {
            final io.reactivex.internal.disposables.d value = this.J.get();
            final io.reactivex.internal.disposables.d g = io.reactivex.internal.disposables.d.G;
            if (value != g) {
                final long value2 = this.get();
                if (value2 != 0L) {
                    final long i = this.I;
                    this.G.m((Object)i);
                    if (i == this.H) {
                        if (this.J.get() != g) {
                            this.G.f();
                        }
                        io.reactivex.internal.disposables.d.b(this.J);
                        return;
                    }
                    this.I = i + 1L;
                    if (value2 != Long.MAX_VALUE) {
                        this.decrementAndGet();
                    }
                }
                else {
                    final c<? super Long> g2 = this.G;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't deliver value ");
                    sb.append(this.I);
                    sb.append(" due to lack of requests");
                    g2.b((Throwable)new io.reactivex.exceptions.c(sb.toString()));
                    io.reactivex.internal.disposables.d.b(this.J);
                }
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this, n);
            }
        }
    }
}
