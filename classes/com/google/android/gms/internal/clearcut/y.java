// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

final class y
{
    static int a(int n, final byte[] array, int n2, final int n3, final z z) throws r1 {
        if (n >>> 3 == 0) {
            throw r1.b();
        }
        final int n4 = n & 0x7;
        if (n4 == 0) {
            return g(array, n2, z);
        }
        if (n4 == 1) {
            return n2 + 8;
        }
        if (n4 == 2) {
            return e(array, n2, z) + z.a;
        }
        if (n4 != 3) {
            if (n4 == 5) {
                return n2 + 4;
            }
            throw r1.b();
        }
        else {
            final int n5 = (n & 0xFFFFFFF8) | 0x4;
            n = 0;
            int a;
            while (true) {
                a = n;
                n = n2;
                if (n2 >= n3) {
                    break;
                }
                final int e = e(array, n2, z);
                n2 = (a = z.a);
                n = e;
                if (n2 == n5) {
                    break;
                }
                final int a2 = a(n2, array, e, n3, z);
                n = n2;
                n2 = a2;
            }
            if (n <= n3 && a == n5) {
                return n;
            }
            throw r1.d();
        }
    }
    
    static int b(final int n, final byte[] array, int n2, final int n3, final q1<?> q1, final z z) {
        final k1 k1 = (k1)q1;
        n2 = e(array, n2, z);
        while (true) {
            k1.h(z.a);
            if (n2 >= n3) {
                break;
            }
            final int e = e(array, n2, z);
            if (n != z.a) {
                break;
            }
            n2 = e(array, e, z);
        }
        return n2;
    }
    
    static int c(final int n, final byte[] array, int n2, int a, final d4 d4, final z z) throws IOException {
        if (n >>> 3 == 0) {
            throw r1.b();
        }
        final int n3 = n & 0x7;
        if (n3 == 0) {
            n2 = g(array, n2, z);
            d4.e(n, z.b);
            return n2;
        }
        if (n3 == 1) {
            d4.e(n, k(array, n2));
            return n2 + 8;
        }
        if (n3 == 2) {
            n2 = e(array, n2, z);
            a = z.a;
            d0 d5;
            if (a == 0) {
                d5 = d0.H;
            }
            else {
                d5 = d0.n(array, n2, a);
            }
            d4.e(n, d5);
            return n2 + a;
        }
        if (n3 != 3) {
            if (n3 == 5) {
                d4.e(n, h(array, n2));
                return n2 + 4;
            }
            throw r1.b();
        }
        else {
            final d4 i = d4.i();
            final int n4 = (n & 0xFFFFFFF8) | 0x4;
            int a2 = 0;
            int n5;
            int n6;
            while (true) {
                n5 = a2;
                n6 = n2;
                if (n2 >= a) {
                    break;
                }
                final int e = e(array, n2, z);
                a2 = z.a;
                if ((n2 = a2) == n4) {
                    n6 = e;
                    n5 = n2;
                    break;
                }
                n2 = c(n2, array, e, a, i, z);
            }
            if (n6 <= a && n5 == n4) {
                d4.e(n, i);
                return n6;
            }
            throw r1.d();
        }
    }
    
    static int d(int n, final byte[] array, int n2, final z z) {
        final int n3 = n & 0x7F;
        int n4 = n2 + 1;
        n = array[n2];
        Label_0027: {
            if (n < 0) {
                final int n5 = n3 | (n & 0x7F) << 7;
                n = n4 + 1;
                n2 = array[n4];
                int n6;
                if (n2 >= 0) {
                    n2 <<= 14;
                    n6 = n5;
                }
                else {
                    final int n7 = n5 | (n2 & 0x7F) << 14;
                    n2 = n + 1;
                    n = array[n];
                    if (n >= 0) {
                        n <<= 21;
                        n4 = n2;
                        n2 = n7;
                        break Label_0027;
                    }
                    n6 = (n7 | (n & 0x7F) << 21);
                    n = n2 + 1;
                    final byte b = array[n2];
                    if (b < 0) {
                        while (true) {
                            n2 = n + 1;
                            if (array[n] >= 0) {
                                break;
                            }
                            n = n2;
                        }
                        z.a = (n6 | (b & 0x7F) << 28);
                        return n2;
                    }
                    n2 = b << 28;
                }
                z.a = (n6 | n2);
                return n;
            }
            n <<= 7;
            n2 = n3;
        }
        z.a = (n2 | n);
        return n4;
    }
    
    static int e(final byte[] array, int a, final z z) {
        final int n = a + 1;
        a = array[a];
        if (a >= 0) {
            z.a = a;
            return n;
        }
        return d(a, array, n, z);
    }
    
    static int f(final byte[] array, int i, final q1<?> q1, final z z) throws IOException {
        final k1 k1 = (k1)q1;
        i = e(array, i, z);
        final int n = z.a + i;
        while (i < n) {
            i = e(array, i, z);
            k1.h(z.a);
        }
        if (i == n) {
            return i;
        }
        throw r1.a();
    }
    
    static int g(final byte[] array, int n, final z z) {
        final int n2 = n + 1;
        final long b = array[n];
        if (b >= 0L) {
            z.b = b;
            return n2;
        }
        n = n2 + 1;
        byte b2 = array[n2];
        long b3 = (b & 0x7FL) | (long)(b2 & 0x7F) << 7;
        for (int n3 = 7; b2 < 0; b2 = array[n], n3 += 7, b3 |= (long)(b2 & 0x7F) << n3, ++n) {}
        z.b = b3;
        return n;
    }
    
    static int h(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    static int i(final byte[] bytes, int a, final z z) {
        final int e = e(bytes, a, z);
        a = z.a;
        if (a == 0) {
            z.c = "";
            return e;
        }
        z.c = new String(bytes, e, a, l1.a);
        return e + a;
    }
    
    static int j(final byte[] bytes, int a, final z z) throws IOException {
        final int e = e(bytes, a, z);
        a = z.a;
        if (a == 0) {
            z.c = "";
            return e;
        }
        final int n = e + a;
        if (l4.i(bytes, e, n)) {
            z.c = new String(bytes, e, a, l1.a);
            return n;
        }
        throw r1.e();
    }
    
    static long k(final byte[] array, final int n) {
        return ((long)array[n + 7] & 0xFFL) << 56 | (((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48);
    }
    
    static double l(final byte[] array, final int n) {
        return Double.longBitsToDouble(k(array, n));
    }
    
    static int m(final byte[] array, int a, final z z) {
        final int e = e(array, a, z);
        a = z.a;
        if (a == 0) {
            z.c = d0.H;
            return e;
        }
        z.c = d0.n(array, e, a);
        return e + a;
    }
    
    static float n(final byte[] array, final int n) {
        return Float.intBitsToFloat(h(array, n));
    }
}
