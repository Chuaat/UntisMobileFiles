// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import x5.g;
import io.reactivex.flowables.a;
import io.reactivex.l;

public final class k<T> extends l<T>
{
    final a<? extends T> H;
    final int I;
    final g<? super c> J;
    final AtomicInteger K;
    
    public k(final a<? extends T> h, final int i, final g<? super c> j) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = new AtomicInteger();
    }
    
    public void n6(final o7.c<? super T> c) {
        this.H.e(c);
        if (this.K.incrementAndGet() == this.I) {
            this.H.T8(this.J);
        }
    }
}
