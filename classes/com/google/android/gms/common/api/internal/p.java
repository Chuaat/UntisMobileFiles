// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.RecentlyNullable;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.m;
import android.content.Intent;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.x;
import androidx.annotation.j0;
import java.util.Collections;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import androidx.annotation.c1;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import android.os.IBinder;
import android.os.Handler;
import android.content.Context;
import android.content.ComponentName;
import androidx.annotation.k0;
import com.google.android.gms.common.api.a;
import android.content.ServiceConnection;

@f2.a
public final class p implements ServiceConnection, f
{
    private static final String m;
    @k0
    private final String c;
    @k0
    private final String d;
    @k0
    private final ComponentName e;
    private final Context f;
    private final com.google.android.gms.common.api.internal.f g;
    private final Handler h;
    private final q i;
    @k0
    private IBinder j;
    private boolean k;
    @k0
    private String l;
    
    static {
        m = p.class.getSimpleName();
    }
    
    @f2.a
    public p(@RecentlyNonNull final Context context, @RecentlyNonNull final Looper looper, @RecentlyNonNull final ComponentName componentName, @RecentlyNonNull final com.google.android.gms.common.api.internal.f f, @RecentlyNonNull final q q) {
        this(context, looper, null, null, componentName, f, q);
    }
    
    private p(final Context f, final Looper looper, @k0 final String c, @k0 final String d, @k0 final ComponentName e, final com.google.android.gms.common.api.internal.f g, final q i) {
        boolean b = false;
        this.k = false;
        this.l = null;
        this.f = f;
        this.h = new com.google.android.gms.internal.base.p(looper);
        this.g = g;
        this.i = i;
        final boolean b2 = c != null && d != null;
        if (e != null) {
            b = true;
        }
        if (b2) {
            if (b) {
                throw new AssertionError((Object)"Must specify either package or component, but not both");
            }
        }
        else if (!b) {
            throw new AssertionError((Object)"Must specify either package or component, but not both");
        }
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @f2.a
    public p(@RecentlyNonNull final Context context, @RecentlyNonNull final Looper looper, @RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final com.google.android.gms.common.api.internal.f f, @RecentlyNonNull final q q) {
        this(context, looper, s, s2, null, f, q);
    }
    
    private final void A(final String obj) {
        new StringBuilder(String.valueOf(obj).length() + 30 + String.valueOf(this.j).length());
    }
    
    @c1
    private final void f() {
        if (Thread.currentThread() == this.h.getLooper().getThread()) {
            return;
        }
        throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
    }
    
    @RecentlyNonNull
    @c1
    public final boolean a() {
        this.f();
        return this.j != null;
    }
    
    @RecentlyNonNull
    public final boolean c() {
        return false;
    }
    
    @c1
    public final void d() {
        this.f();
        this.A("Disconnect called.");
        this.f.unbindService((ServiceConnection)this);
        this.k = false;
        this.j = null;
    }
    
    @RecentlyNonNull
    public final boolean g() {
        return false;
    }
    
    @j0
    public final Set<Scope> h() {
        return Collections.emptySet();
    }
    
    public final void i(@k0 final com.google.android.gms.common.internal.p p2, @k0 final Set<Scope> set) {
    }
    
    @c1
    public final void j(@RecentlyNonNull final String l) {
        this.f();
        this.l = l;
        this.d();
    }
    
    @RecentlyNonNull
    @c1
    public final boolean l() {
        this.f();
        return this.k;
    }
    
    @RecentlyNonNull
    public final String m() {
        final String c = this.c;
        if (c != null) {
            return c;
        }
        x.k(this.e);
        return this.e.getPackageName();
    }
    
    @c1
    public final void n(@RecentlyNonNull final e.c c) {
        this.f();
        this.A("Connect started.");
        while (true) {
            if (!this.a()) {
                break Label_0023;
            }
            try {
                this.j("connect() called when already connected");
                try {
                    final Intent intent = new Intent();
                    final ComponentName e = this.e;
                    if (e != null) {
                        intent.setComponent(e);
                    }
                    else {
                        intent.setPackage(this.c).setAction(this.d);
                    }
                    if (!(this.k = this.f.bindService(intent, (ServiceConnection)this, com.google.android.gms.common.internal.m.c()))) {
                        this.j = null;
                        this.i.onConnectionFailed(new c(16));
                    }
                    this.A("Finished connect.");
                }
                catch (SecurityException ex) {
                    this.k = false;
                    this.j = null;
                    throw ex;
                }
            }
            catch (Exception ex2) {
                continue;
            }
            break;
        }
    }
    
    public final void o(@RecentlyNonNull final e.e e) {
    }
    
    public final void onServiceConnected(@RecentlyNonNull final ComponentName componentName, @RecentlyNonNull final IBinder binder) {
        this.h.post((Runnable)new u1(this, binder));
    }
    
    public final void onServiceDisconnected(@RecentlyNonNull final ComponentName componentName) {
        this.h.post((Runnable)new v1(this));
    }
    
    @RecentlyNonNull
    public final com.google.android.gms.common.e[] p() {
        return new com.google.android.gms.common.e[0];
    }
    
    public final void q(@RecentlyNonNull final String s, @k0 final FileDescriptor fileDescriptor, @RecentlyNonNull final PrintWriter printWriter, @k0 final String[] array) {
    }
    
    @RecentlyNonNull
    public final boolean r() {
        return false;
    }
    
    @RecentlyNonNull
    public final int s() {
        return 0;
    }
    
    @RecentlyNonNull
    public final com.google.android.gms.common.e[] t() {
        return new com.google.android.gms.common.e[0];
    }
    
    @RecentlyNullable
    public final String u() {
        return this.l;
    }
    
    @RecentlyNonNull
    public final Intent v() {
        return new Intent();
    }
    
    @RecentlyNonNull
    public final boolean w() {
        return false;
    }
    
    @RecentlyNullable
    public final IBinder x() {
        return null;
    }
    
    @RecentlyNullable
    @c1
    @f2.a
    public final IBinder y() {
        this.f();
        return this.j;
    }
}
