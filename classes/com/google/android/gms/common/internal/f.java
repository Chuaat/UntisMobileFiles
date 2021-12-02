// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import h2.c;
import android.os.Parcel;
import androidx.annotation.k0;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@f2.a
@h2.d.a(creator = "ClientIdentityCreator")
@h2.d.f({ 1000 })
public class f extends a
{
    @RecentlyNonNull
    @f2.a
    public static final Parcelable$Creator<f> CREATOR;
    @c(defaultValueUnchecked = "0", id = 1)
    private final int G;
    @k0
    @c(defaultValueUnchecked = "null", id = 2)
    private final String H;
    
    static {
        CREATOR = (Parcelable$Creator)new e0();
    }
    
    @b
    public f(@RecentlyNonNull @e(id = 1) final int g, @k0 @e(id = 2) final String h) {
        this.G = g;
        this.H = h;
    }
    
    @RecentlyNonNull
    @Override
    public boolean equals(@k0 final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return f.G == this.G && v.b(f.H, this.H);
    }
    
    @RecentlyNonNull
    @Override
    public int hashCode() {
        return this.G;
    }
    
    @RecentlyNonNull
    @Override
    public String toString() {
        final int g = this.G;
        final String h = this.H;
        final StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 12);
        sb.append(g);
        sb.append(":");
        sb.append(h);
        return sb.toString();
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.X(parcel, 2, this.H, false);
        h2.c.b(parcel, a);
    }
}
