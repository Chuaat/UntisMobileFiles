// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public final class k1
{
    public static int a(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return n;
        }
        String s;
        if (n >= 0) {
            if (n2 < 0) {
                final StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(n2);
                throw new IllegalArgumentException(sb.toString());
            }
            s = m1.c("%s (%s) must be less than size (%s)", "index", n, n2);
        }
        else {
            s = m1.c("%s (%s) must not be negative", "index", n);
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    @NonNullDecl
    public static <T> T b(@NonNullDecl final T obj) {
        Objects.requireNonNull(obj);
        return obj;
    }
    
    @NonNullDecl
    public static <T> T c(@NonNullDecl final T t, @NullableDecl final Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
    
    private static String d(final int n, final int n2, @NullableDecl final String s) {
        if (n < 0) {
            return m1.c("%s (%s) must not be negative", s, n);
        }
        if (n2 >= 0) {
            return m1.c("%s (%s) must not be greater than size (%s)", s, n, n2);
        }
        final StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void e(final int i, final int j, final int n) {
        if (i >= 0 && j >= i && j <= n) {
            return;
        }
        String s;
        if (i >= 0 && i <= n) {
            if (j >= 0 && j <= n) {
                s = m1.c("end index (%s) must not be less than start index (%s)", j, i);
            }
            else {
                s = d(j, n, "end index");
            }
        }
        else {
            s = d(i, n, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void f(final boolean b, @NullableDecl final Object obj) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
    
    public static int g(final int n, final int n2) {
        if (n >= 0 && n <= n2) {
            return n;
        }
        throw new IndexOutOfBoundsException(d(n, n2, "index"));
    }
    
    public static void h(final boolean b, @NullableDecl final Object obj) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
