// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

import org.joda.time.i0;
import java.io.IOException;
import org.joda.time.o0;
import java.io.Writer;
import org.joda.time.e0;
import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;

public class p
{
    private static final String a = "org.joda.time.format.messages";
    private static final ConcurrentMap<Locale, q> b;
    
    static {
        b = new ConcurrentHashMap<Locale, q>();
    }
    
    protected p() {
    }
    
    private static q a(final ResourceBundle resourceBundle, final Locale locale) {
        final String[] f = f(resourceBundle);
        return new r().F().B(resourceBundle.getString("PeriodFormat.year"), resourceBundle.getString("PeriodFormat.years")).w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).m().B(resourceBundle.getString("PeriodFormat.month"), resourceBundle.getString("PeriodFormat.months")).w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).E().B(resourceBundle.getString("PeriodFormat.week"), resourceBundle.getString("PeriodFormat.weeks")).w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).e().B(resourceBundle.getString("PeriodFormat.day"), resourceBundle.getString("PeriodFormat.days")).w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).h().B(resourceBundle.getString("PeriodFormat.hour"), resourceBundle.getString("PeriodFormat.hours")).w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).l().B(resourceBundle.getString("PeriodFormat.minute"), resourceBundle.getString("PeriodFormat.minutes")).w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).r().B(resourceBundle.getString("PeriodFormat.second"), resourceBundle.getString("PeriodFormat.seconds")).w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f).j().B(resourceBundle.getString("PeriodFormat.millisecond"), resourceBundle.getString("PeriodFormat.milliseconds")).R().p(locale);
    }
    
    private static q b(final ResourceBundle resourceBundle, final Locale locale) {
        final String[] f = f(resourceBundle);
        final String string = resourceBundle.getString("PeriodFormat.regex.separator");
        final r r = new r();
        r.F();
        if (d(resourceBundle, "PeriodFormat.years.regex")) {
            r.D(resourceBundle.getString("PeriodFormat.years.regex").split(string), resourceBundle.getString("PeriodFormat.years.list").split(string));
        }
        else {
            r.B(resourceBundle.getString("PeriodFormat.year"), resourceBundle.getString("PeriodFormat.years"));
        }
        r.w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        r.m();
        if (d(resourceBundle, "PeriodFormat.months.regex")) {
            r.D(resourceBundle.getString("PeriodFormat.months.regex").split(string), resourceBundle.getString("PeriodFormat.months.list").split(string));
        }
        else {
            r.B(resourceBundle.getString("PeriodFormat.month"), resourceBundle.getString("PeriodFormat.months"));
        }
        r.w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        r.E();
        if (d(resourceBundle, "PeriodFormat.weeks.regex")) {
            r.D(resourceBundle.getString("PeriodFormat.weeks.regex").split(string), resourceBundle.getString("PeriodFormat.weeks.list").split(string));
        }
        else {
            r.B(resourceBundle.getString("PeriodFormat.week"), resourceBundle.getString("PeriodFormat.weeks"));
        }
        r.w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        r.e();
        if (d(resourceBundle, "PeriodFormat.days.regex")) {
            r.D(resourceBundle.getString("PeriodFormat.days.regex").split(string), resourceBundle.getString("PeriodFormat.days.list").split(string));
        }
        else {
            r.B(resourceBundle.getString("PeriodFormat.day"), resourceBundle.getString("PeriodFormat.days"));
        }
        r.w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        r.h();
        if (d(resourceBundle, "PeriodFormat.hours.regex")) {
            r.D(resourceBundle.getString("PeriodFormat.hours.regex").split(string), resourceBundle.getString("PeriodFormat.hours.list").split(string));
        }
        else {
            r.B(resourceBundle.getString("PeriodFormat.hour"), resourceBundle.getString("PeriodFormat.hours"));
        }
        r.w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        r.l();
        if (d(resourceBundle, "PeriodFormat.minutes.regex")) {
            r.D(resourceBundle.getString("PeriodFormat.minutes.regex").split(string), resourceBundle.getString("PeriodFormat.minutes.list").split(string));
        }
        else {
            r.B(resourceBundle.getString("PeriodFormat.minute"), resourceBundle.getString("PeriodFormat.minutes"));
        }
        r.w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        r.r();
        if (d(resourceBundle, "PeriodFormat.seconds.regex")) {
            r.D(resourceBundle.getString("PeriodFormat.seconds.regex").split(string), resourceBundle.getString("PeriodFormat.seconds.list").split(string));
        }
        else {
            r.B(resourceBundle.getString("PeriodFormat.second"), resourceBundle.getString("PeriodFormat.seconds"));
        }
        r.w(resourceBundle.getString("PeriodFormat.commaspace"), resourceBundle.getString("PeriodFormat.spaceandspace"), f);
        r.j();
        if (d(resourceBundle, "PeriodFormat.milliseconds.regex")) {
            r.D(resourceBundle.getString("PeriodFormat.milliseconds.regex").split(string), resourceBundle.getString("PeriodFormat.milliseconds.list").split(string));
        }
        else {
            r.B(resourceBundle.getString("PeriodFormat.millisecond"), resourceBundle.getString("PeriodFormat.milliseconds"));
        }
        return r.R().p(locale);
    }
    
    private static q c(final Locale locale) {
        final ResourceBundle bundle = ResourceBundle.getBundle("org.joda.time.format.messages", locale);
        if (d(bundle, "PeriodFormat.regex.separator")) {
            return b(bundle, locale);
        }
        return a(bundle, locale);
    }
    
    private static boolean d(final ResourceBundle resourceBundle, final String anObject) {
        final Enumeration<String> keys = resourceBundle.getKeys();
        while (keys.hasMoreElements()) {
            if (keys.nextElement().equals(anObject)) {
                return true;
            }
        }
        return false;
    }
    
    public static q e() {
        return h(Locale.ENGLISH);
    }
    
    private static String[] f(final ResourceBundle resourceBundle) {
        return new String[] { resourceBundle.getString("PeriodFormat.space"), resourceBundle.getString("PeriodFormat.comma"), resourceBundle.getString("PeriodFormat.commandand"), resourceBundle.getString("PeriodFormat.commaspaceand") };
    }
    
    public static q g() {
        return h(Locale.getDefault());
    }
    
    public static q h(final Locale locale) {
        final ConcurrentMap<Locale, q> b = p.b;
        q q;
        if ((q = b.get(locale)) == null) {
            final a a = new a(c(locale));
            q = new q(a, a, locale, null);
            final q q2 = b.putIfAbsent(locale, q);
            if (q2 != null) {
                q = q2;
            }
        }
        return q;
    }
    
    static class a implements t, s
    {
        private final q a;
        
        a(final q a) {
            this.a = a;
        }
        
        private s f(final Locale locale) {
            q q;
            if (locale != null && !locale.equals(this.a.d())) {
                q = p.h(locale);
            }
            else {
                q = this.a;
            }
            return q.f();
        }
        
        private t g(final Locale locale) {
            q q;
            if (locale != null && !locale.equals(this.a.d())) {
                q = p.h(locale);
            }
            else {
                q = this.a;
            }
            return q.g();
        }
        
        @Override
        public void a(final Writer writer, final o0 o0, final Locale locale) throws IOException {
            this.g(locale).a(writer, o0, locale);
        }
        
        @Override
        public void b(final StringBuffer sb, final o0 o0, final Locale locale) {
            this.g(locale).b(sb, o0, locale);
        }
        
        @Override
        public int c(final o0 o0, final Locale locale) {
            return this.g(locale).c(o0, locale);
        }
        
        @Override
        public int d(final i0 i0, final String s, final int n, final Locale locale) {
            return this.f(locale).d(i0, s, n, locale);
        }
        
        @Override
        public int e(final o0 o0, final int n, final Locale locale) {
            return this.g(locale).e(o0, n, locale);
        }
    }
}
