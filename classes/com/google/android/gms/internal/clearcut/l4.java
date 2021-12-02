// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

final class l4
{
    private static final m4 a;
    
    static {
        m4 a2;
        if (j4.x() && j4.y()) {
            a2 = new p4();
        }
        else {
            a2 = new n4();
        }
        a = a2;
    }
    
    static int a(final CharSequence seq) {
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
                                    throw new o4(i, length2);
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
    
    static int b(final CharSequence charSequence, final byte[] array, final int n, final int n2) {
        return l4.a.b(charSequence, array, n, n2);
    }
    
    static void c(final CharSequence charSequence, final ByteBuffer byteBuffer) {
        final m4 a = l4.a;
        if (byteBuffer.hasArray()) {
            final int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(b(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            return;
        }
        if (byteBuffer.isDirect()) {
            a.c(charSequence, byteBuffer);
            return;
        }
        m4.d(charSequence, byteBuffer);
    }
    
    private static int d(final int n) {
        int n2 = n;
        if (n > -12) {
            n2 = -1;
        }
        return n2;
    }
    
    private static int f(final int n, final int n2, final int n3) {
        if (n <= -12 && n2 <= -65 && n3 <= -65) {
            return n ^ n2 << 8 ^ n3 << 16;
        }
        return -1;
    }
    
    public static boolean h(final byte[] array) {
        return l4.a.e(array, 0, array.length);
    }
    
    public static boolean i(final byte[] array, final int n, final int n2) {
        return l4.a.e(array, n, n2);
    }
    
    private static int j(final byte[] array, final int n, int n2) {
        final byte b = array[n - 1];
        n2 -= n;
        if (n2 == 0) {
            return d(b);
        }
        if (n2 == 1) {
            return l(b, array[n]);
        }
        if (n2 == 2) {
            return f(b, array[n], array[n + 1]);
        }
        throw new AssertionError();
    }
    
    private static int l(final int n, final int n2) {
        if (n <= -12 && n2 <= -65) {
            return n ^ n2 << 8;
        }
        return -1;
    }
}
