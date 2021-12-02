// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.c;
import rx.n;
import rx.functions.p;
import rx.functions.q;
import rx.g;

public final class m3<T> implements b<T, T>
{
    final q<? super T, Integer, Boolean> G;
    
    public m3(final q<? super T, Integer, Boolean> g) {
        this.G = g;
    }
    
    public static <T> q<T, Integer, Boolean> b(final p<? super T, Boolean> p) {
        return new q<T, Integer, Boolean>() {
            public Boolean a(final T t, final Integer n) {
                return p.h(t);
            }
        };
    }
    
    public n<? super T> a(final n<? super T> n) {
        return new n<T>(n) {
            boolean L = true;
            int M;
            
            @Override
            public void b(final Throwable t) {
                n.b(t);
            }
            
            @Override
            public void c() {
                n.c();
            }
            
            @Override
            public void m(final T t) {
                Label_0020: {
                    if (this.L) {
                        break Label_0020;
                    }
                    while (true) {
                        n.m(t);
                        return;
                        try {
                            if (!m3.this.G.s((Object)t, Integer.valueOf(this.M++))) {
                                this.L = false;
                                continue;
                            }
                            this.v(1L);
                        }
                        finally {
                            final Throwable t2;
                            rx.exceptions.c.g(t2, n, t);
                        }
                        break;
                    }
                }
            }
        };
    }
}
