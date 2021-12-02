// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.digest;

import org.apache.commons.codec.binary.m;

public final class i
{
    @Deprecated
    public static final long a = 2862933555777941757L;
    public static final int b = 104729;
    static final int c = 8;
    static final int d = 4;
    static final int e = 2;
    private static final int f = -862048943;
    private static final int g = 461845907;
    private static final int h = 15;
    private static final int i = 13;
    private static final int j = 5;
    private static final int k = -430675100;
    private static final long l = -8663945395140668459L;
    private static final long m = 5545529020109919103L;
    private static final int n = 31;
    private static final int o = 27;
    private static final int p = 33;
    private static final int q = 5;
    private static final int r = 1390208809;
    private static final int s = 944331445;
    
    private i() {
    }
    
    @Deprecated
    public static long A(final short n) {
        return e(Long.rotateLeft((((long)n & 0xFFL) << 8 ^ 0x0L ^ (0xFFL & (long)((n & 0xFF00) >> 8))) * -8663945395140668459L, 31) * 5545529020109919103L ^ 0x19919L ^ 0x2L);
    }
    
    @Deprecated
    public static long B(final byte[] array) {
        return D(array, 0, array.length, 104729);
    }
    
    @Deprecated
    public static long C(final byte[] array, final int n, final int n2) {
        return D(array, n, n2, 104729);
    }
    
    @Deprecated
    public static long D(final byte[] array, final int n, final int n2, int i) {
        long n3 = i;
        int n4;
        for (n4 = n2 >> 3, i = 0; i < n4; ++i) {
            n3 = Long.rotateLeft(n3 ^ Long.rotateLeft(g(array, n + (i << 3)) * -8663945395140668459L, 31) * 5545529020109919103L, 27) * 5L + 1390208809L;
        }
        long n5 = 0L;
        i = n + (n4 << 3);
        long n6 = n5;
        long n7 = n5;
        long n8 = n5;
        long n9 = n5;
        long n10 = n5;
        switch (n + n2 - i) {
            case 7: {
                n6 = (0x0L ^ ((long)array[i + 6] & 0xFFL) << 48);
            }
            case 6: {
                n7 = (n6 ^ ((long)array[i + 5] & 0xFFL) << 40);
            }
            case 5: {
                n8 = (n7 ^ ((long)array[i + 4] & 0xFFL) << 32);
            }
            case 4: {
                n9 = (n8 ^ ((long)array[i + 3] & 0xFFL) << 24);
            }
            case 3: {
                n10 = (n9 ^ ((long)array[i + 2] & 0xFFL) << 16);
            }
            case 2: {
                n5 = (n10 ^ ((long)array[i + 1] & 0xFFL) << 8);
            }
            case 1: {
                n3 ^= Long.rotateLeft((((long)array[i] & 0xFFL) ^ n5) * -8663945395140668459L, 31) * 5545529020109919103L;
                break;
            }
        }
        return e((long)n2 ^ n3);
    }
    
    private static int E(final int n, final int n2) {
        return Integer.rotateLeft(Integer.rotateLeft(n * -862048943, 15) * 461845907 ^ n2, 13) * 5 - 430675100;
    }
    
    private static int d(int n) {
        n = (n ^ n >>> 16) * -2048144789;
        n = (n ^ n >>> 13) * -1028477387;
        return n ^ n >>> 16;
    }
    
    private static long e(long n) {
        n = (n ^ n >>> 33) * -49064778989728563L;
        n = (n ^ n >>> 33) * -4265267296055464877L;
        return n ^ n >>> 33;
    }
    
    private static int f(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    private static long g(final byte[] array, final int n) {
        return ((long)array[n + 7] & 0xFFL) << 56 | (((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48);
    }
    
    @Deprecated
    public static long[] h(final String s) {
        final byte[] k = org.apache.commons.codec.binary.m.k(s);
        return j(k, 0, k.length, 104729);
    }
    
    public static long[] i(final byte[] array) {
        return j(array, 0, array.length, 104729);
    }
    
    @Deprecated
    public static long[] j(final byte[] array, final int n, final int n2, final int n3) {
        return l(array, n, n2, n3);
    }
    
    public static long[] k(final byte[] array) {
        return l(array, 0, array.length, 0);
    }
    
    public static long[] l(final byte[] array, final int n, final int n2, final int n3) {
        return m(array, n, n2, (long)n3 & 0xFFFFFFFFL);
    }
    
    private static long[] m(final byte[] array, final int n, final int n2, long e) {
        final int n3 = n2 >> 4;
        long n4 = e = e;
        for (int i = 0; i < n3; ++i) {
            final int n5 = n + (i << 4);
            final long g = g(array, n5);
            final long g2 = g(array, n5 + 8);
            n4 = (Long.rotateLeft(Long.rotateLeft(g * -8663945395140668459L, 31) * 5545529020109919103L ^ n4, 27) + e) * 5L + 1390208809L;
            e = (Long.rotateLeft(e ^ Long.rotateLeft(5545529020109919103L * g2, 33) * -8663945395140668459L, 31) + n4) * 5L + 944331445L;
        }
        final int n6 = n + (n3 << 4);
        long n7 = 0L;
        Label_0597: {
            while (true) {
                long n13 = 0L;
                Label_0378: {
                    long n12 = 0L;
                    Label_0352: {
                        long n11 = 0L;
                        Label_0326: {
                            long n10 = 0L;
                            Label_0300: {
                                long n9 = 0L;
                                Label_0274: {
                                    long n8 = 0L;
                                    switch (n + n2 - n6) {
                                        default: {
                                            break Label_0597;
                                        }
                                        case 15: {
                                            n8 = (((long)array[n6 + 14] & 0xFFL) << 48 ^ 0x0L);
                                            break;
                                        }
                                        case 14: {
                                            n8 = 0L;
                                            break;
                                        }
                                        case 13: {
                                            n9 = 0L;
                                            break Label_0274;
                                        }
                                        case 12: {
                                            n10 = 0L;
                                            break Label_0300;
                                        }
                                        case 11: {
                                            n11 = 0L;
                                            break Label_0326;
                                        }
                                        case 10: {
                                            n12 = 0L;
                                            break Label_0352;
                                        }
                                        case 9: {
                                            n13 = 0L;
                                            break Label_0378;
                                        }
                                        case 8: {
                                            n7 = (0x0L ^ ((long)array[n6 + 7] & 0xFFL) << 56);
                                        }
                                        case 7: {
                                            n7 ^= ((long)array[n6 + 6] & 0xFFL) << 48;
                                        }
                                        case 6: {
                                            n7 ^= ((long)array[n6 + 5] & 0xFFL) << 40;
                                        }
                                        case 5: {
                                            n7 ^= ((long)array[n6 + 4] & 0xFFL) << 32;
                                        }
                                        case 4: {
                                            n7 ^= ((long)array[n6 + 3] & 0xFFL) << 24;
                                        }
                                        case 3: {
                                            n7 ^= ((long)array[n6 + 2] & 0xFFL) << 16;
                                        }
                                        case 2: {
                                            n7 ^= ((long)array[n6 + 1] & 0xFFL) << 8;
                                        }
                                        case 1: {
                                            n4 ^= Long.rotateLeft((n7 ^ (long)(array[n6] & 0xFF)) * -8663945395140668459L, 31) * 5545529020109919103L;
                                            break Label_0597;
                                        }
                                    }
                                    n9 = (((long)array[n6 + 13] & 0xFFL) << 40 ^ n8);
                                }
                                n10 = (n9 ^ ((long)array[n6 + 12] & 0xFFL) << 32);
                            }
                            n11 = (n10 ^ ((long)array[n6 + 11] & 0xFFL) << 24);
                        }
                        n12 = (n11 ^ ((long)array[n6 + 10] & 0xFFL) << 16);
                    }
                    n13 = (n12 ^ ((long)array[n6 + 9] & 0xFFL) << 8);
                }
                e ^= Long.rotateLeft((n13 ^ (long)(array[n6 + 8] & 0xFF)) * 5545529020109919103L, 33) * -8663945395140668459L;
                continue;
            }
        }
        final long n14 = n2;
        e ^= n14;
        final long n15 = (n4 ^ n14) + e;
        final long e2 = e(n15);
        e = e(e + n15);
        final long n16 = e2 + e;
        return new long[] { n16, e + n16 };
    }
    
    public static int n(final long n) {
        return o(n, 104729);
    }
    
    public static int o(long reverseBytes, int e) {
        reverseBytes = Long.reverseBytes(reverseBytes);
        e = E((int)reverseBytes, e);
        return d(E((int)(reverseBytes >>> 32), e) ^ 0x8);
    }
    
    public static int p(final long n, final long n2) {
        return q(n, n2, 104729);
    }
    
    public static int q(long reverseBytes, long reverseBytes2, int n) {
        reverseBytes = Long.reverseBytes(reverseBytes);
        reverseBytes2 = Long.reverseBytes(reverseBytes2);
        n = E((int)reverseBytes, n);
        n = E((int)(reverseBytes >>> 32), n);
        n = E((int)reverseBytes2, n);
        return d(E((int)(reverseBytes2 >>> 32), n) ^ 0x10);
    }
    
    @Deprecated
    public static int r(final String s) {
        final byte[] k = org.apache.commons.codec.binary.m.k(s);
        return v(k, 0, k.length, 104729);
    }
    
    @Deprecated
    public static int s(final byte[] array) {
        return v(array, 0, array.length, 104729);
    }
    
    @Deprecated
    public static int t(final byte[] array, final int n) {
        return u(array, n, 104729);
    }
    
    @Deprecated
    public static int u(final byte[] array, final int n, final int n2) {
        return v(array, 0, n, n2);
    }
    
    @Deprecated
    public static int v(final byte[] array, int n, final int n2, int e) {
        final int n3 = n2 >> 2;
        final int n4 = 0;
        final int n5 = 0;
        for (int i = 0; i < n3; ++i) {
            e = E(f(array, (i << 2) + n), e);
        }
        final int n6 = (n3 << 2) + n;
        final int n7 = n + n2 - n6;
        n = n4;
        if (n7 != 1) {
            n = n5;
            if (n7 != 2) {
                if (n7 != 3) {
                    return d(e ^ n2);
                }
                n = (0x0 ^ array[n6 + 2] << 16);
            }
            n ^= array[n6 + 1] << 8;
        }
        e ^= Integer.rotateLeft((array[n6] ^ n) * -862048943, 15) * 461845907;
        return d(e ^ n2);
    }
    
    public static int w(final byte[] array) {
        return x(array, 0, array.length, 0);
    }
    
    public static int x(final byte[] array, int n, final int n2, int e) {
        final int n3 = n2 >> 2;
        final int n4 = 0;
        final int n5 = 0;
        for (int i = 0; i < n3; ++i) {
            e = E(f(array, (i << 2) + n), e);
        }
        final int n6 = (n3 << 2) + n;
        final int n7 = n + n2 - n6;
        n = n4;
        if (n7 != 1) {
            n = n5;
            if (n7 != 2) {
                if (n7 != 3) {
                    return d(e ^ n2);
                }
                n = (0x0 ^ (array[n6 + 2] & 0xFF) << 16);
            }
            n ^= (array[n6 + 1] & 0xFF) << 8;
        }
        e ^= Integer.rotateLeft(((array[n6] & 0xFF) ^ n) * -862048943, 15) * 461845907;
        return d(e ^ n2);
    }
    
    @Deprecated
    public static long y(final int i) {
        return e(Long.rotateLeft(((long)Integer.reverseBytes(i) & 0xFFFFFFFFL) * -8663945395140668459L, 31) * 5545529020109919103L ^ 0x19919L ^ 0x4L);
    }
    
    @Deprecated
    public static long z(final long i) {
        return e(Long.rotateLeft(Long.rotateLeft(Long.reverseBytes(i) * -8663945395140668459L, 31) * 5545529020109919103L ^ 0x19919L, 27) * 5L + 1390208809L ^ 0x8L);
    }
    
    @Deprecated
    public static class a extends b
    {
        @Deprecated
        @Override
        int c(int n, int n2, final byte[] array, final int n3) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return d(n ^ n3);
                    }
                    n2 = (array[2] << 16 ^ 0x0);
                }
                else {
                    n2 = 0;
                }
                n2 ^= array[1] << 8;
            }
            else {
                n2 = 0;
            }
            n ^= Integer.rotateLeft((n2 ^ array[0]) * -862048943, 15) * 461845907;
            return d(n ^ n3);
        }
    }
    
    public static class b
    {
        private static final int e = 4;
        private final byte[] a;
        private int b;
        private int c;
        private int d;
        
        public b() {
            this.a = new byte[3];
        }
        
        private static int d(final byte b, final byte b2, final byte b3, final byte b4) {
            return (b & 0xFF) | (b2 & 0xFF) << 8 | (b3 & 0xFF) << 16 | (b4 & 0xFF) << 24;
        }
        
        public final void a(final byte[] array, int i, int b) {
            if (b <= 0) {
                return;
            }
            this.c += b;
            final int b2 = this.b;
            if (b2 + b - 4 < 0) {
                System.arraycopy(array, i, this.a, b2, b);
                this.b += b;
                return;
            }
            int n = i;
            int n2 = b;
            if (b2 > 0) {
                int n3;
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Unprocessed length should be 1, 2, or 3: ");
                            sb.append(this.b);
                            throw new IllegalStateException(sb.toString());
                        }
                        final byte[] a = this.a;
                        n3 = d(a[0], a[1], a[2], array[i]);
                    }
                    else {
                        final byte[] a2 = this.a;
                        n3 = d(a2[0], a2[1], array[i], array[i + 1]);
                    }
                }
                else {
                    n3 = d(this.a[0], array[i], array[i + 1], array[i + 2]);
                }
                this.d = E(n3, this.d);
                final int n4 = 4 - this.b;
                n = i + n4;
                n2 = b - n4;
            }
            for (b = n2 >> 2, i = 0; i < b; ++i) {
                this.d = E(f(array, (i << 2) + n), this.d);
            }
            i = b << 2;
            b = n2 - i;
            if ((this.b = b) != 0) {
                System.arraycopy(array, n + i, this.a, 0, b);
            }
        }
        
        public final int b() {
            return this.c(this.d, this.b, this.a, this.c);
        }
        
        int c(int n, int n2, final byte[] array, final int n3) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return d(n ^ n3);
                    }
                    n2 = ((array[2] & 0xFF) << 16 ^ 0x0);
                }
                else {
                    n2 = 0;
                }
                n2 ^= (array[1] & 0xFF) << 8;
            }
            else {
                n2 = 0;
            }
            n ^= Integer.rotateLeft((n2 ^ (array[0] & 0xFF)) * -862048943, 15) * 461845907;
            return d(n ^ n3);
        }
        
        public final void e(final int d) {
            this.c = 0;
            this.b = 0;
            this.d = d;
        }
    }
}
