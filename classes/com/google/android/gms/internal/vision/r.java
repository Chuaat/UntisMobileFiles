// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.TreeMap;
import android.database.Cursor;
import java.util.Map;
import android.database.ContentObserver;
import android.os.Handler;
import android.content.ContentResolver;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import android.net.Uri;

public class r
{
    public static final Uri a;
    private static final Uri b;
    public static final Pattern c;
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
        r.m = new String[0];
    }
    
    public static String a(final ContentResolver contentResolver, String s, final String s2) {
        synchronized (r.class) {
            final HashMap<String, String> f = r.f;
            final String s3 = null;
            final String s4 = null;
            final String s5 = null;
            if (f == null) {
                r.e.set(false);
                r.f = new HashMap<String, String>();
                r.k = new Object();
                r.l = false;
                contentResolver.registerContentObserver(r.a, true, (ContentObserver)new u(null));
            }
            else if (r.e.getAndSet(false)) {
                r.f.clear();
                r.g.clear();
                r.h.clear();
                r.i.clear();
                r.j.clear();
                r.k = new Object();
                r.l = false;
            }
            final Object k = r.k;
            if (r.f.containsKey(s)) {
                s = r.f.get(s);
                String s6 = s5;
                if (s != null) {
                    s6 = s;
                }
                return s6;
            }
            final String[] m = r.m;
            for (int length = m.length, i = 0; i < length; ++i) {
                if (s.startsWith(m[i])) {
                    if (!r.l || r.f.isEmpty()) {
                        r.f.putAll(b(contentResolver, r.m));
                        r.l = true;
                        if (r.f.containsKey(s)) {
                            s = r.f.get(s);
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
            // monitorexit(r.class)
            final Cursor query = contentResolver.query(r.a, (String[])null, (String)null, new String[] { s }, (String)null);
            if (query == null) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    d(k, s, null);
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
                d(k, s, s8);
                s = s4;
                if (s8 != null) {
                    s = s8;
                }
                return s;
            }
            finally {
                query.close();
            }
        }
    }
    
    private static Map<String, String> b(ContentResolver query, final String... array) {
        query = (ContentResolver)query.query(r.b, (String[])null, (String)null, array, (String)null);
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
    
    private static void d(final Object o, final String key, final String value) {
        synchronized (r.class) {
            if (o == r.k) {
                r.f.put(key, value);
            }
        }
    }
}
