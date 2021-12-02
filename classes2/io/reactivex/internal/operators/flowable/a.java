// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.functions.b;
import y5.h;
import io.reactivex.l;

abstract class a<T, R> extends l<R> implements h<T>
{
    protected final l<T> H;
    
    a(final l<T> l) {
        this.H = b.g(l, "source is null");
    }
    
    @Override
    public final o7.b<T> source() {
        return (o7.b<T>)this.H;
    }
}
