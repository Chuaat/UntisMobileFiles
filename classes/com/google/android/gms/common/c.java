// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import android.os.Parcelable;
import android.os.Parcel;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.v;
import android.content.IntentSender$SendIntentException;
import android.content.Intent;
import com.google.android.gms.common.internal.x;
import android.app.Activity;
import androidx.annotation.j0;
import androidx.annotation.k0;
import android.app.PendingIntent;
import com.google.android.gms.common.internal.b0;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "ConnectionResultCreator")
public final class c extends a
{
    @RecentlyNonNull
    public static final Parcelable$Creator<c> CREATOR;
    @RecentlyNonNull
    @f2.a
    public static final int K = -1;
    @RecentlyNonNull
    public static final int L = 0;
    @RecentlyNonNull
    public static final int M = 1;
    @RecentlyNonNull
    public static final int N = 2;
    @RecentlyNonNull
    public static final int O = 3;
    @RecentlyNonNull
    public static final int P = 4;
    @RecentlyNonNull
    public static final int Q = 5;
    @RecentlyNonNull
    public static final int R = 6;
    @RecentlyNonNull
    public static final int S = 7;
    @RecentlyNonNull
    public static final int T = 8;
    @RecentlyNonNull
    public static final int U = 9;
    @RecentlyNonNull
    public static final int V = 10;
    @RecentlyNonNull
    public static final int W = 11;
    @RecentlyNonNull
    public static final int X = 13;
    @RecentlyNonNull
    public static final int Y = 14;
    @RecentlyNonNull
    public static final int Z = 15;
    @RecentlyNonNull
    public static final int a0 = 16;
    @RecentlyNonNull
    public static final int b0 = 17;
    @RecentlyNonNull
    public static final int c0 = 18;
    @RecentlyNonNull
    public static final int d0 = 19;
    @RecentlyNonNull
    public static final int e0 = 20;
    @RecentlyNonNull
    public static final int f0 = 22;
    @Deprecated
    @RecentlyNonNull
    public static final int g0 = 1500;
    @RecentlyNonNull
    @b0
    @f2.a
    public static final c h0;
    @g(id = 1)
    private final int G;
    @h2.d.c(getter = "getErrorCode", id = 2)
    private final int H;
    @k0
    @h2.d.c(getter = "getResolution", id = 3)
    private final PendingIntent I;
    @k0
    @h2.d.c(getter = "getErrorMessage", id = 4)
    private final String J;
    
    static {
        h0 = new c(0);
        CREATOR = (Parcelable$Creator)new u();
    }
    
    public c(@RecentlyNonNull final int n) {
        this(n, null, null);
    }
    
    @b
    c(@e(id = 1) final int g, @e(id = 2) final int h, @k0 @e(id = 3) final PendingIntent i, @k0 @e(id = 4) final String j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public c(@RecentlyNonNull final int n, @k0 final PendingIntent pendingIntent) {
        this(n, pendingIntent, null);
    }
    
    public c(@RecentlyNonNull final int n, @k0 final PendingIntent pendingIntent, @k0 final String s) {
        this(1, n, pendingIntent, s);
    }
    
    @j0
    static String i3(final int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            default: {
                switch (i) {
                    default: {
                        final StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                    }
                    case 22: {
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    }
                    case 21: {
                        return "API_VERSION_UPDATE_REQUIRED";
                    }
                    case 20: {
                        return "RESTRICTED_PROFILE";
                    }
                    case 19: {
                        return "SERVICE_MISSING_PERMISSION";
                    }
                    case 18: {
                        return "SERVICE_UPDATING";
                    }
                    case 17: {
                        return "SIGN_IN_FAILED";
                    }
                    case 16: {
                        return "API_UNAVAILABLE";
                    }
                    case 15: {
                        return "INTERRUPTED";
                    }
                    case 14: {
                        return "TIMEOUT";
                    }
                    case 13: {
                        return "CANCELED";
                    }
                }
                break;
            }
            case 11: {
                return "LICENSE_CHECK_FAILED";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 9: {
                return "SERVICE_INVALID";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 1: {
                return "SERVICE_MISSING";
            }
            case 0: {
                return "SUCCESS";
            }
            case -1: {
                return "UNKNOWN";
            }
        }
    }
    
    @RecentlyNonNull
    public final int M() {
        return this.H;
    }
    
    public final void N2(@RecentlyNonNull final Activity activity, @RecentlyNonNull final int n) throws IntentSender$SendIntentException {
        if (!this.Q1()) {
            return;
        }
        activity.startIntentSenderForResult(x.k(this.I).getIntentSender(), n, (Intent)null, 0, 0, 0);
    }
    
    @RecentlyNonNull
    public final boolean Q1() {
        return this.H != 0 && this.I != null;
    }
    
    @RecentlyNonNull
    @Override
    public final boolean equals(@k0 final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return this.H == c.H && v.b(this.I, c.I) && v.b(this.J, c.J);
    }
    
    @RecentlyNullable
    public final String g1() {
        return this.J;
    }
    
    @RecentlyNonNull
    @Override
    public final int hashCode() {
        return v.c(this.H, this.I, this.J);
    }
    
    @RecentlyNonNull
    public final boolean j2() {
        return this.H == 0;
    }
    
    @RecentlyNullable
    public final PendingIntent q1() {
        return this.I;
    }
    
    @RecentlyNonNull
    @Override
    public final String toString() {
        return v.d(this).a("statusCode", i3(this.H)).a("resolution", this.I).a("message", this.J).toString();
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.F(parcel, 2, this.M());
        h2.c.S(parcel, 3, (Parcelable)this.q1(), n, false);
        h2.c.X(parcel, 4, this.g1(), false);
        h2.c.b(parcel, a);
    }
}
