// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.plugins.a;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.d;
import io.reactivex.v;
import java.util.concurrent.Callable;
import io.reactivex.s;

public final class j0<T> extends s<T> implements Callable<T>
{
    final Callable<? extends T> G;
    
    public j0(final Callable<? extends T> g) {
        this.G = g;
    }
    
    @Override
    public T call() throws Exception {
        return (T)this.G.call();
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        final c b = d.b();
        v.l(b);
        if (!b.i()) {
            try {
                final T call = (T)this.G.call();
                if (!b.i()) {
                    if (call == null) {
                        v.f();
                    }
                    else {
                        v.d(call);
                    }
                }
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                if (!b.i()) {
                    v.b(t);
                }
                else {
                    a.Y(t);
                }
            }
        }
    }
}
