// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class i5 extends j9<i5, f5> implements ta
{
    private static final i5 zza;
    private int zze;
    private int zzf;
    private r9<w4> zzg;
    
    static {
        j9.n(i5.class, zza = new i5());
    }
    
    private i5() {
        this.zzf = 1;
        this.zzg = j9.j();
    }
    
    public static f5 v() {
        return ((j9<j9, f9>)i5.zza).o();
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(i5.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001b", new Object[] { "zze", "zzf", h5.a, "zzg", w4.class });
        }
        if (n == 3) {
            return new i5();
        }
        if (n == 4) {
            return new f5((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return i5.zza;
    }
}
