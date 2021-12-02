// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.concurrent.Future;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.android.gms.common.util.d0;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Callable;
import java.util.List;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import android.os.Bundle;
import java.util.Map;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.bf;
import com.google.android.gms.common.l;
import com.google.android.gms.common.m;
import com.google.android.gms.common.util.c0;
import android.os.Binder;
import android.text.TextUtils;
import androidx.annotation.g;
import com.google.android.gms.common.internal.x;

public final class s5 extends c3
{
    private final z9 e;
    private Boolean f;
    private String g;
    
    public s5(final z9 e, final String s) {
        x.k(e);
        this.e = e;
        this.g = null;
    }
    
    @g
    private final void F2(final na na, final boolean b) {
        x.k(na);
        x.g(na.G);
        this.x2(na.G, false);
        this.e.g0().I(na.H, na.W, na.a0);
    }
    
    @g
    private final void x2(final String g, final boolean b) {
        if (!TextUtils.isEmpty((CharSequence)g)) {
            Label_0093: {
                if (!b) {
                    break Label_0093;
                }
                try {
                    if (this.f == null) {
                        this.f = ("com.google.android.gms".equals(this.g) || c0.a(this.e.X(), Binder.getCallingUid()) || m.a(this.e.X()).d(Binder.getCallingUid()));
                    }
                    if (!this.f) {
                        if (this.g == null && l.t(this.e.X(), Binder.getCallingUid(), g)) {
                            this.g = g;
                        }
                        if (!g.equals(this.g)) {
                            throw new SecurityException(String.format("Unknown calling package name '%s'.", g));
                        }
                    }
                    return;
                }
                catch (SecurityException ex) {
                    this.e.c().o().b("Measurement Service called with invalid calling package. appId", n3.w(g));
                    throw ex;
                }
            }
        }
        this.e.c().o().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }
    
    private final void y2(final u u, final na na) {
        this.e.a();
        this.e.f(u, na);
    }
    
    final void C2(u iterator, final na na) {
        if (!this.e.Z().r(na.G)) {
            this.y2(iterator, na);
            return;
        }
        this.e.c().s().b("EES config found for", na.G);
        final q4 z = this.e.Z();
        final String g = na.G;
        bf.b();
        final com.google.android.gms.measurement.internal.g w = z.a.w();
        final z2<Boolean> x0 = a3.x0;
        c1 c2;
        final c1 c1 = c2 = null;
        if (w.y(null, x0)) {
            if (TextUtils.isEmpty((CharSequence)g)) {
                c2 = c1;
            }
            else {
                c2 = z.i.f(g);
            }
        }
        l3 l3;
        String s2;
        String s3;
        if (c2 != null) {
            try {
                final Map<String, Object> i = ba.I(iterator.H.g1(), true);
                String s;
                if ((s = x5.a(iterator.G)) == null) {
                    s = iterator.G;
                }
                if (c2.e(new b(s, iterator.J, i))) {
                    u y = iterator;
                    if (c2.g()) {
                        this.e.c().s().b("EES edited event", iterator.G);
                        y = ba.y(c2.a().b());
                    }
                    this.y2(y, na);
                    if (c2.f()) {
                        iterator = (u)c2.a().c().iterator();
                        while (((Iterator)iterator).hasNext()) {
                            final b b = ((Iterator<b>)iterator).next();
                            this.e.c().s().b("EES logging created event", b.d());
                            this.y2(ba.y(b), na);
                        }
                    }
                    return;
                }
            }
            catch (d2 d2) {
                this.e.c().o().c("EES error. appId, eventName", na.H, iterator.G);
            }
            l3 = this.e.c().s();
            s2 = iterator.G;
            s3 = "EES was not applied to event";
        }
        else {
            l3 = this.e.c().s();
            s2 = na.G;
            s3 = "EES not loaded for";
        }
        l3.b(s3, s2);
        this.y2(iterator, na);
    }
    
    @g
    @Override
    public final void D0(final c c) {
        x.k(c);
        x.k(c.I);
        x.g(c.G);
        this.x2(c.G, true);
        this.E2(new c5(this, new c(c)));
    }
    
    @g
    @Override
    public final List<c> E0(String p3, final String s, final String s2) {
        this.x2((String)p3, true);
        p3 = (ExecutionException)this.e.b().p((Callable<Object>)new g5(this, (String)p3, s, s2));
        try {
            p3 = (ExecutionException)((Future<List<?>>)p3).get();
            return (List<c>)p3;
        }
        catch (ExecutionException p3) {}
        catch (InterruptedException ex) {}
        this.e.c().o().b("Failed to get conditional user properties as", p3);
        return Collections.emptyList();
    }
    
    @d0
    final void E2(final Runnable runnable) {
        x.k(runnable);
        if (this.e.b().z()) {
            runnable.run();
            return;
        }
        this.e.b().w(runnable);
    }
    
    @g
    @Override
    public final byte[] L0(final u u, final String s) {
        x.g(s);
        x.k(u);
        this.x2(s, true);
        this.e.c().n().b("Log and bundle. event", this.e.V().n(u.G));
        final long n = this.e.F().b() / 1000000L;
        Object q = this.e.b().q((Callable<byte[]>)new n5(this, u, s));
        try {
            if ((q = ((Future<byte[]>)q).get()) == null) {
                this.e.c().o().b("Log and bundle returned null. appId", n3.w(s));
                q = new byte[0];
            }
            this.e.c().n().d("Log and bundle processed. event, size, time_ms", this.e.V().n(u.G), ((Future<byte[]>)q).length, this.e.F().b() / 1000000L - n);
            return (byte[])q;
        }
        catch (ExecutionException q) {}
        catch (InterruptedException ex) {}
        this.e.c().o().d("Failed to log and bundle. appId, event, error", n3.w(s), this.e.V().n(u.G), q);
        return null;
    }
    
    @g
    @Override
    public final void U0(final na na) {
        this.F2(na, false);
        this.E2(new q5(this, na));
    }
    
    @g
    @Override
    public final List<c> W0(String p3, final String s, final na na) {
        this.F2(na, false);
        final String g = na.G;
        x.k(g);
        p3 = (ExecutionException)this.e.b().p((Callable<Object>)new f5(this, g, (String)p3, s));
        try {
            p3 = (ExecutionException)((Future<List<?>>)p3).get();
            return (List<c>)p3;
        }
        catch (ExecutionException p3) {}
        catch (InterruptedException ex) {}
        this.e.c().o().b("Failed to get conditional user properties", p3);
        return Collections.emptyList();
    }
    
    @g
    @Override
    public final List<ca> W1(final na na, final boolean b) {
        this.F2(na, false);
        final String g = na.G;
        x.k(g);
        Object p2 = this.e.b().p((Callable<List<ea>>)new p5(this, g));
        try {
            final List<ea> list = ((Future<List<ea>>)p2).get();
            p2 = new ArrayList<List<ea>>(list.size());
            for (final ea ea : list) {
                if (b || !ga.U(ea.c)) {
                    ((List<List<ea>>)p2).add((List<ea>)new ca(ea));
                }
            }
            return (List<ca>)p2;
        }
        catch (ExecutionException p2) {}
        catch (InterruptedException ex) {}
        this.e.c().o().c("Failed to get user properties. appId", n3.w(na.G), p2);
        return null;
    }
    
    @g
    @Override
    public final void X(final Bundle bundle, final na na) {
        this.F2(na, false);
        final String g = na.G;
        x.k(g);
        this.E2(new a5(this, g, bundle));
    }
    
    @g
    @Override
    public final void b1(final na na) {
        this.F2(na, false);
        this.E2(new j5(this, na));
    }
    
    @g
    @Override
    public final void c0(c c, final na na) {
        x.k(c);
        x.k(c.I);
        this.F2(na, false);
        c = new c(c);
        c.G = na.G;
        this.E2(new b5(this, c, na));
    }
    
    @g
    @Override
    public final void c2(final u u, final String s, final String s2) {
        x.k(u);
        x.g(s);
        this.x2(s, true);
        this.E2(new m5(this, u, s));
    }
    
    @g
    @Override
    public final List<ca> i0(final String s, String p4, final String s2, final boolean b) {
        this.x2(s, true);
        p4 = (ExecutionException)this.e.b().p((Callable<Object>)new e5(this, s, (String)p4, s2));
        try {
            final List<ea> list = ((Future<List<ea>>)p4).get();
            p4 = (ExecutionException)new ArrayList(list.size());
            for (final ea ea : list) {
                if (b || !ga.U(ea.c)) {
                    ((List<ca>)p4).add(new ca(ea));
                }
            }
            return (List<ca>)p4;
        }
        catch (ExecutionException p4) {}
        catch (InterruptedException ex) {}
        this.e.c().o().c("Failed to get user properties as. appId", n3.w(s), p4);
        return Collections.emptyList();
    }
    
    @g
    @Override
    public final void k1(final u u, final na na) {
        x.k(u);
        this.F2(na, false);
        this.E2(new l5(this, u, na));
    }
    
    @g
    @Override
    public final void l0(final na na) {
        x.g(na.G);
        this.x2(na.G, false);
        this.E2(new i5(this, na));
    }
    
    @g
    @Override
    public final void q1(final na na) {
        x.g(na.G);
        x.k(na.b0);
        final k5 k5 = new k5(this, na);
        x.k(k5);
        if (this.e.b().z()) {
            k5.run();
            return;
        }
        this.e.b().x(k5);
    }
    
    @g
    @Override
    public final void s1(final long n, final String s, final String s2, final String s3) {
        this.E2(new r5(this, s2, s3, s, n));
    }
    
    @g
    @Override
    public final void t2(final ca ca, final na na) {
        x.k(ca);
        this.F2(na, false);
        this.E2(new o5(this, ca, na));
    }
    
    @g
    @Override
    public final List<ca> u1(String p4, final String s, final boolean b, final na na) {
        this.F2(na, false);
        final String g = na.G;
        x.k(g);
        p4 = (ExecutionException)this.e.b().p((Callable<Object>)new d5(this, g, (String)p4, s));
        try {
            final List<ea> list = ((Future<List<ea>>)p4).get();
            p4 = (ExecutionException)new ArrayList(list.size());
            for (final ea ea : list) {
                if (b || !ga.U(ea.c)) {
                    ((List<ca>)p4).add(new ca(ea));
                }
            }
            return (List<ca>)p4;
        }
        catch (ExecutionException p4) {}
        catch (InterruptedException ex) {}
        this.e.c().o().c("Failed to query user properties. appId", n3.w(na.G), p4);
        return Collections.emptyList();
    }
    
    @g
    @Override
    public final String x0(final na na) {
        this.F2(na, false);
        return this.e.i0(na);
    }
    
    @d0
    final u z2(final u u, final na na) {
        if ("_cmp".equals(u.G)) {
            final s h = u.H;
            if (h != null) {
                if (h.zza() != 0) {
                    final String n2 = u.H.N2("_cis");
                    if ("referrer broadcast".equals(n2) || "referrer API".equals(n2)) {
                        this.e.c().r().b("Event has been filtered ", u.toString());
                        return new u("_cmpx", u.H, u.I, u.J);
                    }
                }
            }
        }
        return u;
    }
}
