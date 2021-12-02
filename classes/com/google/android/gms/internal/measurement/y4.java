// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class y4 extends j9<y4, x4> implements ta
{
    private static final y4 zza;
    private int zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private float zzi;
    private double zzj;
    private r9<y4> zzk;
    
    static {
        j9.n(y4.class, zza = new y4());
    }
    
    private y4() {
        this.zzf = "";
        this.zzg = "";
        this.zzk = j9.j();
    }
    
    public static x4 A() {
        return ((j9<j9, f9>)y4.zza).o();
    }
    
    private final void U() {
        final r9<y4> zzk = this.zzk;
        if (!zzk.a()) {
            this.zzk = j9.k(zzk);
        }
    }
    
    public final String C() {
        return this.zzf;
    }
    
    public final String D() {
        return this.zzg;
    }
    
    public final List<y4> E() {
        return this.zzk;
    }
    
    public final boolean P() {
        return (this.zze & 0x10) != 0x0;
    }
    
    public final boolean Q() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean R() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean S() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean T() {
        return (this.zze & 0x2) != 0x0;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(y4.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", y4.class });
        }
        if (n == 3) {
            return new y4();
        }
        if (n == 4) {
            return new x4((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return y4.zza;
    }
    
    public final double v() {
        return this.zzj;
    }
    
    public final float w() {
        return this.zzi;
    }
    
    public final int x() {
        return this.zzk.size();
    }
    
    public final long z() {
        return this.zzh;
    }
}
