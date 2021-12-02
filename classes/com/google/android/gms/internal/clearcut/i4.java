// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

final class i4 implements Iterator<String>
{
    private Iterator<String> G;
    private final /* synthetic */ g4 H;
    
    i4(final g4 h) {
        this.H = h;
        this.G = h.G.iterator();
    }
    
    @Override
    public final boolean hasNext() {
        return this.G.hasNext();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
