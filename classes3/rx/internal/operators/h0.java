// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.c;
import rx.observers.h;
import rx.n;
import rx.functions.o;
import rx.g;

public final class h0<T, U> implements a<T>
{
    final g<? extends T> G;
    final o<? extends g<U>> H;
    
    public h0(final g<? extends T> g, final o<? extends g<U>> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final n<? super T> n) {
        try {
            ((g)this.H.call()).L5(1).R6(new n<U>() {
                @Override
                public void b(final Throwable t) {
                    n.b(t);
                }
                
                @Override
                public void c() {
                    h0.this.G.R6(rx.observers.h.f((n<? super T>)n));
                }
                
                @Override
                public void m(final U u) {
                }
            });
        }
        finally {
            final Throwable t;
            rx.exceptions.c.f(t, n);
        }
    }
}
