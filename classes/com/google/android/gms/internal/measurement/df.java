// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class df implements cf
{
    public static final c7<Boolean> a;
    public static final c7<Long> b;
    
    static {
        final z6 z6 = new z6(s6.a("com.google.android.gms.measurement"));
        a = z6.e("measurement.module.pixie.ees", false);
        b = z6.c("measurement.id.module.pixie.ees", 0L);
    }
    
    @Override
    public final boolean zza() {
        return true;
    }
    
    @Override
    public final boolean zzb() {
        return df.a.b();
    }
}
