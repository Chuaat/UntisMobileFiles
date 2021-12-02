// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.plugins.a;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.d;
import io.reactivex.f;
import io.reactivex.c;

public final class u extends c
{
    final Runnable G;
    
    public u(final Runnable g) {
        this.G = g;
    }
    
    @Override
    protected void L0(final f f) {
        final io.reactivex.disposables.c b = d.b();
        f.l(b);
        try {
            this.G.run();
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
