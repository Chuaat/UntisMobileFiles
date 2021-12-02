// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import java.util.HashMap;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;

public final class q0
{
    private static final ClassLoader a;
    
    static {
        a = q0.class.getClassLoader();
    }
    
    private q0() {
    }
    
    public static <T extends Parcelable> T a(final Parcel parcel, final Parcelable$Creator<T> parcelable$Creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (T)parcelable$Creator.createFromParcel(parcel);
    }
    
    public static HashMap b(final Parcel parcel) {
        return parcel.readHashMap(q0.a);
    }
    
    public static void c(final Parcel parcel, final boolean b) {
        parcel.writeInt((int)(b ? 1 : 0));
    }
    
    public static void d(final Parcel parcel, final Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
    
    public static void e(final Parcel parcel, final IInterface interface1) {
        IBinder binder;
        if (interface1 == null) {
            binder = null;
        }
        else {
            binder = interface1.asBinder();
        }
        parcel.writeStrongBinder(binder);
    }
    
    public static boolean f(final Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
