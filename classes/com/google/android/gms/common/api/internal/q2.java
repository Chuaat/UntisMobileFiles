// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.j0;
import d6.a;
import android.util.Log;
import com.google.android.gms.common.api.p;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import java.lang.ref.WeakReference;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.v;
import androidx.annotation.k0;
import com.google.android.gms.common.api.w;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.api.t;

public final class q2<R extends t> extends x<R> implements u<R>
{
    @k0
    private w<? super R, ? extends t> a;
    @k0
    private q2<? extends t> b;
    @k0
    private volatile v<? super R> c;
    @k0
    private n<R> d;
    private final Object e;
    @k0
    private Status f;
    private final WeakReference<k> g;
    private final s2 h;
    private boolean i;
    
    public q2(final WeakReference<k> g) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = new Object();
        this.f = null;
        this.i = false;
        com.google.android.gms.common.internal.x.l(g, "GoogleApiClient reference must not be null");
        this.g = g;
        final k k = g.get();
        Looper looper;
        if (k != null) {
            looper = k.q();
        }
        else {
            looper = Looper.getMainLooper();
        }
        this.h = new s2(this, looper);
    }
    
    private static void g(final t obj) {
        if (obj instanceof p) {
            try {
                ((p)obj).release();
            }
            catch (RuntimeException ex) {
                final String value = String.valueOf(obj);
                final StringBuilder sb = new StringBuilder(value.length() + 18);
                sb.append("Unable to release ");
                sb.append(value);
                Log.w("TransformedResultImpl", sb.toString(), (Throwable)ex);
            }
        }
    }
    
    private final void h(final Status f) {
        synchronized (this.e) {
            this.m(this.f = f);
        }
    }
    
    @a("mSyncToken")
    private final void l() {
        if (this.a == null && this.c == null) {
            return;
        }
        final k k = this.g.get();
        if (!this.i && this.a != null && k != null) {
            k.H(this);
            this.i = true;
        }
        final Status f = this.f;
        if (f != null) {
            this.m(f);
            return;
        }
        final n<R> d = this.d;
        if (d != null) {
            d.h(this);
        }
    }
    
    private final void m(Status status) {
        synchronized (this.e) {
            final w<? super R, ? extends t> a = this.a;
            if (a != null) {
                status = com.google.android.gms.common.internal.x.l(a.b(status), "onFailure must not return null");
                com.google.android.gms.common.internal.x.k(this.b).h(status);
            }
            else if (this.o()) {
                com.google.android.gms.common.internal.x.k(this.c).b(status);
            }
        }
    }
    
    @a("mSyncToken")
    private final boolean o() {
        final k k = this.g.get();
        return this.c != null && k != null;
    }
    
    @Override
    public final void a(final R r) {
        synchronized (this.e) {
            if (r.h().j3()) {
                if (this.a != null) {
                    g2.a().submit(new p2(this, r));
                }
                else if (this.o()) {
                    com.google.android.gms.common.internal.x.k(this.c).c((Object)r);
                }
            }
            else {
                this.h(r.h());
                g(r);
            }
        }
    }
    
    @Override
    public final void b(@j0 final v<? super R> c) {
        synchronized (this.e) {
            final v<? super R> c2 = this.c;
            final boolean b = true;
            com.google.android.gms.common.internal.x.r(c2 == null, "Cannot call andFinally() twice.");
            com.google.android.gms.common.internal.x.r(this.a == null && b, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.c = c;
            this.l();
        }
    }
    
    @j0
    @Override
    public final <S extends t> x<S> c(@j0 final w<? super R, ? extends S> a) {
        synchronized (this.e) {
            final w<? super R, ? extends t> a2 = this.a;
            final boolean b = true;
            com.google.android.gms.common.internal.x.r(a2 == null, "Cannot call then() twice.");
            com.google.android.gms.common.internal.x.r(this.c == null && b, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.a = a;
            final q2<t> b2 = new q2<t>(this.g);
            this.b = b2;
            this.l();
            return (x<S>)b2;
        }
    }
    
    final void e() {
        this.c = null;
    }
    
    public final void f(final n<?> d) {
        synchronized (this.e) {
            this.d = (n<R>)d;
            this.l();
        }
    }
}
