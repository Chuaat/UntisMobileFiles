// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class t6
{
    static final Charset a;
    private static final Charset b;
    public static final byte[] c;
    private static final ByteBuffer d;
    private static final s5 e;
    
    static {
        a = Charset.forName("UTF-8");
        b = Charset.forName("ISO-8859-1");
        final byte[] array = c = new byte[0];
        d = ByteBuffer.wrap(array);
        e = s5.c(array, 0, array.length, false);
    }
    
    static int a(int n, final byte[] array, final int n2, final int n3) {
        for (int i = n2; i < n2 + n3; ++i) {
            n = n * 31 + array[i];
        }
        return n;
    }
    
    public static int b(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static int c(final boolean b) {
        if (b) {
            return 1231;
        }
        return 1237;
    }
    
    static <T> T d(final T obj) {
        Objects.requireNonNull(obj);
        return obj;
    }
    
    static Object e(final Object o, final Object o2) {
        return ((z7)o).j().U3((z7)o2).e();
    }
    
    static <T> T f(final T obj, final String message) {
        Objects.requireNonNull(obj, message);
        return obj;
    }
    
    static boolean g(final z7 z7) {
        if (z7 instanceof t4) {
            final t4 t4 = (t4)z7;
        }
        return false;
    }
    
    public static boolean h(final byte[] array) {
        return u9.f(array);
    }
    
    public static String i(final byte[] bytes) {
        return new String(bytes, t6.a);
    }
    
    public static int j(final byte[] array) {
        final int length = array.length;
        int a;
        if ((a = a(length, array, 0, length)) == 0) {
            a = 1;
        }
        return a;
    }
}
