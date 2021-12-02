// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.Objects;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import c6.h;

public abstract class c7<T>
{
    private static final Object g;
    @h
    private static volatile a7 h;
    private static volatile boolean i = false;
    private static final AtomicReference<Collection<c7<?>>> j;
    private static final e7 k;
    private static final AtomicInteger l;
    final z6 a;
    final String b;
    private final T c;
    private volatile int d = -1;
    private volatile T e;
    private final boolean f;
    
    static {
        g = new Object();
        j = new AtomicReference<Collection<c7<?>>>();
        k = new e7(t6.a, null);
        l = new AtomicInteger();
    }
    
    @Deprecated
    public static void d(Context context) {
        synchronized (c7.g) {
            final a7 h = c7.h;
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (h == null || h.a() != context) {
                i6.e();
                d7.c();
                p6.e();
                c7.h = new e6(context, o7.a((k7<h7<q6>>)new u6(context)));
                c7.l.incrementAndGet();
            }
        }
    }
    
    static void e() {
        c7.l.incrementAndGet();
    }
    
    abstract T a(final Object p0);
    
    public final T b() {
        if (!this.f) {
            Objects.requireNonNull(this.b, "flagName must not be null");
        }
        final int value = c7.l.get();
        if (this.d < value) {
            synchronized (this) {
                if (this.d < value) {
                    final a7 h = c7.h;
                    if (h == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    final boolean f = this.a.f;
                    final String c = p6.b(h.a()).c("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
                    T e = null;
                    Label_0271: {
                        if (c != null && c6.c.matcher(c).matches()) {
                            if (Log.isLoggable("PhenotypeFlag", 3)) {
                                final String value2 = String.valueOf(this.c());
                                String concat;
                                if (value2.length() != 0) {
                                    concat = "Bypass reading Phenotype values for flag: ".concat(value2);
                                }
                                else {
                                    concat = new String("Bypass reading Phenotype values for flag: ");
                                }
                                Log.d("PhenotypeFlag", concat);
                            }
                        }
                        else {
                            m6 m6;
                            if (this.a.b != null) {
                                if (r6.a(h.a(), this.a.b)) {
                                    final boolean h2 = this.a.h;
                                    m6 = i6.b(h.a().getContentResolver(), this.a.b);
                                }
                                else {
                                    m6 = null;
                                }
                            }
                            else {
                                final Context a = h.a();
                                final String a2 = this.a.a;
                                m6 = d7.b(a, null);
                            }
                            if (m6 != null) {
                                final Object a3 = m6.a(this.c());
                                if (a3 != null) {
                                    e = this.a(a3);
                                    break Label_0271;
                                }
                            }
                        }
                        e = null;
                    }
                    if (e == null) {
                        T a4 = null;
                        Label_0348: {
                            if (!this.a.e) {
                                final p6 b = p6.b(h.a());
                                String b2;
                                if (this.a.e) {
                                    b2 = null;
                                }
                                else {
                                    b2 = this.b;
                                }
                                final String c2 = b.c(b2);
                                if (c2 != null) {
                                    a4 = this.a(c2);
                                    break Label_0348;
                                }
                            }
                            a4 = null;
                        }
                        e = a4;
                        if (a4 == null) {
                            e = this.c;
                        }
                    }
                    final h7<q6> h3 = h.b().zza();
                    if (h3.b()) {
                        final q6 q6 = h3.a();
                        final z6 a5 = this.a;
                        final String a6 = q6.a(a5.b, null, a5.d, this.b);
                        if (a6 == null) {
                            e = this.c;
                        }
                        else {
                            e = this.a(a6);
                        }
                    }
                    this.e = e;
                    this.d = value;
                }
            }
        }
        return this.e;
    }
    
    public final String c() {
        final String d = this.a.d;
        return this.b;
    }
}
