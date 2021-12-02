// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.ArrayDeque;
import rx.schedulers.f;
import java.util.Deque;
import rx.n;
import java.util.concurrent.TimeUnit;
import rx.j;
import rx.g;

public class k3<T> implements b<T, T>
{
    final long G;
    final j H;
    
    public k3(final long duration, final TimeUnit timeUnit, final j h) {
        this.G = timeUnit.toMillis(duration);
        this.H = h;
    }
    
    public n<? super T> a(final n<? super T> n) {
        return new n<T>(n) {
            private Deque<f<T>> L = new ArrayDeque<f<T>>();
            
            private void w(final long n) {
                final long g = k3.this.G;
                while (!this.L.isEmpty()) {
                    final f<T> f = this.L.getFirst();
                    if (f.a() >= n - g) {
                        break;
                    }
                    this.L.removeFirst();
                    n.m(f.b());
                }
            }
            
            @Override
            public void b(final Throwable t) {
                n.b(t);
            }
            
            @Override
            public void c() {
                this.w(k3.this.H.b());
                n.c();
            }
            
            @Override
            public void m(final T t) {
                final long b = k3.this.H.b();
                this.w(b);
                this.L.offerLast(new f<T>(b, t));
            }
        };
    }
}
