// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.c;
import java.util.Iterator;
import rx.observers.h;
import rx.n;
import rx.functions.q;
import rx.g;

public final class k4<T1, T2, R> implements b<R, T1>
{
    final Iterable<? extends T2> G;
    final q<? super T1, ? super T2, ? extends R> H;
    
    public k4(final Iterable<? extends T2> g, final q<? super T1, ? super T2, ? extends R> h) {
        this.G = g;
        this.H = h;
    }
    
    public n<? super T1> a(final n<? super R> n) {
        final Iterator<? extends T2> iterator = this.G.iterator();
        try {
            if (!iterator.hasNext()) {
                n.c();
                return h.d();
            }
            return new n<T1>(n) {
                boolean L;
                
                @Override
                public void b(final Throwable t) {
                    if (this.L) {
                        rx.exceptions.c.e(t);
                        return;
                    }
                    this.L = true;
                    n.b(t);
                }
                
                @Override
                public void c() {
                    if (this.L) {
                        return;
                    }
                    this.L = true;
                    n.c();
                }
                
                @Override
                public void m(final T1 t1) {
                    if (this.L) {
                        return;
                    }
                    try {
                        n.m(k4.this.H.s((Object)t1, iterator.next()));
                        if (!iterator.hasNext()) {
                            this.c();
                        }
                    }
                    finally {
                        final Throwable t2;
                        rx.exceptions.c.f(t2, this);
                    }
                }
            };
        }
        finally {
            final Throwable t;
            rx.exceptions.c.f(t, n);
            return h.d();
        }
    }
}
