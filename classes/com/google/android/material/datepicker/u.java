// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import java.util.TimeZone;
import o2.a;
import android.content.res.Resources;
import java.text.SimpleDateFormat;
import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.util.Locale;
import androidx.annotation.j0;
import java.util.Calendar;
import androidx.annotation.k0;
import java.util.concurrent.atomic.AtomicReference;

class u
{
    static final String a = "UTC";
    static AtomicReference<t> b;
    
    static {
        u.b = new AtomicReference<t>();
    }
    
    private u() {
    }
    
    static void A(@k0 final t newValue) {
        u.b.set(newValue);
    }
    
    static long a(final long timeInMillis) {
        final Calendar v = v();
        v.setTimeInMillis(timeInMillis);
        return f(v).getTimeInMillis();
    }
    
    private static int b(@j0 final String s, @j0 final String s2, final int n, int index) {
        while (index >= 0 && index < s.length() && s2.indexOf(s.charAt(index)) == -1) {
            int n2 = index;
            if (s.charAt(index) == '\'') {
                do {
                    index = (n2 = index + n);
                    if (index < 0 || (n2 = index) >= s.length()) {
                        break;
                    }
                    n2 = index;
                } while (s.charAt(index) != '\'');
            }
            index = n2 + n;
        }
        return index;
    }
    
    @TargetApi(24)
    static DateFormat c(final Locale locale) {
        return e("MMMd", locale);
    }
    
    @TargetApi(24)
    static DateFormat d(final Locale locale) {
        return e("MMMEd", locale);
    }
    
    @TargetApi(24)
    private static DateFormat e(final String s, final Locale locale) {
        final DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(s, locale);
        instanceForSkeleton.setTimeZone(u());
        return instanceForSkeleton;
    }
    
    static Calendar f(Calendar v) {
        final Calendar w = w(v);
        v = v();
        v.set(w.get(1), w.get(2), w.get(5));
        return v;
    }
    
    private static java.text.DateFormat g(final int style, final Locale aLocale) {
        final java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(style, aLocale);
        dateInstance.setTimeZone(s());
        return dateInstance;
    }
    
    static java.text.DateFormat h() {
        return i(Locale.getDefault());
    }
    
    static java.text.DateFormat i(final Locale locale) {
        return g(0, locale);
    }
    
    static java.text.DateFormat j() {
        return k(Locale.getDefault());
    }
    
    static java.text.DateFormat k(final Locale locale) {
        return g(2, locale);
    }
    
    static java.text.DateFormat l() {
        return m(Locale.getDefault());
    }
    
    static java.text.DateFormat m(final Locale locale) {
        final SimpleDateFormat simpleDateFormat = (SimpleDateFormat)k(locale);
        simpleDateFormat.applyPattern(z(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }
    
    static SimpleDateFormat n(final String s) {
        return o(s, Locale.getDefault());
    }
    
    private static SimpleDateFormat o(final String pattern, final Locale locale) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);
        simpleDateFormat.setTimeZone(s());
        return simpleDateFormat;
    }
    
    static SimpleDateFormat p() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat)java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(s());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }
    
    static String q(final Resources resources, final SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat.toLocalizedPattern().replaceAll("d", resources.getString(o2.a.m.M0)).replaceAll("M", resources.getString(o2.a.m.N0)).replaceAll("y", resources.getString(o2.a.m.O0));
    }
    
    static t r() {
        t e;
        if ((e = u.b.get()) == null) {
            e = t.e();
        }
        return e;
    }
    
    private static TimeZone s() {
        return TimeZone.getTimeZone("UTC");
    }
    
    static Calendar t() {
        final Calendar c = r().c();
        c.set(11, 0);
        c.set(12, 0);
        c.set(13, 0);
        c.set(14, 0);
        c.setTimeZone(s());
        return c;
    }
    
    @TargetApi(24)
    private static android.icu.util.TimeZone u() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }
    
    static Calendar v() {
        return w(null);
    }
    
    static Calendar w(@k0 final Calendar calendar) {
        final Calendar instance = Calendar.getInstance(s());
        if (calendar == null) {
            instance.clear();
        }
        else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
    
    @TargetApi(24)
    static DateFormat x(final Locale locale) {
        return e("yMMMd", locale);
    }
    
    @TargetApi(24)
    static DateFormat y(final Locale locale) {
        return e("yMMMEd", locale);
    }
    
    @j0
    private static String z(@j0 final String s) {
        final int b = b(s, "yY", 1, 0);
        if (b >= s.length()) {
            return s;
        }
        String string = "EMd";
        final int b2 = b(s, "EMd", 1, b);
        if (b2 < s.length()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("EMd");
            sb.append(",");
            string = sb.toString();
        }
        return s.replace(s.substring(b(s, string, -1, b) + 1, b2), " ").trim();
    }
}
