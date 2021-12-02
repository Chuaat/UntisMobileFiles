// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import androidx.annotation.k0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.accounts.Account;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "ResolveAccountRequestCreator")
public final class v0 extends a
{
    public static final Parcelable$Creator<v0> CREATOR;
    @g(id = 1)
    private final int G;
    @c(getter = "getAccount", id = 2)
    private final Account H;
    @c(getter = "getSessionId", id = 3)
    private final int I;
    @k0
    @c(getter = "getSignInAccountHint", id = 4)
    private final GoogleSignInAccount J;
    
    static {
        CREATOR = (Parcelable$Creator)new x0();
    }
    
    @b
    v0(@e(id = 1) final int g, @e(id = 2) final Account h, @e(id = 3) final int i, @k0 @e(id = 4) final GoogleSignInAccount j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public v0(final Account account, final int n, @k0 final GoogleSignInAccount googleSignInAccount) {
        this(2, account, n, googleSignInAccount);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.S(parcel, 2, (Parcelable)this.H, n, false);
        h2.c.F(parcel, 3, this.I);
        h2.c.S(parcel, 4, (Parcelable)this.J, n, false);
        h2.c.b(parcel, a);
    }
}
