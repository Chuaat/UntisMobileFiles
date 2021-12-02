// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.database.Cursor;
import android.database.ContentObserver;
import android.os.Handler;
import android.content.ContentResolver;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import android.net.Uri;

public final class c6
{
    public static final Uri a;
    public static final Uri b;
    public static final Pattern c;
    public static final Pattern d;
    private static final AtomicBoolean e;
    static HashMap<String, String> f;
    static final HashMap<String, Boolean> g;
    static final HashMap<String, Integer> h;
    static final HashMap<String, Long> i;
    static final HashMap<String, Float> j;
    private static Object k;
    private static boolean l;
    static final String[] m;
    
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
        m = new String[0];
    }
    
    public static String a(final ContentResolver contentResolver, final String s, final String s2) {
        synchronized (c6.class) {
            final HashMap<String, String> f = c6.f;
            final String s3 = null;
            final String s4 = null;
            if (f == null) {
                c6.e.set(false);
                c6.f = new HashMap<String, String>();
                c6.k = new Object();
                c6.l = false;
                contentResolver.registerContentObserver(c6.a, true, (ContentObserver)new b6(null));
            }
            else if (c6.e.getAndSet(false)) {
                c6.f.clear();
                c6.g.clear();
                c6.h.clear();
                c6.i.clear();
                c6.j.clear();
                c6.k = new Object();
                c6.l = false;
            }
            final Object k = c6.k;
            if (c6.f.containsKey(s)) {
                String s5 = c6.f.get(s);
                if (s5 == null) {
                    s5 = s4;
                }
                return s5;
            }
            final int length = c6.m.length;
            // monitorexit(c6.class)
            final Cursor query = contentResolver.query(c6.a, (String[])null, (String)null, new String[] { s }, (String)null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    c(k, s, null);
                    return null;
                }
                final String string = query.getString(1);
                String s6;
                if ((s6 = string) != null) {
                    s6 = string;
                    if (string.equals(null)) {
                        s6 = null;
                    }
                }
                c(k, s, s6);
                if (s6 == null) {
                    s6 = s3;
                }
                return s6;
            }
            finally {
                query.close();
            }
        }
    }
    
    private static void c(final Object o, final String key, final String value) {
        synchronized (c6.class) {
            if (o == c6.k) {
                c6.f.put(key, value);
            }
        }
    }
}
