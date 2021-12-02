// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.Map;
import e6.c;

public final class l<K, V> extends a<K, V, V>
{
    private static final c<Map<Object, Object>> b;
    
    static {
        b = (c)j.a(Collections.emptyMap());
    }
    
    private l(final Map<K, c<V>> map) {
        super(map);
    }
    
    public static <K, V> b<K, V> c(final int n) {
        return new b<K, V>(n);
    }
    
    public static <K, V> c<Map<K, V>> d() {
        return (c<Map<K, V>>)l.b;
    }
    
    public Map<K, V> e() {
        final LinkedHashMap<Object, Object> d = com.google.android.datatransport.runtime.dagger.internal.d.d(this.b().size());
        for (final Map.Entry<K, e6.c<V>> entry : this.b().entrySet()) {
            d.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap((Map<? extends K, ? extends V>)d);
    }
    
    public static final class b<K, V> extends a<K, V, V>
    {
        private b(final int n) {
            super(n);
        }
        
        public l<K, V> c() {
            return new l<K, V>(super.a, null);
        }
        
        public b<K, V> d(final K k, final c<V> c) {
            super.a(k, c);
            return this;
        }
        
        public b<K, V> e(final c<Map<K, V>> c) {
            super.b(c);
            return this;
        }
    }
}
