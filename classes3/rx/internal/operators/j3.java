// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import rx.n;
import rx.g;

public class j3<T> implements b<T, T>
{
    final int G;
    
    public j3(final int g) {
        if (g >= 0) {
            this.G = g;
            return;
        }
        throw new IndexOutOfBoundsException("count could not be negative");
    }
    
    public n<? super T> a(final n<? super T> n) {
        return new n<T>(n) {
            private final Deque<Object> L = new ArrayDeque<Object>();
            
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
                if (j3.this.G == 0) {
                    n.m(t);
                    return;
                }
                if (this.L.size() == j3.this.G) {
                    n.m(x.e(this.L.removeFirst()));
                }
                else {
                    this.v(1L);
                }
                this.L.offerLast(x.j(t));
            }
        };
    }
}
