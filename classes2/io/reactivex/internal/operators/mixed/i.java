// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.disposables.d;
import io.reactivex.a0;
import io.reactivex.annotations.e;
import io.reactivex.disposables.c;
import io.reactivex.f;
import io.reactivex.v;
import io.reactivex.n0;

@e
public final class i<T> implements n0<T>, v<T>, f, c
{
    final n0<? super a0<T>> G;
    c H;
    
    public i(final n0<? super a0<T>> g) {
        this.G = g;
    }
    
    @Override
    public void b(final Throwable t) {
        this.G.d((Object)a0.b(t));
    }
    
    @Override
    public void d(final T t) {
        this.G.d(a0.c(t));
    }
    
    @Override
    public void dispose() {
        this.H.dispose();
    }
    
    @Override
    public void f() {
        this.G.d((Object)a0.a());
    }
    
    @Override
    public boolean i() {
        return this.H.i();
    }
    
    @Override
    public void l(final c h) {
        if (d.l(this.H, h)) {
            this.H = h;
            this.G.l(this);
        }
    }
}
