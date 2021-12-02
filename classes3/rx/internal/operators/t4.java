// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.plugins.c;
import rx.n;
import rx.o;
import rx.m;
import rx.g;
import rx.k;

public final class t4<T> implements t<T>
{
    final g.a<T> G;
    
    public t4(final g.a<T> g) {
        this.G = g;
    }
    
    public void a(final m<? super T> m) {
        final a<Object> a = new a<Object>((m<? super Object>)m);
        m.d(a);
        this.G.h(a);
    }
    
    static final class a<T> extends n<T>
    {
        static final int O = 0;
        static final int P = 1;
        static final int Q = 2;
        final m<? super T> L;
        T M;
        int N;
        
        a(final m<? super T> l) {
            this.L = l;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.N == 2) {
                c.I(t);
            }
            else {
                this.M = null;
                this.L.b(t);
            }
        }
        
        @Override
        public void c() {
            final int n = this.N;
            if (n == 0) {
                this.L.b(new NoSuchElementException());
            }
            else if (n == 1) {
                this.N = 2;
                final T m = this.M;
                this.M = null;
                this.L.e((Object)m);
            }
        }
        
        @Override
        public void m(final T m) {
            final int n = this.N;
            if (n == 0) {
                this.N = 1;
                this.M = m;
            }
            else if (n == 1) {
                this.N = 2;
                this.L.b(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }
    }
}
