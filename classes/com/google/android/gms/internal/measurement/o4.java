// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class o4 extends j9<o4, n4> implements ta
{
    private static final o4 zza;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    
    static {
        j9.n(o4.class, zza = new o4());
    }
    
    private o4() {
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzl = "";
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(o4.zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl" });
        }
        if (n == 3) {
            return new o4();
        }
        if (n == 4) {
            return new n4((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return o4.zza;
    }
}
