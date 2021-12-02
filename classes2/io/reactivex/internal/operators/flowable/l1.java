// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import o7.c;
import o7.b;
import io.reactivex.l;

public final class l1<T> extends l<T>
{
    final b<? extends T> H;
    
    public l1(final b<? extends T> h) {
        this.H = h;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        this.H.e((c)c);
    }
}
