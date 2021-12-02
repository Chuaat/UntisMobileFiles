// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

public enum w0
{
    H(0), 
    I(1), 
    J(2), 
    K(3), 
    L(4), 
    M(5), 
    N(6), 
    O(7), 
    P(8), 
    Q(9), 
    R(10), 
    S(11), 
    T(12), 
    U(13), 
    V(14), 
    W(15), 
    X(16), 
    Y(17), 
    Z(18), 
    a0(19), 
    b0(255), 
    c0(127);
    
    private static final w0[] d0;
    private final int G;
    
    static {
        final w0 w21;
        d0 = new w0[w21.d() + 1];
        for (final w0 w22 : values()) {
            w0.d0[w22.d()] = w22;
        }
    }
    
    private w0(final int g) {
        this.G = g;
    }
    
    public static w0 b(final int n) {
        return w0.d0[n & 0xFF];
    }
    
    public int d() {
        return this.G;
    }
    
    public boolean f() {
        return this == w0.K || this == w0.L;
    }
}
