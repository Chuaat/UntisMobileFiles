// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Collection;
import rx.exceptions.b;
import java.util.Arrays;
import rx.plugins.c;
import rx.n;
import rx.h;
import rx.g;

public class j0<T> implements g.a<T>
{
    private final h<? super T> G;
    private final g<T> H;
    
    public j0(final g<T> h, final h<? super T> g) {
        this.H = h;
        this.G = g;
    }
    
    public void a(final n<? super T> n) {
        this.H.R6(new a<Object>(n, this.G));
    }
    
    private static final class a<T> extends n<T>
    {
        private final n<? super T> L;
        private final h<? super T> M;
        private boolean N;
        
        a(final n<? super T> l, final h<? super T> m) {
            super(l);
            this.L = l;
            this.M = m;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.N) {
                rx.plugins.c.I(t);
                return;
            }
            this.N = true;
            try {
                this.M.b(t);
                this.L.b(t);
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.e(t2);
                this.L.b(new b(Arrays.asList(t, t2)));
            }
        }
        
        @Override
        public void c() {
            if (this.N) {
                return;
            }
            try {
                this.M.c();
                this.N = true;
                this.L.c();
            }
            finally {
                final Throwable t;
                rx.exceptions.c.f(t, this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.N) {
                return;
            }
            try {
                this.M.m((Object)t);
                this.L.m((Object)t);
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.g(t2, this, t);
            }
        }
    }
}
