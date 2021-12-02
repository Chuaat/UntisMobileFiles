// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

final class v2 extends i3<Object>
{
    private boolean G;
    private final /* synthetic */ Object H;
    
    v2(final Object h) {
        this.H = h;
    }
    
    @Override
    public final boolean hasNext() {
        return !this.G;
    }
    
    @Override
    public final Object next() {
        if (!this.G) {
            this.G = true;
            return this.H;
        }
        throw new NoSuchElementException();
    }
}
