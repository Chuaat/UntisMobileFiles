// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class aa extends v9
{
    private static int e(final byte[] array, final int n, final long n2, final int n3) {
        if (n3 == 0) {
            return h(n);
        }
        if (n3 == 1) {
            return i(n, r9.a(array, n2));
        }
        if (n3 == 2) {
            return j(n, r9.a(array, n2), r9.a(array, n2 + 1L));
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
                        if (r9.a(array, n2) < 0) {
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
                    i = r9.a(array, n3);
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
                    if (r9.a(array, n4) > -65) {
                        break;
                    }
                    continue;
                }
                else if (i < -16) {
                    if (j < 2) {
                        return e(array, i, n4, j);
                    }
                    j -= 2;
                    final long n5 = n4 + 1L;
                    k = r9.a(array, n4);
                    if (k > -65 || (i == -32 && k < -96) || (i == -19 && k >= -96)) {
                        return -1;
                    }
                    n3 = n5 + 1L;
                    i = j;
                    if (r9.a(array, n5) > -65) {
                        return -1;
                    }
                    continue;
                }
                else {
                    if (j < 3) {
                        return e(array, i, n4, j);
                    }
                    j -= 3;
                    final long n6 = n4 + 1L;
                    k = r9.a(array, n4);
                    if (k > -65 || (i << 28) + (k + 112) >> 30 != 0) {
                        return -1;
                    }
                    final long n7 = n6 + 1L;
                    if (r9.a(array, n6) > -65) {
                        return -1;
                    }
                    n3 = n7 + 1L;
                    i = j;
                    if (r9.a(array, n7) > -65) {
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
            r9.l(array, n2, (byte)i);
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
                    r9.l(array, lng, (byte)char2);
                    final long n5 = n4;
                    n6 = lng + n4;
                    n4 = n5;
                }
                else if (char2 < '\u0800' && lng <= n3 - 2L) {
                    final long n7 = lng + n4;
                    r9.l(array, lng, (byte)(char2 >>> 6 | 0x3C0));
                    r9.l(array, n7, (byte)((char2 & '?') | 0x80));
                    n6 = n7 + n4;
                }
                else if ((char2 < '\ud800' || '\udfff' < char2) && lng <= n3 - 3L) {
                    final long n8 = lng + n4;
                    r9.l(array, lng, (byte)(char2 >>> 12 | 0x1E0));
                    final long n9 = n8 + n4;
                    r9.l(array, n8, (byte)((char2 >>> 6 & 0x3F) | 0x80));
                    r9.l(array, n9, (byte)((char2 & '?') | 0x80));
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
                                r9.l(array, lng, (byte)(i >>> 18 | 0xF0));
                                final long n11 = n10 + 1L;
                                r9.l(array, n10, (byte)((i >>> 12 & 0x3F) | 0x80));
                                final long n12 = n11 + 1L;
                                r9.l(array, n11, (byte)((i >>> 6 & 0x3F) | 0x80));
                                n4 = 1L;
                                n6 = n12 + 1L;
                                r9.l(array, n12, (byte)((i & 0x3F) | 0x80));
                                i = n;
                                break Label_0481;
                            }
                            i = n;
                        }
                        throw new x9(i - 1, length);
                    }
                    if ('\ud800' <= char2 && char2 <= '\udfff') {
                        n = i + 1;
                        if (n == length || !Character.isSurrogatePair(char2, charSequence.charAt(n))) {
                            throw new x9(i, length);
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
    final String d(final byte[] array, int i, int j) throws y6 {
        if ((i | j | array.length - i - j) >= 0) {
            final int n = i + j;
            final char[] value = new char[j];
            j = 0;
            while (i < n) {
                final byte a = r9.a(array, i);
                if (!l(a)) {
                    break;
                }
                ++i;
                i(a, value, j);
                ++j;
            }
            final int n2 = j;
            j = i;
            i = n2;
            while (j < n) {
                final int n3 = j + 1;
                final byte a2 = r9.a(array, j);
                if (l(a2)) {
                    j = i + 1;
                    i(a2, value, i);
                    i = j;
                    j = n3;
                    while (j < n) {
                        final byte a3 = r9.a(array, j);
                        if (!l(a3)) {
                            break;
                        }
                        ++j;
                        i(a3, value, i);
                        ++i;
                    }
                }
                else if (m(a2)) {
                    if (n3 >= n) {
                        throw y6.i();
                    }
                    h(a2, r9.a(array, n3), value, i);
                    j = n3 + 1;
                    ++i;
                }
                else if (n(a2)) {
                    if (n3 >= n - 1) {
                        throw y6.i();
                    }
                    j = n3 + 1;
                    g(a2, r9.a(array, n3), r9.a(array, j), value, i);
                    ++j;
                    ++i;
                }
                else {
                    if (n3 >= n - 2) {
                        throw y6.i();
                    }
                    j = n3 + 1;
                    final byte a4 = r9.a(array, n3);
                    final int n4 = j + 1;
                    f(a2, a4, r9.a(array, j), r9.a(array, n4), value, i);
                    j = n4 + 1;
                    i = i + 1 + 1;
                }
            }
            return new String(value, 0, i);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", array.length, i, j));
    }
}
