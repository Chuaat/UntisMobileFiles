// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.x;
import androidx.annotation.k0;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "UserAttributeParcelCreator")
public final class ca extends a
{
    public static final Parcelable$Creator<ca> CREATOR;
    @c(id = 1)
    public final int G;
    @c(id = 2)
    public final String H;
    @c(id = 3)
    public final long I;
    @k0
    @c(id = 4)
    public final Long J;
    @k0
    @c(id = 6)
    public final String K;
    @k0
    @c(id = 7)
    public final String L;
    @k0
    @c(id = 8)
    public final Double M;
    
    static {
        CREATOR = (Parcelable$Creator)new da();
    }
    
    @b
    ca(@e(id = 1) final int g, @e(id = 2) final String h, @e(id = 3) final long i, @k0 @e(id = 4) final Long j, @e(id = 5) final Float n, @k0 @e(id = 6) final String k, @k0 @e(id = 7) final String l, @k0 @e(id = 8) final Double m) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        if (g == 1) {
            Double value;
            if (n != null) {
                value = (double)n;
            }
            else {
                value = null;
            }
            this.M = value;
        }
        else {
            this.M = m;
        }
        this.K = k;
        this.L = l;
    }
    
    ca(final ea ea) {
        this(ea.c, ea.d, ea.e, ea.b);
    }
    
    ca(final String h, final long i, @k0 final Object o, @k0 final String l) {
        x.g(h);
        this.G = 2;
        this.H = h;
        this.I = i;
        this.L = l;
        if (o == null) {
            this.J = null;
            this.M = null;
            this.K = null;
            return;
        }
        if (o instanceof Long) {
            this.J = (Long)o;
            this.M = null;
            this.K = null;
            return;
        }
        if (o instanceof String) {
            this.J = null;
            this.M = null;
            this.K = (String)o;
            return;
        }
        if (o instanceof Double) {
            this.J = null;
            this.M = (Double)o;
            this.K = null;
            return;
        }
        throw new IllegalArgumentException("User attribute given of un-supported type");
    }
    
    @k0
    public final Object M() {
        final Long j = this.J;
        if (j != null) {
            return j;
        }
        final Double m = this.M;
        if (m != null) {
            return m;
        }
        final String k = this.K;
        if (k != null) {
            return k;
        }
        return null;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        da.a(this, parcel, n);
    }
}
