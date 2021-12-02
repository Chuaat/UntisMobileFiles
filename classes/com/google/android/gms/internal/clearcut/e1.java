// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Type;

public enum e1
{
    A0(41, j, k), 
    B0(42, j, o), 
    C0(43, j, k), 
    D0(44, j, r), 
    E0(45, j, k), 
    F0(46, j, l), 
    G0(47, j, k), 
    H0(48, j, l), 
    I0(49, i, s), 
    J0(50, g1.K, t1.J);
    
    private static final e1[] K0;
    
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
    d0(18, i, n), 
    e0(19, i, m), 
    f0(20, i, l), 
    g0(21, i, l), 
    h0(22, i, k), 
    i0(23, i, l), 
    j0(24, i, k), 
    k0(25, i, o), 
    l0(26, i, p), 
    m0(27, i, s), 
    n0(28, i, q), 
    o0(29, i, k), 
    p0(30, i, r), 
    q0(31, i, k), 
    r0(32, i, l), 
    s0(33, i, k), 
    t0(34, i, l), 
    u0(35, j, n), 
    v0(36, j, m), 
    w0(37, j, l), 
    x0(38, j, l), 
    y0(39, j, k), 
    z0(40, j, l);
    
    private final t1 G;
    private final int H;
    private final g1 I;
    private final Class<?> J;
    private final boolean K;
    
    static {
        final g1 h = g1.H;
        final t1 n = t1.N;
        final t1 m = t1.M;
        final t1 l = t1.L;
        final t1 k = t1.K;
        final t1 o = t1.O;
        final t1 p = t1.P;
        final t1 s = t1.S;
        final t1 q = t1.Q;
        final t1 r = t1.R;
        final g1 i = g1.I;
        final g1 j = g1.J;
        int n2 = 0;
        L0 = new Type[0];
        final e1[] values = values();
        K0 = new e1[values.length];
        while (n2 < values.length) {
            final e1 e52 = values[n2];
            e1.K0[e52.H] = e52;
            ++n2;
        }
    }
    
    private e1(final int h, final g1 i, final t1 g) {
        this.H = h;
        this.I = i;
        this.G = g;
        ordinal = f1.a[i.ordinal()];
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
            if (i == g1.H) {
                ordinal = f1.b[g.ordinal()];
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    break Label_0101;
                }
            }
            k = false;
        }
        this.K = k;
    }
    
    public final int b() {
        return this.H;
    }
}
