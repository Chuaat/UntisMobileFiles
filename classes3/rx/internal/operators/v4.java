// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.functions.a;
import rx.o;
import rx.m;
import rx.j;
import rx.k;

public final class v4<T> implements t<T>
{
    final t<T> G;
    final j H;
    
    public v4(final t<T> g, final j h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final m<? super T> m) {
        final j.a a = this.H.a();
        final a a2 = new a<Object>(m, a);
        m.d(a);
        m.d(a2);
        this.G.h((a<? super T>)a2);
    }
    
    static final class a<T> extends m<T> implements rx.functions.a
    {
        final m<? super T> H;
        final j.a I;
        T J;
        Throwable K;
        
        public a(final m<? super T> h, final j.a i) {
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable k) {
            this.K = k;
            this.I.c(this);
        }
        
        @Override
        public void call() {
            try {
                final Throwable k = this.K;
                if (k != null) {
                    this.K = null;
                    this.H.b(k);
                }
                else {
                    final T j = this.J;
                    this.J = null;
                    this.H.e((Object)j);
                }
            }
            finally {
                this.I.i();
            }
        }
        
        @Override
        public void e(final T j) {
            this.J = j;
            this.I.c(this);
        }
    }
}
