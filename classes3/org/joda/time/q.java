// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import org.joda.time.format.b;
import org.joda.convert.FromString;
import org.joda.time.field.j;
import org.joda.time.chrono.x;
import org.joda.time.convert.d;
import java.io.Serializable;
import org.joda.time.base.c;

public final class q extends c implements l0, Serializable
{
    public static final q H;
    private static final long I = 3299096530934209741L;
    private final long G;
    
    static {
        H = new q(0L);
    }
    
    public q() {
        this.G = h.c();
    }
    
    public q(final long g) {
        this.G = g;
    }
    
    public q(final Object o) {
        this.G = d.m().n(o).d(o, x.e0());
    }
    
    public static q Q() {
        return new q();
    }
    
    public static q T(final long n) {
        return new q(n);
    }
    
    public static q U(final long n) {
        return new q(j.i(n, 1000));
    }
    
    @FromString
    public static q V(final String s) {
        return a0(s, org.joda.time.format.j.D());
    }
    
    public static q a0(final String s, final b b) {
        return b.n(s).S2();
    }
    
    @Deprecated
    @Override
    public z E() {
        return this.I3();
    }
    
    @Override
    public z I3() {
        return new z(this.n(), x.c0());
    }
    
    public q O(final long n) {
        return this.i0(n, -1);
    }
    
    public q P(final k0 k0) {
        return this.k0(k0, -1);
    }
    
    @Override
    public q S2() {
        return this;
    }
    
    public q b0(final long n) {
        return this.i0(n, 1);
    }
    
    public q c0(final k0 k0) {
        return this.k0(k0, 1);
    }
    
    public q i0(final long n, final int n2) {
        if (n != 0L && n2 != 0) {
            return this.l0(this.t().a(this.n(), n, n2));
        }
        return this;
    }
    
    public q k0(final k0 k0, final int n) {
        if (k0 != null && n != 0) {
            return this.i0(k0.n(), n);
        }
        return this;
    }
    
    public q l0(final long n) {
        q q;
        if (n == this.G) {
            q = this;
        }
        else {
            q = new q(n);
        }
        return q;
    }
    
    @Override
    public long n() {
        return this.G;
    }
    
    @Override
    public a t() {
        return x.e0();
    }
    
    @Deprecated
    @Override
    public org.joda.time.c y() {
        return this.y0();
    }
    
    @Override
    public org.joda.time.c y0() {
        return new org.joda.time.c(this.n(), x.c0());
    }
}
