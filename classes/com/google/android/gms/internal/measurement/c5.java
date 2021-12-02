// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class c5 extends j9<c5, b5> implements ta
{
    private static final c5 zza;
    private r9<e5> zze;
    
    static {
        j9.n(c5.class, zza = new c5());
    }
    
    private c5() {
        this.zze = j9.j();
    }
    
    public static b5 v() {
        return ((j9<j9, f9>)c5.zza).o();
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(c5.zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "zze", e5.class });
        }
        if (n == 3) {
            return new c5();
        }
        if (n == 4) {
            return new b5((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return c5.zza;
    }
    
    public final e5 x(final int n) {
        return this.zze.get(0);
    }
    
    public final List<e5> z() {
        return this.zze;
    }
}
