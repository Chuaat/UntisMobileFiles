// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.c;
import rx.n;
import rx.functions.q;
import rx.g;

public final class c1<T, R> implements g.a<R>
{
    final g<T> G;
    final R H;
    final q<R, ? super T, R> I;
    
    public c1(final g<T> g, final R h, final q<R, ? super T, R> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void a(final n<? super R> n) {
        new a<Object, Object>((n<? super Object>)n, this.H, (q<Object, ? super Object, Object>)this.I).D(this.G);
    }
    
    static final class a<T, R> extends t<T, R>
    {
        final q<R, ? super T, R> T;
        
        public a(final n<? super R> n, final R n2, final q<R, ? super T, R> t) {
            super(n);
            super.N = n2;
            super.M = true;
            this.T = t;
        }
        
        @Override
        public void m(final T t) {
            try {
                super.N = this.T.s((R)super.N, (Object)t);
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.e(t2);
                this.i();
                super.L.b(t2);
            }
        }
    }
}
