// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

final class yb implements ListIterator<String>
{
    final ListIterator<String> G;
    final /* synthetic */ int H;
    final /* synthetic */ ac I;
    
    yb(final ac i, final int h) {
        this.I = i;
        this.H = h;
        this.G = ac.b(i).listIterator(h);
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
