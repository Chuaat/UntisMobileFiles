// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class g4 extends j9<g4, e4> implements ta
{
    private static final g4 zza;
    private int zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    
    static {
        j9.n(g4.class, zza = new g4());
    }
    
    private g4() {
        this.zzf = "";
    }
    
    public final boolean A() {
        return this.zzg;
    }
    
    public final boolean B() {
        return this.zzh;
    }
    
    public final boolean C() {
        return (this.zze & 0x8) != 0x0;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(g4.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1004\u0003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new g4();
        }
        if (n == 4) {
            return new e4((d4)null);
        }
        if (n != 5) {
            return null;
        }
        return g4.zza;
    }
    
    public final int v() {
        return this.zzi;
    }
    
    public final String x() {
        return this.zzf;
    }
}
