// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.o;
import rx.h;
import rx.exceptions.c;
import rx.n;
import rx.functions.p;
import rx.functions.q;
import rx.g;

public final class v3<T> implements b<T, T>
{
    final q<? super T, ? super Integer, Boolean> G;
    
    public v3(final p<? super T, Boolean> p) {
        this(new q<T, Integer, Boolean>() {
            public Boolean a(final T t, final Integer n) {
                return p.h(t);
            }
        });
    }
    
    public v3(final q<? super T, ? super Integer, Boolean> g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final n<T> n2 = new n<T>(n, false) {
            private int L;
            private boolean M;
            
            @Override
            public void b(final Throwable t) {
                if (!this.M) {
                    n.b(t);
                }
            }
            
            @Override
            public void c() {
                if (!this.M) {
                    n.c();
                }
            }
            
            @Override
            public void m(final T t) {
                try {
                    if (v3.this.G.s((Object)t, Integer.valueOf(this.L++))) {
                        n.m(t);
                    }
                    else {
                        this.M = true;
                        n.c();
                        this.i();
                    }
                }
                finally {
                    this.M = true;
                    final Throwable t2;
                    rx.exceptions.c.g(t2, n, t);
                    this.i();
                }
            }
        };
        n.r(n2);
        return n2;
    }
}
