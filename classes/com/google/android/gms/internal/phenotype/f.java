// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.phenotype;

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

public class f
{
    private static final Uri a;
    private static final Uri b;
    private static final Pattern c;
    private static final Pattern d;
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
        com.google.android.gms.internal.phenotype.f.m = new String[0];
    }
    
    private static <T> T a(final HashMap<String, T> hashMap, final String s, T t) {
        synchronized (f.class) {
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
    
    public static String b(final ContentResolver contentResolver, String s, final String s2) {
        synchronized (f.class) {
            d(contentResolver);
            final Object k = com.google.android.gms.internal.phenotype.f.k;
            final boolean containsKey = com.google.android.gms.internal.phenotype.f.f.containsKey(s);
            final String s3 = null;
            final String s4 = null;
            final String s5 = null;
            if (containsKey) {
                s = com.google.android.gms.internal.phenotype.f.f.get(s);
                String s6 = s5;
                if (s != null) {
                    s6 = s;
                }
                return s6;
            }
            final String[] m = com.google.android.gms.internal.phenotype.f.m;
            for (int length = m.length, i = 0; i < length; ++i) {
                if (s.startsWith(m[i])) {
                    if (!com.google.android.gms.internal.phenotype.f.l || com.google.android.gms.internal.phenotype.f.f.isEmpty()) {
                        com.google.android.gms.internal.phenotype.f.f.putAll(c(contentResolver, com.google.android.gms.internal.phenotype.f.m));
                        com.google.android.gms.internal.phenotype.f.l = true;
                        if (com.google.android.gms.internal.phenotype.f.f.containsKey(s)) {
                            s = com.google.android.gms.internal.phenotype.f.f.get(s);
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
            // monitorexit(f.class)
            final Cursor query = contentResolver.query(com.google.android.gms.internal.phenotype.f.a, (String[])null, (String)null, new String[] { s }, (String)null);
            Label_0266: {
                if (query == null) {
                    break Label_0266;
                }
                try {
                    if (!query.moveToFirst()) {
                        e(k, s, null);
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
                    e(k, s, s8);
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
    
    private static Map<String, String> c(ContentResolver query, final String... array) {
        query = (ContentResolver)query.query(com.google.android.gms.internal.phenotype.f.b, (String[])null, (String)null, array, (String)null);
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
    
    private static void d(final ContentResolver contentResolver) {
        if (com.google.android.gms.internal.phenotype.f.f == null) {
            com.google.android.gms.internal.phenotype.f.e.set(false);
            com.google.android.gms.internal.phenotype.f.f = new HashMap<String, String>();
            com.google.android.gms.internal.phenotype.f.k = new Object();
            com.google.android.gms.internal.phenotype.f.l = false;
            contentResolver.registerContentObserver(com.google.android.gms.internal.phenotype.f.a, true, (ContentObserver)new g(null));
            return;
        }
        if (com.google.android.gms.internal.phenotype.f.e.getAndSet(false)) {
            com.google.android.gms.internal.phenotype.f.f.clear();
            com.google.android.gms.internal.phenotype.f.g.clear();
            com.google.android.gms.internal.phenotype.f.h.clear();
            com.google.android.gms.internal.phenotype.f.i.clear();
            com.google.android.gms.internal.phenotype.f.j.clear();
            com.google.android.gms.internal.phenotype.f.k = new Object();
            com.google.android.gms.internal.phenotype.f.l = false;
        }
    }
    
    private static void e(final Object o, final String key, final String value) {
        synchronized (f.class) {
            if (o == com.google.android.gms.internal.phenotype.f.k) {
                com.google.android.gms.internal.phenotype.f.f.put(key, value);
            }
        }
    }
    
    public static boolean f(final ContentResolver contentResolver, final String key, final boolean b) {
        final Object g = g(contentResolver);
        final HashMap<String, Boolean> g2 = com.google.android.gms.internal.phenotype.f.g;
        final Boolean b2 = a(g2, key, b);
        if (b2 != null) {
            return b2;
        }
        final String b3 = b(contentResolver, key, null);
        Boolean value = b2;
        boolean b4 = b;
        if (b3 != null) {
            if (b3.equals("")) {
                value = b2;
                b4 = b;
            }
            else if (com.google.android.gms.internal.phenotype.f.c.matcher(b3).matches()) {
                b4 = true;
                value = Boolean.TRUE;
            }
            else if (com.google.android.gms.internal.phenotype.f.d.matcher(b3).matches()) {
                b4 = false;
                value = Boolean.FALSE;
            }
            else {
                final StringBuilder sb = new StringBuilder("attempt to read gservices key ");
                sb.append(key);
                sb.append(" (value \"");
                sb.append(b3);
                sb.append("\") as boolean");
                Log.w("Gservices", sb.toString());
                b4 = b;
                value = b2;
            }
        }
        synchronized (f.class) {
            if (g == com.google.android.gms.internal.phenotype.f.k) {
                g2.put(key, value);
                com.google.android.gms.internal.phenotype.f.f.remove(key);
            }
            return b4;
        }
    }
    
    private static Object g(final ContentResolver contentResolver) {
        synchronized (f.class) {
            d(contentResolver);
            return com.google.android.gms.internal.phenotype.f.k;
        }
    }
}
