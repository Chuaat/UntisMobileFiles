// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.internal.v;
import android.content.IntentSender$SendIntentException;
import android.content.Intent;
import com.google.android.gms.common.internal.x;
import android.app.Activity;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.c;
import android.app.PendingIntent;
import androidx.annotation.k0;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.internal.b0;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.a;

@f2.a
@h2.d.a(creator = "StatusCreator")
public final class Status extends a implements t, ReflectedParcelable
{
    @RecentlyNonNull
    public static final Parcelable$Creator<Status> CREATOR;
    @RecentlyNonNull
    @b0
    @d0
    @f2.a
    public static final Status L;
    @RecentlyNonNull
    @b0
    @f2.a
    public static final Status M;
    @RecentlyNonNull
    @b0
    @f2.a
    public static final Status N;
    @RecentlyNonNull
    @b0
    @f2.a
    public static final Status O;
    @RecentlyNonNull
    @b0
    @f2.a
    public static final Status P;
    @b0
    private static final Status Q;
    @RecentlyNonNull
    @f2.a
    public static final Status R;
    @g(id = 1000)
    private final int G;
    @c(getter = "getStatusCode", id = 1)
    private final int H;
    @k0
    @c(getter = "getStatusMessage", id = 2)
    private final String I;
    @k0
    @c(getter = "getPendingIntent", id = 3)
    private final PendingIntent J;
    @k0
    @c(getter = "getConnectionResult", id = 4)
    private final com.google.android.gms.common.c K;
    
    static {
        L = new Status(0);
        M = new Status(14);
        N = new Status(8);
        O = new Status(15);
        P = new Status(16);
        Q = new Status(17);
        R = new Status(18);
        CREATOR = (Parcelable$Creator)new e0();
    }
    
    @f2.a
    public Status(@RecentlyNonNull final int n) {
        this(n, null);
    }
    
    @f2.a
    Status(final int n, final int n2, @k0 final String s, @k0 final PendingIntent pendingIntent) {
        this(n, n2, s, pendingIntent, null);
    }
    
    @f2.a
    @b
    Status(@e(id = 1000) final int g, @e(id = 1) final int h, @k0 @e(id = 2) final String i, @k0 @e(id = 3) final PendingIntent j, @k0 @e(id = 4) final com.google.android.gms.common.c k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @f2.a
    public Status(@RecentlyNonNull final int n, @k0 final String s) {
        this(1, n, s, null);
    }
    
    @f2.a
    public Status(@RecentlyNonNull final int n, @k0 final String s, @k0 final PendingIntent pendingIntent) {
        this(1, n, s, pendingIntent);
    }
    
    public Status(@RecentlyNonNull final com.google.android.gms.common.c c, @RecentlyNonNull final String s) {
        this(c, s, 17);
    }
    
    @Deprecated
    @f2.a
    public Status(@RecentlyNonNull final com.google.android.gms.common.c c, @RecentlyNonNull final String s, @RecentlyNonNull final int n) {
        this(1, n, s, c.q1(), c);
    }
    
    @RecentlyNullable
    public final com.google.android.gms.common.c M() {
        return this.K;
    }
    
    @RecentlyNonNull
    public final boolean N2() {
        return this.H == 16;
    }
    
    public final void O3(@RecentlyNonNull final Activity activity, @RecentlyNonNull final int n) throws IntentSender$SendIntentException {
        if (!this.j2()) {
            return;
        }
        activity.startIntentSenderForResult(x.k(this.J).getIntentSender(), n, (Intent)null, 0, 0, 0);
    }
    
    @RecentlyNullable
    public final String Q1() {
        return this.I;
    }
    
    @RecentlyNonNull
    public final String U3() {
        final String i = this.I;
        if (i != null) {
            return i;
        }
        return h.a(this.H);
    }
    
    @RecentlyNonNull
    @Override
    public final boolean equals(@k0 final Object o) {
        if (!(o instanceof Status)) {
            return false;
        }
        final Status status = (Status)o;
        return this.G == status.G && this.H == status.H && v.b(this.I, status.I) && v.b(this.J, status.J) && v.b(this.K, status.K);
    }
    
    @RecentlyNullable
    public final PendingIntent g1() {
        return this.J;
    }
    
    @RecentlyNonNull
    @f2.a
    @Override
    public final Status h() {
        return this;
    }
    
    @RecentlyNonNull
    @Override
    public final int hashCode() {
        return v.c(this.G, this.H, this.I, this.J, this.K);
    }
    
    @RecentlyNonNull
    public final boolean i3() {
        return this.H == 14;
    }
    
    @RecentlyNonNull
    @d0
    public final boolean j2() {
        return this.J != null;
    }
    
    @RecentlyNonNull
    public final boolean j3() {
        return this.H <= 0;
    }
    
    @RecentlyNonNull
    public final int q1() {
        return this.H;
    }
    
    @RecentlyNonNull
    @Override
    public final String toString() {
        return v.d(this).a("statusCode", this.U3()).a("resolution", this.J).toString();
    }
    
    @f2.a
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.q1());
        h2.c.X(parcel, 2, this.Q1(), false);
        h2.c.S(parcel, 3, (Parcelable)this.J, n, false);
        h2.c.S(parcel, 4, (Parcelable)this.M(), n, false);
        h2.c.F(parcel, 1000, this.G);
        h2.c.b(parcel, a);
    }
}
