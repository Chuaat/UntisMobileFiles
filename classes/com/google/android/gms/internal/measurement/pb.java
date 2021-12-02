// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.AbstractSet;

final class pb extends AbstractSet<Map.Entry>
{
    final /* synthetic */ rb G;
    
    @Override
    public final void clear() {
        this.G.clear();
    }
    
    @Override
    public final boolean contains(Object value) {
        final Map.Entry entry = (Map.Entry)value;
        value = this.G.get(entry.getKey());
        final Object value2 = entry.getValue();
        boolean b = false;
        if (value != value2) {
            if (value == null) {
                return b;
            }
            if (!value.equals(value2)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    @Override
    public final Iterator<Map.Entry> iterator() {
        return new nb(this.G, null);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final Map.Entry entry = (Map.Entry)o;
        if (this.contains(entry)) {
            this.G.remove(entry.getKey());
            return true;
        }
        return false;
    }
    
    @Override
    public final int size() {
        return this.G.size();
    }
}
