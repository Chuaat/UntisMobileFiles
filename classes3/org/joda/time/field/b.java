// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.g;
import org.joda.time.l;
import org.joda.time.h;
import org.joda.time.a;
import java.util.Locale;
import org.joda.time.n0;
import org.joda.time.l0;
import org.joda.time.f;
import org.joda.time.r;
import java.io.Serializable;

public abstract class b implements Serializable
{
    private static final long G = 1971226328211649661L;
    
    public long B() {
        return this.m().N(this.u());
    }
    
    public r C() {
        final f m = this.m();
        final long p = m.P(this.u());
        return new r(p, m.a(p, 1), this.i());
    }
    
    public int a(final l0 l0) {
        if (l0 == null) {
            throw new IllegalArgumentException("The instant must not be null");
        }
        final int c = this.c();
        final int j0 = l0.j0(this.n());
        if (c < j0) {
            return -1;
        }
        if (c > j0) {
            return 1;
        }
        return 0;
    }
    
    public int b(final n0 n0) {
        if (n0 == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        final int c = this.c();
        final int j0 = n0.j0(this.n());
        if (c < j0) {
            return -1;
        }
        if (c > j0) {
            return 1;
        }
        return 0;
    }
    
    public int c() {
        return this.m().g(this.u());
    }
    
    public String d() {
        return this.e(null);
    }
    
    public String e(final Locale locale) {
        return this.m().j(this.u(), locale);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b2 = (b)o;
        if (this.c() != b2.c() || !this.n().equals(b2.n()) || !j.a(this.i(), b2.i())) {
            b = false;
        }
        return b;
    }
    
    public String f() {
        return Integer.toString(this.c());
    }
    
    public String g() {
        return this.h(null);
    }
    
    public String h(final Locale locale) {
        return this.m().o(this.u(), locale);
    }
    
    @Override
    public int hashCode() {
        return this.c() * 17 + this.n().hashCode() + this.i().hashCode();
    }
    
    protected a i() {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }
    
    public int j(final l0 l0) {
        if (l0 == null) {
            return this.m().r(this.u(), h.c());
        }
        return this.m().r(this.u(), l0.n());
    }
    
    public long k(final l0 l0) {
        if (l0 == null) {
            return this.m().s(this.u(), h.c());
        }
        return this.m().s(this.u(), l0.n());
    }
    
    public l l() {
        return this.m().t();
    }
    
    public abstract f m();
    
    public g n() {
        return this.m().J();
    }
    
    public int o() {
        return this.m().u(this.u());
    }
    
    public l p() {
        return this.m().v();
    }
    
    public int q(final Locale locale) {
        return this.m().w(locale);
    }
    
    public int r(final Locale locale) {
        return this.m().x(locale);
    }
    
    public int s() {
        return this.m().z(this.u());
    }
    
    public int t() {
        return this.m().y();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Property[");
        sb.append(this.x());
        sb.append("]");
        return sb.toString();
    }
    
    protected abstract long u();
    
    public int v() {
        return this.m().E(this.u());
    }
    
    public int w() {
        return this.m().D();
    }
    
    public String x() {
        return this.m().H();
    }
    
    public l y() {
        return this.m().I();
    }
    
    public boolean z() {
        return this.m().K(this.u());
    }
}
