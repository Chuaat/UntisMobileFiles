// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.o;
import org.joda.time.f;
import org.joda.time.a;

public final class t extends g
{
    private static final long N = -8869148464118507846L;
    private final a K;
    private final int L;
    private transient int M;
    
    public t(final a a, final f f) {
        this(a, f, 0);
    }
    
    public t(final a k, final f f, final int l) {
        super(f);
        this.K = k;
        final int d = super.D();
        int m;
        if (d < l) {
            m = d - 1;
        }
        else if ((m = d) == l) {
            m = l + 1;
        }
        this.M = m;
        this.L = l;
    }
    
    private Object a0() {
        return this.J().G(this.K);
    }
    
    @Override
    public int D() {
        return this.M;
    }
    
    @Override
    public long T(final long n, final int i) {
        j.p(this, i, this.M, this.y());
        final int l = this.L;
        int n2 = i;
        if (i <= l) {
            if (i == l) {
                throw new o(org.joda.time.g.X(), i, null, null);
            }
            n2 = i + 1;
        }
        return super.T(n, n2);
    }
    
    @Override
    public int g(final long n) {
        int g;
        final int n2 = g = super.g(n);
        if (n2 <= this.L) {
            g = n2 - 1;
        }
        return g;
    }
}
