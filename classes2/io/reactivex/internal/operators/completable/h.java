// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.f;
import io.reactivex.i;
import java.util.concurrent.Callable;
import io.reactivex.c;

public final class h extends c
{
    final Callable<? extends i> G;
    
    public h(final Callable<? extends i> g) {
        this.G = g;
    }
    
    @Override
    protected void L0(final f f) {
        try {
            b.g((i)this.G.call(), "The completableSupplier returned a null CompletableSource").c(f);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            e.g(t, f);
        }
    }
}
