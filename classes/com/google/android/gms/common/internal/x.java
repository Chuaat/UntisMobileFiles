// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import androidx.annotation.j0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import java.util.Objects;
import androidx.annotation.k0;
import android.text.TextUtils;
import com.google.android.gms.common.util.g0;
import android.os.Looper;
import android.os.Handler;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public final class x
{
    private x() {
        throw new AssertionError((Object)"Uninstantiable");
    }
    
    @a
    public static void a(@RecentlyNonNull final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    @a
    public static void b(@RecentlyNonNull final boolean b, @RecentlyNonNull final Object obj) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
    
    @a
    public static void c(@RecentlyNonNull final boolean b, @RecentlyNonNull final String format, @RecentlyNonNull final Object... args) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.format(format, args));
    }
    
    @a
    public static void d(@RecentlyNonNull final Handler handler) {
        final Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name;
            if (myLooper != null) {
                name = myLooper.getThread().getName();
            }
            else {
                name = "null current looper";
            }
            final String name2 = handler.getLooper().getThread().getName();
            final StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    @a
    public static void e(@RecentlyNonNull final Handler handler, @RecentlyNonNull final String s) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    @a
    public static void f(@RecentlyNonNull final String s) {
        if (g0.a()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    @RecentlyNonNull
    @a
    public static String g(@RecentlyNonNull final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }
    
    @RecentlyNonNull
    @a
    public static String h(@RecentlyNonNull final String s, @RecentlyNonNull final Object obj) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
    
    @a
    public static void i() {
        j("Must not be called on the main application thread");
    }
    
    @a
    public static void j(@RecentlyNonNull final String s) {
        if (!g0.a()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    @EnsuresNonNull({ "#1" })
    @j0
    @a
    public static <T> T k(@k0 final T obj) {
        Objects.requireNonNull(obj, "null reference");
        return obj;
    }
    
    @EnsuresNonNull({ "#1" })
    @j0
    @a
    public static <T> T l(@RecentlyNonNull final T t, @RecentlyNonNull final Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
    
    @RecentlyNonNull
    @a
    public static int m(@RecentlyNonNull final int n) {
        if (n != 0) {
            return n;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }
    
    @RecentlyNonNull
    @a
    public static int n(@RecentlyNonNull final int n, @RecentlyNonNull final Object obj) {
        if (n != 0) {
            return n;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
    
    @RecentlyNonNull
    @a
    public static long o(@RecentlyNonNull final long n) {
        if (n != 0L) {
            return n;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }
    
    @RecentlyNonNull
    @a
    public static long p(@RecentlyNonNull final long n, @RecentlyNonNull final Object obj) {
        if (n != 0L) {
            return n;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
    
    @a
    public static void q(@RecentlyNonNull final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    @a
    public static void r(@RecentlyNonNull final boolean b, @RecentlyNonNull final Object obj) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
    
    @a
    public static void s(@RecentlyNonNull final boolean b, @RecentlyNonNull final String format, @RecentlyNonNull final Object... args) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.format(format, args));
    }
}
