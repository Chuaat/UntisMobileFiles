// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class sd implements rd
{
    public static final c7<Boolean> a;
    
    static {
        a = new z6(s6.a("com.google.android.gms.measurement")).e("measurement.client.consent.suppress_1p_in_ga4f_install", true);
    }
    
    @Override
    public final boolean zza() {
        return true;
    }
    
    @Override
    public final boolean zzb() {
        return sd.a.b();
    }
}
