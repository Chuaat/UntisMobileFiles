// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.logging;

import java.util.Locale;
import androidx.annotation.k0;
import androidx.annotation.RecentlyNonNull;
import android.util.Log;
import com.google.android.gms.common.internal.n;

@f2.a
public class a
{
    private final String a;
    private final String b;
    private final n c;
    private final int d;
    
    private a(final String a, final String b) {
        this.b = b;
        this.a = a;
        this.c = new n(a);
        int d;
        for (d = 2; 7 >= d && !Log.isLoggable(this.a, d); ++d) {}
        this.d = d;
    }
    
    @f2.a
    public a(@RecentlyNonNull final String s, @RecentlyNonNull final String... array) {
        String string;
        if (array.length == 0) {
            string = "";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (final String str : array) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str);
            }
            sb.append(']');
            sb.append(' ');
            string = sb.toString();
        }
        this(s, string);
    }
    
    @f2.a
    public void a(@RecentlyNonNull final String s, @RecentlyNonNull final Throwable t, @k0 final Object... array) {
        if (this.h(3)) {
            Log.d(this.a, this.e(s, array), t);
        }
    }
    
    @f2.a
    public void b(@RecentlyNonNull final String s, @k0 final Object... array) {
        if (this.h(3)) {
            Log.d(this.a, this.e(s, array));
        }
    }
    
    @f2.a
    public void c(@RecentlyNonNull final String s, @RecentlyNonNull final Throwable t, @k0 final Object... array) {
        Log.e(this.a, this.e(s, array), t);
    }
    
    @f2.a
    public void d(@RecentlyNonNull final String s, @k0 final Object... array) {
        Log.e(this.a, this.e(s, array));
    }
    
    @RecentlyNonNull
    @f2.a
    protected String e(@RecentlyNonNull final String format, @k0 final Object... args) {
        String format2 = format;
        if (args != null) {
            format2 = format;
            if (args.length > 0) {
                format2 = String.format(Locale.US, format, args);
            }
        }
        return this.b.concat(format2);
    }
    
    @RecentlyNonNull
    @f2.a
    public String f() {
        return this.a;
    }
    
    @f2.a
    public void g(@RecentlyNonNull final String s, @k0 final Object... array) {
        Log.i(this.a, this.e(s, array));
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean h(@RecentlyNonNull final int n) {
        return this.d <= n;
    }
    
    @f2.a
    public void i(@RecentlyNonNull final String s, @RecentlyNonNull final Throwable t, @k0 final Object... array) {
        if (this.h(2)) {
            Log.v(this.a, this.e(s, array), t);
        }
    }
    
    @f2.a
    public void j(@RecentlyNonNull final String s, @k0 final Object... array) {
        if (this.h(2)) {
            Log.v(this.a, this.e(s, array));
        }
    }
    
    @f2.a
    public void k(@RecentlyNonNull final String s, @k0 final Object... array) {
        Log.w(this.a, this.e(s, array));
    }
    
    @f2.a
    public void l(@RecentlyNonNull final String s, @RecentlyNonNull final Throwable t, @k0 final Object... array) {
        Log.wtf(this.a, this.e(s, array), t);
    }
    
    @f2.a
    public void m(@RecentlyNonNull final Throwable t) {
        Log.wtf(this.a, t);
    }
}
