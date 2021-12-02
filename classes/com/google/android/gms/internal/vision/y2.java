// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

final class y2<K, V> extends q2<Map.Entry<K, V>>
{
    private final transient m2<K, V> I;
    private final transient Object[] J;
    private final transient int K;
    private final transient int L;
    
    y2(final m2<K, V> i, final Object[] j, final int n, final int l) {
        this.I = i;
        this.J = j;
        this.K = 0;
        this.L = l;
    }
    
    @Override
    final int b(final Object[] array, final int n) {
        return this.l().b(array, n);
    }
    
    @Override
    public final boolean contains(Object key) {
        if (key instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)key;
            key = entry.getKey();
            final Object value = entry.getValue();
            if (value != null && value.equals(this.I.get(key))) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final i3<Map.Entry<K, V>> f() {
        return (i3<Map.Entry<K, V>>)this.l().iterator();
    }
    
    @Override
    final boolean m() {
        return true;
    }
    
    @Override
    final l2<Map.Entry<K, V>> p() {
        return (l2<Map.Entry<K, V>>)new b3(this);
    }
    
    @Override
    public final int size() {
        return this.L;
    }
}
