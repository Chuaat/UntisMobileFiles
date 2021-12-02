// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.Callable;
import io.reactivex.s;

public final class k<T> extends s<T>
{
    final Callable<? extends y<? extends T>> G;
    
    public k(final Callable<? extends y<? extends T>> g) {
        this.G = g;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        try {
            b.g((y)this.G.call(), "The maybeSupplier returned a null MaybeSource").c(v);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            e.j(t, v);
        }
    }
}
