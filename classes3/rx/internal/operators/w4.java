// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.c;
import rx.o;
import rx.m;
import rx.functions.p;
import rx.k;

public final class w4<T> implements t<T>
{
    final t<T> G;
    final p<Throwable, ? extends T> H;
    
    public w4(final t<T> g, final p<Throwable, ? extends T> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final m<? super T> m) {
        final a<Object> a = new a<Object>((m<? super Object>)m, this.H);
        m.d(a);
        this.G.h(a);
    }
    
    static final class a<T> extends m<T>
    {
        final m<? super T> H;
        final p<Throwable, ? extends T> I;
        
        public a(final m<? super T> h, final p<Throwable, ? extends T> i) {
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            try {
                this.H.e((Object)this.I.h(t));
            }
            finally {
                c.e(t);
                this.H.b(t);
            }
        }
        
        @Override
        public void e(final T t) {
            this.H.e((Object)t);
        }
    }
}
