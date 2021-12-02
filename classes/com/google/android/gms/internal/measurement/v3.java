// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class v3 extends j9<v3, r3> implements ta
{
    private static final v3 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    
    static {
        j9.n(v3.class, zza = new v3());
    }
    
    private v3() {
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }
    
    public static v3 w() {
        return v3.zza;
    }
    
    public final String A() {
        return this.zzi;
    }
    
    public final boolean B() {
        return this.zzg;
    }
    
    public final boolean C() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean D() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean E() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean F() {
        return (this.zze & 0x10) != 0x0;
    }
    
    public final boolean G() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final int H() {
        int a;
        if ((a = u3.a(this.zzf)) == 0) {
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
            return j9.m(v3.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "zze", "zzf", t3.a, "zzg", "zzh", "zzi", "zzj" });
        }
        if (n == 3) {
            return new v3();
        }
        if (n == 4) {
            return new r3((k3)null);
        }
        if (n != 5) {
            return null;
        }
        return v3.zza;
    }
    
    public final String x() {
        return this.zzh;
    }
    
    public final String z() {
        return this.zzj;
    }
}
