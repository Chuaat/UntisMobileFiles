// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.util.IdentityHashMap;

public class g<K> extends IdentityHashMap<K, Integer>
{
    private static final Integer G;
    
    static {
        G = 0;
    }
    
    public void a(final K key) {
        this.put(key, g.G);
    }
}
