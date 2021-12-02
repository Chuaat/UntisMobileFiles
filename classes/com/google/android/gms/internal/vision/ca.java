// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

public enum ca
{
    I(fa.K, 1), 
    J(fa.J, 5), 
    K(i, 0), 
    L(i, 0), 
    M(h, 0), 
    N(i, 1), 
    O(h, 5), 
    P(fa.L, 0), 
    Q("STRING", 8, fa.M, 2) {
        ba(final String s, final int n, final fa fa, final int n2) {
        }
    }, 
    R("GROUP", 9, p, 3) {
        ea(final String s, final int n, final fa fa, final int n2) {
        }
    }, 
    S("MESSAGE", 10, p, 2) {
        da(final String s, final int n, final fa fa, final int n2) {
        }
    }, 
    T("BYTES", 11, fa.N, 2) {
        ga(final String s, final int n, final fa fa, final int n2) {
        }
    }, 
    U(h, 0), 
    V(fa.O, 0), 
    W(h, 5), 
    X(i, 1), 
    Y(h, 0), 
    Z(i, 0);
    
    private final fa G;
    private final int H;
    
    static {
        final fa i = fa.I;
        final fa h = fa.H;
        final fa p = fa.P;
    }
    
    private ca(final fa g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    public final fa b() {
        return this.G;
    }
    
    public final int d() {
        return this.H;
    }
}
