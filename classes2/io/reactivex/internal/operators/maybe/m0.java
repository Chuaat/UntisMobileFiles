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

public final class m0<T> extends s<T> implements Callable<T>
{
    final Runnable G;
    
    public m0(final Runnable g) {
        this.G = g;
    }
    
    @Override
    public T call() throws Exception {
        this.G.run();
        return null;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        final c b = d.b();
        v.l(b);
        if (!b.i()) {
            try {
                this.G.run();
                if (!b.i()) {
                    v.f();
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
