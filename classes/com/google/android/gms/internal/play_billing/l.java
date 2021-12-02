// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

abstract class l<E> extends s<E>
{
    private final int G;
    private int H;
    
    protected l(final int g, final int h) {
        j.b(h, g, "index");
        this.G = g;
        this.H = h;
    }
    
    protected abstract E a(final int p0);
    
    @Override
    public final boolean hasNext() {
        return this.H < this.G;
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.H > 0;
    }
    
    @Override
    public final E next() {
        if (this.hasNext()) {
            return this.a(this.H++);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final int nextIndex() {
        return this.H;
    }
    
    @Override
    public final E previous() {
        if (this.hasPrevious()) {
            final int h = this.H - 1;
            this.H = h;
            return this.a(h);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final int previousIndex() {
        return this.H - 1;
    }
}
