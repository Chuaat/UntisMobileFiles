// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Iterator;

final class e implements Iterator<q>
{
    private int G;
    final /* synthetic */ f H;
    
    e(final f h) {
        this.H = h;
        this.G = 0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.G < this.H.n();
    }
}
