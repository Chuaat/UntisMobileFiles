// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.i;
import rx.o;
import rx.h;
import rx.exceptions.c;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import rx.internal.producers.e;
import rx.n;
import java.util.List;
import rx.g;

public final class z3<T> implements g.b<List<T>, T>
{
    z3() {
    }
    
    public static <T> z3<T> b() {
        return (z3<T>)b.a;
    }
    
    public n<? super T> a(final n<? super List<T>> n) {
        final e e = new e((n<? super T>)n);
        final n<T> n2 = new n<T>() {
            boolean L;
            List<T> M = new LinkedList<T>();
            
            @Override
            public void b(final Throwable t) {
                n.b(t);
            }
            
            @Override
            public void c() {
                if (!this.L) {
                    this.L = true;
                    try {
                        final ArrayList list = new ArrayList(this.M);
                        this.M = null;
                        e.b(list);
                    }
                    finally {
                        final Throwable t;
                        rx.exceptions.c.f(t, this);
                    }
                }
            }
            
            @Override
            public void f() {
                this.v(Long.MAX_VALUE);
            }
            
            @Override
            public void m(final T t) {
                if (!this.L) {
                    this.M.add(t);
                }
            }
        };
        n.r(n2);
        n.s0(e);
        return n2;
    }
    
    static final class b
    {
        static final z3<Object> a;
        
        static {
            a = new z3<Object>();
        }
    }
}
