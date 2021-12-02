// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.k;
import java.util.HashMap;
import com.google.android.gms.common.api.t;
import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.w0;
import com.google.android.gms.signin.internal.n;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import com.google.android.gms.common.api.Scope;
import java.util.HashSet;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.Map;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.signin.e;
import com.google.android.gms.common.api.a;
import java.util.Set;
import android.os.Bundle;
import androidx.annotation.k0;
import com.google.android.gms.common.c;
import com.google.android.gms.common.h;
import android.content.Context;
import java.util.concurrent.locks.Lock;

public final class h0 implements c1
{
    private final b1 a;
    private final Lock b;
    private final Context c;
    private final h d;
    @k0
    private c e;
    private int f;
    private int g;
    private int h;
    private final Bundle i;
    private final Set<a.c> j;
    @k0
    private e k;
    private boolean l;
    private boolean m;
    private boolean n;
    @k0
    private p o;
    private boolean p;
    private boolean q;
    @k0
    private final g r;
    private final Map<a<?>, Boolean> s;
    @k0
    private final a.a<? extends e, com.google.android.gms.signin.a> t;
    private ArrayList<Future<?>> u;
    
    public h0(final b1 a, @k0 final g r, final Map<a<?>, Boolean> s, final h d, @k0 final a.a<? extends e, com.google.android.gms.signin.a> t, final Lock b, final Context c) {
        this.g = 0;
        this.i = new Bundle();
        this.j = new HashSet<a.c>();
        this.u = new ArrayList<Future<?>>();
        this.a = a;
        this.r = r;
        this.s = s;
        this.d = d;
        this.t = t;
        this.b = b;
        this.c = c;
    }
    
    private final void B() {
        final ArrayList<Future<?>> u = this.u;
        final int size = u.size();
        int i = 0;
        while (i < size) {
            final Future<?> value = u.get(i);
            ++i;
            value.cancel(true);
        }
        this.u.clear();
    }
    
    private final Set<Scope> D() {
        if (this.r == null) {
            return Collections.emptySet();
        }
        final HashSet<Object> set = (HashSet<Object>)new HashSet<Scope>(this.r.i());
        final Map<a<?>, g.b> k = this.r.k();
        for (final a<?> a : k.keySet()) {
            if (!this.a.k.containsKey(a.c())) {
                set.addAll(((g.b)k.get(a)).a);
            }
        }
        return (Set<Scope>)set;
    }
    
    @d6.a("mLock")
    private final void g(final n n) {
        if (!this.o(0)) {
            return;
        }
        final c m = n.M();
        if (m.j2()) {
            final w0 w0 = x.k(n.g1());
            final c g1 = w0.g1();
            if (!g1.j2()) {
                final String value = String.valueOf(g1);
                final StringBuilder sb = new StringBuilder(value.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(value);
                Log.wtf("GACConnecting", sb.toString(), (Throwable)new Exception());
                this.m(g1);
                return;
            }
            this.n = true;
            this.o = x.k(w0.M());
            this.p = w0.q1();
            this.q = w0.Q1();
            this.u();
        }
        else {
            if (this.j(m)) {
                this.z();
                this.u();
                return;
            }
            this.m(m);
        }
    }
    
    @d6.a("mLock")
    private final void i(final boolean b) {
        final e k = this.k;
        if (k != null) {
            if (((a.f)k).a() && b) {
                k.b();
            }
            ((a.f)k).d();
            final g g = x.k(this.r);
            this.o = null;
        }
    }
    
    @d6.a("mLock")
    private final boolean j(final c c) {
        return this.l && !c.Q1();
    }
    
    @d6.a("mLock")
    private final void m(final c c) {
        this.B();
        this.i(c.Q1() ^ true);
        this.a.l(c);
        this.a.s.a(c);
    }
    
    @d6.a("mLock")
    private final void n(final c e, final a<?> a, final boolean b) {
        final int b2 = a.a().b();
        final boolean b3 = false;
        int n = 0;
        Label_0081: {
            if (b) {
                final boolean b4 = e.Q1() || this.d.d(e.M()) != null;
                n = (b3 ? 1 : 0);
                if (!b4) {
                    break Label_0081;
                }
            }
            if (this.e != null) {
                n = (b3 ? 1 : 0);
                if (b2 >= this.f) {
                    break Label_0081;
                }
            }
            n = 1;
        }
        if (n != 0) {
            this.e = e;
            this.f = b2;
        }
        this.a.k.put(a.c(), e);
    }
    
    @d6.a("mLock")
    private final boolean o(final int n) {
        if (this.g != n) {
            Log.w("GACConnecting", this.a.r.T());
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(value.length() + 23);
            sb.append("Unexpected callback in ");
            sb.append(value);
            Log.w("GACConnecting", sb.toString());
            final int h = this.h;
            final StringBuilder sb2 = new StringBuilder(33);
            sb2.append("mRemainingConnections=");
            sb2.append(h);
            Log.w("GACConnecting", sb2.toString());
            final String q = q(this.g);
            final String q2 = q(n);
            final StringBuilder sb3 = new StringBuilder(String.valueOf(q).length() + 70 + String.valueOf(q2).length());
            sb3.append("GoogleApiClient connecting is in step ");
            sb3.append(q);
            sb3.append(" but received callback for step ");
            sb3.append(q2);
            Log.e("GACConnecting", sb3.toString(), (Throwable)new Exception());
            this.m(new c(8, null));
            return false;
        }
        return true;
    }
    
    private static String q(final int n) {
        if (n == 0) {
            return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        }
        if (n != 1) {
            return "UNKNOWN";
        }
        return "STEP_GETTING_REMOTE_SERVICE";
    }
    
    @d6.a("mLock")
    private final boolean t() {
        final int h = this.h - 1;
        this.h = h;
        if (h > 0) {
            return false;
        }
        c e;
        if (h < 0) {
            Log.w("GACConnecting", this.a.r.T());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", (Throwable)new Exception());
            e = new c(8, null);
        }
        else {
            e = this.e;
            if (e == null) {
                return true;
            }
            this.a.q = this.f;
        }
        this.m(e);
        return false;
    }
    
    @d6.a("mLock")
    private final void u() {
        if (this.h != 0) {
            return;
        }
        if (!this.m || this.n) {
            final ArrayList<a.f> list = new ArrayList<a.f>();
            this.g = 1;
            this.h = this.a.j.size();
            for (final a.c c : this.a.j.keySet()) {
                if (this.a.k.containsKey(c)) {
                    if (!this.t()) {
                        continue;
                    }
                    this.x();
                }
                else {
                    list.add(this.a.j.get(c));
                }
            }
            if (!list.isEmpty()) {
                this.u.add(g1.a().submit(new n0(list)));
            }
        }
    }
    
    @d6.a("mLock")
    private final void x() {
        this.a.q();
        g1.a().execute(new com.google.android.gms.common.api.internal.k0(this));
        final e k = this.k;
        if (k != null) {
            if (this.p) {
                k.e(x.k(this.o), this.q);
            }
            this.i(false);
        }
        final Iterator<a.c<?>> iterator = this.a.k.keySet().iterator();
        while (iterator.hasNext()) {
            x.k(this.a.j.get((a.c)iterator.next())).d();
        }
        Bundle i;
        if (this.i.isEmpty()) {
            i = null;
        }
        else {
            i = this.i;
        }
        this.a.s.J(i);
    }
    
    @d6.a("mLock")
    private final void z() {
        this.m = false;
        this.a.r.s = Collections.emptySet();
        for (final a.c c : this.j) {
            if (!this.a.k.containsKey(c)) {
                this.a.k.put(c, new c(17, null));
            }
        }
    }
    
    @d6.a("mLock")
    @Override
    public final void H(final c c, final a<?> a, final boolean b) {
        if (!this.o(1)) {
            return;
        }
        this.n(c, a, b);
        if (this.t()) {
            this.x();
        }
    }
    
    @Override
    public final void I() {
    }
    
    @d6.a("mLock")
    @Override
    public final void J(@k0 final Bundle bundle) {
        if (!this.o(1)) {
            return;
        }
        if (bundle != null) {
            this.i.putAll(bundle);
        }
        if (this.t()) {
            this.x();
        }
    }
    
    @Override
    public final <A extends a.b, R extends t, T extends com.google.android.gms.common.api.internal.e.a<R, A>> T K(final T t) {
        this.a.r.k.add(t);
        return t;
    }
    
    @Override
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.e.a<? extends t, A>> T L(final T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
    
    @d6.a("mLock")
    @Override
    public final void b() {
        this.a.k.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        final HashMap<a.f, j0> hashMap = new HashMap<a.f, j0>();
        final Iterator<a<?>> iterator = this.s.keySet().iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final a<?> a = iterator.next();
            final a.f f = x.k(this.a.j.get(a.c()));
            b |= (a.a().b() == 1);
            final boolean booleanValue = this.s.get(a);
            if (f.w()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add((a.c)a.c());
                }
                else {
                    this.l = false;
                }
            }
            hashMap.put(f, new j0(this, a, booleanValue));
        }
        if (b) {
            this.m = false;
        }
        if (this.m) {
            x.k(this.r);
            x.k(this.t);
            this.r.l(System.identityHashCode(this.a.r));
            final s0 s0 = new s0(this, null);
            final a.a<? extends e, com.google.android.gms.signin.a> t = this.t;
            final Context c = this.c;
            final Looper q = this.a.r.q();
            final g r = this.r;
            this.k = (e)t.c(c, q, r, r.n(), s0, s0);
        }
        this.h = this.a.j.size();
        this.u.add(g1.a().submit(new m0(hashMap)));
    }
    
    @d6.a("mLock")
    @Override
    public final boolean f() {
        this.B();
        this.i(true);
        this.a.l(null);
        return true;
    }
    
    @d6.a("mLock")
    @Override
    public final void h(final int n) {
        this.m(new c(8, null));
    }
}
