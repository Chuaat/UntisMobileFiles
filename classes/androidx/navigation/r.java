// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import androidx.annotation.j0;
import androidx.annotation.k0;
import android.os.Parcel;
import android.os.Bundle;
import java.util.UUID;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
final class r implements Parcelable
{
    public static final Parcelable$Creator<r> CREATOR;
    private final UUID G;
    private final int H;
    private final Bundle I;
    private final Bundle J;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<r>() {
            public r a(final Parcel parcel) {
                return new r(parcel);
            }
            
            public r[] b(final int n) {
                return new r[n];
            }
        };
    }
    
    r(final Parcel parcel) {
        this.G = UUID.fromString(parcel.readString());
        this.H = parcel.readInt();
        this.I = parcel.readBundle(r.class.getClassLoader());
        this.J = parcel.readBundle(r.class.getClassLoader());
    }
    
    r(final q q) {
        this.G = q.L;
        this.H = q.b().p();
        this.I = q.a();
        q.h(this.J = new Bundle());
    }
    
    @k0
    Bundle a() {
        return this.I;
    }
    
    int b() {
        return this.H;
    }
    
    @j0
    Bundle c() {
        return this.J;
    }
    
    @j0
    UUID d() {
        return this.G;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(@j0 final Parcel parcel, final int n) {
        parcel.writeString(this.G.toString());
        parcel.writeInt(this.H);
        parcel.writeBundle(this.I);
        parcel.writeBundle(this.J);
    }
}
