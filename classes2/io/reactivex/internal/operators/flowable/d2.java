// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import o7.c;
import x5.o;
import o7.b;
import io.reactivex.l;

public final class d2<T, U> extends l<U>
{
    final b<T> H;
    final o<? super T, ? extends U> I;
    
    public d2(final b<T> h, final o<? super T, ? extends U> i) {
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super U> c) {
        this.H.e((c)new b2.b((o7.c<? super Object>)c, (o<? super Object, ?>)this.I));
    }
}
