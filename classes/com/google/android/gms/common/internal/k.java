// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import com.google.android.gms.common.h;
import com.google.android.gms.common.e;
import androidx.annotation.k0;
import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.Scope;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@f2.a
@h2.d.a(creator = "GetServiceRequestCreator")
@f({ 9 })
public class k extends a
{
    @RecentlyNonNull
    public static final Parcelable$Creator<k> CREATOR;
    @g(id = 1)
    private final int G;
    @c(id = 2)
    private final int H;
    @c(id = 3)
    private int I;
    @c(id = 4)
    String J;
    @c(id = 5)
    IBinder K;
    @c(id = 6)
    Scope[] L;
    @c(id = 7)
    Bundle M;
    @k0
    @c(id = 8)
    Account N;
    @c(id = 10)
    com.google.android.gms.common.e[] O;
    @c(id = 11)
    com.google.android.gms.common.e[] P;
    @c(id = 12)
    private boolean Q;
    @c(defaultValue = "0", id = 13)
    private int R;
    @c(getter = "isRequestingTelemetryConfiguration", id = 14)
    boolean S;
    
    static {
        CREATOR = (Parcelable$Creator)new h1();
    }
    
    public k(@RecentlyNonNull final int h) {
        this.G = 5;
        this.I = h.a;
        this.H = h;
        this.Q = true;
    }
    
    @b
    k(@e(id = 1) final int g, @e(id = 2) final int h, @e(id = 3) final int i, @e(id = 4) final String s, @e(id = 5) final IBinder k, @e(id = 6) final Scope[] l, @e(id = 7) final Bundle m, @e(id = 8) final Account n, @e(id = 10) final com.google.android.gms.common.e[] o, @e(id = 11) final com.google.android.gms.common.e[] p13, @e(id = 12) final boolean q, @e(id = 13) final int r, @e(id = 14) final boolean s2) {
        this.G = g;
        this.H = h;
        this.I = i;
        if ("com.google.android.gms".equals(s)) {
            this.J = "com.google.android.gms";
        }
        else {
            this.J = s;
        }
        if (g < 2) {
            Account y2 = null;
            if (k != null) {
                y2 = com.google.android.gms.common.internal.a.y2(p.a.x2(k));
            }
            this.N = y2;
        }
        else {
            this.K = k;
            this.N = n;
        }
        this.L = l;
        this.M = m;
        this.O = o;
        this.P = p13;
        this.Q = q;
        this.R = r;
        this.S = s2;
    }
    
    @RecentlyNonNull
    @f2.a
    public Bundle M() {
        return this.M;
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.F(parcel, 2, this.H);
        h2.c.F(parcel, 3, this.I);
        h2.c.X(parcel, 4, this.J, false);
        h2.c.B(parcel, 5, this.K, false);
        h2.c.b0(parcel, 6, this.L, n, false);
        h2.c.k(parcel, 7, this.M, false);
        h2.c.S(parcel, 8, (Parcelable)this.N, n, false);
        h2.c.b0(parcel, 10, this.O, n, false);
        h2.c.b0(parcel, 11, this.P, n, false);
        h2.c.g(parcel, 12, this.Q);
        h2.c.F(parcel, 13, this.R);
        h2.c.g(parcel, 14, this.S);
        h2.c.b(parcel, a);
    }
}
