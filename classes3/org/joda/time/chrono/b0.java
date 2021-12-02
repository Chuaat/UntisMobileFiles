// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.i;
import org.joda.time.field.l;
import org.joda.time.f;

public final class b0 extends a
{
    private static final long v0 = -3148237568046877177L;
    private transient org.joda.time.a u0;
    
    private b0(final org.joda.time.a a) {
        super(a, null);
    }
    
    private final f c0(final f f) {
        return l.a0(f, this.Y());
    }
    
    public static b0 d0(final org.joda.time.a a) {
        if (a != null) {
            return new b0(a);
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
        a.E = this.c0(a.E);
        a.F = this.c0(a.F);
        a.G = this.c0(a.G);
        a.H = this.c0(a.H);
        a.I = this.c0(a.I);
        a.x = this.c0(a.x);
        a.y = this.c0(a.y);
        a.z = this.c0(a.z);
        a.D = this.c0(a.D);
        a.A = this.c0(a.A);
        a.B = this.c0(a.B);
        a.C = this.c0(a.C);
        a.m = this.c0(a.m);
        a.n = this.c0(a.n);
        a.o = this.c0(a.o);
        a.p = this.c0(a.p);
        a.q = this.c0(a.q);
        a.r = this.c0(a.r);
        a.s = this.c0(a.s);
        a.u = this.c0(a.u);
        a.t = this.c0(a.t);
        a.v = this.c0(a.v);
        a.w = this.c0(a.w);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof b0 && this.Y().equals(((b0)o).Y()));
    }
    
    @Override
    public int hashCode() {
        return this.Y().hashCode() * 7 + 236548278;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LenientChronology[");
        sb.append(this.Y().toString());
        sb.append(']');
        return sb.toString();
    }
}
