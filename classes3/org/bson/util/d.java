// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.util;

import java.util.Collection;
import java.util.Set;
import e7.a;
import java.util.concurrent.ConcurrentMap;
import java.util.Map;

final class d<K, V> implements Map<K, V>, f<K, V>
{
    private final ConcurrentMap<K, V> G;
    private final f<K, V> H;
    
    d(final ConcurrentMap<K, V> concurrentMap, final f<K, V> f) {
        this.G = a.e("map", concurrentMap);
        this.H = a.e("function", f);
    }
    
    public static <K, V> Map<K, V> a(final f<K, V> f) {
        return new d<K, V>((ConcurrentMap<K, V>)e.i(), f);
    }
    
    @Override
    public V apply(final K k) {
        return this.get(k);
    }
    
    @Override
    public void clear() {
        this.G.clear();
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.G.containsKey(o);
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return this.G.containsValue(o);
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        return this.G.entrySet();
    }
    
    @Override
    public boolean equals(final Object obj) {
        return this.G.equals(obj);
    }
    
    @Override
    public V get(final Object o) {
        while (true) {
            final V value = this.G.get(o);
            if (value != null) {
                return value;
            }
            final V apply = this.H.apply((K)o);
            if (apply == null) {
                return null;
            }
            this.G.putIfAbsent((K)o, apply);
        }
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode();
    }
    
    @Override
    public boolean isEmpty() {
        return this.G.isEmpty();
    }
    
    @Override
    public Set<K> keySet() {
        return this.G.keySet();
    }
    
    @Override
    public V put(final K k, final V v) {
        return this.G.put(k, v);
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends V> map) {
        this.G.putAll((Map<?, ?>)map);
    }
    
    @Override
    public V putIfAbsent(final K k, final V v) {
        return this.G.putIfAbsent(k, v);
    }
    
    @Override
    public V remove(final Object o) {
        return this.G.remove(o);
    }
    
    @Override
    public boolean remove(final Object o, final Object o2) {
        return this.G.remove(o, o2);
    }
    
    @Override
    public V replace(final K k, final V v) {
        return this.G.replace(k, v);
    }
    
    @Override
    public boolean replace(final K k, final V v, final V v2) {
        return this.G.replace(k, v, v2);
    }
    
    @Override
    public int size() {
        return this.G.size();
    }
    
    @Override
    public Collection<V> values() {
        return this.G.values();
    }
}
