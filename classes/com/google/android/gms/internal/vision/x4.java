// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.IOException;

final class x4
{
    static int a(int n, final byte[] array, int n2, final int n3, final z4 z4) throws y6 {
        if (n >>> 3 == 0) {
            throw y6.e();
        }
        final int n4 = n & 0x7;
        if (n4 == 0) {
            return k(array, n2, z4);
        }
        if (n4 == 1) {
            return n2 + 8;
        }
        if (n4 == 2) {
            return i(array, n2, z4) + z4.a;
        }
        if (n4 != 3) {
            if (n4 == 5) {
                return n2 + 4;
            }
            throw y6.e();
        }
        else {
            final int n5 = (n & 0xFFFFFFF8) | 0x4;
            n = 0;
            int a;
            int n6;
            while (true) {
                a = n;
                n6 = n2;
                if (n2 >= n3) {
                    break;
                }
                n2 = i(array, n2, z4);
                n = (a = z4.a);
                n6 = n2;
                if (n == n5) {
                    break;
                }
                n2 = a(n, array, n2, n3, z4);
            }
            if (n6 <= n3 && a == n5) {
                return n6;
            }
            throw y6.h();
        }
    }
    
    static int b(final int n, final byte[] array, int n2, final int n3, final z6<?> z6, final z4 z7) {
        final r6 r6 = (r6)z6;
        n2 = i(array, n2, z7);
        while (true) {
            r6.h(z7.a);
            if (n2 >= n3) {
                break;
            }
            final int i = i(array, n2, z7);
            if (n != z7.a) {
                break;
            }
            n2 = i(array, i, z7);
        }
        return n2;
    }
    
    static int c(final int n, final byte[] array, int n2, int a, final n9 n3, final z4 z4) throws y6 {
        if (n >>> 3 == 0) {
            throw y6.e();
        }
        final int n4 = n & 0x7;
        if (n4 == 0) {
            n2 = k(array, n2, z4);
            n3.c(n, z4.b);
            return n2;
        }
        if (n4 == 1) {
            n3.c(n, l(array, n2));
            return n2 + 8;
        }
        if (n4 != 2) {
            if (n4 != 3) {
                if (n4 == 5) {
                    n3.c(n, h(array, n2));
                    return n2 + 4;
                }
                throw y6.e();
            }
            else {
                final n9 g = n9.g();
                final int n5 = (n & 0xFFFFFFF8) | 0x4;
                int a2 = 0;
                int n6;
                int n7;
                while (true) {
                    n6 = a2;
                    n7 = n2;
                    if (n2 >= a) {
                        break;
                    }
                    final int i = i(array, n2, z4);
                    a2 = z4.a;
                    if ((n2 = a2) == n5) {
                        n7 = i;
                        n6 = n2;
                        break;
                    }
                    n2 = c(n2, array, i, a, g, z4);
                }
                if (n7 <= a && n6 == n5) {
                    n3.c(n, g);
                    return n7;
                }
                throw y6.h();
            }
        }
        else {
            n2 = i(array, n2, z4);
            a = z4.a;
            if (a < 0) {
                throw y6.c();
            }
            if (a <= array.length - n2) {
                f5 f5;
                if (a == 0) {
                    f5 = com.google.android.gms.internal.vision.f5.H;
                }
                else {
                    f5 = com.google.android.gms.internal.vision.f5.n(array, n2, a);
                }
                n3.c(n, f5);
                return n2 + a;
            }
            throw y6.a();
        }
    }
    
    static int d(int n, final byte[] array, int n2, final z4 z4) {
        n &= 0x7F;
        final int n3 = n2 + 1;
        n2 = array[n2];
        int n7 = 0;
        Label_0027: {
            if (n2 < 0) {
                int n4 = n | (n2 & 0x7F) << 7;
                n = n3 + 1;
                n2 = array[n3];
                if (n2 >= 0) {
                    n2 <<= 14;
                }
                else {
                    final int n5 = n4 | (n2 & 0x7F) << 14;
                    n2 = n + 1;
                    n = array[n];
                    if (n >= 0) {
                        final int n6 = n << 21;
                        n = n5;
                        n7 = n6;
                        break Label_0027;
                    }
                    n4 = (n5 | (n & 0x7F) << 21);
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
                        z4.a = (n4 | (b & 0x7F) << 28);
                        return n2;
                    }
                    n2 = b << 28;
                }
                z4.a = (n4 | n2);
                return n;
            }
            n7 = n2 << 7;
            n2 = n3;
        }
        z4.a = (n | n7);
        return n2;
    }
    
    static int e(final s8<?> s8, final int n, final byte[] array, int n2, final int n3, final z6<?> z6, final z4 z7) throws IOException {
        n2 = g(s8, array, n2, n3, z7);
        while (true) {
            z6.add(z7.c);
            if (n2 >= n3) {
                break;
            }
            final int i = i(array, n2, z7);
            if (n != z7.a) {
                break;
            }
            n2 = g(s8, array, i, n3, z7);
        }
        return n2;
    }
    
    static int f(final s8 s8, final byte[] array, int o, final int n, final int n2, final z4 z4) throws IOException {
        final d8<Object> d8 = (d8<Object>)s8;
        final Object zza = d8.zza();
        o = d8.o(zza, array, o, n, n2, z4);
        d8.b(zza);
        z4.c = zza;
        return o;
    }
    
    static int g(final s8 s8, final byte[] array, int a, final int n, final z4 z4) throws IOException {
        final int n2 = a + 1;
        final int n3 = array[a];
        int d = n2;
        a = n3;
        if (n3 < 0) {
            d = d(n3, array, n2, z4);
            a = z4.a;
        }
        if (a >= 0 && a <= n - d) {
            final Object zza = s8.zza();
            a += d;
            s8.i(zza, array, d, a, z4);
            s8.b(zza);
            z4.c = zza;
            return a;
        }
        throw y6.a();
    }
    
    static int h(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    static int i(final byte[] array, int a, final z4 z4) {
        final int n = a + 1;
        a = array[a];
        if (a >= 0) {
            z4.a = a;
            return n;
        }
        return d(a, array, n, z4);
    }
    
    static int j(final byte[] array, int i, final z6<?> z6, final z4 z7) throws IOException {
        final r6 r6 = (r6)z6;
        i = i(array, i, z7);
        final int n = z7.a + i;
        while (i < n) {
            i = i(array, i, z7);
            r6.h(z7.a);
        }
        if (i == n) {
            return i;
        }
        throw y6.a();
    }
    
    static int k(final byte[] array, int n, final z4 z4) {
        final int n2 = n + 1;
        final long b = array[n];
        if (b >= 0L) {
            z4.b = b;
            return n2;
        }
        n = n2 + 1;
        byte b2 = array[n2];
        long b3 = (b & 0x7FL) | (long)(b2 & 0x7F) << 7;
        for (int n3 = 7; b2 < 0; b2 = array[n], n3 += 7, b3 |= (long)(b2 & 0x7F) << n3, ++n) {}
        z4.b = b3;
        return n;
    }
    
    static long l(final byte[] array, final int n) {
        return ((long)array[n + 7] & 0xFFL) << 56 | (((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48);
    }
    
    static double m(final byte[] array, final int n) {
        return Double.longBitsToDouble(l(array, n));
    }
    
    static int n(final byte[] bytes, int a, final z4 z4) throws y6 {
        final int i = i(bytes, a, z4);
        a = z4.a;
        if (a < 0) {
            throw y6.c();
        }
        if (a == 0) {
            z4.c = "";
            return i;
        }
        z4.c = new String(bytes, i, a, t6.a);
        return i + a;
    }
    
    static float o(final byte[] array, final int n) {
        return Float.intBitsToFloat(h(array, n));
    }
    
    static int p(final byte[] array, int a, final z4 z4) throws y6 {
        final int i = i(array, a, z4);
        a = z4.a;
        if (a < 0) {
            throw y6.c();
        }
        if (a == 0) {
            z4.c = "";
            return i;
        }
        z4.c = u9.k(array, i, a);
        return i + a;
    }
    
    static int q(final byte[] array, int a, final z4 z4) throws y6 {
        final int i = i(array, a, z4);
        a = z4.a;
        if (a < 0) {
            throw y6.c();
        }
        if (a > array.length - i) {
            throw y6.a();
        }
        if (a == 0) {
            z4.c = f5.H;
            return i;
        }
        z4.c = f5.n(array, i, a);
        return i + a;
    }
}
