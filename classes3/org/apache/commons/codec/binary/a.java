// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

public class a extends g
{
    private static final byte[] A;
    private static final long B = 127L;
    private static final long C = 63L;
    private static final int D = 31;
    private static final long E = 15L;
    private static final long F = 7L;
    private static final long G = 3L;
    private static final long H = 1L;
    private static final int t = 5;
    private static final int u = 8;
    private static final int v = 5;
    private static final byte[] w;
    private static final byte[] x;
    private static final byte[] y;
    private static final byte[] z;
    private final int o;
    private final byte[] p;
    private final int q;
    private final byte[] r;
    private final byte[] s;
    
    static {
        w = new byte[] { 13, 10 };
        x = new byte[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
        y = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55 };
        z = new byte[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 };
        A = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86 };
    }
    
    public a() {
        this(false);
    }
    
    public a(final byte b) {
        this(false, b);
    }
    
    public a(final int n) {
        this(n, a.w);
    }
    
    public a(final int n, final byte[] array) {
        this(n, array, false, (byte)61);
    }
    
    public a(final int n, final byte[] array, final boolean b) {
        this(n, array, b, (byte)61);
    }
    
    public a(final int i, final byte[] array, final boolean b, final byte b2) {
        int length;
        if (array == null) {
            length = 0;
        }
        else {
            length = array.length;
        }
        super(5, 8, i, length, b2);
        if (b) {
            this.r = a.A;
            this.p = a.z;
        }
        else {
            this.r = a.y;
            this.p = a.x;
        }
        if (i > 0) {
            if (array == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("lineLength ");
                sb.append(i);
                sb.append(" > 0, but lineSeparator is null");
                throw new IllegalArgumentException(sb.toString());
            }
            if (this.i(array)) {
                final String t = org.apache.commons.codec.binary.m.t(array);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("lineSeparator must not contain Base32 characters: [");
                sb2.append(t);
                sb2.append("]");
                throw new IllegalArgumentException(sb2.toString());
            }
            this.q = array.length + 8;
            System.arraycopy(array, 0, this.s = new byte[array.length], 0, array.length);
        }
        else {
            this.q = 8;
            this.s = null;
        }
        this.o = this.q - 1;
        if (!this.u(b2) && !org.apache.commons.codec.binary.g.x(b2)) {
            return;
        }
        throw new IllegalArgumentException("pad must not be in alphabet or whitespace");
    }
    
    public a(final boolean b) {
        this(0, null, b, (byte)61);
    }
    
    public a(final boolean b, final byte b2) {
        this(0, null, b, b2);
    }
    
    private static void A(final long n, final g.a a) {
        if ((n & a.b) == 0x0L) {
            return;
        }
        throw new IllegalArgumentException("Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible value. Expected the discarded bits to be zero.");
    }
    
    @Override
    void k(byte[] q, int i, int n, final g.a a) {
        if (a.f) {
            return;
        }
        if (n < 0) {
            a.f = true;
        }
        int n2;
        byte b;
        byte[] q2;
        byte[] p4;
        byte b2;
        int h;
        long b3;
        int d;
        int d2;
        int d3;
        int d4;
        int d5;
        for (n2 = i, i = 0; i < n; ++i, ++n2) {
            b = q[n2];
            if (b == super.b) {
                a.f = true;
                break;
            }
            q2 = this.q(this.o, a);
            if (b >= 0) {
                p4 = this.p;
                if (b < p4.length) {
                    b2 = p4[b];
                    if (b2 >= 0) {
                        h = (a.h + 1) % 8;
                        a.h = h;
                        b3 = (a.b << 5) + b2;
                        a.b = b3;
                        if (h == 0) {
                            d = a.d;
                            d2 = d + 1;
                            a.d = d2;
                            q2[d] = (byte)(b3 >> 32 & 0xFFL);
                            d3 = d2 + 1;
                            a.d = d3;
                            q2[d2] = (byte)(b3 >> 24 & 0xFFL);
                            d4 = d3 + 1;
                            a.d = d4;
                            q2[d3] = (byte)(b3 >> 16 & 0xFFL);
                            d5 = d4 + 1;
                            a.d = d5;
                            q2[d4] = (byte)(b3 >> 8 & 0xFFL);
                            a.d = d5 + 1;
                            q2[d5] = (byte)(b3 & 0xFFL);
                        }
                    }
                }
            }
        }
        if (a.f && a.h >= 2) {
            q = this.q(this.o, a);
            switch (a.h) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Impossible modulus ");
                    sb.append(a.h);
                    throw new IllegalStateException(sb.toString());
                }
                case 7: {
                    A(7L, a);
                    final long b4 = a.b >> 3;
                    a.b = b4;
                    i = a.d;
                    n = i + 1;
                    a.d = n;
                    q[i] = (byte)(b4 >> 24 & 0xFFL);
                    i = n + 1;
                    a.d = i;
                    q[n] = (byte)(b4 >> 16 & 0xFFL);
                    n = i + 1;
                    a.d = n;
                    q[i] = (byte)(b4 >> 8 & 0xFFL);
                    a.d = n + 1;
                    q[n] = (byte)(b4 & 0xFFL);
                    break;
                }
                case 6: {
                    A(63L, a);
                    final long b5 = a.b >> 6;
                    a.b = b5;
                    n = a.d;
                    i = n + 1;
                    a.d = i;
                    q[n] = (byte)(b5 >> 16 & 0xFFL);
                    n = i + 1;
                    a.d = n;
                    q[i] = (byte)(b5 >> 8 & 0xFFL);
                    a.d = n + 1;
                    q[n] = (byte)(b5 & 0xFFL);
                    break;
                }
                case 5: {
                    A(1L, a);
                    final long b6 = a.b >> 1;
                    a.b = b6;
                    n = a.d;
                    i = n + 1;
                    a.d = i;
                    q[n] = (byte)(b6 >> 16 & 0xFFL);
                    n = i + 1;
                    a.d = n;
                    q[i] = (byte)(b6 >> 8 & 0xFFL);
                    a.d = n + 1;
                    q[n] = (byte)(b6 & 0xFFL);
                    break;
                }
                case 4: {
                    A(15L, a);
                    final long b7 = a.b >> 4;
                    a.b = b7;
                    n = a.d;
                    i = n + 1;
                    a.d = i;
                    q[n] = (byte)(b7 >> 8 & 0xFFL);
                    a.d = i + 1;
                    q[i] = (byte)(b7 & 0xFFL);
                    break;
                }
                case 3: {
                    A(127L, a);
                    i = a.d++;
                    q[i] = (byte)(a.b >> 7 & 0xFFL);
                    break;
                }
                case 2: {
                    A(3L, a);
                    i = a.d++;
                    q[i] = (byte)(a.b >> 2 & 0xFFL);
                    break;
                }
            }
        }
    }
    
    @Override
    void m(byte[] q, int i, int n, final g.a a) {
        if (a.f) {
            return;
        }
        if (n < 0) {
            a.f = true;
            if (a.h == 0 && super.e == 0) {
                return;
            }
            q = this.q(this.q, a);
            i = a.d;
            n = a.h;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Impossible modulus ");
                                sb.append(a.h);
                                throw new IllegalStateException(sb.toString());
                            }
                            final int d = i + 1;
                            a.d = d;
                            final byte[] r = this.r;
                            final long b = a.b;
                            q[i] = r[(int)(b >> 27) & 0x1F];
                            n = d + 1;
                            a.d = n;
                            q[d] = r[(int)(b >> 22) & 0x1F];
                            final int d2 = n + 1;
                            a.d = d2;
                            q[n] = r[(int)(b >> 17) & 0x1F];
                            n = d2 + 1;
                            a.d = n;
                            q[d2] = r[(int)(b >> 12) & 0x1F];
                            final int d3 = n + 1;
                            a.d = d3;
                            q[n] = r[(int)(b >> 7) & 0x1F];
                            n = d3 + 1;
                            a.d = n;
                            q[d3] = r[(int)(b >> 2) & 0x1F];
                            final int d4 = n + 1;
                            a.d = d4;
                            q[n] = r[(int)(b << 3) & 0x1F];
                            a.d = d4 + 1;
                            q[d4] = super.b;
                        }
                        else {
                            n = i + 1;
                            a.d = n;
                            final byte[] r2 = this.r;
                            final long b2 = a.b;
                            q[i] = r2[(int)(b2 >> 19) & 0x1F];
                            final int d5 = n + 1;
                            a.d = d5;
                            q[n] = r2[(int)(b2 >> 14) & 0x1F];
                            n = d5 + 1;
                            a.d = n;
                            q[d5] = r2[(int)(b2 >> 9) & 0x1F];
                            final int d6 = n + 1;
                            a.d = d6;
                            q[n] = r2[(int)(b2 >> 4) & 0x1F];
                            final int d7 = d6 + 1;
                            a.d = d7;
                            q[d6] = r2[(int)(b2 << 1) & 0x1F];
                            final int d8 = d7 + 1;
                            a.d = d8;
                            n = super.b;
                            q[d7] = (byte)n;
                            final int d9 = d8 + 1;
                            a.d = d9;
                            q[d8] = (byte)n;
                            a.d = d9 + 1;
                            q[d9] = (byte)n;
                        }
                    }
                    else {
                        n = i + 1;
                        a.d = n;
                        final byte[] r3 = this.r;
                        final long b3 = a.b;
                        q[i] = r3[(int)(b3 >> 11) & 0x1F];
                        final int d10 = n + 1;
                        a.d = d10;
                        q[n] = r3[(int)(b3 >> 6) & 0x1F];
                        n = d10 + 1;
                        a.d = n;
                        q[d10] = r3[(int)(b3 >> 1) & 0x1F];
                        final int d11 = n + 1;
                        a.d = d11;
                        q[n] = r3[(int)(b3 << 4) & 0x1F];
                        final int d12 = d11 + 1;
                        a.d = d12;
                        n = super.b;
                        q[d11] = (byte)n;
                        final int d13 = d12 + 1;
                        a.d = d13;
                        q[d12] = (byte)n;
                        final int d14 = d13 + 1;
                        a.d = d14;
                        q[d13] = (byte)n;
                        a.d = d14 + 1;
                        q[d14] = (byte)n;
                    }
                }
                else {
                    n = i + 1;
                    a.d = n;
                    final byte[] r4 = this.r;
                    final long b4 = a.b;
                    q[i] = r4[(int)(b4 >> 3) & 0x1F];
                    final int d15 = n + 1;
                    a.d = d15;
                    q[n] = r4[(int)(b4 << 2) & 0x1F];
                    final int d16 = d15 + 1;
                    a.d = d16;
                    n = super.b;
                    q[d15] = (byte)n;
                    final int d17 = d16 + 1;
                    a.d = d17;
                    q[d16] = (byte)n;
                    final int d18 = d17 + 1;
                    a.d = d18;
                    q[d17] = (byte)n;
                    final int d19 = d18 + 1;
                    a.d = d19;
                    q[d18] = (byte)n;
                    final int d20 = d19 + 1;
                    a.d = d20;
                    q[d19] = (byte)n;
                    a.d = d20 + 1;
                    q[d20] = (byte)n;
                }
            }
            final int g = a.g;
            n = a.d;
            i = g + (n - i);
            a.g = i;
            if (super.e > 0 && i > 0) {
                final byte[] s = this.s;
                System.arraycopy(s, 0, q, n, s.length);
                a.d += this.s.length;
            }
        }
        else {
            int n2 = i;
            byte[] q2;
            int h;
            int n3;
            byte b5;
            int n4;
            long b6;
            int d21;
            int d22;
            byte[] r5;
            int d23;
            int d24;
            int d25;
            int d26;
            int d27;
            int d28;
            int d29;
            int g2;
            int e;
            byte[] s2;
            for (i = 0; i < n; ++i, n2 = n3) {
                q2 = this.q(this.q, a);
                h = (a.h + 1) % 5;
                a.h = h;
                n3 = n2 + 1;
                b5 = q[n2];
                if ((n4 = b5) < 0) {
                    n4 = b5 + 256;
                }
                b6 = (a.b << 8) + n4;
                a.b = b6;
                if (h == 0) {
                    d21 = a.d;
                    d22 = d21 + 1;
                    a.d = d22;
                    r5 = this.r;
                    q2[d21] = r5[(int)(b6 >> 35) & 0x1F];
                    d23 = d22 + 1;
                    a.d = d23;
                    q2[d22] = r5[(int)(b6 >> 30) & 0x1F];
                    d24 = d23 + 1;
                    a.d = d24;
                    q2[d23] = r5[(int)(b6 >> 25) & 0x1F];
                    d25 = d24 + 1;
                    a.d = d25;
                    q2[d24] = r5[(int)(b6 >> 20) & 0x1F];
                    d26 = d25 + 1;
                    a.d = d26;
                    q2[d25] = r5[(int)(b6 >> 15) & 0x1F];
                    d27 = d26 + 1;
                    a.d = d27;
                    q2[d26] = r5[(int)(b6 >> 10) & 0x1F];
                    d28 = d27 + 1;
                    a.d = d28;
                    q2[d27] = r5[(int)(b6 >> 5) & 0x1F];
                    d29 = d28 + 1;
                    a.d = d29;
                    q2[d28] = r5[(int)b6 & 0x1F];
                    g2 = a.g + 8;
                    a.g = g2;
                    e = super.e;
                    if (e > 0 && e <= g2) {
                        s2 = this.s;
                        System.arraycopy(s2, 0, q2, d29, s2.length);
                        a.d += this.s.length;
                        a.g = 0;
                    }
                }
            }
        }
    }
    
    public boolean u(final byte b) {
        if (b >= 0) {
            final byte[] p = this.p;
            if (b < p.length && p[b] != -1) {
                return true;
            }
        }
        return false;
    }
}
