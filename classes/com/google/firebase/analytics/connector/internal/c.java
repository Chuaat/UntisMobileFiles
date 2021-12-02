// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.internal.l7;
import java.util.Iterator;
import com.google.android.gms.measurement.internal.x5;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.measurement.internal.w5;
import android.os.Bundle;
import com.google.firebase.analytics.connector.a;
import com.google.android.gms.common.util.b;
import com.google.android.gms.measurement.internal.z5;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public final class c
{
    private static final Set<String> a;
    private static final List<String> b;
    private static final List<String> c;
    private static final List<String> d;
    private static final List<String> e;
    private static final List<String> f;
    
    static {
        a = new HashSet<String>(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
        b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
        c = Arrays.asList("auto", "app", "am");
        d = Arrays.asList("_r", "_dbg");
        e = Arrays.asList((String[])com.google.android.gms.common.util.b.b((T[][])new String[][] { z5.a, z5.b }));
        f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
    
    public static Bundle a(final a.c c) {
        final Bundle bundle = new Bundle();
        final String a = c.a;
        if (a != null) {
            bundle.putString("origin", a);
        }
        final String b = c.b;
        if (b != null) {
            bundle.putString("name", b);
        }
        final Object c2 = c.c;
        if (c2 != null) {
            w5.b(bundle, c2);
        }
        final String d = c.d;
        if (d != null) {
            bundle.putString("trigger_event_name", d);
        }
        bundle.putLong("trigger_timeout", c.e);
        final String f = c.f;
        if (f != null) {
            bundle.putString("timed_out_event_name", f);
        }
        final Bundle g = c.g;
        if (g != null) {
            bundle.putBundle("timed_out_event_params", g);
        }
        final String h = c.h;
        if (h != null) {
            bundle.putString("triggered_event_name", h);
        }
        final Bundle i = c.i;
        if (i != null) {
            bundle.putBundle("triggered_event_params", i);
        }
        bundle.putLong("time_to_live", c.j);
        final String k = c.k;
        if (k != null) {
            bundle.putString("expired_event_name", k);
        }
        final Bundle l = c.l;
        if (l != null) {
            bundle.putBundle("expired_event_params", l);
        }
        bundle.putLong("creation_timestamp", c.m);
        bundle.putBoolean("active", c.n);
        bundle.putLong("triggered_timestamp", c.o);
        return bundle;
    }
    
    public static a.c b(final Bundle bundle) {
        x.k(bundle);
        final a.c c = new a.c();
        c.a = x.k((String)w5.a(bundle, "origin", (Class<T>)String.class, (T)null));
        c.b = x.k((String)w5.a(bundle, "name", (Class<T>)String.class, (T)null));
        c.c = w5.a(bundle, "value", Object.class, null);
        c.d = w5.a(bundle, "trigger_event_name", String.class, null);
        final Long value = 0L;
        c.e = w5.a(bundle, "trigger_timeout", Long.class, value);
        c.f = w5.a(bundle, "timed_out_event_name", String.class, null);
        c.g = w5.a(bundle, "timed_out_event_params", Bundle.class, null);
        c.h = w5.a(bundle, "triggered_event_name", String.class, null);
        c.i = w5.a(bundle, "triggered_event_params", Bundle.class, null);
        c.j = w5.a(bundle, "time_to_live", Long.class, value);
        c.k = w5.a(bundle, "expired_event_name", String.class, null);
        c.l = w5.a(bundle, "expired_event_params", Bundle.class, null);
        c.n = w5.a(bundle, "active", Boolean.class, Boolean.FALSE);
        c.m = w5.a(bundle, "creation_timestamp", Long.class, value);
        c.o = w5.a(bundle, "triggered_timestamp", Long.class, value);
        return c;
    }
    
    public static String c(final String s) {
        final String a = x5.a(s);
        if (a != null) {
            return a;
        }
        return s;
    }
    
    public static String d(final String s) {
        final String b = x5.b(s);
        if (b != null) {
            return b;
        }
        return s;
    }
    
    public static void e(final String anObject, final String anObject2, final Bundle bundle) {
        if ("clx".equals(anObject) && "_ae".equals(anObject2)) {
            bundle.putLong("_r", 1L);
        }
    }
    
    public static boolean f(final String s) {
        if (s == null) {
            return false;
        }
        if (s.length() == 0) {
            return false;
        }
        final int codePoint = s.codePointAt(0);
        if (!Character.isLetter(codePoint) && codePoint != 95) {
            return false;
        }
        int codePoint2;
        for (int length = s.length(), i = Character.charCount(codePoint); i < length; i += Character.charCount(codePoint2)) {
            codePoint2 = s.codePointAt(i);
            if (codePoint2 != 95 && !Character.isLetterOrDigit(codePoint2)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean g(final String s) {
        if (s == null) {
            return false;
        }
        if (s.length() == 0) {
            return false;
        }
        final int codePoint = s.codePointAt(0);
        if (!Character.isLetter(codePoint)) {
            return false;
        }
        int codePoint2;
        for (int length = s.length(), i = Character.charCount(codePoint); i < length; i += Character.charCount(codePoint2)) {
            codePoint2 = s.codePointAt(i);
            if (codePoint2 != 95 && !Character.isLetterOrDigit(codePoint2)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean h(String s, final String anObject, final Bundle bundle) {
        if (!"_cmp".equals(anObject)) {
            return true;
        }
        if (!l(s)) {
            return false;
        }
        if (bundle == null) {
            return false;
        }
        final Iterator<String> iterator = com.google.firebase.analytics.connector.internal.c.d.iterator();
        while (iterator.hasNext()) {
            if (bundle.containsKey((String)iterator.next())) {
                return false;
            }
        }
        final int hashCode = s.hashCode();
        int n = 0;
        Label_0139: {
            if (hashCode != 101200) {
                if (hashCode != 101230) {
                    if (hashCode == 3142703) {
                        if (s.equals("fiam")) {
                            n = 2;
                            break Label_0139;
                        }
                    }
                }
                else if (s.equals("fdl")) {
                    n = 1;
                    break Label_0139;
                }
            }
            else if (s.equals("fcm")) {
                n = 0;
                break Label_0139;
            }
            n = -1;
        }
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    return false;
                }
                s = "fiam_integration";
            }
            else {
                s = "fdl_integration";
            }
        }
        else {
            s = "fcm_integration";
        }
        bundle.putString("_cis", s);
        return true;
    }
    
    public static boolean i(final a.c c) {
        if (c == null) {
            return false;
        }
        final String a = c.a;
        if (a == null || a.isEmpty()) {
            return false;
        }
        final Object c2 = c.c;
        if (c2 != null && l7.a(c2) == null) {
            return false;
        }
        if (!l(a)) {
            return false;
        }
        if (!m(a, c.b)) {
            return false;
        }
        final String k = c.k;
        if (k != null) {
            if (!j(k, c.l)) {
                return false;
            }
            if (!h(a, c.k, c.l)) {
                return false;
            }
        }
        final String h = c.h;
        if (h != null) {
            if (!j(h, c.i)) {
                return false;
            }
            if (!h(a, c.h, c.i)) {
                return false;
            }
        }
        final String f = c.f;
        if (f != null) {
            if (!j(f, c.g)) {
                return false;
            }
            if (!h(a, c.f, c.g)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean j(final String s, final Bundle bundle) {
        if (com.google.firebase.analytics.connector.internal.c.b.contains(s)) {
            return false;
        }
        if (bundle != null) {
            final Iterator<String> iterator = com.google.firebase.analytics.connector.internal.c.d.iterator();
            while (iterator.hasNext()) {
                if (bundle.containsKey((String)iterator.next())) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean k(final String s) {
        return !com.google.firebase.analytics.connector.internal.c.a.contains(s);
    }
    
    public static boolean l(final String s) {
        return !com.google.firebase.analytics.connector.internal.c.c.contains(s);
    }
    
    public static boolean m(final String s, final String anObject) {
        if ("_ce1".equals(anObject) || "_ce2".equals(anObject)) {
            return s.equals("fcm") || s.equals("frc");
        }
        if ("_ln".equals(anObject)) {
            return s.equals("fcm") || s.equals("fiam");
        }
        if (com.google.firebase.analytics.connector.internal.c.e.contains(anObject)) {
            return false;
        }
        final Iterator<String> iterator = com.google.firebase.analytics.connector.internal.c.f.iterator();
        while (iterator.hasNext()) {
            if (anObject.matches(iterator.next())) {
                return false;
            }
        }
        return true;
    }
}
