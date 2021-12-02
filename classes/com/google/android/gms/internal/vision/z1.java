// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Map;
import java.util.AbstractSet;

final class z1 extends AbstractSet<Map.Entry<Object, Object>>
{
    private final /* synthetic */ v1 G;
    
    z1(final v1 g) {
        this.G = g;
    }
    
    @Override
    public final void clear() {
        this.G.clear();
    }
    
    @Override
    public final boolean contains(@NullableDecl final Object o) {
        final Map n = this.G.n();
        if (n != null) {
            return n.entrySet().contains(o);
        }
        if (o instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)o;
            final int j = this.G.d(entry.getKey());
            if (j != -1 && e1.a(this.G.J[j], entry.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final Iterator<Map.Entry<Object, Object>> iterator() {
        return this.G.u();
    }
    
    @Override
    public final boolean remove(@NullableDecl Object key) {
        final Map n = this.G.n();
        if (n != null) {
            return n.entrySet().remove(key);
        }
        if (!(key instanceof Map.Entry)) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)key;
        if (this.G.g()) {
            return false;
        }
        final int i = this.G.x();
        key = entry.getKey();
        final Object value = entry.getValue();
        final Object p = this.G.G;
        final v1 g = this.G;
        final int c = h2.c(key, value, i, p, g.H, g.I, g.J);
        if (c == -1) {
            return false;
        }
        this.G.f(c, i);
        this.G.L--;
        this.G.q();
        return true;
    }
    
    @Override
    public final int size() {
        return this.G.size();
    }
}
