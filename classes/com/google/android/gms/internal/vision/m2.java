// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Map;
import java.io.Serializable;

public abstract class m2<K, V> implements Serializable, Map<K, V>
{
    private static final Entry<?, ?>[] J;
    private transient q2<Entry<K, V>> G;
    private transient q2<K> H;
    private transient i2<V> I;
    
    static {
        J = new Entry[0];
    }
    
    m2() {
    }
    
    abstract q2<Entry<K, V>> a();
    
    abstract q2<K> b();
    
    abstract i2<V> c();
    
    @Deprecated
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean containsKey(@NullableDecl final Object o) {
        return this.get(o) != null;
    }
    
    @Override
    public boolean containsValue(@NullableDecl final Object o) {
        return ((i2)this.values()).contains(o);
    }
    
    @Override
    public /* synthetic */ Set entrySet() {
        q2<Entry<K, V>> g;
        if ((g = this.G) == null) {
            g = this.a();
            this.G = g;
        }
        return g;
    }
    
    @Override
    public boolean equals(@NullableDecl final Object o) {
        return this == o || (o instanceof Map && this.entrySet().equals(((Map)o).entrySet()));
    }
    
    @Override
    public abstract V get(@NullableDecl final Object p0);
    
    @Override
    public final V getOrDefault(@NullableDecl Object value, @NullableDecl final V v) {
        value = this.get(value);
        if (value != null) {
            return (V)value;
        }
        return v;
    }
    
    @Override
    public int hashCode() {
        return f3.a(this.entrySet());
    }
    
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Deprecated
    @Override
    public final V put(final K k, final V v) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final void putAll(final Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final V remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public String toString() {
        final int size = this.size();
        if (size >= 0) {
            final StringBuilder sb = new StringBuilder((int)Math.min((long)size << 3, 1073741824L));
            sb.append('{');
            int n = 1;
            for (final Entry<K, V> entry : this.entrySet()) {
                if (n == 0) {
                    sb.append(", ");
                }
                n = 0;
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
            }
            sb.append('}');
            return sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder("size".length() + 40);
        sb2.append("size");
        sb2.append(" cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    @Override
    public /* synthetic */ Collection values() {
        i2<V> i;
        if ((i = this.I) == null) {
            i = this.c();
            this.I = i;
        }
        return i;
    }
}
