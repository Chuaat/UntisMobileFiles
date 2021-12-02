// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class l1
{
    static final Charset a;
    private static final Charset b;
    public static final byte[] c;
    private static final ByteBuffer d;
    private static final m0 e;
    
    static {
        a = Charset.forName("UTF-8");
        b = Charset.forName("ISO-8859-1");
        final byte[] array = c = new byte[0];
        d = ByteBuffer.wrap(array);
        e = m0.b(array, 0, array.length, false);
    }
    
    static <T> T a(final T obj) {
        Objects.requireNonNull(obj);
        return obj;
    }
    
    public static int b(final byte[] array) {
        final int length = array.length;
        int c;
        if ((c = c(length, array, 0, length)) == 0) {
            c = 1;
        }
        return c;
    }
    
    static int c(int n, final byte[] array, final int n2, final int n3) {
        for (int i = n2; i < n2 + n3; ++i) {
            n = n * 31 + array[i];
        }
        return n;
    }
    
    static Object d(final Object o, final Object o2) {
        return ((s2)o).b().j3((s2)o2).i3();
    }
    
    static <T> T e(final T obj, final String message) {
        Objects.requireNonNull(obj, message);
        return obj;
    }
    
    public static int f(final boolean b) {
        if (b) {
            return 1231;
        }
        return 1237;
    }
    
    public static boolean g(final byte[] array) {
        return l4.h(array);
    }
    
    public static String h(final byte[] bytes) {
        return new String(bytes, l1.a);
    }
    
    static boolean i(final s2 s2) {
        return false;
    }
    
    public static int j(final long n) {
        return (int)(n ^ n >>> 32);
    }
}
