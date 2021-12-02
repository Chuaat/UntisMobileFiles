// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public abstract class j implements q, m
{
    protected final String G;
    protected final Map<String, q> H;
    
    public j(final String g) {
        this.H = new HashMap<String, q>();
        this.G = g;
    }
    
    public abstract q a(final g5 p0, final List<q> p1);
    
    @Override
    public final boolean b(final String s) {
        return this.H.containsKey(s);
    }
    
    @Override
    public q c() {
        return this;
    }
    
    public final String d() {
        return this.G;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final j j = (j)o;
        final String g = this.G;
        return g != null && g.equals(j.G);
    }
    
    @Override
    public final void f(final String s, final q q) {
        if (q == null) {
            this.H.remove(s);
            return;
        }
        this.H.put(s, q);
    }
    
    @Override
    public final Double g() {
        return Double.NaN;
    }
    
    @Override
    public final q h(final String s) {
        if (this.H.containsKey(s)) {
            return this.H.get(s);
        }
        return q.f;
    }
    
    @Override
    public final int hashCode() {
        final String g = this.G;
        if (g != null) {
            return g.hashCode();
        }
        return 0;
    }
    
    @Override
    public final q i(final String anObject, final g5 g5, final List<q> list) {
        if ("toString".equals(anObject)) {
            return new u(this.G);
        }
        return com.google.android.gms.internal.measurement.k.a(this, new u(anObject), g5, list);
    }
    
    @Override
    public final String k() {
        return this.G;
    }
    
    @Override
    public final Boolean m() {
        return Boolean.TRUE;
    }
    
    @Override
    public final Iterator<q> p() {
        return com.google.android.gms.internal.measurement.k.b(this.H);
    }
}
