// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class x3 extends j9<x3, w3> implements ta
{
    private static final x3 zza;
    private int zze;
    private int zzf;
    private String zzg;
    private q3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    
    static {
        j9.n(x3.class, zza = new x3());
    }
    
    private x3() {
        this.zzg = "";
    }
    
    public static w3 x() {
        return ((j9<j9, f9>)x3.zza).o();
    }
    
    public final String A() {
        return this.zzg;
    }
    
    public final boolean C() {
        return this.zzi;
    }
    
    public final boolean D() {
        return this.zzj;
    }
    
    public final boolean E() {
        return this.zzk;
    }
    
    public final boolean F() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean G() {
        return (this.zze & 0x20) != 0x0;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(x3.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
        }
        if (n == 3) {
            return new x3();
        }
        if (n == 4) {
            return new w3((k3)null);
        }
        if (n != 5) {
            return null;
        }
        return x3.zza;
    }
    
    public final int v() {
        return this.zzf;
    }
    
    public final q3 w() {
        q3 q3;
        if ((q3 = this.zzh) == null) {
            q3 = com.google.android.gms.internal.measurement.q3.w();
        }
        return q3;
    }
}
