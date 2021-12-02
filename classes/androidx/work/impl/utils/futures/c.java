// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils.futures;

import androidx.annotation.k0;
import androidx.annotation.t0;

@t0({ t0.a.H })
public final class c<V> extends a<V>
{
    private c() {
    }
    
    public static <V> c<V> v() {
        return new c<V>();
    }
    
    public boolean q(@k0 final V v) {
        return super.q(v);
    }
    
    public boolean r(final Throwable t) {
        return super.r(t);
    }
    
    public boolean s(final x2.a<? extends V> a) {
        return super.s(a);
    }
}
