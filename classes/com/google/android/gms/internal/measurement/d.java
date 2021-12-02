// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Iterator;

final class d implements Iterator<q>
{
    final /* synthetic */ Iterator G;
    final /* synthetic */ Iterator H;
    
    d(final f f, final Iterator g, final Iterator h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final boolean hasNext() {
        return this.G.hasNext() || this.H.hasNext();
    }
}
