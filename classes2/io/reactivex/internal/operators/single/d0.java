// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.disposables.c;
import io.reactivex.plugins.a;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.d;
import io.reactivex.n0;
import java.util.concurrent.Callable;
import io.reactivex.k0;

public final class d0<T> extends k0<T>
{
    final Callable<? extends T> G;
    
    public d0(final Callable<? extends T> g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        final c b = d.b();
        n0.l(b);
        if (b.i()) {
            return;
        }
        try {
            final Object g = io.reactivex.internal.functions.b.g((Object)this.G.call(), "The callable returned a null value");
            if (!b.i()) {
                n0.d((Object)g);
            }
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            if (!b.i()) {
                n0.b(t);
            }
            else {
                a.Y(t);
            }
        }
    }
}
