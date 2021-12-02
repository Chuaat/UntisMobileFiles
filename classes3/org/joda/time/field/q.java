// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.m;

public class q extends d
{
    private static final long J = -8346152187724495365L;
    private final long I;
    
    public q(final m m, final long i) {
        super(m);
        this.I = i;
    }
    
    @Override
    public long b(final long n, final int n2) {
        return j.e(n, n2 * this.I);
    }
    
    @Override
    public long d(final long n, final long n2) {
        return j.e(n, j.j(n2, this.I));
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof q) {
            final q q = (q)o;
            if (this.m() != q.m() || this.I != q.I) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public long g(final long n, final long n2) {
        return j.m(n, n2) / this.I;
    }
    
    @Override
    public int hashCode() {
        final long i = this.I;
        return (int)(i ^ i >>> 32) + this.m().hashCode();
    }
    
    @Override
    public long i(final int n, final long n2) {
        return n * this.I;
    }
    
    @Override
    public long k(final long n, final long n2) {
        return j.j(n, this.I);
    }
    
    @Override
    public final long o() {
        return this.I;
    }
    
    @Override
    public long v(final long n, final long n2) {
        return n / this.I;
    }
    
    @Override
    public final boolean y() {
        return true;
    }
}
