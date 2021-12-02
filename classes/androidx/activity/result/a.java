// 
// Decompiled by Procyon v0.5.36
// 

package androidx.activity.result;

import android.os.Parcel;
import androidx.annotation.k0;
import android.content.Intent;
import androidx.annotation.j0;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class a implements Parcelable
{
    @j0
    public static final Parcelable$Creator<a> CREATOR;
    private final int G;
    @k0
    private final Intent H;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
            public a a(@j0 final Parcel parcel) {
                return new a(parcel);
            }
            
            public a[] b(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final int g, @k0 final Intent h) {
        this.G = g;
        this.H = h;
    }
    
    a(final Parcel parcel) {
        this.G = parcel.readInt();
        Intent h;
        if (parcel.readInt() == 0) {
            h = null;
        }
        else {
            h = (Intent)Intent.CREATOR.createFromParcel(parcel);
        }
        this.H = h;
    }
    
    @j0
    public static String c(final int i) {
        if (i == -1) {
            return "RESULT_OK";
        }
        if (i != 0) {
            return String.valueOf(i);
        }
        return "RESULT_CANCELED";
    }
    
    @k0
    public Intent a() {
        return this.H;
    }
    
    public int b() {
        return this.G;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ActivityResult{resultCode=");
        sb.append(c(this.G));
        sb.append(", data=");
        sb.append(this.H);
        sb.append('}');
        return sb.toString();
    }
    
    public void writeToParcel(@j0 final Parcel parcel, final int n) {
        parcel.writeInt(this.G);
        int n2;
        if (this.H == null) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        parcel.writeInt(n2);
        final Intent h = this.H;
        if (h != null) {
            h.writeToParcel(parcel, n);
        }
    }
}
