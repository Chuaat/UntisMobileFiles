// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("wrapper.cc")
@h2.d.a(creator = "FaceParcelCreator")
public class a extends h2.a
{
    @RecentlyNonNull
    public static final Parcelable$Creator<a> CREATOR;
    @g(id = 1)
    private final int G;
    @c(id = 2)
    public final int H;
    @c(id = 3)
    public final float I;
    @c(id = 4)
    public final float J;
    @c(id = 5)
    public final float K;
    @c(id = 6)
    public final float L;
    @c(defaultValue = "3.4028235E38f", id = 7)
    public final float M;
    @c(defaultValue = "3.4028235E38f", id = 8)
    public final float N;
    @c(defaultValue = "3.4028235E38f", id = 14)
    public final float O;
    @RecentlyNonNull
    @c(id = 9)
    public final com.google.android.gms.vision.face.internal.client.b[] P;
    @c(id = 10)
    public final float Q;
    @c(id = 11)
    public final float R;
    @c(id = 12)
    public final float S;
    @c(id = 13)
    public final com.google.android.gms.vision.face.internal.client.c[] T;
    @c(defaultValue = "-1.0f", id = 15)
    public final float U;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.vision.face.internal.client.f();
    }
    
    @b
    public a(@e(id = 1) final int g, @e(id = 2) final int h, @e(id = 3) final float i, @e(id = 4) final float j, @e(id = 5) final float k, @e(id = 6) final float l, @e(id = 7) final float m, @e(id = 8) final float n, @e(id = 14) final float o, @e(id = 9) final com.google.android.gms.vision.face.internal.client.b[] p15, @e(id = 10) final float q, @e(id = 11) final float r, @e(id = 12) final float s, @e(id = 13) final com.google.android.gms.vision.face.internal.client.c[] t, @e(id = 15) final float u) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p15;
        this.Q = q;
        this.R = r;
        this.S = s;
        this.T = t;
        this.U = u;
    }
    
    @UsedByNative("wrapper.cc")
    public a(@e(id = 1) final int n, @e(id = 2) final int n2, @e(id = 3) final float n3, @e(id = 4) final float n4, @e(id = 5) final float n5, @e(id = 6) final float n6, @e(id = 7) final float n7, @e(id = 8) final float n8, @RecentlyNonNull @e(id = 9) final com.google.android.gms.vision.face.internal.client.b[] array, @e(id = 10) final float n9, @e(id = 11) final float n10, @e(id = 12) final float n11) {
        this(n, n2, n3, n4, n5, n6, n7, n8, 0.0f, array, n9, n10, n11, new com.google.android.gms.vision.face.internal.client.c[0], -1.0f);
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.F(parcel, 2, this.H);
        h2.c.w(parcel, 3, this.I);
        h2.c.w(parcel, 4, this.J);
        h2.c.w(parcel, 5, this.K);
        h2.c.w(parcel, 6, this.L);
        h2.c.w(parcel, 7, this.M);
        h2.c.w(parcel, 8, this.N);
        h2.c.b0(parcel, 9, this.P, n, false);
        h2.c.w(parcel, 10, this.Q);
        h2.c.w(parcel, 11, this.R);
        h2.c.w(parcel, 12, this.S);
        h2.c.b0(parcel, 13, this.T, n, false);
        h2.c.w(parcel, 14, this.O);
        h2.c.w(parcel, 15, this.U);
        h2.c.b(parcel, a);
    }
}
