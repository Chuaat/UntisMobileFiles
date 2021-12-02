// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.c;
import rx.i;
import rx.internal.producers.e;
import rx.n;
import java.util.concurrent.Callable;
import rx.g;

public final class p0<T> implements a<T>
{
    private final Callable<? extends T> G;
    
    public p0(final Callable<? extends T> g) {
        this.G = g;
    }
    
    public void a(final n<? super T> n) {
        final e<Object> e = new e<Object>((n<? super Object>)n);
        n.s0(e);
        try {
            e.b(this.G.call());
        }
        finally {
            final Throwable t;
            rx.exceptions.c.f(t, n);
        }
    }
}
