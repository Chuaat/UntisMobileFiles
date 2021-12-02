// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.internal.util.v;
import y5.j;
import io.reactivex.internal.disposables.d;
import y5.o;
import io.reactivex.i0;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class s<T> extends AtomicReference<c> implements i0<T>, c
{
    private static final long L = -5417183359794346637L;
    final t<T> G;
    final int H;
    o<T> I;
    volatile boolean J;
    int K;
    
    public s(final t<T> g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    public int a() {
        return this.K;
    }
    
    @Override
    public void b(final Throwable t) {
        this.G.d(this, t);
    }
    
    public boolean c() {
        return this.J;
    }
    
    public o<T> d() {
        return this.I;
    }
    
    @Override
    public void dispose() {
        d.b(this);
    }
    
    public void e() {
        this.J = true;
    }
    
    @Override
    public void f() {
        this.G.e(this);
    }
    
    @Override
    public boolean i() {
        return d.d(this.get());
    }
    
    @Override
    public void l(final c c) {
        if (d.j(this, c)) {
            if (c instanceof j) {
                final j j = (j)c;
                final int e = j.E(3);
                if (e == 1) {
                    this.K = e;
                    this.I = (o<T>)j;
                    this.J = true;
                    this.G.e(this);
                    return;
                }
                if (e == 2) {
                    this.K = e;
                    this.I = (o<T>)j;
                    return;
                }
            }
            this.I = v.c(-this.H);
        }
    }
    
    @Override
    public void m(final T t) {
        if (this.K == 0) {
            this.G.g(this, t);
        }
        else {
            this.G.c();
        }
    }
}
