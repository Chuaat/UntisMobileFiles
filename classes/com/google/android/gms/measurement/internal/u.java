// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.x;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "EventParcelCreator")
@f({ 1 })
public final class u extends a
{
    public static final Parcelable$Creator<u> CREATOR;
    @c(id = 2)
    public final String G;
    @c(id = 3)
    public final s H;
    @c(id = 4)
    public final String I;
    @c(id = 5)
    public final long J;
    
    static {
        CREATOR = (Parcelable$Creator)new v();
    }
    
    u(final u u, final long j) {
        x.k(u);
        this.G = u.G;
        this.H = u.H;
        this.I = u.I;
        this.J = j;
    }
    
    @b
    public u(@e(id = 2) final String g, @e(id = 3) final s h, @e(id = 4) final String i, @e(id = 5) final long j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final String toString() {
        final String i = this.I;
        final String g = this.G;
        final String value = String.valueOf(this.H);
        final StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21 + String.valueOf(g).length() + value.length());
        sb.append("origin=");
        sb.append(i);
        sb.append(",name=");
        sb.append(g);
        sb.append(",params=");
        sb.append(value);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        v.a(this, parcel, n);
    }
}
