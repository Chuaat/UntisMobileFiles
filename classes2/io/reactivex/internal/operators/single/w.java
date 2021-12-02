// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.n0;
import java.util.concurrent.Callable;
import io.reactivex.k0;

public final class w<T> extends k0<T>
{
    final Callable<? extends Throwable> G;
    
    public w(final Callable<? extends Throwable> g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        final Throwable t2;
        try {
            final Throwable t = b.g((Throwable)this.G.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        finally {
            io.reactivex.exceptions.b.b(t2);
        }
        e.m(t2, n0);
    }
}
