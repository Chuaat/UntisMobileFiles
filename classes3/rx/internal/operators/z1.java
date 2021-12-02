// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.c;
import rx.o;
import rx.subscriptions.e;
import rx.n;
import rx.functions.p;
import rx.g;

public final class z1<T, U> implements b<T, T>
{
    final p<? super T, ? extends g<U>> G;
    
    public z1(final p<? super T, ? extends g<U>> g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final rx.observers.g g = new rx.observers.g((n<? super T>)n);
        final e e = new e();
        n.r(e);
        return new n<T>(n) {
            final a2.b<T> L = new a2.b();
            final n<?> M = this;
            
            @Override
            public void b(final Throwable t) {
                g.b(t);
                this.i();
                this.L.a();
            }
            
            @Override
            public void c() {
                this.L.c(g, this);
            }
            
            @Override
            public void f() {
                this.v(Long.MAX_VALUE);
            }
            
            @Override
            public void m(final T t) {
                try {
                    final g g = (g)z1.this.G.h((Object)t);
                    final n<U> n = new n<U>() {
                        final /* synthetic */ int L = z1$a.this.L.d(t);
                        
                        @Override
                        public void b(final Throwable t) {
                            n.this.M.b(t);
                        }
                        
                        @Override
                        public void c() {
                            final n<T> m = n.this;
                            m.L.b(this.L, g, m.M);
                            this.i();
                        }
                        
                        @Override
                        public void m(final U u) {
                            this.c();
                        }
                    };
                    e.b(n);
                    g.R6(n);
                }
                finally {
                    final Throwable t2;
                    rx.exceptions.c.f(t2, this);
                }
            }
        };
    }
}
