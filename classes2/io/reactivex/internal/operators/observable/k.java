// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import x5.g;
import io.reactivex.observables.a;
import io.reactivex.b0;

public final class k<T> extends b0<T>
{
    final a<? extends T> G;
    final int H;
    final g<? super c> I;
    final AtomicInteger J;
    
    public k(final a<? extends T> g, final int h, final g<? super c> i) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = new AtomicInteger();
    }
    
    public void L5(final i0<? super T> i0) {
        this.G.c(i0);
        if (this.J.incrementAndGet() == this.H) {
            this.G.p8(this.I);
        }
    }
}
