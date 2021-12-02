// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Collection;
import java.util.Map;

abstract class u1<K, V> implements u2<K, V>
{
    @NullableDecl
    private transient Map<K, Collection<V>> G;
    
    public boolean a(@NullableDecl final Object o) {
        final Iterator<Collection<V>> iterator = this.zza().values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().contains(o)) {
                return true;
            }
        }
        return false;
    }
    
    abstract Map<K, Collection<V>> b();
    
    @Override
    public boolean equals(@NullableDecl final Object o) {
        return o == this || (o instanceof u2 && this.zza().equals(((u2)o).zza()));
    }
    
    @Override
    public int hashCode() {
        return this.zza().hashCode();
    }
    
    @Override
    public String toString() {
        return this.zza().toString();
    }
    
    @Override
    public Map<K, Collection<V>> zza() {
        Map<K, Collection<V>> g;
        if ((g = this.G) == null) {
            g = this.b();
            this.G = g;
        }
        return g;
    }
}
