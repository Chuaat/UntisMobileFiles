// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.signin.internal;

import android.os.Parcelable;
import android.os.Parcel;
import android.app.PendingIntent;
import androidx.annotation.k0;
import com.google.android.gms.common.internal.w0;
import com.google.android.gms.common.c;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "SignInResponseCreator")
public final class n extends a
{
    public static final Parcelable$Creator<n> CREATOR;
    @g(id = 1)
    private final int G;
    @c(getter = "getConnectionResult", id = 2)
    private final com.google.android.gms.common.c H;
    @k0
    @c(getter = "getResolveAccountResponse", id = 3)
    private final w0 I;
    
    static {
        CREATOR = (Parcelable$Creator)new m();
    }
    
    public n(final int n) {
        this(new com.google.android.gms.common.c(8, null), null);
    }
    
    @b
    n(@e(id = 1) final int g, @e(id = 2) final com.google.android.gms.common.c h, @k0 @e(id = 3) final w0 i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    private n(final com.google.android.gms.common.c c, @k0 final w0 w0) {
        this(1, c, null);
    }
    
    public final com.google.android.gms.common.c M() {
        return this.H;
    }
    
    @k0
    public final w0 g1() {
        return this.I;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.S(parcel, 2, (Parcelable)this.H, n, false);
        h2.c.S(parcel, 3, (Parcelable)this.I, n, false);
        h2.c.b(parcel, a);
    }
}
