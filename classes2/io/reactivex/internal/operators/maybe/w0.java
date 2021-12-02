// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.v;
import io.reactivex.internal.operators.mixed.i;
import io.reactivex.n0;
import io.reactivex.s;
import io.reactivex.annotations.e;
import io.reactivex.a0;
import io.reactivex.k0;

@e
public final class w0<T> extends k0<a0<T>>
{
    final s<T> G;
    
    public w0(final s<T> g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super a0<T>> n0) {
        this.G.c(new i<Object>((n0<? super a0<? super T>>)n0));
    }
}
