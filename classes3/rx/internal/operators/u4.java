// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.i;
import rx.internal.producers.f;
import rx.plugins.c;
import rx.o;
import rx.m;
import rx.n;
import rx.g;
import rx.k;

public final class u4<T, R> implements t<R>
{
    final t<T> G;
    final g.b<? extends R, ? super T> H;
    
    public u4(final t<T> g, final g.b<? extends R, ? super T> h) {
        this.G = g;
        this.H = h;
    }
    
    public static <T> m<T> b(final n<T> n) {
        final a a = new a<T>((n<? super Object>)n);
        n.r(a);
        return (m<T>)a;
    }
    
    public void a(final m<? super R> m) {
        final t4.a<Object> a = new t4.a<Object>((m<? super Object>)m);
        m.d(a);
        try {
            final n<? super T> n = c.R(this.H).h(a);
            final m<Object> b = b(n);
            n.f();
            this.G.h(b);
        }
        finally {
            final Throwable t;
            rx.exceptions.c.h(t, m);
        }
    }
    
    static final class a<T> extends m<T>
    {
        final n<? super T> H;
        
        a(final n<? super T> h) {
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H.b(t);
        }
        
        @Override
        public void e(final T t) {
            this.H.s0(new f<Object>(this.H, t));
        }
    }
}
