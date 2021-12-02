// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class q4 extends j9<q4, p4> implements ta
{
    private static final q4 zza;
    private int zze;
    private int zzf;
    private k5 zzg;
    private k5 zzh;
    private boolean zzi;
    
    static {
        j9.n(q4.class, zza = new q4());
    }
    
    private q4() {
    }
    
    public static p4 w() {
        return ((j9<j9, f9>)q4.zza).o();
    }
    
    public final k5 A() {
        k5 k5;
        if ((k5 = this.zzh) == null) {
            k5 = com.google.android.gms.internal.measurement.k5.D();
        }
        return k5;
    }
    
    public final boolean F() {
        return this.zzi;
    }
    
    public final boolean G() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean H() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean I() {
        return (this.zze & 0x4) != 0x0;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(q4.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new q4();
        }
        if (n == 4) {
            return new p4((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return q4.zza;
    }
    
    public final int v() {
        return this.zzf;
    }
    
    public final k5 z() {
        k5 k5;
        if ((k5 = this.zzg) == null) {
            k5 = com.google.android.gms.internal.measurement.k5.D();
        }
        return k5;
    }
}
