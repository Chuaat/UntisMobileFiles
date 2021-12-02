// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.nio.charset.Charset;

public final class e5
{
    private static final Charset a;
    private static final Charset b;
    public static final Object c;
    
    static {
        a = Charset.forName("UTF-8");
        b = Charset.forName("ISO-8859-1");
        c = new Object();
    }
    
    public static boolean a(final int[] a, final int[] a2) {
        if (a != null && a.length != 0) {
            return Arrays.equals(a, a2);
        }
        return a2 == null || a2.length == 0;
    }
    
    public static boolean b(final long[] a, final long[] a2) {
        if (a != null && a.length != 0) {
            return Arrays.equals(a, a2);
        }
        return a2 == null || a2.length == 0;
    }
    
    public static boolean c(final Object[] array, final Object[] array2) {
        int length;
        if (array == null) {
            length = 0;
        }
        else {
            length = array.length;
        }
        int length2;
        if (array2 == null) {
            length2 = 0;
        }
        else {
            length2 = array2.length;
        }
        int n = 0;
        int n2 = 0;
        while (true) {
            int n3 = n2;
            if (n < length) {
                n3 = n2;
                if (array[n] == null) {
                    ++n;
                    continue;
                }
            }
            while (n3 < length2 && array2[n3] == null) {
                ++n3;
            }
            final boolean b = n >= length;
            final boolean b2 = n3 >= length2;
            if (b && b2) {
                return true;
            }
            if (b != b2) {
                return false;
            }
            if (!array[n].equals(array2[n3])) {
                return false;
            }
            ++n;
            n2 = n3 + 1;
        }
    }
    
    public static int d(final int[] a) {
        if (a != null && a.length != 0) {
            return Arrays.hashCode(a);
        }
        return 0;
    }
    
    public static int e(final long[] a) {
        if (a != null && a.length != 0) {
            return Arrays.hashCode(a);
        }
        return 0;
    }
    
    public static int f(final Object[] array) {
        int i = 0;
        int length;
        if (array == null) {
            length = 0;
        }
        else {
            length = array.length;
        }
        int n = 0;
        while (i < length) {
            final Object o = array[i];
            int n2 = n;
            if (o != null) {
                n2 = n * 31 + o.hashCode();
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    public static int g(final byte[][] array) {
        int i = 0;
        int length;
        if (array == null) {
            length = 0;
        }
        else {
            length = array.length;
        }
        int n = 0;
        while (i < length) {
            final byte[] a = array[i];
            int n2 = n;
            if (a != null) {
                n2 = n * 31 + Arrays.hashCode(a);
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    public static void h(final a5 a5, final a5 a6) {
        final c5 h = a5.H;
        if (h != null) {
            a6.H = (c5)h.clone();
        }
    }
    
    public static boolean i(final byte[][] array, final byte[][] array2) {
        int length;
        if (array == null) {
            length = 0;
        }
        else {
            length = array.length;
        }
        int length2;
        if (array2 == null) {
            length2 = 0;
        }
        else {
            length2 = array2.length;
        }
        int n = 0;
        int n2 = 0;
        while (true) {
            int n3 = n2;
            if (n < length) {
                n3 = n2;
                if (array[n] == null) {
                    ++n;
                    continue;
                }
            }
            while (n3 < length2 && array2[n3] == null) {
                ++n3;
            }
            final boolean b = n >= length;
            final boolean b2 = n3 >= length2;
            if (b && b2) {
                return true;
            }
            if (b != b2) {
                return false;
            }
            if (!Arrays.equals(array[n], array2[n3])) {
                return false;
            }
            ++n;
            n2 = n3 + 1;
        }
    }
}
