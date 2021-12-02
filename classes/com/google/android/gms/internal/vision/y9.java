// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class y9 extends v9
{
    @Override
    final int a(int i, final byte[] array, int n, final int n2) {
        while (n < n2 && array[n] >= 0) {
            ++n;
        }
        if ((i = n) >= n2) {
            return 0;
        }
        while (i < n2) {
            n = i + 1;
            final byte b = array[i];
            i = n;
            if (b < 0) {
                if (b < -32) {
                    if (n >= n2) {
                        return b;
                    }
                    if (b >= -62) {
                        i = n + 1;
                        if (array[n] <= -65) {
                            continue;
                        }
                    }
                    return -1;
                }
                else if (b < -16) {
                    if (n >= n2 - 1) {
                        return m(array, n, n2);
                    }
                    final int n3 = n + 1;
                    i = array[n];
                    if (i <= -65 && (b != -32 || i >= -96) && (b != -19 || i < -96)) {
                        i = n3 + 1;
                        if (array[n3] <= -65) {
                            continue;
                        }
                    }
                    return -1;
                }
                else {
                    if (n >= n2 - 2) {
                        return m(array, n, n2);
                    }
                    i = n + 1;
                    n = array[n];
                    if (n <= -65 && (b << 28) + (n + 112) >> 30 == 0) {
                        n = i + 1;
                        if (array[i] <= -65) {
                            i = n + 1;
                            if (array[n] <= -65) {
                                continue;
                            }
                        }
                    }
                    return -1;
                }
            }
        }
        return 0;
    }
    
    @Override
    final int b(final CharSequence charSequence, final byte[] array, int i, int j) {
        final int length = charSequence.length();
        final int n = j + i;
        int n2;
        char char1;
        for (j = 0; j < length; ++j) {
            n2 = j + i;
            if (n2 >= n) {
                break;
            }
            char1 = charSequence.charAt(j);
            if (char1 >= '\u0080') {
                break;
            }
            array[n2] = (byte)char1;
        }
        if (j == length) {
            return i + length;
        }
        int k = i + j;
        char char2;
        int n3;
        int n4;
        char char3;
        int n5;
        int n6;
        int n7;
        int n8;
        StringBuilder sb;
        for (i = j; i < length; ++i, k = j) {
            char2 = charSequence.charAt(i);
            if (char2 < '\u0080' && k < n) {
                j = k + 1;
                array[k] = (byte)char2;
            }
            else if (char2 < '\u0800' && k <= n - 2) {
                n3 = k + 1;
                array[k] = (byte)(char2 >>> 6 | 0x3C0);
                j = n3 + 1;
                array[n3] = (byte)((char2 & '?') | 0x80);
            }
            else if ((char2 < '\ud800' || '\udfff' < char2) && k <= n - 3) {
                j = k + 1;
                array[k] = (byte)(char2 >>> 12 | 0x1E0);
                n4 = j + 1;
                array[j] = (byte)((char2 >>> 6 & 0x3F) | 0x80);
                j = n4 + 1;
                array[n4] = (byte)((char2 & '?') | 0x80);
            }
            else {
                if (k <= n - 4) {
                    j = i + 1;
                    if (j != charSequence.length()) {
                        char3 = charSequence.charAt(j);
                        if (Character.isSurrogatePair(char2, char3)) {
                            i = Character.toCodePoint(char2, char3);
                            n5 = k + 1;
                            array[k] = (byte)(i >>> 18 | 0xF0);
                            n6 = n5 + 1;
                            array[n5] = (byte)((i >>> 12 & 0x3F) | 0x80);
                            n7 = n6 + 1;
                            array[n6] = (byte)((i >>> 6 & 0x3F) | 0x80);
                            n8 = n7 + 1;
                            array[n7] = (byte)((i & 0x3F) | 0x80);
                            i = j;
                            j = n8;
                            continue;
                        }
                        i = j;
                    }
                    throw new x9(i - 1, length);
                }
                if ('\ud800' <= char2 && char2 <= '\udfff') {
                    j = i + 1;
                    if (j == charSequence.length() || !Character.isSurrogatePair(char2, charSequence.charAt(j))) {
                        throw new x9(i, length);
                    }
                }
                sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(char2);
                sb.append(" at index ");
                sb.append(k);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
        }
        return k;
    }
    
    @Override
    final String d(final byte[] array, int i, int j) throws y6 {
        if ((i | j | array.length - i - j) >= 0) {
            final int n = i + j;
            final char[] value = new char[j];
            j = 0;
            while (i < n) {
                final byte b = array[i];
                if (!l(b)) {
                    break;
                }
                ++i;
                i(b, value, j);
                ++j;
            }
            final int n2 = j;
            j = i;
            i = n2;
            while (j < n) {
                final int n3 = j + 1;
                final byte b2 = array[j];
                if (l(b2)) {
                    j = i + 1;
                    i(b2, value, i);
                    i = j;
                    j = n3;
                    while (j < n) {
                        final byte b3 = array[j];
                        if (!l(b3)) {
                            break;
                        }
                        ++j;
                        i(b3, value, i);
                        ++i;
                    }
                }
                else if (m(b2)) {
                    if (n3 >= n) {
                        throw y6.i();
                    }
                    h(b2, array[n3], value, i);
                    j = n3 + 1;
                    ++i;
                }
                else if (n(b2)) {
                    if (n3 >= n - 1) {
                        throw y6.i();
                    }
                    j = n3 + 1;
                    g(b2, array[n3], array[j], value, i);
                    ++j;
                    ++i;
                }
                else {
                    if (n3 >= n - 2) {
                        throw y6.i();
                    }
                    j = n3 + 1;
                    final byte b4 = array[n3];
                    final int n4 = j + 1;
                    f(b2, b4, array[j], array[n4], value, i);
                    j = n4 + 1;
                    i = i + 1 + 1;
                }
            }
            return new String(value, 0, i);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", array.length, i, j));
    }
}
