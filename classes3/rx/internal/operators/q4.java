// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.c;
import rx.m;
import java.util.concurrent.Callable;
import rx.k;

public final class q4<T> implements t<T>
{
    final Callable<? extends T> G;
    
    public q4(final Callable<? extends T> g) {
        this.G = g;
    }
    
    public void a(final m<? super T> m) {
        try {
            m.e((T)this.G.call());
        }
        finally {
            final Throwable t;
            c.e(t);
            m.b(t);
        }
    }
}
