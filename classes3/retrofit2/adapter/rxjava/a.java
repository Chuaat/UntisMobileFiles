// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.adapter.rxjava;

import rx.exceptions.b;
import rx.exceptions.c;
import rx.plugins.f;
import rx.n;
import retrofit2.t;
import rx.g;

final class a<T> implements g.a<T>
{
    private final g.a<t<T>> G;
    
    a(final g.a<t<T>> g) {
        this.G = g;
    }
    
    public void a(final n<? super T> n) {
        this.G.h(new a<Object>((n<? super Object>)n));
    }
    
    private static class a<R> extends n<t<R>>
    {
        private final n<? super R> L;
        private boolean M;
        
        a(final n<? super R> l) {
            super(l);
            this.L = l;
        }
        
        @Override
        public void b(final Throwable cause) {
            if (!this.M) {
                this.L.b(cause);
            }
            else {
                final AssertionError assertionError = new AssertionError((Object)"This should never happen! Report as a Retrofit bug with the full stacktrace.");
                assertionError.initCause(cause);
                f.c().b().a(assertionError);
            }
        }
        
        @Override
        public void c() {
            if (!this.M) {
                this.L.c();
            }
        }
        
        public void w(t<R> ex) {
            if (((t)ex).g()) {
                this.L.m(((t<? super R>)ex).a());
            }
            else {
                this.M = true;
                ex = new e((t<?>)ex);
                try {
                    this.L.b(ex);
                    return;
                }
                catch (rx.exceptions.g ex) {}
                catch (rx.exceptions.f ex) {}
                catch (rx.exceptions.e e) {}
                finally {
                    final Throwable t;
                    rx.exceptions.c.e(t);
                    ex = new b(new Throwable[] { ex, t });
                    f.c().b().a(ex);
                    return;
                }
                f.c().b().a(ex);
            }
        }
    }
}
