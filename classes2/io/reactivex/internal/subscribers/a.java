// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

import o7.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.exceptions.b;
import o7.d;
import y5.l;

public abstract class a<T, R> implements y5.a<T>, l<R>
{
    protected final y5.a<? super R> G;
    protected d H;
    protected l<T> I;
    protected boolean J;
    protected int K;
    
    public a(final y5.a<? super R> g) {
        this.G = g;
    }
    
    protected void a() {
    }
    
    public void b(final Throwable t) {
        if (this.J) {
            io.reactivex.plugins.a.Y(t);
            return;
        }
        this.J = true;
        ((c)this.G).b(t);
    }
    
    protected boolean c() {
        return true;
    }
    
    public void cancel() {
        this.H.cancel();
    }
    
    public void clear() {
        this.I.clear();
    }
    
    protected final void d(final Throwable t) {
        b.b(t);
        this.H.cancel();
        this.b(t);
    }
    
    protected final int e(int e) {
        final l<T> i = this.I;
        if (i != null && (e & 0x4) == 0x0) {
            e = i.E(e);
            if (e != 0) {
                this.K = e;
            }
            return e;
        }
        return 0;
    }
    
    public void f() {
        if (this.J) {
            return;
        }
        this.J = true;
        ((c)this.G).f();
    }
    
    public boolean isEmpty() {
        return this.I.isEmpty();
    }
    
    public final boolean offer(final R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    public final boolean p(final R r, final R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    public void v(final long n) {
        this.H.v(n);
    }
    
    @Override
    public final void z(final d h) {
        if (j.o(this.H, h)) {
            this.H = h;
            if (h instanceof l) {
                this.I = (l<T>)h;
            }
            if (this.c()) {
                this.G.z((d)this);
                this.a();
            }
        }
    }
}
