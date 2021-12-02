// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import h2.c;
import android.os.Parcel;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.x;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "PlayLoggerContextCreator")
@f({ 1 })
public final class t6 extends a
{
    public static final Parcelable$Creator<t6> CREATOR;
    @c(id = 2)
    private final String G;
    @c(id = 3)
    private final int H;
    @c(id = 4)
    public final int I;
    @c(id = 5)
    private final String J;
    @c(id = 6)
    private final String K;
    @c(defaultValue = "true", id = 7)
    private final boolean L;
    @c(id = 8)
    public final String M;
    @c(id = 9)
    private final boolean N;
    @c(id = 10)
    private final int O;
    
    static {
        CREATOR = (Parcelable$Creator)new u6();
    }
    
    public t6(final String s, final int h, final int i, final String m, final String j, final String k, final boolean n, final l5.v.b b) {
        this.G = x.k(s);
        this.H = h;
        this.I = i;
        this.M = m;
        this.J = j;
        this.K = k;
        this.L = (n ^ true);
        this.N = n;
        this.O = b.a();
    }
    
    @b
    public t6(@e(id = 2) final String g, @e(id = 3) final int h, @e(id = 4) final int i, @e(id = 5) final String j, @e(id = 6) final String k, @e(id = 7) final boolean l, @e(id = 8) final String m, @e(id = 9) final boolean n, @e(id = 10) final int o) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof t6) {
            final t6 t6 = (t6)o;
            if (v.b(this.G, t6.G) && this.H == t6.H && this.I == t6.I && v.b(this.M, t6.M) && v.b(this.J, t6.J) && v.b(this.K, t6.K) && this.L == t6.L && this.N == t6.N && this.O == t6.O) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return v.c(this.G, this.H, this.I, this.M, this.J, this.K, this.L, this.N, this.O);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PlayLoggerContext[");
        sb.append("package=");
        sb.append(this.G);
        sb.append(',');
        sb.append("packageVersionCode=");
        sb.append(this.H);
        sb.append(',');
        sb.append("logSource=");
        sb.append(this.I);
        sb.append(',');
        sb.append("logSourceName=");
        sb.append(this.M);
        sb.append(',');
        sb.append("uploadAccount=");
        sb.append(this.J);
        sb.append(',');
        sb.append("loggingId=");
        sb.append(this.K);
        sb.append(',');
        sb.append("logAndroidId=");
        sb.append(this.L);
        sb.append(',');
        sb.append("isAnonymous=");
        sb.append(this.N);
        sb.append(',');
        sb.append("qosTier=");
        sb.append(this.O);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.X(parcel, 2, this.G, false);
        h2.c.F(parcel, 3, this.H);
        h2.c.F(parcel, 4, this.I);
        h2.c.X(parcel, 5, this.J, false);
        h2.c.X(parcel, 6, this.K, false);
        h2.c.g(parcel, 7, this.L);
        h2.c.X(parcel, 8, this.M, false);
        h2.c.g(parcel, 9, this.N);
        h2.c.F(parcel, 10, this.O);
        h2.c.b(parcel, a);
    }
}
