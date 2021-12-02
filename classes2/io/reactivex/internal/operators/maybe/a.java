// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.y;
import y5.f;
import io.reactivex.s;

abstract class a<T, R> extends s<R> implements f<T>
{
    protected final y<T> G;
    
    a(final y<T> g) {
        this.G = g;
    }
    
    @Override
    public final y<T> source() {
        return this.G;
    }
}
