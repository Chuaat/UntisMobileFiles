// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.u0;
import java.util.List;
import androidx.annotation.c1;
import android.os.Bundle;
import androidx.annotation.g0;
import com.google.android.gms.common.internal.x;
import androidx.annotation.j0;
import java.util.concurrent.ConcurrentHashMap;
import androidx.annotation.w;
import android.app.Activity;
import java.util.Map;
import com.google.android.gms.common.util.d0;

public final class t7 extends f4
{
    private volatile m7 c;
    private volatile m7 d;
    @d0
    protected m7 e;
    private final Map<Activity, m7> f;
    @w("activityLock")
    private Activity g;
    @w("activityLock")
    private volatile boolean h;
    private volatile m7 i;
    private m7 j;
    @w("activityLock")
    private boolean k;
    private final Object l;
    @w("this")
    private m7 m;
    @w("this")
    private String n;
    
    public t7(final z4 z4) {
        super(z4);
        this.l = new Object();
        this.f = new ConcurrentHashMap<Activity, m7>();
    }
    
    @g0
    private final m7 E(@j0 final Activity activity) {
        x.k(activity);
        m7 m7;
        if ((m7 = this.f.get(activity)) == null) {
            m7 = new m7(null, this.r(activity.getClass(), "Activity"), super.a.M().r0());
            this.f.put(activity, m7);
        }
        if (this.i != null) {
            return this.i;
        }
        return m7;
    }
    
    @g0
    private final void l(final Activity activity, m7 c, final boolean b) {
        m7 m7;
        if (this.c == null) {
            m7 = this.d;
        }
        else {
            m7 = this.c;
        }
        if (c.b == null) {
            String r;
            if (activity != null) {
                r = this.r(activity.getClass(), "Activity");
            }
            else {
                r = null;
            }
            c = new m7(c.a, r, c.c, c.e, c.f);
        }
        this.d = this.c;
        this.c = c;
        super.a.b().w(new o7(this, c, m7, super.a.F().d(), b));
    }
    
    @c1
    private final void m(final m7 m7, final m7 m8, final long b, final boolean b2, final Bundle bundle) {
        this.e();
        final int n = 0;
        final boolean b3 = m8 == null || m8.c != m7.c || !ga.Z(m8.b, m7.b) || !ga.Z(m8.a, m7.a);
        int n2 = n;
        if (b2) {
            n2 = n;
            if (this.e != null) {
                n2 = 1;
            }
        }
        if (b3) {
            Bundle bundle2;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            }
            else {
                bundle2 = new Bundle();
            }
            ga.u(m7, bundle2, true);
            if (m8 != null) {
                final String a = m8.a;
                if (a != null) {
                    bundle2.putString("_pn", a);
                }
                final String b4 = m8.b;
                if (b4 != null) {
                    bundle2.putString("_pc", b4);
                }
                bundle2.putLong("_pi", m8.c);
            }
            if (n2 != 0) {
                final h9 e = super.a.K().e;
                final long n3 = b - e.b;
                e.b = b;
                if (n3 > 0L) {
                    super.a.M().s(bundle2, n3);
                }
            }
            if (!super.a.w().A()) {
                bundle2.putLong("_mst", 1L);
            }
            String s;
            if (!m7.e) {
                s = "auto";
            }
            else {
                s = "app";
            }
            long a2 = super.a.F().a();
            if (m7.e) {
                final long f = m7.f;
                if (f != 0L) {
                    a2 = f;
                }
            }
            super.a.G().r(s, "_vs", a2, bundle2);
        }
        if (n2 != 0) {
            this.n(this.e, true, b);
        }
        this.e = m7;
        if (m7.e) {
            this.j = m7;
        }
        super.a.J().r(m7);
    }
    
    @c1
    private final void n(final m7 m7, final boolean b, final long n) {
        super.a.v().k(super.a.F().d());
        if (super.a.K().e.d(m7 != null && m7.d, b, n) && m7 != null) {
            m7.d = false;
        }
    }
    
    @g0
    public final void A(final Activity activity, final Bundle bundle) {
        if (!super.a.w().A()) {
            return;
        }
        if (bundle == null) {
            return;
        }
        final m7 m7 = this.f.get(activity);
        if (m7 == null) {
            return;
        }
        final Bundle bundle2 = new Bundle();
        bundle2.putLong("id", m7.c);
        bundle2.putString("name", m7.a);
        bundle2.putString("referrer_name", m7.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }
    
    @Deprecated
    public final void B(@j0 final Activity activity, @u0(max = 36L, min = 1L) final String s, @u0(max = 36L, min = 1L) String s2) {
        if (!super.a.w().A()) {
            super.a.c().u().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        final m7 c = this.c;
        if (c == null) {
            super.a.c().u().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f.get(activity) == null) {
            super.a.c().u().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        String r;
        if ((r = s2) == null) {
            r = this.r(activity.getClass(), "Activity");
        }
        final boolean z = ga.Z(c.b, r);
        final boolean z2 = ga.Z(c.a, s);
        if (z && z2) {
            super.a.c().u().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        Label_0219: {
            if (s != null) {
                if (s.length() > 0) {
                    final int length = s.length();
                    super.a.w();
                    if (length <= 100) {
                        break Label_0219;
                    }
                }
                super.a.c().u().b("Invalid screen name length in setCurrentScreen. Length", s.length());
                return;
            }
        }
        Label_0282: {
            if (r != null) {
                if (r.length() > 0) {
                    final int length2 = r.length();
                    super.a.w();
                    if (length2 <= 100) {
                        break Label_0282;
                    }
                }
                super.a.c().u().b("Invalid class name length in setCurrentScreen. Length", r.length());
                return;
            }
        }
        final l3 s3 = super.a.c().s();
        if (s == null) {
            s2 = "null";
        }
        else {
            s2 = s;
        }
        s3.c("Setting current screen to name, class", s2, r);
        final m7 m7 = new m7(s, r, super.a.M().r0());
        this.f.put(activity, m7);
        this.l(activity, m7, true);
    }
    
    public final void C(final Bundle bundle, long d) {
        Object d2 = this.l;
        synchronized (d2) {
            if (!this.k) {
                super.a.c().u().a("Cannot log screen view event when the app is in the background.");
                return;
            }
            final String string = bundle.getString("screen_name");
            Label_0108: {
                if (string != null) {
                    if (string.length() > 0) {
                        final int length = string.length();
                        super.a.w();
                        if (length <= 100) {
                            break Label_0108;
                        }
                    }
                    super.a.c().u().b("Invalid screen name length for screen view. Length", string.length());
                    return;
                }
            }
            String s = bundle.getString("screen_class");
            Label_0180: {
                if (s != null) {
                    if (s.length() > 0) {
                        final int length2 = s.length();
                        super.a.w();
                        if (length2 <= 100) {
                            break Label_0180;
                        }
                    }
                    super.a.c().u().b("Invalid screen class length for screen view. Length", s.length());
                    return;
                }
            }
            if (s == null) {
                final Activity g = this.g;
                if (g != null) {
                    s = this.r(g.getClass(), "Activity");
                }
                else {
                    s = "Activity";
                }
            }
            final m7 c = this.c;
            if (this.h && c != null) {
                this.h = false;
                final boolean z = ga.Z(c.b, s);
                final boolean z2 = ga.Z(c.a, string);
                if (z && z2) {
                    super.a.c().u().a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            // monitorexit(d2)
            final l3 s2 = super.a.c().s();
            if (string == null) {
                d2 = "null";
            }
            else {
                d2 = string;
            }
            String s3;
            if (s == null) {
                s3 = "null";
            }
            else {
                s3 = s;
            }
            s2.c("Logging screen view with name, class", d2, s3);
            if (this.c == null) {
                d2 = this.d;
            }
            else {
                d2 = this.c;
            }
            final m7 m7 = new m7(string, s, super.a.M().r0(), true, d);
            this.c = m7;
            this.d = (m7)d2;
            this.i = m7;
            d = super.a.F().d();
            super.a.b().w(new n7(this, bundle, m7, (m7)d2, d));
        }
    }
    
    @c1
    public final void D(final String s, final m7 m) {
        this.e();
        synchronized (this) {
            final String n = this.n;
            if (n == null || n.equals(s) || m != null) {
                this.n = s;
                this.m = m;
            }
        }
    }
    
    @Override
    protected final boolean k() {
        return false;
    }
    
    public final m7 p() {
        return this.c;
    }
    
    @c1
    public final m7 q(final boolean b) {
        this.f();
        this.e();
        if (!b) {
            return this.e;
        }
        final m7 e = this.e;
        if (e != null) {
            return e;
        }
        return this.j;
    }
    
    @d0
    final String r(final Class<?> clazz, String substring) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        final String[] split = canonicalName.split("\\.");
        final int length = split.length;
        String s;
        if (length > 0) {
            s = split[length - 1];
        }
        else {
            s = "";
        }
        final int length2 = s.length();
        super.a.w();
        substring = s;
        if (length2 > 100) {
            super.a.w();
            substring = s.substring(0, 100);
        }
        return substring;
    }
    
    @g0
    public final void w(final Activity activity, Bundle bundle) {
        if (!super.a.w().A()) {
            return;
        }
        if (bundle == null) {
            return;
        }
        bundle = bundle.getBundle("com.google.app_measurement.screen_service");
        if (bundle == null) {
            return;
        }
        this.f.put(activity, new m7(bundle.getString("name"), bundle.getString("referrer_name"), bundle.getLong("id")));
    }
    
    @g0
    public final void x(final Activity activity) {
        synchronized (this.l) {
            if (activity == this.g) {
                this.g = null;
            }
            // monitorexit(this.l)
            if (!super.a.w().A()) {
                return;
            }
            this.f.remove(activity);
        }
    }
    
    @g0
    public final void y(final Activity activity) {
        synchronized (this.l) {
            this.k = false;
            this.h = true;
            // monitorexit(this.l)
            final long d = super.a.F().d();
            if (!super.a.w().A()) {
                this.c = null;
                super.a.b().w(new q7(this, d));
                return;
            }
            final m7 e = this.E(activity);
            this.d = this.c;
            this.c = null;
            super.a.b().w(new r7(this, e, d));
        }
    }
    
    @g0
    public final void z(final Activity g) {
        synchronized (this.l) {
            this.k = true;
            if (g != this.g) {
                Object o = this.l;
                synchronized (o) {
                    this.g = g;
                    this.h = false;
                    // monitorexit(o)
                    if (super.a.w().A()) {
                        this.i = null;
                        o = super.a.b();
                        ((w4)o).w(new s7(this));
                    }
                }
            }
            // monitorexit(this.l)
            if (!super.a.w().A()) {
                this.c = this.i;
                super.a.b().w(new p7(this));
                return;
            }
            this.l(g, this.E(g), false);
            final d2 v = super.a.v();
            v.a.b().w(new com.google.android.gms.measurement.internal.c1(v, v.a.F().d()));
        }
    }
}
