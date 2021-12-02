// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.o;
import org.joda.time.g;
import java.text.DateFormatSymbols;
import java.util.Comparator;
import org.joda.time.h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.TreeMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;

class t
{
    private static ConcurrentMap<Locale, t> p;
    private final String[] a;
    private final String[] b;
    private final String[] c;
    private final String[] d;
    private final String[] e;
    private final String[] f;
    private final TreeMap<String, Integer> g;
    private final TreeMap<String, Integer> h;
    private final TreeMap<String, Integer> i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    
    static {
        t.p = new ConcurrentHashMap<Locale, t>();
    }
    
    private t(final Locale locale) {
        final DateFormatSymbols f = org.joda.time.h.f(locale);
        this.a = f.getEras();
        this.b = u(f.getWeekdays());
        this.c = u(f.getShortWeekdays());
        this.d = v(f.getMonths());
        this.e = v(f.getShortMonths());
        this.f = f.getAmPmStrings();
        final Integer[] array = new Integer[13];
        for (int i = 0; i < 13; ++i) {
            array[i] = i;
        }
        final Comparator<String> case_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        final TreeMap g = new TreeMap<String, Integer>((Comparator<? super Object>)case_INSENSITIVE_ORDER);
        b(this.g = (TreeMap<String, Integer>)g, this.a, array);
        if ("en".equals(locale.getLanguage())) {
            g.put("BCE", array[0]);
            g.put("CE", array[1]);
        }
        final TreeMap h = new TreeMap<String, Integer>((Comparator<? super Object>)case_INSENSITIVE_ORDER);
        b(this.h = (TreeMap<String, Integer>)h, this.b, array);
        b((TreeMap<String, Integer>)h, this.c, array);
        a((TreeMap<String, Integer>)h, 1, 7, array);
        final TreeMap j = new TreeMap<String, Integer>((Comparator<? super Object>)case_INSENSITIVE_ORDER);
        b(this.i = (TreeMap<String, Integer>)j, this.d, array);
        b((TreeMap<String, Integer>)j, this.e, array);
        a((TreeMap<String, Integer>)j, 1, 12, array);
        this.j = q(this.a);
        this.k = q(this.b);
        this.l = q(this.c);
        this.m = q(this.d);
        this.n = q(this.e);
        this.o = q(this.f);
    }
    
    private static void a(final TreeMap<String, Integer> treeMap, int i, final int n, final Integer[] array) {
        while (i <= n) {
            treeMap.put(String.valueOf(i).intern(), array[i]);
            ++i;
        }
    }
    
    private static void b(final TreeMap<String, Integer> treeMap, final String[] array, final Integer[] array2) {
        int length = array.length;
        while (true) {
            final int n = length - 1;
            if (n < 0) {
                break;
            }
            final String key = array[n];
            length = n;
            if (key == null) {
                continue;
            }
            treeMap.put(key, array2[n]);
            length = n;
        }
    }
    
    static t h(final Locale locale) {
        Locale default1 = locale;
        if (locale == null) {
            default1 = Locale.getDefault();
        }
        t t;
        if ((t = org.joda.time.chrono.t.p.get(default1)) == null) {
            t = new t(default1);
            final t t2 = org.joda.time.chrono.t.p.putIfAbsent(default1, t);
            if (t2 != null) {
                t = t2;
            }
        }
        return t;
    }
    
    private static int q(final String[] array) {
        int length = array.length;
        int n = 0;
        while (true) {
            final int n2 = length - 1;
            if (n2 < 0) {
                break;
            }
            final String s = array[n2];
            length = n2;
            if (s == null) {
                continue;
            }
            final int length2 = s.length();
            length = n2;
            if (length2 <= n) {
                continue;
            }
            n = length2;
            length = n2;
        }
        return n;
    }
    
    private static String[] u(final String[] array) {
        final String[] array2 = new String[8];
        for (int i = 1; i < 8; ++i) {
            int n;
            if (i < 7) {
                n = i + 1;
            }
            else {
                n = 1;
            }
            array2[i] = array[n];
        }
        return array2;
    }
    
    private static String[] v(final String[] array) {
        final String[] array2 = new String[13];
        for (int i = 1; i < 13; ++i) {
            array2[i] = array[i - 1];
        }
        return array2;
    }
    
    public int c(final String key) {
        final Integer n = this.h.get(key);
        if (n != null) {
            return n;
        }
        throw new o(org.joda.time.g.C(), key);
    }
    
    public String d(final int n) {
        return this.c[n];
    }
    
    public String e(final int n) {
        return this.b[n];
    }
    
    public int f(final String key) {
        final Integer n = this.g.get(key);
        if (n != null) {
            return n;
        }
        throw new o(org.joda.time.g.E(), key);
    }
    
    public String g(final int n) {
        return this.a[n];
    }
    
    public int i() {
        return this.l;
    }
    
    public int j() {
        return this.k;
    }
    
    public int k() {
        return this.j;
    }
    
    public int l() {
        return this.o;
    }
    
    public int m() {
        return this.n;
    }
    
    public int n() {
        return this.m;
    }
    
    public int o(final String anotherString) {
        final String[] f = this.f;
        int length = f.length;
        int n;
        do {
            n = length - 1;
            if (n < 0) {
                throw new o(org.joda.time.g.J(), anotherString);
            }
            length = n;
        } while (!f[n].equalsIgnoreCase(anotherString));
        return n;
    }
    
    public String p(final int n) {
        return this.f[n];
    }
    
    public int r(final String key) {
        final Integer n = this.i.get(key);
        if (n != null) {
            return n;
        }
        throw new o(org.joda.time.g.R(), key);
    }
    
    public String s(final int n) {
        return this.e[n];
    }
    
    public String t(final int n) {
        return this.d[n];
    }
}
