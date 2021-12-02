// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.internal.util.s;
import java.util.HashSet;
import java.util.Set;
import rx.n;
import rx.functions.p;
import rx.g;

public final class e2<T, U> implements g.b<T, T>
{
    final p<? super T, ? extends U> G;
    
    public e2(final p<? super T, ? extends U> g) {
        this.G = g;
    }
    
    public static <T> e2<T, T> b() {
        return (e2<T, T>)b.a;
    }
    
    public n<? super T> a(final n<? super T> n) {
        return new n<T>(n) {
            Set<U> L = new HashSet<U>();
            
            @Override
            public void b(final Throwable t) {
                this.L = null;
                n.b(t);
            }
            
            @Override
            public void c() {
                this.L = null;
                n.c();
            }
            
            @Override
            public void m(final T t) {
                if (this.L.add((U)e2.this.G.h((Object)t))) {
                    n.m(t);
                }
                else {
                    this.v(1L);
                }
            }
        };
    }
    
    static final class b
    {
        static final e2<?, ?> a;
        
        static {
            a = new e2<Object, Object>(s.c());
        }
    }
}
