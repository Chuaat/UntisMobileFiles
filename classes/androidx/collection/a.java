// 
// Decompiled by Procyon v0.5.36
// 

package androidx.collection;

import java.util.Iterator;
import androidx.annotation.j0;
import java.util.Collection;
import java.util.Set;
import androidx.annotation.k0;
import java.util.Map;

public class a<K, V> extends m<K, V> implements Map<K, V>
{
    @k0
    l<K, V> S;
    
    public a() {
    }
    
    public a(final int n) {
        super(n);
    }
    
    public a(final m m) {
        super(m);
    }
    
    private l<K, V> q() {
        if (this.S == null) {
            this.S = new l<K, V>() {
                @Override
                protected void a() {
                    a.this.clear();
                }
                
                @Override
                protected Object b(final int n, final int n2) {
                    return a.this.H[(n << 1) + n2];
                }
                
                @Override
                protected Map<K, V> c() {
                    return (Map<K, V>)a.this;
                }
                
                @Override
                protected int d() {
                    return a.this.I;
                }
                
                @Override
                protected int e(final Object o) {
                    return a.this.f(o);
                }
                
                @Override
                protected int f(final Object o) {
                    return a.this.h(o);
                }
                
                @Override
                protected void g(final K k, final V v) {
                    a.this.put(k, v);
                }
                
                @Override
                protected void h(final int n) {
                    a.this.k(n);
                }
                
                @Override
                protected V i(final int n, final V v) {
                    return a.this.n(n, v);
                }
            };
        }
        return this.S;
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        return this.q().l();
    }
    
    @Override
    public Set<K> keySet() {
        return this.q().m();
    }
    
    public boolean p(@j0 final Collection<?> collection) {
        return l.j((Map<Object, Object>)this, collection);
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends V> map) {
        this.c(super.I + map.size());
        for (final Entry<? extends K, ? extends V> entry : map.entrySet()) {
            this.put((K)entry.getKey(), (V)entry.getValue());
        }
    }
    
    public boolean r(@j0 final Collection<?> collection) {
        return l.o((Map<Object, Object>)this, collection);
    }
    
    public boolean s(@j0 final Collection<?> collection) {
        return l.p((Map<Object, Object>)this, collection);
    }
    
    @Override
    public Collection<V> values() {
        return this.q().n();
    }
}
