// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class c4 extends j9<c4, y3> implements ta
{
    private static final c4 zza;
    private int zze;
    private int zzf;
    private String zzg;
    private boolean zzh;
    private r9<String> zzi;
    
    static {
        j9.n(c4.class, zza = new c4());
    }
    
    private c4() {
        this.zzg = "";
        this.zzi = j9.j();
    }
    
    public static c4 x() {
        return c4.zza;
    }
    
    public final List<String> A() {
        return this.zzi;
    }
    
    public final boolean B() {
        return this.zzh;
    }
    
    public final boolean C() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean D() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean E() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final int F() {
        int a;
        if ((a = b4.a(this.zzf)) == 0) {
            a = 1;
        }
        return a;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(c4.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a", new Object[] { "zze", "zzf", a4.a, "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new c4();
        }
        if (n == 4) {
            return new y3((k3)null);
        }
        if (n != 5) {
            return null;
        }
        return c4.zza;
    }
    
    public final int v() {
        return this.zzi.size();
    }
    
    public final String z() {
        return this.zzg;
    }
}
