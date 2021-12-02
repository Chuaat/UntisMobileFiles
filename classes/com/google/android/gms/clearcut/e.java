// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.clearcut;

import h2.c;
import android.os.Parcel;
import com.google.android.gms.common.internal.v;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "CollectForDebugParcelableCreator")
public final class e extends a
{
    public static final Parcelable$Creator<e> CREATOR;
    @c(defaultValue = "false", id = 1)
    private final boolean G;
    @c(id = 3)
    private final long H;
    @c(id = 2)
    private final long I;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.clearcut.f();
    }
    
    @b
    public e(@h2.d.e(id = 1) final boolean g, @h2.d.e(id = 3) final long h, @h2.d.e(id = 2) final long i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof e) {
            final e e = (e)o;
            if (this.G == e.G && this.H == e.H && this.I == e.I) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return v.c(this.G, this.H, this.I);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb.append(this.G);
        sb.append(",collectForDebugStartTimeMillis: ");
        sb.append(this.H);
        sb.append(",collectForDebugExpiryTimeMillis: ");
        sb.append(this.I);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.g(parcel, 1, this.G);
        h2.c.K(parcel, 2, this.I);
        h2.c.K(parcel, 3, this.H);
        h2.c.b(parcel, a);
    }
}
