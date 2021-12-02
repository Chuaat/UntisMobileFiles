// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import h2.c;
import android.os.Parcel;
import androidx.annotation.k0;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.a;

@f2.a
@h2.d.a(creator = "ScopeCreator")
public final class Scope extends a implements ReflectedParcelable
{
    @RecentlyNonNull
    public static final Parcelable$Creator<Scope> CREATOR;
    @g(id = 1)
    private final int G;
    @c(getter = "getScopeUri", id = 2)
    private final String H;
    
    static {
        CREATOR = (Parcelable$Creator)new d0();
    }
    
    @b
    Scope(@e(id = 1) final int g, @e(id = 2) final String h) {
        x.h(h, "scopeUri must not be null or empty");
        this.G = g;
        this.H = h;
    }
    
    public Scope(@RecentlyNonNull final String s) {
        this(1, s);
    }
    
    @RecentlyNonNull
    @f2.a
    public final String M() {
        return this.H;
    }
    
    @RecentlyNonNull
    @Override
    public final boolean equals(@k0 final Object o) {
        return this == o || (o instanceof Scope && this.H.equals(((Scope)o).H));
    }
    
    @RecentlyNonNull
    @Override
    public final int hashCode() {
        return this.H.hashCode();
    }
    
    @RecentlyNonNull
    @Override
    public final String toString() {
        return this.H;
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.X(parcel, 2, this.M(), false);
        h2.c.b(parcel, a);
    }
}
