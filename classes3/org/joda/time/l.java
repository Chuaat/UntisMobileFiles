// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

public abstract class l implements Comparable<l>
{
    public long B(final long n, final int n2) {
        if (n2 == Integer.MIN_VALUE) {
            return this.E(n, n2);
        }
        return this.b(n, -n2);
    }
    
    public long E(final long n, final long n2) {
        if (n2 != Long.MIN_VALUE) {
            return this.d(n, -n2);
        }
        throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
    }
    
    public abstract long b(final long p0, final int p1);
    
    public abstract long d(final long p0, final long p1);
    
    public abstract int f(final long p0, final long p1);
    
    public abstract long g(final long p0, final long p1);
    
    public abstract long h(final int p0);
    
    public abstract long i(final int p0, final long p1);
    
    public abstract long j(final long p0);
    
    public abstract long k(final long p0, final long p1);
    
    public abstract String l();
    
    public abstract m m();
    
    public abstract long o();
    
    public abstract int p(final long p0);
    
    public abstract int s(final long p0, final long p1);
    
    @Override
    public abstract String toString();
    
    public abstract long u(final long p0);
    
    public abstract long v(final long p0, final long p1);
    
    public abstract boolean y();
    
    public abstract boolean z();
}
