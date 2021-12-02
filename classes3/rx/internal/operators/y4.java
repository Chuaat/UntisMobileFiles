// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.h;
import rx.plugins.c;
import rx.o;
import rx.m;
import rx.functions.p;
import rx.k;

public final class y4<T, R> implements t<R>
{
    final k<T> G;
    final p<? super T, ? extends R> H;
    
    public y4(final k<T> g, final p<? super T, ? extends R> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final m<? super R> m) {
        final a a = new a(m, this.H);
        m.d(a);
        this.G.j0((m<? super T>)a);
    }
    
    static final class a<T, R> extends m<T>
    {
        final m<? super R> H;
        final p<? super T, ? extends R> I;
        boolean J;
        
        public a(final m<? super R> h, final p<? super T, ? extends R> i) {
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.J) {
                c.I(t);
                return;
            }
            this.J = true;
            this.H.b(t);
        }
        
        @Override
        public void e(final T t) {
            try {
                this.H.e((Object)this.I.h((Object)t));
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.e(t2);
                this.i();
                this.b(h.a(t2, t));
            }
        }
    }
}
