// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import o7.c;
import x5.o;
import o7.b;
import io.reactivex.l;

public final class d1<T, U> extends l<U>
{
    final b<T> H;
    final o<? super T, ? extends b<? extends U>> I;
    final boolean J;
    final int K;
    final int L;
    
    public d1(final b<T> h, final o<? super T, ? extends b<? extends U>> i, final boolean j, final int k, final int l) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
    }
    
    @Override
    protected void n6(final c<? super U> c) {
        if (j3.b(this.H, (o7.c<? super Object>)c, (o<? super T, ? extends o7.b<?>>)this.I)) {
            return;
        }
        this.H.e((c)z0.P8((o7.c<? super Object>)c, (o<? super Object, ? extends o7.b<?>>)this.I, this.J, this.K, this.L));
    }
}
