// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.ListIterator;

final class o9 implements ListIterator<String>
{
    private ListIterator<String> G;
    private final /* synthetic */ int H;
    private final /* synthetic */ p9 I;
    
    o9(final p9 i, final int h) {
        this.I = i;
        this.H = h;
        this.G = i.G.listIterator(h);
    }
    
    @Override
    public final boolean hasNext() {
        return this.G.hasNext();
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.G.hasPrevious();
    }
    
    @Override
    public final int nextIndex() {
        return this.G.nextIndex();
    }
    
    @Override
    public final int previousIndex() {
        return this.G.previousIndex();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
