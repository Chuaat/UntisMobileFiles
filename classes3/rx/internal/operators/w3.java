// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.n;
import java.util.concurrent.TimeUnit;
import rx.j;
import rx.g;

public final class w3<T> implements b<T, T>
{
    final long G;
    final j H;
    
    public w3(final long duration, final TimeUnit timeUnit, final j h) {
        this.G = timeUnit.toMillis(duration);
        this.H = h;
    }
    
    public n<? super T> a(final n<? super T> n) {
        return new n<T>(n) {
            private long L = -1L;
            
            @Override
            public void b(final Throwable t) {
                n.b(t);
            }
            
            @Override
            public void c() {
                n.c();
            }
            
            @Override
            public void f() {
                this.v(Long.MAX_VALUE);
            }
            
            @Override
            public void m(final T t) {
                final long b = w3.this.H.b();
                final long l = this.L;
                if (l == -1L || b < l || b - l >= w3.this.G) {
                    this.L = b;
                    n.m(t);
                }
            }
        };
    }
}
