// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.flags;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class c
{
    private static final ClassLoader a;
    
    static {
        a = c.class.getClassLoader();
    }
    
    private c() {
    }
    
    public static void a(final Parcel parcel, final boolean b) {
        parcel.writeInt((int)(b ? 1 : 0));
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
    
    public static boolean c(final Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
