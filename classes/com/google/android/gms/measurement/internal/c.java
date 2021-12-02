// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.internal.x;
import androidx.annotation.k0;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "ConditionalUserPropertyParcelCreator")
public final class c extends a
{
    public static final Parcelable$Creator<c> CREATOR;
    @k0
    @h2.d.c(id = 2)
    public String G;
    @h2.d.c(id = 3)
    public String H;
    @h2.d.c(id = 4)
    public ca I;
    @h2.d.c(id = 5)
    public long J;
    @h2.d.c(id = 6)
    public boolean K;
    @k0
    @h2.d.c(id = 7)
    public String L;
    @k0
    @h2.d.c(id = 8)
    public final u M;
    @h2.d.c(id = 9)
    public long N;
    @k0
    @h2.d.c(id = 10)
    public u O;
    @h2.d.c(id = 11)
    public final long P;
    @k0
    @h2.d.c(id = 12)
    public final u Q;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    c(final c c) {
        x.k(c);
        this.G = c.G;
        this.H = c.H;
        this.I = c.I;
        this.J = c.J;
        this.K = c.K;
        this.L = c.L;
        this.M = c.M;
        this.N = c.N;
        this.O = c.O;
        this.P = c.P;
        this.Q = c.Q;
    }
    
    @b
    c(@k0 @e(id = 2) final String g, @e(id = 3) final String h, @e(id = 4) final ca i, @e(id = 5) final long j, @e(id = 6) final boolean k, @k0 @e(id = 7) final String l, @k0 @e(id = 8) final u m, @e(id = 9) final long n, @k0 @e(id = 10) final u o, @e(id = 11) final long p11, @k0 @e(id = 12) final u q) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p11;
        this.Q = q;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.X(parcel, 2, this.G, false);
        h2.c.X(parcel, 3, this.H, false);
        h2.c.S(parcel, 4, (Parcelable)this.I, n, false);
        h2.c.K(parcel, 5, this.J);
        h2.c.g(parcel, 6, this.K);
        h2.c.X(parcel, 7, this.L, false);
        h2.c.S(parcel, 8, (Parcelable)this.M, n, false);
        h2.c.K(parcel, 9, this.N);
        h2.c.S(parcel, 10, (Parcelable)this.O, n, false);
        h2.c.K(parcel, 11, this.P);
        h2.c.S(parcel, 12, (Parcelable)this.Q, n, false);
        h2.c.b(parcel, a);
    }
}
