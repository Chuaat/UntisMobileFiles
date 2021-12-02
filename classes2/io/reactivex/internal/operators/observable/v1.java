// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.b;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.f0;

public final class v1<R, T> extends a<T, R>
{
    final f0<? extends R, ? super T> H;
    
    public v1(final g0<T> g0, final f0<? extends R, ? super T> h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super R> i0) {
        try {
            final i0<? super T> a = this.H.a(i0);
            final StringBuilder sb = new StringBuilder();
            sb.append("Operator ");
            sb.append(this.H);
            sb.append(" returned a null Observer");
            super.G.c(b.g((i0<? super R>)a, sb.toString()));
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable cause;
            io.reactivex.exceptions.b.b(cause);
            io.reactivex.plugins.a.Y(cause);
            final NullPointerException ex2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            ex2.initCause(cause);
            throw ex2;
        }
    }
}
