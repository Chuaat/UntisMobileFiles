// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.AbstractList;

public final class g4 extends AbstractList<String> implements a2, RandomAccess
{
    private final a2 G;
    
    public g4(final a2 g) {
        this.G = g;
    }
    
    @Override
    public final a2 c5() {
        return this;
    }
    
    @Override
    public final Iterator<String> iterator() {
        return new i4(this);
    }
    
    @Override
    public final ListIterator<String> listIterator(final int n) {
        return new h4(this, n);
    }
    
    @Override
    public final Object q5(final int n) {
        return this.G.q5(n);
    }
    
    @Override
    public final int size() {
        return this.G.size();
    }
    
    @Override
    public final List<?> y() {
        return this.G.y();
    }
}
