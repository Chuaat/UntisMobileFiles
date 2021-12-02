// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import o7.c;
import io.reactivex.internal.util.j;
import x5.o;
import o7.b;
import io.reactivex.l;

public final class y<T, R> extends l<R>
{
    final b<T> H;
    final o<? super T, ? extends b<? extends R>> I;
    final int J;
    final int K;
    final j L;
    
    public y(final b<T> h, final o<? super T, ? extends b<? extends R>> i, final int j, final int k, final j l) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        this.H.e((c)new x.a((o7.c<? super Object>)c, (o<? super Object, ? extends o7.b<?>>)this.I, this.J, this.K, this.L));
    }
}
