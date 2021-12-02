// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class ue implements te
{
    public static final c7<Boolean> a;
    public static final c7<Long> b;
    
    static {
        final z6 z6 = new z6(s6.a("com.google.android.gms.measurement"));
        a = z6.e("measurement.validation.internal_limits_internal_event_params", false);
        b = z6.c("measurement.id.validation.internal_limits_internal_event_params", 0L);
    }
    
    @Override
    public final boolean zza() {
        return ue.a.b();
    }
}
