// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

class e8 extends d8
{
    protected final byte[] K;
    
    e8(final byte[] array) {
        Objects.requireNonNull(array);
        this.K = array;
    }
    
    @Override
    public byte b(final int n) {
        return this.K[n];
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof h8)) {
            return false;
        }
        if (this.h() != ((h8)o).h()) {
            return false;
        }
        if (this.h() == 0) {
            return true;
        }
        if (!(o instanceof e8)) {
            return o.equals(this);
        }
        final e8 e8 = (e8)o;
        final int p = this.p();
        final int p2 = e8.p();
        if (p != 0 && p2 != 0 && p != p2) {
            return false;
        }
        final int h = this.h();
        if (h > e8.h()) {
            final int h2 = this.h();
            final StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(h);
            sb.append(h2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (h <= e8.h()) {
            final byte[] k = this.K;
            final byte[] i = e8.K;
            e8.v();
            int n = 0;
            int n2 = 0;
            boolean b2;
            while (true) {
                b2 = b;
                if (n >= h) {
                    break;
                }
                if (k[n] != i[n2]) {
                    b2 = false;
                    break;
                }
                ++n;
                ++n2;
            }
            return b2;
        }
        final int h3 = e8.h();
        final StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: 0, ");
        sb2.append(h);
        sb2.append(", ");
        sb2.append(h3);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    @Override
    byte f(final int n) {
        return this.K[n];
    }
    
    @Override
    public int h() {
        return this.K.length;
    }
    
    @Override
    protected final int i(final int n, final int n2, final int n3) {
        return s9.d(n, this.K, 0, n3);
    }
    
    @Override
    public final h8 k(int o, final int n) {
        o = h8.o(0, n, this.h());
        if (o == 0) {
            return h8.H;
        }
        return new b8(this.K, 0, o);
    }
    
    @Override
    protected final String l(final Charset charset) {
        return new String(this.K, 0, this.h(), charset);
    }
    
    @Override
    final void m(final w7 w7) throws IOException {
        ((n8)w7).E(this.K, 0, this.h());
    }
    
    @Override
    public final boolean n() {
        return kc.f(this.K, 0, this.h());
    }
    
    protected int v() {
        return 0;
    }
}
