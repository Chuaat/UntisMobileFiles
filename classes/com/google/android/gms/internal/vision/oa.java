// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import h2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "FrameMetadataParcelCreator")
@f({ 1 })
public final class oa extends a
{
    public static final Parcelable$Creator<oa> CREATOR;
    @c(id = 2)
    public int G;
    @c(id = 3)
    public int H;
    @c(id = 4)
    public int I;
    @c(id = 5)
    public long J;
    @c(id = 6)
    public int K;
    
    static {
        CREATOR = (Parcelable$Creator)new ra();
    }
    
    public oa() {
    }
    
    @b
    public oa(@e(id = 2) final int g, @e(id = 3) final int h, @e(id = 4) final int i, @e(id = 5) final long j, @e(id = 6) final int k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public static oa M(final com.google.android.gms.vision.d d) {
        final oa oa = new oa();
        oa.G = d.c().f();
        oa.H = d.c().b();
        oa.K = d.c().d();
        oa.I = d.c().c();
        oa.J = d.c().e();
        return oa;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 2, this.G);
        h2.c.F(parcel, 3, this.H);
        h2.c.F(parcel, 4, this.I);
        h2.c.K(parcel, 5, this.J);
        h2.c.F(parcel, 6, this.K);
        h2.c.b(parcel, a);
    }
}
