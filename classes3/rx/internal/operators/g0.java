// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.subscriptions.f;
import rx.plugins.c;
import rx.observers.h;
import rx.o;
import rx.subscriptions.e;
import rx.n;
import rx.g;

public final class g0<T, U> implements a<T>
{
    final g<? extends T> G;
    final g<U> H;
    
    public g0(final g<? extends T> g, final g<U> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final n<? super T> n) {
        final e e = new e();
        n.r(e);
        final n<U> n2 = new n<U>() {
            boolean L;
            final /* synthetic */ n M = rx.observers.h.f((n<? super Object>)n);
            
            @Override
            public void b(final Throwable t) {
                if (this.L) {
                    rx.plugins.c.I(t);
                    return;
                }
                this.L = true;
                this.M.b(t);
            }
            
            @Override
            public void c() {
                if (this.L) {
                    return;
                }
                this.L = true;
                e.b(f.e());
                g0.this.G.R6(this.M);
            }
            
            @Override
            public void m(final U u) {
                this.c();
            }
        };
        e.b(n2);
        this.H.R6(n2);
    }
}
