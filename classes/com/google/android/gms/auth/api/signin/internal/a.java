// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.auth.api.signin.internal;

import h2.c;
import android.os.Parcel;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;

@h2.d.a(creator = "GoogleSignInOptionsExtensionCreator")
public class a extends h2.a
{
    @RecentlyNonNull
    public static final Parcelable$Creator<a> CREATOR;
    @g(id = 1)
    private final int G;
    @c(getter = "getType", id = 2)
    private int H;
    @c(getter = "getBundle", id = 3)
    private Bundle I;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    @b
    a(@e(id = 1) final int g, @e(id = 2) final int h, @e(id = 3) final Bundle i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public a(@RecentlyNonNull final com.google.android.gms.auth.api.signin.a a) {
        this(1, a.a(), a.c());
    }
    
    @RecentlyNonNull
    @f2.a
    public int M() {
        return this.H;
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.F(parcel, 2, this.M());
        h2.c.k(parcel, 3, this.I, false);
        h2.c.b(parcel, a);
    }
}
