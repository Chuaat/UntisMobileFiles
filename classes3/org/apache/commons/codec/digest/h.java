// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.digest;

import org.apache.commons.codec.binary.m;

public final class h
{
    private static final int a = 1540483477;
    private static final int b = 24;
    private static final long c = -4132994306676758123L;
    private static final int d = 47;
    
    private h() {
    }
    
    private static int a(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    private static long b(final byte[] array, final int n) {
        return ((long)array[n + 7] & 0xFFL) << 56 | (((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48);
    }
    
    public static int c(final String s) {
        final byte[] k = m.k(s);
        return e(k, k.length);
    }
    
    public static int d(final String s, final int beginIndex, final int n) {
        return c(s.substring(beginIndex, n + beginIndex));
    }
    
    public static int e(final byte[] array, final int n) {
        return f(array, n, -1756908916);
    }
    
    public static int f(final byte[] array, int n, int n2) {
        n2 ^= n;
        final int n3 = n >> 2;
        for (int i = 0; i < n3; ++i) {
            final int n4 = a(array, i << 2) * 1540483477;
            n2 = (n2 * 1540483477 ^ (n4 ^ n4 >>> 24) * 1540483477);
        }
        final int n5 = n3 << 2;
        final int n6 = n - n5;
        n = n2;
        Label_0131: {
            if (n6 != 1) {
                n = n2;
                if (n6 != 2) {
                    if (n6 != 3) {
                        break Label_0131;
                    }
                    n = (n2 ^ (array[n5 + 2] & 0xFF) << 16);
                }
                n ^= (array[n5 + 1] & 0xFF) << 8;
            }
            n2 = ((array[n5] & 0xFF) ^ n) * 1540483477;
        }
        n = (n2 >>> 13 ^ n2) * 1540483477;
        return n ^ n >>> 15;
    }
    
    public static long g(final String s) {
        final byte[] k = m.k(s);
        return i(k, k.length);
    }
    
    public static long h(final String s, final int beginIndex, final int n) {
        return g(s.substring(beginIndex, n + beginIndex));
    }
    
    public static long i(final byte[] array, final int n) {
        return j(array, n, -512093083);
    }
    
    public static long j(final byte[] array, final int n, int i) {
        long n2 = ((long)i & 0xFFFFFFFFL) ^ n * -4132994306676758123L;
        int n3;
        long n4;
        for (n3 = n >> 3, i = 0; i < n3; ++i) {
            n4 = b(array, i << 3) * -4132994306676758123L;
            n2 = (n2 ^ (n4 ^ n4 >>> 47) * -4132994306676758123L) * -4132994306676758123L;
        }
        i = n3 << 3;
        long n5 = n2;
        long n6 = n2;
        long n7 = n2;
        long n8 = n2;
        long n9 = n2;
        long n10 = n2;
        switch (n - i) {
            case 7: {
                n5 = (n2 ^ ((long)array[i + 6] & 0xFFL) << 48);
            }
            case 6: {
                n6 = (n5 ^ ((long)array[i + 5] & 0xFFL) << 40);
            }
            case 5: {
                n7 = (n6 ^ ((long)array[i + 4] & 0xFFL) << 32);
            }
            case 4: {
                n8 = (n7 ^ ((long)array[i + 3] & 0xFFL) << 24);
            }
            case 3: {
                n9 = (n8 ^ ((long)array[i + 2] & 0xFFL) << 16);
            }
            case 2: {
                n10 = (n9 ^ ((long)array[i + 1] & 0xFFL) << 8);
            }
            case 1: {
                n2 = (((long)array[i] & 0xFFL) ^ n10) * -4132994306676758123L;
                break;
            }
        }
        final long n11 = (n2 >>> 47 ^ n2) * -4132994306676758123L;
        return n11 ^ n11 >>> 47;
    }
}
