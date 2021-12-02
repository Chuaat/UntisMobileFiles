// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class a5 extends j9<a5, z4> implements ta
{
    private static final a5 zza;
    private int zze;
    private String zzf;
    private String zzg;
    private o4 zzh;
    
    static {
        j9.n(a5.class, zza = new a5());
    }
    
    private a5() {
        this.zzf = "";
        this.zzg = "";
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(a5.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "zze", "zzf", "zzg", "zzh" });
        }
        if (n == 3) {
            return new a5();
        }
        if (n == 4) {
            return new z4((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return a5.zza;
    }
}
