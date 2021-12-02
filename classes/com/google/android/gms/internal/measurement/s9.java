// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class s9
{
    static final Charset a;
    static final Charset b;
    public static final byte[] c;
    public static final ByteBuffer d;
    public static final m8 e;
    
    static {
        a = Charset.forName("UTF-8");
        b = Charset.forName("ISO-8859-1");
        final byte[] array = c = new byte[0];
        d = ByteBuffer.wrap(array);
        final int b2 = m8.b;
        final k8 e2 = new k8(array, 0, 0, false, null);
        try {
            e2.c(0);
            e = e2;
        }
        catch (u9 cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    public static int a(final boolean b) {
        if (b) {
            return 1231;
        }
        return 1237;
    }
    
    public static int b(final byte[] array) {
        final int length = array.length;
        int d;
        if ((d = d(length, array, 0, length)) == 0) {
            d = 1;
        }
        return d;
    }
    
    public static int c(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    static int d(int n, final byte[] array, int i, final int n2) {
        for (i = 0; i < n2; ++i) {
            n = n * 31 + array[i];
        }
        return n;
    }
    
    static <T> T e(final T obj) {
        Objects.requireNonNull(obj);
        return obj;
    }
    
    static <T> T f(final T obj, final String message) {
        Objects.requireNonNull(obj, message);
        return obj;
    }
    
    static Object g(final Object o, final Object o2) {
        return ((sa)o).a().U4((sa)o2).j2();
    }
    
    public static String h(final byte[] bytes) {
        return new String(bytes, s9.a);
    }
    
    public static boolean i(final byte[] array) {
        return kc.e(array);
    }
}
