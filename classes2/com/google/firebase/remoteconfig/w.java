// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.t;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.f;
import java.util.concurrent.Executor;
import com.google.android.gms.tasks.p;
import java.util.HashMap;
import java.util.concurrent.Executors;
import com.google.android.gms.common.util.k;
import androidx.annotation.k0;
import com.google.firebase.abt.d;
import com.google.firebase.installations.j;
import com.google.firebase.e;
import java.util.concurrent.ExecutorService;
import android.content.Context;
import java.util.Map;
import java.util.Random;
import com.google.android.gms.common.util.g;
import androidx.annotation.b1;
import f2.a;

@a
public class w
{
    public static final String j = "activate";
    public static final String k = "fetch";
    public static final String l = "defaults";
    public static final long m = 60L;
    private static final String n = "frc";
    private static final String o = "settings";
    @b1
    public static final String p = "firebase";
    private static final g q;
    private static final Random r;
    @androidx.annotation.w("this")
    private final Map<String, l> a;
    private final Context b;
    private final ExecutorService c;
    private final e d;
    private final j e;
    private final d f;
    @k0
    private final com.google.firebase.analytics.connector.a g;
    private final String h;
    @androidx.annotation.w("this")
    private Map<String, String> i;
    
    static {
        q = com.google.android.gms.common.util.k.e();
        r = new Random();
    }
    
    w(final Context context, final e e, final j j, final d d, @k0 final com.google.firebase.analytics.connector.a a) {
        this(context, Executors.newCachedThreadPool(), e, j, d, a, true);
    }
    
    @b1
    protected w(final Context b, final ExecutorService c, final e d, final j e, final d f, @k0 final com.google.firebase.analytics.connector.a g, final boolean b2) {
        this.a = new HashMap<String, l>();
        this.i = new HashMap<String, String>();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = d.r().j();
        if (b2) {
            com.google.android.gms.tasks.p.d((Executor)c, u.a(this));
        }
    }
    
    private f c(String format, final String s) {
        format = String.format("%s_%s_%s_%s.json", "frc", this.h, format, s);
        return com.google.firebase.remoteconfig.internal.f.h(Executors.newCachedThreadPool(), com.google.firebase.remoteconfig.internal.p.d(this.b, format));
    }
    
    private n g(final f f, final f f2) {
        return new n(this.c, f, f2);
    }
    
    @b1
    static o h(final Context context, final String s, final String s2) {
        return new o(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", s, s2, "settings"), 0));
    }
    
    @k0
    private static t i(final e e, final String s, @k0 final com.google.firebase.analytics.connector.a a) {
        if (k(e) && s.equals("firebase") && a != null) {
            return new t(a);
        }
        return null;
    }
    
    private static boolean j(final e e, final String s) {
        return s.equals("firebase") && k(e);
    }
    
    private static boolean k(final e e) {
        return e.q().equals("[DEFAULT]");
    }
    
    @b1
    l a(final e e, final String s, final j j, d d, final Executor executor, final f f, final f f2, final f f3, final com.google.firebase.remoteconfig.internal.l l, final n n, final o o) {
        synchronized (this) {
            if (!this.a.containsKey(s)) {
                final Context b = this.b;
                if (!j(e, s)) {
                    d = null;
                }
                final l i = new l(b, e, j, d, executor, f, f2, f3, l, n, o);
                i.F();
                this.a.put(s, i);
            }
            return this.a.get(s);
        }
    }
    
    @b1
    @a
    public l b(final String s) {
        synchronized (this) {
            final f c = this.c(s, "fetch");
            final f c2 = this.c(s, "activate");
            final f c3 = this.c(s, "defaults");
            final o h = h(this.b, this.h, s);
            final n g = this.g(c2, c3);
            final t i = i(this.d, s, this.g);
            if (i != null) {
                g.a((com.google.android.gms.common.util.d<String, com.google.firebase.remoteconfig.internal.g>)v.b(i));
            }
            return this.a(this.d, s, this.e, this.f, this.c, c, c2, c3, this.e(s, c, h), g, h);
        }
    }
    
    l d() {
        return this.b("firebase");
    }
    
    @b1
    com.google.firebase.remoteconfig.internal.l e(final String s, final f f, final o o) {
        synchronized (this) {
            final j e = this.e;
            com.google.firebase.analytics.connector.a g;
            if (k(this.d)) {
                g = this.g;
            }
            else {
                g = null;
            }
            return new com.google.firebase.remoteconfig.internal.l(e, g, this.c, w.q, w.r, f, this.f(this.d.r().i(), s, o), o, this.i);
        }
    }
    
    @b1
    ConfigFetchHttpClient f(final String s, final String s2, final o o) {
        return new ConfigFetchHttpClient(this.b, this.d.r().j(), s, s2, o.c(), o.c());
    }
    
    @b1
    public void l(final Map<String, String> i) {
        synchronized (this) {
            this.i = i;
        }
    }
}
