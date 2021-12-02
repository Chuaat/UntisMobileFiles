// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.subscriptions.f;
import rx.functions.a;
import rx.i;
import rx.n;
import rx.j;
import rx.g;

public class b4<T> implements b<T, T>
{
    final j G;
    
    public b4(final j g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final n<T> n2 = new n<T>() {
            @Override
            public void b(final Throwable t) {
                n.b(t);
            }
            
            @Override
            public void c() {
                n.c();
            }
            
            @Override
            public void m(final T t) {
                n.m(t);
            }
            
            @Override
            public void s0(final i i) {
                n.s0(i);
            }
        };
        n.r(f.a(new rx.functions.a() {
            @Override
            public void call() {
                final j.a a = b4.this.G.a();
                a.c(new a() {
                    @Override
                    public void call() {
                        n2.i();
                        a.i();
                    }
                });
            }
        }));
        return n2;
    }
}
