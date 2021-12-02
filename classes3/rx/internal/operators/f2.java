// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.c;
import rx.n;
import rx.internal.util.s;
import rx.functions.p;
import rx.functions.q;
import rx.g;

public final class f2<T, U> implements g.b<T, T>, q<U, U, Boolean>
{
    final p<? super T, ? extends U> G;
    final q<? super U, ? super U, Boolean> H;
    
    public f2(final p<? super T, ? extends U> g) {
        this.G = g;
        this.H = this;
    }
    
    public f2(final q<? super U, ? super U, Boolean> h) {
        this.G = (p<? super T, ? extends U>)s.c();
        this.H = h;
    }
    
    public static <T> f2<T, T> c() {
        return (f2<T, T>)b.a;
    }
    
    public Boolean a(final U u, final U obj) {
        return u == obj || (u != null && u.equals(obj));
    }
    
    public n<? super T> b(final n<? super T> n) {
        return new n<T>(n) {
            U L;
            boolean M;
            
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
                try {
                    final U h = (U)f2.this.G.h((Object)t);
                    final U l = this.L;
                    this.L = h;
                    Label_0085: {
                        if (this.M) {
                            try {
                                if (!f2.this.H.s((Object)l, (Object)h)) {
                                    break Label_0085;
                                }
                                this.v(1L);
                                return;
                            }
                            finally {
                                rx.exceptions.c.g((Throwable)t, n, h);
                                return;
                            }
                        }
                        this.M = true;
                    }
                    n.m(t);
                }
                finally {
                    final Throwable t2;
                    rx.exceptions.c.g(t2, n, t);
                }
            }
        };
    }
    
    static final class b
    {
        static final f2<?, ?> a;
        
        static {
            a = new f2<Object, Object>(s.c());
        }
    }
}
