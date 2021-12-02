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

public final class r1<T> implements b<Boolean, T>
{
    final p<? super T, Boolean> G;
    
    public r1(final p<? super T, Boolean> g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super Boolean> n) {
        final e e = new e((n<? super T>)n);
        final n<T> n2 = new n<T>() {
            boolean L;
            
            @Override
            public void b(final Throwable t) {
                if (!this.L) {
                    this.L = true;
                    n.b(t);
                }
                else {
                    rx.plugins.c.I(t);
                }
            }
            
            @Override
            public void c() {
                if (!this.L) {
                    this.L = true;
                    e.b(Boolean.TRUE);
                }
            }
            
            @Override
            public void m(final T t) {
                if (this.L) {
                    return;
                }
                try {
                    if (!r1.this.G.h((Object)t)) {
                        this.L = true;
                        e.b(Boolean.FALSE);
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
