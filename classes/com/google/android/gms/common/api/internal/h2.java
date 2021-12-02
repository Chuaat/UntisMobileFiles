// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.d;
import androidx.annotation.k0;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.c;
import android.util.Log;
import com.google.android.gms.common.internal.w0;
import com.google.android.gms.signin.internal.n;
import com.google.android.gms.common.internal.x;
import androidx.annotation.c1;
import androidx.annotation.j0;
import com.google.android.gms.signin.b;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import android.os.Handler;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.k;
import com.google.android.gms.signin.internal.e;

public final class h2 extends e implements b, c
{
    private static a.a<? extends com.google.android.gms.signin.e, com.google.android.gms.signin.a> m;
    private final Context f;
    private final Handler g;
    private final a.a<? extends com.google.android.gms.signin.e, com.google.android.gms.signin.a> h;
    private Set<Scope> i;
    private com.google.android.gms.common.internal.g j;
    private com.google.android.gms.signin.e k;
    private k2 l;
    
    static {
        h2.m = b.c;
    }
    
    @c1
    public h2(final Context context, final Handler handler, @j0 final com.google.android.gms.common.internal.g g) {
        this(context, handler, g, h2.m);
    }
    
    @c1
    private h2(final Context f, final Handler g, @j0 final com.google.android.gms.common.internal.g g2, final a.a<? extends com.google.android.gms.signin.e, com.google.android.gms.signin.a> h) {
        this.f = f;
        this.g = g;
        this.j = x.l(g2, "ClientSettings must not be null");
        this.i = g2.i();
        this.h = h;
    }
    
    @c1
    private final void C2(final n n) {
        Label_0097: {
            com.google.android.gms.common.c obj;
            if ((obj = n.M()).j2()) {
                final w0 w0 = x.k(n.g1());
                obj = w0.g1();
                if (obj.j2()) {
                    this.l.c(w0.M(), this.i);
                    break Label_0097;
                }
                final String value = String.valueOf(obj);
                final StringBuilder sb = new StringBuilder(value.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(value);
                Log.wtf("SignInCoordinator", sb.toString(), (Throwable)new Exception());
            }
            this.l.a(obj);
        }
        ((com.google.android.gms.common.api.a.f)this.k).d();
    }
    
    @c1
    public final void B2(final k2 l) {
        final com.google.android.gms.signin.e k = this.k;
        if (k != null) {
            ((com.google.android.gms.common.api.a.f)k).d();
        }
        this.j.l(System.identityHashCode(this));
        final a.a<? extends com.google.android.gms.signin.e, com.google.android.gms.signin.a> h = this.h;
        final Context f = this.f;
        final Looper looper = this.g.getLooper();
        final com.google.android.gms.common.internal.g j = this.j;
        this.k = (com.google.android.gms.signin.e)h.c(f, looper, j, j.n(), this, this);
        this.l = l;
        final Set<Scope> i = this.i;
        if (i != null && !i.isEmpty()) {
            this.k.f();
            return;
        }
        this.g.post((Runnable)new j2(this));
    }
    
    @androidx.annotation.g
    @Override
    public final void a2(final n n) {
        this.g.post((Runnable)new i2(this, n));
    }
    
    @c1
    @Override
    public final void onConnected(@k0 final Bundle bundle) {
        this.k.k(this);
    }
    
    @c1
    @Override
    public final void onConnectionFailed(@j0 final com.google.android.gms.common.c c) {
        this.l.a(c);
    }
    
    @c1
    @Override
    public final void onConnectionSuspended(final int n) {
        ((com.google.android.gms.common.api.a.f)this.k).d();
    }
    
    public final void z2() {
        final com.google.android.gms.signin.e k = this.k;
        if (k != null) {
            ((com.google.android.gms.common.api.a.f)k).d();
        }
    }
}
