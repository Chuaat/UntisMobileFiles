// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.b;
import io.reactivex.disposables.d;
import io.reactivex.f;
import x5.a;
import io.reactivex.c;

public final class q extends c
{
    final a G;
    
    public q(final a g) {
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
                io.reactivex.plugins.a.Y(t);
            }
        }
    }
}
