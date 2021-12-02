// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.l;
import org.joda.time.g;
import org.joda.time.f;

public abstract class e extends c
{
    private static final long c = 203115783733757597L;
    private final f b;
    
    protected e(final f b, final g g) {
        super(g);
        if (b == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (b.M()) {
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("The field must be supported");
    }
    
    @Override
    public int D() {
        return this.b.D();
    }
    
    @Override
    public l I() {
        return this.b.I();
    }
    
    @Override
    public boolean L() {
        return this.b.L();
    }
    
    @Override
    public long P(final long n) {
        return this.b.P(n);
    }
    
    @Override
    public long T(final long n, final int n2) {
        return this.b.T(n, n2);
    }
    
    public final f a0() {
        return this.b;
    }
    
    @Override
    public int g(final long n) {
        return this.b.g(n);
    }
    
    @Override
    public l t() {
        return this.b.t();
    }
    
    @Override
    public int y() {
        return this.b.y();
    }
}
