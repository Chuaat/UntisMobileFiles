// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.plugins.a;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.d;
import io.reactivex.f;
import java.util.concurrent.Callable;
import io.reactivex.c;

public final class r extends c
{
    final Callable<?> G;
    
    public r(final Callable<?> g) {
        this.G = g;
    }
    
    @Override
    protected void L0(final f f) {
        final io.reactivex.disposables.c b = d.b();
        f.l(b);
        try {
            this.G.call();
            if (!b.i()) {
                f.f();
            }
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            if (!b.i()) {
                f.b(t);
            }
            else {
                a.Y(t);
            }
        }
    }
}
