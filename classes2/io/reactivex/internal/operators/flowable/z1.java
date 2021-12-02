// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.b;
import o7.c;
import io.reactivex.l;
import io.reactivex.p;

public final class z1<R, T> extends a<T, R>
{
    final p<? extends R, ? super T> I;
    
    public z1(final l<T> l, final p<? extends R, ? super T> i) {
        super(l);
        this.I = i;
    }
    
    public void n6(final c<? super R> c) {
        try {
            final o7.c<? super T> a = this.I.a(c);
            if (a != null) {
                super.H.e(a);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Operator ");
            sb.append(this.I);
            sb.append(" returned a null Subscriber");
            throw new NullPointerException(sb.toString());
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable cause;
            b.b(cause);
            io.reactivex.plugins.a.Y(cause);
            final NullPointerException ex2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            ex2.initCause(cause);
            throw ex2;
        }
    }
}
