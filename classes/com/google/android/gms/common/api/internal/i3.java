// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import java.util.concurrent.TimeUnit;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.internal.base.p;
import com.google.android.gms.common.api.Status;
import androidx.annotation.j0;
import com.google.android.gms.common.api.t;
import android.app.PendingIntent;
import com.google.android.gms.common.internal.x;
import android.util.Log;
import java.util.Iterator;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.ArrayList;
import com.google.android.gms.signin.e;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.h;
import java.util.concurrent.locks.Lock;
import com.google.android.gms.common.c;
import android.os.Bundle;
import androidx.annotation.k0;
import java.util.Set;
import com.google.android.gms.common.api.a;
import java.util.Map;
import android.os.Looper;
import android.content.Context;

final class i3 implements s1
{
    private final Context e;
    private final t0 f;
    private final Looper g;
    private final b1 h;
    private final b1 i;
    private final Map<a.c<?>, b1> j;
    private final Set<w> k;
    @k0
    private final a.f l;
    @k0
    private Bundle m;
    @k0
    private c n;
    @k0
    private c o;
    private boolean p;
    private final Lock q;
    @d6.a("mLock")
    private int r;
    
    private i3(final Context e, final t0 f, final Lock q, final Looper g, final h h, final Map<a.c<?>, a.f> map, final Map<a.c<?>, a.f> map2, final g g2, final a.a<? extends e, com.google.android.gms.signin.a> a, @k0 final a.f l, final ArrayList<h3> list, final ArrayList<h3> list2, final Map<a<?>, Boolean> map3, final Map<a<?>, Boolean> map4) {
        this.k = Collections.newSetFromMap(new WeakHashMap<w, Boolean>());
        this.n = null;
        this.o = null;
        this.p = false;
        this.r = 0;
        this.e = e;
        this.f = f;
        this.q = q;
        this.g = g;
        this.l = l;
        this.h = new b1(e, f, q, g, h, map2, null, map4, null, list2, new k3(this, null));
        this.i = new b1(e, f, q, g, h, map, g2, map3, a, list, new m3(this, null));
        final androidx.collection.a<a.c<?>, b1> m = new androidx.collection.a<a.c<?>, b1>();
        final Iterator<a.c<?>> iterator = map2.keySet().iterator();
        while (iterator.hasNext()) {
            m.put((a.c<?>)iterator.next(), this.h);
        }
        final Iterator<a.c<?>> iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()) {
            m.put((a.c<?>)iterator2.next(), this.i);
        }
        this.j = (Map<a.c<?>, b1>)Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    @d6.a("mLock")
    private final void B() {
        if (v(this.n)) {
            if (v(this.o) || this.D()) {
                final int r = this.r;
                Label_0119: {
                    if (r != 1) {
                        if (r != 2) {
                            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", (Throwable)new AssertionError());
                            break Label_0119;
                        }
                        x.k(this.f).J(this.m);
                    }
                    this.C();
                }
                this.r = 0;
                return;
            }
            final c o = this.o;
            if (o != null) {
                if (this.r == 1) {
                    this.C();
                    return;
                }
                this.p(o);
                this.h.I();
            }
        }
        else {
            if (this.n != null && v(this.o)) {
                this.i.I();
                this.p(x.k(this.n));
                return;
            }
            c n = this.n;
            if (n != null) {
                final c o2 = this.o;
                if (o2 != null) {
                    if (this.i.q < this.h.q) {
                        n = o2;
                    }
                    this.p(n);
                }
            }
        }
    }
    
    @d6.a("mLock")
    private final void C() {
        final Iterator<w> iterator = this.k.iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
        this.k.clear();
    }
    
    @d6.a("mLock")
    private final boolean D() {
        final c o = this.o;
        return o != null && o.M() == 4;
    }
    
    @k0
    private final PendingIntent E() {
        if (this.l == null) {
            return null;
        }
        return PendingIntent.getActivity(this.e, System.identityHashCode(this.f), this.l.v(), 134217728);
    }
    
    public static i3 l(final Context context, final t0 t0, final Lock lock, final Looper looper, final h h, final Map<a.c<?>, a.f> map, final g g, final Map<a<?>, Boolean> map2, final a.a<? extends e, com.google.android.gms.signin.a> a, final ArrayList<h3> list) {
        final androidx.collection.a<a.c, a.f> a2 = new androidx.collection.a<a.c, a.f>();
        final androidx.collection.a a3 = new androidx.collection.a<a.c<?>, a.f>();
        final Iterator<Map.Entry<a.c<?>, a.f>> iterator = map.entrySet().iterator();
        a.f f = null;
        while (iterator.hasNext()) {
            final Map.Entry<a.c<?>, a.f> entry = iterator.next();
            final a.f f2 = entry.getValue();
            if (f2.g()) {
                f = f2;
            }
            final boolean w = f2.w();
            final a.c c = entry.getKey();
            if (w) {
                a2.put(c, f2);
            }
            else {
                a3.put(c, f2);
            }
        }
        x.r(a2.isEmpty() ^ true, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        final androidx.collection.a<a<?>, Boolean> a4 = new androidx.collection.a<a<?>, Boolean>();
        final androidx.collection.a<a<?>, Boolean> a5 = new androidx.collection.a<a<?>, Boolean>();
        for (final a<?> a6 : map2.keySet()) {
            final a.c<?> c2 = a6.c();
            if (a2.containsKey(c2)) {
                a4.put(a6, map2.get(a6));
            }
            else {
                if (!a3.containsKey(c2)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                a5.put(a6, map2.get(a6));
            }
        }
        final ArrayList<h3> list2 = new ArrayList<h3>();
        final ArrayList<h3> list3 = new ArrayList<h3>();
        final int size = list.size();
        int i = 0;
        while (i < size) {
            final h3 value = list.get(i);
            ++i;
            final h3 h2 = value;
            if (a4.containsKey(h2.e)) {
                list2.add(h2);
            }
            else {
                if (!a5.containsKey(h2.e)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                list3.add(h2);
            }
        }
        return new i3(context, t0, lock, looper, h, (Map<a.c<?>, a.f>)a2, a3, g, a, f, list2, list3, a4, a5);
    }
    
    @d6.a("mLock")
    private final void n(final int n, final boolean b) {
        this.f.b(n, b);
        this.o = null;
        this.n = null;
    }
    
    private final void o(@k0 final Bundle m) {
        final Bundle i = this.m;
        if (i == null) {
            this.m = m;
            return;
        }
        if (m != null) {
            i.putAll(m);
        }
    }
    
    @d6.a("mLock")
    private final void p(final c c) {
        final int r = this.r;
        Label_0046: {
            if (r != 1) {
                if (r != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", (Throwable)new Exception());
                    break Label_0046;
                }
                this.f.a(c);
            }
            this.C();
        }
        this.r = 0;
    }
    
    private static boolean v(@k0 final c c) {
        return c != null && c.j2();
    }
    
    private final boolean w(final com.google.android.gms.common.api.internal.e.a<? extends t, ? extends a.b> a) {
        final b1 b1 = this.j.get(a.A());
        x.l(b1, "GoogleApiClient is not configured to use the API required for this call.");
        return b1.equals(this.i);
    }
    
    @d6.a("mLock")
    @Override
    public final void I() {
        this.o = null;
        this.n = null;
        this.r = 0;
        this.h.I();
        this.i.I();
        this.C();
    }
    
    @d6.a("mLock")
    @Override
    public final <A extends a.b, R extends t, T extends com.google.android.gms.common.api.internal.e.a<R, A>> T K(@j0 final T t) {
        if (!this.w(t)) {
            return this.h.K(t);
        }
        if (this.D()) {
            ((com.google.android.gms.common.api.internal.e.a)t).a(new Status(4, null, this.E()));
            return t;
        }
        return this.i.K(t);
    }
    
    @d6.a("mLock")
    @Override
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.e.a<? extends t, A>> T L(@j0 final T t) {
        if (!this.w(t)) {
            return this.h.L(t);
        }
        if (this.D()) {
            ((com.google.android.gms.common.api.internal.e.a)t).a(new Status(4, null, this.E()));
            return t;
        }
        return this.i.L(t);
    }
    
    @Override
    public final boolean a(final w w) {
        this.q.lock();
        try {
            if ((this.d() || this.h()) && !this.i.h()) {
                this.k.add(w);
                if (this.r == 0) {
                    this.r = 1;
                }
                this.o = null;
                this.i.b();
                return true;
            }
            return false;
        }
        finally {
            this.q.unlock();
        }
    }
    
    @d6.a("mLock")
    @Override
    public final void b() {
        this.r = 2;
        this.p = false;
        this.o = null;
        this.n = null;
        this.h.b();
        this.i.b();
    }
    
    @Override
    public final void c() {
        this.q.lock();
        try {
            final boolean d = this.d();
            this.i.I();
            this.o = new c(4);
            if (d) {
                new p(this.g).post((Runnable)new l3(this));
            }
            else {
                this.C();
            }
        }
        finally {
            this.q.unlock();
        }
    }
    
    @Override
    public final boolean d() {
        this.q.lock();
        try {
            return this.r == 2;
        }
        finally {
            this.q.unlock();
        }
    }
    
    @d6.a("mLock")
    @Override
    public final void e() {
        this.h.e();
        this.i.e();
    }
    
    @d6.a("mLock")
    @Override
    public final c f() {
        throw new UnsupportedOperationException();
    }
    
    @k0
    @d6.a("mLock")
    @Override
    public final c g(@j0 final a<?> a) {
        if (!v.b(this.j.get(a.c()), this.i)) {
            return this.h.g(a);
        }
        if (this.D()) {
            return new c(4, this.E());
        }
        return this.i.g(a);
    }
    
    @Override
    public final boolean h() {
        this.q.lock();
        try {
            final boolean h = this.h.h();
            final boolean b = true;
            if (h) {
                boolean b2 = b;
                if (this.i.h()) {
                    return b2;
                }
                b2 = b;
                if (this.D()) {
                    return b2;
                }
                if (this.r == 1) {
                    b2 = b;
                    return b2;
                }
            }
            return false;
        }
        finally {
            this.q.unlock();
        }
    }
    
    @Override
    public final void i(final String s, @k0 final FileDescriptor fileDescriptor, final PrintWriter printWriter, @k0 final String[] array) {
        printWriter.append(s).append("authClient").println(":");
        this.i.i(String.valueOf(s).concat("  "), fileDescriptor, printWriter, array);
        printWriter.append(s).append("anonClient").println(":");
        this.h.i(String.valueOf(s).concat("  "), fileDescriptor, printWriter, array);
    }
    
    @d6.a("mLock")
    @Override
    public final c j(final long n, @j0 final TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
