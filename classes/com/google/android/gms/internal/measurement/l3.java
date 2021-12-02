// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class l3 extends f9<m3, l3> implements ta
{
    private l3() {
        super(m3.zza);
    }
    
    public final o3 A(final int n) {
        return ((m3)super.H).A(n);
    }
    
    public final x3 B(final int n) {
        return ((m3)super.H).B(n);
    }
    
    public final int v() {
        return ((m3)super.H).w();
    }
    
    public final int w() {
        return ((m3)super.H).x();
    }
    
    public final l3 x(final int n, final n3 n2) {
        if (super.I) {
            this.r();
            super.I = false;
        }
        m3.F((m3)super.H, n, ((f9<o3, BuilderType>)n2).n());
        return this;
    }
    
    public final l3 z(final int n, final w3 w3) {
        if (super.I) {
            this.r();
            super.I = false;
        }
        m3.E((m3)super.H, n, ((f9<x3, BuilderType>)w3).n());
        return this;
    }
}
