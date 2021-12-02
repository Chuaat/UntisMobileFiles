// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import o7.c;
import io.reactivex.internal.util.j;
import x5.o;
import o7.b;
import io.reactivex.l;

public final class z<T, R> extends l<R>
{
    final b<T> H;
    final o<? super T, ? extends b<? extends R>> I;
    final int J;
    final j K;
    
    public z(final b<T> h, final o<? super T, ? extends b<? extends R>> i, final int j, final j k) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        if (j3.b(this.H, (o7.c<? super Object>)c, (o<? super T, ? extends o7.b<?>>)this.I)) {
            return;
        }
        this.H.e((c)w.P8((o7.c<? super Object>)c, (o<? super Object, ? extends o7.b<?>>)this.I, this.J, this.K));
    }
}
