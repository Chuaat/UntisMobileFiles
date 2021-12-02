// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class o implements q
{
    @Override
    public final q c() {
        return q.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || o instanceof o;
    }
    
    @Override
    public final Double g() {
        return 0.0;
    }
    
    @Override
    public final int hashCode() {
        return 1;
    }
    
    @Override
    public final q i(final String s, final g5 g5, final List<q> list) {
        throw new IllegalStateException(String.format("null has no function %s", s));
    }
    
    @Override
    public final String k() {
        return "null";
    }
    
    @Override
    public final Boolean m() {
        return Boolean.FALSE;
    }
    
    @Override
    public final Iterator<q> p() {
        return null;
    }
}
