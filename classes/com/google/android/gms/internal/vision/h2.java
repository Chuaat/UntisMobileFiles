// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class h2
{
    static int a(final int n, final int n2, final int n3) {
        return (n & ~n3) | (n2 & n3);
    }
    
    static int b(final Object o, final int n) {
        if (o instanceof byte[]) {
            return ((byte[])o)[n] & 0xFF;
        }
        if (o instanceof short[]) {
            return ((short[])o)[n] & 0xFFFF;
        }
        return ((int[])o)[n];
    }
    
    static int c(@NullableDecl final Object o, @NullableDecl final Object o2, final int n, final Object o3, final int[] array, final Object[] array2, @NullableDecl final Object[] array3) {
        final int b = j2.b(o);
        final int n2 = b & n;
        int b2 = b(o3, n2);
        if (b2 == 0) {
            return -1;
        }
        final int n3 = ~n;
        int n4 = -1;
        while (true) {
            --b2;
            final int n5 = array[b2];
            if ((n5 & n3) == (b & n3) && e1.a(o, array2[b2]) && (array3 == null || e1.a(o2, array3[b2]))) {
                final int n6 = n5 & n;
                if (n4 == -1) {
                    e(o3, n2, n6);
                }
                else {
                    array[n4] = a(array[n4], n6, n);
                }
                return b2;
            }
            final int n7 = n5 & n;
            if (n7 == 0) {
                return -1;
            }
            n4 = b2;
            b2 = n7;
        }
    }
    
    static Object d(final int n) {
        if (n < 2 || n > 1073741824 || Integer.highestOneBit(n) != n) {
            final StringBuilder sb = new StringBuilder(52);
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n <= 256) {
            return new byte[n];
        }
        if (n <= 65536) {
            return new short[n];
        }
        return new int[n];
    }
    
    static void e(final Object o, final int n, final int n2) {
        if (o instanceof byte[]) {
            ((byte[])o)[n] = (byte)n2;
            return;
        }
        if (o instanceof short[]) {
            ((short[])o)[n] = (short)n2;
            return;
        }
        ((int[])o)[n] = n2;
    }
    
    static int f(final int n) {
        int n2;
        if (n < 32) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        return n2 * (n + 1);
    }
}
