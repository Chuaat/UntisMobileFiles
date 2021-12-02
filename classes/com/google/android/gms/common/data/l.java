// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import java.util.NoSuchElementException;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public class l<T> extends c<T>
{
    private T I;
    
    public l(@RecentlyNonNull final b<T> b) {
        super(b);
    }
    
    @RecentlyNonNull
    @Override
    public T next() {
        if (this.hasNext()) {
            if (++super.H == 0) {
                final T k = x.k(super.G.get(0));
                this.I = k;
                if (!(k instanceof f)) {
                    final String value = String.valueOf(this.I.getClass());
                    final StringBuilder sb = new StringBuilder(value.length() + 44);
                    sb.append("DataBuffer reference of type ");
                    sb.append(value);
                    sb.append(" is not movable");
                    throw new IllegalStateException(sb.toString());
                }
            }
            else {
                x.k((f)this.I).n(super.H);
            }
            return this.I;
        }
        final int h = super.H;
        final StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Cannot advance the iterator beyond ");
        sb2.append(h);
        throw new NoSuchElementException(sb2.toString());
    }
}
