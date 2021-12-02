// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

public enum m4 implements s6
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
    U(13);
    
    private static final v6<m4> V;
    private final int G;
    
    static {
        V = new p4();
    }
    
    private m4(final int g) {
        this.G = g;
    }
    
    public static m4 b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 13: {
                return m4.U;
            }
            case 12: {
                return m4.T;
            }
            case 11: {
                return m4.S;
            }
            case 10: {
                return m4.R;
            }
            case 9: {
                return m4.Q;
            }
            case 8: {
                return m4.P;
            }
            case 7: {
                return m4.O;
            }
            case 6: {
                return m4.N;
            }
            case 5: {
                return m4.M;
            }
            case 4: {
                return m4.L;
            }
            case 3: {
                return m4.K;
            }
            case 2: {
                return m4.J;
            }
            case 1: {
                return m4.I;
            }
            case 0: {
                return m4.H;
            }
        }
    }
    
    public static u6 d() {
        return o4.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("<");
        sb.append(m4.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.G);
        sb.append(" name=");
        sb.append(this.name());
        sb.append('>');
        return sb.toString();
    }
    
    @Override
    public final int zza() {
        return this.G;
    }
}
