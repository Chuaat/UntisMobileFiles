// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.internal;

public final class a
{
    private static final int a = 3;
    private static final int b = 4;
    private static final int c = 63;
    private static final byte d = 61;
    private static final byte[] e;
    private static final int[] f;
    
    static {
        e = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        f = new int[128];
        int n = 0;
        while (true) {
            final byte[] e2 = org.bson.internal.a.e;
            if (n >= e2.length) {
                break;
            }
            org.bson.internal.a.f[e2[n]] = n;
            ++n;
        }
    }
    
    private a() {
    }
    
    private static String a(final byte[] ascii) {
        return new String(ascii, 0, 0, ascii.length);
    }
    
    public static byte[] b(final String s) {
        final boolean endsWith = s.endsWith("==");
        final int n = 0;
        int n2;
        if (endsWith) {
            n2 = 2;
        }
        else if (s.endsWith("=")) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final int n3 = s.length() * 3 / 4 - n2;
        final byte[] array = new byte[n3];
        for (int n4 = 0, i = n; i < s.length(); i += 4, ++n4) {
            final int[] f = org.bson.internal.a.f;
            final int n5 = f[s.charAt(i)];
            final int n6 = f[s.charAt(i + 1)];
            final int n7 = n4 + 1;
            array[n4] = (byte)((n5 << 2 | n6 >> 4) & 0xFF);
            if (n7 >= n3) {
                return array;
            }
            final int n8 = f[s.charAt(i + 2)];
            n4 = n7 + 1;
            array[n7] = (byte)((n6 << 4 | n8 >> 2) & 0xFF);
            if (n4 >= n3) {
                return array;
            }
            array[n4] = (byte)((n8 << 6 | f[s.charAt(i + 3)]) & 0xFF);
        }
        return array;
    }
    
    public static String c(byte[] array) {
        final int n = array.length / 3;
        final int length = array.length;
        int i = 0;
        int n2;
        if (length % 3 == 0) {
            n2 = 0;
        }
        else {
            n2 = 4;
        }
        final byte[] array2 = new byte[n * 4 + n2];
        final int length2 = array.length;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (i < length2) {
            final byte b = array[i];
            final int n6 = (n3 + 1) % 3;
            int n7;
            if ((n7 = b) < 0) {
                n7 = b + 256;
            }
            final int n8 = (n5 << 8) + n7;
            int n9 = n4;
            if (n6 == 0) {
                final int n10 = n4 + 1;
                final byte[] e = org.bson.internal.a.e;
                array2[n4] = e[n8 >> 18 & 0x3F];
                final int n11 = n10 + 1;
                array2[n10] = e[n8 >> 12 & 0x3F];
                final int n12 = n11 + 1;
                array2[n11] = e[n8 >> 6 & 0x3F];
                n9 = n12 + 1;
                array2[n12] = e[n8 & 0x3F];
            }
            ++i;
            n3 = n6;
            n4 = n9;
            n5 = n8;
        }
        if (n3 != 1) {
            if (n3 == 2) {
                final int n13 = n4 + 1;
                array = org.bson.internal.a.e;
                array2[n4] = array[n5 >> 10 & 0x3F];
                final int n14 = n13 + 1;
                array2[n13] = array[n5 >> 4 & 0x3F];
                array2[n14] = array[n5 << 2 & 0x3F];
                array2[n14 + 1] = 61;
            }
        }
        else {
            final int n15 = n4 + 1;
            array = org.bson.internal.a.e;
            array2[n4] = array[n5 >> 2 & 0x3F];
            final int n16 = n15 + 1;
            array2[n15] = array[n5 << 4 & 0x3F];
            array2[n16] = 61;
            array2[n16 + 1] = 61;
        }
        return a(array2);
    }
}
