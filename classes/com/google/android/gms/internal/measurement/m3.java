// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class m3 extends j9<m3, l3> implements ta
{
    private static final m3 zza;
    private int zze;
    private int zzf;
    private r9<x3> zzg;
    private r9<o3> zzh;
    private boolean zzi;
    private boolean zzj;
    
    static {
        j9.n(m3.class, zza = new m3());
    }
    
    private m3() {
        this.zzg = j9.j();
        this.zzh = j9.j();
    }
    
    public final o3 A(final int n) {
        return this.zzh.get(n);
    }
    
    public final x3 B(final int n) {
        return this.zzg.get(n);
    }
    
    public final List<o3> C() {
        return this.zzh;
    }
    
    public final List<x3> D() {
        return this.zzg;
    }
    
    public final boolean G() {
        return (this.zze & 0x1) != 0x0;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(m3.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1007\u0001\u0005\u1007\u0002", new Object[] { "zze", "zzf", "zzg", x3.class, "zzh", o3.class, "zzi", "zzj" });
        }
        if (n == 3) {
            return new m3();
        }
        if (n == 4) {
            return new l3((k3)null);
        }
        if (n != 5) {
            return null;
        }
        return m3.zza;
    }
    
    public final int v() {
        return this.zzf;
    }
    
    public final int w() {
        return this.zzh.size();
    }
    
    public final int x() {
        return this.zzg.size();
    }
}
