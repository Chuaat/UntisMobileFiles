// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class k5 extends j9<k5, j5> implements ta
{
    private static final k5 zza;
    private q9 zze;
    private q9 zzf;
    private r9<s4> zzg;
    private r9<m5> zzh;
    
    static {
        j9.n(k5.class, zza = new k5());
    }
    
    private k5() {
        this.zze = j9.s();
        this.zzf = j9.s();
        this.zzg = j9.j();
        this.zzh = j9.j();
    }
    
    public static j5 B() {
        return ((j9<j9, f9>)k5.zza).o();
    }
    
    public static k5 D() {
        return k5.zza;
    }
    
    private final void R() {
        final r9<s4> zzg = this.zzg;
        if (!zzg.a()) {
            this.zzg = j9.k(zzg);
        }
    }
    
    private final void S() {
        final r9<m5> zzh = this.zzh;
        if (!zzh.a()) {
            this.zzh = j9.k(zzh);
        }
    }
    
    public final s4 A(final int n) {
        return this.zzg.get(n);
    }
    
    public final m5 E(final int n) {
        return this.zzh.get(n);
    }
    
    public final List<s4> F() {
        return this.zzg;
    }
    
    public final List<Long> G() {
        return this.zzf;
    }
    
    public final List<m5> H() {
        return this.zzh;
    }
    
    public final List<Long> I() {
        return this.zze;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(k5.zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[] { "zze", "zzf", "zzg", s4.class, "zzh", m5.class });
        }
        if (n == 3) {
            return new k5();
        }
        if (n == 4) {
            return new j5((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return k5.zza;
    }
    
    public final int v() {
        return this.zzg.size();
    }
    
    public final int w() {
        return this.zzf.size();
    }
    
    public final int x() {
        return this.zzh.size();
    }
    
    public final int z() {
        return this.zze.size();
    }
}
