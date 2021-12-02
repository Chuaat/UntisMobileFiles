// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.l;
import org.joda.time.g;
import org.joda.time.f;

public class n extends e
{
    private static final long g = 3145790132623583142L;
    private final int d;
    private final int e;
    private final int f;
    
    public n(final f f, final int n) {
        g j;
        if (f == null) {
            j = null;
        }
        else {
            j = f.J();
        }
        this(f, j, n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public n(final f f, final g g, final int n) {
        this(f, g, n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public n(final f f, final g g, final int d, final int e, final int f2) {
        super(f, g);
        if (d != 0) {
            this.d = d;
            if (e < f.D() + d) {
                this.e = f.D() + d;
            }
            else {
                this.e = e;
            }
            if (f2 > f.y() + d) {
                this.f = f.y() + d;
            }
            else {
                this.f = f2;
            }
            return;
        }
        throw new IllegalArgumentException("The offset cannot be zero");
    }
    
    @Override
    public int D() {
        return this.e;
    }
    
    @Override
    public boolean K(final long n) {
        return this.a0().K(n);
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
        j.p(this, n2, this.e, this.f);
        return super.T(n, n2 - this.d);
    }
    
    @Override
    public long a(long a, final int n) {
        a = super.a(a, n);
        j.p(this, this.g(a), this.e, this.f);
        return a;
    }
    
    @Override
    public long b(long b, final long n) {
        b = super.b(b, n);
        j.p(this, this.g(b), this.e, this.f);
        return b;
    }
    
    public int b0() {
        return this.d;
    }
    
    @Override
    public long d(final long n, final int n2) {
        return this.T(n, j.c(this.g(n), n2, this.e, this.f));
    }
    
    @Override
    public int g(final long n) {
        return super.g(n) + this.d;
    }
    
    @Override
    public int u(final long n) {
        return this.a0().u(n);
    }
    
    @Override
    public l v() {
        return this.a0().v();
    }
    
    @Override
    public int y() {
        return this.f;
    }
}
