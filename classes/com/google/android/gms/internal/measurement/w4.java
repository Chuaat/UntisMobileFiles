// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class w4 extends j9<w4, v4> implements ta
{
    private static final w4 zza;
    private int zze;
    private String zzf;
    private long zzg;
    
    static {
        j9.n(w4.class, zza = new w4());
    }
    
    private w4() {
        this.zzf = "";
    }
    
    public static v4 v() {
        return ((j9<j9, f9>)w4.zza).o();
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(w4.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new w4();
        }
        if (n == 4) {
            return new v4((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return w4.zza;
    }
}
