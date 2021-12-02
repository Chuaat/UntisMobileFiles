// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.i;
import org.joda.time.field.v;
import org.joda.time.f;

public final class d0 extends a
{
    private static final long v0 = 6633006628097111960L;
    private transient org.joda.time.a u0;
    
    private d0(final org.joda.time.a a) {
        super(a, null);
    }
    
    private static final f c0(final f f) {
        return v.a0(f);
    }
    
    public static d0 d0(final org.joda.time.a a) {
        if (a != null) {
            return new d0(a);
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }
    
    @Override
    public org.joda.time.a R() {
        if (this.u0 == null) {
            if (this.s() == i.I) {
                this.u0 = this;
            }
            else {
                this.u0 = d0(this.Y().R());
            }
        }
        return this.u0;
    }
    
    @Override
    public org.joda.time.a S(final i i) {
        i n = i;
        if (i == null) {
            n = i.n();
        }
        if (n == i.I) {
            return this.R();
        }
        if (n == this.s()) {
            return this;
        }
        return d0(this.Y().S(n));
    }
    
    @Override
    protected void X(final a a) {
        a.E = c0(a.E);
        a.F = c0(a.F);
        a.G = c0(a.G);
        a.H = c0(a.H);
        a.I = c0(a.I);
        a.x = c0(a.x);
        a.y = c0(a.y);
        a.z = c0(a.z);
        a.D = c0(a.D);
        a.A = c0(a.A);
        a.B = c0(a.B);
        a.C = c0(a.C);
        a.m = c0(a.m);
        a.n = c0(a.n);
        a.o = c0(a.o);
        a.p = c0(a.p);
        a.q = c0(a.q);
        a.r = c0(a.r);
        a.s = c0(a.s);
        a.u = c0(a.u);
        a.t = c0(a.t);
        a.v = c0(a.v);
        a.w = c0(a.w);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof d0 && this.Y().equals(((d0)o).Y()));
    }
    
    @Override
    public int hashCode() {
        return this.Y().hashCode() * 7 + 352831696;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("StrictChronology[");
        sb.append(this.Y().toString());
        sb.append(']');
        return sb.toString();
    }
}
