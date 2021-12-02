// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.content.res.Resources$NotFoundException;
import java.util.Arrays;
import java.util.List;
import com.google.android.gms.common.util.d0;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.common.wrappers.c;
import android.os.Bundle;
import androidx.annotation.u0;
import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import android.content.pm.ApplicationInfo;
import androidx.annotation.c1;
import java.lang.reflect.InvocationTargetException;
import com.google.android.gms.common.internal.x;

public final class g extends t5
{
    private Boolean b;
    private f c;
    private Boolean d;
    
    g(final z4 z4) {
        super(z4);
        this.c = e.a;
    }
    
    public static final long G() {
        return a3.e.a(null);
    }
    
    public static final long f() {
        return a3.E.a(null);
    }
    
    private final String g(String s, final String s2) {
        l3 l3;
        try {
            s = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, s, "");
            x.k(s);
            return s;
        }
        catch (InvocationTargetException ex) {
            l3 = super.a.c().o();
            s = "SystemProperties.get() threw an exception";
        }
        catch (IllegalAccessException ex) {
            l3 = super.a.c().o();
            s = "Could not access SystemProperties.get()";
        }
        catch (NoSuchMethodException ex) {
            l3 = super.a.c().o();
            s = "Could not find SystemProperties.get() method";
        }
        catch (ClassNotFoundException ex) {
            l3 = super.a.c().o();
            s = "Could not find SystemProperties class";
        }
        final InvocationTargetException ex;
        l3.b(s, ex);
        return "";
    }
    
    public final boolean A() {
        final Boolean q = this.q("google_analytics_automatic_screen_reporting_enabled");
        return q == null || q;
    }
    
    public final boolean B() {
        super.a.L();
        final Boolean q = this.q("firebase_analytics_collection_deactivated");
        return q != null && q;
    }
    
    public final boolean C(final String s) {
        return "1".equals(this.c.a(s, "measurement.event_sampling_enabled"));
    }
    
    @c1
    final boolean D() {
        if (this.b == null && (this.b = this.q("app_measurement_lite")) == null) {
            this.b = Boolean.FALSE;
        }
        return this.b || !super.a.p();
    }
    
    @EnsuresNonNull({ "this.isMainProcess" })
    public final boolean E() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    final ApplicationInfo applicationInfo = super.a.X().getApplicationInfo();
                    final String a = com.google.android.gms.common.util.x.a();
                    if (applicationInfo != null) {
                        final String processName = applicationInfo.processName;
                        boolean b = false;
                        if (processName != null) {
                            b = b;
                            if (processName.equals(a)) {
                                b = true;
                            }
                        }
                        this.d = b;
                    }
                    if (this.d == null) {
                        this.d = Boolean.TRUE;
                        super.a.c().o().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.d;
    }
    
    @c1
    public final double h(String a, final z2<Double> z2) {
        if (a != null) {
            a = this.c.a(a, z2.b());
            if (!TextUtils.isEmpty((CharSequence)a)) {
                try {
                    return z2.a(Double.parseDouble(a));
                }
                catch (NumberFormatException ex) {}
            }
        }
        return z2.a(null);
    }
    
    final int i(@u0(min = 1L) final String s) {
        return this.m(s, a3.I, 500, 2000);
    }
    
    public final int j() {
        final ga m = super.a.M();
        final Boolean h = m.a.J().H();
        if (m.o0() < 201500 && (h == null || h)) {
            return 25;
        }
        return 100;
    }
    
    public final int k(@u0(min = 1L) final String s) {
        return this.m(s, a3.J, 25, 100);
    }
    
    @c1
    public final int l(String a, final z2<Integer> z2) {
        if (a != null) {
            a = this.c.a(a, z2.b());
            if (!TextUtils.isEmpty((CharSequence)a)) {
                try {
                    return z2.a(Integer.parseInt(a));
                }
                catch (NumberFormatException ex) {}
            }
        }
        return z2.a(null);
    }
    
    @c1
    public final int m(final String s, final z2<Integer> z2, final int b, final int b2) {
        return Math.max(Math.min(this.l(s, z2), b2), b);
    }
    
    public final long n() {
        super.a.L();
        return 42097L;
    }
    
    @c1
    public final long o(String a, final z2<Long> z2) {
        if (a != null) {
            a = this.c.a(a, z2.b());
            if (!TextUtils.isEmpty((CharSequence)a)) {
                try {
                    return z2.a(Long.parseLong(a));
                }
                catch (NumberFormatException ex) {}
            }
        }
        return z2.a(null);
    }
    
    @d0
    final Bundle p() {
        try {
            if (super.a.X().getPackageManager() == null) {
                super.a.c().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            final ApplicationInfo c = com.google.android.gms.common.wrappers.c.a(super.a.X()).c(super.a.X().getPackageName(), 128);
            if (c == null) {
                super.a.c().o().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c.metaData;
        }
        catch (PackageManager$NameNotFoundException ex) {
            super.a.c().o().b("Failed to load metadata: Package name not found", ex);
            return null;
        }
    }
    
    @d0
    final Boolean q(@u0(min = 1L) final String s) {
        x.g(s);
        final Bundle p = this.p();
        if (p == null) {
            super.a.c().o().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!p.containsKey(s)) {
            return null;
        }
        return p.getBoolean(s);
    }
    
    public final String r() {
        return this.g("debug.firebase.analytics.app", "");
    }
    
    public final String s() {
        return this.g("debug.deferred.deeplink", "");
    }
    
    final String t() {
        super.a.L();
        return "FA";
    }
    
    @c1
    public final String u(String a, final z2<String> z2) {
        if (a == null) {
            a = null;
        }
        else {
            a = this.c.a(a, z2.b());
        }
        return z2.a(a);
    }
    
    @d0
    final List<String> v(@u0(min = 1L) final String s) {
        x.g("analytics.safelisted_events");
        final Bundle p = this.p();
        Integer value = null;
        Label_0061: {
            if (p == null) {
                super.a.c().o().a("Failed to load metadata: Metadata bundle is null");
            }
            else if (p.containsKey("analytics.safelisted_events")) {
                value = p.getInt("analytics.safelisted_events");
                break Label_0061;
            }
            value = null;
        }
        if (value != null) {
            try {
                final String[] stringArray = super.a.X().getResources().getStringArray((int)value);
                if (stringArray == null) {
                    return null;
                }
                return Arrays.asList(stringArray);
            }
            catch (Resources$NotFoundException ex) {
                super.a.c().o().b("Failed to load string array from metadata: resource not found", ex);
            }
        }
        return null;
    }
    
    final void w(final f c) {
        this.c = c;
    }
    
    public final boolean x() {
        final Boolean q = this.q("google_analytics_adid_collection_enabled");
        return q == null || q;
    }
    
    @c1
    public final boolean y(String a, final z2<Boolean> z2) {
        if (a != null) {
            a = this.c.a(a, z2.b());
            if (!TextUtils.isEmpty((CharSequence)a)) {
                return z2.a(Boolean.parseBoolean(a));
            }
        }
        return z2.a(null);
    }
    
    public final boolean z(final String s) {
        return "1".equals(this.c.a(s, "gaia_collection_enabled"));
    }
}
