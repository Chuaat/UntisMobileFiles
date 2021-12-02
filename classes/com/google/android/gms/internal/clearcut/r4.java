// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

public enum r4
{
    I(w4.K, 1), 
    J(w4.J, 5), 
    K(i, 0), 
    L(i, 0), 
    M(h, 0), 
    N(i, 1), 
    O(h, 5), 
    P(w4.L, 0), 
    Q("STRING", 8, w4.M, 2) {
        s4(final String s, final int n, final w4 w4, final int n2) {
        }
    }, 
    R("GROUP", 9, p, 3) {
        t4(final String s, final int n, final w4 w4, final int n2) {
        }
    }, 
    S("MESSAGE", 10, p, 2) {
        u4(final String s, final int n, final w4 w4, final int n2) {
        }
    }, 
    T("BYTES", 11, w4.N, 2) {
        v4(final String s, final int n, final w4 w4, final int n2) {
        }
    }, 
    U(h, 0), 
    V(w4.O, 0), 
    W(h, 5), 
    X(i, 1), 
    Y(h, 0), 
    Z(i, 0);
    
    private final w4 G;
    private final int H;
    
    static {
        final w4 i = w4.I;
        final w4 h = w4.H;
        final w4 p = w4.P;
    }
    
    private r4(final w4 g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    public final w4 b() {
        return this.G;
    }
    
    public final int d() {
        return this.H;
    }
}
