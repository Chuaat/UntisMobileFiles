// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class ne implements me
{
    public static final c7<Long> a;
    public static final c7<Boolean> b;
    public static final c7<Boolean> c;
    public static final c7<Boolean> d;
    public static final c7<Long> e;
    
    static {
        final z6 z6 = new z6(s6.a("com.google.android.gms.measurement"));
        a = z6.c("measurement.id.lifecycle.app_in_background_parameter", 0L);
        b = z6.e("measurement.lifecycle.app_backgrounded_engagement", false);
        c = z6.e("measurement.lifecycle.app_backgrounded_tracking", true);
        d = z6.e("measurement.lifecycle.app_in_background_parameter", false);
        e = z6.c("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }
    
    @Override
    public final boolean zza() {
        return ne.b.b();
    }
    
    @Override
    public final boolean zzb() {
        return ne.d.b();
    }
}
