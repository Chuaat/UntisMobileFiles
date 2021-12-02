// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class id implements hd
{
    public static final c7<Boolean> a;
    public static final c7<Boolean> b;
    
    static {
        final z6 z6 = new z6(s6.a("com.google.android.gms.measurement"));
        a = z6.e("measurement.euid.client.dev", false);
        b = z6.e("measurement.euid.service", false);
    }
    
    @Override
    public final boolean zza() {
        return id.a.b();
    }
    
    @Override
    public final boolean zzb() {
        return id.b.b();
    }
}
