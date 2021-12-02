// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.f;
import org.joda.time.a;

public final class u extends g
{
    private static final long N = -5875876968979L;
    private final a K;
    private final int L;
    private transient int M;
    
    public u(final a a, final f f) {
        this(a, f, 0);
    }
    
    public u(final a k, final f f, final int n) {
        super(f);
        this.K = k;
        final int d = super.D();
        Label_0054: {
            int m;
            if (d < n) {
                m = d + 1;
            }
            else if ((m = d) == n + 1) {
                this.M = n;
                break Label_0054;
            }
            this.M = m;
        }
        this.L = n;
    }
    
    private Object a0() {
        return this.J().G(this.K);
    }
    
    @Override
    public int D() {
        return this.M;
    }
    
    @Override
    public long T(final long n, final int n2) {
        j.p(this, n2, this.M, this.y());
        int n3 = n2;
        if (n2 <= this.L) {
            n3 = n2 - 1;
        }
        return super.T(n, n3);
    }
    
    @Override
    public int g(final long n) {
        int g;
        final int n2 = g = super.g(n);
        if (n2 < this.L) {
            g = n2 + 1;
        }
        return g;
    }
}
