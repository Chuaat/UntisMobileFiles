// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.lang.reflect.Type;

public enum i6
{
    A0(41, j, k), 
    B0(42, j, o), 
    C0(43, j, k), 
    D0(44, j, r), 
    E0(45, j, k), 
    F0(46, j, l), 
    G0(47, j, k), 
    H0(48, j, l), 
    I0(49, i19, s), 
    J0(50, k6.K, a7.J);
    
    private static final i6[] K0;
    
    L(0, h, n);
    
    private static final Type[] L0;
    
    M(1, h, m), 
    N(2, h, l), 
    O(3, h, l), 
    P(4, h, k), 
    Q(5, h, l), 
    R(6, h, k), 
    S(7, h, o), 
    T(8, h, p), 
    U(9, h, s), 
    V(10, h, q), 
    W(11, h, k), 
    X(12, h, r), 
    Y(13, h, k), 
    Z(14, h, l), 
    a0(15, h, k), 
    b0(16, h, l), 
    c0(17, h, s), 
    d0(18, i19, n), 
    e0(19, i19, m), 
    f0(20, i19, l), 
    g0(21, i19, l), 
    h0(22, i19, k), 
    i0(23, i19, l), 
    j0(24, i19, k), 
    k0(25, i19, o), 
    l0(26, i19, p), 
    m0(27, i19, s), 
    n0(28, i19, q), 
    o0(29, i19, k), 
    p0(30, i19, r), 
    q0(31, i19, k), 
    r0(32, i19, l), 
    s0(33, i19, k), 
    t0(34, i19, l), 
    u0(35, j, n), 
    v0(36, j, m), 
    w0(37, j, l), 
    x0(38, j, l), 
    y0(39, j, k), 
    z0(40, j, l);
    
    private final a7 G;
    private final int H;
    private final k6 I;
    private final Class<?> J;
    private final boolean K;
    
    static {
        final k6 h = k6.H;
        final a7 n = a7.N;
        final a7 m = a7.M;
        final a7 l = a7.L;
        final a7 k = a7.K;
        final a7 o = a7.O;
        final a7 p = a7.P;
        final a7 s = a7.S;
        final a7 q = a7.Q;
        final a7 r = a7.R;
        final k6 i19 = k6.I;
        final k6 j = k6.J;
        int n2 = 0;
        L0 = new Type[0];
        final i6[] values = values();
        K0 = new i6[values.length];
        while (n2 < values.length) {
            final i6 i53 = values[n2];
            i6.K0[i53.H] = i53;
            ++n2;
        }
    }
    
    private i6(final int h, final k6 i, final a7 g) {
        this.H = h;
        this.I = i;
        this.G = g;
        ordinal = l6.a[i.ordinal()];
        boolean k = true;
        Class<?> b;
        if (ordinal != 1 && ordinal != 2) {
            b = null;
        }
        else {
            b = g.b();
        }
        this.J = b;
        Label_0101: {
            if (i == k6.H) {
                ordinal = l6.b[g.ordinal()];
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    break Label_0101;
                }
            }
            k = false;
        }
        this.K = k;
    }
    
    public final int zza() {
        return this.H;
    }
}
