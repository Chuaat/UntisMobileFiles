// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.c;
import rx.functions.a;
import rx.o;
import rx.n;
import rx.j;
import java.util.concurrent.TimeUnit;
import rx.g;

public final class l1 implements a<Long>
{
    final long G;
    final TimeUnit H;
    final j I;
    
    public l1(final long g, final TimeUnit h, final j i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void a(final n<? super Long> n) {
        final j.a a = this.I.a();
        n.r(a);
        a.d(new rx.functions.a() {
            @Override
            public void call() {
                try {
                    n.m(0L);
                    n.c();
                }
                finally {
                    final Throwable t;
                    rx.exceptions.c.f(t, n);
                }
            }
        }, this.G, this.H);
    }
}
