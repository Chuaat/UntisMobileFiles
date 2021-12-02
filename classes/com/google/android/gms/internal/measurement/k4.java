// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class k4 extends j9<k4, j4> implements ta
{
    private static final k4 zza;
    private int zze;
    private String zzf;
    private String zzg;
    
    static {
        j9.n(k4.class, zza = new k4());
    }
    
    private k4() {
        this.zzf = "";
        this.zzg = "";
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(k4.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new k4();
        }
        if (n == 4) {
            return new j4((d4)null);
        }
        if (n != 5) {
            return null;
        }
        return k4.zza;
    }
    
    public final String w() {
        return this.zzf;
    }
    
    public final String x() {
        return this.zzg;
    }
}
