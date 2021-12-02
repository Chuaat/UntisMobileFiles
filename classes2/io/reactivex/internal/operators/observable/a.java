// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.g0;
import y5.g;
import io.reactivex.b0;

abstract class a<T, U> extends b0<U> implements g<T>
{
    protected final g0<T> G;
    
    a(final g0<T> g) {
        this.G = g;
    }
    
    @Override
    public final g0<T> source() {
        return this.G;
    }
}
