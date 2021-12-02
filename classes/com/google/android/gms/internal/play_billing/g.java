// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;

public final class g
{
    private static final ClassLoader a;
    
    static {
        a = g.class.getClassLoader();
    }
    
    private g() {
    }
    
    public static <T extends Parcelable> T a(final Parcel parcel, final Parcelable$Creator<T> parcelable$Creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (T)parcelable$Creator.createFromParcel(parcel);
    }
    
    public static void b(final Parcel parcel, final Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
