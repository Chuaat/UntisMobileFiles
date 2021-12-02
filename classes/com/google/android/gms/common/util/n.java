// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import f2.a;
import com.google.android.gms.common.internal.b0;

@b0
@a
public class n
{
    private static final char[] a;
    private static final char[] b;
    
    static {
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        b = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    }
    
    @RecentlyNonNull
    @a
    public static String a(@RecentlyNonNull final byte[] array) {
        final char[] value = new char[array.length << 1];
        int i = 0;
        int n = 0;
        while (i < array.length) {
            final int n2 = array[i] & 0xFF;
            final int n3 = n + 1;
            final char[] b = com.google.android.gms.common.util.n.b;
            value[n] = b[n2 >>> 4];
            n = n3 + 1;
            value[n3] = b[n2 & 0xF];
            ++i;
        }
        return new String(value);
    }
    
    @RecentlyNonNull
    @a
    public static String b(@RecentlyNonNull final byte[] array) {
        return c(array, false);
    }
    
    @RecentlyNonNull
    @a
    public static String c(@RecentlyNonNull final byte[] array, @RecentlyNonNull final boolean b) {
        final int length = array.length;
        final StringBuilder sb = new StringBuilder(length << 1);
        for (int n = 0; n < length && (!b || n != length - 1 || (array[n] & 0xFF) != 0x0); ++n) {
            final char[] a = n.a;
            sb.append(a[(array[n] & 0xF0) >>> 4]);
            sb.append(a[array[n] & 0xF]);
        }
        return sb.toString();
    }
    
    @RecentlyNonNull
    @a
    public static byte[] d(@RecentlyNonNull final String s) throws IllegalArgumentException {
        final int length = s.length();
        if (length % 2 == 0) {
            final byte[] array = new byte[length / 2];
            int endIndex;
            for (int i = 0; i < length; i = endIndex) {
                final int n = i / 2;
                endIndex = i + 2;
                array[n] = (byte)Integer.parseInt(s.substring(i, endIndex), 16);
            }
            return array;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }
}
