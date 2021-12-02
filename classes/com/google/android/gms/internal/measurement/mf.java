// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class mf implements lf
{
    public static final c7<Boolean> a;
    
    static {
        a = new z6(s6.a("com.google.android.gms.measurement")).e("measurement.scheduler.task_thread.cleanup_on_exit", false);
    }
    
    @Override
    public final boolean zza() {
        return mf.a.b();
    }
}
