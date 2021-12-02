// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations;

import androidx.annotation.j0;
import com.google.firebase.l;

public class k extends l
{
    @j0
    private final a G;
    
    public k(@j0 final a g) {
        this.G = g;
    }
    
    public k(@j0 final String s, @j0 final a g) {
        super(s);
        this.G = g;
    }
    
    public k(@j0 final String s, @j0 final a g, @j0 final Throwable t) {
        super(s, t);
        this.G = g;
    }
    
    @j0
    public a a() {
        return this.G;
    }
    
    public enum a
    {
        G, 
        H, 
        I;
    }
}
