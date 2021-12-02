// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class t5 extends j9<t5, s5> implements ta
{
    private static final t5 zza;
    private int zze;
    private String zzf;
    private r9<a6> zzg;
    
    static {
        j9.n(t5.class, zza = new t5());
    }
    
    private t5() {
        this.zzf = "";
        this.zzg = j9.j();
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(t5.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "zze", "zzf", "zzg", a6.class });
        }
        if (n == 3) {
            return new t5();
        }
        if (n == 4) {
            return new s5((p5)null);
        }
        if (n != 5) {
            return null;
        }
        return t5.zza;
    }
    
    public final String w() {
        return this.zzf;
    }
    
    public final List<a6> x() {
        return this.zzg;
    }
}
