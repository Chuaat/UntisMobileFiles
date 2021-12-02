// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.n0;
import io.reactivex.q0;
import io.reactivex.k0;

public final class f0<T> extends k0<T>
{
    final q0<T> G;
    
    public f0(final q0<T> g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(n0);
    }
}
