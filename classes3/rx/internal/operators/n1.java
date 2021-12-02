// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import rx.exceptions.c;
import rx.n;
import java.util.HashMap;
import rx.functions.p;
import rx.functions.o;
import java.util.Map;
import rx.g;

public final class n1<T, K, V> implements g.a<Map<K, V>>, o<Map<K, V>>
{
    final g<T> G;
    final p<? super T, ? extends K> H;
    final p<? super T, ? extends V> I;
    final o<? extends Map<K, V>> J;
    
    public n1(final g<T> g, final p<? super T, ? extends K> p3, final p<? super T, ? extends V> p4) {
        this(g, p3, p4, null);
    }
    
    public n1(final g<T> g, final p<? super T, ? extends K> h, final p<? super T, ? extends V> i, final o<? extends Map<K, V>> j) {
        this.G = g;
        this.H = h;
        this.I = i;
        if (j == null) {
            this.J = this;
        }
        else {
            this.J = j;
        }
    }
    
    public Map<K, V> a() {
        return new HashMap<K, V>();
    }
    
    public void b(final n<? super Map<K, V>> n) {
        try {
            new a(n, (Map)this.J.call(), this.H, this.I).D((g)this.G);
        }
        finally {
            final Throwable t;
            rx.exceptions.c.f(t, n);
        }
    }
    
    static final class a<T, K, V> extends u<T, Map<K, V>>
    {
        final p<? super T, ? extends K> U;
        final p<? super T, ? extends V> V;
        
        a(final n<? super Map<K, V>> n, final Map<K, V> n2, final p<? super T, ? extends K> u, final p<? super T, ? extends V> v) {
            super(n);
            super.N = n2;
            super.M = true;
            this.U = u;
            this.V = v;
        }
        
        @Override
        public void f() {
            this.v(Long.MAX_VALUE);
        }
        
        @Override
        public void m(final T t) {
            if (super.T) {
                return;
            }
            try {
                ((Map)super.N).put(this.U.h((Object)t), this.V.h((Object)t));
            }
            finally {
                final Throwable t2;
                rx.exceptions.c.e(t2);
                this.i();
                this.b(t2);
            }
        }
    }
}
