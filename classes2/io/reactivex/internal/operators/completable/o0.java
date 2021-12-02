// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.f;
import io.reactivex.internal.observers.a0;
import o7.c;
import io.reactivex.i;
import io.reactivex.l;

public final class o0<T> extends l<T>
{
    final i H;
    
    public o0(final i h) {
        this.H = h;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        this.H.c(new a0<Object>(c));
    }
}
