// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;

final class s9 implements Iterator<String>
{
    private Iterator<String> G;
    private final /* synthetic */ p9 H;
    
    s9(final p9 h) {
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
