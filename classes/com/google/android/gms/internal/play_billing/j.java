// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class j
{
    public static int a(final int n, final int n2, @NullableDecl String s) {
        if (n >= 0 && n < n2) {
            return n;
        }
        if (n >= 0) {
            if (n2 < 0) {
                final StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(n2);
                throw new IllegalArgumentException(sb.toString());
            }
            s = k.a("%s (%s) must be less than size (%s)", "index", n, n2);
        }
        else {
            s = k.a("%s (%s) must not be negative", "index", n);
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static int b(final int n, final int n2, @NullableDecl final String s) {
        if (n >= 0 && n <= n2) {
            return n;
        }
        throw new IndexOutOfBoundsException(d(n, n2, "index"));
    }
    
    public static void c(final int i, final int j, final int n) {
        if (i >= 0 && j >= i && j <= n) {
            return;
        }
        String s;
        if (i >= 0 && i <= n) {
            if (j >= 0 && j <= n) {
                s = k.a("end index (%s) must not be less than start index (%s)", j, i);
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
    
    private static String d(final int n, final int n2, @NullableDecl final String s) {
        if (n < 0) {
            return k.a("%s (%s) must not be negative", s, n);
        }
        if (n2 >= 0) {
            return k.a("%s (%s) must not be greater than size (%s)", s, n, n2);
        }
        final StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
}
