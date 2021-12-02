// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.charset.Charset;

class k0 extends j0
{
    protected final byte[] J;
    
    k0(final byte[] j) {
        this.J = j;
    }
    
    @Override
    protected final int b(final int n, final int n2, final int n3) {
        return l1.c(n, this.J, this.v(), n3);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof d0)) {
            return false;
        }
        if (this.size() != ((d0)o).size()) {
            return false;
        }
        if (this.size() == 0) {
            return true;
        }
        if (o instanceof k0) {
            final k0 k0 = (k0)o;
            final int l = this.l();
            final int i = k0.l();
            return (l == 0 || i == 0 || l == i) && this.t(k0, 0, this.size());
        }
        return o.equals(this);
    }
    
    @Override
    public final d0 f(int m, final int n) {
        m = d0.m(0, n, this.size());
        if (m == 0) {
            return d0.H;
        }
        return new g0(this.J, this.v(), m);
    }
    
    @Override
    protected final String h(final Charset charset) {
        return new String(this.J, this.v(), this.size(), charset);
    }
    
    @Override
    final void i(final c0 c0) throws IOException {
        c0.a(this.J, this.v(), this.size());
    }
    
    @Override
    public final boolean k() {
        final int v = this.v();
        return l4.i(this.J, v, this.size() + v);
    }
    
    @Override
    public byte p(final int n) {
        return this.J[n];
    }
    
    @Override
    public int size() {
        return this.J.length;
    }
    
    @Override
    final boolean t(final d0 d0, int n, final int n2) {
        if (n2 > d0.size()) {
            n = this.size();
            final StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(n2);
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n2 > d0.size()) {
            n = d0.size();
            final StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(n2);
            sb2.append(", ");
            sb2.append(n);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d0 instanceof k0) {
            final k0 k0 = (k0)d0;
            final byte[] j = this.J;
            final byte[] i = k0.J;
            int v;
            int l;
            for (v = this.v(), l = this.v(), n = k0.v(); l < v + n2; ++l, ++n) {
                if (j[l] != i[n]) {
                    return false;
                }
            }
            return true;
        }
        return d0.f(0, n2).equals(this.f(0, n2));
    }
    
    protected int v() {
        return 0;
    }
}
