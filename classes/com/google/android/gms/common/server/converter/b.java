// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.server.converter;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "ConverterWrapperCreator")
public final class b extends a
{
    public static final Parcelable$Creator<b> CREATOR;
    @g(id = 1)
    private final int G;
    @c(getter = "getStringToIntConverter", id = 2)
    private final com.google.android.gms.common.server.converter.a H;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.common.server.converter.c();
    }
    
    @h2.d.b
    b(@e(id = 1) final int g, @e(id = 2) final com.google.android.gms.common.server.converter.a h) {
        this.G = g;
        this.H = h;
    }
    
    private b(final com.google.android.gms.common.server.converter.a h) {
        this.G = 1;
        this.H = h;
    }
    
    public static b M(final com.google.android.gms.common.server.response.a.b<?, ?> b) {
        if (b instanceof com.google.android.gms.common.server.converter.a) {
            return new b((com.google.android.gms.common.server.converter.a)b);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }
    
    public final com.google.android.gms.common.server.response.a.b<?, ?> g1() {
        final com.google.android.gms.common.server.converter.a h = this.H;
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.S(parcel, 2, (Parcelable)this.H, n, false);
        h2.c.b(parcel, a);
    }
}
