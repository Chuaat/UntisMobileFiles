// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.ContentResolver;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import c6.h;

public abstract class k0<T>
{
    private static final Object g;
    @h
    private static volatile t0 h;
    private static volatile boolean i = false;
    private static final AtomicReference<Collection<k0<?>>> j;
    private static u0 k;
    private static final AtomicInteger l;
    private final q0 a;
    private final String b;
    private final T c;
    private volatile int d;
    private volatile T e;
    private final boolean f;
    
    static {
        g = new Object();
        j = new AtomicReference<Collection<k0<?>>>();
        k0.k = new u0(m0.a);
        l = new AtomicInteger();
    }
    
    private k0(final q0 a, final String b, final T c, final boolean f) {
        this.d = -1;
        final String a2 = a.a;
        if (a2 == null && a.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (a2 != null && a.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
    }
    
    @h
    private final T b(final t0 t0) {
        final boolean g = this.a.g;
        int n = 0;
        if (!g) {
            final String input = (String)f0.b(t0.a()).a("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
            final boolean b = input != null && r.c.matcher(input).matches();
            n = n;
            if (b) {
                n = 1;
            }
        }
        if (n == 0) {
            z z;
            if (this.a.b != null) {
                if (i0.b(t0.a(), this.a.b)) {
                    if (this.a.h) {
                        final ContentResolver contentResolver = t0.a().getContentResolver();
                        final String lastPathSegment = this.a.b.getLastPathSegment();
                        final String packageName = t0.a().getPackageName();
                        final StringBuilder sb = new StringBuilder(String.valueOf(lastPathSegment).length() + 1 + String.valueOf(packageName).length());
                        sb.append(lastPathSegment);
                        sb.append("#");
                        sb.append(packageName);
                        z = v.b(contentResolver, l0.a(sb.toString()));
                    }
                    else {
                        z = v.b(t0.a().getContentResolver(), this.a.b);
                    }
                }
                else {
                    z = null;
                }
            }
            else {
                z = s0.b(t0.a(), this.a.a);
            }
            if (z != null) {
                final Object a = z.a(this.i());
                if (a != null) {
                    return this.c(a);
                }
            }
        }
        else if (Log.isLoggable("PhenotypeFlag", 3)) {
            final String value = String.valueOf(this.i());
            String concat;
            if (value.length() != 0) {
                concat = "Bypass reading Phenotype values for flag: ".concat(value);
            }
            else {
                concat = new String("Bypass reading Phenotype values for flag: ");
            }
            Log.d("PhenotypeFlag", concat);
        }
        return null;
    }
    
    private final String d(String value) {
        if (value != null && value.isEmpty()) {
            return this.b;
        }
        value = String.valueOf(value);
        final String value2 = String.valueOf(this.b);
        if (value2.length() != 0) {
            return value.concat(value2);
        }
        return new String(value);
    }
    
    static void e() {
        k0.l.incrementAndGet();
    }
    
    @Deprecated
    public static void f(Context context) {
        synchronized (k0.g) {
            final t0 h = k0.h;
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (h == null || h.a() != context) {
                v.d();
                s0.c();
                f0.c();
                k0.h = new w(context, o1.a((l1<d1<g0>>)new n0(context)));
                k0.l.incrementAndGet();
            }
        }
    }
    
    private static <T> k0<T> g(final q0 q0, final String s, final T t, final r0<T> r0, final boolean b) {
        return (k0<T>)new o0(q0, s, t, true, r0);
    }
    
    @h
    private final T h(final t0 t0) {
        final q0 a = this.a;
        if (!a.e) {
            final b1<Context, Boolean> i = a.i;
            if (i == null || i.a(t0.a())) {
                final f0 b = f0.b(t0.a());
                final q0 a2 = this.a;
                String d;
                if (a2.e) {
                    d = null;
                }
                else {
                    d = this.d(a2.c);
                }
                final Object a3 = b.a(d);
                if (a3 != null) {
                    return this.c(a3);
                }
            }
        }
        return null;
    }
    
    public static void j(final Context context) {
        if (k0.h != null) {
            return;
        }
        synchronized (k0.g) {
            if (k0.h == null) {
                f(context);
            }
        }
    }
    
    abstract T c(final Object p0);
    
    public final String i() {
        return this.d(this.a.d);
    }
    
    public final T l() {
        if (!this.f) {
            k1.h(k0.k.a(this.b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        final int value = k0.l.get();
        if (this.d < value) {
            synchronized (this) {
                if (this.d < value) {
                    final t0 h = k0.h;
                    k1.h(h != null, "Must call PhenotypeFlag.init() first");
                    T e = null;
                    Label_0146: {
                        if (this.a.f) {
                            e = this.h(h);
                            if (e != null) {
                                break Label_0146;
                            }
                            e = this.b(h);
                            if (e != null) {
                                break Label_0146;
                            }
                        }
                        else {
                            e = this.b(h);
                            if (e != null) {
                                break Label_0146;
                            }
                            e = this.h(h);
                            if (e != null) {
                                break Label_0146;
                            }
                        }
                        e = this.c;
                    }
                    final d1<g0> d1 = h.b().zza();
                    if (d1.b()) {
                        final g0 g0 = d1.c();
                        final q0 a = this.a;
                        final String a2 = g0.a(a.b, a.a, a.d, this.b);
                        if (a2 == null) {
                            e = this.c;
                        }
                        else {
                            e = this.c(a2);
                        }
                    }
                    this.e = e;
                    this.d = value;
                }
            }
        }
        return this.e;
    }
}
