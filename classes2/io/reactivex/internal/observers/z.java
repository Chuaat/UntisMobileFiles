// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.n0;

public final class z<T> implements n0<T>
{
    final AtomicReference<c> G;
    final n0<? super T> H;
    
    public z(final AtomicReference<c> g, final n0<? super T> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public void b(final Throwable t) {
        this.H.b(t);
    }
    
    @Override
    public void d(final T t) {
        this.H.d((Object)t);
    }
    
    @Override
    public void l(final c c) {
        d.f(this.G, c);
    }
}
