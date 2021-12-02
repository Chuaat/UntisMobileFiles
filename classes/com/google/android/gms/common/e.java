// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import h2.c;
import android.os.Parcel;
import androidx.annotation.k0;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@f2.a
@h2.d.a(creator = "FeatureCreator")
public class e extends a
{
    @RecentlyNonNull
    public static final Parcelable$Creator<e> CREATOR;
    @c(getter = "getName", id = 1)
    private final String G;
    @Deprecated
    @c(getter = "getOldVersion", id = 2)
    private final int H;
    @c(defaultValue = "-1", getter = "getVersion", id = 3)
    private final long I;
    
    static {
        CREATOR = (Parcelable$Creator)new v();
    }
    
    @b
    public e(@RecentlyNonNull @h2.d.e(id = 1) final String g, @RecentlyNonNull @h2.d.e(id = 2) final int h, @RecentlyNonNull @h2.d.e(id = 3) final long i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @f2.a
    public e(@RecentlyNonNull final String g, @RecentlyNonNull final long i) {
        this.G = g;
        this.I = i;
        this.H = -1;
    }
    
    @RecentlyNonNull
    @f2.a
    public String M() {
        return this.G;
    }
    
    @RecentlyNonNull
    @Override
    public boolean equals(@k0 final Object o) {
        if (o instanceof e) {
            final e e = (e)o;
            if (((this.M() != null && this.M().equals(e.M())) || (this.M() == null && e.M() == null)) && this.g1() == e.g1()) {
                return true;
            }
        }
        return false;
    }
    
    @RecentlyNonNull
    @f2.a
    public long g1() {
        long i;
        if ((i = this.I) == -1L) {
            i = this.H;
        }
        return i;
    }
    
    @RecentlyNonNull
    @Override
    public int hashCode() {
        return com.google.android.gms.common.internal.v.c(this.M(), this.g1());
    }
    
    @RecentlyNonNull
    @Override
    public String toString() {
        return com.google.android.gms.common.internal.v.d(this).a("name", this.M()).a("version", this.g1()).toString();
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int a) {
        a = h2.c.a(parcel);
        h2.c.X(parcel, 1, this.M(), false);
        h2.c.F(parcel, 2, this.H);
        h2.c.K(parcel, 3, this.g1());
        h2.c.b(parcel, a);
    }
}
