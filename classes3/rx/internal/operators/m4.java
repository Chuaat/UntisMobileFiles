// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.c;
import rx.o;
import rx.m;
import rx.functions.a;
import rx.k;

public final class m4<T> implements t<T>
{
    final k<T> G;
    final rx.functions.a H;
    
    public m4(final k<T> g, final rx.functions.a h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final m<? super T> m) {
        final a<Object> a = new a<Object>((m<? super Object>)m, this.H);
        m.d(a);
        this.G.j0(a);
    }
    
    static final class a<T> extends m<T>
    {
        final m<? super T> H;
        final rx.functions.a I;
        
        public a(final m<? super T> h, final rx.functions.a i) {
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            try {
                this.H.b(t);
            }
            finally {
                this.m();
            }
        }
        
        @Override
        public void e(final T t) {
            try {
                this.H.e((Object)t);
            }
            finally {
                this.m();
            }
        }
        
        void m() {
            try {
                this.I.call();
            }
            finally {
                final Throwable t;
                c.e(t);
                rx.plugins.c.I(t);
            }
        }
    }
}
