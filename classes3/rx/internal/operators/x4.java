// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.plugins.c;
import rx.n;
import rx.o;
import rx.subscriptions.e;
import rx.m;
import rx.g;
import rx.k;

public final class x4<T> implements t<T>
{
    final k<? extends T> G;
    final g<?> H;
    
    public x4(final k<? extends T> g, final g<?> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final m<? super T> m) {
        final m<T> i = new m<T>() {
            @Override
            public void b(final Throwable t) {
                m.b(t);
            }
            
            @Override
            public void e(final T t) {
                m.e(t);
            }
        };
        final e e = new e();
        m.d(e);
        final n<Object> n = new n<Object>() {
            boolean L;
            
            @Override
            public void b(final Throwable t) {
                if (this.L) {
                    c.I(t);
                    return;
                }
                this.L = true;
                i.b(t);
            }
            
            @Override
            public void c() {
                if (this.L) {
                    return;
                }
                this.L = true;
                e.b(i);
                x4.this.G.j0(i);
            }
            
            @Override
            public void m(final Object o) {
                this.c();
            }
        };
        e.b(n);
        this.H.z5(n);
    }
}
