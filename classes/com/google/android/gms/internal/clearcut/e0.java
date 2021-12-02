// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.NoSuchElementException;
import java.util.Iterator;

final class e0 implements Iterator
{
    private int G;
    private final int H;
    private final /* synthetic */ d0 I;
    
    e0(final d0 i) {
        this.I = i;
        this.G = 0;
        this.H = i.size();
    }
    
    private final byte n() {
        try {
            return this.I.p(this.G++);
        }
        catch (IndexOutOfBoundsException ex) {
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    @Override
    public final boolean hasNext() {
        return this.G < this.H;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
