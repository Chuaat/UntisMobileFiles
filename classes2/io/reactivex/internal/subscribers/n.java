// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

import io.reactivex.internal.util.d;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.v;
import o7.c;
import io.reactivex.internal.util.u;
import io.reactivex.q;

public abstract class n<T, U, V> extends r implements q<T>, u<U, V>
{
    protected final c<? super V> B0;
    protected final y5.n<U> C0;
    protected volatile boolean D0;
    protected volatile boolean E0;
    protected Throwable F0;
    
    public n(final c<? super V> b0, final y5.n<U> c0) {
        this.B0 = b0;
        this.C0 = c0;
    }
    
    @Override
    public final boolean a() {
        return this.E0;
    }
    
    @Override
    public final Throwable c() {
        return this.F0;
    }
    
    @Override
    public final long d() {
        return super.l0.get();
    }
    
    @Override
    public final boolean e() {
        return super.V.getAndIncrement() == 0;
    }
    
    @Override
    public final boolean g() {
        return this.D0;
    }
    
    @Override
    public final int h(final int delta) {
        return super.V.addAndGet(delta);
    }
    
    @Override
    public boolean j(final c<? super V> c, final U u) {
        return false;
    }
    
    @Override
    public final long k(final long n) {
        return super.l0.addAndGet(-n);
    }
    
    public final boolean l() {
        final int value = super.V.get();
        boolean b = true;
        if (value != 0 || !super.V.compareAndSet(0, 1)) {
            b = false;
        }
        return b;
    }
    
    protected final void n(final U u, final boolean b, final io.reactivex.disposables.c c) {
        final c<? super V> b2 = this.B0;
        final y5.n<U> c2 = this.C0;
        if (this.l()) {
            final long value = super.l0.get();
            if (value == 0L) {
                c.dispose();
                b2.b((Throwable)new io.reactivex.exceptions.c("Could not emit buffer due to lack of requests"));
                return;
            }
            if (this.j(b2, u) && value != Long.MAX_VALUE) {
                this.k(1L);
            }
            if (this.h(-1) == 0) {
                return;
            }
        }
        else {
            c2.offer(u);
            if (!this.e()) {
                return;
            }
        }
        v.e(c2, (o7.c<? super Object>)b2, b, c, (u<U, Object>)this);
    }
    
    protected final void o(final U u, final boolean b, final io.reactivex.disposables.c c) {
        final c<? super V> b2 = this.B0;
        final y5.n<U> c2 = this.C0;
        if (this.l()) {
            final long value = super.l0.get();
            if (value == 0L) {
                this.D0 = true;
                c.dispose();
                b2.b((Throwable)new io.reactivex.exceptions.c("Could not emit buffer due to lack of requests"));
                return;
            }
            if (c2.isEmpty()) {
                if (this.j(b2, u) && value != Long.MAX_VALUE) {
                    this.k(1L);
                }
                if (this.h(-1) == 0) {
                    return;
                }
            }
            else {
                c2.offer(u);
            }
        }
        else {
            c2.offer(u);
            if (!this.e()) {
                return;
            }
        }
        v.e(c2, (o7.c<? super Object>)b2, b, c, (u<U, Object>)this);
    }
    
    public final void p(final long n) {
        if (j.m(n)) {
            d.a(super.l0, n);
        }
    }
}
