// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class vd implements ud
{
    public static final c7<Boolean> a;
    public static final c7<Boolean> b;
    public static final c7<Boolean> c;
    public static final c7<Boolean> d;
    
    static {
        final z6 z6 = new z6(s6.a("com.google.android.gms.measurement"));
        a = z6.e("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        b = z6.e("measurement.audience.refresh_event_count_filters_timestamp", false);
        c = z6.e("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = z6.e("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
    
    @Override
    public final boolean a() {
        return vd.c.b();
    }
    
    @Override
    public final boolean c() {
        return vd.d.b();
    }
    
    @Override
    public final boolean zza() {
        return true;
    }
    
    @Override
    public final boolean zzb() {
        return vd.b.b();
    }
}
