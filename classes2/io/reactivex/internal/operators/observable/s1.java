// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.c;
import io.reactivex.i0;
import y5.m;
import io.reactivex.b0;

public final class s1<T> extends b0<T> implements m<T>
{
    private final T G;
    
    public s1(final T g) {
        this.G = g;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        final x2.a a = new x2.a((i0<? super Object>)i0, this.G);
        i0.l(a);
        a.run();
    }
    
    @Override
    public T call() {
        return this.G;
    }
}
