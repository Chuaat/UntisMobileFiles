// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.f;
import java.util.concurrent.Callable;
import io.reactivex.c;

public final class p extends c
{
    final Callable<? extends Throwable> G;
    
    public p(final Callable<? extends Throwable> g) {
        this.G = g;
    }
    
    @Override
    protected void L0(final f f) {
        final Throwable t2;
        try {
            final Throwable t = b.g((Throwable)this.G.call(), "The error returned is null");
        }
        finally {
            io.reactivex.exceptions.b.b(t2);
        }
        e.g(t2, f);
    }
}
