// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.AbstractMap;

class rb<K extends Comparable<K>, V> extends AbstractMap<K, V>
{
    private final int G = g;
    private List<kb> H = Collections.emptyList();
    private Map<K, V> I = Collections.emptyMap();
    private boolean J;
    private volatile pb K;
    private Map<K, V> L = Collections.emptyMap();
    
    private final int k(final K k) {
        final int n = this.H.size() - 1;
        final int n2 = 0;
        int n3 = n;
        int i = n2;
        if (n >= 0) {
            final int compareTo = k.compareTo((K)this.H.get(n).b());
            if (compareTo > 0) {
                return -(n + 2);
            }
            if (compareTo == 0) {
                return n;
            }
            n3 = n;
            i = n2;
        }
        while (i <= n3) {
            final int n4 = (i + n3) / 2;
            final int compareTo2 = k.compareTo((K)this.H.get(n4).b());
            if (compareTo2 < 0) {
                n3 = n4 - 1;
            }
            else {
                if (compareTo2 <= 0) {
                    return n4;
                }
                i = n4 + 1;
            }
        }
        return -(i + 1);
    }
    
    private final V n(final int n) {
        this.p();
        final Object value = this.H.remove(n).getValue();
        if (!this.I.isEmpty()) {
            final Iterator<Map.Entry<K, V>> iterator = this.o().entrySet().iterator();
            final List<kb> h = this.H;
            final Map.Entry<K, V> entry = iterator.next();
            h.add(new kb(this, entry.getKey(), entry.getValue()));
            iterator.remove();
        }
        return (V)value;
    }
    
    private final SortedMap<K, V> o() {
        this.p();
        if (this.I.isEmpty() && !(this.I instanceof TreeMap)) {
            final TreeMap<K, V> i = new TreeMap<K, V>();
            this.I = i;
            this.L = i.descendingMap();
        }
        return (SortedMap<K, V>)(SortedMap)this.I;
    }
    
    private final void p() {
        if (!this.J) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    public void a() {
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
    
    public final int b() {
        return this.H.size();
    }
    
    public final Iterable<Entry<K, V>> c() {
        Iterable<Entry<K, V>> iterable;
        if (this.I.isEmpty()) {
            iterable = jb.a();
        }
        else {
            iterable = this.I.entrySet();
        }
        return iterable;
    }
    
    @Override
    public final void clear() {
        this.p();
        if (!this.H.isEmpty()) {
            this.H.clear();
        }
        if (!this.I.isEmpty()) {
            this.I.clear();
        }
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        final Comparable comparable = (Comparable)o;
        return this.k((K)comparable) >= 0 || this.I.containsKey(comparable);
    }
    
    public final V e(final K k, final V value) {
        this.p();
        final int i = this.k(k);
        if (i >= 0) {
            return (V)this.H.get(i).setValue(value);
        }
        this.p();
        if (this.H.isEmpty() && !(this.H instanceof ArrayList)) {
            this.H = new ArrayList<kb>(this.G);
        }
        final int n = -(i + 1);
        if (n >= this.G) {
            return this.o().put(k, value);
        }
        final int size = this.H.size();
        final int g = this.G;
        if (size == g) {
            final kb kb = this.H.remove(g - 1);
            this.o().put((K)kb.b(), (V)kb.getValue());
        }
        this.H.add(n, new kb(this, k, value));
        return null;
    }
    
    @Override
    public final Set<Entry<K, V>> entrySet() {
        if (this.K == null) {
            this.K = new pb(this, null);
        }
        return (Set<Entry<K, V>>)this.K;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rb)) {
            return super.equals(o);
        }
        final rb rb = (rb)o;
        final int size = this.size();
        if (size != rb.size()) {
            return false;
        }
        final int b = this.b();
        if (b == rb.b()) {
            for (int i = 0; i < b; ++i) {
                if (!this.g(i).equals(rb.g(i))) {
                    return false;
                }
            }
            return b == size || this.I.equals(rb.I);
        }
        return this.entrySet().equals(rb.entrySet());
    }
    
    public final Entry<K, V> g(final int n) {
        return (Entry<K, V>)this.H.get(n);
    }
    
    @Override
    public final V get(final Object o) {
        final Comparable comparable = (Comparable)o;
        final int k = this.k((K)comparable);
        if (k >= 0) {
            return (V)this.H.get(k).getValue();
        }
        return this.I.get(comparable);
    }
    
    @Override
    public final int hashCode() {
        final int b = this.b();
        int i = 0;
        int n = 0;
        while (i < b) {
            n += this.H.get(i).hashCode();
            ++i;
        }
        int n2 = n;
        if (this.I.size() > 0) {
            n2 = n + this.I.hashCode();
        }
        return n2;
    }
    
    public final boolean j() {
        return this.J;
    }
    
    @Override
    public final V remove(final Object o) {
        this.p();
        final Comparable comparable = (Comparable)o;
        final int k = this.k((K)comparable);
        if (k >= 0) {
            return this.n(k);
        }
        if (this.I.isEmpty()) {
            return null;
        }
        return this.I.remove(comparable);
    }
    
    @Override
    public final int size() {
        return this.H.size() + this.I.size();
    }
}
