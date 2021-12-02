// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.stateful;

import android.os.Parcelable;
import androidx.annotation.k0;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import androidx.annotation.j0;
import android.os.Bundle;
import androidx.collection.m;
import android.os.Parcelable$Creator;

public class a extends androidx.customview.view.a
{
    public static final Parcelable$Creator<a> CREATOR;
    @j0
    public final m<String, Bundle> I;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<a>() {
            @k0
            public a a(@j0 final Parcel parcel) {
                return new a(parcel, null, null);
            }
            
            @j0
            public a b(@j0 final Parcel parcel, final ClassLoader classLoader) {
                return new a(parcel, classLoader, null);
            }
            
            @j0
            public a[] c(final int n) {
                return new a[n];
            }
        };
    }
    
    private a(@j0 final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        final int int1 = parcel.readInt();
        final String[] array = new String[int1];
        parcel.readStringArray(array);
        final Bundle[] array2 = new Bundle[int1];
        parcel.readTypedArray((Object[])array2, Bundle.CREATOR);
        this.I = new m<String, Bundle>(int1);
        for (int i = 0; i < int1; ++i) {
            this.I.put(array[i], array2[i]);
        }
    }
    
    public a(final Parcelable parcelable) {
        super(parcelable);
        this.I = new m<String, Bundle>();
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.I);
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public void writeToParcel(@j0 final Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        final int size = this.I.size();
        parcel.writeInt(size);
        final String[] array = new String[size];
        final Bundle[] array2 = new Bundle[size];
        for (i = 0; i < size; ++i) {
            array[i] = this.I.i(i);
            array2[i] = this.I.o(i);
        }
        parcel.writeStringArray(array);
        parcel.writeTypedArray((Parcelable[])array2, 0);
    }
}
