// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;
import java.util.Iterator;

final class a9 implements Iterator<Object>
{
    @Override
    public final boolean hasNext() {
        return false;
    }
    
    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
