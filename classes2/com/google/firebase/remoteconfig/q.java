// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig;

import androidx.annotation.k0;
import androidx.annotation.j0;

public class q extends n
{
    private final int G;
    
    public q(final int g, @j0 final String s) {
        super(s);
        this.G = g;
    }
    
    public q(final int g, @j0 final String s, @k0 final Throwable t) {
        super(s, t);
        this.G = g;
    }
    
    public int a() {
        return this.G;
    }
}
