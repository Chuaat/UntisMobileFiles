// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import java.util.NoSuchElementException;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import f2.a;
import java.util.Iterator;

@a
public class c<T> implements Iterator<T>
{
    @RecentlyNonNull
    protected final b<T> G;
    @RecentlyNonNull
    protected int H;
    
    public c(@RecentlyNonNull final b<T> b) {
        this.G = x.k(b);
        this.H = -1;
    }
    
    @RecentlyNonNull
    @Override
    public boolean hasNext() {
        return this.H < this.G.getCount() - 1;
    }
    
    @RecentlyNonNull
    @Override
    public T next() {
        if (this.hasNext()) {
            final b<T> g = this.G;
            final int h = this.H + 1;
            this.H = h;
            return g.get(h);
        }
        final int h2 = this.H;
        final StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(h2);
        throw new NoSuchElementException(sb.toString());
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
