// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.f;
import io.reactivex.internal.operators.mixed.i;
import io.reactivex.n0;
import io.reactivex.c;
import io.reactivex.annotations.e;
import io.reactivex.a0;
import io.reactivex.k0;

@e
public final class z<T> extends k0<a0<T>>
{
    final c G;
    
    public z(final c g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super a0<T>> n0) {
        this.G.c(new i<Object>((n0<? super a0<?>>)n0));
    }
}
