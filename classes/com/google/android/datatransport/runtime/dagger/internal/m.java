// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Map;
import x1.e;
import e6.c;

public final class m<K, V> extends a<K, V, c<V>> implements e<Map<K, c<V>>>
{
    private m(final Map<K, c<V>> map) {
        super(map);
    }
    
    public static <K, V> b<K, V> c(final int n) {
        return new b<K, V>(n);
    }
    
    public Map<K, c<V>> d() {
        return this.b();
    }
    
    public static final class b<K, V> extends a<K, V, c<V>>
    {
        private b(final int n) {
            super(n);
        }
        
        public m<K, V> c() {
            return new m<K, V>(super.a, null);
        }
        
        public b<K, V> d(final K k, final c<V> c) {
            super.a(k, c);
            return this;
        }
        
        public b<K, V> e(final c<Map<K, c<V>>> c) {
            super.b(c);
            return this;
        }
    }
}
