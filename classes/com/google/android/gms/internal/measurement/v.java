// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class v implements q
{
    @Override
    public final q c() {
        return q.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || o instanceof v;
    }
    
    @Override
    public final Double g() {
        return Double.NaN;
    }
    
    @Override
    public final q i(final String s, final g5 g5, final List<q> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", s));
    }
    
    @Override
    public final String k() {
        return "undefined";
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
