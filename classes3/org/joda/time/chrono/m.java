// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.field.r;
import org.joda.time.g;
import org.joda.time.field.n;
import org.joda.time.field.u;
import org.joda.time.field.x;
import org.joda.time.j0;
import org.joda.time.c;
import org.joda.time.l0;
import org.joda.time.i;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.f;

public final class m extends a
{
    private static final long u0 = -3474595157769370126L;
    public static final int v0 = 1;
    private static final f w0;
    private static final int x0 = 543;
    private static final ConcurrentHashMap<i, m> y0;
    private static final m z0;
    
    static {
        w0 = new org.joda.time.chrono.i("BE");
        y0 = new ConcurrentHashMap<i, m>();
        z0 = d0(i.I);
    }
    
    private m(final org.joda.time.a a, final Object o) {
        super(a, o);
    }
    
    public static m c0() {
        return d0(i.n());
    }
    
    public static m d0(final i i) {
        i n = i;
        if (i == null) {
            n = i.n();
        }
        final ConcurrentHashMap<i, m> y0 = m.y0;
        m value;
        if ((value = y0.get(n)) == null) {
            final m m = new m(q.k0(n, null), null);
            value = new m(c0.f0(m, new c(1, 1, 1, 0, 0, 0, 0, m), null), "");
            final m j = y0.putIfAbsent(n, value);
            if (j != null) {
                value = j;
            }
        }
        return value;
    }
    
    public static m e0() {
        return m.z0;
    }
    
    private Object f0() {
        final org.joda.time.a y = this.Y();
        m m;
        if (y == null) {
            m = e0();
        }
        else {
            m = d0(y.s());
        }
        return m;
    }
    
    @Override
    public org.joda.time.a R() {
        return m.z0;
    }
    
    @Override
    public org.joda.time.a S(final i i) {
        i n = i;
        if (i == null) {
            n = i.n();
        }
        if (n == this.s()) {
            return this;
        }
        return d0(n);
    }
    
    @Override
    protected void X(final a a) {
        if (this.Z() == null) {
            a.l = x.I(org.joda.time.m.c());
            final n e = new n(new u(this, a.E), 543);
            a.E = e;
            a.F = new org.joda.time.field.g(e, a.l, g.Z());
            a.B = new n(new u(this, a.B), 543);
            final org.joda.time.field.i h = new org.joda.time.field.i(new n(a.F, 99), a.l, g.x(), 100);
            a.H = h;
            a.k = h.t();
            a.G = new n(new r((org.joda.time.field.i)a.H), g.Y(), 1);
            a.C = new n(new r(a.B, a.k, g.W(), 100), g.W(), 1);
            a.I = m.w0;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof m && this.s().equals(((m)o).s()));
    }
    
    @Override
    public int hashCode() {
        return 499287079 + this.s().hashCode();
    }
    
    @Override
    public String toString() {
        final i s = this.s();
        String string = "BuddhistChronology";
        if (s != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("BuddhistChronology");
            sb.append('[');
            sb.append(s.q());
            sb.append(']');
            string = sb.toString();
        }
        return string;
    }
}
