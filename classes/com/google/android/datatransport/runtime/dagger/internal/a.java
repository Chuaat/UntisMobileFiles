// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import java.util.LinkedHashMap;
import java.util.Collections;
import e6.c;
import java.util.Map;

abstract class a<K, V, V2> implements g<Map<K, V2>>
{
    private final Map<K, c<V>> a;
    
    a(final Map<K, c<V>> m) {
        this.a = Collections.unmodifiableMap((Map<? extends K, ? extends c<V>>)m);
    }
    
    final Map<K, c<V>> b() {
        return this.a;
    }
    
    public abstract static class a<K, V, V2>
    {
        final LinkedHashMap<K, c<V>> a;
        
        a(final int n) {
            this.a = d.d(n);
        }
        
        a<K, V, V2> a(final K k, final c<V> c) {
            this.a.put(p.c(k, "key"), p.c(c, "provider"));
            return this;
        }
        
        a<K, V, V2> b(final c<Map<K, V2>> c) {
            if (c instanceof e) {
                return this.b(((e<Map<K, V2>>)c).a());
            }
            this.a.putAll((Map<?, ?>)((com.google.android.datatransport.runtime.dagger.internal.a<Object, Object, Object>)c).a);
            return this;
        }
    }
}
