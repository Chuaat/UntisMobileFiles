// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import java.util.Arrays;
import androidx.annotation.j0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class i implements c
{
    public static final Parcelable$Creator<i> CREATOR;
    private final long G;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<i>() {
            @j0
            public i a(@j0 final Parcel parcel) {
                return new i(parcel.readLong(), null);
            }
            
            @j0
            public i[] b(final int n) {
                return new i[n];
            }
        };
    }
    
    private i(final long g) {
        this.G = g;
    }
    
    @j0
    public static i a(final long n) {
        return new i(n);
    }
    
    @j0
    public static i b() {
        return a(u.t().getTimeInMillis());
    }
    
    @Override
    public boolean S3(final long n) {
        return n >= this.G;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        if (this.G != ((i)o).G) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.G });
    }
    
    public void writeToParcel(@j0 final Parcel parcel, final int n) {
        parcel.writeLong(this.G);
    }
}
