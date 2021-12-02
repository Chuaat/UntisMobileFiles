// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import android.text.TextUtils;
import java.util.Objects;
import androidx.annotation.k0;
import androidx.annotation.b0;
import java.util.Locale;
import androidx.annotation.j0;
import androidx.annotation.t0;

@t0({ t0.a.I })
public final class n
{
    private n() {
    }
    
    public static void a(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void b(final boolean b, @j0 final Object obj) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
    
    public static int c(final int n, final int n2, final int n3, @j0 final String s) {
        if (n < n2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", s, n2, n3));
        }
        if (n <= n3) {
            return n;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", s, n2, n3));
    }
    
    @b0(from = 0L)
    public static int d(final int n) {
        if (n >= 0) {
            return n;
        }
        throw new IllegalArgumentException();
    }
    
    @b0(from = 0L)
    public static int e(final int n, @k0 final String s) {
        if (n >= 0) {
            return n;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static int f(final int i, final int j) {
        if ((i & j) == i) {
            return i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Requested flags 0x");
        sb.append(Integer.toHexString(i));
        sb.append(", but only 0x");
        sb.append(Integer.toHexString(j));
        sb.append(" are allowed");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @j0
    public static <T> T g(@k0 final T obj) {
        Objects.requireNonNull(obj);
        return obj;
    }
    
    @j0
    public static <T> T h(@k0 final T t, @j0 final Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
    
    public static void i(final boolean b) {
        j(b, null);
    }
    
    public static void j(final boolean b, @k0 final String s) {
        if (b) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    @j0
    public static <T extends CharSequence> T k(@k0 final T t) {
        if (!TextUtils.isEmpty((CharSequence)t)) {
            return t;
        }
        throw new IllegalArgumentException();
    }
    
    @j0
    public static <T extends CharSequence> T l(@k0 final T t, @j0 final Object obj) {
        if (!TextUtils.isEmpty((CharSequence)t)) {
            return t;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
    
    @j0
    public static <T extends CharSequence> T m(@k0 final T t, @j0 final String format, @j0 final Object... args) {
        if (!TextUtils.isEmpty((CharSequence)t)) {
            return t;
        }
        throw new IllegalArgumentException(String.format(format, args));
    }
}
