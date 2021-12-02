// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.plugins.a;
import o7.d;
import io.reactivex.internal.subscriptions.f;
import o7.c;
import io.reactivex.internal.functions.b;
import java.util.concurrent.Callable;
import io.reactivex.l;

public final class h1<T> extends l<T> implements Callable<T>
{
    final Callable<? extends T> H;
    
    public h1(final Callable<? extends T> h) {
        this.H = h;
    }
    
    @Override
    public T call() throws Exception {
        return b.g((T)this.H.call(), "The callable returned a null value");
    }
    
    public void n6(final c<? super T> c) {
        final f f = new f((c<? super T>)c);
        c.z((d)f);
        try {
            f.g(b.g((Object)this.H.call(), "The callable returned a null value"));
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            if (f.i()) {
                a.Y(t);
            }
            else {
                c.b(t);
            }
        }
    }
}
