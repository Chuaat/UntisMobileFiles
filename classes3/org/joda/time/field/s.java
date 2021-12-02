// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.m;
import org.joda.time.l;

public class s extends f
{
    private static final long L = -3205227092378684157L;
    private final int K;
    
    public s(final l l, final m m, final int k) {
        super(l, m);
        if (k != 0 && k != 1) {
            this.K = k;
            return;
        }
        throw new IllegalArgumentException("The scalar must not be 0 or 1");
    }
    
    public int K() {
        return this.K;
    }
    
    @Override
    public long b(final long n, final int n2) {
        return this.I().d(n, n2 * (long)this.K);
    }
    
    @Override
    public long d(final long n, long i) {
        i = j.i(i, this.K);
        return this.I().d(n, i);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof s) {
            final s s = (s)o;
            if (!this.I().equals(s.I()) || this.m() != s.m() || this.K != s.K) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int f(final long n, final long n2) {
        return this.I().f(n, n2) / this.K;
    }
    
    @Override
    public long g(final long n, final long n2) {
        return this.I().g(n, n2) / this.K;
    }
    
    @Override
    public long h(final int n) {
        return this.I().j(n * (long)this.K);
    }
    
    @Override
    public int hashCode() {
        final long n = this.K;
        return (int)(n ^ n >>> 32) + this.m().hashCode() + this.I().hashCode();
    }
    
    @Override
    public long i(final int n, final long n2) {
        return this.I().k(n * (long)this.K, n2);
    }
    
    @Override
    public long j(long i) {
        i = j.i(i, this.K);
        return this.I().j(i);
    }
    
    @Override
    public long k(long i, final long n) {
        i = j.i(i, this.K);
        return this.I().k(i, n);
    }
    
    @Override
    public long o() {
        return this.I().o() * this.K;
    }
    
    @Override
    public int p(final long n) {
        return this.I().p(n) / this.K;
    }
    
    @Override
    public int s(final long n, final long n2) {
        return this.I().s(n, n2) / this.K;
    }
    
    @Override
    public long u(final long n) {
        return this.I().u(n) / this.K;
    }
    
    @Override
    public long v(final long n, final long n2) {
        return this.I().v(n, n2) / this.K;
    }
}
