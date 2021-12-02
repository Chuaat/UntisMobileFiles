// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.accounts.Account;
import com.google.android.gms.common.internal.v0;
import com.google.android.gms.auth.api.signin.internal.c;
import com.google.android.gms.common.internal.p;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.x;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcelable;
import com.google.android.gms.common.api.k;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import androidx.annotation.k0;
import android.os.Bundle;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.signin.e;
import com.google.android.gms.common.internal.l;

@f2.a
public class a extends l<f> implements e
{
    private final boolean O;
    private final g P;
    private final Bundle Q;
    @k0
    private final Integer R;
    
    public a(@RecentlyNonNull final Context context, @RecentlyNonNull final Looper looper, @RecentlyNonNull final boolean o, @RecentlyNonNull final g p7, @RecentlyNonNull final Bundle q, @RecentlyNonNull final com.google.android.gms.common.api.k.b b, @RecentlyNonNull final com.google.android.gms.common.api.k.c c) {
        super(context, looper, 44, p7, b, c);
        this.O = o;
        this.P = p7;
        this.Q = q;
        this.R = p7.o();
    }
    
    public a(@RecentlyNonNull final Context context, @RecentlyNonNull final Looper looper, @RecentlyNonNull final boolean b, @RecentlyNonNull final g g, @RecentlyNonNull final com.google.android.gms.signin.a a, @RecentlyNonNull final com.google.android.gms.common.api.k.b b2, @RecentlyNonNull final com.google.android.gms.common.api.k.c c) {
        this(context, looper, true, g, x0(g), b2, c);
    }
    
    @RecentlyNonNull
    @f2.a
    public static Bundle x0(@RecentlyNonNull final g g) {
        final com.google.android.gms.signin.a n = g.n();
        final Integer o = g.o();
        final Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable)g.b());
        if (o != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", (int)o);
        }
        if (n != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String)null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String)null);
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String)null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        return bundle;
    }
    
    @RecentlyNonNull
    @Override
    protected Bundle G() {
        if (!this.F().getPackageName().equals(this.P.h())) {
            this.Q.putString("com.google.android.gms.signin.internal.realClientPackageName", this.P.h());
        }
        return this.Q;
    }
    
    @RecentlyNonNull
    @Override
    protected String L() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }
    
    @RecentlyNonNull
    @Override
    protected String M() {
        return "com.google.android.gms.signin.service.START";
    }
    
    @Override
    public final void b() {
        try {
            this.K().h(com.google.android.gms.common.internal.x.k(this.R));
        }
        catch (RemoteException ex) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }
    
    @Override
    public final void e(@RecentlyNonNull final p p2, @RecentlyNonNull final boolean b) {
        try {
            this.K().T0(p2, com.google.android.gms.common.internal.x.k(this.R), b);
        }
        catch (RemoteException ex) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }
    
    @Override
    public final void f() {
        this.n((c)new d());
    }
    
    @Override
    public final void k(final d d) {
        com.google.android.gms.common.internal.x.l(d, "Expecting a valid ISignInCallbacks");
        try {
            final Account d2 = this.P.d();
            GoogleSignInAccount c = null;
            if ("<<default account>>".equals(d2.name)) {
                c = com.google.android.gms.auth.api.signin.internal.c.b(this.F()).c();
            }
            this.K().K1(new com.google.android.gms.signin.internal.l(new v0(d2, com.google.android.gms.common.internal.x.k(this.R), c)), d);
        }
        catch (RemoteException ex) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                d.a2(new n(8));
            }
            catch (RemoteException ex2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)ex);
            }
        }
    }
    
    @RecentlyNonNull
    @Override
    public int s() {
        return 12451000;
    }
    
    @RecentlyNonNull
    @Override
    public boolean w() {
        return this.O;
    }
}
