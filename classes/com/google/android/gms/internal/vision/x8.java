// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Set;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.AbstractMap;

class x8<K extends Comparable<K>, V> extends AbstractMap<K, V>
{
    private final int G;
    private List<c9> H;
    private Map<K, V> I;
    private boolean J;
    private volatile e9 K;
    private Map<K, V> L;
    private volatile y8 M;
    
    private x8(final int g) {
        this.G = g;
        this.H = Collections.emptyList();
        this.I = Collections.emptyMap();
        this.L = Collections.emptyMap();
    }
    
    private final int a(final K k) {
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
    
    static <FieldDescriptorType extends j6<FieldDescriptorType>> x8<FieldDescriptorType, Object> b(final int n) {
        return (x8<FieldDescriptorType, Object>)new w8(n);
    }
    
    private final V k(final int n) {
        this.r();
        final Object value = this.H.remove(n).getValue();
        if (!this.I.isEmpty()) {
            final Iterator<Map.Entry<K, V>> iterator = this.s().entrySet().iterator();
            this.H.add(new c9((Entry<Object, Object>)iterator.next()));
            iterator.remove();
        }
        return (V)value;
    }
    
    private final void r() {
        if (!this.J) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    private final SortedMap<K, V> s() {
        this.r();
        if (this.I.isEmpty() && !(this.I instanceof TreeMap)) {
            final TreeMap<K, V> i = new TreeMap<K, V>();
            this.I = i;
            this.L = i.descendingMap();
        }
        return (SortedMap<K, V>)(SortedMap)this.I;
    }
    
    @Override
    public void clear() {
        this.r();
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
        return this.a((K)comparable) >= 0 || this.I.containsKey(comparable);
    }
    
    public final V d(final K k, final V value) {
        this.r();
        final int a = this.a(k);
        if (a >= 0) {
            return (V)this.H.get(a).setValue(value);
        }
        this.r();
        if (this.H.isEmpty() && !(this.H instanceof ArrayList)) {
            this.H = new ArrayList<c9>(this.G);
        }
        final int n = -(a + 1);
        if (n >= this.G) {
            return this.s().put(k, value);
        }
        final int size = this.H.size();
        final int g = this.G;
        if (size == g) {
            final c9 c9 = this.H.remove(g - 1);
            this.s().put((K)c9.getKey(), (V)c9.getValue());
        }
        this.H.add(n, new c9(this, k, value));
        return null;
    }
    
    public void e() {
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
    public Set<Entry<K, V>> entrySet() {
        if (this.K == null) {
            this.K = new e9(this, null);
        }
        return (Set<Entry<K, V>>)this.K;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof x8)) {
            return super.equals(o);
        }
        final x8 x8 = (x8)o;
        final int size = this.size();
        if (size != x8.size()) {
            return false;
        }
        final int j = this.j();
        if (j != x8.j()) {
            return this.entrySet().equals(x8.entrySet());
        }
        for (int i = 0; i < j; ++i) {
            if (!this.h(i).equals(x8.h(i))) {
                return false;
            }
        }
        return j == size || this.I.equals(x8.I);
    }
    
    @Override
    public V get(final Object o) {
        final Comparable comparable = (Comparable)o;
        final int a = this.a((K)comparable);
        if (a >= 0) {
            return (V)this.H.get(a).getValue();
        }
        return this.I.get(comparable);
    }
    
    public final Entry<K, V> h(final int n) {
        return (Entry<K, V>)this.H.get(n);
    }
    
    @Override
    public int hashCode() {
        final int j = this.j();
        int i = 0;
        int n = 0;
        while (i < j) {
            n += this.H.get(i).hashCode();
            ++i;
        }
        int n2 = n;
        if (this.I.size() > 0) {
            n2 = n + this.I.hashCode();
        }
        return n2;
    }
    
    public final boolean i() {
        return this.J;
    }
    
    public final int j() {
        return this.H.size();
    }
    
    public final Iterable<Entry<K, V>> o() {
        if (this.I.isEmpty()) {
            return b9.a();
        }
        return this.I.entrySet();
    }
    
    final Set<Entry<K, V>> q() {
        if (this.M == null) {
            this.M = new y8(this, null);
        }
        return (Set<Entry<K, V>>)this.M;
    }
    
    @Override
    public V remove(final Object o) {
        this.r();
        final Comparable comparable = (Comparable)o;
        final int a = this.a((K)comparable);
        if (a >= 0) {
            return this.k(a);
        }
        if (this.I.isEmpty()) {
            return null;
        }
        return this.I.remove(comparable);
    }
    
    @Override
    public int size() {
        return this.H.size() + this.I.size();
    }
}
