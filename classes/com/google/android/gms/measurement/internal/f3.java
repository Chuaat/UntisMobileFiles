// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.c1;
import android.content.pm.Signature;
import java.security.MessageDigest;
import com.google.android.gms.internal.measurement.uf;
import com.google.android.gms.common.wrappers.c;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import java.util.Iterator;
import android.content.res.Resources;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.a;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.fe;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import java.util.List;

public final class f3 extends f4
{
    private String c;
    private String d;
    private int e;
    private String f;
    private String g;
    private long h;
    private final long i;
    private List<String> j;
    private int k;
    private String l;
    private String m;
    private String n;
    
    f3(final z4 z4, final long i) {
        super(z4);
        this.i = i;
    }
    
    @EnsuresNonNull({ "appId", "appStore", "appName", "gmpAppId", "gaAppId" })
    @Override
    protected final void i() {
        final String packageName = super.a.X().getPackageName();
        final PackageManager packageManager = super.a.X().getPackageManager();
        String versionName = "Unknown";
        int e = Integer.MIN_VALUE;
        final String s = "";
        String installerPackageName = "unknown";
        String f = null;
        String string = null;
        Label_0279: {
            Label_0060: {
                if (packageManager != null) {
                    try {
                        installerPackageName = packageManager.getInstallerPackageName(packageName);
                    }
                    catch (IllegalArgumentException ex2) {
                        super.a.c().o().b("Error retrieving app installer package name. appId", n3.w(packageName));
                    }
                    if (installerPackageName == null) {
                        f = "manual_install";
                    }
                    else {
                        f = installerPackageName;
                        if ("com.android.vending".equals(installerPackageName)) {
                            f = "";
                        }
                    }
                    String s4;
                    try {
                        final PackageInfo packageInfo = packageManager.getPackageInfo(super.a.X().getPackageName(), 0);
                        installerPackageName = f;
                        if (packageInfo == null) {
                            break Label_0060;
                        }
                        final CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (!TextUtils.isEmpty(applicationLabel)) {
                            string = applicationLabel.toString();
                        }
                        else {
                            string = "Unknown";
                        }
                        try {
                            final String s2 = versionName = packageInfo.versionName;
                            final int versionCode = packageInfo.versionCode;
                            versionName = s2;
                            e = versionCode;
                        }
                        catch (PackageManager$NameNotFoundException ex3) {
                            final String s3 = versionName;
                            versionName = string;
                            s4 = s3;
                        }
                    }
                    catch (PackageManager$NameNotFoundException ex4) {
                        s4 = "Unknown";
                    }
                    super.a.c().o().c("Error retrieving package info. appId, appName", n3.w(packageName), versionName);
                    final String s5 = versionName;
                    versionName = s4;
                    string = s5;
                    break Label_0279;
                }
                super.a.c().o().b("PackageManager is null, app identity information might be inaccurate. appId", n3.w(packageName));
            }
            final String s6 = "Unknown";
            f = installerPackageName;
            string = s6;
        }
        this.c = packageName;
        this.f = f;
        this.d = versionName;
        this.e = e;
        this.g = string;
        this.h = 0L;
        final boolean b = !TextUtils.isEmpty((CharSequence)super.a.N()) && "am".equals(super.a.O());
        final int u = super.a.u();
        final n3 c = super.a.c();
        l3 l3 = null;
        String s7 = null;
        switch (u) {
            default: {
                l3 = c.r();
                s7 = "App measurement disabled due to denied storage consent";
                break;
            }
            case 7: {
                l3 = c.r();
                s7 = "App measurement disabled via the global data collection setting";
                break;
            }
            case 6: {
                l3 = c.u();
                s7 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
                break;
            }
            case 5: {
                l3 = c.s();
                s7 = "App measurement disabled via the init parameters";
                break;
            }
            case 4: {
                l3 = c.r();
                s7 = "App measurement disabled via the manifest";
                break;
            }
            case 3: {
                l3 = c.r();
                s7 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
                break;
            }
            case 2: {
                l3 = c.s();
                s7 = "App measurement deactivated via the init parameters";
                break;
            }
            case 1: {
                l3 = c.r();
                s7 = "App measurement deactivated via the manifest";
                break;
            }
            case 0: {
                l3 = c.s();
                s7 = "App measurement collection enabled";
                break;
            }
        }
        l3.a(s7);
        this.l = "";
        this.m = "";
        this.n = "";
        super.a.L();
        if (b) {
            this.m = super.a.N();
        }
        try {
            final String c2 = l7.c(super.a.X(), "google_app_id", super.a.Q());
            String i;
            if (!TextUtils.isEmpty((CharSequence)c2)) {
                i = c2;
            }
            else {
                i = "";
            }
            this.l = i;
            fe.b();
            Label_0844: {
                String m;
                if (super.a.w().y(null, a3.f0)) {
                    final Context x = super.a.X();
                    String s8 = super.a.Q();
                    com.google.android.gms.common.internal.x.k(x);
                    final Resources resources = x.getResources();
                    if (TextUtils.isEmpty((CharSequence)s8)) {
                        s8 = r4.a(x);
                    }
                    final String b2 = r4.b("ga_app_id", resources, s8);
                    String n = s;
                    if (!TextUtils.isEmpty((CharSequence)b2)) {
                        n = b2;
                    }
                    this.n = n;
                    if (TextUtils.isEmpty((CharSequence)c2) && TextUtils.isEmpty((CharSequence)b2)) {
                        break Label_0844;
                    }
                    m = r4.b("admob_app_id", resources, s8);
                }
                else {
                    if (TextUtils.isEmpty((CharSequence)c2)) {
                        break Label_0844;
                    }
                    final Context x2 = super.a.X();
                    String s9 = super.a.Q();
                    x.k(x2);
                    final Resources resources2 = x2.getResources();
                    if (TextUtils.isEmpty((CharSequence)s9)) {
                        s9 = r4.a(x2);
                    }
                    m = r4.b("admob_app_id", resources2, s9);
                }
                this.m = m;
            }
            if (u == 0) {
                final l3 s10 = super.a.c().s();
                final String c3 = this.c;
                String s11;
                if (TextUtils.isEmpty((CharSequence)this.l)) {
                    s11 = this.m;
                }
                else {
                    s11 = this.l;
                }
                s10.c("App measurement enabled for app package, google app id", c3, s11);
            }
        }
        catch (IllegalStateException ex) {
            super.a.c().o().c("Fetching Google App Id failed with exception. appId", n3.w(packageName), ex);
        }
        this.j = null;
        super.a.L();
        final List<String> v = super.a.w().v("analytics.safelisted_events");
        Label_1047: {
            if (v != null) {
                if (v.size() == 0) {
                    super.a.c().u().a("Safelisted event list is empty. Ignoring");
                    break Label_1047;
                }
                final Iterator<String> iterator = v.iterator();
                while (iterator.hasNext()) {
                    if (!super.a.M().O("safelisted event", iterator.next())) {
                        break Label_1047;
                    }
                }
            }
            this.j = v;
        }
        if (packageManager != null) {
            this.k = (com.google.android.gms.common.wrappers.a.a(super.a.X()) ? 1 : 0);
            return;
        }
        this.k = 0;
    }
    
    @Override
    protected final boolean k() {
        return true;
    }
    
    final int l() {
        this.f();
        return this.k;
    }
    
    final int m() {
        this.f();
        return this.e;
    }
    
    @c1
    final na n(final String s) {
        this.e();
        final String p = this.p();
        final String r = this.r();
        this.f();
        final String d = this.d;
        this.f();
        final long n = this.e;
        this.f();
        x.k(this.f);
        final String f = this.f;
        super.a.w().n();
        this.f();
        this.e();
        long h;
        if ((h = this.h) == 0L) {
            final ga m = super.a.M();
            final Context x = super.a.X();
            final String packageName = super.a.X().getPackageName();
            m.e();
            com.google.android.gms.common.internal.x.k(x);
            com.google.android.gms.common.internal.x.g(packageName);
            final PackageManager packageManager = x.getPackageManager();
            final MessageDigest p2 = ga.p("MD5");
            h = -1L;
            Label_0178: {
                if (p2 == null) {
                    m.a.c().o().a("Could not get MD5 instance");
                }
                else {
                    if (packageManager != null) {
                        try {
                            if (m.T(x, packageName)) {
                                h = 0L;
                                break Label_0178;
                            }
                            final Signature[] signatures = com.google.android.gms.common.wrappers.c.a(x).e(m.a.X().getPackageName(), 64).signatures;
                            if (signatures != null && signatures.length > 0) {
                                h = ga.q0(p2.digest(signatures[0].toByteArray()));
                                break Label_0178;
                            }
                            m.a.c().t().a("Could not get signatures");
                            break Label_0178;
                        }
                        catch (PackageManager$NameNotFoundException ex) {
                            m.a.c().o().b("Package name not found", ex);
                        }
                    }
                    h = 0L;
                }
            }
            this.h = h;
        }
        final boolean l = super.a.l();
        final boolean p3 = super.a.C().p;
        this.e();
        Label_0392: {
            if (super.a.l()) {
                uf.b();
                if (!super.a.w().y(null, a3.h0)) {
                    break Label_0392;
                }
                super.a.c().s().a("Disabled IID for tests.");
            }
        Label_0540_Outer:
            while (true) {
                String s2 = null;
                Label_0543: {
                    break Label_0543;
                    while (true) {
                        try {
                            final Class<?> loadClass = super.a.X().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                            if (loadClass == null) {
                                continue Label_0540_Outer;
                            }
                            l3 l2 = null;
                            String s3 = null;
                            try {
                                final Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, super.a.X());
                                if (invoke == null) {
                                    break Label_0540;
                                }
                                try {
                                    s2 = (String)loadClass.getDeclaredMethod("getFirebaseInstanceId", (Class<?>[])new Class[0]).invoke(invoke, new Object[0]);
                                }
                                catch (Exception ex2) {
                                    l2 = super.a.c().u();
                                    s3 = "Failed to retrieve Firebase Instance Id";
                                }
                            }
                            catch (Exception ex3) {
                                l2 = super.a.c().v();
                                s3 = "Failed to obtain Firebase Analytics instance";
                            }
                            l2.a(s3);
                            s2 = null;
                            final z4 a = super.a;
                            final long a2 = a.C().e.a();
                            long n2;
                            if (a2 == 0L) {
                                n2 = a.G;
                            }
                            else {
                                n2 = Math.min(a.G, a2);
                            }
                            this.f();
                            final int k = this.k;
                            final boolean x2 = super.a.w().x();
                            final c4 c = super.a.C();
                            c.e();
                            final boolean boolean1 = c.l().getBoolean("deferred_analytics_collection", false);
                            this.f();
                            final String i = this.m;
                            final Boolean q = super.a.w().q("google_analytics_default_allow_ad_personalization_signals");
                            Boolean value;
                            if (q == null) {
                                value = null;
                            }
                            else {
                                value = (q ^ true);
                            }
                            final long j = this.i;
                            final List<String> j2 = this.j;
                            fe.b();
                            String q2;
                            if (super.a.w().y(null, a3.f0)) {
                                q2 = this.q();
                            }
                            else {
                                q2 = null;
                            }
                            return new na(p, r, d, n, f, 42097L, h, s, l, p3 ^ true, s2, 0L, n2, k, x2, boolean1, i, value, j, j2, q2, super.a.C().n().i());
                        }
                        catch (ClassNotFoundException ex4) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
    
    final String o() {
        this.f();
        return this.m;
    }
    
    final String p() {
        this.f();
        x.k(this.c);
        return this.c;
    }
    
    final String q() {
        this.f();
        x.k(this.n);
        return this.n;
    }
    
    final String r() {
        this.f();
        x.k(this.l);
        return this.l;
    }
    
    final List<String> s() {
        return this.j;
    }
}
