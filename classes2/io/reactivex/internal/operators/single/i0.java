// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.disposables.d;
import io.reactivex.n0;
import io.reactivex.k0;

public final class i0<T> extends k0<T>
{
    final T G;
    
    public i0(final T g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        n0.l(d.a());
        n0.d(this.G);
    }
}
