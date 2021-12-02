// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import androidx.annotation.j0;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.t0;
import android.os.Parcelable;
import android.util.SparseBooleanArray;

@t0({ t0.a.H })
public class l extends SparseBooleanArray implements Parcelable
{
    public static final Parcelable$Creator<l> CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<l>() {
            @j0
            public l a(@j0 final Parcel parcel) {
                final int int1 = parcel.readInt();
                final l l = new l(int1);
                final int[] array = new int[int1];
                final boolean[] array2 = new boolean[int1];
                parcel.readIntArray(array);
                parcel.readBooleanArray(array2);
                for (int i = 0; i < int1; ++i) {
                    l.put(array[i], array2[i]);
                }
                return l;
            }
            
            @j0
            public l[] b(final int n) {
                return new l[n];
            }
        };
    }
    
    public l() {
    }
    
    public l(final int n) {
        super(n);
    }
    
    public l(@j0 final SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); ++i) {
            this.put(sparseBooleanArray.keyAt(i), sparseBooleanArray.valueAt(i));
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(@j0 final Parcel parcel, int i) {
        final int[] array = new int[this.size()];
        final boolean[] array2 = new boolean[this.size()];
        for (i = 0; i < this.size(); ++i) {
            array[i] = this.keyAt(i);
            array2[i] = this.valueAt(i);
        }
        parcel.writeInt(this.size());
        parcel.writeIntArray(array);
        parcel.writeBooleanArray(array2);
    }
}
