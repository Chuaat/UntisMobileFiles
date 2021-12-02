// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Map;
import java.util.Iterator;

final class x1<K> implements Iterator<Map.Entry<K, Object>>
{
    private Iterator<Map.Entry<K, Object>> G;
    
    public x1(final Iterator<Map.Entry<K, Object>> g) {
        this.G = g;
    }
    
    @Override
    public final boolean hasNext() {
        return this.G.hasNext();
    }
    
    @Override
    public final void remove() {
        this.G.remove();
    }
}
