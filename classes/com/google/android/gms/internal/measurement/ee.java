// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class ee implements de
{
    public static final c7<Boolean> a;
    
    static {
        a = new z6(s6.a("com.google.android.gms.measurement")).e("measurement.collection.firebase_global_collection_flag_enabled", true);
    }
    
    @Override
    public final boolean zza() {
        return ee.a.b();
    }
}
