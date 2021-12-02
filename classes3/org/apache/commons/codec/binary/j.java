// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

import org.apache.commons.codec.f;
import org.apache.commons.codec.h;
import org.apache.commons.codec.b;
import org.apache.commons.codec.a;

public class j implements a, b
{
    private static final char[] a;
    private static final byte[] b;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 4;
    private static final int f = 8;
    private static final int g = 16;
    private static final int h = 32;
    private static final int i = 64;
    private static final int j = 128;
    private static final int[] k;
    
    static {
        a = new char[0];
        b = new byte[0];
        k = new int[] { 1, 2, 4, 8, 16, 32, 64, 128 };
    }
    
    public static byte[] g(final byte[] array) {
        if (i(array)) {
            return org.apache.commons.codec.binary.j.b;
        }
        final int n = array.length >> 3;
        final byte[] array2 = new byte[n];
        for (int n2 = array.length - 1, i = 0; i < n; ++i, n2 -= 8) {
            int n3 = 0;
            while (true) {
                final int[] k = org.apache.commons.codec.binary.j.k;
                if (n3 >= k.length) {
                    break;
                }
                if (array[n2 - n3] == 49) {
                    array2[i] |= (byte)k[n3];
                }
                ++n3;
            }
        }
        return array2;
    }
    
    public static byte[] h(final char[] array) {
        if (array != null && array.length != 0) {
            final int n = array.length >> 3;
            final byte[] array2 = new byte[n];
            for (int n2 = array.length - 1, i = 0; i < n; ++i, n2 -= 8) {
                int n3 = 0;
                while (true) {
                    final int[] k = org.apache.commons.codec.binary.j.k;
                    if (n3 >= k.length) {
                        break;
                    }
                    if (array[n2 - n3] == '1') {
                        array2[i] |= (byte)k[n3];
                    }
                    ++n3;
                }
            }
            return array2;
        }
        return org.apache.commons.codec.binary.j.b;
    }
    
    private static boolean i(final byte[] array) {
        return array == null || array.length == 0;
    }
    
    public static byte[] j(final byte[] array) {
        if (i(array)) {
            return org.apache.commons.codec.binary.j.b;
        }
        final int n = array.length << 3;
        final byte[] array2 = new byte[n];
        for (int n2 = n - 1, i = 0; i < array.length; ++i, n2 -= 8) {
            int n3 = 0;
            while (true) {
                final int[] k = org.apache.commons.codec.binary.j.k;
                if (n3 >= k.length) {
                    break;
                }
                if ((k[n3] & array[i]) == 0x0) {
                    array2[n2 - n3] = 48;
                }
                else {
                    array2[n2 - n3] = 49;
                }
                ++n3;
            }
        }
        return array2;
    }
    
    public static char[] k(final byte[] array) {
        if (i(array)) {
            return org.apache.commons.codec.binary.j.a;
        }
        int n = array.length << 3;
        final char[] array2 = new char[n];
        --n;
        for (int i = 0; i < array.length; ++i, n -= 8) {
            int n2 = 0;
            while (true) {
                final int[] k = org.apache.commons.codec.binary.j.k;
                if (n2 >= k.length) {
                    break;
                }
                if ((k[n2] & array[i]) == 0x0) {
                    array2[n - n2] = 48;
                }
                else {
                    array2[n - n2] = 49;
                }
                ++n2;
            }
        }
        return array2;
    }
    
    public static String l(final byte[] array) {
        return new String(k(array));
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o instanceof byte[]) {
            return k((byte[])o);
        }
        throw new h("argument not a byte array");
    }
    
    @Override
    public byte[] c(final byte[] array) {
        return g(array);
    }
    
    @Override
    public byte[] e(final byte[] array) {
        return j(array);
    }
    
    @Override
    public Object f(final Object o) throws f {
        if (o == null) {
            return org.apache.commons.codec.binary.j.b;
        }
        if (o instanceof byte[]) {
            return g((byte[])o);
        }
        if (o instanceof char[]) {
            return h((char[])o);
        }
        if (o instanceof String) {
            return h(((String)o).toCharArray());
        }
        throw new f("argument not a byte array");
    }
    
    public byte[] m(final String s) {
        if (s == null) {
            return org.apache.commons.codec.binary.j.b;
        }
        return h(s.toCharArray());
    }
}
