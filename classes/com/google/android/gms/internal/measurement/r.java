// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public final class r implements q
{
    private final String G;
    private final ArrayList<q> H;
    
    public r(final String g, final List<q> c) {
        this.G = g;
        (this.H = new ArrayList<q>()).addAll(c);
    }
    
    public final String a() {
        return this.G;
    }
    
    public final ArrayList<q> b() {
        return this.H;
    }
    
    @Override
    public final q c() {
        return this;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r)) {
            return false;
        }
        final r r = (r)o;
        final String g = this.G;
        if (g != null) {
            if (g.equals(r.G)) {
                return this.H.equals(r.H);
            }
        }
        else if (r.G == null) {
            return this.H.equals(r.H);
        }
        return false;
    }
    
    @Override
    public final Double g() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }
    
    @Override
    public final int hashCode() {
        final String g = this.G;
        int hashCode;
        if (g != null) {
            hashCode = g.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode * 31 + this.H.hashCode();
    }
    
    @Override
    public final q i(final String s, final g5 g5, final List<q> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
    
    @Override
    public final String k() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
    
    @Override
    public final Boolean m() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }
    
    @Override
    public final Iterator<q> p() {
        return null;
    }
}
