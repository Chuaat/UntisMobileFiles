// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Map;

final class w1<K> implements Entry<K, Object>
{
    private Entry<K, u1> G;
    
    private w1(final Entry<K, u1> g) {
        this.G = g;
    }
    
    public final u1 a() {
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
        return u1.e();
    }
    
    @Override
    public final Object setValue(final Object o) {
        if (o instanceof s2) {
            return this.G.getValue().c((s2)o);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
