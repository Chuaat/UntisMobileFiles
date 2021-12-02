// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;

public class c1
{
    private static final ClassLoader a;
    
    static {
        a = c1.class.getClassLoader();
    }
    
    private c1() {
    }
    
    public static <T extends Parcelable> T a(final Parcel parcel, final Parcelable$Creator<T> parcelable$Creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (T)parcelable$Creator.createFromParcel(parcel);
    }
    
    public static void b(final Parcel parcel, final IInterface interface1) {
        IBinder binder;
        if (interface1 == null) {
            binder = null;
        }
        else {
            binder = interface1.asBinder();
        }
        parcel.writeStrongBinder(binder);
    }
    
    public static void c(final Parcel parcel, final Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
