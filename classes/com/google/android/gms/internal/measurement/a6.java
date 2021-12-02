// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class a6 extends j9<a6, w5> implements ta
{
    private static final a6 zza;
    private int zze;
    private int zzf;
    private r9<a6> zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;
    
    static {
        j9.n(a6.class, zza = new a6());
    }
    
    private a6() {
        this.zzg = j9.j();
        this.zzh = "";
        this.zzi = "";
    }
    
    public final List<a6> A() {
        return this.zzg;
    }
    
    public final boolean B() {
        return this.zzj;
    }
    
    public final boolean C() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean D() {
        return (this.zze & 0x10) != 0x0;
    }
    
    public final boolean E() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final int F() {
        int a;
        if ((a = z5.a(this.zzf)) == 0) {
            a = 1;
        }
        return a;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(a6.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1007\u0003\u0006\u1000\u0004", new Object[] { "zze", "zzf", y5.a, "zzg", a6.class, "zzh", "zzi", "zzj", "zzk" });
        }
        if (n == 3) {
            return new a6();
        }
        if (n == 4) {
            return new w5((p5)null);
        }
        if (n != 5) {
            return null;
        }
        return a6.zza;
    }
    
    public final double v() {
        return this.zzk;
    }
    
    public final String x() {
        return this.zzh;
    }
    
    public final String z() {
        return this.zzi;
    }
}
