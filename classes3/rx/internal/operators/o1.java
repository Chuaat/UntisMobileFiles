// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.ArrayList;
import rx.exceptions.c;
import rx.n;
import java.util.HashMap;
import rx.functions.p;
import rx.functions.o;
import java.util.Collection;
import java.util.Map;
import rx.g;

public final class o1<T, K, V> implements g.a<Map<K, Collection<V>>>, o<Map<K, Collection<V>>>
{
    private final p<? super T, ? extends K> G;
    private final p<? super T, ? extends V> H;
    private final o<? extends Map<K, Collection<V>>> I;
    private final p<? super K, ? extends Collection<V>> J;
    private final g<T> K;
    
    public o1(final g<T> g, final p<? super T, ? extends K> p3, final p<? super T, ? extends V> p4) {
        this(g, p3, p4, null, (p)a.b());
    }
    
    public o1(final g<T> g, final p<? super T, ? extends K> p4, final p<? super T, ? extends V> p5, final o<? extends Map<K, Collection<V>>> o) {
        this(g, p4, p5, o, (p)a.b());
    }
    
    public o1(final g<T> k, final p<? super T, ? extends K> g, final p<? super T, ? extends V> h, final o<? extends Map<K, Collection<V>>> i, final p<? super K, ? extends Collection<V>> j) {
        this.K = k;
        this.G = g;
        this.H = h;
        if (i == null) {
            this.I = this;
        }
        else {
            this.I = i;
        }
        this.J = j;
    }
    
    public Map<K, Collection<V>> a() {
        return new HashMap<K, Collection<V>>();
    }
    
    public void b(final n<? super Map<K, Collection<V>>> n) {
        try {
            new b((n<? super Map<Object, Collection<Object>>>)n, (Map<Object, Collection<Object>>)this.I.call(), (p<? super Object, ?>)this.G, (p<? super Object, ?>)this.H, (p<? super Object, ? extends Collection<Object>>)this.J).D((g)this.K);
        }
        finally {
            final Throwable t;
            rx.exceptions.c.e(t);
            n.b(t);
        }
    }
    
    private static final class a<K, V> implements p<K, Collection<V>>
    {
        private static final a<Object, Object> G;
        
        static {
            G = new a<Object, Object>();
        }
        
        static <K, V> a<K, V> b() {
            return (a<K, V>)a.G;
        }
        
        public Collection<V> a(final K k) {
            return new ArrayList<V>();
        }
    }
    
    private static final class b<T, K, V> extends u<T, Map<K, Collection<V>>>
    {
        private final p<? super T, ? extends K> U;
        private final p<? super T, ? extends V> V;
        private final p<? super K, ? extends Collection<V>> W;
        
        b(final n<? super Map<K, Collection<V>>> n, final Map<K, Collection<V>> n2, final p<? super T, ? extends K> u, final p<? super T, ? extends V> v, final p<? super K, ? extends Collection<V>> w) {
            super(n);
            super.N = n2;
            super.M = true;
            this.U = u;
            this.V = v;
            this.W = w;
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
                final K h = (K)this.U.h((Object)t);
                final V h2 = (V)this.V.h((Object)t);
                Collection<Object> collection;
                if ((collection = ((Map)super.N).get(h)) == null) {
                    collection = (Collection<Object>)this.W.h((Object)h);
                    ((Map)super.N).put(h, collection);
                }
                collection.add(h2);
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
