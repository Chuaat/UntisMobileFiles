// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class tc implements sc
{
    public static final c7<Boolean> a;
    public static final c7<Boolean> b;
    
    static {
        final z6 z6 = new z6(s6.a("com.google.android.gms.measurement"));
        a = z6.e("measurement.androidId.delete_feature", true);
        b = z6.e("measurement.log_androidId_enabled", false);
    }
    
    @Override
    public final boolean zza() {
        return tc.a.b();
    }
}
