// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Map;

final class f7<K> implements Entry<K, Object>
{
    private Entry<K, d7> G;
    
    private f7(final Entry<K, d7> g) {
        this.G = g;
    }
    
    public final d7 a() {
        return this.G.getValue();
    }
    
    @Override
    public final K getKey() {
        return this.G.getKey();
    }
    
    @Override
    public final Object getValue() {
        if (this.G.getValue() == null) {
            return null;
        }
        return d7.e();
    }
    
    @Override
    public final Object setValue(final Object o) {
        if (o instanceof z7) {
            return this.G.getValue().a((z7)o);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
