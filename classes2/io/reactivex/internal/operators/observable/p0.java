// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.observers.n;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;
import io.reactivex.disposables.c;
import x5.g;

public final class p0<T> extends a<T, T>
{
    private final x5.g<? super c> H;
    private final x5.a I;
    
    public p0(final b0<T> b0, final x5.g<? super c> h, final x5.a i) {
        super(b0);
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        super.G.c(new n<Object>((i0<? super T>)i0, this.H, this.I));
    }
}
