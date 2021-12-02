// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import o7.d;
import io.reactivex.internal.subscriptions.h;
import o7.c;
import y5.m;
import io.reactivex.l;

public final class w1<T> extends l<T> implements m<T>
{
    private final T H;
    
    public w1(final T h) {
        this.H = h;
    }
    
    @Override
    public T call() {
        return this.H;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        c.z((d)new h((o7.c<? super Object>)c, this.H));
    }
}
