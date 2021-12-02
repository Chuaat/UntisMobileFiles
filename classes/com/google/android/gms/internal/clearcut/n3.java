// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Set;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.AbstractMap;

class n3<K extends Comparable<K>, V> extends AbstractMap<K, V>
{
    private final int G;
    private List<u3> H;
    private Map<K, V> I;
    private boolean J;
    private volatile w3 K;
    private Map<K, V> L;
    private volatile q3 M;
    
    private n3(final int g) {
        this.G = g;
        this.H = Collections.emptyList();
        this.I = Collections.emptyMap();
        this.L = Collections.emptyMap();
    }
    
    private final int b(final K k) {
        int n = this.H.size() - 1;
        if (n >= 0) {
            final int compareTo = k.compareTo((K)this.H.get(n).getKey());
            if (compareTo > 0) {
                return -(n + 2);
            }
            if (compareTo == 0) {
                return n;
            }
        }
        int i = 0;
        while (i <= n) {
            final int n2 = (i + n) / 2;
            final int compareTo2 = k.compareTo((K)this.H.get(n2).getKey());
            if (compareTo2 < 0) {
                n = n2 - 1;
            }
            else {
                if (compareTo2 <= 0) {
                    return n2;
                }
                i = n2 + 1;
            }
        }
        return -(i + 1);
    }
    
    static <FieldDescriptorType extends d1<FieldDescriptorType>> n3<FieldDescriptorType, Object> f(final int n) {
        return (n3<FieldDescriptorType, Object>)new o3(n);
    }
    
    private final V h(final int n) {
        this.q();
        final Object value = this.H.remove(n).getValue();
        if (!this.I.isEmpty()) {
            final Iterator<Map.Entry<K, V>> iterator = this.r().entrySet().iterator();
            this.H.add(new u3((Entry<Object, Object>)iterator.next()));
            iterator.remove();
        }
        return (V)value;
    }
    
    private final void q() {
        if (!this.J) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    private final SortedMap<K, V> r() {
        this.q();
        if (this.I.isEmpty() && !(this.I instanceof TreeMap)) {
            final TreeMap<K, V> i = new TreeMap<K, V>();
            this.I = i;
            this.L = i.descendingMap();
        }
        return (SortedMap<K, V>)(SortedMap)this.I;
    }
    
    public final boolean a() {
        return this.J;
    }
    
    @Override
    public void clear() {
        this.q();
        if (!this.H.isEmpty()) {
            this.H.clear();
        }
        if (!this.I.isEmpty()) {
            this.I.clear();
        }
    }
    
    @Override
    public boolean containsKey(final Object o) {
        final Comparable comparable = (Comparable)o;
        return this.b((K)comparable) >= 0 || this.I.containsKey(comparable);
    }
    
    public final V d(final K k, final V value) {
        this.q();
        final int b = this.b(k);
        if (b >= 0) {
            return (V)this.H.get(b).setValue(value);
        }
        this.q();
        if (this.H.isEmpty() && !(this.H instanceof ArrayList)) {
            this.H = new ArrayList<u3>(this.G);
        }
        final int n = -(b + 1);
        if (n >= this.G) {
            return this.r().put(k, value);
        }
        final int size = this.H.size();
        final int g = this.G;
        if (size == g) {
            final u3 u3 = this.H.remove(g - 1);
            this.r().put((K)u3.getKey(), (V)u3.getValue());
        }
        this.H.add(n, new u3(this, k, value));
        return null;
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        if (this.K == null) {
            this.K = new w3(this, null);
        }
        return (Set<Entry<K, V>>)this.K;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n3)) {
            return super.equals(o);
        }
        final n3 n3 = (n3)o;
        final int size = this.size();
        if (size != n3.size()) {
            return false;
        }
        final int n4 = this.n();
        if (n4 != n3.n()) {
            return this.entrySet().equals(n3.entrySet());
        }
        for (int i = 0; i < n4; ++i) {
            if (!this.g(i).equals(n3.g(i))) {
                return false;
            }
        }
        return n4 == size || this.I.equals(n3.I);
    }
    
    public final Entry<K, V> g(final int n) {
        return (Entry<K, V>)this.H.get(n);
    }
    
    @Override
    public V get(final Object o) {
        final Comparable comparable = (Comparable)o;
        final int b = this.b((K)comparable);
        if (b >= 0) {
            return (V)this.H.get(b).getValue();
        }
        return this.I.get(comparable);
    }
    
    @Override
    public int hashCode() {
        final int n = this.n();
        int i = 0;
        int n2 = 0;
        while (i < n) {
            n2 += this.H.get(i).hashCode();
            ++i;
        }
        int n3 = n2;
        if (this.I.size() > 0) {
            n3 = n2 + this.I.hashCode();
        }
        return n3;
    }
    
    public final int n() {
        return this.H.size();
    }
    
    public final Iterable<Entry<K, V>> o() {
        if (this.I.isEmpty()) {
            return r3.a();
        }
        return this.I.entrySet();
    }
    
    final Set<Entry<K, V>> p() {
        if (this.M == null) {
            this.M = new q3(this, null);
        }
        return (Set<Entry<K, V>>)this.M;
    }
    
    @Override
    public V remove(final Object o) {
        this.q();
        final Comparable comparable = (Comparable)o;
        final int b = this.b((K)comparable);
        if (b >= 0) {
            return this.h(b);
        }
        if (this.I.isEmpty()) {
            return null;
        }
        return this.I.remove(comparable);
    }
    
    public void s() {
        if (!this.J) {
            Map<K, V> i;
            if (this.I.isEmpty()) {
                i = Collections.emptyMap();
            }
            else {
                i = Collections.unmodifiableMap((Map<? extends K, ? extends V>)this.I);
            }
            this.I = i;
            Map<K, V> l;
            if (this.L.isEmpty()) {
                l = Collections.emptyMap();
            }
            else {
                l = Collections.unmodifiableMap((Map<? extends K, ? extends V>)this.L);
            }
            this.L = l;
            this.J = true;
        }
    }
    
    @Override
    public int size() {
        return this.H.size() + this.I.size();
    }
}
