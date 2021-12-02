// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class u4 extends j9<u4, t4> implements ta
{
    private static final u4 zza;
    private int zze;
    private r9<y4> zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private int zzj;
    
    static {
        j9.n(u4.class, zza = new u4());
    }
    
    private u4() {
        this.zzf = j9.j();
        this.zzg = "";
    }
    
    public static t4 A() {
        return ((j9<j9, f9>)u4.zza).o();
    }
    
    private final void Q() {
        final r9<y4> zzf = this.zzf;
        if (!zzf.a()) {
            this.zzf = j9.k(zzf);
        }
    }
    
    public final y4 C(final int n) {
        return this.zzf.get(n);
    }
    
    public final String D() {
        return this.zzg;
    }
    
    public final List<y4> E() {
        return this.zzf;
    }
    
    public final boolean N() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean O() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean P() {
        return (this.zze & 0x2) != 0x0;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(u4.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003", new Object[] { "zze", "zzf", y4.class, "zzg", "zzh", "zzi", "zzj" });
        }
        if (n == 3) {
            return new u4();
        }
        if (n == 4) {
            return new t4((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return u4.zza;
    }
    
    public final int v() {
        return this.zzj;
    }
    
    public final int w() {
        return this.zzf.size();
    }
    
    public final long x() {
        return this.zzi;
    }
    
    public final long z() {
        return this.zzh;
    }
}
