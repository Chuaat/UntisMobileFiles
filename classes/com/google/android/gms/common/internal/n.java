// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.k0;
import f2.a;

@a
public final class n
{
    private static final int c = 15;
    @k0
    private static final String d;
    private final String a;
    @k0
    private final String b;
    
    public n(@RecentlyNonNull final String s) {
        this(s, null);
    }
    
    public n(@RecentlyNonNull final String a, @k0 final String b) {
        x.l(a, "log tag cannot be null");
        x.c(a.length() <= 23, "tag \"%s\" is longer than the %d character maximum", a, 23);
        this.a = a;
        if (b != null && b.length() > 0) {
            this.b = b;
            return;
        }
        this.b = null;
    }
    
    private final String r(final String str) {
        final String b = this.b;
        if (b == null) {
            return str;
        }
        return b.concat(str);
    }
    
    private final String s(String b, final Object... args) {
        final String format = String.format(b, args);
        b = this.b;
        if (b == null) {
            return format;
        }
        return b.concat(format);
    }
    
    @RecentlyNonNull
    @a
    public final boolean a(@RecentlyNonNull final int n) {
        return Log.isLoggable(this.a, n);
    }
    
    @RecentlyNonNull
    @a
    public final boolean b() {
        return false;
    }
    
    @a
    public final void c(@RecentlyNonNull final String s, @RecentlyNonNull final String s2) {
        if (this.a(3)) {
            Log.d(s, this.r(s2));
        }
    }
    
    @a
    public final void d(@RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final Throwable t) {
        if (this.a(3)) {
            Log.d(s, this.r(s2), t);
        }
    }
    
    @a
    public final void e(@RecentlyNonNull final String s, @RecentlyNonNull final String s2) {
        if (this.a(6)) {
            Log.e(s, this.r(s2));
        }
    }
    
    @a
    public final void f(@RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final Throwable t) {
        if (this.a(6)) {
            Log.e(s, this.r(s2), t);
        }
    }
    
    @a
    public final void g(@RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final Object... array) {
        if (this.a(6)) {
            Log.e(s, this.s(s2, array));
        }
    }
    
    @a
    public final void h(@RecentlyNonNull final String s, @RecentlyNonNull final String s2) {
        if (this.a(4)) {
            Log.i(s, this.r(s2));
        }
    }
    
    @a
    public final void i(@RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final Throwable t) {
        if (this.a(4)) {
            Log.i(s, this.r(s2), t);
        }
    }
    
    @a
    public final void j(@RecentlyNonNull String s, @RecentlyNonNull final String s2) {
        if (this.b()) {
            s = String.valueOf(s);
            if (" PII_LOG".length() != 0) {
                s = s.concat(" PII_LOG");
            }
            else {
                s = new String(s);
            }
            Log.i(s, this.r(s2));
        }
    }
    
    @a
    public final void k(@RecentlyNonNull String s, @RecentlyNonNull final String s2, @RecentlyNonNull final Throwable t) {
        if (this.b()) {
            s = String.valueOf(s);
            if (" PII_LOG".length() != 0) {
                s = s.concat(" PII_LOG");
            }
            else {
                s = new String(s);
            }
            Log.i(s, this.r(s2), t);
        }
    }
    
    @a
    public final void l(@RecentlyNonNull final String s, @RecentlyNonNull final String s2) {
        if (this.a(2)) {
            Log.v(s, this.r(s2));
        }
    }
    
    @a
    public final void m(@RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final Throwable t) {
        if (this.a(2)) {
            Log.v(s, this.r(s2), t);
        }
    }
    
    @a
    public final void n(@RecentlyNonNull final String s, @RecentlyNonNull final String s2) {
        if (this.a(5)) {
            Log.w(s, this.r(s2));
        }
    }
    
    @a
    public final void o(@RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final Throwable t) {
        if (this.a(5)) {
            Log.w(s, this.r(s2), t);
        }
    }
    
    @a
    public final void p(@RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final Object... array) {
        if (this.a(5)) {
            Log.w(this.a, this.s(s2, array));
        }
    }
    
    @a
    public final void q(@RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final Throwable t) {
        if (this.a(7)) {
            Log.e(s, this.r(s2), t);
            Log.wtf(s, this.r(s2), t);
        }
    }
}
