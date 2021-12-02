// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics;

import androidx.annotation.k0;
import java.util.concurrent.ExecutorService;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.tasks.p;
import java.util.concurrent.Callable;
import com.google.android.gms.tasks.m;
import com.google.android.gms.tasks.c;
import java.util.concurrent.Executor;
import d3.b;
import com.google.firebase.crashlytics.internal.common.g;
import com.google.firebase.crashlytics.internal.common.u;
import com.google.firebase.crashlytics.internal.common.w;
import com.google.firebase.crashlytics.internal.common.s;
import com.google.firebase.crashlytics.internal.f;
import n3.a;
import com.google.firebase.installations.j;
import java.util.Objects;
import com.google.firebase.e;
import androidx.annotation.j0;
import androidx.annotation.b1;
import com.google.firebase.crashlytics.internal.common.l;

public class i
{
    static final String b = "clx";
    static final String c = "crash";
    static final int d = 500;
    @b1
    final l a;
    
    private i(@j0 final l a) {
        this.a = a;
    }
    
    @j0
    public static i d() {
        final i obj = e.o().k(i.class);
        Objects.requireNonNull(obj, "FirebaseCrashlytics component is not present.");
        return obj;
    }
    
    @k0
    static i e(@j0 final e e, @j0 final j j, @j0 final a<com.google.firebase.crashlytics.internal.a> a, @j0 final a<com.google.firebase.analytics.connector.a> a2) {
        final Context m = e.m();
        final String packageName = m.getPackageName();
        final f f = com.google.firebase.crashlytics.internal.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Initializing Firebase Crashlytics ");
        sb.append(l.m());
        sb.append(" for ");
        sb.append(packageName);
        f.g(sb.toString());
        final s s = new s(e);
        final w w = new w(m, packageName, j, s);
        final com.google.firebase.crashlytics.internal.e e2 = new com.google.firebase.crashlytics.internal.e(a);
        final d d = new d(a2);
        final l l = new l(e, w, e2, s, d.e(), d.d(), u.c("Crashlytics Exception Handler"));
        final String i = e.r().j();
        final String o = g.o(m);
        final f f2 = com.google.firebase.crashlytics.internal.f.f();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Mapping file ID is: ");
        sb2.append(o);
        f2.b(sb2.toString());
        final d3.a a3 = new d3.a(m);
        try {
            final com.google.firebase.crashlytics.internal.common.a a4 = com.google.firebase.crashlytics.internal.common.a.a(m, w, i, o, (b)a3);
            final f f3 = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Installer package name is: ");
            sb3.append(a4.c);
            f3.k(sb3.toString());
            final ExecutorService c = u.c("com.google.firebase.crashlytics.startup");
            final com.google.firebase.crashlytics.internal.settings.d k = com.google.firebase.crashlytics.internal.settings.d.l(m, i, w, new a3.b(), a4.e, a4.f, s);
            k.p((Executor)c).n(c, new c<Void, Object>() {
                @Override
                public Object a(@j0 final m<Void> m) throws Exception {
                    if (!m.v()) {
                        com.google.firebase.crashlytics.internal.f.f().e("Error fetching settings.", m.q());
                    }
                    return null;
                }
            });
            p.d(c, (Callable<Object>)new Callable<Void>() {
                final /* synthetic */ boolean G = l.s(a4, (com.google.firebase.crashlytics.internal.settings.e)k);
                
                public Void a() throws Exception {
                    if (this.G) {
                        l.j((com.google.firebase.crashlytics.internal.settings.e)k);
                    }
                    return null;
                }
            });
            return new i(l);
        }
        catch (PackageManager$NameNotFoundException ex) {
            com.google.firebase.crashlytics.internal.f.f().e("Error retrieving app package info.", (Throwable)ex);
            return null;
        }
    }
    
    @j0
    public m<Boolean> a() {
        return this.a.e();
    }
    
    public void b() {
        this.a.f();
    }
    
    public boolean c() {
        return this.a.g();
    }
    
    public void f(@j0 final String s) {
        this.a.o(s);
    }
    
    public void g(@j0 final Throwable t) {
        if (t == null) {
            f.f().m("A null value was passed to recordException. Ignoring.");
            return;
        }
        this.a.p(t);
    }
    
    public void h() {
        this.a.t();
    }
    
    public void i(@k0 final Boolean b) {
        this.a.u(b);
    }
    
    public void j(final boolean b) {
        this.a.u(b);
    }
    
    public void k(@j0 final String s, final double d) {
        this.a.v(s, Double.toString(d));
    }
    
    public void l(@j0 final String s, final float f) {
        this.a.v(s, Float.toString(f));
    }
    
    public void m(@j0 final String s, final int i) {
        this.a.v(s, Integer.toString(i));
    }
    
    public void n(@j0 final String s, final long i) {
        this.a.v(s, Long.toString(i));
    }
    
    public void o(@j0 final String s, @j0 final String s2) {
        this.a.v(s, s2);
    }
    
    public void p(@j0 final String s, final boolean b) {
        this.a.v(s, Boolean.toString(b));
    }
    
    public void q(@j0 final h h) {
        this.a.w(h.a);
    }
    
    public void r(@j0 final String s) {
        this.a.y(s);
    }
}
