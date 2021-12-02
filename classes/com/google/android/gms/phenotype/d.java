// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.phenotype;

import android.net.Uri;
import androidx.core.content.i;
import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.util.Log;
import android.os.UserManager;
import com.google.android.gms.internal.phenotype.f;
import android.os.Binder;
import android.os.Build$VERSION;
import com.google.android.gms.internal.phenotype.h;
import android.annotation.SuppressLint;
import android.content.Context;
import f2.a;

@Deprecated
@f2.a
public abstract class d<T>
{
    private static final Object f;
    @SuppressLint({ "StaticFieldLeak" })
    private static Context g;
    private static boolean h = false;
    private static Boolean i;
    private final a a;
    final String b;
    private final String c;
    private final T d;
    private T e;
    
    static {
        f = new Object();
    }
    
    private d(final a a, String value, final T d) {
        this.e = null;
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
    
    @f2.a
    public static void b(Context g) {
        com.google.android.gms.internal.phenotype.h.b(g);
        if (d.g == null) {
            com.google.android.gms.internal.phenotype.h.a(g);
            synchronized (d.f) {
                if (Build$VERSION.SDK_INT < 24 || !g.isDeviceProtectedStorage()) {
                    final Context applicationContext = g.getApplicationContext();
                    if (applicationContext != null) {
                        g = applicationContext;
                    }
                }
                if (d.g != g) {
                    d.i = null;
                }
                d.g = g;
                // monitorexit(d.f)
                d.h = false;
            }
        }
    }
    
    private static d<String> c(final a a, final String s, final String s2) {
        return new x(a, s, s2);
    }
    
    private static <V> V e(b<V> b) {
        long clearCallingIdentity;
        try {
            b = b.g();
            return (V)b;
        }
        catch (SecurityException ex) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            final Object o = b;
            final b<Object> b2 = b = ((b<b<Object>>)o).g();
        }
        try {
            final Object o = b;
            b = ((b<b<Object>>)o).g();
            return (V)b;
        }
        finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
    
    static boolean g(final String s, final boolean b) {
        return l() && e((b<Boolean>)new v(s, false));
    }
    
    @c6.h
    @TargetApi(24)
    private final T j() {
        if (!g("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            if (this.a.b != null) {
                final String s = e((b<String>)new t(this, com.google.android.gms.phenotype.f.a(com.google.android.gms.phenotype.d.g.getContentResolver(), this.a.b)));
                if (s != null) {
                    return this.f(s);
                }
            }
            else if (this.a.a != null) {
                if (Build$VERSION.SDK_INT >= 24 && !com.google.android.gms.phenotype.d.g.isDeviceProtectedStorage() && !((UserManager)com.google.android.gms.phenotype.d.g.getSystemService((Class)UserManager.class)).isUserUnlocked()) {
                    return null;
                }
                final SharedPreferences sharedPreferences = com.google.android.gms.phenotype.d.g.getSharedPreferences(this.a.a, 0);
                if (sharedPreferences.contains(this.b)) {
                    return this.d(sharedPreferences);
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
    
    @c6.h
    private final T k() {
        if (!this.a.e && l()) {
            final String s = e((b<String>)new u(this));
            if (s != null) {
                return this.f(s);
            }
        }
        return null;
    }
    
    private static boolean l() {
        if (d.i == null) {
            final Context g = d.g;
            boolean b = false;
            if (g == null) {
                return false;
            }
            if (androidx.core.content.i.a(g, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                b = true;
            }
            d.i = b;
        }
        return d.i;
    }
    
    @f2.a
    public T a() {
        if (com.google.android.gms.phenotype.d.g != null) {
            if (this.a.f) {
                final T k = this.k();
                if (k != null) {
                    return k;
                }
                final T j = this.j();
                if (j != null) {
                    return j;
                }
            }
            else {
                final T i = this.j();
                if (i != null) {
                    return i;
                }
                final T l = this.k();
                if (l != null) {
                    return l;
                }
            }
            return this.d;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }
    
    public abstract T d(final SharedPreferences p0);
    
    public abstract T f(final String p0);
    
    @f2.a
    public static class a
    {
        private final String a;
        private final Uri b;
        private final String c;
        private final String d;
        private final boolean e;
        private final boolean f;
        
        @f2.a
        public a(final Uri uri) {
            this(null, uri, "", "", false, false);
        }
        
        private a(final String a, final Uri b, final String c, final String d, final boolean e, final boolean f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @f2.a
        public d<String> a(final String s, final String s2) {
            return c(this, s, s2);
        }
        
        @f2.a
        public a b(final String s) {
            final boolean e = this.e;
            if (!e) {
                return new a(this.a, this.b, s, this.d, e, this.f);
            }
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        
        @f2.a
        public a c(final String s) {
            return new a(this.a, this.b, this.c, s, this.e, this.f);
        }
    }
    
    interface b<V>
    {
        V g();
    }
}
