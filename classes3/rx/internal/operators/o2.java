// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.o;
import rx.n;
import rx.g;

public class o2<T> implements g.b<T, T>
{
    o2() {
    }
    
    public static <T> o2<T> b() {
        return (o2<T>)b.a;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final n<T> n2 = new n<T>() {
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
            }
        };
        n.r(n2);
        return n2;
    }
    
    static final class b
    {
        static final o2<?> a;
        
        static {
            a = new o2<Object>();
        }
    }
}
