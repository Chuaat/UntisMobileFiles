// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

import java.util.Objects;
import java.math.BigInteger;

public class d extends g
{
    private static final int A = 63;
    private static final int B = 15;
    private static final int C = 3;
    private static final int t = 6;
    private static final int u = 3;
    private static final int v = 4;
    static final byte[] w;
    private static final byte[] x;
    private static final byte[] y;
    private static final byte[] z;
    private final byte[] o;
    private final byte[] p;
    private final byte[] q;
    private final int r;
    private final int s;
    
    static {
        w = new byte[] { 13, 10 };
        x = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        y = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
        z = new byte[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51 };
    }
    
    public d() {
        this(0);
    }
    
    public d(final int n) {
        this(n, d.w);
    }
    
    public d(final int n, final byte[] array) {
        this(n, array, false);
    }
    
    public d(final int n, byte[] o, final boolean b) {
        int length;
        if (o == null) {
            length = 0;
        }
        else {
            length = o.length;
        }
        super(3, 4, n, length);
        this.p = d.z;
        Label_0139: {
            if (o != null) {
                if (this.i(o)) {
                    final String t = org.apache.commons.codec.binary.m.t(o);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("lineSeparator must not contain base64 characters: [");
                    sb.append(t);
                    sb.append("]");
                    throw new IllegalArgumentException(sb.toString());
                }
                if (n > 0) {
                    this.s = o.length + 4;
                    System.arraycopy(o, 0, this.q = new byte[o.length], 0, o.length);
                    break Label_0139;
                }
            }
            this.s = 4;
            this.q = null;
        }
        this.r = this.s - 1;
        if (b) {
            o = d.y;
        }
        else {
            o = d.x;
        }
        this.o = o;
    }
    
    public d(final boolean b) {
        this(76, d.w, b);
    }
    
    public static byte[] A(final String s) {
        return new d().l(s);
    }
    
    public static byte[] B(final byte[] array) {
        return new d().c(array);
    }
    
    public static BigInteger C(final byte[] array) {
        return new BigInteger(1, B(array));
    }
    
    public static byte[] D(final byte[] array) {
        return E(array, false);
    }
    
    public static byte[] E(final byte[] array, final boolean b) {
        return F(array, b, false);
    }
    
    public static byte[] F(final byte[] array, final boolean b, final boolean b2) {
        return G(array, b, b2, Integer.MAX_VALUE);
    }
    
    public static byte[] G(final byte[] array, final boolean b, final boolean b2, final int i) {
        if (array == null || array.length == 0) {
            return array;
        }
        d d;
        if (b) {
            d = new d(b2);
        }
        else {
            d = new d(0, org.apache.commons.codec.binary.d.w, b2);
        }
        final long s = d.s(array);
        if (s <= i) {
            return d.e(array);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Input array too big, the output array would be bigger (");
        sb.append(s);
        sb.append(") than the specified maximum size of ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static byte[] H(final byte[] array) {
        return E(array, true);
    }
    
    public static String I(final byte[] array) {
        return org.apache.commons.codec.binary.m.p(E(array, false));
    }
    
    public static byte[] J(final byte[] array) {
        return F(array, false, true);
    }
    
    public static String K(final byte[] array) {
        return org.apache.commons.codec.binary.m.p(F(array, false, true));
    }
    
    public static byte[] L(final BigInteger obj) {
        Objects.requireNonNull(obj, "bigInteger");
        return E(R(obj), false);
    }
    
    @Deprecated
    public static boolean M(final byte[] array) {
        return P(array);
    }
    
    public static boolean N(final byte b) {
        if (b != 61) {
            if (b >= 0) {
                final byte[] z = d.z;
                if (b < z.length && z[b] != -1) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static boolean O(final String s) {
        return P(org.apache.commons.codec.binary.m.k(s));
    }
    
    public static boolean P(final byte[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (!N(array[i]) && !org.apache.commons.codec.binary.g.x(array[i])) {
                return false;
            }
        }
        return true;
    }
    
    static byte[] R(final BigInteger bigInteger) {
        final int n = bigInteger.bitLength() + 7 >> 3 << 3;
        final byte[] byteArray = bigInteger.toByteArray();
        final int bitLength = bigInteger.bitLength();
        int n2 = 1;
        if (bitLength % 8 != 0 && bigInteger.bitLength() / 8 + 1 == n / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            --length;
        }
        else {
            n2 = 0;
        }
        final int n3 = n / 8;
        final byte[] array = new byte[n3];
        System.arraycopy(byteArray, n2, array, n3 - length, length);
        return array;
    }
    
    private static void S(final int n, final a a) {
        if ((n & a.a) == 0x0) {
            return;
        }
        throw new IllegalArgumentException("Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible value. Expected the discarded bits to be zero.");
    }
    
    public boolean Q() {
        return this.o == d.y;
    }
    
    @Override
    void k(byte[] q, int h, int n, final a a) {
        if (a.f) {
            return;
        }
        if (n < 0) {
            a.f = true;
        }
        for (int i = 0; i < n; ++i, ++h) {
            final byte[] q2 = this.q(this.r, a);
            final byte b = q[h];
            if (b == super.b) {
                a.f = true;
                break;
            }
            if (b >= 0) {
                final byte[] z = d.z;
                if (b < z.length) {
                    final byte b2 = z[b];
                    if (b2 >= 0) {
                        final int h2 = (a.h + 1) % 4;
                        a.h = h2;
                        final int a2 = (a.a << 6) + b2;
                        a.a = a2;
                        if (h2 == 0) {
                            final int d = a.d;
                            final int d2 = d + 1;
                            a.d = d2;
                            q2[d] = (byte)(a2 >> 16 & 0xFF);
                            final int d3 = d2 + 1;
                            a.d = d3;
                            q2[d2] = (byte)(a2 >> 8 & 0xFF);
                            a.d = d3 + 1;
                            q2[d3] = (byte)(a2 & 0xFF);
                        }
                    }
                }
            }
        }
        if (a.f && a.h != 0) {
            q = this.q(this.r, a);
            h = a.h;
            if (h != 1) {
                if (h != 2) {
                    if (h != 3) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Impossible modulus ");
                        sb.append(a.h);
                        throw new IllegalStateException(sb.toString());
                    }
                    S(3, a);
                    h = a.a >> 2;
                    a.a = h;
                    final int d4 = a.d;
                    n = d4 + 1;
                    a.d = n;
                    q[d4] = (byte)(h >> 8 & 0xFF);
                    a.d = n + 1;
                    q[n] = (byte)(h & 0xFF);
                }
                else {
                    S(15, a);
                    n = a.a >> 4;
                    a.a = n;
                    h = a.d++;
                    q[h] = (byte)(n & 0xFF);
                }
            }
        }
    }
    
    @Override
    void m(byte[] q, int d, int d2, final a a) {
        if (a.f) {
            return;
        }
        if (d2 < 0) {
            a.f = true;
            if (a.h == 0 && super.e == 0) {
                return;
            }
            q = this.q(this.s, a);
            d = a.d;
            d2 = a.h;
            if (d2 != 0) {
                if (d2 != 1) {
                    if (d2 != 2) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Impossible modulus ");
                        sb.append(a.h);
                        throw new IllegalStateException(sb.toString());
                    }
                    final int d3 = d + 1;
                    a.d = d3;
                    final byte[] o = this.o;
                    d2 = a.a;
                    q[d] = o[d2 >> 10 & 0x3F];
                    final int d4 = d3 + 1;
                    a.d = d4;
                    q[d3] = o[d2 >> 4 & 0x3F];
                    final int d5 = d4 + 1;
                    a.d = d5;
                    q[d4] = o[d2 << 2 & 0x3F];
                    if (o == d.x) {
                        a.d = d5 + 1;
                        q[d5] = super.b;
                    }
                }
                else {
                    final int d6 = d + 1;
                    a.d = d6;
                    final byte[] o2 = this.o;
                    final int a2 = a.a;
                    q[d] = o2[a2 >> 2 & 0x3F];
                    d2 = d6 + 1;
                    a.d = d2;
                    q[d6] = o2[a2 << 4 & 0x3F];
                    if (o2 == d.x) {
                        final int d7 = d2 + 1;
                        a.d = d7;
                        final byte b = super.b;
                        q[d2] = b;
                        a.d = d7 + 1;
                        q[d7] = b;
                    }
                }
            }
            final int g = a.g;
            d2 = a.d;
            d = g + (d2 - d);
            a.g = d;
            if (super.e > 0 && d > 0) {
                final byte[] q2 = this.q;
                System.arraycopy(q2, 0, q, d2, q2.length);
                a.d += this.q.length;
            }
        }
        else {
            for (int i = 0; i < d2; ++i, ++d) {
                final byte[] q3 = this.q(this.s, a);
                final int h = (a.h + 1) % 3;
                a.h = h;
                final byte b2 = q[d];
                int n;
                if ((n = b2) < 0) {
                    n = b2 + 256;
                }
                final int a3 = (a.a << 8) + n;
                a.a = a3;
                if (h == 0) {
                    final int d8 = a.d;
                    final int d9 = d8 + 1;
                    a.d = d9;
                    final byte[] o3 = this.o;
                    q3[d8] = o3[a3 >> 18 & 0x3F];
                    final int d10 = d9 + 1;
                    a.d = d10;
                    q3[d9] = o3[a3 >> 12 & 0x3F];
                    final int d11 = d10 + 1;
                    a.d = d11;
                    q3[d10] = o3[a3 >> 6 & 0x3F];
                    final int d12 = d11 + 1;
                    a.d = d12;
                    q3[d11] = o3[a3 & 0x3F];
                    final int g2 = a.g + 4;
                    a.g = g2;
                    final int e = super.e;
                    if (e > 0 && e <= g2) {
                        final byte[] q4 = this.q;
                        System.arraycopy(q4, 0, q3, d12, q4.length);
                        a.d += this.q.length;
                        a.g = 0;
                    }
                }
            }
        }
    }
    
    @Override
    protected boolean u(final byte b) {
        if (b >= 0) {
            final byte[] p = this.p;
            if (b < p.length && p[b] != -1) {
                return true;
            }
        }
        return false;
    }
}
