// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.i0;
import io.reactivex.g0;
import java.util.concurrent.Callable;
import io.reactivex.b0;

public final class f0<T> extends b0<T>
{
    final Callable<? extends g0<? extends T>> G;
    
    public f0(final Callable<? extends g0<? extends T>> g) {
        this.G = g;
    }
    
    public void L5(final i0<? super T> i0) {
        try {
            b.g((g0)this.G.call(), "null ObservableSource supplied").c(i0);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            e.l(t, i0);
        }
    }
}
