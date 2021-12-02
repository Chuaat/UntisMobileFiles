// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

public enum e
{
    H(true), 
    I(false);
    
    private final boolean G;
    
    private e(final boolean g) {
        this.G = g;
    }
    
    public boolean b() {
        return this.G;
    }
}
