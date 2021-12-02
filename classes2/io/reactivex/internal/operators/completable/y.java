// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.plugins.a;
import io.reactivex.exceptions.b;
import io.reactivex.f;
import io.reactivex.h;
import io.reactivex.i;
import io.reactivex.c;

public final class y extends c
{
    final i G;
    final h H;
    
    public y(final i g, final h h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L0(f a) {
        try {
            a = this.H.a(a);
            this.G.c(a);
            goto Label_0033;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            b.b(t);
            a.Y(t);
        }
    }
}
