// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;

public final class h1<T> extends b0<T>
{
    final g0<T> G;
    
    public h1(final g0<T> g) {
        this.G = g;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        this.G.c(i0);
    }
}
