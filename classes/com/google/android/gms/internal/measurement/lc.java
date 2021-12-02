// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public enum lc
{
    H(mc.K, 1), 
    I(mc.J, 5), 
    J(i, 0), 
    K(i, 0), 
    L(h, 0), 
    M(i, 1), 
    N(h, 5), 
    O(mc.L, 0), 
    P(mc.M, 2), 
    Q(p, 3), 
    R(p, 2), 
    S(mc.N, 2), 
    T(h, 0), 
    U(mc.O, 0), 
    V(h, 5), 
    W(i, 1), 
    X(h, 0), 
    Y(i, 0);
    
    private final mc G;
    
    static {
        final mc i = mc.I;
        final mc h = mc.H;
        final mc p = mc.P;
    }
    
    private lc(final mc g, final int n) {
        this.G = g;
    }
    
    public final mc b() {
        return this.G;
    }
}
