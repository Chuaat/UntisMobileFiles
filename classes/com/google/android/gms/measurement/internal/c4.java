// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.ads.identifier.a;
import com.google.android.gms.common.internal.x;
import androidx.annotation.c1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull$List;
import android.content.SharedPreferences$Editor;
import android.os.Bundle;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.d0;
import android.util.Pair;

final class c4 extends u5
{
    @d0
    static final Pair<String, Long> x;
    private SharedPreferences c;
    public a4 d;
    public final y3 e;
    public final y3 f;
    public final b4 g;
    private String h;
    private boolean i;
    private long j;
    public final y3 k;
    public final w3 l;
    public final b4 m;
    public final w3 n;
    public final y3 o;
    public boolean p;
    public final w3 q;
    public final w3 r;
    public final y3 s;
    public final b4 t;
    public final b4 u;
    public final y3 v;
    public final x3 w;
    
    static {
        x = new Pair((Object)"", (Object)0L);
    }
    
    c4(final z4 z4) {
        super(z4);
        this.k = new y3(this, "session_timeout", 1800000L);
        this.l = new w3(this, "start_new_session", true);
        this.o = new y3(this, "last_pause_time", 0L);
        this.m = new b4(this, "non_personalized_ads", null);
        this.n = new w3(this, "allow_remote_dynamite", false);
        this.e = new y3(this, "first_open_time", 0L);
        this.f = new y3(this, "app_install_time", 0L);
        this.g = new b4(this, "app_instance_id", null);
        this.q = new w3(this, "app_backgrounded", false);
        this.r = new w3(this, "deep_link_retrieval_complete", false);
        this.s = new y3(this, "deep_link_retrieval_attempts", 0L);
        this.t = new b4(this, "firebase_feature_rollouts", null);
        this.u = new b4(this, "deferred_attribution_cache", null);
        this.v = new y3(this, "deferred_attribution_cache_timestamp", 0L);
        this.w = new x3(this, "default_event_parameters", null);
    }
    
    @EnsuresNonNull$List({ @EnsuresNonNull({ "this.preferences" }), @EnsuresNonNull({ "this.monitoringSample" }) })
    @c1
    @Override
    protected final void f() {
        final SharedPreferences sharedPreferences = super.a.X().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        if (!(this.p = sharedPreferences.getBoolean("has_been_opened", false))) {
            final SharedPreferences$Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        super.a.w();
        this.d = new a4(this, "health_monitor", Math.max(0L, a3.d.a(null)), null);
    }
    
    @Override
    protected final boolean g() {
        return true;
    }
    
    @c1
    @d0
    protected final SharedPreferences l() {
        this.e();
        this.h();
        com.google.android.gms.common.internal.x.k(this.c);
        return this.c;
    }
    
    @c1
    final Pair<String, Boolean> m(final String s) {
        this.e();
        final long d = super.a.F().d();
        final String h = this.h;
        if (h != null && d < this.j) {
            return (Pair<String, Boolean>)new Pair((Object)h, (Object)this.i);
        }
        this.j = d + super.a.w().o(s, a3.c);
        com.google.android.gms.ads.identifier.a.e(true);
        try {
            final a.a b = com.google.android.gms.ads.identifier.a.b(super.a.X());
            this.h = "";
            final String a = b.a();
            if (a != null) {
                this.h = a;
            }
            this.i = b.b();
        }
        catch (Exception ex) {
            super.a.c().n().b("Unable to get advertising id", ex);
            this.h = "";
        }
        com.google.android.gms.ads.identifier.a.e(false);
        return (Pair<String, Boolean>)new Pair((Object)this.h, (Object)this.i);
    }
    
    @c1
    final h n() {
        this.e();
        return com.google.android.gms.measurement.internal.h.b(this.l().getString("consent_settings", "G1"));
    }
    
    @c1
    final Boolean o() {
        this.e();
        if (this.l().contains("measurement_enabled")) {
            return this.l().getBoolean("measurement_enabled", true);
        }
        return null;
    }
    
    @c1
    final void p(final Boolean b) {
        this.e();
        final SharedPreferences$Editor edit = this.l().edit();
        if (b != null) {
            edit.putBoolean("measurement_enabled", (boolean)b);
        }
        else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }
    
    @c1
    final void q(final boolean b) {
        this.e();
        super.a.c().s().b("App measurement setting deferred collection", b);
        final SharedPreferences$Editor edit = this.l().edit();
        edit.putBoolean("deferred_analytics_collection", b);
        edit.apply();
    }
    
    @c1
    final boolean r() {
        final SharedPreferences c = this.c;
        return c != null && c.contains("deferred_analytics_collection");
    }
    
    final boolean s(final long n) {
        return n - this.k.a() > this.o.a();
    }
    
    @c1
    final boolean t(final int n) {
        return com.google.android.gms.measurement.internal.h.l(n, this.l().getInt("consent_source", 100));
    }
}
