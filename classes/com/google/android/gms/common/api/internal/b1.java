// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import com.google.android.gms.common.internal.x;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.app.PendingIntent;
import com.google.android.gms.common.api.t;
import androidx.annotation.j0;
import java.util.HashMap;
import java.util.ArrayList;
import android.os.Looper;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import com.google.android.gms.signin.e;
import androidx.annotation.k0;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.c;
import com.google.android.gms.common.api.a;
import java.util.Map;
import com.google.android.gms.common.h;
import android.content.Context;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class b1 implements s1, j3
{
    private final Lock e;
    private final Condition f;
    private final Context g;
    private final h h;
    private final d1 i;
    final Map<com.google.android.gms.common.api.a.c<?>, com.google.android.gms.common.api.a.f> j;
    final Map<com.google.android.gms.common.api.a.c<?>, com.google.android.gms.common.c> k;
    @k0
    private final g l;
    private final Map<com.google.android.gms.common.api.a<?>, Boolean> m;
    @k0
    private final com.google.android.gms.common.api.a.a<? extends e, com.google.android.gms.signin.a> n;
    @NotOnlyInitialized
    private volatile c1 o;
    @k0
    private com.google.android.gms.common.c p;
    int q;
    final t0 r;
    final r1 s;
    
    public b1(final Context g, final t0 r, final Lock e, final Looper looper, final h h, final Map<com.google.android.gms.common.api.a.c<?>, com.google.android.gms.common.api.a.f> j, @k0 final g l, final Map<com.google.android.gms.common.api.a<?>, Boolean> m, @k0 final com.google.android.gms.common.api.a.a<? extends e, com.google.android.gms.signin.a> n, final ArrayList<h3> list, final r1 s) {
        this.k = new HashMap<com.google.android.gms.common.api.a.c<?>, com.google.android.gms.common.c>();
        this.p = null;
        this.g = g;
        this.e = e;
        this.h = h;
        this.j = j;
        this.l = l;
        this.m = m;
        this.n = n;
        this.r = r;
        this.s = s;
        final int size = list.size();
        int i = 0;
        while (i < size) {
            final h3 value = list.get(i);
            ++i;
            value.b(this);
        }
        this.i = new d1(this, looper);
        this.f = e.newCondition();
        this.o = new u0(this);
    }
    
    @Override
    public final void H(@j0 final com.google.android.gms.common.c c, @j0 final com.google.android.gms.common.api.a<?> a, final boolean b) {
        this.e.lock();
        try {
            this.o.H(c, a, b);
        }
        finally {
            this.e.unlock();
        }
    }
    
    @d6.a("mLock")
    @Override
    public final void I() {
        if (this.o.f()) {
            this.k.clear();
        }
    }
    
    @d6.a("mLock")
    @Override
    public final <A extends com.google.android.gms.common.api.a.b, R extends t, T extends com.google.android.gms.common.api.internal.e.a<R, A>> T K(@j0 final T t) {
        t.v();
        return this.o.K(t);
    }
    
    @d6.a("mLock")
    @Override
    public final <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.e.a<? extends t, A>> T L(@j0 final T t) {
        t.v();
        return this.o.L(t);
    }
    
    @Override
    public final boolean a(final w w) {
        return false;
    }
    
    @d6.a("mLock")
    @Override
    public final void b() {
        this.o.I();
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final boolean d() {
        return this.o instanceof h0;
    }
    
    @d6.a("mLock")
    @Override
    public final void e() {
        if (this.h()) {
            ((g0)this.o).c();
        }
    }
    
    @d6.a("mLock")
    @Override
    public final com.google.android.gms.common.c f() {
        this.b();
        while (this.d()) {
            try {
                this.f.await();
                continue;
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                return new com.google.android.gms.common.c(15, null);
            }
            break;
        }
        if (this.h()) {
            return com.google.android.gms.common.c.h0;
        }
        final com.google.android.gms.common.c p = this.p;
        if (p != null) {
            return p;
        }
        return new com.google.android.gms.common.c(13, null);
    }
    
    @k0
    @d6.a("mLock")
    @Override
    public final com.google.android.gms.common.c g(@j0 final com.google.android.gms.common.api.a<?> a) {
        final com.google.android.gms.common.api.a.c<?> c = (com.google.android.gms.common.api.a.c<?>)a.c();
        if (this.j.containsKey(c)) {
            if (this.j.get(c).a()) {
                return com.google.android.gms.common.c.h0;
            }
            if (this.k.containsKey(c)) {
                return this.k.get(c);
            }
        }
        return null;
    }
    
    @Override
    public final boolean h() {
        return this.o instanceof g0;
    }
    
    @Override
    public final void i(final String csq, @k0 final FileDescriptor fileDescriptor, final PrintWriter printWriter, @k0 final String[] array) {
        final String concat = String.valueOf(csq).concat("  ");
        printWriter.append(csq).append("mState=").println(this.o);
        for (final com.google.android.gms.common.api.a<?> a : this.m.keySet()) {
            printWriter.append(csq).append(a.d()).println(":");
            x.k(this.j.get(a.c())).q(concat, fileDescriptor, printWriter, array);
        }
    }
    
    @d6.a("mLock")
    @Override
    public final com.google.android.gms.common.c j(long duration, final TimeUnit timeUnit) {
        this.b();
        duration = timeUnit.toNanos(duration);
    Label_0038_Outer:
        while (this.d()) {
            while (true) {
                if (duration <= 0L) {
                    try {
                        this.I();
                        return new com.google.android.gms.common.c(14, null);
                        duration = this.f.awaitNanos(duration);
                        continue Label_0038_Outer;
                    }
                    catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                        return new com.google.android.gms.common.c(15, null);
                    }
                    break;
                }
                continue;
            }
        }
        if (this.h()) {
            return com.google.android.gms.common.c.h0;
        }
        final com.google.android.gms.common.c p2 = this.p;
        if (p2 != null) {
            return p2;
        }
        return new com.google.android.gms.common.c(13, null);
    }
    
    final void l(@k0 final com.google.android.gms.common.c p) {
        this.e.lock();
        try {
            this.p = p;
            (this.o = new u0(this)).b();
            this.f.signalAll();
        }
        finally {
            this.e.unlock();
        }
    }
    
    final void m(final f1 f1) {
        this.i.sendMessage(this.i.obtainMessage(1, (Object)f1));
    }
    
    final void n(final RuntimeException ex) {
        this.i.sendMessage(this.i.obtainMessage(2, (Object)ex));
    }
    
    @Override
    public final void onConnected(@k0 final Bundle bundle) {
        this.e.lock();
        try {
            this.o.J(bundle);
        }
        finally {
            this.e.unlock();
        }
    }
    
    @Override
    public final void onConnectionSuspended(final int n) {
        this.e.lock();
        try {
            this.o.h(n);
        }
        finally {
            this.e.unlock();
        }
    }
    
    final void p() {
        this.e.lock();
        try {
            (this.o = new h0(this, this.l, this.m, this.h, this.n, this.e, this.g)).b();
            this.f.signalAll();
        }
        finally {
            this.e.unlock();
        }
    }
    
    final void q() {
        this.e.lock();
        try {
            this.r.R();
            (this.o = new g0(this)).b();
            this.f.signalAll();
        }
        finally {
            this.e.unlock();
        }
    }
}
