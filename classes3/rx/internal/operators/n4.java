// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.c;
import rx.o;
import rx.m;
import rx.functions.b;
import rx.k;

public final class n4<T> implements t<T>
{
    final k<T> G;
    final b<? super T> H;
    final b<Throwable> I;
    
    public n4(final k<T> g, final b<? super T> h, final b<Throwable> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void a(final m<? super T> m) {
        final a<Object> a = new a<Object>((m<? super Object>)m, (b<? super Object>)this.H, this.I);
        m.d(a);
        this.G.j0(a);
    }
    
    static final class a<T> extends m<T>
    {
        final m<? super T> H;
        final b<? super T> I;
        final b<Throwable> J;
        
        a(final m<? super T> h, final b<? super T> i, final b<Throwable> j) {
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        @Override
        public void b(final Throwable t) {
            try {
                this.J.h(t);
                this.H.b(t);
            }
            finally {
                final Throwable t2;
                c.e(t2);
                this.H.b(new rx.exceptions.b(new Throwable[] { t, t2 }));
            }
        }
        
        @Override
        public void e(final T t) {
            try {
                this.I.h((Object)t);
                this.H.e((Object)t);
            }
            finally {
                final Throwable t2;
                c.i(t2, this, t);
            }
        }
    }
}
