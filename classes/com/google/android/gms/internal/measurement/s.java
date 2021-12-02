// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Iterator;

final class s implements Iterator<q>
{
    private int G;
    final /* synthetic */ u H;
    
    s(final u h) {
        this.H = h;
        this.G = 0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.G < u.b(this.H).length();
    }
}
