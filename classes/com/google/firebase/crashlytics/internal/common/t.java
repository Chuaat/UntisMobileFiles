// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

public enum t
{
    H(1), 
    I(2), 
    J(3), 
    K(4);
    
    private final int G;
    
    private t(final int g) {
        this.G = g;
    }
    
    public static t b(final String s) {
        t t;
        if (s != null) {
            t = com.google.firebase.crashlytics.internal.common.t.K;
        }
        else {
            t = com.google.firebase.crashlytics.internal.common.t.H;
        }
        return t;
    }
    
    public int d() {
        return this.G;
    }
    
    @Override
    public String toString() {
        return Integer.toString(this.G);
    }
}
