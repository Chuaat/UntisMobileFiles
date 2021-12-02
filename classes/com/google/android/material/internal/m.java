// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import androidx.annotation.j0;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.t0;
import android.os.Parcelable;
import android.util.SparseIntArray;

@t0({ t0.a.H })
public class m extends SparseIntArray implements Parcelable
{
    public static final Parcelable$Creator<m> CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<m>() {
            @j0
            public m a(@j0 final Parcel parcel) {
                final int int1 = parcel.readInt();
                final m m = new m(int1);
                final int[] array = new int[int1];
                final int[] array2 = new int[int1];
                parcel.readIntArray(array);
                parcel.readIntArray(array2);
                for (int i = 0; i < int1; ++i) {
                    m.put(array[i], array2[i]);
                }
                return m;
            }
            
            @j0
            public m[] b(final int n) {
                return new m[n];
            }
        };
    }
    
    public m() {
    }
    
    public m(final int n) {
        super(n);
    }
    
    public m(@j0 final SparseIntArray sparseIntArray) {
        for (int i = 0; i < sparseIntArray.size(); ++i) {
            this.put(sparseIntArray.keyAt(i), sparseIntArray.valueAt(i));
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(@j0 final Parcel parcel, int i) {
        final int[] array = new int[this.size()];
        final int[] array2 = new int[this.size()];
        for (i = 0; i < this.size(); ++i) {
            array[i] = this.keyAt(i);
            array2[i] = this.valueAt(i);
        }
        parcel.writeInt(this.size());
        parcel.writeIntArray(array);
        parcel.writeIntArray(array2);
    }
}
