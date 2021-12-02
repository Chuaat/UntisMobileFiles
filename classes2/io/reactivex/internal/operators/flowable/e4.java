// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import o7.c;
import o7.b;
import io.reactivex.l;

public final class e4<T> extends l<T>
{
    final b<T> H;
    final long I;
    
    public e4(final b<T> h, final long i) {
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        this.H.e((c)new a4.a((o7.c<? super Object>)c, this.I));
    }
}
