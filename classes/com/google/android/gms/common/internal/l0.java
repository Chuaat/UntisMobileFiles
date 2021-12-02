// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.c;
import androidx.annotation.k0;
import android.os.Bundle;
import java.util.Collection;
import com.google.android.gms.internal.base.p;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.api.k;
import java.util.ArrayList;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import android.os.Handler$Callback;

public final class l0 implements Handler$Callback
{
    @NotOnlyInitialized
    private final o0 c;
    private final ArrayList<k.b> d;
    @d0
    private final ArrayList<k.b> e;
    private final ArrayList<k.c> f;
    private volatile boolean g;
    private final AtomicInteger h;
    private boolean i;
    private final Handler j;
    private final Object k;
    
    public l0(final Looper looper, final o0 c) {
        this.d = new ArrayList<k.b>();
        this.e = new ArrayList<k.b>();
        this.f = new ArrayList<k.c>();
        this.g = false;
        this.h = new AtomicInteger(0);
        this.i = false;
        this.k = new Object();
        this.c = c;
        this.j = new p(looper, (Handler$Callback)this);
    }
    
    public final void a() {
        this.g = false;
        this.h.incrementAndGet();
    }
    
    @d0
    public final void b(final int n) {
        x.e(this.j, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.j.removeMessages(1);
        synchronized (this.k) {
            this.i = true;
            final ArrayList<k.b> list = new ArrayList<k.b>(this.d);
            final int value = this.h.get();
            final int size = list.size();
            int i = 0;
            while (i < size) {
                final k.b value2 = list.get(i);
                final int n2 = i + 1;
                final k.b o = value2;
                if (!this.g || this.h.get() != value) {
                    break;
                }
                i = n2;
                if (!this.d.contains(o)) {
                    continue;
                }
                o.onConnectionSuspended(n);
                i = n2;
            }
            this.e.clear();
            this.i = false;
        }
    }
    
    @d0
    public final void c(@k0 final Bundle bundle) {
        x.e(this.j, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.k) {
            final boolean i = this.i;
            final boolean b = true;
            x.q(!i);
            this.j.removeMessages(1);
            this.i = true;
            x.q(this.e.size() == 0 && b);
            final ArrayList<k.b> list = new ArrayList<k.b>(this.d);
            final int value = this.h.get();
            final int size = list.size();
            int j = 0;
            while (j < size) {
                final k.b value2 = list.get(j);
                final int n = j + 1;
                final k.b o = value2;
                if (!this.g || !this.c.a() || this.h.get() != value) {
                    break;
                }
                j = n;
                if (this.e.contains(o)) {
                    continue;
                }
                o.onConnected(bundle);
                j = n;
            }
            this.e.clear();
            this.i = false;
        }
    }
    
    @d0
    public final void d(final c c) {
        x.e(this.j, "onConnectionFailure must only be called on the Handler thread");
        this.j.removeMessages(1);
        synchronized (this.k) {
            final ArrayList<k.c> list = new ArrayList<k.c>(this.f);
            final int value = this.h.get();
            final int size = list.size();
            int i = 0;
            while (i < size) {
                final k.c value2 = list.get(i);
                final int n = i + 1;
                final k.c o = value2;
                if (!this.g || this.h.get() != value) {
                    return;
                }
                i = n;
                if (!this.f.contains(o)) {
                    continue;
                }
                o.onConnectionFailed(c);
                i = n;
            }
        }
    }
    
    public final void e(final k.b e) {
        x.k(e);
        Object o = this.k;
        synchronized (o) {
            if (this.d.contains(e)) {
                final String value = String.valueOf(e);
                final StringBuilder sb = new StringBuilder(value.length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(value);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            }
            else {
                this.d.add(e);
            }
            // monitorexit(o)
            if (this.c.a()) {
                o = this.j;
                ((Handler)o).sendMessage(((Handler)o).obtainMessage(1, (Object)e));
            }
        }
    }
    
    public final void f(final k.c e) {
        x.k(e);
        synchronized (this.k) {
            if (this.f.contains(e)) {
                final String value = String.valueOf(e);
                final StringBuilder sb = new StringBuilder(value.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(value);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            }
            else {
                this.f.add(e);
            }
        }
    }
    
    public final void g() {
        this.g = true;
    }
    
    public final boolean h(final k.b o) {
        x.k(o);
        synchronized (this.k) {
            return this.d.contains(o);
        }
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        if (what == 1) {
            final k.b o = (k.b)message.obj;
            synchronized (this.k) {
                if (this.g && this.c.a() && this.d.contains(o)) {
                    o.onConnected(this.c.y());
                }
                return true;
            }
        }
        final StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(what);
        Log.wtf("GmsClientEvents", sb.toString(), (Throwable)new Exception());
        return false;
    }
    
    public final boolean i(final k.c o) {
        x.k(o);
        synchronized (this.k) {
            return this.f.contains(o);
        }
    }
    
    public final void j(final k.b e) {
        x.k(e);
        synchronized (this.k) {
            if (!this.d.remove(e)) {
                final String value = String.valueOf(e);
                final StringBuilder sb = new StringBuilder(value.length() + 52);
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(value);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
            else if (this.i) {
                this.e.add(e);
            }
        }
    }
    
    public final void k(final k.c c) {
        x.k(c);
        synchronized (this.k) {
            if (!this.f.remove(c)) {
                final String value = String.valueOf(c);
                final StringBuilder sb = new StringBuilder(value.length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(value);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }
}
