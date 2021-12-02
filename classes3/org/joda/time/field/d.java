// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.m;
import java.io.Serializable;
import org.joda.time.l;

public abstract class d extends l implements Serializable
{
    private static final long H = -2554245107589433218L;
    private final m G;
    
    protected d(final m g) {
        if (g != null) {
            this.G = g;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }
    
    public int G(final l l) {
        final long n = lcmp(this.o(), l.o());
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        return 1;
    }
    
    @Override
    public int f(final long n, final long n2) {
        return j.n(this.g(n, n2));
    }
    
    @Override
    public long h(final int n) {
        return n * this.o();
    }
    
    @Override
    public long j(final long n) {
        return j.j(n, this.o());
    }
    
    @Override
    public final String l() {
        return this.G.e();
    }
    
    @Override
    public final m m() {
        return this.G;
    }
    
    @Override
    public int p(final long n) {
        return j.n(this.u(n));
    }
    
    @Override
    public int s(final long n, final long n2) {
        return j.n(this.v(n, n2));
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DurationField[");
        sb.append(this.l());
        sb.append(']');
        return sb.toString();
    }
    
    @Override
    public long u(final long n) {
        return n / this.o();
    }
    
    @Override
    public final boolean z() {
        return true;
    }
}
