// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

class c
{
    final int a;
    final int b;
    final boolean c;
    
    private c(final int a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    static c a(final int n, final int n2) {
        return new c(n, n2, true);
    }
    
    static c b(final int n, final int n2) {
        return new c(n, n2, false);
    }
}
