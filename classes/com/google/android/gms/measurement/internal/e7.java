// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.Arrays;
import android.os.Parcelable;
import com.google.android.gms.common.util.b0;
import com.google.android.gms.internal.measurement.md;
import com.google.android.gms.internal.measurement.nf;
import android.content.Context;
import java.util.Collection;
import java.util.TreeSet;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.os.Build$VERSION;
import java.util.Iterator;
import androidx.collection.a;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import android.text.TextUtils;
import com.google.android.gms.common.internal.x;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.wd;
import androidx.annotation.c1;
import android.content.SharedPreferences$Editor;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import androidx.annotation.w;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Set;
import com.google.android.gms.common.util.d0;

public final class e7 extends f4
{
    @d0
    protected d7 c;
    private a6 d;
    private final Set<b6> e;
    private boolean f;
    private final AtomicReference<String> g;
    private final Object h;
    @w("consentLock")
    private h i;
    @w("consentLock")
    private int j;
    private final AtomicLong k;
    private long l;
    private int m;
    final pa n;
    @d0
    protected boolean o;
    private final fa p;
    
    protected e7(final z4 z4) {
        super(z4);
        this.e = new CopyOnWriteArraySet<b6>();
        this.h = new Object();
        this.o = true;
        this.p = new s6(this);
        this.g = new AtomicReference<String>();
        this.i = new h(null, null);
        this.j = 100;
        this.l = -1L;
        this.m = 100;
        this.k = new AtomicLong(0L);
        this.n = new pa(z4);
    }
    
    @c1
    private final void M(final Boolean b, final boolean b2) {
        this.e();
        this.f();
        super.a.c().n().b("Setting app measurement enabled (FE)", b);
        super.a.C().p(b);
        if (b2) {
            final c4 c = super.a.C();
            final z4 a = c.a;
            c.e();
            final SharedPreferences$Editor edit = c.l().edit();
            if (b != null) {
                edit.putBoolean("measurement_enabled_from_api", (boolean)b);
            }
            else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (!super.a.m() && (b == null || b)) {
            return;
        }
        this.N();
    }
    
    @c1
    private final void N() {
        this.e();
        final String a = super.a.C().m.a();
        if (a != null) {
            Object value;
            if ("unset".equals(a)) {
                value = null;
            }
            else {
                long l;
                if (!"true".equals(a)) {
                    l = 0L;
                }
                else {
                    l = 1L;
                }
                value = l;
            }
            this.J("app", "_npa", value, super.a.F().a());
        }
        if (super.a.l() && this.o) {
            super.a.c().n().a("Recording app launch after enabling measurement for the first time (FE)");
            this.e0();
            wd.b();
            if (super.a.w().y(null, a3.l0)) {
                super.a.K().d.a();
            }
            super.a.b().w(new g6(this));
            return;
        }
        super.a.c().n().a("Updating Scion state (FE)");
        super.a.J().t();
    }
    
    public final void A(Bundle bundle, long n) {
        x.k(bundle);
        bundle = new Bundle(bundle);
        if (!TextUtils.isEmpty((CharSequence)bundle.getString("app_id"))) {
            super.a.c().t().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle.remove("app_id");
        x.k(bundle);
        w5.a(bundle, "app_id", String.class, null);
        w5.a(bundle, "origin", String.class, null);
        w5.a(bundle, "name", String.class, null);
        w5.a(bundle, "value", Object.class, null);
        w5.a(bundle, "trigger_event_name", String.class, null);
        final Long value = 0L;
        w5.a(bundle, "trigger_timeout", Long.class, value);
        w5.a(bundle, "timed_out_event_name", String.class, null);
        w5.a(bundle, "timed_out_event_params", Bundle.class, null);
        w5.a(bundle, "triggered_event_name", String.class, null);
        w5.a(bundle, "triggered_event_params", Bundle.class, null);
        w5.a(bundle, "time_to_live", Long.class, value);
        w5.a(bundle, "expired_event_name", String.class, null);
        w5.a(bundle, "expired_event_params", Bundle.class, null);
        x.g(bundle.getString("name"));
        x.g(bundle.getString("origin"));
        x.k(bundle.get("value"));
        bundle.putLong("creation_timestamp", n);
        final String string = bundle.getString("name");
        final Object value2 = bundle.get("value");
        if (super.a.M().n0(string) != 0) {
            super.a.c().o().b("Invalid conditional user property name", super.a.A().p(string));
            return;
        }
        if (super.a.M().j0(string, value2) != 0) {
            super.a.c().o().c("Invalid conditional user property value", super.a.A().p(string), value2);
            return;
        }
        final Object m = super.a.M().m(string, value2);
        if (m == null) {
            super.a.c().o().c("Unable to normalize conditional user property value", super.a.A().p(string), value2);
            return;
        }
        w5.b(bundle, m);
        n = bundle.getLong("trigger_timeout");
        if (!TextUtils.isEmpty((CharSequence)bundle.getString("trigger_event_name"))) {
            super.a.w();
            if (n > 15552000000L || n < 1L) {
                super.a.c().o().c("Invalid conditional user property timeout", super.a.A().p(string), n);
                return;
            }
        }
        n = bundle.getLong("time_to_live");
        super.a.w();
        if (n <= 15552000000L && n >= 1L) {
            super.a.b().w(new n6(this, bundle));
            return;
        }
        super.a.c().o().c("Invalid conditional user property time to live", super.a.A().p(string), n);
    }
    
    public final void B(final Bundle bundle, final int n, final long n2) {
        this.f();
        final String h = com.google.android.gms.measurement.internal.h.h(bundle);
        if (h != null) {
            super.a.c().u().b("Ignoring invalid consent setting", h);
            super.a.c().u().a("Valid consent values are 'granted', 'denied'");
        }
        this.C(com.google.android.gms.measurement.internal.h.a(bundle), n, n2);
    }
    
    public final void C(h d, final int j, final long n) {
        this.f();
        if (j != -10 && d.e() == null && d.f() == null) {
            super.a.c().u().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.h) {
            final boolean l = com.google.android.gms.measurement.internal.h.l(j, this.j);
            boolean b = true;
            boolean m = false;
            final boolean b2 = false;
            boolean b3;
            if (l) {
                m = d.m(this.i);
                b3 = b2;
                if (d.k()) {
                    b3 = b2;
                    if (!this.i.k()) {
                        b3 = true;
                    }
                }
                d = d.d(this.i);
                this.i = d;
                this.j = j;
            }
            else {
                b3 = false;
                b = false;
            }
            // monitorexit(this.h)
            if (!b) {
                super.a.c().r().b("Ignoring lower-priority consent settings, proposed settings", d);
                return;
            }
            final long andIncrement = this.k.getAndIncrement();
            if (m) {
                this.g.set(null);
                super.a.b().x(new y6(this, d, n, j, andIncrement, b3));
                return;
            }
            if (j != 30 && j != -10) {
                super.a.b().w(new a7(this, d, j, andIncrement, b3));
                return;
            }
            super.a.b().x(new z6(this, d, j, andIncrement, b3));
        }
    }
    
    @c1
    public final void D(final a6 d) {
        this.e();
        this.f();
        if (d != null) {
            final a6 d2 = this.d;
            if (d != d2) {
                x.r(d2 == null, "EventInterceptor already set.");
            }
        }
        this.d = d;
    }
    
    public final void E(final Boolean b) {
        this.f();
        super.a.b().w(new x6(this, b));
    }
    
    @c1
    final void G(final h h) {
        this.e();
        final boolean b = (h.k() && h.j()) || super.a.J().x();
        if (b != super.a.m()) {
            super.a.i(b);
            final c4 c = super.a.C();
            final z4 a = c.a;
            c.e();
            Boolean value;
            if (c.l().contains("measurement_enabled_from_api")) {
                value = c.l().getBoolean("measurement_enabled_from_api", true);
            }
            else {
                value = null;
            }
            if (!b || value == null || value) {
                this.M(b, false);
            }
        }
    }
    
    public final void H(final String s, final String s2, final Object o, final boolean b) {
        this.I("auto", "_ldl", o, true, super.a.F().a());
    }
    
    public final void I(String s, final String s2, Object m, final boolean b, final long n) {
        if (s == null) {
            s = "app";
        }
        int n2 = 0;
        Label_0111: {
            if (b) {
                n2 = super.a.M().n0(s2);
            }
            else {
                final ga i = super.a.M();
                if (i.P("user property", s2)) {
                    if (!i.K("user property", z5.a, null, s2)) {
                        n2 = 15;
                        break Label_0111;
                    }
                    i.a.w();
                    if (i.J("user property", 24, s2)) {
                        n2 = 0;
                        break Label_0111;
                    }
                }
                n2 = 6;
            }
        }
        if (n2 != 0) {
            final ga j = super.a.M();
            super.a.w();
            s = j.n(s2, 24, true);
            int length;
            if (s2 != null) {
                length = s2.length();
            }
            else {
                length = 0;
            }
            super.a.M().x(this.p, null, n2, "_ev", s, length);
            return;
        }
        if (m == null) {
            this.x(s, s2, n, null);
            return;
        }
        final int j2 = super.a.M().j0(s2, m);
        if (j2 != 0) {
            final ga k = super.a.M();
            super.a.w();
            s = k.n(s2, 24, true);
            int length2;
            if (!(m instanceof String) && !(m instanceof CharSequence)) {
                length2 = 0;
            }
            else {
                length2 = String.valueOf(m).length();
            }
            super.a.M().x(this.p, null, j2, "_ev", s, length2);
            return;
        }
        m = super.a.M().m(s2, m);
        if (m != null) {
            this.x(s, s2, n, m);
        }
    }
    
    @c1
    final void J(final String s, String anObject, Object o, final long n) {
        x.g(s);
        x.g(anObject);
        this.e();
        this.f();
        Label_0162: {
            if ("allow_personalized_ads".equals(anObject)) {
                b4 b4 = null;
                Label_0150: {
                    if (o instanceof String) {
                        final String s2 = (String)o;
                        if (!TextUtils.isEmpty((CharSequence)s2)) {
                            final String lowerCase = s2.toLowerCase(Locale.ENGLISH);
                            anObject = "false";
                            long l;
                            if (!"false".equals(lowerCase)) {
                                l = 0L;
                            }
                            else {
                                l = 1L;
                            }
                            final Long value = l;
                            b4 = super.a.C().m;
                            o = value;
                            if (value == 1L) {
                                anObject = "true";
                                b4 = b4;
                                o = value;
                            }
                            break Label_0150;
                        }
                    }
                    if (o != null) {
                        break Label_0162;
                    }
                    b4 = super.a.C().m;
                    anObject = "unset";
                }
                b4.b(anObject);
                anObject = "_npa";
            }
        }
        if (!super.a.l()) {
            super.a.c().s().a("User property not set since app measurement is disabled");
            return;
        }
        if (!super.a.o()) {
            return;
        }
        super.a.J().v(new ca(anObject, n, o, s));
    }
    
    public final void K(final b6 b6) {
        this.f();
        x.k(b6);
        if (!this.e.remove(b6)) {
            super.a.c().t().a("OnEventListener had not been registered");
        }
    }
    
    public final int O(final String s) {
        x.g(s);
        super.a.w();
        return 25;
    }
    
    public final Boolean P() {
        final AtomicReference<Boolean> atomicReference = new AtomicReference<Boolean>();
        return super.a.b().o(atomicReference, 15000L, "boolean test flag value", new p6(this, atomicReference));
    }
    
    public final Double Q() {
        final AtomicReference<Double> atomicReference = new AtomicReference<Double>();
        return super.a.b().o(atomicReference, 15000L, "double test flag value", new w6(this, atomicReference));
    }
    
    public final Integer R() {
        final AtomicReference<Integer> atomicReference = new AtomicReference<Integer>();
        return super.a.b().o(atomicReference, 15000L, "int test flag value", new v6(this, atomicReference));
    }
    
    public final Long S() {
        final AtomicReference<Long> atomicReference = new AtomicReference<Long>();
        return super.a.b().o(atomicReference, 15000L, "long test flag value", new u6(this, atomicReference));
    }
    
    public final String T() {
        return this.g.get();
    }
    
    public final String U() {
        final m7 p = super.a.I().p();
        if (p != null) {
            return p.b;
        }
        return null;
    }
    
    public final String V() {
        final m7 p = super.a.I().p();
        if (p != null) {
            return p.a;
        }
        return null;
    }
    
    public final String W() {
        final AtomicReference<String> atomicReference = new AtomicReference<String>();
        return super.a.b().o(atomicReference, 15000L, "String test flag value", new t6(this, atomicReference));
    }
    
    public final ArrayList<Bundle> Y(final String s, final String s2) {
        ArrayList<Bundle> r;
        if (super.a.b().z()) {
            super.a.c().o().a("Cannot get conditional user properties from analytics worker thread");
            r = new ArrayList<Bundle>(0);
        }
        else {
            super.a.L();
            if (com.google.android.gms.measurement.internal.b.a()) {
                super.a.c().o().a("Cannot get conditional user properties from main thread");
                r = new ArrayList<Bundle>(0);
            }
            else {
                final AtomicReference<List<c>> atomicReference = new AtomicReference<List<c>>();
                super.a.b().o((AtomicReference<Object>)atomicReference, 5000L, "get conditional user properties", new q6(this, atomicReference, null, s, s2));
                final List<c> list = atomicReference.get();
                if (list == null) {
                    super.a.c().o().b("Timed out waiting for get conditional user properties", null);
                    r = new ArrayList<Bundle>();
                }
                else {
                    r = ga.r(list);
                }
            }
        }
        return r;
    }
    
    public final List<ca> Z(final boolean b) {
        this.f();
        super.a.c().s().a("Getting user properties (FE)");
        l3 l3;
        String s;
        if (!super.a.b().z()) {
            super.a.L();
            if (b.a()) {
                l3 = super.a.c().o();
                s = "Cannot get all user properties from main thread";
            }
            else {
                final AtomicReference<List<ca>> atomicReference = new AtomicReference<List<ca>>();
                super.a.b().o((AtomicReference<Object>)atomicReference, 5000L, "get user properties", new l6(this, atomicReference, b));
                final List<ca> list = atomicReference.get();
                if (list == null) {
                    super.a.c().o().b("Timed out waiting for get user properties, includeInternal", b);
                    return Collections.emptyList();
                }
                return list;
            }
        }
        else {
            l3 = super.a.c().o();
            s = "Cannot get all user properties from analytics worker thread";
        }
        l3.a(s);
        return Collections.emptyList();
    }
    
    public final Map<String, Object> a0(final String s, String s2, final boolean b) {
        l3 l3;
        if (super.a.b().z()) {
            l3 = super.a.c().o();
            s2 = "Cannot get user properties from analytics worker thread";
        }
        else {
            super.a.L();
            if (b.a()) {
                l3 = super.a.c().o();
                s2 = "Cannot get user properties from main thread";
            }
            else {
                final AtomicReference<List<ca>> atomicReference = new AtomicReference<List<ca>>();
                super.a.b().o((AtomicReference<Object>)atomicReference, 5000L, "get user properties", new r6(this, atomicReference, null, s, s2, b));
                final List<ca> list = atomicReference.get();
                if (list == null) {
                    super.a.c().o().b("Timed out waiting for handle get user properties, includeInternal", b);
                    return Collections.emptyMap();
                }
                final Map<String, Object> emptyMap = new a<String, Object>(list.size());
                for (final ca ca : list) {
                    final Object m = ca.M();
                    if (m != null) {
                        emptyMap.put(ca.H, m);
                    }
                }
                return emptyMap;
            }
        }
        l3.a(s2);
        return Collections.emptyMap();
    }
    
    @c1
    public final void e0() {
        this.e();
        this.f();
        if (super.a.o()) {
            if (super.a.w().y(null, a3.b0)) {
                final g w = super.a.w();
                w.a.L();
                final Boolean q = w.q("google_analytics_deferred_deep_link_enabled");
                if (q != null && q) {
                    super.a.c().n().a("Deferred Deep Link feature enabled.");
                    super.a.b().w(new d6(this));
                }
            }
            super.a.J().N();
            this.o = false;
            final c4 c = super.a.C();
            c.e();
            final String string = c.l().getString("previous_os_version", (String)null);
            c.a.x().h();
            final String release = Build$VERSION.RELEASE;
            if (!TextUtils.isEmpty((CharSequence)release) && !release.equals(string)) {
                final SharedPreferences$Editor edit = c.l().edit();
                edit.putString("previous_os_version", release);
                edit.apply();
            }
            if (!TextUtils.isEmpty((CharSequence)string)) {
                super.a.x().h();
                if (!string.equals(release)) {
                    final Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    this.q("auto", "_ou", bundle);
                }
            }
        }
    }
    
    public final void f0(final String s, final String s2, final Bundle bundle) {
        final long a = super.a.F().a();
        x.g(s);
        final Bundle bundle2 = new Bundle();
        bundle2.putString("name", s);
        bundle2.putLong("creation_timestamp", a);
        if (s2 != null) {
            bundle2.putString("expired_event_name", s2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        super.a.b().w(new o6(this, bundle2));
    }
    
    @Override
    protected final boolean k() {
        return false;
    }
    
    public final void l() {
        if (super.a.X().getApplicationContext() instanceof Application && this.c != null) {
            ((Application)super.a.X().getApplicationContext()).unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this.c);
        }
    }
    
    public final void n(final String s, final String s2, final Bundle bundle) {
        this.o(s, s2, bundle, true, true, super.a.F().a());
    }
    
    public final void o(String s, final String s2, Bundle bundle, final boolean b, final boolean b2, final long n) {
        if (s == null) {
            s = "app";
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (ga.Z(s2, "screen_view")) {
            super.a.I().C(bundle, n);
            return;
        }
        this.w(s, s2, n, bundle, b2, !b2 || this.d == null || ga.U(s2), b, null);
    }
    
    public final void p(final String s, final String s2, final Bundle bundle, final String s3) {
        z4.q();
        this.w("auto", s2, super.a.F().a(), bundle, false, true, true, s3);
    }
    
    @c1
    final void q(final String s, final String s2, final Bundle bundle) {
        this.e();
        this.r(s, s2, super.a.F().a(), bundle);
    }
    
    @c1
    final void r(final String s, final String s2, final long n, final Bundle bundle) {
        this.e();
        this.s(s, s2, n, bundle, true, this.d == null || ga.U(s2), true, null);
    }
    
    @c1
    protected final void s(String s, final String s2, long d, Bundle u0, final boolean b, final boolean b2, final boolean b3, final String s3) {
        x.g(s);
        x.k(u0);
        this.e();
        this.f();
        if (!super.a.l()) {
            super.a.c().n().a("Event not sent since app measurement is disabled");
            return;
        }
        final List<String> s4 = super.a.y().s();
        if (s4 != null && !s4.contains(s2)) {
            super.a.c().n().c("Dropping non-safelisted event. event name, origin", s2, s);
            return;
        }
        final boolean f = this.f;
        final int n = 0;
        final int n2 = 0;
        if (!f) {
            this.f = true;
            try {
                Class<?> clazz;
                if (!super.a.p()) {
                    clazz = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, super.a.X().getClassLoader());
                }
                else {
                    clazz = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    clazz.getDeclaredMethod("initialize", Context.class).invoke(null, super.a.X());
                }
                catch (Exception ex) {
                    super.a.c().t().b("Failed to invoke Tag Manager's initialize() method", ex);
                }
            }
            catch (ClassNotFoundException ex2) {
                super.a.c().r().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(s2) && u0.containsKey("gclid")) {
            super.a.L();
            this.J("auto", "_lgclid", u0.getString("gclid"), super.a.F().a());
        }
        super.a.L();
        if (b && ga.a0(s2)) {
            super.a.M().v(u0, super.a.C().w.a());
        }
        if (!b3) {
            super.a.L();
            if (!"_iap".equals(s2)) {
                final ga m = super.a.M();
                final boolean p8 = m.P("event", s2);
                int n3 = 2;
                if (p8) {
                    if (!m.K("event", x5.a, x5.b, s2)) {
                        n3 = 13;
                    }
                    else {
                        m.a.w();
                        if (m.J("event", 40, s2)) {
                            n3 = 0;
                        }
                    }
                }
                if (n3 != 0) {
                    super.a.c().p().b("Invalid public event name. Event will not be logged (FE)", super.a.A().n(s2));
                    final ga i = super.a.M();
                    super.a.w();
                    s = i.n(s2, 40, true);
                    int length = n2;
                    if (s2 != null) {
                        length = s2.length();
                    }
                    super.a.M().x(this.p, null, n3, "_ev", s, length);
                    return;
                }
            }
        }
        nf.b();
        m7 m2 = null;
        boolean b4 = false;
        Label_0692: {
            Label_0689: {
                if (super.a.w().y(null, a3.C0)) {
                    super.a.L();
                    final m7 q = super.a.I().q(false);
                    if (q != null && !u0.containsKey("_sc")) {
                        q.d = true;
                    }
                    m2 = q;
                    if (!b) {
                        break Label_0689;
                    }
                    m2 = q;
                    if (b3) {
                        break Label_0689;
                    }
                    m2 = q;
                }
                else {
                    super.a.L();
                    final m7 q2 = super.a.I().q(false);
                    if (q2 != null && !u0.containsKey("_sc")) {
                        q2.d = true;
                    }
                    m2 = q2;
                    if (!b) {
                        break Label_0689;
                    }
                    m2 = q2;
                    if (b3) {
                        break Label_0689;
                    }
                    m2 = q2;
                }
                b4 = true;
                break Label_0692;
            }
            b4 = false;
        }
        ga.u(m2, u0, b4);
        final boolean equals = "am".equals(s);
        final boolean u2 = ga.U(s2);
        boolean b5;
        if (b && this.d != null && !u2) {
            if (!equals) {
                super.a.c().n().c("Passing event to registered event handler (FE)", super.a.A().n(s2), super.a.A().m(u0));
                x.k(this.d);
                this.d.a(s, s2, u0, d);
                return;
            }
            b5 = true;
        }
        else {
            b5 = equals;
        }
        if (super.a.o()) {
            final int k0 = super.a.M().k0(s2);
            if (k0 != 0) {
                super.a.c().p().b("Invalid event name. Event will not be logged (FE)", super.a.A().n(s2));
                final ga j = super.a.M();
                super.a.w();
                s = j.n(s2, 40, true);
                int length2 = n;
                if (s2 != null) {
                    length2 = s2.length();
                }
                super.a.M().x(this.p, s3, k0, "_ev", s, length2);
                return;
            }
            final Bundle v0 = super.a.M().v0(s3, s2, u0, com.google.android.gms.common.util.h.d("_o", "_sn", "_sc", "_si"), b3);
            x.k(v0);
            super.a.L();
            if (super.a.I().q(false) != null && "_ae".equals(s2)) {
                final h9 e = super.a.K().e;
                final long d2 = e.d.a.F().d();
                final long n4 = d2 - e.b;
                e.b = d2;
                if (n4 > 0L) {
                    super.a.M().s(v0, n4);
                }
            }
            md.b();
            if (super.a.w().y(null, a3.k0)) {
                if (!"auto".equals(s) && "_ssr".equals(s2)) {
                    final ga l = super.a.M();
                    final String string = v0.getString("_ffr");
                    String trim;
                    if (b0.b(string)) {
                        trim = null;
                    }
                    else if ((trim = string) != null) {
                        trim = string.trim();
                    }
                    if (ga.Z(trim, l.a.C().t.a())) {
                        l.a.c().n().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    l.a.C().t.b(trim);
                }
                else if ("_ae".equals(s2)) {
                    final String a = super.a.M().a.C().t.a();
                    if (!TextUtils.isEmpty((CharSequence)a)) {
                        v0.putString("_ffr", a);
                    }
                }
            }
            final ArrayList<Bundle> list = new ArrayList<Bundle>();
            list.add(v0);
            if (super.a.C().o.a() > 0L && super.a.C().s(d) && super.a.C().q.b()) {
                super.a.c().s().a("Current session is expired, remove the session number, ID, and engagement time");
                this.J("auto", "_sid", null, super.a.F().a());
                this.J("auto", "_sno", null, super.a.F().a());
                this.J("auto", "_se", null, super.a.F().a());
            }
            if (v0.getLong("extend_session", 0L) == 1L) {
                super.a.c().s().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                super.a.K().d.b(d, true);
            }
            final ArrayList list2 = new ArrayList<Object>(v0.keySet());
            Collections.sort((List<Comparable>)list2);
            for (int size = list2.size(), n5 = 0; n5 < size; ++n5) {
                final String s5 = list2.get(n5);
                if (s5 != null) {
                    super.a.M();
                    final Object value = v0.get(s5);
                    Object[] array = null;
                    Label_1661: {
                        if (value instanceof Bundle) {
                            array = new Bundle[] { (Bundle)value };
                        }
                        else {
                            Object[] array2;
                            if (value instanceof Parcelable[]) {
                                final Parcelable[] original = (Parcelable[])value;
                                array2 = Arrays.copyOf(original, original.length, (Class<? extends Object[]>)Bundle[].class);
                            }
                            else {
                                if (!(value instanceof ArrayList)) {
                                    array = null;
                                    break Label_1661;
                                }
                                final ArrayList list3 = (ArrayList)value;
                                array2 = list3.toArray(new Bundle[list3.size()]);
                            }
                            array = array2;
                        }
                    }
                    if (array != null) {
                        v0.putParcelableArray(s5, (Parcelable[])array);
                    }
                }
            }
            for (int n6 = 0; n6 < list.size(); ++n6) {
                final Bundle bundle = list.get(n6);
                String s6;
                if (n6 != 0) {
                    s6 = "_ep";
                }
                else {
                    s6 = s2;
                }
                bundle.putString("_o", s);
                u0 = bundle;
                if (b2) {
                    u0 = super.a.M().u0(bundle);
                }
                super.a.J().l(new u(s6, new s(u0), s, d), s3);
                if (!b5) {
                    final Iterator<b6> iterator = this.e.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().a(s, s2, new Bundle(u0), d);
                    }
                }
            }
            super.a.L();
            if (super.a.I().q(false) != null && "_ae".equals(s2)) {
                final j9 k2 = super.a.K();
                d = super.a.F().d();
                k2.e.d(true, true, d);
            }
        }
    }
    
    public final void t(final b6 b6) {
        this.f();
        x.k(b6);
        if (!this.e.add(b6)) {
            super.a.c().t().a("OnEventListener already registered");
        }
    }
    
    public final void u(final long n) {
        this.g.set(null);
        super.a.b().w(new m6(this, n));
    }
    
    final void v(final long n, final boolean b) {
        this.e();
        this.f();
        super.a.c().n().a("Resetting analytics data (FE)");
        final j9 k = super.a.K();
        k.e();
        k.e.a();
        final boolean l = super.a.l();
        final c4 c = super.a.C();
        c.e.b(n);
        if (!TextUtils.isEmpty((CharSequence)c.a.C().t.a())) {
            c.t.b(null);
        }
        wd.b();
        final g w = c.a.w();
        final z2<Boolean> l2 = a3.l0;
        if (w.y(null, l2)) {
            c.o.b(0L);
        }
        if (!c.a.w().B()) {
            c.q(l ^ true);
        }
        c.u.b(null);
        c.v.b(0L);
        c.w.b(null);
        if (b) {
            super.a.J().n();
        }
        wd.b();
        if (super.a.w().y(null, l2)) {
            super.a.K().d.a();
        }
        this.o = (l ^ true);
    }
    
    protected final void w(final String s, final String s2, final long n, Bundle bundle, final boolean b, final boolean b2, final boolean b3, final String s3) {
        bundle = new Bundle(bundle);
        for (final String s4 : bundle.keySet()) {
            final Object value = bundle.get(s4);
            if (value instanceof Bundle) {
                bundle.putBundle(s4, new Bundle((Bundle)value));
            }
            else {
                final boolean b4 = value instanceof Parcelable[];
                final int n2 = 0;
                int i = 0;
                if (b4) {
                    for (Parcelable[] array = (Parcelable[])value; i < array.length; ++i) {
                        final Parcelable parcelable = array[i];
                        if (parcelable instanceof Bundle) {
                            array[i] = (Parcelable)new Bundle((Bundle)parcelable);
                        }
                    }
                }
                else {
                    if (!(value instanceof List)) {
                        continue;
                    }
                    final List<Object> list = (List<Object>)value;
                    for (int j = n2; j < list.size(); ++j) {
                        final Bundle value2 = list.get(j);
                        if (value2 instanceof Bundle) {
                            list.set(j, new Bundle((Bundle)value2));
                        }
                    }
                }
            }
        }
        super.a.b().w(new j6(this, s, s2, n, bundle, b, b2, b3, s3));
    }
    
    final void x(final String s, final String s2, final long n, final Object o) {
        super.a.b().w(new k6(this, s, s2, o, n));
    }
    
    final void y(final String newValue) {
        this.g.set(newValue);
    }
    
    public final void z(final Bundle bundle) {
        this.A(bundle, super.a.F().a());
    }
}
