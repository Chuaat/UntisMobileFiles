// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class qc implements pc
{
    public static final c7<Boolean> a;
    public static final c7<Boolean> b;
    
    static {
        final z6 a2 = new z6(s6.a("com.google.android.gms.measurement")).a();
        a = a2.e("measurement.adid_zero.service", false);
        b = a2.e("measurement.adid_zero.remove_lair_if_adidzero_false", true);
    }
    
    @Override
    public final boolean a() {
        return qc.b.b();
    }
    
    @Override
    public final boolean zza() {
        return true;
    }
    
    @Override
    public final boolean zzb() {
        return qc.a.b();
    }
}
