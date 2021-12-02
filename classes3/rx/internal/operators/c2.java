// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.observers.h;
import rx.subjects.c;
import rx.n;
import rx.functions.p;
import rx.g;

public final class c2<T, V> implements b<T, T>
{
    final g<? extends T> G;
    final p<? super T, ? extends g<V>> H;
    
    public c2(final g<? extends T> g, final p<? super T, ? extends g<V>> h) {
        this.G = g;
        this.H = h;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final rx.observers.g<Object> g = new rx.observers.g<Object>((n<? super Object>)n);
        final rx.subjects.c<Object> g2 = rx.subjects.c.G7();
        n.r(rx.g.p3((g<? extends g<?>>)g2).R6(h.e(g)));
        return new n<T>(n) {
            @Override
            public void b(final Throwable t) {
                g.b(t);
            }
            
            @Override
            public void c() {
                g2.c();
            }
            
            @Override
            public void m(final T t) {
                try {
                    g2.m(((g)c2.this.H.h((Object)t)).L5(1).y1(null).k3((p<? super Object, ?>)new p<V, T>() {
                        @Override
                        public T h(final V v) {
                            return t;
                        }
                    }));
                }
                finally {
                    final Throwable t2;
                    rx.exceptions.c.f(t2, this);
                }
            }
        };
    }
}
