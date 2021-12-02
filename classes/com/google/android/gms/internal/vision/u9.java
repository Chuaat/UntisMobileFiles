// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class u9
{
    private static final v9 a;
    
    static {
        v9 a2;
        if (r9.m() && r9.r() && !u4.b()) {
            a2 = new aa();
        }
        else {
            a2 = new y9();
        }
        a = a2;
    }
    
    static int d(final CharSequence seq) {
        final int length = seq.length();
        final int n = 0;
        int i;
        for (i = 0; i < length && seq.charAt(i) < '\u0080'; ++i) {}
        int n2 = length;
        int n3;
        while (true) {
            n3 = n2;
            if (i >= length) {
                break;
            }
            final char char1 = seq.charAt(i);
            if (char1 >= '\u0800') {
                final int length2 = seq.length();
                int n4 = n;
                while (i < length2) {
                    final char char2 = seq.charAt(i);
                    int n5;
                    if (char2 < '\u0800') {
                        n4 += '\u007f' - char2 >>> 31;
                        n5 = i;
                    }
                    else {
                        final int n6 = n4 += 2;
                        n5 = i;
                        if ('\ud800' <= char2) {
                            n4 = n6;
                            n5 = i;
                            if (char2 <= '\udfff') {
                                if (Character.codePointAt(seq, i) < 65536) {
                                    throw new x9(i, length2);
                                }
                                n5 = i + 1;
                                n4 = n6;
                            }
                        }
                    }
                    i = n5 + 1;
                }
                n3 = n2 + n4;
                break;
            }
            n2 += '\u007f' - char1 >>> 31;
            ++i;
        }
        if (n3 >= length) {
            return n3;
        }
        final long n7 = n3;
        final StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(n7 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }
    
    static int e(final CharSequence charSequence, final byte[] array, final int n, final int n2) {
        return u9.a.b(charSequence, array, n, n2);
    }
    
    public static boolean f(final byte[] array) {
        return u9.a.c(array, 0, array.length);
    }
    
    public static boolean g(final byte[] array, final int n, final int n2) {
        return u9.a.c(array, n, n2);
    }
    
    private static int h(final int n) {
        int n2 = n;
        if (n > -12) {
            n2 = -1;
        }
        return n2;
    }
    
    private static int i(final int n, final int n2) {
        if (n <= -12 && n2 <= -65) {
            return n ^ n2 << 8;
        }
        return -1;
    }
    
    private static int j(final int n, final int n2, final int n3) {
        if (n <= -12 && n2 <= -65 && n3 <= -65) {
            return n ^ n2 << 8 ^ n3 << 16;
        }
        return -1;
    }
    
    static String k(final byte[] array, final int n, final int n2) throws y6 {
        return u9.a.d(array, n, n2);
    }
    
    private static int m(final byte[] array, final int n, int n2) {
        final byte b = array[n - 1];
        n2 -= n;
        if (n2 == 0) {
            return h(b);
        }
        if (n2 == 1) {
            return i(b, array[n]);
        }
        if (n2 == 2) {
            return j(b, array[n], array[n + 1]);
        }
        throw new AssertionError();
    }
}
