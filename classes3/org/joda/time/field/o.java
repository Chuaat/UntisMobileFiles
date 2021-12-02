// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.f;
import org.joda.time.g;
import org.joda.time.l;

public class o extends p
{
    private static final long g = -5586801265774496376L;
    private final int e;
    private final l f;
    
    public o(final g g, final l l, final l f) {
        super(g, l);
        if (!f.y()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        if ((this.e = (int)(f.o() / this.b0())) >= 2) {
            this.f = f;
            return;
        }
        throw new IllegalArgumentException("The effective range must be at least 2");
    }
    
    @Override
    public l I() {
        return this.f;
    }
    
    @Override
    public long T(final long n, final int n2) {
        j.p(this, n2, this.D(), this.y());
        return n + (n2 - this.g(n)) * super.b;
    }
    
    public int c0() {
        return this.e;
    }
    
    @Override
    public long d(final long n, final int n2) {
        final int g = this.g(n);
        return n + (j.c(g, n2, this.D(), this.y()) - g) * this.b0();
    }
    
    @Override
    public int g(final long n) {
        if (n >= 0L) {
            return (int)(n / this.b0() % this.e);
        }
        return this.e - 1 + (int)((n + 1L) / this.b0() % this.e);
    }
    
    @Override
    public int y() {
        return this.e - 1;
    }
}
