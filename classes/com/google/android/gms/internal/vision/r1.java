// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Map;

abstract class r1<K, V> implements Entry<K, V>
{
    @Override
    public boolean equals(@NullableDecl final Object o) {
        if (o instanceof Entry) {
            final Entry entry = (Entry)o;
            if (e1.a(this.getKey(), entry.getKey()) && e1.a(this.getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public abstract K getKey();
    
    @Override
    public abstract V getValue();
    
    @Override
    public int hashCode() {
        final Object key = this.getKey();
        final Object value = this.getValue();
        int hashCode = 0;
        int hashCode2;
        if (key == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = key.hashCode();
        }
        if (value != null) {
            hashCode = value.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public V setValue(final V v) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public String toString() {
        final String value = String.valueOf(this.getKey());
        final String value2 = String.valueOf(this.getValue());
        final StringBuilder sb = new StringBuilder(value.length() + 1 + value2.length());
        sb.append(value);
        sb.append("=");
        sb.append(value2);
        return sb.toString();
    }
}
