// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class fd implements ed
{
    public static final c7<Boolean> a;
    public static final c7<Boolean> b;
    public static final c7<Boolean> c;
    public static final c7<Long> d;
    public static final c7<Long> e;
    
    static {
        final z6 z6 = new z6(s6.a("com.google.android.gms.measurement"));
        a = z6.e("measurement.client.consent_state_v1", true);
        b = z6.e("measurement.client.3p_consent_state_v1", true);
        c = z6.e("measurement.service.consent_state_v1_W36", true);
        d = z6.c("measurement.id.service.consent_state_v1_W36", 0L);
        e = z6.c("measurement.service.storage_consent_support_version", 203600L);
    }
    
    @Override
    public final long zza() {
        return fd.e.b();
    }
}
