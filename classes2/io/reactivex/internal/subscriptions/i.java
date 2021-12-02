// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;

public class i extends AtomicInteger implements d
{
    private static final long O = -2189523197179400958L;
    d G;
    long H;
    final AtomicReference<d> I;
    final AtomicLong J;
    final AtomicLong K;
    final boolean L;
    volatile boolean M;
    protected boolean N;
    
    public i(final boolean l) {
        this.L = l;
        this.I = new AtomicReference<d>();
        this.J = new AtomicLong();
        this.K = new AtomicLong();
    }
    
    public void cancel() {
        if (!this.M) {
            this.M = true;
            this.d();
        }
    }
    
    final void d() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        this.e();
    }
    
    final void e() {
        int i = 1;
        d d = null;
        long n = 0L;
        long n4;
        d d2;
        do {
            d g;
            if ((g = this.I.get()) != null) {
                g = this.I.getAndSet(null);
            }
            long n2;
            if ((n2 = this.J.get()) != 0L) {
                n2 = this.J.getAndSet(0L);
            }
            long n3;
            if ((n3 = this.K.get()) != 0L) {
                n3 = this.K.getAndSet(0L);
            }
            final d g2 = this.G;
            if (this.M) {
                if (g2 != null) {
                    g2.cancel();
                    this.G = null;
                }
                n4 = n;
                d2 = d;
                if (g != null) {
                    g.cancel();
                    n4 = n;
                    d2 = d;
                }
            }
            else {
                long h;
                final long n5 = h = this.H;
                if (n5 != Long.MAX_VALUE) {
                    long c;
                    final long n6 = c = io.reactivex.internal.util.d.c(n5, n2);
                    if (n6 != Long.MAX_VALUE) {
                        final long n7 = c = n6 - n3;
                        if (n7 < 0L) {
                            j.h(n7);
                            c = 0L;
                        }
                    }
                    this.H = c;
                    h = c;
                }
                if (g != null) {
                    if (g2 != null && this.L) {
                        g2.cancel();
                    }
                    this.G = g;
                    n4 = n;
                    d2 = d;
                    if (h != 0L) {
                        n4 = io.reactivex.internal.util.d.c(n, h);
                        d2 = g;
                    }
                }
                else {
                    n4 = n;
                    d2 = d;
                    if (g2 != null) {
                        n4 = n;
                        d2 = d;
                        if (n2 != 0L) {
                            n4 = io.reactivex.internal.util.d.c(n, n2);
                            d2 = g2;
                        }
                    }
                }
            }
            i = this.addAndGet(-i);
            n = n4;
            d = d2;
        } while (i != 0);
        if (n4 != 0L) {
            d2.v(n4);
        }
    }
    
    public final boolean g() {
        return this.M;
    }
    
    public final boolean h() {
        return this.N;
    }
    
    public final void i(long h) {
        if (this.N) {
            return;
        }
        if (this.get() != 0 || !this.compareAndSet(0, 1)) {
            io.reactivex.internal.util.d.a(this.K, h);
            this.d();
            return;
        }
        final long h2 = this.H;
        if (h2 != Long.MAX_VALUE) {
            final long n = h = h2 - h;
            if (n < 0L) {
                j.h(n);
                h = 0L;
            }
            this.H = h;
        }
        if (this.decrementAndGet() == 0) {
            return;
        }
        this.e();
    }
    
    public final void j(d d) {
        if (this.M) {
            d.cancel();
            return;
        }
        b.g(d, "s is null");
        if (this.get() == 0 && this.compareAndSet(0, 1)) {
            final d g = this.G;
            if (g != null && this.L) {
                g.cancel();
            }
            this.G = d;
            final long h = this.H;
            if (this.decrementAndGet() != 0) {
                this.e();
            }
            if (h != 0L) {
                d.v(h);
            }
            return;
        }
        d = this.I.getAndSet(d);
        if (d != null && this.L) {
            d.cancel();
        }
        this.d();
    }
    
    public final void v(final long n) {
        if (j.m(n)) {
            if (this.N) {
                return;
            }
            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                final long h = this.H;
                if (h != Long.MAX_VALUE) {
                    final long c = io.reactivex.internal.util.d.c(h, n);
                    this.H = c;
                    if (c == Long.MAX_VALUE) {
                        this.N = true;
                    }
                }
                final d g = this.G;
                if (this.decrementAndGet() != 0) {
                    this.e();
                }
                if (g != null) {
                    g.v(n);
                }
                return;
            }
            io.reactivex.internal.util.d.a(this.J, n);
            this.d();
        }
    }
}
