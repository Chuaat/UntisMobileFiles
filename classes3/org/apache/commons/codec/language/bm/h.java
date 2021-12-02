// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language.bm;

public enum h
{
    H("approx"), 
    I("exact"), 
    J("rules");
    
    private final String G;
    
    private h(final String g) {
        this.G = g;
    }
    
    public String b() {
        return this.G;
    }
}
