// 
// Decompiled by Procyon v0.5.36
// 

package androidx.arch.core.internal;

import java.util.Map;
import androidx.annotation.j0;
import java.util.HashMap;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class a<K, V> extends b<K, V>
{
    private HashMap<K, c<K, V>> K;
    
    public a() {
        this.K = new HashMap<K, c<K, V>>();
    }
    
    public boolean contains(final K key) {
        return this.K.containsKey(key);
    }
    
    @Override
    protected c<K, V> f(final K key) {
        return this.K.get(key);
    }
    
    @Override
    public V l(@j0 final K key, @j0 final V v) {
        final c<K, V> f = this.f(key);
        if (f != null) {
            return f.H;
        }
        this.K.put(key, this.k(key, v));
        return null;
    }
    
    @Override
    public V m(@j0 final K key) {
        final V m = super.m(key);
        this.K.remove(key);
        return m;
    }
    
    public Map.Entry<K, V> n(final K key) {
        if (this.contains(key)) {
            return this.K.get(key).J;
        }
        return null;
    }
}
