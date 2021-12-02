// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.g;
import org.joda.time.f;
import org.joda.time.l;

public class r extends e
{
    private static final long g = 5708241235177666790L;
    final int d;
    final l e;
    final l f;
    
    public r(final f f, final g g, final int d) {
        super(f, g);
        if (d >= 2) {
            final l t = f.t();
            if (t == null) {
                this.f = null;
            }
            else {
                this.f = new s(t, g.I(), d);
            }
            this.e = f.t();
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }
    
    public r(final f f, final l f2, final g g, final int d) {
        super(f, g);
        if (d >= 2) {
            this.f = f2;
            this.e = f.t();
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }
    
    public r(final i i) {
        this(i, i.J());
    }
    
    public r(final i i, final g g) {
        this(i, i.a0().t(), g);
    }
    
    public r(final i i, final l e, final g g) {
        super(i.a0(), g);
        this.d = i.d;
        this.e = e;
        this.f = i.e;
    }
    
    private int b0(final int n) {
        if (n >= 0) {
            return n / this.d;
        }
        return (n + 1) / this.d - 1;
    }
    
    @Override
    public int D() {
        return 0;
    }
    
    @Override
    public l I() {
        return this.f;
    }
    
    @Override
    public long N(final long n) {
        return this.a0().N(n);
    }
    
    @Override
    public long O(final long n) {
        return this.a0().O(n);
    }
    
    @Override
    public long P(final long n) {
        return this.a0().P(n);
    }
    
    @Override
    public long Q(final long n) {
        return this.a0().Q(n);
    }
    
    @Override
    public long R(final long n) {
        return this.a0().R(n);
    }
    
    @Override
    public long S(final long n) {
        return this.a0().S(n);
    }
    
    @Override
    public long T(final long n, final int n2) {
        j.p(this, n2, 0, this.d - 1);
        return this.a0().T(n, this.b0(this.a0().g(n)) * this.d + n2);
    }
    
    public int c0() {
        return this.d;
    }
    
    @Override
    public long d(final long n, final int n2) {
        return this.T(n, j.c(this.g(n), n2, 0, this.d - 1));
    }
    
    @Override
    public int g(final long n) {
        final int g = this.a0().g(n);
        final int d = this.d;
        if (g >= 0) {
            return g % d;
        }
        return d - 1 + (g + 1) % d;
    }
    
    @Override
    public l t() {
        return this.e;
    }
    
    @Override
    public int y() {
        return this.d - 1;
    }
}
