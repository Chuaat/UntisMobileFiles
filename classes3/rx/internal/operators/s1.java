// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.i;
import rx.o;
import rx.h;
import rx.plugins.c;
import rx.internal.producers.e;
import rx.n;
import rx.functions.p;
import rx.g;

public final class s1<T> implements b<Boolean, T>
{
    final p<? super T, Boolean> G;
    final boolean H;
    
    public s1(final p<? super T, Boolean> g, final boolean h) {
        this.G = g;
        this.H = h;
    }
    
    public n<? super T> a(final n<? super Boolean> n) {
        final e e = new e((n<? super T>)n);
        final n<T> n2 = new n<T>() {
            boolean L;
            boolean M;
            
            @Override
            public void b(final Throwable t) {
                if (!this.M) {
                    this.M = true;
                    n.b(t);
                }
                else {
                    rx.plugins.c.I(t);
                }
            }
            
            @Override
            public void c() {
                if (!this.M) {
                    this.M = true;
                    e e;
                    Boolean b;
                    if (this.L) {
                        e = e;
                        b = Boolean.FALSE;
                    }
                    else {
                        e = e;
                        b = s1.this.H;
                    }
                    e.b(b);
                }
            }
            
            @Override
            public void m(final T t) {
                if (this.M) {
                    return;
                }
                this.L = true;
                try {
                    if (s1.this.G.h((Object)t)) {
                        this.M = true;
                        e.b(true ^ s1.this.H);
                        this.i();
                    }
                }
                finally {
                    final Throwable t2;
                    rx.exceptions.c.g(t2, this, t);
                }
            }
        };
        n.r(n2);
        n.s0(e);
        return n2;
    }
}
