// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

public enum k4 implements s6
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
    W(16);
    
    private static final v6<k4> X;
    private final int G;
    
    static {
        X = new j4();
    }
    
    private k4(final int g) {
        this.G = g;
    }
    
    public static k4 b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 16: {
                return k4.W;
            }
            case 14: {
                return k4.V;
            }
            case 13: {
                return k4.U;
            }
            case 12: {
                return k4.T;
            }
            case 11: {
                return k4.S;
            }
            case 10: {
                return k4.R;
            }
            case 9: {
                return k4.Q;
            }
            case 8: {
                return k4.P;
            }
            case 7: {
                return k4.O;
            }
            case 6: {
                return k4.N;
            }
            case 5: {
                return k4.M;
            }
            case 4: {
                return k4.L;
            }
            case 3: {
                return k4.K;
            }
            case 2: {
                return k4.J;
            }
            case 1: {
                return k4.I;
            }
            case 0: {
                return k4.H;
            }
        }
    }
    
    public static u6 d() {
        return n4.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("<");
        sb.append(k4.class.getName());
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
