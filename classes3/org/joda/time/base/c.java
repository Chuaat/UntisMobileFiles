// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.base;

import org.joda.convert.ToString;
import java.util.Date;
import org.joda.time.field.j;
import org.joda.time.f;
import org.joda.time.g;
import org.joda.time.q;
import org.joda.time.format.b;
import org.joda.time.a;
import org.joda.time.chrono.x;
import org.joda.time.h;
import org.joda.time.z;
import org.joda.time.i;
import org.joda.time.l0;

public abstract class c implements l0
{
    protected c() {
    }
    
    public z B(final i i) {
        return new z(this.n(), h.e(this.t()).S(i));
    }
    
    @Override
    public boolean C(final l0 l0) {
        return this.i(h.j(l0));
    }
    
    public z E() {
        return new z(this.n(), x.d0(this.K2()));
    }
    
    public String I(final b b) {
        if (b == null) {
            return this.toString();
        }
        return b.v(this);
    }
    
    public z I3() {
        return new z(this.n(), this.K2());
    }
    
    @Override
    public i K2() {
        return this.t().s();
    }
    
    @Override
    public boolean R(final l0 l0) {
        return this.f(h.j(l0));
    }
    
    @Override
    public q S2() {
        return new q(this.n());
    }
    
    @Override
    public boolean X4(final l0 l0) {
        return this.l(h.j(l0));
    }
    
    @Override
    public boolean Z(final g g) {
        return g != null && g.G(this.t()).M();
    }
    
    public int b(final l0 l0) {
        if (this == l0) {
            return 0;
        }
        final long n = lcmp(this.n(), l0.n());
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        return 1;
    }
    
    public int d(final f f) {
        if (f != null) {
            return f.g(this.n());
        }
        throw new IllegalArgumentException("The DateTimeField must not be null");
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof l0)) {
            return false;
        }
        final l0 l0 = (l0)o;
        if (this.n() != l0.n() || !j.a(this.t(), l0.t())) {
            b = false;
        }
        return b;
    }
    
    public boolean f(final long n) {
        return this.n() > n;
    }
    
    public boolean g() {
        return this.f(h.c());
    }
    
    @Override
    public int hashCode() {
        return (int)(this.n() ^ this.n() >>> 32) + this.t().hashCode();
    }
    
    public boolean i(final long n) {
        return this.n() < n;
    }
    
    public boolean j() {
        return this.i(h.c());
    }
    
    @Override
    public int j0(final g g) {
        if (g != null) {
            return g.G(this.t()).g(this.n());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }
    
    public boolean l(final long n) {
        return this.n() == n;
    }
    
    public boolean m() {
        return this.l(h.c());
    }
    
    public Date s() {
        return new Date(this.n());
    }
    
    @ToString
    @Override
    public String toString() {
        return org.joda.time.format.j.B().v(this);
    }
    
    public org.joda.time.c u(final a a) {
        return new org.joda.time.c(this.n(), a);
    }
    
    public org.joda.time.c v(final i i) {
        return new org.joda.time.c(this.n(), h.e(this.t()).S(i));
    }
    
    public org.joda.time.c y() {
        return new org.joda.time.c(this.n(), x.d0(this.K2()));
    }
    
    public org.joda.time.c y0() {
        return new org.joda.time.c(this.n(), this.K2());
    }
    
    public z z(final a a) {
        return new z(this.n(), a);
    }
}
