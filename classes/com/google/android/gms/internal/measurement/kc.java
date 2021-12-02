// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class kc
{
    private static final hc a;
    
    static {
        if (fc.C() && fc.D()) {
            final int a2 = s7.a;
        }
        a = new ic();
    }
    
    static int b(final CharSequence charSequence, final byte[] array, int codePoint, int i) {
        final int length = charSequence.length();
        final int n = i + codePoint;
        int j;
        for (j = 0; j < length; ++j) {
            i = j + codePoint;
            if (i >= n) {
                break;
            }
            final char char1 = charSequence.charAt(j);
            if (char1 >= '\u0080') {
                break;
            }
            array[i] = (byte)char1;
        }
        if (j != length) {
            i = codePoint + j;
            codePoint = j;
            while (true) {
                final int n2 = i;
                if (codePoint >= length) {
                    return n2;
                }
                final char char2 = charSequence.charAt(codePoint);
                if (char2 < '\u0080' && i < n) {
                    final int n3 = i + 1;
                    array[i] = (byte)char2;
                    i = n3;
                }
                else if (char2 < '\u0800' && i <= n - 2) {
                    final int n4 = i + 1;
                    array[i] = (byte)(char2 >>> 6 | 0x3C0);
                    i = n4 + 1;
                    array[n4] = (byte)((char2 & '?') | 0x80);
                }
                else if ((char2 < '\ud800' || char2 > '\udfff') && i <= n - 3) {
                    final int n5 = i + 1;
                    array[i] = (byte)(char2 >>> 12 | 0x1E0);
                    final int n6 = n5 + 1;
                    array[n5] = (byte)((char2 >>> 6 & 0x3F) | 0x80);
                    i = n6 + 1;
                    array[n6] = (byte)((char2 & '?') | 0x80);
                }
                else {
                    if (i > n - 4) {
                        if (char2 >= '\ud800' && char2 <= '\udfff') {
                            final int n7 = codePoint + 1;
                            if (n7 == charSequence.length() || !Character.isSurrogatePair(char2, charSequence.charAt(n7))) {
                                throw new jc(codePoint, length);
                            }
                        }
                        final StringBuilder sb = new StringBuilder(37);
                        sb.append("Failed writing ");
                        sb.append(char2);
                        sb.append(" at index ");
                        sb.append(i);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    final int n8 = codePoint + 1;
                    if (n8 == charSequence.length()) {
                        break;
                    }
                    final char char3 = charSequence.charAt(n8);
                    if (!Character.isSurrogatePair(char2, char3)) {
                        codePoint = n8;
                        break;
                    }
                    codePoint = Character.toCodePoint(char2, char3);
                    final int n9 = i + 1;
                    array[i] = (byte)(codePoint >>> 18 | 0xF0);
                    i = n9 + 1;
                    array[n9] = (byte)((codePoint >>> 12 & 0x3F) | 0x80);
                    final int n10 = i + 1;
                    array[i] = (byte)((codePoint >>> 6 & 0x3F) | 0x80);
                    i = n10 + 1;
                    array[n10] = (byte)((codePoint & 0x3F) | 0x80);
                    codePoint = n8;
                }
                ++codePoint;
            }
            throw new jc(codePoint - 1, length);
        }
        return codePoint + length;
    }
    
    static int c(final CharSequence seq) {
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
                        if (char2 >= '\ud800') {
                            n4 = n6;
                            n5 = i;
                            if (char2 <= '\udfff') {
                                if (Character.codePointAt(seq, i) < 65536) {
                                    throw new jc(i, length2);
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
        final StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(n3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }
    
    static String d(final byte[] array, int n, int i) throws u9 {
        final int length = array.length;
        if ((n | i | length - n - i) >= 0) {
            final int n2 = n + i;
            final char[] value = new char[i];
            int n3 = 0;
            int n4 = n;
            while (true) {
                n = n3;
                i = n4;
                if (n4 >= n2) {
                    break;
                }
                final byte b = array[n4];
                if (!gc.d(b)) {
                    n = n3;
                    i = n4;
                    break;
                }
                ++n4;
                value[n3] = (char)b;
                ++n3;
            }
        Label_0081:
            while (i < n2) {
                int n5 = i + 1;
                final byte b2 = array[i];
                if (gc.d(b2)) {
                    i = n + 1;
                    value[n] = (char)b2;
                    n = i;
                    int n6;
                    while (true) {
                        n6 = (n = n);
                        i = n5;
                        if (n5 >= n2) {
                            continue Label_0081;
                        }
                        final byte b3 = array[n5];
                        if (!gc.d(b3)) {
                            break;
                        }
                        ++n5;
                        n = n6 + 1;
                        value[n6] = (char)b3;
                    }
                    n = n6;
                    i = n5;
                }
                else if (b2 < -32) {
                    if (n5 >= n2) {
                        throw u9.c();
                    }
                    gc.c(b2, array[n5], value, n);
                    i = n5 + 1;
                    ++n;
                }
                else if (b2 < -16) {
                    if (n5 >= n2 - 1) {
                        throw u9.c();
                    }
                    i = n5 + 1;
                    gc.b(b2, array[n5], array[i], value, n);
                    ++i;
                    ++n;
                }
                else {
                    if (n5 >= n2 - 2) {
                        throw u9.c();
                    }
                    final int n7 = n5 + 1;
                    i = n7 + 1;
                    gc.a(b2, array[n5], array[n7], array[i], value, n);
                    n += 2;
                    ++i;
                }
            }
            return new String(value, 0, n);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", length, n, i));
    }
    
    public static boolean e(final byte[] array) {
        return kc.a.b(array, 0, array.length);
    }
    
    public static boolean f(final byte[] array, final int n, final int n2) {
        return kc.a.b(array, n, n2);
    }
}
