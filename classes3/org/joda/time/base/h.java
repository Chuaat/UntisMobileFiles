// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.base;

import org.joda.time.e0;
import org.joda.time.d0;
import org.joda.time.a;
import org.joda.time.r;
import org.joda.time.l0;
import org.joda.time.convert.d;
import org.joda.time.field.j;
import java.io.Serializable;
import org.joda.time.k0;

public abstract class h extends b implements k0, Serializable
{
    private static final long H = 2581698638990L;
    private volatile long G;
    
    protected h(final long g) {
        this.G = g;
    }
    
    protected h(final long n, final long n2) {
        this.G = j.m(n2, n);
    }
    
    protected h(final Object o) {
        this.G = d.m().k(o).f(o);
    }
    
    protected h(final l0 l0, final l0 l2) {
        long m;
        if (l0 == l2) {
            m = 0L;
        }
        else {
            m = j.m(org.joda.time.h.j(l2), org.joda.time.h.j(l0));
        }
        this.G = m;
    }
    
    protected void N3(final long g) {
        this.G = g;
    }
    
    public r d(final l0 l0) {
        return new r(l0, this);
    }
    
    public r f(final l0 l0) {
        return new r(this, l0);
    }
    
    public d0 g(final a a) {
        return new d0(this.n(), a);
    }
    
    public d0 h(final e0 e0) {
        return new d0(this.n(), e0);
    }
    
    public d0 i(final e0 e0, final a a) {
        return new d0(this.n(), e0, a);
    }
    
    public d0 j(final l0 l0) {
        return new d0(l0, this);
    }
    
    public d0 k(final l0 l0, final e0 e0) {
        return new d0(l0, this, e0);
    }
    
    public d0 l(final l0 l0) {
        return new d0(this, l0);
    }
    
    public d0 m(final l0 l0, final e0 e0) {
        return new d0(this, l0, e0);
    }
    
    @Override
    public long n() {
        return this.G;
    }
}
