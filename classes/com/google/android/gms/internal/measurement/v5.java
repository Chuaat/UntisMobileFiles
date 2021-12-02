// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class v5 extends j9<v5, u5> implements ta
{
    private static final v5 zza;
    private int zze;
    private r9<a6> zzf;
    private r5 zzg;
    
    static {
        j9.n(v5.class, zza = new v5());
    }
    
    private v5() {
        this.zzf = j9.j();
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(v5.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] { "zze", "zzf", a6.class, "zzg" });
        }
        if (n == 3) {
            return new v5();
        }
        if (n == 4) {
            return new u5((p5)null);
        }
        if (n != 5) {
            return null;
        }
        return v5.zza;
    }
    
    public final r5 v() {
        r5 r5;
        if ((r5 = this.zzg) == null) {
            r5 = com.google.android.gms.internal.measurement.r5.x();
        }
        return r5;
    }
    
    public final List<a6> x() {
        return this.zzf;
    }
}
