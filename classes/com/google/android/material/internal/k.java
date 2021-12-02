// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import androidx.annotation.k0;
import androidx.annotation.j0;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import androidx.annotation.t0;
import android.os.Parcelable;
import android.util.SparseArray;

@t0({ t0.a.H })
public class k extends SparseArray<Parcelable> implements Parcelable
{
    public static final Parcelable$Creator<k> CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<k>() {
            @k0
            public k a(@j0 final Parcel parcel) {
                return new k(parcel, null);
            }
            
            @j0
            public k b(@j0 final Parcel parcel, final ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }
            
            @j0
            public k[] c(final int n) {
                return new k[n];
            }
        };
    }
    
    public k() {
    }
    
    public k(@j0 final Parcel parcel, @k0 final ClassLoader classLoader) {
        final int int1 = parcel.readInt();
        final int[] array = new int[int1];
        parcel.readIntArray(array);
        final Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < int1; ++i) {
            this.put(array[i], (Object)parcelableArray[i]);
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(@j0 final Parcel parcel, final int n) {
        final int size = this.size();
        final int[] array = new int[size];
        final Parcelable[] array2 = new Parcelable[size];
        for (int i = 0; i < size; ++i) {
            array[i] = this.keyAt(i);
            array2[i] = (Parcelable)this.valueAt(i);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(array);
        parcel.writeParcelableArray(array2, n);
    }
}
