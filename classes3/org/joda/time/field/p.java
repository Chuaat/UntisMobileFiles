// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.f;
import org.joda.time.g;
import org.joda.time.l;

public abstract class p extends c
{
    private static final long d = 5004523158306266035L;
    final long b;
    private final l c;
    
    public p(final g g, final l c) {
        super(g);
        if (!c.y()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        final long o = c.o();
        this.b = o;
        if (o >= 1L) {
            this.c = c;
            return;
        }
        throw new IllegalArgumentException("The unit milliseconds must be at least 1");
    }
    
    @Override
    public int D() {
        return 0;
    }
    
    @Override
    public boolean L() {
        return false;
    }
    
    @Override
    public long N(final long n) {
        if (n >= 0L) {
            return n % this.b;
        }
        final long b = this.b;
        return (n + 1L) % b + b - 1L;
    }
    
    @Override
    public long O(long b) {
        if (b > 0L) {
            final long n = b - 1L;
            b = this.b;
            return n - n % b + b;
        }
        return b - b % this.b;
    }
    
    @Override
    public long P(long n) {
        long b;
        if (n >= 0L) {
            b = n % this.b;
        }
        else {
            ++n;
            b = this.b;
            n -= n % b;
        }
        return n - b;
    }
    
    @Override
    public long T(final long n, final int n2) {
        j.p(this, n2, this.D(), this.a0(n, n2));
        return n + (n2 - this.g(n)) * this.b;
    }
    
    protected int a0(final long n, final int n2) {
        return this.z(n);
    }
    
    public final long b0() {
        return this.b;
    }
    
    @Override
    public l t() {
        return this.c;
    }
}
