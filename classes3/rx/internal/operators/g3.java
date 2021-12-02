// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.n;
import rx.g;

public final class g3<T> implements g.b<T, T>
{
    g3() {
    }
    
    public static <T> g3<T> b() {
        return (g3<T>)b.a;
    }
    
    public n<? super T> a(final n<? super T> n) {
        return new rx.observers.g<Object>(new n<T>(n) {
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
                n.m(t);
            }
        });
    }
    
    static final class b
    {
        static final g3<Object> a;
        
        static {
            a = new g3<Object>();
        }
    }
}
