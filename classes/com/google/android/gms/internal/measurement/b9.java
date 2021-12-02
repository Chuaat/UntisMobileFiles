// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public enum b9
{
    A0(43, 3, k), 
    B0(44, 3, r), 
    C0(45, 3, k), 
    D0(46, 3, l), 
    E0(47, 3, k), 
    F0(48, 3, l), 
    G0(49, 2, s), 
    H0(50, 4, v9.J);
    
    private static final b9[] I0;
    
    J(0, 1, n), 
    K(1, 1, m), 
    L(2, 1, l), 
    M(3, 1, l), 
    N(4, 1, k), 
    O(5, 1, l), 
    P(6, 1, k), 
    Q(7, 1, o), 
    R(8, 1, p), 
    S(9, 1, s), 
    T(10, 1, q), 
    U(11, 1, k), 
    V(12, 1, r), 
    W(13, 1, k), 
    X(14, 1, l), 
    Y(15, 1, k), 
    Z(16, 1, l), 
    a0(17, 1, s), 
    b0(18, 2, n), 
    c0(19, 2, m), 
    d0(20, 2, l), 
    e0(21, 2, l), 
    f0(22, 2, k), 
    g0(23, 2, l), 
    h0(24, 2, k), 
    i0(25, 2, o), 
    j0(26, 2, p), 
    k0(27, 2, s), 
    l0(28, 2, q), 
    m0(29, 2, k), 
    n0(30, 2, r), 
    o0(31, 2, k), 
    p0(32, 2, l), 
    q0(33, 2, k), 
    r0(34, 2, l), 
    s0(35, 3, n), 
    t0(36, 3, m), 
    u0(37, 3, l), 
    v0(38, 3, l), 
    w0(39, 3, k), 
    x0(40, 3, l), 
    y0(41, 3, k), 
    z0(42, 3, o);
    
    private final v9 G;
    private final int H;
    private final Class<?> I;
    
    static {
        final v9 n = v9.N;
        final v9 m = v9.M;
        final v9 l = v9.L;
        final v9 k = v9.K;
        final v9 o = v9.O;
        final v9 p = v9.P;
        final v9 s = v9.S;
        final v9 q = v9.Q;
        final v9 r = v9.R;
        int n2 = 0;
        final b9[] values = values();
        final int length = values.length;
        I0 = new b9[length];
        while (n2 < length) {
            final b9 b52 = values[n2];
            b9.I0[b52.H] = b52;
            ++n2;
        }
    }
    
    private b9(final int h, final int n, final v9 g) {
        this.H = h;
        this.G = g;
        final v9 j = v9.J;
        ordinal = n - 1;
        Class<?> b;
        if (ordinal != 1 && ordinal != 3) {
            b = null;
        }
        else {
            b = g.b();
        }
        this.I = b;
        if (n == 1) {
            g.ordinal();
        }
    }
    
    public final int zza() {
        return this.H;
    }
}
