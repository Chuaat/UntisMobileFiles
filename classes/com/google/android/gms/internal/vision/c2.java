// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

abstract class c2<T> implements Iterator<T>
{
    private int G;
    private int H;
    private int I;
    private final /* synthetic */ v1 J;
    
    private c2(final v1 j) {
        this.J = j;
        this.G = j.K;
        this.H = j.r();
        this.I = -1;
    }
    
    private final void b() {
        if (this.J.K == this.G) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    abstract T a(final int p0);
    
    @Override
    public boolean hasNext() {
        return this.H >= 0;
    }
    
    @Override
    public T next() {
        this.b();
        if (this.hasNext()) {
            final int h = this.H;
            this.I = h;
            final T a = this.a(h);
            this.H = this.J.a(this.H);
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public void remove() {
        this.b();
        k1.h(this.I >= 0, "no calls to next() since the last call to remove()");
        this.G += 32;
        final v1 j = this.J;
        j.remove(j.I[this.I]);
        this.H = v1.h(this.H, this.I);
        this.I = -1;
    }
}
