// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class yd implements xd
{
    public static final c7<Boolean> a;
    public static final c7<Boolean> b;
    public static final c7<Boolean> c;
    
    static {
        final z6 z6 = new z6(s6.a("com.google.android.gms.measurement"));
        a = z6.e("measurement.client.sessions.check_on_reset_and_enable2", true);
        b = z6.e("measurement.client.sessions.check_on_startup", true);
        c = z6.e("measurement.client.sessions.start_session_before_view_screen", true);
    }
    
    @Override
    public final boolean zza() {
        return true;
    }
    
    @Override
    public final boolean zzb() {
        return yd.a.b();
    }
}
