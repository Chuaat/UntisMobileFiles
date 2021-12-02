// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

import io.reactivex.internal.util.v;
import io.reactivex.internal.subscriptions.j;
import y5.o;
import io.reactivex.q;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;

public final class k<T> extends AtomicReference<d> implements q<T>, d
{
    private static final long N = 22876611072430776L;
    final l<T> G;
    final int H;
    final int I;
    volatile o<T> J;
    volatile boolean K;
    long L;
    int M;
    
    public k(final l<T> g, final int h) {
        this.G = g;
        this.H = h;
        this.I = h - (h >> 2);
    }
    
    public boolean a() {
        return this.K;
    }
    
    public void b(final Throwable t) {
        this.G.e(this, t);
    }
    
    public o<T> c() {
        return this.J;
    }
    
    public void cancel() {
        j.b(this);
    }
    
    public void d() {
        if (this.M != 1) {
            final long l = this.L + 1L;
            if (l == this.I) {
                this.L = 0L;
                this.get().v(l);
            }
            else {
                this.L = l;
            }
        }
    }
    
    public void e() {
        this.K = true;
    }
    
    public void f() {
        this.G.a(this);
    }
    
    public void m(final T t) {
        if (this.M == 0) {
            this.G.d(this, t);
        }
        else {
            this.G.c();
        }
    }
    
    public void v(long l) {
        if (this.M != 1) {
            l += this.L;
            if (l >= this.I) {
                this.L = 0L;
                this.get().v(l);
            }
            else {
                this.L = l;
            }
        }
    }
    
    @Override
    public void z(final d d) {
        if (j.k(this, d)) {
            if (d instanceof y5.l) {
                final y5.l l = (y5.l)d;
                final int e = l.E(3);
                if (e == 1) {
                    this.M = e;
                    this.J = (o<T>)l;
                    this.K = true;
                    this.G.a(this);
                    return;
                }
                if (e == 2) {
                    this.M = e;
                    this.J = (o<T>)l;
                    v.j(d, this.H);
                    return;
                }
            }
            this.J = v.c(this.H);
            v.j(d, this.H);
        }
    }
}
