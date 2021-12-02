// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import h2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "SymbolBoxParcelCreator")
@f({ 1 })
public final class m extends a
{
    public static final Parcelable$Creator<m> CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new l();
    }
    
    @b
    public m() {
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        h2.c.b(parcel, h2.c.a(parcel));
    }
}
