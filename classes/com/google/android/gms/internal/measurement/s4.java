// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class s4 extends j9<s4, r4> implements ta
{
    private static final s4 zza;
    private int zze;
    private int zzf;
    private long zzg;
    
    static {
        j9.n(s4.class, zza = new s4());
    }
    
    private s4() {
    }
    
    public static r4 x() {
        return ((j9<j9, f9>)s4.zza).o();
    }
    
    public final boolean C() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean D() {
        return (this.zze & 0x1) != 0x0;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(s4.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new s4();
        }
        if (n == 4) {
            return new r4((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return s4.zza;
    }
    
    public final int v() {
        return this.zzf;
    }
    
    public final long w() {
        return this.zzg;
    }
}
