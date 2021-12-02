// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.g;
import org.joda.time.f;
import org.joda.time.l;

public class i extends e
{
    private static final long i = 8318475124230605365L;
    final int d;
    final l e;
    final l f;
    private final int g;
    private final int h;
    
    public i(final f f, final g g, final int n) {
        this(f, f.I(), g, n);
    }
    
    public i(final f f, final l f2, final g g, int n) {
        super(f, g);
        if (n >= 2) {
            final l t = f.t();
            if (t == null) {
                this.e = null;
            }
            else {
                this.e = new s(t, g.F(), n);
            }
            this.f = f2;
            this.d = n;
            final int d = f.D();
            int g2;
            if (d >= 0) {
                g2 = d / n;
            }
            else {
                g2 = (d + 1) / n - 1;
            }
            final int y = f.y();
            if (y >= 0) {
                n = y / n;
            }
            else {
                n = (y + 1) / n - 1;
            }
            this.g = g2;
            this.h = n;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }
    
    public i(final r r, final g g) {
        this(r, null, g);
    }
    
    public i(final r r, final l f, final g g) {
        super(r.a0(), g);
        final int d = r.d;
        this.d = d;
        this.e = r.f;
        this.f = f;
        final f a0 = this.a0();
        final int d2 = a0.D();
        int g2;
        if (d2 >= 0) {
            g2 = d2 / d;
        }
        else {
            g2 = (d2 + 1) / d - 1;
        }
        final int y = a0.y();
        int h;
        if (y >= 0) {
            h = y / d;
        }
        else {
            h = (y + 1) / d - 1;
        }
        this.g = g2;
        this.h = h;
    }
    
    private int c0(final int n) {
        final int d = this.d;
        if (n >= 0) {
            return n % d;
        }
        return d - 1 + (n + 1) % d;
    }
    
    @Override
    public int D() {
        return this.g;
    }
    
    @Override
    public l I() {
        final l f = this.f;
        if (f != null) {
            return f;
        }
        return super.I();
    }
    
    @Override
    public long N(final long n) {
        return this.T(n, this.g(this.a0().N(n)));
    }
    
    @Override
    public long P(final long n) {
        final f a0 = this.a0();
        return a0.P(a0.T(n, this.g(n) * this.d));
    }
    
    @Override
    public long T(final long n, final int n2) {
        j.p(this, n2, this.g, this.h);
        return this.a0().T(n, n2 * this.d + this.c0(this.a0().g(n)));
    }
    
    @Override
    public long a(final long n, final int n2) {
        return this.a0().a(n, n2 * this.d);
    }
    
    @Override
    public long b(final long n, final long n2) {
        return this.a0().b(n, n2 * this.d);
    }
    
    public int b0() {
        return this.d;
    }
    
    @Override
    public long d(final long n, final int n2) {
        return this.T(n, j.c(this.g(n), n2, this.g, this.h));
    }
    
    @Override
    public int g(final long n) {
        final int g = this.a0().g(n);
        if (g >= 0) {
            return g / this.d;
        }
        return (g + 1) / this.d - 1;
    }
    
    @Override
    public int r(final long n, final long n2) {
        return this.a0().r(n, n2) / this.d;
    }
    
    @Override
    public long s(final long n, final long n2) {
        return this.a0().s(n, n2) / this.d;
    }
    
    @Override
    public l t() {
        return this.e;
    }
    
    @Override
    public int y() {
        return this.h;
    }
}
