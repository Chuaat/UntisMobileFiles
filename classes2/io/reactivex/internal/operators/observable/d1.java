// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.plugins.a;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.observers.l;
import io.reactivex.i0;
import java.util.concurrent.Callable;
import io.reactivex.b0;

public final class d1<T> extends b0<T> implements Callable<T>
{
    final Callable<? extends T> G;
    
    public d1(final Callable<? extends T> g) {
        this.G = g;
    }
    
    public void L5(final i0<? super T> i0) {
        final l<Object> l = new l<Object>((i0<? super Object>)i0);
        i0.l(l);
        if (l.i()) {
            return;
        }
        try {
            l.c(b.g((Object)this.G.call(), "Callable returned null"));
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            if (!l.i()) {
                i0.b(t);
            }
            else {
                a.Y(t);
            }
        }
    }
    
    @Override
    public T call() throws Exception {
        return b.g((T)this.G.call(), "The callable returned a null value");
    }
}
