// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;

public final class ma<K, V> extends LinkedHashMap<K, V>
{
    private static final ma H;
    private boolean G;
    
    static {
        (H = new ma()).G = false;
    }
    
    private ma() {
        this.G = true;
    }
    
    private ma(final Map<K, V> m) {
        super(m);
        this.G = true;
    }
    
    public static <K, V> ma<K, V> a() {
        return (ma<K, V>)ma.H;
    }
    
    private static int g(final Object o) {
        if (o instanceof byte[]) {
            return s9.b((byte[])o);
        }
        if (!(o instanceof m9)) {
            return o.hashCode();
        }
        throw new UnsupportedOperationException();
    }
    
    private final void i() {
        if (this.G) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    public final ma<K, V> b() {
        ma<K, V> ma;
        if (this.isEmpty()) {
            ma = new ma<K, V>();
        }
        else {
            ma = new ma<K, V>(this);
        }
        return ma;
    }
    
    public final void c() {
        this.G = false;
    }
    
    @Override
    public final void clear() {
        this.i();
        super.clear();
    }
    
    public final void d(final ma<K, V> ma) {
        this.i();
        if (!ma.isEmpty()) {
            this.putAll((Map<? extends K, ? extends V>)ma);
        }
    }
    
    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set;
        if (this.isEmpty()) {
            set = Collections.emptySet();
        }
        else {
            set = super.entrySet();
        }
        return set;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof Map) {
            final Map map = (Map)o;
            if (this != map) {
                if (this.size() != map.size()) {
                    return false;
                }
                for (final Map.Entry<K, V> entry : this.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        return false;
                    }
                    final V value = entry.getValue();
                    final byte[] value2 = map.get(entry.getKey());
                    boolean b;
                    if (value instanceof byte[] && value2 instanceof byte[]) {
                        b = Arrays.equals((byte[])(Object)value, value2);
                    }
                    else {
                        b = value.equals(value2);
                    }
                    if (!b) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public final boolean f() {
        return this.G;
    }
    
    @Override
    public final int hashCode() {
        final Iterator<Map.Entry<K, V>> iterator = this.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<K, V> entry = iterator.next();
            n += (g(entry.getValue()) ^ g(entry.getKey()));
        }
        return n;
    }
    
    @Override
    public final V put(final K key, final V value) {
        this.i();
        s9.e(key);
        s9.e(value);
        return super.put(key, value);
    }
    
    @Override
    public final void putAll(final Map<? extends K, ? extends V> m) {
        this.i();
        for (final K next : m.keySet()) {
            s9.e((Object)next);
            s9.e(m.get(next));
        }
        super.putAll(m);
    }
    
    @Override
    public final V remove(final Object key) {
        this.i();
        return super.remove(key);
    }
}
