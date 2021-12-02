// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import android.app.Application;
import org.joda.time.base.a;
import org.joda.time.base.d;
import com.untis.mobile.UntisMobileApplication;
import org.jetbrains.annotations.f;
import kotlin.text.s;
import android.text.format.DateFormat;
import android.content.Context;
import org.joda.time.c;
import org.joda.time.n0;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import org.joda.time.t;
import n6.l;
import org.jetbrains.annotations.e;
import org.joda.time.r;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0006\u001a-\u0010\u0016\u001a\u00020\u0014*\u00020\t2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010\u001a\n\u0010\u0017\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u001b\u001a\u00020\u001a*\u00020\u0006\u001a\n\u0010\u001c\u001a\u00020\u001a*\u00020\u0003\u001a\f\u0010\u001d\u001a\u0004\u0018\u00010\u0003*\u00020\u0001\u001a\f\u0010\u001e\u001a\u0004\u0018\u00010\u0006*\u00020\u0001\u001a\f\u0010\u001f\u001a\u0004\u0018\u00010\u0000*\u00020\u0001\u001a\u0012\u0010!\u001a\u00020\u001a*\u00020\u00032\u0006\u0010 \u001a\u00020\u0003\u001a\u0012\u0010\"\u001a\u00020\u001a*\u00020\u00032\u0006\u0010 \u001a\u00020\u0003\u001a\n\u0010$\u001a\u00020#*\u00020\u0006\u001a\"\u0010(\u001a\u00020\u0006*\u00020\u00062\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#\u001a\u001a\u0010+\u001a\u00020\u0006*\u00020\u00062\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#\u001a\n\u0010-\u001a\u00020\u001a*\u00020,¨\u0006." }, d2 = { "Lorg/joda/time/v;", "", "x", "Lorg/joda/time/t;", "w", "u", "Lorg/joda/time/c;", "v", "t", "Lorg/joda/time/r;", "n", "s", "k", "q", "l", "o", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "date", "Lkotlin/j2;", "onEachDay", "a", "r", "m", "p", "", "f", "g", "y", "j", "z", "other", "e", "d", "", "b", "year", "datePickerMonth", "dayOfMonth", "h", "hour", "minute", "i", "Landroid/content/Context;", "c", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class d0
{
    public static final void a(@e final r r, @e final l<? super t, j2> l) {
        k0.p(r, "<this>");
        k0.p(l, "onEachDay");
        final t h1 = ((d)r).b().h1();
        for (t l2 = ((d)r).s().h1().l0(1), l3 = h1; ((org.joda.time.base.e)l3).o((n0)l2); l3 = l3.l0(1)) {
            l.invoke(new t((Object)l3));
        }
    }
    
    public static final int b(@e final c c) {
        k0.p(c, "<this>");
        return ((a)c).f3() - 1;
    }
    
    public static final boolean c(@e final Context context) {
        k0.p(context, "<this>");
        return DateFormat.is24HourFormat(context);
    }
    
    public static final boolean d(@e final t t, @e final t t2) {
        k0.p(t, "<this>");
        k0.p(t2, "other");
        return ((org.joda.time.base.e)t).m((n0)t2) || ((org.joda.time.base.e)t).p((n0)t2);
    }
    
    public static final boolean e(@e final t t, @e final t t2) {
        k0.p(t, "<this>");
        k0.p(t2, "other");
        return ((org.joda.time.base.e)t).o((n0)t2) || ((org.joda.time.base.e)t).p((n0)t2);
    }
    
    public static final boolean f(@e final c c) {
        k0.p(c, "<this>");
        final t h1 = c.h1();
        k0.o(h1, "toLocalDate()");
        return g(h1);
    }
    
    public static final boolean g(@e final t t) {
        k0.p(t, "<this>");
        return ((org.joda.time.base.e)t).p((n0)v.a.g());
    }
    
    @e
    public static final c h(@e c w1, final int n, final int n2, final int n3) {
        k0.p(w1, "<this>");
        w1 = w1.w1(new t(n, n2 + 1, n3));
        k0.o(w1, "withDate(LocalDate(year, datePickerMonth + 1, dayOfMonth))");
        return w1;
    }
    
    @e
    public static final c i(@e c z1, final int n, final int n2) {
        k0.p(z1, "<this>");
        z1 = z1.Z1(new org.joda.time.v(n, n2));
        k0.o(z1, "withTime(LocalTime(hour, minute))");
        return z1;
    }
    
    @f
    public static final c j(@e final String s) {
        k0.p(s, "<this>");
        c k0;
        try {
            k0 = c.K0(s.k2(s, "Z", "", false, 4, (Object)null));
        }
        catch (Exception ex) {
            k0 = null;
        }
        return k0;
    }
    
    @e
    public static final String k(@e final r r) {
        k0.p(r, "<this>");
        final int x3 = ((a)((d)r).b()).X3();
        final int x4 = ((a)((d)r).s()).X3();
        boolean b = true;
        final boolean b2 = x3 == x4;
        final boolean b3 = ((a)((d)r).b()).f3() == ((a)((d)r).s()).f3();
        if (((a)((d)r).b()).k2() != ((a)((d)r).s()).k2()) {
            b = false;
        }
        StringBuilder sb = null;
        String s = null;
        String obj = null;
        Label_0114: {
            c c;
            if (!b) {
                sb = new StringBuilder();
                c = ((d)r).b();
                s = "H:mm E dd. MMM yyyy";
            }
            else {
                s = "H:mm E dd. MMM";
                if (b3) {
                    c c2;
                    String s2;
                    if (!b2) {
                        sb = new StringBuilder();
                        c2 = ((d)r).b();
                        s2 = "H:mm E dd.";
                    }
                    else {
                        sb = new StringBuilder();
                        c2 = ((d)r).b();
                        s2 = "H:mm";
                    }
                    obj = ((a)c2).g4(s2);
                    break Label_0114;
                }
                sb = new StringBuilder();
                c = ((d)r).b();
            }
            obj = ((a)c).g4(s);
        }
        sb.append((Object)obj);
        sb.append(" - ");
        sb.append((Object)((a)((d)r).s()).g4(s));
        return sb.toString();
    }
    
    @e
    public static final String l(@e final c c) {
        k0.p(c, "<this>");
        final String g4 = ((a)c).g4("E dd. MMM");
        k0.o(g4, "toString(\"E dd. MMM\")");
        return g4;
    }
    
    @e
    public static final String m(@e final t t) {
        k0.p(t, "<this>");
        final String g4 = t.g4("E dd. MMM");
        k0.o(g4, "toString(\"E dd. MMM\")");
        return g4;
    }
    
    @e
    public static final String n(@e final r r) {
        k0.p(r, "<this>");
        final int x3 = ((a)((d)r).b()).X3();
        final int x4 = ((a)((d)r).s()).X3();
        boolean b = true;
        final boolean b2 = x3 == x4;
        final boolean b3 = ((a)((d)r).b()).f3() == ((a)((d)r).s()).f3();
        if (((a)((d)r).b()).k2() != ((a)((d)r).s()).k2()) {
            b = false;
        }
        final String g4 = ((a)((d)r).s()).g4("dd. MMM");
        if (b2 && b3 && b) {
            k0.o(g4, "endDateString");
            return g4;
        }
        String g5;
        StringBuilder sb2;
        if (b3 && b) {
            final StringBuilder sb = new StringBuilder();
            g5 = ((a)((d)r).b()).g4("dd.");
            sb2 = sb;
        }
        else {
            if (!b) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append((Object)((a)((d)r).b()).g4("dd. MMM yy"));
                sb3.append(" - ");
                sb3.append((Object)((a)((d)r).s()).g4("dd. MMM yy"));
                sb2 = sb3;
                return sb2.toString();
            }
            final StringBuilder sb3 = new StringBuilder();
            final String g6 = ((a)((d)r).b()).g4("dd. MMM");
            sb2 = sb3;
            g5 = g6;
        }
        sb2.append((Object)g5);
        sb2.append(" - ");
        sb2.append((Object)g4);
        return sb2.toString();
    }
    
    @e
    public static final String o(@e final c c) {
        k0.p(c, "<this>");
        final String g4 = ((a)c).g4("HH:mm E dd. MMM");
        k0.o(g4, "toString(\"HH:mm E dd. MMM\")");
        return g4;
    }
    
    @e
    public static final String p(@e final t t) {
        k0.p(t, "<this>");
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        if (b == null) {
            return "";
        }
        final v a = v.a;
        String s;
        String s2;
        if (((org.joda.time.base.e)t).p((n0)a.g())) {
            s = ((Application)b).getString(2131886789);
            s2 = "context.getString(R.string.shared_today_text)";
        }
        else if (((org.joda.time.base.e)t).p((n0)a.h())) {
            s = ((Application)b).getString(2131886790);
            s2 = "context.getString(R.string.shared_tomorrow_text)";
        }
        else {
            if (!((org.joda.time.base.e)t).p((n0)a.i())) {
                return "";
            }
            s = ((Application)b).getString(2131886797);
            s2 = "context.getString(R.string.shared_yesterday_text)";
        }
        k0.o(s, s2);
        return s;
    }
    
    @e
    public static final String q(@e final c c) {
        k0.p(c, "<this>");
        final String g4 = ((a)c).g4("HH:mm");
        k0.o(g4, "toString(\"HH:mm\")");
        return g4;
    }
    
    @e
    public static final String r(@e final org.joda.time.v v) {
        k0.p(v, "<this>");
        final String g4 = v.g4("HH:mm");
        k0.o(g4, "toString(\"HH:mm\")");
        return g4;
    }
    
    @e
    public static final String s(@e final r r) {
        k0.p(r, "<this>");
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)((a)((d)r).b()).g4("H:mm"));
        sb.append(" - ");
        sb.append((Object)((a)((d)r).s()).g4("H:mm"));
        return sb.toString();
    }
    
    @e
    public static final String t(@e final c c) {
        k0.p(c, "<this>");
        final String g4 = ((a)c).g4("yyyy-MM-dd'T'HH:mm:00");
        k0.o(g4, "toString(\"yyyy-MM-dd'T'HH:mm:00\")");
        return g4;
    }
    
    @e
    public static final String u(@e final t t) {
        k0.p(t, "<this>");
        final String g4 = t.g4("yyyy-MM-dd'T'12:00:00");
        k0.o(g4, "toString(\"yyyy-MM-dd'T'12:00:00\")");
        return g4;
    }
    
    @e
    public static final String v(@e final c c) {
        k0.p(c, "<this>");
        final String g4 = ((a)c).g4("yyyy-MM-dd'T'HH:mm'Z'");
        k0.o(g4, "toString(\"yyyy-MM-dd'T'HH:mm'Z'\")");
        return g4;
    }
    
    @e
    public static final String w(@e final t t) {
        k0.p(t, "<this>");
        final String g4 = t.g4("yyyy-MM-dd'T'12:00'Z'");
        k0.o(g4, "toString(\"yyyy-MM-dd'T'12:00'Z'\")");
        return g4;
    }
    
    @e
    public static final String x(@e final org.joda.time.v v) {
        k0.p(v, "<this>");
        final String g4 = v.g4("'T'HH:mm'Z'");
        k0.o(g4, "toString(\"'T'HH:mm'Z'\")");
        return g4;
    }
    
    @f
    public static final t y(@e final String s) {
        k0.p(s, "<this>");
        t c0;
        try {
            c0 = t.c0(s.k2(s, "Z", "", false, 4, (Object)null));
        }
        catch (Exception ex) {
            c0 = null;
        }
        return c0;
    }
    
    @f
    public static final org.joda.time.v z(@e final String s) {
        k0.p(s, "<this>");
        org.joda.time.v c0;
        try {
            c0 = org.joda.time.v.c0(s.k2(s, "Z", "", false, 4, (Object)null));
        }
        catch (Exception ex) {
            c0 = null;
        }
        return c0;
    }
}
