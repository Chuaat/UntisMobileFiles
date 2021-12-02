// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.gms.internal.measurement.md;
import com.google.android.gms.common.wrappers.c;
import com.google.android.gms.internal.measurement.qd;
import androidx.annotation.c1;
import java.net.URL;
import android.net.NetworkInfo;
import android.util.Pair;
import android.net.ConnectivityManager;
import android.content.SharedPreferences$Editor;
import java.util.List;
import org.json.JSONException;
import android.content.Intent;
import android.net.Uri;
import org.json.JSONObject;
import java.util.Map;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.checkerframework.dataflow.qual.Pure;
import android.text.TextUtils;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.o1;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import com.google.android.gms.common.util.k;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.common.internal.x;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import com.google.android.gms.common.util.d0;

public final class z4 implements v5
{
    private static volatile z4 H;
    private volatile Boolean A;
    @d0
    protected Boolean B;
    @d0
    protected Boolean C;
    private volatile boolean D;
    private int E;
    private final AtomicInteger F;
    @d0
    final long G;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final b f;
    private final g g;
    private final c4 h;
    private final n3 i;
    private final w4 j;
    private final j9 k;
    private final ga l;
    private final i3 m;
    private final com.google.android.gms.common.util.g n;
    private final t7 o;
    private final e7 p;
    private final d2 q;
    private final i7 r;
    private final String s;
    private h3 t;
    private u8 u;
    private o v;
    private f3 w;
    private boolean x;
    private Boolean y;
    private long z;
    
    z4(final c6 c6) {
        boolean b = false;
        this.x = false;
        this.F = new AtomicInteger(0);
        com.google.android.gms.common.internal.x.k(c6);
        final b b2 = new b(c6.a);
        this.f = b2;
        x2.a = b2;
        final Context a = c6.a;
        this.a = a;
        this.b = c6.b;
        this.c = c6.c;
        this.d = c6.d;
        this.e = c6.h;
        this.A = c6.e;
        this.s = c6.j;
        this.D = true;
        final o1 g = c6.g;
        if (g != null) {
            final Bundle m = g.M;
            if (m != null) {
                final Object value = m.get("measurementEnabled");
                if (value instanceof Boolean) {
                    this.B = (Boolean)value;
                }
                final Object value2 = g.M.get("measurementDeactivated");
                if (value2 instanceof Boolean) {
                    this.C = (Boolean)value2;
                }
            }
        }
        c7.d(a);
        final com.google.android.gms.common.util.g e = com.google.android.gms.common.util.k.e();
        this.n = e;
        final Long i = c6.i;
        long g2;
        if (i != null) {
            g2 = i;
        }
        else {
            g2 = e.a();
        }
        this.G = g2;
        this.g = new g(this);
        final c4 h = new c4(this);
        h.i();
        this.h = h;
        final n3 j = new n3(this);
        j.i();
        this.i = j;
        final ga l = new ga(this);
        l.i();
        this.l = l;
        final i3 k = new i3(this);
        k.i();
        this.m = k;
        this.q = new d2(this);
        final t7 o = new t7(this);
        o.g();
        this.o = o;
        final e7 p = new e7(this);
        p.g();
        this.p = p;
        final j9 k2 = new j9(this);
        k2.g();
        this.k = k2;
        final i7 r = new i7(this);
        r.i();
        this.r = r;
        final w4 j2 = new w4(this);
        j2.i();
        this.j = j2;
        final o1 g3 = c6.g;
        if (g3 == null || g3.H == 0L) {
            b = true;
        }
        Label_0606: {
            l3 l2;
            String s;
            if (a.getApplicationContext() instanceof Application) {
                final e7 g4 = this.G();
                if (!(g4.a.a.getApplicationContext() instanceof Application)) {
                    break Label_0606;
                }
                final Application application = (Application)g4.a.a.getApplicationContext();
                if (g4.c == null) {
                    g4.c = new d7(g4, null);
                }
                if (!b) {
                    break Label_0606;
                }
                application.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)g4.c);
                application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)g4.c);
                l2 = g4.a.c().s();
                s = "Registered activity lifecycle callback";
            }
            else {
                l2 = this.c().t();
                s = "Application context is not an Application";
            }
            l2.a(s);
        }
        j2.w(new y4(this, c6));
    }
    
    public static z4 E(final Context context, final o1 o1, final Long n) {
        o1 o2 = o1;
        Label_0053: {
            if (o1 != null) {
                if (o1.K != null) {
                    o2 = o1;
                    if (o1.L != null) {
                        break Label_0053;
                    }
                }
                o2 = new o1(o1.G, o1.H, o1.I, o1.J, null, null, o1.M, null);
            }
        }
        x.k(context);
        x.k(context.getApplicationContext());
        Label_0166: {
            if (z4.H == null) {
                synchronized (z4.class) {
                    if (z4.H == null) {
                        z4.H = new z4(new c6(context, o2, n));
                    }
                    break Label_0166;
                }
            }
            if (o2 != null) {
                final Bundle m = o2.M;
                if (m != null && m.containsKey("dataCollectionDefaultEnabled")) {
                    x.k(z4.H);
                    z4.H.A = o2.M.getBoolean("dataCollectionDefaultEnabled");
                }
            }
        }
        x.k(z4.H);
        return z4.H;
    }
    
    static final void q() {
        throw new IllegalStateException("Unexpected call on client side");
    }
    
    private static final void r(final t5 t5) {
        if (t5 != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }
    
    private static final void s(final f4 f4) {
        if (f4 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (f4.j()) {
            return;
        }
        final String value = String.valueOf(f4.getClass());
        final StringBuilder sb = new StringBuilder(value.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(value);
        throw new IllegalStateException(sb.toString());
    }
    
    private static final void t(final u5 u5) {
        if (u5 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (u5.k()) {
            return;
        }
        final String value = String.valueOf(u5.getClass());
        final StringBuilder sb = new StringBuilder(value.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(value);
        throw new IllegalStateException(sb.toString());
    }
    
    @Pure
    public final i3 A() {
        r(this.m);
        return this.m;
    }
    
    public final n3 B() {
        final n3 i = this.i;
        if (i != null && i.k()) {
            return this.i;
        }
        return null;
    }
    
    @Pure
    public final c4 C() {
        r(this.h);
        return this.h;
    }
    
    @SideEffectFree
    final w4 D() {
        return this.j;
    }
    
    @Pure
    @Override
    public final com.google.android.gms.common.util.g F() {
        return this.n;
    }
    
    @Pure
    public final e7 G() {
        s(this.p);
        return this.p;
    }
    
    @Pure
    public final i7 H() {
        t(this.r);
        return this.r;
    }
    
    @Pure
    public final t7 I() {
        s(this.o);
        return this.o;
    }
    
    @Pure
    public final u8 J() {
        s(this.u);
        return this.u;
    }
    
    @Pure
    public final j9 K() {
        s(this.k);
        return this.k;
    }
    
    @Pure
    @Override
    public final b L() {
        return this.f;
    }
    
    @Pure
    public final ga M() {
        r(this.l);
        return this.l;
    }
    
    @Pure
    public final String N() {
        return this.b;
    }
    
    @Pure
    public final String O() {
        return this.c;
    }
    
    @Pure
    public final String P() {
        return this.d;
    }
    
    @Pure
    public final String Q() {
        return this.s;
    }
    
    @Pure
    @Override
    public final Context X() {
        return this.a;
    }
    
    @Pure
    @Override
    public final w4 b() {
        t(this.j);
        return this.j;
    }
    
    @Pure
    @Override
    public final n3 c() {
        t(this.i);
        return this.i;
    }
    
    final void d() {
        this.F.incrementAndGet();
    }
    
    final void f() {
        ++this.E;
    }
    
    @c1
    public final void g() {
        this.b().e();
        t(this.H());
        final String p = this.y().p();
        final Pair<String, Boolean> m = this.C().m(p);
        if (!this.g.x() || (boolean)m.second || TextUtils.isEmpty((CharSequence)m.first)) {
            this.c().n().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        final i7 h = this.H();
        h.h();
        final ConnectivityManager connectivityManager = (ConnectivityManager)h.a.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo;
        final NetworkInfo networkInfo = activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            }
            catch (SecurityException ex) {
                activeNetworkInfo = networkInfo;
            }
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            final ga i = this.M();
            this.y().a.g.n();
            final URL o = i.o(42097L, p, (String)m.first, this.C().s.a() - 1L);
            if (o != null) {
                final i7 h2 = this.H();
                final x4 x4 = new x4(this);
                h2.e();
                h2.h();
                com.google.android.gms.common.internal.x.k(o);
                com.google.android.gms.common.internal.x.k(x4);
                h2.a.b().v(new h7(h2, p, o, (byte[])null, (Map)null, x4, (byte[])null));
            }
            return;
        }
        this.c().t().a("Network is not available for Deferred Deep Link request. Skipping");
    }
    
    @c1
    final void h(final boolean b) {
        this.A = b;
    }
    
    @c1
    public final void i(final boolean d) {
        this.b().e();
        this.D = d;
    }
    
    @c1
    protected final void j(final o1 o1) {
        this.b().e();
        h n = this.C().n();
        final c4 c = this.C();
        final z4 a = c.a;
        c.e();
        final SharedPreferences l = c.l();
        int n2 = 100;
        final int int1 = l.getInt("consent_source", 100);
        final g g = this.g;
        final z4 a2 = g.a;
        final Boolean q = g.q("google_analytics_default_allow_ad_storage");
        final g g2 = this.g;
        final z4 a3 = g2.a;
        final Boolean q2 = g2.q("google_analytics_default_allow_analytics_storage");
        h a4 = null;
        Label_0284: {
            if ((q != null || q2 != null) && this.C().t(-10)) {
                a4 = new h(q, q2);
                n2 = -10;
            }
            else {
                if (!TextUtils.isEmpty((CharSequence)this.y().r()) && (int1 == 0 || int1 == 30 || int1 == 10 || int1 == 30 || int1 == 30 || int1 == 40)) {
                    this.G().C(com.google.android.gms.measurement.internal.h.c, -10, this.G);
                }
                else {
                    qd.b();
                    if ((!this.g.y(null, com.google.android.gms.measurement.internal.a3.w0) || TextUtils.isEmpty((CharSequence)this.y().r())) && o1 != null && o1.M != null && this.C().t(30)) {
                        a4 = com.google.android.gms.measurement.internal.h.a(o1.M);
                        if (!a4.equals(com.google.android.gms.measurement.internal.h.c)) {
                            n2 = 30;
                            break Label_0284;
                        }
                    }
                }
                a4 = null;
            }
        }
        if (a4 != null) {
            this.G().C(a4, n2, this.G);
            n = a4;
        }
        this.G().G(n);
        if (this.C().e.a() == 0L) {
            this.c().s().b("Persisting first open", this.G);
            this.C().e.b(this.G);
        }
        this.G().n.c();
        if (!this.o()) {
            if (this.l()) {
                if (!this.M().Q("android.permission.INTERNET")) {
                    this.c().o().a("App is missing INTERNET permission");
                }
                if (!this.M().Q("android.permission.ACCESS_NETWORK_STATE")) {
                    this.c().o().a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!com.google.android.gms.common.wrappers.c.a(this.a).f() && !this.g.D()) {
                    if (!ga.W(this.a)) {
                        this.c().o().a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!ga.Y(this.a, false)) {
                        this.c().o().a("AppMeasurementService not registered/enabled");
                    }
                }
                this.c().o().a("Uploading is not possible. App measurement disabled");
            }
        }
        else {
            if (!TextUtils.isEmpty((CharSequence)this.y().r()) || !TextUtils.isEmpty((CharSequence)this.y().o())) {
                final ga m = this.M();
                final String r = this.y().r();
                final c4 c2 = this.C();
                c2.e();
                final String string = c2.l().getString("gmp_app_id", (String)null);
                final String o2 = this.y().o();
                final c4 c3 = this.C();
                c3.e();
                if (m.b0(r, string, o2, c3.l().getString("admob_app_id", (String)null))) {
                    this.c().r().a("Rechecking which service to use due to a GMP App Id change");
                    final c4 c4 = this.C();
                    c4.e();
                    final Boolean o3 = c4.o();
                    final SharedPreferences$Editor edit = c4.l().edit();
                    edit.clear();
                    edit.apply();
                    if (o3 != null) {
                        c4.p(o3);
                    }
                    this.z().n();
                    this.u.P();
                    this.u.O();
                    this.C().e.b(this.G);
                    this.C().g.b(null);
                }
                final c4 c5 = this.C();
                final String r2 = this.y().r();
                c5.e();
                final SharedPreferences$Editor edit2 = c5.l().edit();
                edit2.putString("gmp_app_id", r2);
                edit2.apply();
                final c4 c6 = this.C();
                final String o4 = this.y().o();
                c6.e();
                final SharedPreferences$Editor edit3 = c6.l().edit();
                edit3.putString("admob_app_id", o4);
                edit3.apply();
            }
            if (!this.C().n().k()) {
                this.C().g.b(null);
            }
            this.G().y(this.C().g.a());
            md.b();
            if (this.g.y(null, com.google.android.gms.measurement.internal.a3.k0)) {
                final ga i = this.M();
                try {
                    i.a.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                }
                catch (ClassNotFoundException ex) {
                    if (!TextUtils.isEmpty((CharSequence)this.C().t.a())) {
                        this.c().t().a("Remote config removed with active feature rollouts");
                        this.C().t.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty((CharSequence)this.y().r()) || !TextUtils.isEmpty((CharSequence)this.y().o())) {
                final boolean j = this.l();
                if (!this.C().r() && !this.g.B()) {
                    this.C().q(j ^ true);
                }
                if (j) {
                    this.G().e0();
                }
                this.K().d.a();
                this.J().R(new AtomicReference<String>());
                this.J().s(this.C().w.a());
            }
        }
        this.C().n.a(true);
    }
    
    @c1
    public final boolean k() {
        return this.A != null && this.A;
    }
    
    @c1
    public final boolean l() {
        return this.u() == 0;
    }
    
    @c1
    public final boolean m() {
        this.b().e();
        return this.D;
    }
    
    @Pure
    public final boolean n() {
        return TextUtils.isEmpty((CharSequence)this.b);
    }
    
    @c1
    protected final boolean o() {
        if (this.x) {
            this.b().e();
            final Boolean y = this.y;
            if (y == null || this.z == 0L || (!y && Math.abs(this.n.d() - this.z) > 1000L)) {
                this.z = this.n.d();
                final boolean q = this.M().Q("android.permission.INTERNET");
                final boolean b = true;
                final Boolean value = q && this.M().Q("android.permission.ACCESS_NETWORK_STATE") && (com.google.android.gms.common.wrappers.c.a(this.a).f() || this.g.D() || (ga.W(this.a) && ga.Y(this.a, false)));
                this.y = value;
                if (value) {
                    boolean b2 = b;
                    if (!this.M().I(this.y().r(), this.y().o(), this.y().q())) {
                        b2 = (!TextUtils.isEmpty((CharSequence)this.y().o()) && b);
                    }
                    this.y = b2;
                }
            }
            return this.y;
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }
    
    @Pure
    public final boolean p() {
        return this.e;
    }
    
    @c1
    public final int u() {
        this.b().e();
        if (this.g.B()) {
            return 1;
        }
        final Boolean c = this.C;
        if (c != null && c) {
            return 2;
        }
        this.b().e();
        if (!this.D) {
            return 8;
        }
        final Boolean o = this.C().o();
        if (o != null) {
            if (o) {
                return 0;
            }
            return 3;
        }
        else {
            final g g = this.g;
            final b f = g.a.f;
            final Boolean q = g.q("firebase_analytics_collection_enabled");
            if (q != null) {
                if (q) {
                    return 0;
                }
                return 4;
            }
            else {
                final Boolean b = this.B;
                if (b != null) {
                    if (b) {
                        return 0;
                    }
                    return 5;
                }
                else {
                    if (!this.g.y(null, a3.U) || this.A == null) {
                        return 0;
                    }
                    if (this.A) {
                        return 0;
                    }
                    return 7;
                }
            }
        }
    }
    
    @Pure
    public final d2 v() {
        final d2 q = this.q;
        if (q != null) {
            return q;
        }
        throw new IllegalStateException("Component not created");
    }
    
    @Pure
    public final g w() {
        return this.g;
    }
    
    @Pure
    public final o x() {
        t(this.v);
        return this.v;
    }
    
    @Pure
    public final f3 y() {
        s(this.w);
        return this.w;
    }
    
    @Pure
    public final h3 z() {
        s(this.t);
        return this.t;
    }
}
