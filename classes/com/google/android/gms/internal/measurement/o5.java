// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class o5 extends j9<o5, n5> implements ta
{
    private static final o5 zza;
    private int zze;
    private long zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private float zzj;
    private double zzk;
    
    static {
        j9.n(o5.class, zza = new o5());
    }
    
    private o5() {
        this.zzg = "";
        this.zzh = "";
    }
    
    public static n5 z() {
        return ((j9<j9, f9>)o5.zza).o();
    }
    
    public final String B() {
        return this.zzg;
    }
    
    public final String C() {
        return this.zzh;
    }
    
    public final boolean L() {
        return (this.zze & 0x20) != 0x0;
    }
    
    public final boolean M() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean N() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean O() {
        return (this.zze & 0x4) != 0x0;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(o5.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1001\u0004\u0006\u1000\u0005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
        }
        if (n == 3) {
            return new o5();
        }
        if (n == 4) {
            return new n5((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return o5.zza;
    }
    
    public final double v() {
        return this.zzk;
    }
    
    public final long w() {
        return this.zzi;
    }
    
    public final long x() {
        return this.zzf;
    }
}
