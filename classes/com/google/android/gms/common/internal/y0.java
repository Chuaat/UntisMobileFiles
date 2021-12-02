// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import h2.c;
import android.os.Parcel;
import androidx.annotation.k0;
import com.google.android.gms.common.api.Scope;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "SignInButtonConfigCreator")
public final class y0 extends a
{
    public static final Parcelable$Creator<y0> CREATOR;
    @g(id = 1)
    private final int G;
    @c(getter = "getButtonSize", id = 2)
    private final int H;
    @c(getter = "getColorScheme", id = 3)
    private final int I;
    @Deprecated
    @k0
    @c(getter = "getScopes", id = 4)
    private final Scope[] J;
    
    static {
        CREATOR = (Parcelable$Creator)new b1();
    }
    
    @b
    y0(@e(id = 1) final int g, @e(id = 2) final int h, @e(id = 3) final int i, @k0 @e(id = 4) final Scope[] j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public y0(final int n, final int n2, @k0 final Scope[] array) {
        this(1, n, n2, null);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.F(parcel, 2, this.H);
        h2.c.F(parcel, 3, this.I);
        h2.c.b0(parcel, 4, this.J, n, false);
        h2.c.b(parcel, a);
    }
}
