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

public final class b2<T> implements b<T, T>
{
    final long G;
    final TimeUnit H;
    final j I;
    
    public b2(final long g, final TimeUnit h, final j i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final j.a a = this.I.a();
        n.r(a);
        return new n<T>(n) {
            boolean L;
            
            @Override
            public void b(final Throwable t) {
                a.c(new rx.functions.a() {
                    @Override
                    public void call() {
                        final n<T> h = n.this;
                        if (!h.L) {
                            h.L = true;
                            n.b(t);
                            a.i();
                        }
                    }
                });
            }
            
            @Override
            public void c() {
                final j.a m = a;
                final rx.functions.a a = new rx.functions.a() {
                    @Override
                    public void call() {
                        final n<T> g = n.this;
                        if (!g.L) {
                            g.L = true;
                            n.c();
                        }
                    }
                };
                final b2 o = b2.this;
                m.d(a, o.G, o.H);
            }
            
            @Override
            public void m(final T t) {
                final j.a m = a;
                final rx.functions.a a = new rx.functions.a() {
                    @Override
                    public void call() {
                        final n<T> h = n.this;
                        if (!h.L) {
                            n.m(t);
                        }
                    }
                };
                final b2 o = b2.this;
                m.d(a, o.G, o.H);
            }
        };
    }
}
