// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

public enum n0
{
    A0(26), 
    B0(27), 
    C0(28), 
    D0(29), 
    E0(45), 
    F0(30), 
    G0(31), 
    H(0), 
    H0(32), 
    I(1), 
    I0(33), 
    J(2), 
    J0(46), 
    K(3), 
    K0(34), 
    L(56), 
    L0(35), 
    M(57), 
    M0(36), 
    N(58), 
    N0(43), 
    O(59), 
    O0(37), 
    P(60), 
    P0(38), 
    Q(61), 
    Q0(39), 
    R(62), 
    R0(40), 
    S(53), 
    S0(44), 
    T(4), 
    T0(41), 
    U(5), 
    U0(42), 
    V(52);
    
    private static final Map<Integer, n0> V0;
    
    W(6), 
    X(49), 
    Y(7), 
    Z(8), 
    a0(9), 
    b0(50), 
    c0(10), 
    d0(11), 
    e0(12), 
    f0(13), 
    g0(51), 
    h0(47), 
    i0(54), 
    j0(55), 
    k0(63), 
    l0(64), 
    m0(65), 
    n0(66), 
    o0(15), 
    p0(48), 
    q0(16), 
    r0(17), 
    s0(18), 
    t0(19), 
    u0(20), 
    v0(21), 
    w0(22), 
    x0(23), 
    y0(24), 
    z0(25);
    
    private final int G;
    
    static {
        V0 = new HashMap<Integer, n0>();
        for (final n0 n2 : values()) {
            n0.V0.put(n2.G, n2);
        }
    }
    
    private n0(final int g) {
        this.G = g;
    }
    
    public static n0 b(final int i) {
        return n0.V0.get(i);
    }
    
    public final Integer d() {
        return this.G;
    }
    
    @Override
    public final String toString() {
        return Integer.valueOf(this.G).toString();
    }
}
