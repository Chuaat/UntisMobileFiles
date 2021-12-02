// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

final class e5 extends g5
{
    private int G;
    private final int H;
    private final /* synthetic */ f5 I;
    
    e5(final f5 i) {
        this.I = i;
        this.G = 0;
        this.H = i.f();
    }
    
    @Override
    public final boolean hasNext() {
        return this.G < this.H;
    }
    
    @Override
    public final byte zza() {
        final int g = this.G;
        if (g < this.H) {
            this.G = g + 1;
            return this.I.r(g);
        }
        throw new NoSuchElementException();
    }
}
