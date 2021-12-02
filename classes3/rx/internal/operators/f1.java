// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.functions.a;
import rx.o;
import rx.n;
import rx.j;
import java.util.concurrent.TimeUnit;
import rx.g;

public final class f1<T> implements g.a<T>
{
    final long G;
    final TimeUnit H;
    final j I;
    final g<T> J;
    
    public f1(final g<T> j, final long g, final TimeUnit h, final j i) {
        this.J = j;
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void a(final n<? super T> n) {
        final j.a a = this.I.a();
        final a<Object> a2 = new a<Object>((n<? super Object>)n);
        a2.r(a);
        n.r(a2);
        a.d(a2, this.G, this.H);
        this.J.R6(a2);
    }
    
    static final class a<T> extends n<T> implements rx.functions.a
    {
        final n<? super T> L;
        volatile boolean M;
        
        a(final n<? super T> l) {
            this.L = l;
        }
        
        @Override
        public void b(final Throwable t) {
            try {
                this.L.b(t);
            }
            finally {
                this.i();
            }
        }
        
        @Override
        public void c() {
            try {
                this.L.c();
            }
            finally {
                this.i();
            }
        }
        
        @Override
        public void call() {
            this.M = true;
        }
        
        @Override
        public void m(final T t) {
            if (this.M) {
                this.L.m((Object)t);
            }
        }
    }
}
