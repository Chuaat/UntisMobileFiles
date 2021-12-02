// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zb implements Iterator<String>
{
    final Iterator<String> G;
    final /* synthetic */ ac H;
    
    zb(final ac h) {
        this.H = h;
        this.G = ac.b(h).iterator();
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
