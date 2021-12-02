// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class i4 extends j9<i4, h4> implements ta
{
    private static final i4 zza;
    private int zze;
    private long zzf;
    private String zzg;
    private int zzh;
    private r9<k4> zzi;
    private r9<g4> zzj;
    private r9<m3> zzk;
    private String zzl;
    private boolean zzm;
    private r9<v5> zzn;
    
    static {
        j9.n(i4.class, zza = new i4());
    }
    
    private i4() {
        this.zzg = "";
        this.zzi = j9.j();
        this.zzj = j9.j();
        this.zzk = j9.j();
        this.zzl = "";
        this.zzn = j9.j();
    }
    
    public static h4 A() {
        return ((j9<j9, f9>)i4.zza).o();
    }
    
    public static i4 C() {
        return i4.zza;
    }
    
    public final String D() {
        return this.zzg;
    }
    
    public final List<m3> E() {
        return this.zzk;
    }
    
    public final List<v5> F() {
        return this.zzn;
    }
    
    public final List<k4> G() {
        return this.zzi;
    }
    
    public final boolean J() {
        return this.zzm;
    }
    
    public final boolean K() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean L() {
        return (this.zze & 0x1) != 0x0;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(i4.zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\b\u1007\u0004\t\u001b", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", k4.class, "zzj", g4.class, "zzk", m3.class, "zzl", "zzm", "zzn", v5.class });
        }
        if (n == 3) {
            return new i4();
        }
        if (n == 4) {
            return new h4((d4)null);
        }
        if (n != 5) {
            return null;
        }
        return i4.zza;
    }
    
    public final int v() {
        return this.zzn.size();
    }
    
    public final int w() {
        return this.zzj.size();
    }
    
    public final long x() {
        return this.zzf;
    }
    
    public final g4 z(final int n) {
        return this.zzj.get(n);
    }
}
