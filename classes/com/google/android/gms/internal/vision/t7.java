// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;

public final class t7<K, V> extends LinkedHashMap<K, V>
{
    private static final t7 H;
    private boolean G;
    
    static {
        (H = new t7()).G = false;
    }
    
    private t7() {
        this.G = true;
    }
    
    private t7(final Map<K, V> m) {
        super(m);
        this.G = true;
    }
    
    private static int a(final Object o) {
        if (o instanceof byte[]) {
            return t6.j((byte[])o);
        }
        if (!(o instanceof s6)) {
            return o.hashCode();
        }
        throw new UnsupportedOperationException();
    }
    
    public static <K, V> t7<K, V> b() {
        return (t7<K, V>)t7.H;
    }
    
    private final void i() {
        if (this.G) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    public final void c(final t7<K, V> t7) {
        this.i();
        if (!t7.isEmpty()) {
            this.putAll((Map<? extends K, ? extends V>)t7);
        }
    }
    
    @Override
    public final void clear() {
        this.i();
        super.clear();
    }
    
    public final t7<K, V> d() {
        if (this.isEmpty()) {
            return new t7<K, V>();
        }
        return new t7<K, V>(this);
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
    
    public final void f() {
        this.G = false;
    }
    
    public final boolean g() {
        return this.G;
    }
    
    @Override
    public final int hashCode() {
        final Iterator<Map.Entry<K, V>> iterator = this.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<K, V> entry = iterator.next();
            n += (a(entry.getValue()) ^ a(entry.getKey()));
        }
        return n;
    }
    
    @Override
    public final V put(final K key, final V value) {
        this.i();
        t6.d(key);
        t6.d(value);
        return super.put(key, value);
    }
    
    @Override
    public final void putAll(final Map<? extends K, ? extends V> m) {
        this.i();
        for (final K next : m.keySet()) {
            t6.d((Object)next);
            t6.d(m.get(next));
        }
        super.putAll(m);
    }
    
    @Override
    public final V remove(final Object key) {
        this.i();
        return super.remove(key);
    }
}
