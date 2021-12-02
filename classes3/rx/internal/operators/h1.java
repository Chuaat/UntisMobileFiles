// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.n;
import rx.g;

public final class h1<T> implements g.a<T>
{
    final g<T> G;
    
    public h1(final g<T> g) {
        this.G = g;
    }
    
    public void a(final n<? super T> n) {
        new a(n).D((g)this.G);
    }
    
    static final class a<T> extends t<T, T>
    {
        static final Object T;
        
        static {
            T = new Object();
        }
        
        public a(final n<? super T> n) {
            super(n);
            super.N = a.T;
        }
        
        @Override
        public void c() {
            final R n = (R)super.N;
            if (n == a.T) {
                this.w();
            }
            else {
                this.x((T)n);
            }
        }
        
        @Override
        public void m(final T n) {
            super.N = n;
        }
    }
}
