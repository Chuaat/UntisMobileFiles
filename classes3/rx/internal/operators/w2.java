// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.plugins.c;
import rx.i;
import java.util.concurrent.atomic.AtomicLong;
import rx.n;
import rx.functions.b;
import rx.g;

public class w2<T> implements b<T, T>
{
    final rx.functions.b<? super T> G;
    
    w2() {
        this(null);
    }
    
    public w2(final rx.functions.b<? super T> g) {
        this.G = g;
    }
    
    public static <T> w2<T> b() {
        return (w2<T>)c.a;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final AtomicLong atomicLong = new AtomicLong();
        n.s0(new i() {
            @Override
            public void v(final long n) {
                rx.internal.operators.a.b(atomicLong, n);
            }
        });
        return new n<T>(n) {
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
                    n.c();
                }
            }
            
            @Override
            public void f() {
                this.v(Long.MAX_VALUE);
            }
            
            @Override
            public void m(final T t) {
                if (this.L) {
                    return;
                }
                if (atomicLong.get() > 0L) {
                    n.m(t);
                    atomicLong.decrementAndGet();
                }
                else {
                    final rx.functions.b<? super T> g = w2.this.G;
                    if (g != null) {
                        try {
                            g.h(t);
                        }
                        finally {
                            final Throwable t2;
                            rx.exceptions.c.g(t2, this, t);
                        }
                    }
                }
            }
        };
    }
    
    static final class c
    {
        static final w2<Object> a;
        
        static {
            a = new w2<Object>();
        }
    }
}
