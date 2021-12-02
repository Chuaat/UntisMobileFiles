// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.stats;

import h2.c;
import android.os.Parcel;
import android.text.TextUtils;
import c6.h;
import java.util.List;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import f2.a;

@Deprecated
@f2.a
@h2.d.a(creator = "WakeLockEventCreator")
public final class WakeLockEvent extends StatsEvent
{
    @RecentlyNonNull
    public static final Parcelable$Creator<WakeLockEvent> CREATOR;
    @g(id = 1)
    private final int G;
    @c(getter = "getTimeMillis", id = 2)
    private final long H;
    @c(getter = "getEventType", id = 11)
    private int I;
    @c(getter = "getWakeLockName", id = 4)
    private final String J;
    @c(getter = "getSecondaryWakeLockName", id = 10)
    private final String K;
    @c(getter = "getCodePackage", id = 17)
    private final String L;
    @c(getter = "getWakeLockType", id = 5)
    private final int M;
    @h
    @c(getter = "getCallingPackages", id = 6)
    private final List<String> N;
    @c(getter = "getEventKey", id = 12)
    private final String O;
    @c(getter = "getElapsedRealtime", id = 8)
    private final long P;
    @c(getter = "getDeviceState", id = 14)
    private int Q;
    @c(getter = "getHostPackage", id = 13)
    private final String R;
    @c(getter = "getBeginPowerPercentage", id = 15)
    private final float S;
    @c(getter = "getTimeout", id = 16)
    private final long T;
    @c(getter = "getAcquiredWithTimeout", id = 18)
    private final boolean U;
    private long V;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.common.stats.e();
    }
    
    @b
    WakeLockEvent(@e(id = 1) final int g, @e(id = 2) final long h, @e(id = 11) final int i, @e(id = 4) final String j, @e(id = 5) final int m, @h @e(id = 6) final List<String> n, @e(id = 12) final String o, @e(id = 8) final long p15, @e(id = 14) final int q, @e(id = 10) final String k, @e(id = 13) final String r, @e(id = 15) final float s, @e(id = 16) final long t, @e(id = 17) final String l, @e(id = 18) final boolean u) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.V = -1L;
        this.N = n;
        this.O = o;
        this.P = p15;
        this.Q = q;
        this.R = r;
        this.S = s;
        this.T = t;
        this.U = u;
    }
    
    @RecentlyNonNull
    @Override
    public final long M() {
        return this.H;
    }
    
    @RecentlyNonNull
    @Override
    public final String Q1() {
        final List<String> n = this.N;
        final String j = this.J;
        final int m = this.M;
        String s = "";
        String join;
        if (n == null) {
            join = "";
        }
        else {
            join = TextUtils.join((CharSequence)",", (Iterable)n);
        }
        final int q = this.Q;
        String k;
        if ((k = this.K) == null) {
            k = "";
        }
        String r;
        if ((r = this.R) == null) {
            r = "";
        }
        final float s2 = this.S;
        final String l = this.L;
        if (l != null) {
            s = l;
        }
        final boolean u = this.U;
        final StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 51 + String.valueOf(join).length() + String.valueOf(k).length() + String.valueOf(r).length() + String.valueOf(s).length());
        sb.append("\t");
        sb.append(j);
        sb.append("\t");
        sb.append(m);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(q);
        sb.append("\t");
        sb.append(k);
        sb.append("\t");
        sb.append(r);
        sb.append("\t");
        sb.append(s2);
        sb.append("\t");
        sb.append(s);
        sb.append("\t");
        sb.append(u);
        return sb.toString();
    }
    
    @RecentlyNonNull
    @Override
    public final int g1() {
        return this.I;
    }
    
    @RecentlyNonNull
    @Override
    public final long q1() {
        return this.V;
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.K(parcel, 2, this.M());
        h2.c.X(parcel, 4, this.J, false);
        h2.c.F(parcel, 5, this.M);
        h2.c.Z(parcel, 6, this.N, false);
        h2.c.K(parcel, 8, this.P);
        h2.c.X(parcel, 10, this.K, false);
        h2.c.F(parcel, 11, this.g1());
        h2.c.X(parcel, 12, this.O, false);
        h2.c.X(parcel, 13, this.R, false);
        h2.c.F(parcel, 14, this.Q);
        h2.c.w(parcel, 15, this.S);
        h2.c.K(parcel, 16, this.T);
        h2.c.X(parcel, 17, this.L, false);
        h2.c.g(parcel, 18, this.U);
        h2.c.b(parcel, a);
    }
}
