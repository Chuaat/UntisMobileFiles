// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractList;

public final class p9 extends AbstractList<String> implements j7, RandomAccess
{
    private final j7 G;
    
    public p9(final j7 g) {
        this.G = g;
    }
    
    @Override
    public final List<?> c() {
        return this.G.c();
    }
    
    @Override
    public final j7 e() {
        return this;
    }
    
    @Override
    public final Iterator<String> iterator() {
        return new s9(this);
    }
    
    @Override
    public final ListIterator<String> listIterator(final int n) {
        return new o9(this, n);
    }
    
    @Override
    public final void q4(final f5 f5) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object s(final int n) {
        return this.G.s(n);
    }
    
    @Override
    public final int size() {
        return this.G.size();
    }
}
