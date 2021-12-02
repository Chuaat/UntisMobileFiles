// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class x7 extends a8
{
    private int G;
    private final int H;
    final /* synthetic */ h8 I;
    
    x7(final h8 i) {
        this.I = i;
        this.G = 0;
        this.H = i.h();
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
            return this.I.f(g);
        }
        throw new NoSuchElementException();
    }
}
