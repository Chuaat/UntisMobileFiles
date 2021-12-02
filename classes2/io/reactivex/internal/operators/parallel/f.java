// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.operators.flowable.z0;
import o7.c;
import org.reactivestreams.Subscriber;
import x5.o;
import io.reactivex.parallel.b;

public final class f<T, R> extends b<R>
{
    final b<T> a;
    final o<? super T, ? extends o7.b<? extends R>> b;
    final boolean c;
    final int d;
    final int e;
    
    public f(final b<T> a, final o<? super T, ? extends o7.b<? extends R>> b, final boolean c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
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
            array2[i] = (c)z0.P8((o7.c<? super Object>)array[i], (o<? super Object, ? extends o7.b<?>>)this.b, this.c, this.d, this.e);
        }
        this.a.Q(array2);
    }
}
