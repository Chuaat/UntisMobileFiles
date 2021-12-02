// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.d;
import io.reactivex.v;
import y5.m;
import io.reactivex.s;

public final class t0<T> extends s<T> implements m<T>
{
    final T G;
    
    public t0(final T g) {
        this.G = g;
    }
    
    @Override
    public T call() {
        return this.G;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        v.l(d.a());
        v.d(this.G);
    }
}
