// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import java.util.TimeZone;
import android.content.Context;
import android.os.Build$VERSION;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;
import java.text.SimpleDateFormat;
import androidx.core.util.j;
import androidx.annotation.k0;

class g
{
    private g() {
    }
    
    static j<String, String> a(@k0 final Long n, @k0 final Long n2) {
        return b(n, n2, null);
    }
    
    static j<String, String> b(@k0 final Long n, @k0 final Long n2, @k0 final SimpleDateFormat simpleDateFormat) {
        if (n == null && n2 == null) {
            return j.a((String)null, (String)null);
        }
        if (n == null) {
            return j.a((String)null, d(n2, simpleDateFormat));
        }
        if (n2 == null) {
            return j.a(d(n, simpleDateFormat), (String)null);
        }
        final Calendar t = u.t();
        final Calendar v = u.v();
        v.setTimeInMillis(n);
        final Calendar v2 = u.v();
        v2.setTimeInMillis(n2);
        if (simpleDateFormat != null) {
            return j.a(simpleDateFormat.format(new Date(n)), simpleDateFormat.format(new Date(n2)));
        }
        if (v.get(1) != v2.get(1)) {
            return j.a(k(n, Locale.getDefault()), k(n2, Locale.getDefault()));
        }
        if (v.get(1) == t.get(1)) {
            return j.a(f(n, Locale.getDefault()), f(n2, Locale.getDefault()));
        }
        return j.a(f(n, Locale.getDefault()), k(n2, Locale.getDefault()));
    }
    
    static String c(final long n) {
        return d(n, null);
    }
    
    static String d(final long n, @k0 final SimpleDateFormat simpleDateFormat) {
        final Calendar t = u.t();
        final Calendar v = u.v();
        v.setTimeInMillis(n);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(n));
        }
        if (t.get(1) == v.get(1)) {
            return e(n);
        }
        return j(n);
    }
    
    static String e(final long n) {
        return f(n, Locale.getDefault());
    }
    
    static String f(final long n, final Locale locale) {
        if (Build$VERSION.SDK_INT >= 24) {
            return u.c(locale).format(new Date(n));
        }
        return u.m(locale).format(new Date(n));
    }
    
    static String g(final long n) {
        return h(n, Locale.getDefault());
    }
    
    static String h(final long n, final Locale locale) {
        if (Build$VERSION.SDK_INT >= 24) {
            return u.d(locale).format(new Date(n));
        }
        return u.i(locale).format(new Date(n));
    }
    
    static String i(final Context context, final long date) {
        return DateUtils.formatDateTime(context, date - TimeZone.getDefault().getOffset(date), 36);
    }
    
    static String j(final long n) {
        return k(n, Locale.getDefault());
    }
    
    static String k(final long n, final Locale locale) {
        if (Build$VERSION.SDK_INT >= 24) {
            return u.x(locale).format(new Date(n));
        }
        return u.k(locale).format(new Date(n));
    }
    
    static String l(final long n) {
        return m(n, Locale.getDefault());
    }
    
    static String m(final long n, final Locale locale) {
        if (Build$VERSION.SDK_INT >= 24) {
            return u.y(locale).format(new Date(n));
        }
        return u.i(locale).format(new Date(n));
    }
}
