// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.o;
import rx.i;
import rx.n;
import rx.functions.b;
import rx.g;

public class h2<T> implements g.b<T, T>
{
    final rx.functions.b<? super Long> G;
    
    public h2(final rx.functions.b<? super Long> g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final b<Object> b = new b<Object>((n<? super Object>)n);
        n.s0(new i() {
            @Override
            public void v(final long l) {
                h2.this.G.h(l);
                b.x(l);
            }
        });
        n.r(b);
        return b;
    }
    
    static final class b<T> extends n<T>
    {
        private final n<? super T> L;
        
        b(final n<? super T> l) {
            this.L = l;
            this.v(0L);
        }
        
        private void x(final long n) {
            this.v(n);
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.b(t);
        }
        
        @Override
        public void c() {
            this.L.c();
        }
        
        @Override
        public void m(final T t) {
            this.L.m((Object)t);
        }
    }
}
