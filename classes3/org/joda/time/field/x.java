// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.m;
import java.util.HashMap;
import java.io.Serializable;
import org.joda.time.l;

public final class x extends l implements Serializable
{
    private static final long H = -6390301302770925357L;
    private static HashMap<m, x> I;
    private final m G;
    
    private x(final m g) {
        this.G = g;
    }
    
    public static x I(final m m) {
        synchronized (x.class) {
            final HashMap<m, x> i = x.I;
            x x;
            if (i == null) {
                org.joda.time.field.x.I = new HashMap<m, x>(7);
                x = null;
            }
            else {
                x = i.get(m);
            }
            x value = x;
            if (x == null) {
                value = new x(m);
                org.joda.time.field.x.I.put(m, value);
            }
            return value;
        }
    }
    
    private Object K() {
        return I(this.G);
    }
    
    private UnsupportedOperationException M() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.G);
        sb.append(" field is unsupported");
        return new UnsupportedOperationException(sb.toString());
    }
    
    public int G(final l l) {
        return 0;
    }
    
    @Override
    public long b(final long n, final int n2) {
        throw this.M();
    }
    
    @Override
    public long d(final long n, final long n2) {
        throw this.M();
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof x)) {
            return false;
        }
        final x x = (x)o;
        if (x.l() == null) {
            if (this.l() != null) {
                b = false;
            }
            return b;
        }
        return x.l().equals(this.l());
    }
    
    @Override
    public int f(final long n, final long n2) {
        throw this.M();
    }
    
    @Override
    public long g(final long n, final long n2) {
        throw this.M();
    }
    
    @Override
    public long h(final int n) {
        throw this.M();
    }
    
    @Override
    public int hashCode() {
        return this.l().hashCode();
    }
    
    @Override
    public long i(final int n, final long n2) {
        throw this.M();
    }
    
    @Override
    public long j(final long n) {
        throw this.M();
    }
    
    @Override
    public long k(final long n, final long n2) {
        throw this.M();
    }
    
    @Override
    public String l() {
        return this.G.e();
    }
    
    @Override
    public final m m() {
        return this.G;
    }
    
    @Override
    public long o() {
        return 0L;
    }
    
    @Override
    public int p(final long n) {
        throw this.M();
    }
    
    @Override
    public int s(final long n, final long n2) {
        throw this.M();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UnsupportedDurationField[");
        sb.append(this.l());
        sb.append(']');
        return sb.toString();
    }
    
    @Override
    public long u(final long n) {
        throw this.M();
    }
    
    @Override
    public long v(final long n, final long n2) {
        throw this.M();
    }
    
    @Override
    public boolean y() {
        return true;
    }
    
    @Override
    public boolean z() {
        return false;
    }
}
