// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class o3 extends j9<o3, n3> implements ta
{
    private static final o3 zza;
    private int zze;
    private int zzf;
    private String zzg;
    private r9<q3> zzh;
    private boolean zzi;
    private v3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    
    static {
        j9.n(o3.class, zza = new o3());
    }
    
    private o3() {
        this.zzg = "";
        this.zzh = j9.j();
    }
    
    public static n3 x() {
        return ((j9<j9, f9>)o3.zza).o();
    }
    
    public final q3 A(final int n) {
        return this.zzh.get(n);
    }
    
    public final v3 B() {
        v3 v3;
        if ((v3 = this.zzj) == null) {
            v3 = com.google.android.gms.internal.measurement.v3.w();
        }
        return v3;
    }
    
    public final String C() {
        return this.zzg;
    }
    
    public final List<q3> D() {
        return this.zzh;
    }
    
    public final boolean G() {
        return this.zzk;
    }
    
    public final boolean H() {
        return this.zzl;
    }
    
    public final boolean I() {
        return this.zzm;
    }
    
    public final boolean J() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean K() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean L() {
        return (this.zze & 0x40) != 0x0;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(o3.zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u1007\u0006", new Object[] { "zze", "zzf", "zzg", "zzh", q3.class, "zzi", "zzj", "zzk", "zzl", "zzm" });
        }
        if (n == 3) {
            return new o3();
        }
        if (n == 4) {
            return new n3((k3)null);
        }
        if (n != 5) {
            return null;
        }
        return o3.zza;
    }
    
    public final int v() {
        return this.zzh.size();
    }
    
    public final int w() {
        return this.zzf;
    }
}
