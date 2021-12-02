// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.e;
import io.reactivex.f;
import io.reactivex.c;

public final class o extends c
{
    final Throwable G;
    
    public o(final Throwable g) {
        this.G = g;
    }
    
    @Override
    protected void L0(final f f) {
        e.g(this.G, f);
    }
}
