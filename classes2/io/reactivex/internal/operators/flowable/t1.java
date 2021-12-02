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

public final class t1 extends l<Long>
{
    final j0 H;
    final long I;
    final long J;
    final TimeUnit K;
    
    public t1(final long i, final long j, final TimeUnit k, final j0 h) {
        this.I = i;
        this.J = j;
        this.K = k;
        this.H = h;
    }
    
    public void n6(final c<? super Long> c) {
        final a a = new a(c);
        c.z((d)a);
        final j0 h = this.H;
        if (h instanceof s) {
            final j0.c c2 = h.c();
            a.a(c2);
            c2.d(a, this.I, this.J, this.K);
        }
        else {
            a.a(h.g(a, this.I, this.J, this.K));
        }
    }
    
    static final class a extends AtomicLong implements d, Runnable
    {
        private static final long J = -2809475196591179431L;
        final c<? super Long> G;
        long H;
        final AtomicReference<io.reactivex.disposables.c> I;
        
        a(final c<? super Long> g) {
            this.I = new AtomicReference<io.reactivex.disposables.c>();
            this.G = g;
        }
        
        public void a(final io.reactivex.disposables.c c) {
            io.reactivex.internal.disposables.d.j(this.I, c);
        }
        
        public void cancel() {
            io.reactivex.internal.disposables.d.b(this.I);
        }
        
        public void run() {
            if (this.I.get() != io.reactivex.internal.disposables.d.G) {
                final long value = this.get();
                final c<? super Long> g = this.G;
                if (value != 0L) {
                    g.m((Object)(this.H++));
                    io.reactivex.internal.util.d.e(this, 1L);
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't deliver value ");
                    sb.append(this.H);
                    sb.append(" due to lack of requests");
                    g.b((Throwable)new io.reactivex.exceptions.c(sb.toString()));
                    io.reactivex.internal.disposables.d.b(this.I);
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
