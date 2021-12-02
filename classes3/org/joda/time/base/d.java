// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.base;

import org.joda.time.r;
import org.joda.time.format.b;
import org.joda.time.field.j;
import org.joda.time.c;
import org.joda.time.a0;
import org.joda.time.k;
import org.joda.time.h;
import org.joda.time.l0;
import org.joda.time.d0;
import org.joda.time.e0;
import org.joda.time.m0;

public abstract class d implements m0
{
    protected d() {
    }
    
    @Override
    public d0 B(final e0 e0) {
        return new d0(this.n(), this.I(), e0, this.t());
    }
    
    @Override
    public boolean C(final l0 l0) {
        if (l0 == null) {
            return this.T();
        }
        return this.S(l0.n());
    }
    
    @Override
    public boolean E(final m0 m0) {
        if (m0 == null) {
            return this.O();
        }
        final long n = m0.n();
        final long i = m0.I();
        final long n2 = this.n();
        final long j = this.I();
        return n2 <= n && n < j && i <= j;
    }
    
    @Override
    public boolean F(final m0 m0) {
        final long n = this.n();
        final long i = this.I();
        final boolean b = true;
        boolean b2 = true;
        if (m0 == null) {
            final long c = h.c();
            if (n >= c || c >= i) {
                b2 = false;
            }
            return b2;
        }
        final long n2 = m0.n();
        return n < m0.I() && n2 < i && b;
    }
    
    @Override
    public k H() {
        final long d = this.d();
        if (d == 0L) {
            return k.I;
        }
        return new k(d);
    }
    
    protected void L(final long n, final long n2) {
        if (n2 >= n) {
            return;
        }
        throw new IllegalArgumentException("The end instant must be greater than the start instant");
    }
    
    public boolean N(final long n) {
        final long n2 = this.n();
        final long i = this.I();
        return n >= n2 && n < i;
    }
    
    public boolean O() {
        return this.N(h.c());
    }
    
    public boolean P(final long n) {
        return this.n() > n;
    }
    
    public boolean Q() {
        return this.P(h.c());
    }
    
    @Override
    public boolean R(final l0 l0) {
        if (l0 == null) {
            return this.Q();
        }
        return this.P(l0.n());
    }
    
    public boolean S(final long n) {
        return this.I() <= n;
    }
    
    public boolean T() {
        return this.S(h.c());
    }
    
    public boolean U(final m0 m0) {
        return this.n() == m0.n() && this.I() == m0.I();
    }
    
    @Override
    public a0 a() {
        return new a0(this.n(), this.I(), this.t());
    }
    
    @Override
    public c b() {
        return new c(this.n(), this.t());
    }
    
    @Override
    public long d() {
        return j.m(this.I(), this.n());
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof m0)) {
            return false;
        }
        final m0 m0 = (m0)o;
        if (this.n() != m0.n() || this.I() != m0.I() || !j.a(this.t(), m0.t())) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        final long n = this.n();
        final long i = this.I();
        return ((3007 + (int)(n ^ n >>> 32)) * 31 + (int)(i ^ i >>> 32)) * 31 + this.t().hashCode();
    }
    
    @Override
    public boolean l(final m0 m0) {
        if (m0 == null) {
            return this.T();
        }
        return this.S(m0.n());
    }
    
    @Override
    public d0 r() {
        return new d0(this.n(), this.I(), this.t());
    }
    
    @Override
    public c s() {
        return new c(this.I(), this.t());
    }
    
    @Override
    public String toString() {
        final b n = org.joda.time.format.j.B().N(this.t());
        final StringBuffer sb = new StringBuffer(48);
        n.E(sb, this.n());
        sb.append('/');
        n.E(sb, this.I());
        return sb.toString();
    }
    
    @Override
    public boolean u(final l0 l0) {
        if (l0 == null) {
            return this.O();
        }
        return this.N(l0.n());
    }
    
    @Override
    public r v() {
        return new r(this.n(), this.I(), this.t());
    }
    
    @Override
    public boolean w(final m0 m0) {
        long n;
        if (m0 == null) {
            n = h.c();
        }
        else {
            n = m0.I();
        }
        return this.n() >= n;
    }
}
