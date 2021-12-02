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

public final class m1 implements a<Long>
{
    final long G;
    final long H;
    final TimeUnit I;
    final j J;
    
    public m1(final long g, final long h, final TimeUnit i, final j j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void a(final n<? super Long> n) {
        final j.a a = this.J.a();
        n.r(a);
        a.e(new rx.functions.a() {
            long G;
            
            @Override
            public void call() {
                try {
                    final n h = n;
                    final long g = this.G;
                    this.G = 1L + g;
                    h.m(g);
                    return;
                }
                finally {
                    final a a = this;
                    final j.a a2 = a;
                    a2.i();
                }
                try {
                    final a a = this;
                    final j.a a2 = a;
                    a2.i();
                }
                finally {
                    final Throwable t;
                    rx.exceptions.c.f(t, n);
                }
            }
        }, this.G, this.H, this.I);
    }
}
