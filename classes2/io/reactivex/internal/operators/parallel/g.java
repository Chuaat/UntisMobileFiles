// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import o7.c;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Publisher;
import io.reactivex.parallel.b;

public final class g<T> extends b<T>
{
    final Publisher<T>[] a;
    
    public g(final Publisher<T>[] a) {
        this.a = (o7.b[])a;
    }
    
    @Override
    public int F() {
        return this.a.length;
    }
    
    @Override
    public void Q(final Subscriber<? super T>[] array) {
        if (!this.U((c[])array)) {
            return;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            this.a[i].e((c)array[i]);
        }
    }
}
