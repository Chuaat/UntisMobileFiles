// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.heartbeatinfo;

import java.util.Date;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.ArrayList;
import androidx.annotation.t0$a;
import androidx.annotation.t0;
import androidx.annotation.b1;
import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;

class l
{
    private static l c;
    private static final String d = "fire-global";
    private static final String e = "FirebaseAppHeartBeat";
    private static final String f = "fire-count";
    private static final int g = 200;
    private static final SimpleDateFormat h;
    private static final String i = "FirebaseAppHeartBeatStorage";
    private final SharedPreferences a;
    private final SharedPreferences b;
    
    static {
        h = new SimpleDateFormat("dd/MM/yyyy z");
    }
    
    private l(final Context context) {
        this.a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.b = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }
    
    @b1
    @t0({ t0$a.K })
    l(final SharedPreferences a, final SharedPreferences b) {
        this.a = a;
        this.b = b;
    }
    
    private void a() {
        synchronized (this) {
            long long1 = this.a.getLong("fire-count", 0L);
            final ArrayList<Long> list = (ArrayList<Long>)new ArrayList<Comparable>();
            final Iterator<Map.Entry<String, V>> iterator = this.b.getAll().entrySet().iterator();
            while (iterator.hasNext()) {
                list.add(Long.parseLong(iterator.next().getKey()));
            }
            Collections.sort((List<Comparable>)list);
            final Iterator<Long> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                this.b.edit().remove(String.valueOf(iterator2.next())).apply();
                final SharedPreferences$Editor edit = this.a.edit();
                final long n = long1 - 1L;
                edit.putLong("fire-count", n).apply();
                long1 = n;
                if (n <= 100L) {
                    return;
                }
            }
        }
    }
    
    static l d(final Context context) {
        synchronized (l.class) {
            if (l.c == null) {
                l.c = new l(context);
            }
            return l.c;
        }
    }
    
    static boolean g(final long date, final long date2) {
        final Date date3 = new Date(date);
        final Date date4 = new Date(date2);
        final SimpleDateFormat h = l.h;
        return h.format(date3).equals(h.format(date4)) ^ true;
    }
    
    void b() {
        synchronized (this) {
            this.b.edit().clear().apply();
            this.a.edit().remove("fire-count").apply();
        }
    }
    
    @b1
    @t0({ t0$a.K })
    int c() {
        return (int)this.a.getLong("fire-count", 0L);
    }
    
    long e() {
        synchronized (this) {
            return this.a.getLong("fire-global", -1L);
        }
    }
    
    List<n> f(final boolean b) {
        synchronized (this) {
            final ArrayList<n> list = (ArrayList<n>)new ArrayList<Comparable>();
            for (final Map.Entry<String, V> entry : this.b.getAll().entrySet()) {
                list.add(n.d((String)entry.getValue(), Long.parseLong(entry.getKey())));
            }
            Collections.sort((List<Comparable>)list);
            if (b) {
                this.b();
            }
            return list;
        }
    }
    
    boolean h(final long n) {
        synchronized (this) {
            return this.i("fire-global", n);
        }
    }
    
    boolean i(final String s, final long n) {
        synchronized (this) {
            if (!this.a.contains(s)) {
                this.a.edit().putLong(s, n).apply();
                return true;
            }
            if (g(this.a.getLong(s, -1L), n)) {
                this.a.edit().putLong(s, n).apply();
                return true;
            }
            return false;
        }
    }
    
    void j(final String s, long l) {
        synchronized (this) {
            final long long1 = this.a.getLong("fire-count", 0L);
            this.b.edit().putString(String.valueOf(l), s).apply();
            final SharedPreferences$Editor edit = this.a.edit();
            l = long1 + 1L;
            edit.putLong("fire-count", l).apply();
            if (l > 200L) {
                this.a();
            }
        }
    }
    
    void k(final long n) {
        synchronized (this) {
            this.a.edit().putLong("fire-global", n).apply();
        }
    }
}
