// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractList;

public final class ac extends AbstractList<String> implements RandomAccess, z9
{
    private final z9 G;
    
    public ac(final z9 g) {
        this.G = g;
    }
    
    @Override
    public final Object J1(final int n) {
        return this.G.J1(n);
    }
    
    @Override
    public final z9 e() {
        return this;
    }
    
    @Override
    public final List<?> g() {
        return this.G.g();
    }
    
    @Override
    public final Iterator<String> iterator() {
        return new zb(this);
    }
    
    @Override
    public final ListIterator<String> listIterator(final int n) {
        return new yb(this, n);
    }
    
    @Override
    public final int size() {
        return this.G.size();
    }
    
    @Override
    public final void x2(final h8 h8) {
        throw new UnsupportedOperationException();
    }
}
