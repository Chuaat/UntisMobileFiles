// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.ads_identifier;

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
        parcel.writeInt(1);
    }
    
    public static boolean b(final Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
