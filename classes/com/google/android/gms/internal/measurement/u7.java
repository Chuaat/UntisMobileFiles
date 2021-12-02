// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class u7
{
    static int a(final byte[] array, int j, final t7 t7) throws u9 {
        j = j(array, j, t7);
        final int a = t7.a;
        if (a < 0) {
            throw u9.d();
        }
        if (a > array.length - j) {
            throw u9.f();
        }
        if (a == 0) {
            t7.c = h8.H;
            return j;
        }
        t7.c = h8.q(array, j, a);
        return j + a;
    }
    
    static int b(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    static int c(final db db, final byte[] array, int d, final int n, final int n2, final t7 t7) throws IOException {
        final va<Object> va = (va<Object>)db;
        final Object e = va.e();
        d = va.D(e, array, d, n, n2, t7);
        va.d(e);
        t7.c = e;
        return d;
    }
    
    static int d(final db db, final byte[] array, int a, final int n, final t7 t7) throws IOException {
        final int n2 = a + 1;
        final int n3 = array[a];
        int k = n2;
        a = n3;
        if (n3 < 0) {
            k = k(n3, array, n2, t7);
            a = t7.a;
        }
        if (a >= 0 && a <= n - k) {
            final Object e = db.e();
            a += k;
            db.f(e, array, k, a, t7);
            db.d(e);
            t7.c = e;
            return a;
        }
        throw u9.f();
    }
    
    static int e(final db<?> db, final int n, final byte[] array, int n2, final int n3, final r9<?> r9, final t7 t7) throws IOException {
        n2 = d(db, array, n2, n3, t7);
        while (true) {
            r9.add(t7.c);
            if (n2 >= n3) {
                break;
            }
            final int j = j(array, n2, t7);
            if (n != t7.a) {
                break;
            }
            n2 = d(db, array, j, n3, t7);
        }
        return n2;
    }
    
    static int f(final byte[] array, int i, final r9<?> r9, final t7 t7) throws IOException {
        final l9 l9 = (l9)r9;
        i = j(array, i, t7);
        final int n = t7.a + i;
        while (i < n) {
            i = j(array, i, t7);
            l9.i(t7.a);
        }
        if (i == n) {
            return i;
        }
        throw u9.f();
    }
    
    static int g(final byte[] bytes, int j, final t7 t7) throws u9 {
        j = j(bytes, j, t7);
        final int a = t7.a;
        if (a < 0) {
            throw u9.d();
        }
        if (a == 0) {
            t7.c = "";
            return j;
        }
        t7.c = new String(bytes, j, a, s9.a);
        return j + a;
    }
    
    static int h(final byte[] array, int j, final t7 t7) throws u9 {
        j = j(array, j, t7);
        final int a = t7.a;
        if (a < 0) {
            throw u9.d();
        }
        if (a == 0) {
            t7.c = "";
            return j;
        }
        t7.c = kc.d(array, j, a);
        return j + a;
    }
    
    static int i(final int n, final byte[] array, int n2, int j, final wb wb, final t7 t7) throws u9 {
        if (n >>> 3 == 0) {
            throw u9.b();
        }
        final int n3 = n & 0x7;
        if (n3 == 0) {
            n2 = m(array, n2, t7);
            wb.h(n, t7.b);
            return n2;
        }
        if (n3 == 1) {
            wb.h(n, n(array, n2));
            return n2 + 8;
        }
        if (n3 != 2) {
            if (n3 != 3) {
                if (n3 == 5) {
                    wb.h(n, b(array, n2));
                    return n2 + 4;
                }
                throw u9.b();
            }
            else {
                final int n4 = (n & 0xFFFFFFF8) | 0x4;
                final wb e = wb.e();
                int n5 = 0;
                int i;
                while (true) {
                    i = n2;
                    if (n2 >= j) {
                        break;
                    }
                    i = j(array, n2, t7);
                    n2 = t7.a;
                    if ((n5 = n2) == n4) {
                        break;
                    }
                    final int k = i(n5, array, i, j, e, t7);
                    n5 = n2;
                    n2 = k;
                }
                if (i <= j && n5 == n4) {
                    wb.h(n, e);
                    return i;
                }
                throw u9.e();
            }
        }
        else {
            j = j(array, n2, t7);
            n2 = t7.a;
            if (n2 < 0) {
                throw u9.d();
            }
            if (n2 <= array.length - j) {
                h8 h8;
                if (n2 == 0) {
                    h8 = com.google.android.gms.internal.measurement.h8.H;
                }
                else {
                    h8 = com.google.android.gms.internal.measurement.h8.q(array, j, n2);
                }
                wb.h(n, h8);
                return j + n2;
            }
            throw u9.f();
        }
    }
    
    static int j(final byte[] array, int a, final t7 t7) {
        final int n = a + 1;
        a = array[a];
        if (a >= 0) {
            t7.a = a;
            return n;
        }
        return k(a, array, n, t7);
    }
    
    static int k(int n, final byte[] array, int n2, final t7 t7) {
        int n3 = n & 0x7F;
        n = n2 + 1;
        n2 = array[n2];
        Label_0023: {
            if (n2 < 0) {
                int n4 = n3 | (n2 & 0x7F) << 7;
                n2 = n + 1;
                n = array[n];
                if (n >= 0) {
                    final int n5 = n << 14;
                    n = n2;
                    n2 = n5;
                }
                else {
                    n3 = (n4 | (n & 0x7F) << 14);
                    final int n6 = n2 + 1;
                    n = array[n2];
                    if (n >= 0) {
                        n2 = n << 21;
                        n = n6;
                        break Label_0023;
                    }
                    n4 = (n3 | (n & 0x7F) << 21);
                    n = n6 + 1;
                    final byte b = array[n6];
                    if (b < 0) {
                        while (true) {
                            n2 = n + 1;
                            if (array[n] >= 0) {
                                break;
                            }
                            n = n2;
                        }
                        t7.a = (n4 | (b & 0x7F) << 28);
                        return n2;
                    }
                    n2 = b << 28;
                }
                t7.a = (n4 | n2);
                return n;
            }
            n2 <<= 7;
        }
        t7.a = (n3 | n2);
        return n;
    }
    
    static int l(final int n, final byte[] array, int n2, final int n3, final r9<?> r9, final t7 t7) {
        final l9 l9 = (l9)r9;
        n2 = j(array, n2, t7);
        while (true) {
            l9.i(t7.a);
            if (n2 >= n3) {
                break;
            }
            final int j = j(array, n2, t7);
            if (n != t7.a) {
                break;
            }
            n2 = j(array, j, t7);
        }
        return n2;
    }
    
    static int m(final byte[] array, int n, final t7 t7) {
        final int n2 = n + 1;
        final long b = array[n];
        if (b < 0L) {
            n = n2 + 1;
            byte b2 = array[n2];
            long b3 = (b & 0x7FL) | (long)(b2 & 0x7F) << 7;
            for (int n3 = 7; b2 < 0; b2 = array[n], n3 += 7, b3 |= (long)(b2 & 0x7F) << n3, ++n) {}
            t7.b = b3;
            return n;
        }
        t7.b = b;
        return n2;
    }
    
    static long n(final byte[] array, final int n) {
        return ((long)array[n + 7] & 0xFFL) << 56 | (((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48);
    }
}
