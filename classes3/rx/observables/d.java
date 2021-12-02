// 
// Decompiled by Procyon v0.5.36
// 

package rx.observables;

import rx.n;
import rx.g;

public class d<K, T> extends g<T>
{
    private final K H;
    
    protected d(final K h, final a<T> a) {
        super((a)a);
        this.H = h;
    }
    
    public static <K, T> d<K, T> E7(final K k, final a<T> a) {
        return new d<K, T>(k, a);
    }
    
    public static <K, T> d<K, T> F7(final K k, final g<T> g) {
        return new d<K, T>(k, new a<T>() {
            public void a(final n<? super T> n) {
                g.R6(n);
            }
        });
    }
    
    public K G7() {
        return this.H;
    }
}
