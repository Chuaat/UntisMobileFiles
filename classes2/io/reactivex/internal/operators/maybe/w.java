// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.d;
import io.reactivex.v;
import io.reactivex.s;

public final class w<T> extends s<T>
{
    final Throwable G;
    
    public w(final Throwable g) {
        this.G = g;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        v.l(d.a());
        v.b(this.G);
    }
}
