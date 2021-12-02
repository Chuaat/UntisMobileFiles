// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class m5 extends j9<m5, l5> implements ta
{
    private static final m5 zza;
    private int zze;
    private int zzf;
    private q9 zzg;
    
    static {
        j9.n(m5.class, zza = new m5());
    }
    
    private m5() {
        this.zzg = j9.s();
    }
    
    public static l5 z() {
        return ((j9<j9, f9>)m5.zza).o();
    }
    
    public final List<Long> B() {
        return this.zzg;
    }
    
    public final boolean E() {
        return (this.zze & 0x1) != 0x0;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(m5.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new m5();
        }
        if (n == 4) {
            return new l5((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return m5.zza;
    }
    
    public final int v() {
        return this.zzg.size();
    }
    
    public final int w() {
        return this.zzf;
    }
    
    public final long x(final int n) {
        return this.zzg.d(n);
    }
}
