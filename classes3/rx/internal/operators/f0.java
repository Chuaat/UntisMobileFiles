// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.observers.h;
import rx.functions.a;
import rx.o;
import rx.n;
import rx.j;
import java.util.concurrent.TimeUnit;
import rx.g;

public final class f0<T> implements a<T>
{
    final g<? extends T> G;
    final long H;
    final TimeUnit I;
    final j J;
    
    public f0(final g<? extends T> g, final long h, final TimeUnit i, final j j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void a(final n<? super T> n) {
        final j.a a = this.J.a();
        n.r(a);
        a.d(new rx.functions.a() {
            @Override
            public void call() {
                if (!n.g()) {
                    f0.this.G.R6(h.f((n<? super T>)n));
                }
            }
        }, this.H, this.I);
    }
}
