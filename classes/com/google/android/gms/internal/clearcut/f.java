// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.annotation.TargetApi;
import c6.h;
import android.util.Log;
import android.os.UserManager;
import android.os.Binder;
import android.os.Build$VERSION;
import android.content.SharedPreferences;
import android.annotation.SuppressLint;
import android.content.Context;

public abstract class f<T>
{
    private static final Object h;
    @SuppressLint({ "StaticFieldLeak" })
    private static Context i;
    private static boolean j = false;
    private static volatile Boolean k;
    private static volatile Boolean l;
    private final p a;
    final String b;
    private final String c;
    private final T d;
    private T e;
    private volatile c f;
    private volatile SharedPreferences g;
    
    static {
        h = new Object();
    }
    
    private f(final p a, String value, final T d) {
        this.e = null;
        this.f = null;
        this.g = null;
        if (a.a == null && a.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (a.a != null && a.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.a = a;
        final String value2 = String.valueOf(a.c);
        final String value3 = String.valueOf(value);
        String concat;
        if (value3.length() != 0) {
            concat = value2.concat(value3);
        }
        else {
            concat = new String(value2);
        }
        this.c = concat;
        final String value4 = String.valueOf(a.d);
        value = String.valueOf(value);
        String concat2;
        if (value.length() != 0) {
            concat2 = value4.concat(value);
        }
        else {
            concat2 = new String(value4);
        }
        this.b = concat2;
        this.d = d;
    }
    
    public static void b(Context i) {
        if (f.i == null) {
            synchronized (f.h) {
                if (Build$VERSION.SDK_INT < 24 || !i.isDeviceProtectedStorage()) {
                    final Context applicationContext = i.getApplicationContext();
                    if (applicationContext != null) {
                        i = applicationContext;
                    }
                }
                if (f.i != i) {
                    f.k = null;
                }
                f.i = i;
                // monitorexit(f.h)
                f.j = false;
            }
        }
    }
    
    private static <T> f<T> c(final p p4, final String s, final T t, final o<T> o) {
        return (f<T>)new m(p4, s, t, o);
    }
    
    private static f<String> d(final p p3, final String s, final String s2) {
        return new l(p3, s, s2);
    }
    
    private static f<Boolean> e(final p p3, final String s, final boolean b) {
        return new k(p3, s, b);
    }
    
    private static <V> V g(n<V> n) {
        long clearCallingIdentity;
        try {
            n = n.j();
            return (V)n;
        }
        catch (SecurityException ex) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            final Object o = n;
            final n<Object> n2 = n = ((n<n<Object>>)o).j();
        }
        try {
            final Object o = n;
            n = ((n<n<Object>>)o).j();
            return (V)n;
        }
        finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
    
    static boolean h(final String s, final boolean b) {
        return p() && g((n<Boolean>)new i(s, false));
    }
    
    @h
    @TargetApi(24)
    private final T n() {
        if (!h("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            if (this.a.b != null) {
                if (this.f == null) {
                    this.f = com.google.android.gms.internal.clearcut.c.a(com.google.android.gms.internal.clearcut.f.i.getContentResolver(), this.a.b);
                }
                final String s = g((n<String>)new g(this, this.f));
                if (s != null) {
                    return this.m(s);
                }
            }
            else if (this.a.a != null) {
                boolean booleanValue;
                if (Build$VERSION.SDK_INT >= 24 && !com.google.android.gms.internal.clearcut.f.i.isDeviceProtectedStorage()) {
                    if (com.google.android.gms.internal.clearcut.f.l == null || !com.google.android.gms.internal.clearcut.f.l) {
                        com.google.android.gms.internal.clearcut.f.l = ((UserManager)com.google.android.gms.internal.clearcut.f.i.getSystemService((Class)UserManager.class)).isUserUnlocked();
                    }
                    booleanValue = com.google.android.gms.internal.clearcut.f.l;
                }
                else {
                    booleanValue = true;
                }
                if (!booleanValue) {
                    return null;
                }
                if (this.g == null) {
                    this.g = com.google.android.gms.internal.clearcut.f.i.getSharedPreferences(this.a.a, 0);
                }
                final SharedPreferences g = this.g;
                if (g.contains(this.b)) {
                    return this.f(g);
                }
            }
        }
        else {
            final String value = String.valueOf(this.b);
            String concat;
            if (value.length() != 0) {
                concat = "Bypass reading Phenotype values for flag: ".concat(value);
            }
            else {
                concat = new String("Bypass reading Phenotype values for flag: ");
            }
            Log.w("PhenotypeFlag", concat);
        }
        return null;
    }
    
    @h
    private final T o() {
        if (!this.a.e && p()) {
            final String s = g((n<String>)new com.google.android.gms.internal.clearcut.h(this));
            if (s != null) {
                return this.m(s);
            }
        }
        return null;
    }
    
    private static boolean p() {
        if (f.k == null) {
            final Context i = f.i;
            boolean b = false;
            if (i == null) {
                return false;
            }
            if (androidx.core.content.i.a(i, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                b = true;
            }
            f.k = b;
        }
        return f.k;
    }
    
    public final T a() {
        if (com.google.android.gms.internal.clearcut.f.i != null) {
            if (this.a.f) {
                final T o = this.o();
                if (o != null) {
                    return o;
                }
                final T n = this.n();
                if (n != null) {
                    return n;
                }
            }
            else {
                final T n2 = this.n();
                if (n2 != null) {
                    return n2;
                }
                final T o2 = this.o();
                if (o2 != null) {
                    return o2;
                }
            }
            return this.d;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }
    
    protected abstract T f(final SharedPreferences p0);
    
    protected abstract T m(final String p0);
}
