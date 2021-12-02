// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.a;
import rx.o;
import rx.m;
import rx.k;

public final class x0<T> implements t<T>
{
    public static volatile boolean I;
    final t<T> G;
    final String H;
    
    public x0(final t<T> g) {
        this.G = g;
        this.H = v0.b();
    }
    
    public void a(final m<? super T> m) {
        this.G.h(new a<Object>((m<? super Object>)m, this.H));
    }
    
    static final class a<T> extends m<T>
    {
        final m<? super T> H;
        final String I;
        
        public a(final m<? super T> h, final String i) {
            this.H = h;
            this.I = i;
            h.d(this);
        }
        
        @Override
        public void b(final Throwable t) {
            new rx.exceptions.a(this.I).a(t);
            this.H.b(t);
        }
        
        @Override
        public void e(final T t) {
            this.H.e((Object)t);
        }
    }
}
