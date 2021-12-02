// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Iterator;
import java.util.AbstractSet;

final class b2 extends AbstractSet<Object>
{
    private final /* synthetic */ v1 G;
    
    b2(final v1 g) {
        this.G = g;
    }
    
    @Override
    public final void clear() {
        this.G.clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.G.containsKey(o);
    }
    
    @Override
    public final Iterator<Object> iterator() {
        return this.G.t();
    }
    
    @Override
    public final boolean remove(@NullableDecl final Object o) {
        final Map n = this.G.n();
        if (n != null) {
            return n.keySet().remove(o);
        }
        return this.G.k(o) != v1.P;
    }
    
    @Override
    public final int size() {
        return this.G.size();
    }
}
