// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import androidx.annotation.k0;
import android.util.SparseArray;

public enum p
{
    H(0), 
    I(1), 
    J(2), 
    K(3), 
    L(4), 
    M(-1);
    
    private static final SparseArray<p> N;
    private final int G;
    
    static {
        final SparseArray n = new SparseArray();
        final p p;
        (N = n).put(0, (Object)p);
        final p p2;
        n.put(1, (Object)p2);
        final p p3;
        n.put(2, (Object)p3);
        final p p4;
        n.put(3, (Object)p4);
        final p p5;
        n.put(4, (Object)p5);
        final p p6;
        n.put(-1, (Object)p6);
    }
    
    private p(final int g) {
        this.G = g;
    }
    
    @k0
    public static p b(final int n) {
        if (n == 0) {
            return p.H;
        }
        if (n == 1) {
            return p.I;
        }
        if (n == 2) {
            return p.J;
        }
        if (n == 3) {
            return p.K;
        }
        if (n != 4) {
            return null;
        }
        return p.L;
    }
    
    public final int q() {
        return this.G;
    }
}
