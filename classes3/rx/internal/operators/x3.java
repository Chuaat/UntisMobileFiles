// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.n;
import rx.j;
import rx.schedulers.e;
import rx.g;

public final class x3<T> implements b<e<T>, T>
{
    final j G;
    
    public x3(final j g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super e<T>> n) {
        return new n<T>(n) {
            private long L = x3.this.G.b();
            
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
                final long b = x3.this.G.b();
                n.m(new e(b - this.L, t));
                this.L = b;
            }
        };
    }
}
