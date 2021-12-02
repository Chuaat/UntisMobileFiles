// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class pd implements nd
{
    public static final c7<Boolean> a;
    
    static {
        a = new z6(s6.a("com.google.android.gms.measurement")).e("measurement.client.firebase_feature_rollout.v1.enable", true);
    }
    
    @Override
    public final boolean zza() {
        return true;
    }
    
    @Override
    public final boolean zzb() {
        return pd.a.b();
    }
}
