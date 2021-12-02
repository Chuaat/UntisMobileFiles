// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import o7.c;
import o7.d;
import io.reactivex.f;

public final class a0<T> implements f, d
{
    final c<? super T> G;
    io.reactivex.disposables.c H;
    
    public a0(final c<? super T> g) {
        this.G = g;
    }
    
    @Override
    public void b(final Throwable t) {
        this.G.b(t);
    }
    
    public void cancel() {
        this.H.dispose();
    }
    
    @Override
    public void f() {
        this.G.f();
    }
    
    @Override
    public void l(final io.reactivex.disposables.c h) {
        if (io.reactivex.internal.disposables.d.l(this.H, h)) {
            this.H = h;
            this.G.z((d)this);
        }
    }
    
    public void v(final long n) {
    }
}
