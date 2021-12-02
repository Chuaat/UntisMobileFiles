// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class r5 extends j9<r5, q5> implements ta
{
    private static final r5 zza;
    private r9<t5> zze;
    
    static {
        j9.n(r5.class, zza = new r5());
    }
    
    private r5() {
        this.zze = j9.j();
    }
    
    public static r5 x() {
        return r5.zza;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(r5.zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "zze", t5.class });
        }
        if (n == 3) {
            return new r5();
        }
        if (n == 4) {
            return new q5((p5)null);
        }
        if (n != 5) {
            return null;
        }
        return r5.zza;
    }
    
    public final int v() {
        return this.zze.size();
    }
    
    public final List<t5> z() {
        return this.zze;
    }
}
