// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

public enum v0
{
    H(true), 
    I(false);
    
    private final boolean G;
    
    private v0(final boolean g) {
        this.G = g;
    }
    
    public boolean b() {
        return this.G;
    }
}
