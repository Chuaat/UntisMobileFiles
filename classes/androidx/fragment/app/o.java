// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import java.util.List;
import android.os.Parcel;
import android.os.Bundle;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
final class o implements Parcelable
{
    public static final Parcelable$Creator<o> CREATOR;
    ArrayList<u> G;
    ArrayList<String> H;
    b[] I;
    int J;
    String K;
    ArrayList<String> L;
    ArrayList<Bundle> M;
    ArrayList<FragmentManager.n> N;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<o>() {
            public o a(final Parcel parcel) {
                return new o(parcel);
            }
            
            public o[] b(final int n) {
                return new o[n];
            }
        };
    }
    
    public o() {
        this.K = null;
        this.L = new ArrayList<String>();
        this.M = new ArrayList<Bundle>();
    }
    
    public o(final Parcel parcel) {
        this.K = null;
        this.L = new ArrayList<String>();
        this.M = new ArrayList<Bundle>();
        this.G = (ArrayList<u>)parcel.createTypedArrayList((Parcelable$Creator)u.CREATOR);
        this.H = (ArrayList<String>)parcel.createStringArrayList();
        this.I = (b[])parcel.createTypedArray((Parcelable$Creator)b.CREATOR);
        this.J = parcel.readInt();
        this.K = parcel.readString();
        this.L = (ArrayList<String>)parcel.createStringArrayList();
        this.M = (ArrayList<Bundle>)parcel.createTypedArrayList(Bundle.CREATOR);
        this.N = (ArrayList<FragmentManager.n>)parcel.createTypedArrayList((Parcelable$Creator)FragmentManager.n.CREATOR);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeTypedList((List)this.G);
        parcel.writeStringList((List)this.H);
        parcel.writeTypedArray((Parcelable[])this.I, n);
        parcel.writeInt(this.J);
        parcel.writeString(this.K);
        parcel.writeStringList((List)this.L);
        parcel.writeTypedList((List)this.M);
        parcel.writeTypedList((List)this.N);
    }
}
