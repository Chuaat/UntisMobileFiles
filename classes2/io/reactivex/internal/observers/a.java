// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import y5.j;
import io.reactivex.i0;

public abstract class a<T, R> implements i0<T>, j<R>
{
    protected final i0<? super R> G;
    protected c H;
    protected j<T> I;
    protected boolean J;
    protected int K;
    
    public a(final i0<? super R> g) {
        this.G = g;
    }
    
    protected void a() {
    }
    
    @Override
    public void b(final Throwable t) {
        if (this.J) {
            io.reactivex.plugins.a.Y(t);
            return;
        }
        this.J = true;
        this.G.b(t);
    }
    
    protected boolean c() {
        return true;
    }
    
    @Override
    public void clear() {
        this.I.clear();
    }
    
    protected final void d(final Throwable t) {
        b.b(t);
        this.H.dispose();
        this.b(t);
    }
    
    @Override
    public void dispose() {
        this.H.dispose();
    }
    
    protected final int e(int e) {
        final j<T> i = this.I;
        if (i != null && (e & 0x4) == 0x0) {
            e = i.E(e);
            if (e != 0) {
                this.K = e;
            }
            return e;
        }
        return 0;
    }
    
    @Override
    public void f() {
        if (this.J) {
            return;
        }
        this.J = true;
        this.G.f();
    }
    
    @Override
    public boolean i() {
        return this.H.i();
    }
    
    @Override
    public boolean isEmpty() {
        return this.I.isEmpty();
    }
    
    @Override
    public final void l(final c h) {
        if (d.l(this.H, h)) {
            this.H = h;
            if (h instanceof j) {
                this.I = (j<T>)h;
            }
            if (this.c()) {
                this.G.l(this);
                this.a();
            }
        }
    }
    
    @Override
    public final boolean offer(final R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    @Override
    public final boolean p(final R r, final R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
