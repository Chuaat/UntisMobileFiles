// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.adapter.rxjava;

import rx.exceptions.b;
import rx.exceptions.c;
import rx.exceptions.e;
import rx.n;
import retrofit2.t;

final class g<T> implements rx.g.a<f<T>>
{
    private final rx.g.a<t<T>> G;
    
    g(final rx.g.a<t<T>> g) {
        this.G = g;
    }
    
    public void a(final n<? super f<T>> n) {
        this.G.h(new a<Object>((n<? super f<Object>>)n));
    }
    
    private static class a<R> extends n<t<R>>
    {
        private final n<? super f<R>> L;
        
        a(final n<? super f<R>> l) {
            super(l);
            this.L = l;
        }
        
        @Override
        public void b(Throwable g) {
            try {
                this.L.m((Object)f.b(g));
                this.L.c();
            }
            finally {
                try {
                    this.L.b(g);
                    return;
                }
                catch (rx.exceptions.g g) {}
                catch (rx.exceptions.f g) {}
                catch (e e) {}
                finally {
                    final Throwable t;
                    rx.exceptions.c.e(t);
                    g = (rx.exceptions.g)new b(new Throwable[] { g, t });
                    rx.plugins.f.c().b().a(g);
                    return;
                }
                rx.plugins.f.c().b().a(g);
            }
        }
        
        @Override
        public void c() {
            this.L.c();
        }
        
        public void w(final t<R> t) {
            this.L.m(f.e(t));
        }
    }
}
