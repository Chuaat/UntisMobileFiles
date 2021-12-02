// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig.internal;

import androidx.annotation.k0;
import com.google.firebase.remoteconfig.p;
import androidx.annotation.c1;
import android.content.SharedPreferences;
import java.util.Date;
import androidx.annotation.b1;

public class o
{
    @b1
    public static final long d = -1L;
    static final Date e;
    @b1
    static final int f = 0;
    private static final long g = -1L;
    @b1
    static final Date h;
    private static final String i = "fetch_timeout_in_seconds";
    private static final String j = "minimum_fetch_interval_in_seconds";
    private static final String k = "last_fetch_status";
    private static final String l = "last_fetch_time_in_millis";
    private static final String m = "last_fetch_etag";
    private static final String n = "backoff_end_time_in_millis";
    private static final String o = "num_failed_fetches";
    private final SharedPreferences a;
    private final Object b;
    private final Object c;
    
    static {
        e = new Date(-1L);
        h = new Date(-1L);
    }
    
    public o(final SharedPreferences a) {
        this.a = a;
        this.b = new Object();
        this.c = new Object();
    }
    
    @c1
    public void a() {
        synchronized (this.b) {
            this.a.edit().clear().commit();
        }
    }
    
    a b() {
        synchronized (this.c) {
            return new a(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1L)));
        }
    }
    
    public long c() {
        return this.a.getLong("fetch_timeout_in_seconds", 60L);
    }
    
    public p d() {
        synchronized (this.b) {
            return r.d().c(this.a.getInt("last_fetch_status", 0)).d(this.a.getLong("last_fetch_time_in_millis", -1L)).b(new com.google.firebase.remoteconfig.r.b().f(this.a.getLong("fetch_timeout_in_seconds", 60L)).g(this.a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.l.j)).c()).a();
        }
    }
    
    @k0
    String e() {
        return this.a.getString("last_fetch_etag", (String)null);
    }
    
    int f() {
        return this.a.getInt("last_fetch_status", 0);
    }
    
    Date g() {
        return new Date(this.a.getLong("last_fetch_time_in_millis", -1L));
    }
    
    public long h() {
        return this.a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.l.j);
    }
    
    void i() {
        this.j(0, com.google.firebase.remoteconfig.internal.o.h);
    }
    
    void j(final int n, final Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", n).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
    
    @c1
    public void k(final com.google.firebase.remoteconfig.r r) {
        synchronized (this.b) {
            this.a.edit().putLong("fetch_timeout_in_seconds", r.a()).putLong("minimum_fetch_interval_in_seconds", r.b()).commit();
        }
    }
    
    public void l(final com.google.firebase.remoteconfig.r r) {
        synchronized (this.b) {
            this.a.edit().putLong("fetch_timeout_in_seconds", r.a()).putLong("minimum_fetch_interval_in_seconds", r.b()).apply();
        }
    }
    
    void m(final String s) {
        synchronized (this.b) {
            this.a.edit().putString("last_fetch_etag", s).apply();
        }
    }
    
    void n() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
        }
    }
    
    void o(final Date date) {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }
    
    void p() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
    
    static class a
    {
        private int a;
        private Date b;
        
        a(final int a, final Date b) {
            this.a = a;
            this.b = b;
        }
        
        Date a() {
            return this.b;
        }
        
        int b() {
            return this.a;
        }
    }
}
