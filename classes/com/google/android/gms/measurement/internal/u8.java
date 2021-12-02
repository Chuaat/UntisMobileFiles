// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences$Editor;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collection;
import com.google.android.gms.common.internal.x;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.gms.internal.measurement.i1;
import android.content.ServiceConnection;
import com.google.android.gms.common.stats.a;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.content.ComponentName;
import androidx.annotation.c1;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.common.util.d0;

@d0
public final class u8 extends f4
{
    private final t8 c;
    private d3 d;
    private volatile Boolean e;
    private final n f;
    private final k9 g;
    private final List<Runnable> h;
    private final n i;
    
    protected u8(final z4 z4) {
        super(z4);
        this.h = new ArrayList<Runnable>();
        this.g = new k9(z4.F());
        this.c = new t8(this);
        this.f = new d8(this, z4);
        this.i = new f8(this, z4);
    }
    
    @c1
    private final void A() {
        this.e();
        super.a.c().s().b("Processing queued up service tasks", this.h.size());
        for (final Runnable runnable : this.h) {
            try {
                runnable.run();
            }
            catch (RuntimeException ex) {
                super.a.c().o().b("Task exception while flushing queue", ex);
            }
        }
        this.h.clear();
        this.i.b();
    }
    
    @c1
    private final void B() {
        this.e();
        this.g.b();
        final n f = this.f;
        super.a.w();
        f.d(a3.K.a(null));
    }
    
    @c1
    private final void C(final Runnable runnable) throws IllegalStateException {
        this.e();
        if (this.w()) {
            runnable.run();
            return;
        }
        final int size = this.h.size();
        super.a.w();
        if (size >= 1000L) {
            super.a.c().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.h.add(runnable);
        this.i.d(60000L);
        this.O();
    }
    
    private final boolean D() {
        super.a.L();
        return true;
    }
    
    @c1
    private final na z(final boolean b) {
        super.a.L();
        final f3 y = super.a.y();
        String string;
        final String s = string = null;
        if (b) {
            final n3 c = super.a.c();
            if (c.a.C().d == null) {
                string = s;
            }
            else {
                final Pair<String, Long> a = c.a.C().d.a();
                string = s;
                if (a != null) {
                    if (a == c4.x) {
                        string = s;
                    }
                    else {
                        final String value = String.valueOf(a.second);
                        final String s2 = (String)a.first;
                        final StringBuilder sb = new StringBuilder(value.length() + 1 + String.valueOf(s2).length());
                        sb.append(value);
                        sb.append(":");
                        sb.append(s2);
                        string = sb.toString();
                    }
                }
            }
        }
        return y.n(string);
    }
    
    final Boolean H() {
        return this.e;
    }
    
    @c1
    protected final void N() {
        this.e();
        this.f();
        final na z = this.z(true);
        super.a.z().o();
        this.C(new a8(this, z));
    }
    
    @c1
    final void O() {
        this.e();
        this.f();
        if (this.w()) {
            return;
        }
        if (!this.y()) {
            if (!super.a.w().D()) {
                super.a.L();
                final List queryIntentServices = super.a.X().getPackageManager().queryIntentServices(new Intent().setClassName(super.a.X(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    final Intent intent = new Intent("com.google.android.gms.measurement.START");
                    final Context x = super.a.X();
                    super.a.L();
                    intent.setComponent(new ComponentName(x, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.c.b(intent);
                    return;
                }
                super.a.c().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
            return;
        }
        this.c.c();
    }
    
    @c1
    public final void P() {
        this.e();
        this.f();
        this.c.d();
        while (true) {
            try {
                com.google.android.gms.common.stats.a.b().c(super.a.X(), (ServiceConnection)this.c);
                this.d = null;
            }
            catch (IllegalStateException | IllegalArgumentException ex) {
                continue;
            }
            break;
        }
    }
    
    @c1
    public final void Q(final i1 i1) {
        this.e();
        this.f();
        this.C(new z7(this, this.z(false), i1));
    }
    
    @c1
    public final void R(final AtomicReference<String> atomicReference) {
        this.e();
        this.f();
        this.C(new y7(this, atomicReference, this.z(false)));
    }
    
    @c1
    protected final void S(final i1 i1, final String s, final String s2) {
        this.e();
        this.f();
        this.C(new m8(this, s, s2, this.z(false), i1));
    }
    
    @c1
    protected final void T(final AtomicReference<List<c>> atomicReference, final String s, final String s2, final String s3) {
        this.e();
        this.f();
        this.C(new l8(this, atomicReference, null, s2, s3, this.z(false)));
    }
    
    @c1
    protected final void U(final AtomicReference<List<ca>> atomicReference, final boolean b) {
        this.e();
        this.f();
        this.C(new w7(this, atomicReference, this.z(false), b));
    }
    
    @c1
    protected final void V(final i1 i1, final String s, final String s2, final boolean b) {
        this.e();
        this.f();
        this.C(new u7(this, s, s2, this.z(false), b, i1));
    }
    
    @c1
    protected final void W(final AtomicReference<List<ca>> atomicReference, final String s, final String s2, final String s3, final boolean b) {
        this.e();
        this.f();
        this.C(new n8(this, atomicReference, null, s2, s3, this.z(false), b));
    }
    
    @Override
    protected final boolean k() {
        return false;
    }
    
    @c1
    protected final void l(final u u, final String s) {
        x.k(u);
        this.e();
        this.f();
        this.D();
        this.C(new i8(this, true, this.z(true), super.a.z().s(u), u, s));
    }
    
    @c1
    public final void m(final i1 i1, final u u, final String s) {
        this.e();
        this.f();
        if (super.a.M().p0(12451000) != 0) {
            super.a.c().t().a("Not bundling data. Service unavailable or out of date");
            super.a.M().C(i1, new byte[0]);
            return;
        }
        this.C(new e8(this, u, s, i1));
    }
    
    @c1
    protected final void n() {
        this.e();
        this.f();
        final na z = this.z(false);
        this.D();
        super.a.z().n();
        this.C(new x7(this, z));
    }
    
    @c1
    @d0
    final void o(final d3 d3, final h2.a a, final na na) {
        this.e();
        this.f();
        this.D();
        super.a.w();
        for (int n = 0, size = 100; n < 1001 && size == 100; ++n) {
            final ArrayList<h2.a> list = new ArrayList<h2.a>();
            final List<h2.a> m = super.a.z().m(100);
            if (m != null) {
                list.addAll((Collection<?>)m);
                size = m.size();
            }
            else {
                size = 0;
            }
            if (a != null && size < 100) {
                list.add(a);
            }
            for (int size2 = list.size(), i = 0; i < size2; ++i) {
                final h2.a a2 = list.get(i);
                l3 l3 = null;
                String s = null;
                Label_0191: {
                    if (!(a2 instanceof u)) {
                        if (a2 instanceof ca) {
                            try {
                                d3.t2((ca)a2, na);
                                continue;
                            }
                            catch (RemoteException ex) {
                                l3 = super.a.c().o();
                                s = "Failed to send user property to the service";
                                break Label_0191;
                            }
                        }
                        if (a2 instanceof c) {
                            try {
                                d3.c0((c)a2, na);
                                continue;
                            }
                            catch (RemoteException ex) {
                                l3 = super.a.c().o();
                                s = "Failed to send conditional user property to the service";
                                break Label_0191;
                            }
                        }
                        super.a.c().o().a("Discarding data. Unrecognized parcel type.");
                        continue;
                    }
                    try {
                        d3.k1((u)a2, na);
                        continue;
                    }
                    catch (RemoteException ex) {
                        l3 = super.a.c().o();
                        s = "Failed to send event to the service";
                    }
                }
                final RemoteException ex;
                l3.b(s, ex);
            }
        }
    }
    
    @c1
    protected final void p(final c c) {
        x.k(c);
        this.e();
        this.f();
        super.a.L();
        this.C(new j8(this, true, this.z(true), super.a.z().r(c), new c(c), c));
    }
    
    @c1
    protected final void q(final boolean b) {
        this.e();
        this.f();
        if (b) {
            this.D();
            super.a.z().n();
        }
        if (this.x()) {
            this.C(new h8(this, this.z(false)));
        }
    }
    
    @c1
    protected final void r(final m7 m7) {
        this.e();
        this.f();
        this.C(new b8(this, m7));
    }
    
    @c1
    public final void s(final Bundle bundle) {
        this.e();
        this.f();
        this.C(new c8(this, this.z(false), bundle));
    }
    
    @c1
    protected final void t() {
        this.e();
        this.f();
        this.C(new g8(this, this.z(true)));
    }
    
    @c1
    @d0
    protected final void u(final d3 d) {
        this.e();
        x.k(d);
        this.d = d;
        this.B();
        this.A();
    }
    
    @c1
    protected final void v(final ca ca) {
        this.e();
        this.f();
        this.D();
        this.C(new v7(this, this.z(true), super.a.z().t(ca), ca));
    }
    
    @c1
    public final boolean w() {
        this.e();
        this.f();
        return this.d != null;
    }
    
    @c1
    final boolean x() {
        this.e();
        this.f();
        return !this.y() || super.a.M().o0() >= a3.q0.a(null);
    }
    
    @c1
    final boolean y() {
        this.e();
        this.f();
        if (this.e == null) {
            this.e();
            this.f();
            final c4 c = super.a.C();
            c.e();
            final boolean contains = c.l().contains("use_service");
            final boolean b = false;
            boolean b2 = false;
            Boolean value;
            if (!contains) {
                value = null;
            }
            else {
                value = c.l().getBoolean("use_service", false);
            }
            boolean b3 = true;
            final boolean b4 = true;
            final boolean b5 = true;
            if (value != null && value) {
                b2 = b4;
            }
            else {
                super.a.L();
                Label_0392: {
                    if (super.a.y().l() != 1) {
                        super.a.c().s().a("Checking service availability");
                        final int p0 = super.a.M().p0(12451000);
                        l3 l3 = null;
                        String s = null;
                        Label_0383: {
                            if (p0 != 0) {
                                if (p0 != 1) {
                                    Label_0285: {
                                        if (p0 != 2) {
                                            l3 l4;
                                            String s2;
                                            if (p0 != 3) {
                                                if (p0 != 9) {
                                                    if (p0 != 18) {
                                                        super.a.c().t().b("Unexpected service status", p0);
                                                        break Label_0285;
                                                    }
                                                    l3 = super.a.c().t();
                                                    s = "Service updating";
                                                    break Label_0383;
                                                }
                                                else {
                                                    l4 = super.a.c().t();
                                                    s2 = "Service invalid";
                                                }
                                            }
                                            else {
                                                l4 = super.a.c().t();
                                                s2 = "Service disabled";
                                            }
                                            l4.a(s2);
                                        }
                                        else {
                                            super.a.c().n().a("Service container out of date");
                                            if (super.a.M().o0() < 17443) {
                                                b2 = b;
                                                break Label_0392;
                                            }
                                            b2 = (value == null && b5);
                                        }
                                    }
                                    b3 = false;
                                    break Label_0392;
                                }
                                super.a.c().s().a("Service missing");
                                b2 = b;
                                break Label_0392;
                            }
                            else {
                                l3 = super.a.c().s();
                                s = "Service available";
                            }
                        }
                        l3.a(s);
                    }
                    b2 = true;
                }
                if (!b2 && super.a.w().D()) {
                    super.a.c().o().a("No way to upload. Consider using the full version of Analytics");
                }
                else if (b3) {
                    final c4 c2 = super.a.C();
                    c2.e();
                    final SharedPreferences$Editor edit = c2.l().edit();
                    edit.putBoolean("use_service", b2);
                    edit.apply();
                }
            }
            this.e = b2;
        }
        return this.e;
    }
}
