// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.AbstractCollection;

final class d2 extends AbstractCollection<Object>
{
    private final /* synthetic */ v1 G;
    
    d2(final v1 g) {
        this.G = g;
    }
    
    @Override
    public final void clear() {
        this.G.clear();
    }
    
    @Override
    public final Iterator<Object> iterator() {
        return this.G.v();
    }
    
    @Override
    public final int size() {
        return this.G.size();
    }
}
