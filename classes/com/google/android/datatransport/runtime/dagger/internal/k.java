// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.Map;

public final class k<K, V>
{
    private final Map<K, V> a;
    
    private k(final int n) {
        this.a = (Map<K, V>)d.d(n);
    }
    
    public static <K, V> k<K, V> b(final int n) {
        return new k<K, V>(n);
    }
    
    public Map<K, V> a() {
        if (this.a.size() != 0) {
            return Collections.unmodifiableMap((Map<? extends K, ? extends V>)this.a);
        }
        return Collections.emptyMap();
    }
    
    public k<K, V> c(final K k, final V v) {
        this.a.put(k, v);
        return this;
    }
    
    public k<K, V> d(final Map<K, V> map) {
        this.a.putAll((Map<? extends K, ? extends V>)map);
        return this;
    }
}
