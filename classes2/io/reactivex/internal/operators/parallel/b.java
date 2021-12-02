// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.operators.flowable.w;
import o7.c;
import org.reactivestreams.Subscriber;
import io.reactivex.internal.util.j;
import x5.o;

public final class b<T, R> extends io.reactivex.parallel.b<R>
{
    final io.reactivex.parallel.b<T> a;
    final o<? super T, ? extends o7.b<? extends R>> b;
    final int c;
    final j d;
    
    public b(final io.reactivex.parallel.b<T> a, final o<? super T, ? extends o7.b<? extends R>> o, final int c, final j j) {
        this.a = a;
        this.b = io.reactivex.internal.functions.b.g(o, "mapper");
        this.c = c;
        this.d = io.reactivex.internal.functions.b.g(j, "errorMode");
    }
    
    @Override
    public int F() {
        return this.a.F();
    }
    
    @Override
    public void Q(final Subscriber<? super R>[] array) {
        if (!this.U((c[])array)) {
            return;
        }
        final int length = array.length;
        final c[] array2 = new c[length];
        for (int i = 0; i < length; ++i) {
            array2[i] = w.P8((o7.c<? super Object>)array[i], (o<? super Object, ? extends o7.b<?>>)this.b, this.c, this.d);
        }
        this.a.Q(array2);
    }
}
