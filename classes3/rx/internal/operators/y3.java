// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.n;
import rx.j;
import rx.schedulers.f;
import rx.g;

public final class y3<T> implements b<f<T>, T>
{
    final j G;
    
    public y3(final j g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super f<T>> n) {
        return new n<T>(n) {
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
                n.m(new f(y3.this.G.b(), t));
            }
        };
    }
}
