// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;
import java.util.AbstractSet;

class e9 extends AbstractSet<Map.Entry<Object, Object>>
{
    private final /* synthetic */ x8 G;
    
    private e9(final x8 g) {
        this.G = g;
    }
    
    @Override
    public void clear() {
        this.G.clear();
    }
    
    @Override
    public boolean contains(Object value) {
        final Map.Entry entry = (Map.Entry)value;
        value = this.G.get(entry.getKey());
        final Object value2 = entry.getValue();
        return value == value2 || (value != null && value.equals(value2));
    }
    
    @Override
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new f9(this.G, null);
    }
    
    @Override
    public boolean remove(final Object o) {
        final Map.Entry entry = (Map.Entry)o;
        if (this.contains(entry)) {
            this.G.remove(entry.getKey());
            return true;
        }
        return false;
    }
    
    @Override
    public int size() {
        return this.G.size();
    }
}
