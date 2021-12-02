// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.internal;

import java.math.BigInteger;

public final class j
{
    private static final long a = -1L;
    private static final long[] b;
    private static final int[] c;
    private static final int[] d;
    
    static {
        b = new long[37];
        c = new int[37];
        d = new int[37];
        final BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i = 2; i <= 36; ++i) {
            final long[] b2 = j.b;
            final long n = i;
            b2[i] = c(-1L, n);
            j.c[i] = (int)f(-1L, n);
            j.d[i] = bigInteger.toString(i).length() - 1;
        }
    }
    
    private j() {
    }
    
    public static int a(final long n, final long n2) {
        return b(n - Long.MIN_VALUE, n2 - Long.MIN_VALUE);
    }
    
    private static int b(final long n, final long n2) {
        final long n3 = lcmp(n, n2);
        int n4;
        if (n3 < 0) {
            n4 = -1;
        }
        else if (n3 == 0) {
            n4 = 0;
        }
        else {
            n4 = 1;
        }
        return n4;
    }
    
    private static long c(final long n, final long n2) {
        if (n2 < 0L) {
            if (a(n, n2) < 0) {
                return 0L;
            }
            return 1L;
        }
        else {
            if (n >= 0L) {
                return n / n2;
            }
            boolean b = true;
            final long n3 = (n >>> 1) / n2 << 1;
            if (a(n - n3 * n2, n2) < 0) {
                b = false;
            }
            return n3 + (b ? 1 : 0);
        }
    }
    
    private static boolean d(final long n, final int n2, final int n3) {
        boolean b = true;
        if (n >= 0L) {
            final long[] b2 = j.b;
            if (n < b2[n3]) {
                return false;
            }
            if (n > b2[n3]) {
                return true;
            }
            b = (n2 > j.c[n3] && b);
        }
        return b;
    }
    
    public static long e(final String s) {
        if (s.length() != 0) {
            final int n = j.d[10];
            long n2 = 0L;
            for (int i = 0; i < s.length(); ++i) {
                final int digit = Character.digit(s.charAt(i), 10);
                if (digit == -1) {
                    throw new NumberFormatException(s);
                }
                if (i > n - 1 && d(n2, digit, 10)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Too large for unsigned long: ");
                    sb.append(s);
                    throw new NumberFormatException(sb.toString());
                }
                n2 = n2 * 10 + digit;
            }
            return n2;
        }
        throw new NumberFormatException("empty string");
    }
    
    private static long f(long n, long n2) {
        if (n2 < 0L) {
            if (a(n, n2) < 0) {
                return n;
            }
            return n - n2;
        }
        else {
            if (n >= 0L) {
                return n % n2;
            }
            n -= ((n >>> 1) / n2 << 1) * n2;
            if (a(n, n2) < 0) {
                n2 = 0L;
            }
            return n - n2;
        }
    }
    
    public static String g(final long i) {
        if (i >= 0L) {
            return Long.toString(i);
        }
        final long j = (i >>> 1) / 5L;
        final StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(j));
        sb.append(i - 10L * j);
        return sb.toString();
    }
}
