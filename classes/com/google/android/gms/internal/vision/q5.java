// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

class q5 extends n5
{
    protected final byte[] K;
    
    q5(final byte[] array) {
        Objects.requireNonNull(array);
        this.K = array;
    }
    
    @Override
    final boolean C(final f5 f5, int n, final int n2) {
        if (n2 > f5.f()) {
            n = this.f();
            final StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(n2);
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n2 > f5.f()) {
            n = f5.f();
            final StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(n2);
            sb2.append(", ");
            sb2.append(n);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (f5 instanceof q5) {
            final q5 q5 = (q5)f5;
            final byte[] k = this.K;
            final byte[] i = q5.K;
            int d;
            int j;
            for (d = this.D(), j = this.D(), n = q5.D(); j < d + n2; ++j, ++n) {
                if (k[j] != i[n]) {
                    return false;
                }
            }
            return true;
        }
        return f5.k(0, n2).equals(this.k(0, n2));
    }
    
    protected int D() {
        return 0;
    }
    
    @Override
    public final boolean a() {
        final int d = this.D();
        return u9.g(this.K, d, this.f() + d);
    }
    
    @Override
    public byte b(final int n) {
        return this.K[n];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof f5)) {
            return false;
        }
        if (this.f() != ((f5)o).f()) {
            return false;
        }
        if (this.f() == 0) {
            return true;
        }
        if (o instanceof q5) {
            final q5 q5 = (q5)o;
            final int b = this.B();
            final int b2 = q5.B();
            return (b == 0 || b2 == 0 || b == b2) && this.C(q5, 0, this.f());
        }
        return o.equals(this);
    }
    
    @Override
    public int f() {
        return this.K.length;
    }
    
    @Override
    protected final int i(final int n, final int n2, final int n3) {
        return t6.a(n, this.K, this.D(), n3);
    }
    
    @Override
    public final f5 k(int v, final int n) {
        v = f5.v(0, n, this.f());
        if (v == 0) {
            return f5.H;
        }
        return new i5(this.K, this.D(), v);
    }
    
    @Override
    protected final String o(final Charset charset) {
        return new String(this.K, this.D(), this.f(), charset);
    }
    
    @Override
    final void p(final c5 c5) throws IOException {
        c5.a(this.K, this.D(), this.f());
    }
    
    @Override
    protected void q(final byte[] array, final int n, final int n2, final int n3) {
        System.arraycopy(this.K, 0, array, 0, n3);
    }
    
    @Override
    byte r(final int n) {
        return this.K[n];
    }
}
