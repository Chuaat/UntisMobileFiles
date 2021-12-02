// 
// Decompiled by Procyon v0.5.36
// 

package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.t0;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
@t0({ t0.a.G })
public class ParcelImpl implements Parcelable
{
    public static final Parcelable$Creator<ParcelImpl> CREATOR;
    private final h G;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ParcelImpl>() {
            public ParcelImpl a(final Parcel parcel) {
                return new ParcelImpl(parcel);
            }
            
            public ParcelImpl[] b(final int n) {
                return new ParcelImpl[n];
            }
        };
    }
    
    protected ParcelImpl(final Parcel parcel) {
        this.G = new f(parcel).g0();
    }
    
    public ParcelImpl(final h g) {
        this.G = g;
    }
    
    public <T extends h> T a() {
        return (T)this.G;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        new f(parcel).l1(this.G);
    }
}
