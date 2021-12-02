// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util;

import android.os.Looper;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.ArrayDeque;
import java.util.Queue;
import androidx.annotation.j0;
import com.bumptech.glide.load.model.l;
import androidx.annotation.k0;

public final class m
{
    private static final int a = 31;
    private static final int b = 17;
    private static final char[] c;
    private static final char[] d;
    
    static {
        c = "0123456789abcdef".toCharArray();
        d = new char[64];
    }
    
    private m() {
    }
    
    public static void a() {
        if (s()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on a background thread");
    }
    
    public static void b() {
        if (t()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }
    
    public static boolean c(@k0 final Object o, @k0 final Object obj) {
        if (o == null) {
            return obj == null;
        }
        if (o instanceof l) {
            return ((l)o).a(obj);
        }
        return o.equals(obj);
    }
    
    public static boolean d(@k0 final Object o, @k0 final Object obj) {
        boolean equals;
        if (o == null) {
            equals = (obj == null);
        }
        else {
            equals = o.equals(obj);
        }
        return equals;
    }
    
    @j0
    private static String e(@j0 final byte[] array, @j0 final char[] value) {
        for (int i = 0; i < array.length; ++i) {
            final int n = array[i] & 0xFF;
            final int n2 = i * 2;
            final char[] c = m.c;
            value[n2] = c[n >>> 4];
            value[n2 + 1] = c[n & 0xF];
        }
        return new String(value);
    }
    
    @j0
    public static <T> Queue<T> f(final int numElements) {
        return new ArrayDeque<T>(numElements);
    }
    
    public static int g(final int n, final int n2, @k0 final Bitmap$Config bitmap$Config) {
        return n * n2 * i(bitmap$Config);
    }
    
    @TargetApi(19)
    public static int h(@j0 final Bitmap obj) {
        Label_0032: {
            if (obj.isRecycled()) {
                break Label_0032;
            }
            Label_0022: {
                if (Build$VERSION.SDK_INT < 19) {
                    break Label_0022;
                }
                try {
                    return obj.getAllocationByteCount();
                    return obj.getHeight() * obj.getRowBytes();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Cannot obtain size for recycled Bitmap: ");
                    sb.append(obj);
                    sb.append("[");
                    sb.append(obj.getWidth());
                    sb.append("x");
                    sb.append(obj.getHeight());
                    sb.append("] ");
                    sb.append(obj.getConfig());
                    throw new IllegalStateException(sb.toString());
                }
                catch (NullPointerException ex) {
                    return obj.getHeight() * obj.getRowBytes();
                }
            }
        }
    }
    
    private static int i(@k0 final Bitmap$Config bitmap$Config) {
        Bitmap$Config argb_8888 = bitmap$Config;
        if (bitmap$Config == null) {
            argb_8888 = Bitmap$Config.ARGB_8888;
        }
        final int n = m$a.a[argb_8888.ordinal()];
        int n2 = 4;
        if (n != 1) {
            if (n != 2 && n != 3) {
                if (n == 4) {
                    n2 = 8;
                }
            }
            else {
                n2 = 2;
            }
        }
        else {
            n2 = 1;
        }
        return n2;
    }
    
    @Deprecated
    public static int j(@j0 final Bitmap bitmap) {
        return h(bitmap);
    }
    
    @j0
    public static <T> List<T> k(@j0 final Collection<T> collection) {
        final ArrayList<T> list = new ArrayList<T>(collection.size());
        for (final T next : collection) {
            if (next != null) {
                list.add(next);
            }
        }
        return list;
    }
    
    public static int l(final float n) {
        return m(n, 17);
    }
    
    public static int m(final float value, final int n) {
        return o(Float.floatToIntBits(value), n);
    }
    
    public static int n(final int n) {
        return o(n, 17);
    }
    
    public static int o(final int n, final int n2) {
        return n2 * 31 + n;
    }
    
    public static int p(@k0 final Object o, final int n) {
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        return o(hashCode, n);
    }
    
    public static int q(final boolean b) {
        return r(b, 17);
    }
    
    public static int r(final boolean b, final int n) {
        return o(b ? 1 : 0, n);
    }
    
    public static boolean s() {
        return t() ^ true;
    }
    
    public static boolean t() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
    
    private static boolean u(final int n) {
        return n > 0 || n == Integer.MIN_VALUE;
    }
    
    public static boolean v(final int n, final int n2) {
        return u(n) && u(n2);
    }
    
    @j0
    public static String w(@j0 final byte[] array) {
        final char[] d = m.d;
        synchronized (d) {
            return e(array, d);
        }
    }
}
