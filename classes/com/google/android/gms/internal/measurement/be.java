// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class be implements ae
{
    public static final c7<Boolean> a;
    public static final c7<Boolean> b;
    public static final c7<Long> c;
    
    static {
        final z6 z6 = new z6(s6.a("com.google.android.gms.measurement"));
        a = z6.e("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        b = z6.e("measurement.collection.redundant_engagement_removal_enabled", false);
        c = z6.c("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }
    
    @Override
    public final boolean zza() {
        return be.b.b();
    }
}
