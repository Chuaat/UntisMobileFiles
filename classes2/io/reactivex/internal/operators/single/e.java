// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.functions.b;
import io.reactivex.n0;
import io.reactivex.q0;
import java.util.concurrent.Callable;
import io.reactivex.k0;

public final class e<T> extends k0<T>
{
    final Callable<? extends q0<? extends T>> G;
    
    public e(final Callable<? extends q0<? extends T>> g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        try {
            b.g((q0)this.G.call(), "The singleSupplier returned a null SingleSource").c(n0);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            io.reactivex.internal.disposables.e.m(t, n0);
        }
    }
}
