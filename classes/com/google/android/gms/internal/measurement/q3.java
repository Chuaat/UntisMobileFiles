// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class q3 extends j9<q3, p3> implements ta
{
    private static final q3 zza;
    private int zze;
    private c4 zzf;
    private v3 zzg;
    private boolean zzh;
    private String zzi;
    
    static {
        j9.n(q3.class, zza = new q3());
    }
    
    private q3() {
        this.zzi = "";
    }
    
    public static q3 w() {
        return q3.zza;
    }
    
    public final String A() {
        return this.zzi;
    }
    
    public final boolean C() {
        return this.zzh;
    }
    
    public final boolean D() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean E() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean F() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean G() {
        return (this.zze & 0x1) != 0x0;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(q3.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002\u0004\u1008\u0003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new q3();
        }
        if (n == 4) {
            return new p3((k3)null);
        }
        if (n != 5) {
            return null;
        }
        return q3.zza;
    }
    
    public final v3 x() {
        v3 v3;
        if ((v3 = this.zzg) == null) {
            v3 = com.google.android.gms.internal.measurement.v3.w();
        }
        return v3;
    }
    
    public final c4 z() {
        c4 c4;
        if ((c4 = this.zzf) == null) {
            c4 = com.google.android.gms.internal.measurement.c4.x();
        }
        return c4;
    }
}
