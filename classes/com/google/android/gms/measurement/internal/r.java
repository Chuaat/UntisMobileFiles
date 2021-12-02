// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.Iterator;

final class r implements Iterator<String>
{
    final Iterator<String> G;
    final /* synthetic */ s H;
    
    r(final s h) {
        this.H = h;
        this.G = s.M(h).keySet().iterator();
    }
    
    public final String a() {
        return this.G.next();
    }
    
    @Override
    public final boolean hasNext() {
        return this.G.hasNext();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
