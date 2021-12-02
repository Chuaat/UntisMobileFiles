// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;

public final class m2<K, V> extends LinkedHashMap<K, V>
{
    private static final m2 H;
    private boolean G;
    
    static {
        (H = new m2()).G = false;
    }
    
    private m2() {
        this.G = true;
    }
    
    private m2(final Map<K, V> m) {
        super(m);
        this.G = true;
    }
    
    public static <K, V> m2<K, V> c() {
        return (m2<K, V>)m2.H;
    }
    
    private final void f() {
        if (this.G) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    private static int g(final Object o) {
        if (o instanceof byte[]) {
            return l1.b((byte[])o);
        }
        if (!(o instanceof m1)) {
            return o.hashCode();
        }
        throw new UnsupportedOperationException();
    }
    
    public final boolean a() {
        return this.G;
    }
    
    public final void b(final m2<K, V> m2) {
        this.f();
        if (!m2.isEmpty()) {
            this.putAll((Map<? extends K, ? extends V>)m2);
        }
    }
    
    @Override
    public final void clear() {
        this.f();
        super.clear();
    }
    
    public final m2<K, V> d() {
        if (this.isEmpty()) {
            return new m2<K, V>();
        }
        return new m2<K, V>(this);
    }
    
    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof Map) {
            final Map map = (Map)o;
            boolean b2 = false;
            Label_0165: {
                Label_0163: {
                    if (this != map) {
                        Label_0032: {
                            if (this.size() == map.size()) {
                                for (final Map.Entry<K, V> entry : this.entrySet()) {
                                    if (!map.containsKey(entry.getKey())) {
                                        break Label_0032;
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
                                        break Label_0032;
                                    }
                                }
                                break Label_0163;
                            }
                        }
                        b2 = false;
                        break Label_0165;
                    }
                }
                b2 = true;
            }
            if (b2) {
                return true;
            }
        }
        return false;
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
    
    public final void i() {
        this.G = false;
    }
    
    @Override
    public final V put(final K key, final V value) {
        this.f();
        l1.a(key);
        l1.a(value);
        return super.put(key, value);
    }
    
    @Override
    public final void putAll(final Map<? extends K, ? extends V> m) {
        this.f();
        for (final K next : m.keySet()) {
            l1.a((Object)next);
            l1.a(m.get(next));
        }
        super.putAll(m);
    }
    
    @Override
    public final V remove(final Object key) {
        this.f();
        return super.remove(key);
    }
}
