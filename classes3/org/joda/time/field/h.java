// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.m;
import java.io.Serializable;
import org.joda.time.l;

public class h extends l implements Serializable
{
    private static final long I = -5576443481242007829L;
    private final l G;
    private final m H;
    
    protected h(final l l) {
        this(l, null);
    }
    
    protected h(final l g, final m m) {
        if (g != null) {
            this.G = g;
            m i;
            if ((i = m) == null) {
                i = g.m();
            }
            this.H = i;
            return;
        }
        throw new IllegalArgumentException("The field must not be null");
    }
    
    public int G(final l l) {
        return this.G.compareTo(l);
    }
    
    public final l I() {
        return this.G;
    }
    
    @Override
    public long b(final long n, final int n2) {
        return this.G.b(n, n2);
    }
    
    @Override
    public long d(final long n, final long n2) {
        return this.G.d(n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof h && this.G.equals(((h)o).G);
    }
    
    @Override
    public int f(final long n, final long n2) {
        return this.G.f(n, n2);
    }
    
    @Override
    public long g(final long n, final long n2) {
        return this.G.g(n, n2);
    }
    
    @Override
    public long h(final int n) {
        return this.G.h(n);
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode() ^ this.H.hashCode();
    }
    
    @Override
    public long i(final int n, final long n2) {
        return this.G.i(n, n2);
    }
    
    @Override
    public long j(final long n) {
        return this.G.j(n);
    }
    
    @Override
    public long k(final long n, final long n2) {
        return this.G.k(n, n2);
    }
    
    @Override
    public String l() {
        return this.H.e();
    }
    
    @Override
    public m m() {
        return this.H;
    }
    
    @Override
    public long o() {
        return this.G.o();
    }
    
    @Override
    public int p(final long n) {
        return this.G.p(n);
    }
    
    @Override
    public int s(final long n, final long n2) {
        return this.G.s(n, n2);
    }
    
    @Override
    public String toString() {
        String s;
        if (this.H == null) {
            s = this.G.toString();
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("DurationField[");
            sb.append(this.H);
            sb.append(']');
            s = sb.toString();
        }
        return s;
    }
    
    @Override
    public long u(final long n) {
        return this.G.u(n);
    }
    
    @Override
    public long v(final long n, final long n2) {
        return this.G.v(n, n2);
    }
    
    @Override
    public boolean y() {
        return this.G.y();
    }
    
    @Override
    public boolean z() {
        return this.G.z();
    }
}
