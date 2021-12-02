// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public final class m6
{
    private static int a(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    private static long b(long n, final long n2, final long n3) {
        n = (n ^ n2) * n3;
        n = (n ^ n >>> 47 ^ n2) * n3;
        return (n ^ n >>> 47) * n3;
    }
    
    public static long c(final byte[] array) {
        int length = array.length;
        if (length < 0 || length > array.length) {
            final StringBuilder sb = new StringBuilder(67);
            sb.append("Out of bound index with offput: 0 and length: ");
            sb.append(length);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (length <= 32) {
            if (length > 16) {
                final long n = (length << 1) - 7286425919675154353L;
                final long n2 = e(array, 0) * -5435081209227447693L;
                final long e = e(array, 8);
                final int n3 = length + 0;
                final long i = e(array, n3 - 8) * n;
                return b(Long.rotateRight(n2 + e, 43) + Long.rotateRight(i, 30) + e(array, n3 - 16) * -7286425919675154353L, n2 + Long.rotateRight(e - 7286425919675154353L, 18) + i, n);
            }
            if (length >= 8) {
                final long n4 = (length << 1) - 7286425919675154353L;
                final long j = e(array, 0) - 7286425919675154353L;
                final long e2 = e(array, length + 0 - 8);
                return b(Long.rotateRight(e2, 37) * n4 + j, (Long.rotateRight(j, 25) + e2) * n4, n4);
            }
            if (length >= 4) {
                return b(length + (((long)a(array, 0) & 0xFFFFFFFFL) << 3), (long)a(array, length + 0 - 4) & 0xFFFFFFFFL, (length << 1) - 7286425919675154353L);
            }
            if (length > 0) {
                final long n5 = ((array[0] & 0xFF) + ((array[(length >> 1) + 0] & 0xFF) << 8)) * -7286425919675154353L ^ (length + ((array[length - 1 + 0] & 0xFF) << 2)) * -4348849565147123417L;
                return (n5 ^ n5 >>> 47) * -7286425919675154353L;
            }
            return -7286425919675154353L;
        }
        else {
            if (length <= 64) {
                final long n6 = (length << 1) - 7286425919675154353L;
                final long n7 = e(array, 0) * -7286425919675154353L;
                final long e3 = e(array, 8);
                final int n8 = length + 0;
                final long k = e(array, n8 - 8) * n6;
                final long n9 = Long.rotateRight(n7 + e3, 43) + Long.rotateRight(k, 30) + e(array, n8 - 16) * -7286425919675154353L;
                final long b = b(n9, Long.rotateRight(-7286425919675154353L + e3, 18) + n7 + k, n6);
                final long n10 = e(array, 16) * n6;
                final long e4 = e(array, 24);
                final long l = (n9 + e(array, n8 - 32)) * n6;
                return b(Long.rotateRight(n10 + e4, 43) + Long.rotateRight(l, 30) + (b + e(array, n8 - 24)) * n6, n10 + Long.rotateRight(e4 + n7, 18) + l, n6);
            }
            long n11 = 2480279821605975764L;
            long n12 = 1390051526045402406L;
            final long[] array2 = new long[2];
            final long[] array3 = new long[2];
            long n13 = e(array, 0) + 95310865018149119L;
            final int n14 = (--length / 64 << 6) + 0;
            final int n15 = length & 0x3F;
            final int n16 = n14 + n15 - 63;
            int n17 = 0;
            long n18;
            long n19;
            long n20;
            while (true) {
                final long rotateRight = Long.rotateRight(n13 + n11 + array2[0] + e(array, n17 + 8), 37);
                final long rotateRight2 = Long.rotateRight(n11 + array2[1] + e(array, n17 + 48), 42);
                n18 = (rotateRight * -5435081209227447693L ^ array3[1]);
                n19 = rotateRight2 * -5435081209227447693L + (array2[0] + e(array, n17 + 40));
                n20 = Long.rotateRight(n12 + array3[0], 33) * -5435081209227447693L;
                d(array, n17, array2[1] * -5435081209227447693L, n18 + array3[0], array2);
                d(array, n17 + 32, n20 + array3[1], n19 + e(array, n17 + 16), array3);
                n17 += 64;
                if (n17 == n14) {
                    break;
                }
                n12 = n18;
                n11 = n19;
                n13 = n20;
            }
            final long n21 = ((0xFFL & n18) << 1) - 5435081209227447693L;
            array3[0] += n15;
            array2[0] += array3[0];
            array3[0] += array2[0];
            final long rotateRight3 = Long.rotateRight(n20 + n19 + array2[0] + e(array, n16 + 8), 37);
            final long rotateRight4 = Long.rotateRight(n19 + array2[1] + e(array, n16 + 48), 42);
            final long n22 = rotateRight3 * n21 ^ array3[1] * 9L;
            final long n23 = rotateRight4 * n21 + (array2[0] * 9L + e(array, n16 + 40));
            final long n24 = Long.rotateRight(n18 + array3[0], 33) * n21;
            d(array, n16, array2[1] * n21, n22 + array3[0], array2);
            d(array, n16 + 32, array3[1] + n24, e(array, n16 + 16) + n23, array3);
            return b(b(array2[0], array3[0], n21) + (n23 >>> 47 ^ n23) * -4348849565147123417L + n22, b(array2[1], array3[1], n21) + n24, n21);
        }
    }
    
    private static void d(final byte[] array, final int n, long n2, long rotateRight, final long[] array2) {
        final long e = e(array, n);
        final long e2 = e(array, n + 8);
        final long e3 = e(array, n + 16);
        final long e4 = e(array, n + 24);
        n2 += e;
        rotateRight = Long.rotateRight(rotateRight + n2 + e4, 21);
        final long i = e2 + n2 + e3;
        final long rotateRight2 = Long.rotateRight(i, 44);
        array2[0] = i + e4;
        array2[1] = rotateRight + rotateRight2 + n2;
    }
    
    private static long e(final byte[] array, final int offset) {
        final ByteBuffer wrap = ByteBuffer.wrap(array, offset, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}
