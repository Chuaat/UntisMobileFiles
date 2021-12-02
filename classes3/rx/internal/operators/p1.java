// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.c;
import rx.i;
import rx.subscriptions.f;
import rx.functions.a;
import rx.n;
import java.util.concurrent.TimeUnit;
import rx.g;
import java.util.concurrent.Future;

public final class p1
{
    private p1() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> g.a<T> a(final Future<? extends T> future) {
        return new a<T>(future);
    }
    
    public static <T> g.a<T> b(final Future<? extends T> future, final long n, final TimeUnit timeUnit) {
        return new a<T>(future, n, timeUnit);
    }
    
    static class a<T> implements g.a<T>
    {
        final Future<? extends T> G;
        private final long H;
        private final TimeUnit I;
        
        public a(final Future<? extends T> g) {
            this.G = g;
            this.H = 0L;
            this.I = null;
        }
        
        public a(final Future<? extends T> g, final long h, final TimeUnit i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public void a(final n<? super T> n) {
            n.r(f.a(new rx.functions.a() {
                @Override
                public void call() {
                    p1.a.this.G.cancel(true);
                }
            }));
            try {
                if (n.g()) {
                    return;
                }
                final TimeUnit i = this.I;
                T t;
                if (i == null) {
                    t = (T)this.G.get();
                }
                else {
                    t = (T)this.G.get(this.H, i);
                }
                n.s0(new rx.internal.producers.f<Object>((n<? super Object>)n, t));
            }
            finally {
                if (n.g()) {
                    return;
                }
                final Throwable t2;
                rx.exceptions.c.f(t2, n);
            }
        }
    }
}
