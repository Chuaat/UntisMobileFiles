// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class wf implements vf
{
    public static final c7<Boolean> a;
    
    static {
        a = new z6(s6.a("com.google.android.gms.measurement")).e("measurement.integration.disable_firebase_instance_id", false);
    }
    
    @Override
    public final boolean zza() {
        return true;
    }
    
    @Override
    public final boolean zzb() {
        return wf.a.b();
    }
}
