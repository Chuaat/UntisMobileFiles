// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.n;
import rx.functions.c;
import rx.functions.o;
import rx.g;

public final class a0<T, R> implements g.a<R>
{
    final g<T> G;
    final o<R> H;
    final rx.functions.c<R, ? super T> I;
    
    public a0(final g<T> g, final o<R> h, final rx.functions.c<R, ? super T> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void a(final n<? super R> n) {
        try {
            new a<Object, Object>((n<? super Object>)n, this.H.call(), (rx.functions.c<Object, ? super Object>)this.I).D(this.G);
        }
        finally {
            final Throwable t;
            rx.exceptions.c.e(t);
            n.b(t);
        }
    }
    
    static final class a<T, R> extends u<T, R>
    {
        final rx.functions.c<R, ? super T> U;
        
        public a(final n<? super R> n, final R n2, final rx.functions.c<R, ? super T> u) {
            super(n);
            super.N = n2;
            super.M = true;
            this.U = u;
        }
        
        @Override
        public void m(final T t) {
            if (super.T) {
                return;
            }
            try {
                this.U.s((R)super.N, (Object)t);
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.e(t2);
                this.i();
                this.b(t2);
            }
        }
    }
}
