// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.functions.a;
import rx.o;
import rx.m;
import rx.j;
import java.util.concurrent.TimeUnit;
import rx.k;

public final class l4<T> implements t<T>
{
    final t<T> G;
    final long H;
    final TimeUnit I;
    final j J;
    
    public l4(final t<T> g, final long h, final TimeUnit i, final j j) {
        this.G = g;
        this.J = j;
        this.H = h;
        this.I = i;
    }
    
    public void a(final m<? super T> m) {
        final j.a a = this.J.a();
        final a a2 = new a<Object>(m, a, this.H, this.I);
        m.d(a);
        m.d(a2);
        this.G.h((a<? super T>)a2);
    }
    
    static final class a<T> extends m<T> implements rx.functions.a
    {
        final m<? super T> H;
        final j.a I;
        final long J;
        final TimeUnit K;
        T L;
        Throwable M;
        
        public a(final m<? super T> h, final j.a i, final long j, final TimeUnit k) {
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        @Override
        public void b(final Throwable m) {
            this.M = m;
            this.I.d(this, this.J, this.K);
        }
        
        @Override
        public void call() {
            try {
                final Throwable m = this.M;
                if (m != null) {
                    this.M = null;
                    this.H.b(m);
                }
                else {
                    final T l = this.L;
                    this.L = null;
                    this.H.e((Object)l);
                }
            }
            finally {
                this.I.i();
            }
        }
        
        @Override
        public void e(final T l) {
            this.L = l;
            this.I.d(this, this.J, this.K);
        }
    }
}
