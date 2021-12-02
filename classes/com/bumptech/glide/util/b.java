// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util;

import androidx.collection.m;
import androidx.collection.a;

public final class b<K, V> extends a<K, V>
{
    private int T;
    
    @Override
    public void clear() {
        this.T = 0;
        super.clear();
    }
    
    @Override
    public int hashCode() {
        if (this.T == 0) {
            this.T = super.hashCode();
        }
        return this.T;
    }
    
    @Override
    public void j(final m<? extends K, ? extends V> m) {
        this.T = 0;
        super.j(m);
    }
    
    @Override
    public V k(final int n) {
        this.T = 0;
        return super.k(n);
    }
    
    @Override
    public V n(final int n, final V v) {
        this.T = 0;
        return super.n(n, v);
    }
    
    @Override
    public V put(final K k, final V v) {
        this.T = 0;
        return super.put(k, v);
    }
}
