// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.functions.b;
import io.reactivex.disposables.d;
import io.reactivex.v;
import java.util.concurrent.Callable;
import io.reactivex.s;

public final class x<T> extends s<T>
{
    final Callable<? extends Throwable> G;
    
    public x(final Callable<? extends Throwable> g) {
        this.G = g;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        v.l(d.a());
        final Throwable t2;
        try {
            final Throwable t = b.g((Throwable)this.G.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        finally {
            io.reactivex.exceptions.b.b(t2);
        }
        v.b(t2);
    }
}
