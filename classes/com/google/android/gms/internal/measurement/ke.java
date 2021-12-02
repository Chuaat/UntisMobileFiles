// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class ke implements je
{
    public static final c7<Boolean> a;
    public static final c7<Boolean> b;
    public static final c7<Boolean> c;
    public static final c7<Long> d;
    
    static {
        final z6 z6 = new z6(s6.a("com.google.android.gms.measurement"));
        a = z6.e("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = z6.e("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = z6.e("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = z6.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }
    
    @Override
    public final boolean zza() {
        return ke.a.b();
    }
    
    @Override
    public final boolean zzb() {
        return ke.c.b();
    }
}
