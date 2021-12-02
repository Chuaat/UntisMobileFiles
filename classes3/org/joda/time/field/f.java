// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.m;
import org.joda.time.l;

public class f extends d
{
    private static final long J = 8019982251647420015L;
    private final l I;
    
    public f(final l i, final m m) {
        super(m);
        if (i == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (i.z()) {
            this.I = i;
            return;
        }
        throw new IllegalArgumentException("The field must be supported");
    }
    
    public final l I() {
        return this.I;
    }
    
    @Override
    public long b(final long n, final int n2) {
        return this.I.b(n, n2);
    }
    
    @Override
    public long d(final long n, final long n2) {
        return this.I.d(n, n2);
    }
    
    @Override
    public long g(final long n, final long n2) {
        return this.I.g(n, n2);
    }
    
    @Override
    public long i(final int n, final long n2) {
        return this.I.i(n, n2);
    }
    
    @Override
    public long k(final long n, final long n2) {
        return this.I.k(n, n2);
    }
    
    @Override
    public long o() {
        return this.I.o();
    }
    
    @Override
    public long v(final long n, final long n2) {
        return this.I.v(n, n2);
    }
    
    @Override
    public boolean y() {
        return this.I.y();
    }
}
