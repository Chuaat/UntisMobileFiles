// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

final class p4 extends m4
{
    private static int f(final byte[] array, final int n, final long n2, final int n3) {
        if (n3 == 0) {
            return d(n);
        }
        if (n3 == 1) {
            return l(n, j4.a(array, n2));
        }
        if (n3 == 2) {
            return f(n, j4.a(array, n2), j4.a(array, n2 + 1L));
        }
        throw new AssertionError();
    }
    
    @Override
    final int a(int i, final byte[] array, int j, int k) {
        if ((j | k | array.length - k) >= 0) {
            final long n = j;
            j = (int)(k - n);
            Label_0073: {
                if (j < 16) {
                    i = 0;
                }
                else {
                    long n2;
                    for (n2 = n, i = 0; i < j; ++i, ++n2) {
                        if (j4.a(array, n2) < 0) {
                            break Label_0073;
                        }
                    }
                    i = j;
                }
            }
            j -= i;
            long n3 = n + i;
            i = j;
            while (true) {
                k = 0;
                j = i;
                i = k;
                long n4;
                while (true) {
                    n4 = n3;
                    if (j <= 0) {
                        break;
                    }
                    n4 = n3 + 1L;
                    i = j4.a(array, n3);
                    if (i < 0) {
                        break;
                    }
                    --j;
                    n3 = n4;
                }
                if (j == 0) {
                    return 0;
                }
                --j;
                if (i < -32) {
                    if (j == 0) {
                        return i;
                    }
                    --j;
                    if (i < -62) {
                        break;
                    }
                    n3 = n4 + 1L;
                    i = j;
                    if (j4.a(array, n4) > -65) {
                        break;
                    }
                    continue;
                }
                else if (i < -16) {
                    if (j < 2) {
                        return f(array, i, n4, j);
                    }
                    j -= 2;
                    final long n5 = n4 + 1L;
                    k = j4.a(array, n4);
                    if (k > -65 || (i == -32 && k < -96) || (i == -19 && k >= -96)) {
                        return -1;
                    }
                    n3 = n5 + 1L;
                    i = j;
                    if (j4.a(array, n5) > -65) {
                        return -1;
                    }
                    continue;
                }
                else {
                    if (j < 3) {
                        return f(array, i, n4, j);
                    }
                    j -= 3;
                    final long n6 = n4 + 1L;
                    k = j4.a(array, n4);
                    if (k > -65 || (i << 28) + (k + 112) >> 30 != 0) {
                        return -1;
                    }
                    final long n7 = n6 + 1L;
                    if (j4.a(array, n6) > -65) {
                        return -1;
                    }
                    n3 = n7 + 1L;
                    i = j;
                    if (j4.a(array, n7) > -65) {
                        return -1;
                    }
                    continue;
                }
            }
            return -1;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", array.length, j, k));
    }
    
    @Override
    final int b(final CharSequence charSequence, final byte[] array, int i, int n) {
        long n2 = i;
        final long n3 = n + n2;
        final int length = charSequence.length();
        if (length > n || array.length - n < i) {
            final char char1 = charSequence.charAt(length - 1);
            final StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(char1);
            sb.append(" at index ");
            sb.append(i + n);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        n = 0;
        long n4;
        while (true) {
            n4 = 1L;
            if (n >= length) {
                break;
            }
            i = charSequence.charAt(n);
            if (i >= 128) {
                break;
            }
            j4.k(array, n2, (byte)i);
            ++n;
            ++n2;
        }
        i = n;
        long lng = n2;
        if (n == length) {
            return (int)n2;
        }
        while (i < length) {
            final char char2 = charSequence.charAt(i);
            long n6 = 0L;
            Label_0481: {
                if (char2 < '\u0080' && lng < n3) {
                    j4.k(array, lng, (byte)char2);
                    final long n5 = n4;
                    n6 = lng + n4;
                    n4 = n5;
                }
                else if (char2 < '\u0800' && lng <= n3 - 2L) {
                    final long n7 = lng + n4;
                    j4.k(array, lng, (byte)(char2 >>> 6 | 0x3C0));
                    j4.k(array, n7, (byte)((char2 & '?') | 0x80));
                    n6 = n7 + n4;
                }
                else if ((char2 < '\ud800' || '\udfff' < char2) && lng <= n3 - 3L) {
                    final long n8 = lng + n4;
                    j4.k(array, lng, (byte)(char2 >>> 12 | 0x1E0));
                    final long n9 = n8 + n4;
                    j4.k(array, n8, (byte)((char2 >>> 6 & 0x3F) | 0x80));
                    j4.k(array, n9, (byte)((char2 & '?') | 0x80));
                    n6 = n9 + 1L;
                    n4 = 1L;
                }
                else {
                    if (lng <= n3 - 4L) {
                        n = i + 1;
                        if (n != length) {
                            final char char3 = charSequence.charAt(n);
                            if (Character.isSurrogatePair(char2, char3)) {
                                i = Character.toCodePoint(char2, char3);
                                final long n10 = lng + 1L;
                                j4.k(array, lng, (byte)(i >>> 18 | 0xF0));
                                final long n11 = n10 + 1L;
                                j4.k(array, n10, (byte)((i >>> 12 & 0x3F) | 0x80));
                                final long n12 = n11 + 1L;
                                j4.k(array, n11, (byte)((i >>> 6 & 0x3F) | 0x80));
                                n4 = 1L;
                                n6 = n12 + 1L;
                                j4.k(array, n12, (byte)((i & 0x3F) | 0x80));
                                i = n;
                                break Label_0481;
                            }
                            i = n;
                        }
                        throw new o4(i - 1, length);
                    }
                    if ('\ud800' <= char2 && char2 <= '\udfff') {
                        n = i + 1;
                        if (n == length || !Character.isSurrogatePair(char2, charSequence.charAt(n))) {
                            throw new o4(i, length);
                        }
                    }
                    final StringBuilder sb2 = new StringBuilder(46);
                    sb2.append("Failed writing ");
                    sb2.append(char2);
                    sb2.append(" at index ");
                    sb2.append(lng);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            }
            ++i;
            lng = n6;
        }
        return (int)lng;
    }
    
    @Override
    final void c(final CharSequence charSequence, final ByteBuffer byteBuffer) {
        final long o = j4.o(byteBuffer);
        long n = byteBuffer.position() + o;
        final long n2 = byteBuffer.limit() + o;
        final int length = charSequence.length();
        if (length <= n2 - n) {
            int i;
            for (i = 0; i < length; ++i, ++n) {
                final char char1 = charSequence.charAt(i);
                if (char1 >= '\u0080') {
                    break;
                }
                j4.c(n, (byte)char1);
            }
            final long n3 = o;
            long lng = n;
            int j;
            int n4;
            if ((j = i) == length) {
                n4 = (int)(n - o);
            }
            else {
                while (j < length) {
                    final char char2 = charSequence.charAt(j);
                    long n5 = 0L;
                    Label_0479: {
                        if (char2 < '\u0080' && lng < n2) {
                            j4.c(lng, (byte)char2);
                            n5 = lng + 1L;
                        }
                        else if (char2 < '\u0800' && lng <= n2 - 2L) {
                            final long n6 = lng + 1L;
                            j4.c(lng, (byte)(char2 >>> 6 | 0x3C0));
                            j4.c(n6, (byte)((char2 & '?') | 0x80));
                            n5 = n6 + 1L;
                        }
                        else if ((char2 < '\ud800' || '\udfff' < char2) && lng <= n2 - 3L) {
                            final long n7 = lng + 1L;
                            j4.c(lng, (byte)(char2 >>> 12 | 0x1E0));
                            final long n8 = n7 + 1L;
                            j4.c(n7, (byte)((char2 >>> 6 & 0x3F) | 0x80));
                            j4.c(n8, (byte)((char2 & '?') | 0x80));
                            n5 = n8 + 1L;
                        }
                        else {
                            if (lng <= n2 - 4L) {
                                final int n9 = j + 1;
                                if (n9 != length) {
                                    final char char3 = charSequence.charAt(n9);
                                    if (Character.isSurrogatePair(char2, char3)) {
                                        final int codePoint = Character.toCodePoint(char2, char3);
                                        final long n10 = lng + 1L;
                                        j4.c(lng, (byte)(codePoint >>> 18 | 0xF0));
                                        final long n11 = n10 + 1L;
                                        j4.c(n10, (byte)((codePoint >>> 12 & 0x3F) | 0x80));
                                        final long n12 = n11 + 1L;
                                        j4.c(n11, (byte)((codePoint >>> 6 & 0x3F) | 0x80));
                                        j4.c(n12, (byte)((codePoint & 0x3F) | 0x80));
                                        j = n9;
                                        n5 = n12 + 1L;
                                        break Label_0479;
                                    }
                                    j = n9;
                                }
                                throw new o4(j - 1, length);
                            }
                            if ('\ud800' <= char2 && char2 <= '\udfff') {
                                final int n13 = j + 1;
                                if (n13 == length || !Character.isSurrogatePair(char2, charSequence.charAt(n13))) {
                                    throw new o4(j, length);
                                }
                            }
                            final StringBuilder sb = new StringBuilder(46);
                            sb.append("Failed writing ");
                            sb.append(char2);
                            sb.append(" at index ");
                            sb.append(lng);
                            throw new ArrayIndexOutOfBoundsException(sb.toString());
                        }
                    }
                    ++j;
                    lng = n5;
                }
                n4 = (int)(lng - n3);
            }
            byteBuffer.position(n4);
            return;
        }
        final char char4 = charSequence.charAt(length - 1);
        final int limit = byteBuffer.limit();
        final StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Failed writing ");
        sb2.append(char4);
        sb2.append(" at index ");
        sb2.append(limit);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
}
