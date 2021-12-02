// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class g implements q
{
    private final boolean G;
    
    public g(final Boolean b) {
        this.G = (b != null && b);
    }
    
    @Override
    public final q c() {
        return new g(this.G);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof g && this.G == ((g)o).G);
    }
    
    @Override
    public final Double g() {
        double d;
        if (!this.G) {
            d = 0.0;
        }
        else {
            d = 1.0;
        }
        return d;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.valueOf(this.G).hashCode();
    }
    
    @Override
    public final q i(final String anObject, final g5 g5, final List<q> list) {
        if ("toString".equals(anObject)) {
            return new u(Boolean.toString(this.G));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.G), anObject));
    }
    
    @Override
    public final String k() {
        return Boolean.toString(this.G);
    }
    
    @Override
    public final Boolean m() {
        return this.G;
    }
    
    @Override
    public final Iterator<q> p() {
        return null;
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.G);
    }
}
