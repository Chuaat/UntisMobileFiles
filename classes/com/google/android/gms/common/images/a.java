// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.images;

import androidx.annotation.k0;
import androidx.annotation.RecentlyNonNull;

public final class a
{
    private final int a;
    private final int b;
    
    public a(@RecentlyNonNull final int a, @RecentlyNonNull final int b) {
        this.a = a;
        this.b = b;
    }
    
    @RecentlyNonNull
    public static a c(@RecentlyNonNull final String s) throws NumberFormatException {
        if (s != null) {
            int endIndex;
            if ((endIndex = s.indexOf(42)) < 0) {
                endIndex = s.indexOf(120);
            }
            if (endIndex >= 0) {
                try {
                    return new a(Integer.parseInt(s.substring(0, endIndex)), Integer.parseInt(s.substring(endIndex + 1)));
                }
                catch (NumberFormatException ex) {
                    throw d(s);
                }
            }
            throw d(s);
        }
        throw new IllegalArgumentException("string must not be null");
    }
    
    private static NumberFormatException d(final String s) {
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 16);
        sb.append("Invalid Size: \"");
        sb.append(s);
        sb.append("\"");
        throw new NumberFormatException(sb.toString());
    }
    
    @RecentlyNonNull
    public final int a() {
        return this.b;
    }
    
    @RecentlyNonNull
    public final int b() {
        return this.a;
    }
    
    @RecentlyNonNull
    @Override
    public final boolean equals(@k0 final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            if (this.a == a.a && this.b == a.b) {
                return true;
            }
        }
        return false;
    }
    
    @RecentlyNonNull
    @Override
    public final int hashCode() {
        final int b = this.b;
        final int a = this.a;
        return b ^ (a >>> 16 | a << 16);
    }
    
    @RecentlyNonNull
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(23);
        sb.append(a);
        sb.append("x");
        sb.append(b);
        return sb.toString();
    }
}
