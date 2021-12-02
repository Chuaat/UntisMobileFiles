// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.c;
import rx.observers.h;
import rx.n;
import rx.functions.o;
import rx.g;

public final class e0<T> implements a<T>
{
    final o<? extends g<? extends T>> G;
    
    public e0(final o<? extends g<? extends T>> g) {
        this.G = g;
    }
    
    public void a(final n<? super T> n) {
        try {
            ((g)this.G.call()).R6(h.f((n<? super T>)n));
        }
        finally {
            final Throwable t;
            rx.exceptions.c.f(t, n);
        }
    }
}
