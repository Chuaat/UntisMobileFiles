// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.util.Log;
import android.database.ContentObserver;
import android.os.Handler;
import java.util.TreeMap;
import android.database.Cursor;
import java.util.Map;
import android.content.ContentResolver;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import android.net.Uri;

public class a7
{
    private static final Uri a;
    private static final Uri b;
    public static final Pattern c;
    public static final Pattern d;
    private static final AtomicBoolean e;
    private static HashMap<String, String> f;
    private static final HashMap<String, Boolean> g;
    private static final HashMap<String, Integer> h;
    private static final HashMap<String, Long> i;
    private static final HashMap<String, Float> j;
    private static Object k;
    private static boolean l;
    private static String[] m;
    
    static {
        a = Uri.parse("content://com.google.android.gsf.gservices");
        b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        e = new AtomicBoolean();
        g = new HashMap<String, Boolean>();
        h = new HashMap<String, Integer>();
        i = new HashMap<String, Long>();
        j = new HashMap<String, Float>();
        a7.m = new String[0];
    }
    
    public static long a(final ContentResolver contentResolver, final String s, long n) {
        final Object i = i(contentResolver);
        final HashMap<String, Long> j = a7.i;
        n = 0L;
        final Long n2 = b(j, s, 0L);
        if (n2 != null) {
            return n2;
        }
        final String c = c(contentResolver, s, null);
        while (true) {
            if (c == null) {
                final Long value = n2;
                break Label_0071;
            }
            try {
                final long long1 = Long.parseLong(c);
                final Long value = long1;
                n = long1;
                g(i, a7.i, s, value);
                return n;
            }
            catch (NumberFormatException ex) {
                final Long value = n2;
                continue;
            }
            break;
        }
    }
    
    private static <T> T b(final HashMap<String, T> hashMap, final String s, T t) {
        synchronized (a7.class) {
            if (hashMap.containsKey(s)) {
                final T value = hashMap.get(s);
                if (value != null) {
                    t = value;
                }
                return t;
            }
            return null;
        }
    }
    
    public static String c(final ContentResolver contentResolver, String s, final String s2) {
        synchronized (a7.class) {
            e(contentResolver);
            final Object k = a7.k;
            final boolean containsKey = a7.f.containsKey(s);
            final String s3 = null;
            final String s4 = null;
            final String s5 = null;
            if (containsKey) {
                s = a7.f.get(s);
                String s6 = s5;
                if (s != null) {
                    s6 = s;
                }
                return s6;
            }
            final String[] m = a7.m;
            for (int length = m.length, i = 0; i < length; ++i) {
                if (s.startsWith(m[i])) {
                    if (!a7.l || a7.f.isEmpty()) {
                        a7.f.putAll(d(contentResolver, a7.m));
                        a7.l = true;
                        if (a7.f.containsKey(s)) {
                            s = a7.f.get(s);
                            String s7 = s3;
                            if (s != null) {
                                s7 = s;
                            }
                            return s7;
                        }
                    }
                    return null;
                }
            }
            // monitorexit(a7.class)
            final Cursor query = contentResolver.query(a7.a, (String[])null, (String)null, new String[] { s }, (String)null);
            Label_0266: {
                if (query == null) {
                    break Label_0266;
                }
                try {
                    if (!query.moveToFirst()) {
                        f(k, s, null);
                        return null;
                    }
                    final String string = query.getString(1);
                    String s8;
                    if ((s8 = string) != null) {
                        s8 = string;
                        if (string.equals(null)) {
                            s8 = null;
                        }
                    }
                    f(k, s, s8);
                    s = s4;
                    if (s8 != null) {
                        s = s8;
                    }
                    query.close();
                    return s;
                }
                finally {
                    if (query != null) {
                        query.close();
                    }
                }
            }
        }
    }
    
    private static Map<String, String> d(ContentResolver query, final String... array) {
        query = (ContentResolver)query.query(a7.b, (String[])null, (String)null, array, (String)null);
        final TreeMap<String, String> treeMap = new TreeMap<String, String>();
        if (query == null) {
            return treeMap;
        }
        try {
            while (((Cursor)query).moveToNext()) {
                treeMap.put(((Cursor)query).getString(0), ((Cursor)query).getString(1));
            }
            return treeMap;
        }
        finally {
            ((Cursor)query).close();
        }
    }
    
    private static void e(final ContentResolver contentResolver) {
        if (a7.f == null) {
            a7.e.set(false);
            a7.f = new HashMap<String, String>();
            a7.k = new Object();
            a7.l = false;
            contentResolver.registerContentObserver(a7.a, true, (ContentObserver)new b7(null));
            return;
        }
        if (a7.e.getAndSet(false)) {
            a7.f.clear();
            a7.g.clear();
            a7.h.clear();
            a7.i.clear();
            a7.j.clear();
            a7.k = new Object();
            a7.l = false;
        }
    }
    
    private static void f(final Object o, final String key, final String value) {
        synchronized (a7.class) {
            if (o == a7.k) {
                a7.f.put(key, value);
            }
        }
    }
    
    private static <T> void g(final Object o, final HashMap<String, T> hashMap, final String s, final T value) {
        synchronized (a7.class) {
            if (o == a7.k) {
                hashMap.put(s, value);
                a7.f.remove(s);
            }
        }
    }
    
    public static boolean h(final ContentResolver contentResolver, final String str, final boolean b) {
        final Object i = i(contentResolver);
        final HashMap<String, Boolean> g = a7.g;
        final Boolean b2 = b(g, str, b);
        if (b2 != null) {
            return b2;
        }
        final String c = c(contentResolver, str, null);
        Boolean b3 = b2;
        boolean b4 = b;
        if (c != null) {
            if (c.equals("")) {
                b3 = b2;
                b4 = b;
            }
            else if (a7.c.matcher(c).matches()) {
                b4 = true;
                b3 = Boolean.TRUE;
            }
            else if (a7.d.matcher(c).matches()) {
                b4 = false;
                b3 = Boolean.FALSE;
            }
            else {
                final StringBuilder sb = new StringBuilder("attempt to read gservices key ");
                sb.append(str);
                sb.append(" (value \"");
                sb.append(c);
                sb.append("\") as boolean");
                Log.w("Gservices", sb.toString());
                b4 = b;
                b3 = b2;
            }
        }
        g(i, g, str, b3);
        return b4;
    }
    
    private static Object i(final ContentResolver contentResolver) {
        synchronized (a7.class) {
            e(contentResolver);
            return a7.k;
        }
    }
}
