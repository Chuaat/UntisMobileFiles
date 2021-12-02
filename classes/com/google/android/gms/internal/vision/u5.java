// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.io.IOException;

final class u5 extends s5
{
    private final byte[] f;
    private final boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    
    private u5(final byte[] f, final int n, final int n2, final boolean g) {
        super(null);
        this.m = Integer.MAX_VALUE;
        this.f = f;
        this.h = n2 + n;
        this.j = n;
        this.k = n;
        this.g = g;
    }
    
    private final byte C() throws IOException {
        final int j = this.j;
        if (j != this.h) {
            final byte[] f = this.f;
            this.j = j + 1;
            return f[j];
        }
        throw y6.a();
    }
    
    private final void D(final int n) throws IOException {
        if (n >= 0) {
            final int h = this.h;
            final int j = this.j;
            if (n <= h - j) {
                this.j = j + n;
                return;
            }
        }
        if (n < 0) {
            throw y6.c();
        }
        throw y6.a();
    }
    
    private final int E() throws IOException {
        final int j = this.j;
        final int h = this.h;
        if (h != j) {
            final byte[] f = this.f;
            final int i = j + 1;
            final byte b = f[j];
            if (b >= 0) {
                this.j = i;
                return b;
            }
            if (h - i >= 9) {
                int k = i + 1;
                final int n = b ^ f[i] << 7;
                int n2;
                if (n < 0) {
                    n2 = (n ^ 0xFFFFFF80);
                }
                else {
                    final int n3 = k + 1;
                    final int n4 = n ^ f[k] << 14;
                    if (n4 >= 0) {
                        final int n5 = n4 ^ 0x3F80;
                        k = n3;
                        n2 = n5;
                    }
                    else {
                        k = n3 + 1;
                        final int n6 = n4 ^ f[n3] << 21;
                        if (n6 < 0) {
                            n2 = (n6 ^ 0xFFE03F80);
                        }
                        else {
                            final int n7 = k + 1;
                            final byte b2 = f[k];
                            final int n8 = n2 = (n6 ^ b2 << 28 ^ 0xFE03F80);
                            k = n7;
                            if (b2 < 0) {
                                final int n9 = n7 + 1;
                                n2 = n8;
                                k = n9;
                                if (f[n7] < 0) {
                                    final int n10 = n9 + 1;
                                    n2 = n8;
                                    k = n10;
                                    if (f[n9] < 0) {
                                        final int n11 = n10 + 1;
                                        n2 = n8;
                                        k = n11;
                                        if (f[n10] < 0) {
                                            final int n12 = n11 + 1;
                                            n2 = n8;
                                            k = n12;
                                            if (f[n11] < 0) {
                                                k = n12 + 1;
                                                if (f[n12] < 0) {
                                                    return (int)this.z();
                                                }
                                                n2 = n8;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.j = k;
                return n2;
            }
        }
        return (int)this.z();
    }
    
    private final long F() throws IOException {
        final int j = this.j;
        final int h = this.h;
        if (h != j) {
            final byte[] f = this.f;
            final int i = j + 1;
            final byte b = f[j];
            if (b >= 0) {
                this.j = i;
                return b;
            }
            if (h - i >= 9) {
                int k = i + 1;
                final int n = b ^ f[i] << 7;
                long n5 = 0L;
                Label_0351: {
                    int n2;
                    if (n < 0) {
                        n2 = (n ^ 0xFFFFFF80);
                    }
                    else {
                        final int n3 = k + 1;
                        final int n4 = n ^ f[k] << 14;
                        if (n4 >= 0) {
                            n5 = (n4 ^ 0x3F80);
                            k = n3;
                            break Label_0351;
                        }
                        k = n3 + 1;
                        final int n6 = n4 ^ f[n3] << 21;
                        if (n6 >= 0) {
                            final long n7 = n6;
                            final int n8 = k + 1;
                            long n9 = n7 ^ (long)f[k] << 28;
                            long n13 = 0L;
                            Label_0184: {
                                if (n9 < 0L) {
                                    final int n10 = n8 + 1;
                                    long n11 = n9 ^ (long)f[n8] << 35;
                                    long n12;
                                    if (n11 < 0L) {
                                        n12 = -34093383808L;
                                        k = n10;
                                    }
                                    else {
                                        k = n10 + 1;
                                        n9 = (n11 ^ (long)f[n10] << 42);
                                        if (n9 >= 0L) {
                                            n13 = 4363953127296L;
                                            break Label_0184;
                                        }
                                        final int n14 = k + 1;
                                        n11 = (n9 ^ (long)f[k] << 49);
                                        if (n11 < 0L) {
                                            n12 = -558586000294016L;
                                            k = n14;
                                        }
                                        else {
                                            k = n14 + 1;
                                            n5 = (n11 ^ (long)f[n14] << 56 ^ 0xFE03F80FE03F80L);
                                            if (n5 >= 0L) {
                                                break Label_0351;
                                            }
                                            final int n15 = k + 1;
                                            if (f[k] >= 0L) {
                                                k = n15;
                                                break Label_0351;
                                            }
                                            return this.z();
                                        }
                                    }
                                    n5 = (n11 ^ n12);
                                    break Label_0351;
                                }
                                n13 = 266354560L;
                                k = n8;
                            }
                            n5 = (n9 ^ n13);
                            break Label_0351;
                        }
                        n2 = (n6 ^ 0xFFE03F80);
                    }
                    n5 = n2;
                }
                this.j = k;
                return n5;
            }
        }
        return this.z();
    }
    
    private final int G() throws IOException {
        final int j = this.j;
        if (this.h - j >= 4) {
            final byte[] f = this.f;
            this.j = j + 4;
            return (f[j + 3] & 0xFF) << 24 | ((f[j] & 0xFF) | (f[j + 1] & 0xFF) << 8 | (f[j + 2] & 0xFF) << 16);
        }
        throw y6.a();
    }
    
    private final long H() throws IOException {
        final int j = this.j;
        if (this.h - j >= 8) {
            final byte[] f = this.f;
            this.j = j + 8;
            return ((long)f[j + 7] & 0xFFL) << 56 | (((long)f[j] & 0xFFL) | ((long)f[j + 1] & 0xFFL) << 8 | ((long)f[j + 2] & 0xFFL) << 16 | ((long)f[j + 3] & 0xFFL) << 24 | ((long)f[j + 4] & 0xFFL) << 32 | ((long)f[j + 5] & 0xFFL) << 40 | ((long)f[j + 6] & 0xFFL) << 48);
        }
        throw y6.a();
    }
    
    private final void I() {
        final int h = this.h + this.i;
        this.h = h;
        final int n = h - this.k;
        final int m = this.m;
        if (n > m) {
            final int i = n - m;
            this.i = i;
            this.h = h - i;
            return;
        }
        this.i = 0;
    }
    
    @Override
    public final boolean A() throws IOException {
        return this.j == this.h;
    }
    
    @Override
    public final int B() {
        return this.j - this.k;
    }
    
    @Override
    public final int a() throws IOException {
        if (this.A()) {
            return this.l = 0;
        }
        final int e = this.E();
        this.l = e;
        if (e >>> 3 != 0) {
            return e;
        }
        throw y6.e();
    }
    
    @Override
    public final void d(final int n) throws y6 {
        if (this.l == n) {
            return;
        }
        throw y6.f();
    }
    
    @Override
    public final double e() throws IOException {
        return Double.longBitsToDouble(this.H());
    }
    
    @Override
    public final boolean f(int i) throws IOException {
        final int n = i & 0x7;
        final int n2 = 0;
        final int n3 = 0;
        if (n == 0) {
            i = n2;
            if (this.h - this.j >= 10) {
                for (i = n3; i < 10; ++i) {
                    if (this.f[this.j++] >= 0) {
                        return true;
                    }
                }
                throw y6.d();
            }
            while (i < 10) {
                if (this.C() >= 0) {
                    return true;
                }
                ++i;
            }
            throw y6.d();
        }
        if (n == 1) {
            this.D(8);
            return true;
        }
        if (n == 2) {
            this.D(this.E());
            return true;
        }
        if (n == 3) {
            int a;
            do {
                a = this.a();
            } while (a != 0 && this.f(a));
            this.d(i >>> 3 << 3 | 0x4);
            return true;
        }
        if (n == 4) {
            return false;
        }
        if (n == 5) {
            this.D(4);
            return true;
        }
        throw y6.g();
    }
    
    @Override
    public final float g() throws IOException {
        return Float.intBitsToFloat(this.G());
    }
    
    @Override
    public final int h(int m) throws y6 {
        if (m < 0) {
            throw y6.c();
        }
        m += this.B();
        final int i = this.m;
        if (m <= i) {
            this.m = m;
            this.I();
            return i;
        }
        throw y6.a();
    }
    
    @Override
    public final long i() throws IOException {
        return this.F();
    }
    
    @Override
    public final void j(final int m) {
        this.m = m;
        this.I();
    }
    
    @Override
    public final long l() throws IOException {
        return this.F();
    }
    
    @Override
    public final int m() throws IOException {
        return this.E();
    }
    
    @Override
    public final long n() throws IOException {
        return this.H();
    }
    
    @Override
    public final int o() throws IOException {
        return this.G();
    }
    
    @Override
    public final boolean p() throws IOException {
        return this.F() != 0L;
    }
    
    @Override
    public final String q() throws IOException {
        final int e = this.E();
        if (e > 0) {
            final int h = this.h;
            final int j = this.j;
            if (e <= h - j) {
                final String s = new String(this.f, j, e, t6.a);
                this.j += e;
                return s;
            }
        }
        if (e == 0) {
            return "";
        }
        if (e < 0) {
            throw y6.c();
        }
        throw y6.a();
    }
    
    @Override
    public final String r() throws IOException {
        final int e = this.E();
        if (e > 0) {
            final int h = this.h;
            final int j = this.j;
            if (e <= h - j) {
                final String k = u9.k(this.f, j, e);
                this.j += e;
                return k;
            }
        }
        if (e == 0) {
            return "";
        }
        if (e <= 0) {
            throw y6.c();
        }
        throw y6.a();
    }
    
    @Override
    public final f5 s() throws IOException {
        final int e = this.E();
        if (e > 0) {
            final int h = this.h;
            final int j = this.j;
            if (e <= h - j) {
                final f5 n = f5.n(this.f, j, e);
                this.j += e;
                return n;
            }
        }
        if (e == 0) {
            return f5.H;
        }
        if (e > 0) {
            final int h2 = this.h;
            final int i = this.j;
            if (e <= h2 - i) {
                final int n2 = e + i;
                this.j = n2;
                final byte[] array = Arrays.copyOfRange(this.f, i, n2);
                return f5.m(array);
            }
        }
        if (e > 0) {
            throw y6.a();
        }
        if (e != 0) {
            throw y6.c();
        }
        final byte[] array = t6.c;
        return f5.m(array);
    }
    
    @Override
    public final int t() throws IOException {
        return this.E();
    }
    
    @Override
    public final int u() throws IOException {
        return this.E();
    }
    
    @Override
    public final int v() throws IOException {
        return this.G();
    }
    
    @Override
    public final long w() throws IOException {
        return this.H();
    }
    
    @Override
    public final int x() throws IOException {
        return s5.k(this.E());
    }
    
    @Override
    public final long y() throws IOException {
        return s5.b(this.F());
    }
    
    @Override
    final long z() throws IOException {
        long n = 0L;
        for (int i = 0; i < 64; i += 7) {
            final byte c = this.C();
            n |= (long)(c & 0x7F) << i;
            if ((c & 0x80) == 0x0) {
                return n;
            }
        }
        throw y6.d();
    }
}
