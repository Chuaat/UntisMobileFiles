// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class l implements Iterator<q>
{
    final /* synthetic */ Iterator G;
    
    l(final Iterator g) {
        this.G = g;
    }
    
    @Override
    public final boolean hasNext() {
        return this.G.hasNext();
    }
}
