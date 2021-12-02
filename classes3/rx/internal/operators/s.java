// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.plugins.c;
import java.util.concurrent.TimeoutException;
import rx.functions.a;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.o;
import rx.d;
import rx.j;
import java.util.concurrent.TimeUnit;
import rx.b;

public final class s implements j0
{
    final b G;
    final long H;
    final TimeUnit I;
    final j J;
    final b K;
    
    public s(final b g, final long h, final TimeUnit i, final j j, final b k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void a(final d d) {
        final rx.subscriptions.b b = new rx.subscriptions.b();
        d.a(b);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final j.a a = this.J.a();
        b.a(a);
        a.d(new a() {
            @Override
            public void call() {
                if (atomicBoolean.compareAndSet(false, true)) {
                    b.c();
                    final b k = s.this.K;
                    if (k == null) {
                        d.b(new TimeoutException());
                    }
                    else {
                        k.G0(new d() {
                            @Override
                            public void a(final o o) {
                                b.a(o);
                            }
                            
                            @Override
                            public void b(final Throwable t) {
                                b.i();
                                d.b(t);
                            }
                            
                            @Override
                            public void c() {
                                b.i();
                                d.c();
                            }
                        });
                    }
                }
            }
        }, this.H, this.I);
        this.G.G0(new d() {
            @Override
            public void a(final o o) {
                b.a(o);
            }
            
            @Override
            public void b(final Throwable t) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    b.i();
                    d.b(t);
                }
                else {
                    rx.plugins.c.I(t);
                }
            }
            
            @Override
            public void c() {
                if (atomicBoolean.compareAndSet(false, true)) {
                    b.i();
                    d.c();
                }
            }
        });
    }
}
