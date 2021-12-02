// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.f;
import org.joda.time.field.j;
import org.joda.time.g;
import org.joda.time.field.k;

class l extends k
{
    private static final long f = -98628754872287L;
    protected final org.joda.time.chrono.c e;
    
    l(final org.joda.time.chrono.c e) {
        super(g.X(), e.h0());
        this.e = e;
    }
    
    private Object b0() {
        return this.e.T();
    }
    
    @Override
    public int D() {
        return this.e.D0();
    }
    
    @Override
    public org.joda.time.l I() {
        return null;
    }
    
    @Override
    public boolean K(final long n) {
        return this.e.T0(this.g(n));
    }
    
    @Override
    public boolean L() {
        return false;
    }
    
    @Override
    public long N(final long n) {
        return n - this.P(n);
    }
    
    @Override
    public long O(final long n) {
        final int g = this.g(n);
        long p = n;
        if (n != this.e.P0(g)) {
            p = this.e.P0(g + 1);
        }
        return p;
    }
    
    @Override
    public long P(final long n) {
        return this.e.P0(this.g(n));
    }
    
    @Override
    public long T(final long n, final int n2) {
        j.p(this, n2, this.e.D0(), this.e.B0());
        return this.e.U0(n, n2);
    }
    
    @Override
    public long Y(final long n, final int n2) {
        j.p(this, n2, this.e.D0() - 1, this.e.B0() + 1);
        return this.e.U0(n, n2);
    }
    
    @Override
    public long a(final long n, final int n2) {
        if (n2 == 0) {
            return n;
        }
        return this.T(n, j.d(this.g(n), n2));
    }
    
    @Override
    public long b(final long n, final long n2) {
        return this.a(n, j.n(n2));
    }
    
    @Override
    public long d(final long n, final int n2) {
        if (n2 == 0) {
            return n;
        }
        return this.T(n, j.c(this.e.M0(n), n2, this.e.D0(), this.e.B0()));
    }
    
    @Override
    public int g(final long n) {
        return this.e.M0(n);
    }
    
    @Override
    public long s(final long n, final long n2) {
        if (n < n2) {
            return -this.e.N0(n2, n);
        }
        return this.e.N0(n, n2);
    }
    
    @Override
    public int u(final long n) {
        if (this.e.T0(this.g(n))) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public org.joda.time.l v() {
        return this.e.j();
    }
    
    @Override
    public int y() {
        return this.e.B0();
    }
}
